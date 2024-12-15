public class Cliente {
	String nome;
	String telefone;
	String email;
	int id;
	
	public Cliente() {}
	
	//[Questionamento]: Se existir um id, onde estará a lógica da criação do id?
	//[Questionamento]: Como fazê-lo ser autoincrement?
	public Cliente(String nome, String telefone, String email, int id) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.id = id; 
	}
	
	public Cliente(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
//		this.id = id;//substituir por lógica para ser autoincrement
	}
}