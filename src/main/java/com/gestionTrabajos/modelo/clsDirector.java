package com.gestionTrabajos.modelo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

import com.gestionTrabajos.registro.clsUsuario;

@Entity
@DiscriminatorValue("DIRECTOR")
@Table(name = "directores_proyecto")
public class clsDirector extends clsUsuario {
	  public clsDirector() {
	        super();
	    }
	    public clsDirector(String nombres, String apellidos, String email, String password, int codigo) {
	        super(nombres, apellidos, email, password,codigo);
	    }

	    public clsDirector(String nombres, String apellidos, String email, String password, int codigo,String dtype) {
	        super(nombres, apellidos, email, password,codigo,dtype);
	    }

}
