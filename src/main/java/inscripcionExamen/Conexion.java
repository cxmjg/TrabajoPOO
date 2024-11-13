package inscripcionExamen;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Locale;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Conexion {
	private Session session;
	private SessionFactory sessionFactory;
	private Transaction transaction;

	@SuppressWarnings("deprecation")
	public Conexion() {
		try {
			Configuration cfg = new Configuration().configure();
			this.sessionFactory = cfg.buildSessionFactory();
			this.session = sessionFactory.openSession();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Date stringADate(String string) {
	    try {
	      DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.FRANCE);
	      Date date = formatter.parse(string);
	      return date;
	    } catch (ParseException e) {
	      System.out.println("Exception :" + e);
	      return null;
	    }
	  }

	public Session getSession() {
		return this.session;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public Rol getRolById(int id) {
		try (Session session = sessionFactory.openSession()) {
			return session.createQuery("FROM Rol WHERE id = :id", Rol.class).setParameter("id", id).uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Usuario getUsuarioByEmail(String email) {
		try (Session session = sessionFactory.openSession()) {
			return session.createQuery("FROM Usuario WHERE email = :email", Usuario.class).setParameter("email", email)
					.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Usuario getUsuarioById(int id) {
		try (Session session = sessionFactory.openSession()) {
			return session.createQuery("FROM Usuario WHERE id = :id", Usuario.class).setParameter("id", id)
					.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<Usuario> getUsuarios() {
		try {
			this.transaction = session.beginTransaction();
			Query<Usuario> query = session.createQuery("FROM Usuario WHERE", Usuario.class);
			this.transaction.rollback();
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Rol> getRoles() {
		try {
			this.transaction = session.beginTransaction();
			Query<Rol> query = session.createQuery("FROM Rol WHERE", Rol.class);
			this.transaction.rollback();
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<InscripcionMateria> getInscripcionesMaterias(int idUsuario) {
		try (Session session = sessionFactory.openSession()) {
			return session.createQuery("FROM InscripcionMateria WHERE alumno_id = :idUsuario", InscripcionMateria.class)
					.setParameter("idUsuario", idUsuario).list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<InscripcionExamen> getInscripcionesExamenes(int idUsuario) {
		try (Session session = sessionFactory.openSession()) {
			return session.createQuery("FROM InscripcionExamen WHERE alumno_id = :idUsuario", InscripcionExamen.class)
					.setParameter("idUsuario", idUsuario).list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void setNombreUsuario(int idUsuario, String nuevoNombre) {
	    try (Session session = sessionFactory.openSession()) {
	        this.transaction = session.beginTransaction();
	        session.createQuery("UPDATE Usuario SET nombre = :nuevoNombre WHERE id = :idUsuario")
	               .setParameter("nuevoNombre", nuevoNombre)
	               .setParameter("idUsuario", idUsuario)
	               .executeUpdate();
	        transaction.commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        if (transaction != null) {
	            transaction.rollback();
	        }
	    }
	}

	public void setApellidoUsuario(int idUsuario, String nuevoApellido) {
	    try (Session session = sessionFactory.openSession()) {
	        this.transaction = session.beginTransaction();
	        session.createQuery("UPDATE Usuario SET apellido = :nuevoApellido WHERE id = :idUsuario")
	               .setParameter("nuevoApellido", nuevoApellido)
	               .setParameter("idUsuario", idUsuario)
	               .executeUpdate();
	        transaction.commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        if (transaction != null) {
	            transaction.rollback();
	        }
	    }
	}

	public void setPasswordUsuario(int idUsuario, String nuevaPassword) {
	    try (Session session = sessionFactory.openSession()) {
	        this.transaction = session.beginTransaction();
	        session.createQuery("UPDATE Usuario SET contrasena = :nuevaPassword WHERE id = :idUsuario")
	               .setParameter("nuevaPassword", nuevaPassword)
	               .setParameter("idUsuario", idUsuario)
	               .executeUpdate();
	        transaction.commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        if (transaction != null) {
	            transaction.rollback();
	        }
	    }
	}

	public void setEmailUsuario(int idUsuario, String nuevoEmail) {
	    try (Session session = sessionFactory.openSession()) {
	        this.transaction = session.beginTransaction();
	        session.createQuery("UPDATE Usuario SET email = :nuevoEmail WHERE id = :idUsuario")
	               .setParameter("nuevoEmail", nuevoEmail)
	               .setParameter("idUsuario", idUsuario)
	               .executeUpdate();
	        transaction.commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        if (transaction != null) {
	            transaction.rollback();
	        }
	    }
	}

	public void setHabilitadoUsuario(int idUsuario, Boolean habilitado) {
	    try (Session session = sessionFactory.openSession()) {
	        this.transaction = session.beginTransaction();
	        session.createQuery("UPDATE Usuario SET habilitado = :habilitado WHERE id = :idUsuario")
	               .setParameter("habilitado", habilitado)
	               .setParameter("idUsuario", idUsuario)
	               .executeUpdate();
	        transaction.commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        if (transaction != null) {
	            transaction.rollback();
	        }
	    }
	}

	public void setRolUsuario(int idUsuario, Rol nuevoRol) {
	    try (Session session = sessionFactory.openSession()) {
	        this.transaction = session.beginTransaction();
	        session.createQuery("UPDATE Usuario SET rol = :nuevoRol WHERE id = :idUsuario")
	               .setParameter("nuevoRol", nuevoRol)
	               .setParameter("idUsuario", idUsuario)
	               .executeUpdate();
	        transaction.commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        if (transaction != null) {
	            transaction.rollback();
	        }
	    }
	}


	public int validarUsuario(String email, String contrasena) {
		int rolId = -1; // Usuario no existe o contraseña incorrecta
		try {
			this.transaction = session.beginTransaction();
			Query<Usuario> query = session.createQuery("FROM Usuario WHERE email = :email", Usuario.class);
			query.setParameter("email", email);
			Usuario usuarioEncontrado = query.uniqueResult();
			if (usuarioEncontrado != null) {
				if (usuarioEncontrado.getContrasena().equals(contrasena)) {
					if (!usuarioEncontrado.isHabilitado()) {
						rolId = 0; // Usuario deshabilitado
					} else {
						rolId = usuarioEncontrado.getRol().getId();
					}
				} else {
					rolId = -2; // Usuario existe pero password incorrecta
				}
			}
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return rolId;
	}

	public void crearUsuario(String nombre, String apellido, String email, String password, int rol_id,
			Boolean habilitado) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Rol rol = null;
		if (rol_id > 0) {
			rol = getRolById(rol_id);
		}
		Usuario nuevoUsuario = new Usuario(0, password, nombre, apellido, email, rol, habilitado, timestamp);
		try {
			transaction = session.beginTransaction();
			session.save(nuevoUsuario);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}
	
	public List<Usuario> getDocentes(){
		try {
			this.transaction = session.beginTransaction();
			Query<Usuario> query = session.createQuery("FROM Usuario WHERE rol.id = 2 and habilitado", Usuario.class);
			this.transaction.rollback();
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Mesa getMesaById(int id) {
		try (Session session = sessionFactory.openSession()) {
			return session.createQuery("FROM Mesa WHERE id = :id", Mesa.class).setParameter("id", id)
					.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public void crearMesa(String fechaInicio, String fechaFin, String fechaInicioInscripcion, String fechaFinInscripcion) {
	    Timestamp fechaCreacion = new Timestamp(System.currentTimeMillis());
	    Mesa nuevaMesa = new Mesa(0, stringADate(fechaInicio), stringADate(fechaFin), stringADate(fechaInicioInscripcion), stringADate(fechaFinInscripcion), fechaCreacion, true);
	    try {
	        transaction = session.beginTransaction();
	        session.save(nuevaMesa);
	        transaction.commit();
	    } catch (Exception e) {
	        if (transaction != null) {
	            transaction.rollback();
	        }
	        e.printStackTrace();
	    }
	}
	
	public void setFechaInicioMesa(int idMesa, String nuevaFecha) {
	    try (Session session = sessionFactory.openSession()) {
	    	Date fechaInicioMesa = new SimpleDateFormat("dd-MM-yyyy").parse(nuevaFecha);
	        this.transaction = session.beginTransaction();
	        session.createQuery("UPDATE Mesa SET fechaInicio = :nuevaFecha WHERE id = :idMesa")
	               .setParameter("nuevaFecha", fechaInicioMesa)
	               .setParameter("idMesa", idMesa)
	               .executeUpdate();
	        transaction.commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        if (transaction != null) {
	            transaction.rollback();
	        }
	    }
	}
	
	public void setFechaFinMesa(int idMesa, String nuevaFecha) {
	    try (Session session = sessionFactory.openSession()) {
	    	Date fechaFinMesa = new SimpleDateFormat("dd-MM-yyyy").parse(nuevaFecha);
	        this.transaction = session.beginTransaction();
	        session.createQuery("UPDATE Mesa SET fechaFin = :nuevaFecha WHERE id = :idMesa")
	               .setParameter("nuevaFecha", fechaFinMesa)
	               .setParameter("idMesa", idMesa)
	               .executeUpdate();
	        transaction.commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        if (transaction != null) {
	            transaction.rollback();
	        }
	    }
	}
	
	public void setFechaInicioInscripcionMesa(int idMesa, String nuevaFecha) {
	    try (Session session = sessionFactory.openSession()) {
	    	Date fechaInicioInscripcionMesa = new SimpleDateFormat("dd-MM-yyyy").parse(nuevaFecha);
	        this.transaction = session.beginTransaction();
	        session.createQuery("UPDATE Mesa SET fechaInicioInscripcion = :nuevaFecha WHERE id = :idMesa")
	               .setParameter("nuevaFecha", fechaInicioInscripcionMesa)
	               .setParameter("idMesa", idMesa)
	               .executeUpdate();
	        transaction.commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        if (transaction != null) {
	            transaction.rollback();
	        }
	    }
	}
	
	public void setFechaFinInscripcionMesa(int idMesa, String nuevaFecha) {
	    try (Session session = sessionFactory.openSession()) {
	    	Date fechaFinInscripcionMesa = new SimpleDateFormat("dd-MM-yyyy").parse(nuevaFecha);
	        this.transaction = session.beginTransaction();
	        session.createQuery("UPDATE Mesa SET fechaFinInscripcion = :nuevaFecha WHERE id = :idMesa")
	               .setParameter("nuevaFecha", fechaFinInscripcionMesa)
	               .setParameter("idMesa", idMesa)
	               .executeUpdate();
	        transaction.commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        if (transaction != null) {
	            transaction.rollback();
	        }
	    }
	}
	
	
	public void eliminarMesa(int idMesa) {
	    try (Session session = sessionFactory.openSession()) {
	        this.transaction = session.beginTransaction();
	        session.createQuery("DELETE FROM Mesa WHERE id = :idMesa")
	               .setParameter("idMesa", idMesa)
	               .executeUpdate();
	        transaction.commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        if (transaction != null) {
	            transaction.rollback();
	        }
	    }
	}
	
	
	public List<Mesa> getMesas() {
		try {
			this.transaction = session.beginTransaction();
			Query<Mesa> query = session.createQuery("FROM Mesa WHERE", Mesa.class);
			this.transaction.rollback();
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Mesa> getMesasHabilitadas() {
		try {
			this.transaction = session.beginTransaction();
			Query<Mesa> query = session.createQuery("FROM Mesa WHERE habilitado", Mesa.class);
			this.transaction.rollback();
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	public Examen getExamenById(int id) {
	    try (Session session = sessionFactory.openSession()) {
	        Query<Examen> query = session.createQuery(
	            "SELECT e FROM Examen e " +
	            "JOIN FETCH e.mesa " +
	            "JOIN FETCH e.docenteTitular " +
	            "JOIN FETCH e.docenteVocal " +
	            "JOIN FETCH e.materia " +
	            "WHERE e.id = :id", Examen.class);
	        query.setParameter("id", id);
	        return query.uniqueResult();
	    } catch (Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}
	
	public List<Examen> getExamenes() {
		try {
			this.transaction = session.beginTransaction();
			Query<Examen> query = session.createQuery("FROM Examen WHERE", Examen.class);
			this.transaction.rollback();
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	public void crearExamen(String fecha, boolean habilitado, Usuario docenteTitular, Usuario docenteVocal, Materia materia, Mesa mesa) {
	    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	    Examen nuevoExamen = new Examen(0, stringADate(fecha), habilitado, timestamp, docenteTitular, docenteVocal, materia, mesa);
	    try {
	        transaction = session.beginTransaction();
	        session.save(nuevoExamen);
	        transaction.commit();
	    } catch (Exception e) {
	        if (transaction != null) {
	            transaction.rollback();
	        }
	        e.printStackTrace();
	    }
	}
	
	public void setHabilitadoExamen(int idExamen, Boolean habilitado) {
	    try (Session session = sessionFactory.openSession()) {
	        this.transaction = session.beginTransaction();
	        session.createQuery("UPDATE Examen SET habilitado = :habilitado WHERE id = :idExamen")
	               .setParameter("habilitado", habilitado)
	               .setParameter("idExamen", idExamen)
	               .executeUpdate();
	        transaction.commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        if (transaction != null) {
	            transaction.rollback();
	        }
	    }
	}
	
	public void setFechaExamen(int idExamen, String nuevaFecha) {
	    try (Session session = sessionFactory.openSession()) {
	    	Date fecha = new SimpleDateFormat("dd-MM-yyyy").parse(nuevaFecha);
	        this.transaction = session.beginTransaction();
	        session.createQuery("UPDATE Examen SET fecha = :nuevaFecha WHERE id = :idExamen")
	               .setParameter("nuevaFecha", fecha)
	               .setParameter("idExamen", idExamen)
	               .executeUpdate();
	        transaction.commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        if (transaction != null) {
	            transaction.rollback();
	        }
	    }
	}
	
	public void setMesaExamen(int idExamen, Mesa nuevaMesa) {
	    try (Session session = sessionFactory.openSession()) {
	        this.transaction = session.beginTransaction();
	        session.createQuery("UPDATE Examen SET mesa = :nuevaMesa WHERE id = :idExamen")
	               .setParameter("nuevaMesa", nuevaMesa)
	               .setParameter("idExamen", idExamen)
	               .executeUpdate();
	        transaction.commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        if (transaction != null) {
	            transaction.rollback();
	        }
	    }
	}
	
	public void setMateriaExamen(int idExamen, Materia nuevaMateria) {
	    try (Session session = sessionFactory.openSession()) {
	        this.transaction = session.beginTransaction();
	        session.createQuery("UPDATE Examen SET materia = :nuevaMateria WHERE id = :idExamen")
	               .setParameter("nuevaMateria", nuevaMateria)
	               .setParameter("idExamen", idExamen)
	               .executeUpdate();
	        transaction.commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        if (transaction != null) {
	            transaction.rollback();
	        }
	    }
	}
	
	public void setPresidenteExamen(int idExamen, Usuario presidente) {
	    try (Session session = sessionFactory.openSession()) {
	        this.transaction = session.beginTransaction();
	        session.createQuery("UPDATE Examen SET docenteTitular = :presidente WHERE id = :idExamen")
	               .setParameter("presidente", presidente)
	               .setParameter("idExamen", idExamen)
	               .executeUpdate();
	        transaction.commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        if (transaction != null) {
	            transaction.rollback();
	        }
	    }
	}
	
	public void setVocalExamen(int idExamen, Usuario vocal) {
	    try (Session session = sessionFactory.openSession()) {
	        this.transaction = session.beginTransaction();
	        session.createQuery("UPDATE Examen SET docenteVocal = :vocal WHERE id = :idExamen")
	               .setParameter("vocal", vocal)
	               .setParameter("idExamen", idExamen)
	               .executeUpdate();
	        transaction.commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        if (transaction != null) {
	            transaction.rollback();
	        }
	    }
	}
	
	public Materia getMateriaById(int id) {
		try (Session session = sessionFactory.openSession()) {
			return session.createQuery("FROM Materia WHERE id = :id", Materia.class).setParameter("id", id)
					.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void setNombreMateria(int idMateria, String nuevoNombre) {
	    try (Session session = sessionFactory.openSession()) {
	        this.transaction = session.beginTransaction();
	        session.createQuery("UPDATE Materia SET nombre = :nuevoNombre WHERE id = :idMateria")
	               .setParameter("nuevoNombre", nuevoNombre)
	               .setParameter("idExamen", idMateria)
	               .executeUpdate();
	        transaction.commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        if (transaction != null) {
	            transaction.rollback();
	        }
	    }
	}
	
	public List<Materia> getMateriasHabilitadas(){
		try {
			this.transaction = session.beginTransaction();
			Query<Materia> query = session.createQuery("FROM Materia WHERE habilitado", Materia.class);
			this.transaction.rollback();
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Materia> getMaterias(){
		try {
			this.transaction = session.beginTransaction();
			Query<Materia> query = session.createQuery("FROM Materia", Materia.class);
			this.transaction.rollback();
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void setHabilitadoMateria(int idMateria, Boolean habilitado) {
	    try (Session session = sessionFactory.openSession()) {
	        this.transaction = session.beginTransaction();
	        session.createQuery("UPDATE Materia SET habilitado = :habilitado WHERE id = :idMateria")
	               .setParameter("habilitado", habilitado)
	               .setParameter("idMateria", idMateria)
	               .executeUpdate();
	        transaction.commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        if (transaction != null) {
	            transaction.rollback();
	        }
	    }
	}
	
	public void crearMateria(String nombre) {
	    Timestamp fechaCreacion = new Timestamp(System.currentTimeMillis());
	    Materia nuevaMateria = new Materia(0, nombre, fechaCreacion, true);
	    try {
	        transaction = session.beginTransaction();
	        session.save(nuevaMateria);
	        transaction.commit();
	    } catch (Exception e) {
	        if (transaction != null) {
	            transaction.rollback();
	        }
	        e.printStackTrace();
	    }
	}

}
