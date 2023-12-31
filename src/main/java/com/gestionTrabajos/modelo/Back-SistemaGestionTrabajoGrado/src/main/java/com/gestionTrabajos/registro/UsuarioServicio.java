package com.gestionTrabajos.registro;

import java.util.List;
import java.util.Optional;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.multipart.MultipartFile;

import com.gestionTrabajos.Anteproyecto.clsAnteproyecto;

public interface UsuarioServicio extends UserDetailsService{

	public clsUsuario guardarEstudiante(UsuarioRegistroDTO usuario);
	public clsUsuario guardarJefeDepartamento(UsuarioRegistroDTO usuario);
	public clsUsuario guardarDirector(UsuarioRegistroDTO usuario);
	public clsUsuario guardarJurado(UsuarioRegistroDTO usuario);
	public clsUsuario guardarDepartamento(UsuarioRegistroDTO usuario);
	public clsUsuario guardarComite(UsuarioRegistroDTO usuario);
	public clsUsuario guardarConsejo(UsuarioRegistroDTO usuario);
	public List<clsUsuario> listarUsuarios();
    public Optional<clsUsuario> obtenerUsuario(Long userId);
    public clsUsuario obtenerUsuarioNombre(String username);
    public void eliminarUsuario(Long usuarioId);
	//public clsUsuario addProject(Long userId, String atrTitulo) throws NotFoundException;
    public clsUsuario addProject(Long userId, String atrTitulo);
    
    public clsAnteproyecto agregarArchivo(Long userId, String atrTitulo, MultipartFile archivoAdjunto);
    public clsAnteproyecto addCommentToAnteproyecto(Long userId, String atrTitulo, String comentario);
		
	//public void addProject(Long userId, clsAnteproyecto anteproyecto) throws NotFoundException;
}
