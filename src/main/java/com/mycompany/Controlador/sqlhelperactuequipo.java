/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controlador;

import com.mycompany.Modelo.Equipo;
import com.mycompany.Modelo.Usuarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import javax.swing.JOptionPane;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 * @author Pedro Garcia Vicente
 */
public class sqlhelperactuequipo {

  private String nombreArchivo = "src/main/resources/nombreusuario.txt";
  private String contenidoLeido = leerDesdeArchivo(nombreArchivo);
  private int idusuario;
//metodo para recoger lo del archivo txt

  /**
   * Este metodo es para leer desde un archivo txt el nombre del usuario iniciado
   * @param nombreArchivo archivo txt con el nombre de usuario logeado
   * @return  devuelve lo escrito en le txt
   */
  private static String leerDesdeArchivo(String nombreArchivo) {
    StringBuilder contenido = new StringBuilder();

    try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
      String linea;
      while ((linea = reader.readLine()) != null) {
        contenido.append(linea);
      }
      System.out.println("Información leída desde el archivo: " + nombreArchivo);
    } catch (IOException e) {
      e.printStackTrace();
    }

    return contenido.toString();
  }
  
  /**
   * metodo para obtener id de usuario
   * @return devuelve el id del usuario
   */
  public int obtenerIdUsuarioPorNombre() {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();
    try {
      // Consulta HQL para obtener el idUsuario por nombre de usuario
      String hql = "SELECT u.id FROM Usuarios u WHERE usuario = :nombreusuario";
      Query<Integer> query = session.createQuery(hql, Integer.class);
      query.setParameter("nombreusuario", contenidoLeido);

      // Obtener el resultado de la consulta
      Integer idUsuario = query.uniqueResult();
      idusuario = idUsuario;
      // System.out.println(idusuario);
      return idusuario; // Devolver -1 si no se encuentra el usuario
    } catch (Exception e) {
      e.printStackTrace();
      return -1;
    } finally {
      session.close();
    }
  }

  /**
   * Este metodo es para buscar el usuario por el id 
   * @param id se pasa el id del usuario
   * @return devuelve el usuario
   */
  public static Usuarios findById(int id) {
    //System.out.println(id + "metodo find");
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();
    try {

      // Consulta HQL para obtener el usuario por su id
      String hql = "FROM Usuarios u WHERE u.id = :id";
      return session.createQuery(hql, Usuarios.class)
        .setParameter("id", id)
        .uniqueResult();
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    } finally {
      session.close();

    }
  }

  /**
   * Este metdo es para actualizar el equipo
   * @param nuevoNombre nombre del quipo
   * @param nuevoEstadio nombre del nuevo nombre del estadio
   */
  public void actualizarEquipo(String nuevoNombre, String nuevoEstadio) {
    Transaction transaction = null;
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();

    try {
      // Comenzar la transacción
      transaction = session.beginTransaction();

      // Obtener el usuario por nombre
      Usuarios usuario = findById(obtenerIdUsuarioPorNombre());

      if (usuario != null) {

        // 
        Equipo equipo = Usuarios.findByEquipo(usuario);
        System.out.println(equipo);

        // Actualizar el nombre y el estadio
        equipo.setNombreEquipo(nuevoNombre);
        equipo.setEstadio(nuevoEstadio);

        // Guardar los cambios en la base de datos
        session.update(equipo);
        transaction.commit();
        JOptionPane.showMessageDialog(null, "Equipo actualizado.");
      } else {
        JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
      }
    } catch (Exception e) {
      // Manejar cualquier excepción
      if (transaction != null) {
        transaction.rollback();
        JOptionPane.showMessageDialog(null, "Error al actualizar equipo,ese nombre ya esta en uso en otro equipo o no tiene equipo creado.");
      }
      e.printStackTrace();
    } finally {
      // Cerrar la transacción y la sesión de Hibernate
      if (session != null) {
        if (transaction != null && transaction.isActive()) {
          transaction.rollback();
        }
        session.close();
      }
    }
  }

}
