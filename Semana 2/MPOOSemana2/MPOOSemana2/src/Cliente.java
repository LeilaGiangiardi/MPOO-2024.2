public class Cliente {
//	String cpf;  // chave primária
	String nome; //atributo-simples
	Telefone telefone; //atributo-objeto
	String email;
	int id; // RAM
	static int cont_id=0;
	
//	public Cliente() {} //default
	
	//[Questionamento]: Definição de contrutor, como diferenciá-lo dos demais métodos!
	// Resposta: Assinatura do método - sem retorno e de mesmo nome da Classe

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
		this.email = email;
//		this.id = id;//lógica para ser autoincrement
		this.id=++cont_id;
	}
	
/*Discussão: Uso do this 
 *		1) diferenciar variável local de global (atributo)
 *		2) para referenciar o objeto
*/

//Ex.: Não precisaria do this - nome de variável local diferente de atributo (variável global)
//	public Cliente(String n, String t, String e) {
//		nome = n;
//		telefone = t;
//		email = e;
//		id=++cont_id;
//	}
}