import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
//Aula: 11/11/2024
/*	Discussão:
 *		- sempre que uma info pertence a classe: static
 *		- manipulação de memória MAS o desenvolver não tem acesso: objeto anônimo
 *		- alocação de memória: construtor
 *		- agregação: relação de ter!
 */
		
//		Telefone telefone = new Telefone(55, 87, "99999-9999");
//		new Telefone(55, 87, "99999-9999"); //objeto anônimo
//		Cliente cliente1 = new Cliente("Maria", telefone, "maria@gmail.com");
//		Cliente cliente2 = new Cliente("João", new Telefone(55, 87, "99999-9999"), "joão@gmail.com");
//		System.out.println(cliente1.id);
//		System.out.println(cliente2.id);
//		cliente1.id=3;
//		System.out.println(cliente1.id);
//		System.out.println(cliente2.id);

//		System.out.println(cliente1.cont_id);
//		System.out.println(cliente2.cont_id);
//		cliente1.cont_id=3;
//		Cliente.cont_id=3;
//		System.out.println(cliente1.cont_id);
//		System.out.println(cliente2.cont_id);

		
		//Como acessar o cliente da base;
//		BaseDados baseDados = new BaseDados();
//		baseDados.cliente1.nome;
		
//	System.out.println(BaseDados.cliente1);	
//	[Questionamento]: Como rodar uma aplicação Java no console e exibir os dados de um cliente?
		
//Simular o ato de ver os dados do usuário
//	String dadosCliente1 = "Nome: " + BaseDados.cliente1.nome + "\n" +
//							"Telefone: " + "+" + BaseDados.cliente1.telefone.ddi + " (" +
//			                            +   BaseDados.cliente1.telefone.ddd + ") " +
//			                            BaseDados.cliente1.telefone.numero; 
	
//	String dadosCliente1 = "Nome: " + BaseDados.cliente1.nome + "\n" +
		//	"Telefone: " + BaseDados.cliente1.telefone;
										      //telefone.toString()
	
	//Mensagem.exibirMensagem(dadosCLiente1);
	}
}