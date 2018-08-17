package exe3;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UsuarioDAOImpl { 
	List <Usuario> usuarios = new ArrayList<>();

	Usuario u1 = new Usuario("jow","988585854"); 
	usuarios.add(u1);
	usuarios.add(new Usuario("caroline", "988680364"));
	usuarios.add(new Usuario("aline", "988036565"));
	
        
    
    
	public Usuario inserir(String nome, String telefone) {
	
	
	Usuario user=new Usuario(nome,telefone);
	this.usuarios.add(user);
	return user;
	}
	
	public Usuario buscarporNome(String nome) {
		for (Usuario usuario :usuarios) {
			if(usuario.nome.equals(nome)) {
				return usuario;
			}
		}
		return null;
	}
	public List<Usuario> listarTodos(){
		return this.usuarios;
	}
}