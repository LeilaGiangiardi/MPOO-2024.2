import java.util.ArrayList;

public class Cliente {
	
//	String cpf; // chave primária
	private String nome; //atributo-simples
	Telefone telefone; //atributo-objeto // E se vários telefones?
//	ArrayList<Telefone> telefones ; // ArrayList!
	String email;
	int id; // RAM
	static int cont_id=0;
	
//	public Cliente() {} //default
	
	/*[Questionamento]: Definição de contrutor, como diferenciá-lo dos demais métodos?
	* Resposta: Assinatura do método - sem retorno e de mesmo nome da Classe
	*/
	
//	public Cliente(String nome, String telefone, String email, int id) {
//		this.nome = nome;
//		this.telefone = telefone;
//		this.email = email;
//		this.id = id;
//	}
	//Questionamento: Onde está a lógica da criação do id?
	//como fazê-lo ser autoincrement? (RAM)

	public Cliente(String nome, Telefone telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
//		telefones = new ArrayList<Telefone>();
		this.email = email;
//		this.id = id;//lógica para ser autoincrement
		this.id=++cont_id;
	}

/*Discussão: Uso do this 
 * 1) serve para diferenciar variável local de global (atributo)
 * Ex.:
 * public Cliente(String n, String t, String e) {
 *		nome = n; //nome-> atributo / n-> variável local
 *		telefone = t;
 *		email = e;
 *		id=++cont_id;
 *	}
 * 
 * 2) serve para referenciar o objeto corrente (objeto que está usando o método em tempo de execução!
 */
}