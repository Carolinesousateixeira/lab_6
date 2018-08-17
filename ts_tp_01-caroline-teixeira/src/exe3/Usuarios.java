package exe3;


import java.util.ArrayList;
import java.util.Scanner;



public class Usuarios {
	private static char[] p;

	public static void main(String[] args) {

		/*Scanner entrada = new Scanner(System.in);
		System.out.printf("Digite o nome: ");
		int nome = entrada.nextInt();
		System.out.printf("Digite o telefone: ");
		int telefone = entrada.nextInt();
		*/
		ArrayList<String> user = new ArrayList();
		
		//inserindo o contato 
		user.add("caroline ; 988680364");
		user.add("aline ; 988552525");

		//listando todos os contatos
		System.out.printf("\nTodos os usuarios");
	    int i = 0;
	    for (String usuario: user) {
	      System.out.printf("\nPosição %d- %s\n", i, usuario);
	      i++;
	    }
	    
	    //buscando por nome
	    System.out.println("Digite o nome do usuario a ser pesquisado: ");
        Scanner nome = new Scanner(System.in);
        String ler = nome.next();
        
     /*   for(int x = 0; x < user.lenght(); x ++){
            if(user[x]==ler){
                System.out.println(user);      
            }else{
                System.out.println("usuario não encontrado!");
                 
            }
        }*/
    }
	    
		
		
	}
	
	

