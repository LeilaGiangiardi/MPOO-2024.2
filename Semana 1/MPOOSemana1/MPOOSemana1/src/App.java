import javax.swing.JOptionPane;

//App será o nome dado a "aplicação" do sistema. Contém o programa principal!

public class App {
	public static void main(String[] args) {
//		System.out.println("Hello Word");
//		JOptionPane.showMessageDialog(null, "Hello Word");
	
//		String nome = "joao";
////		String nome; //variável local: se não inicializado e utilizado é erro de sintaxe!
//		System.out.println(nome);
//		String nome2 = "maria";
//		int id1 =1;
//		int id2= 2;
		
		//Boa prática de programação: C - classe, c - objeto
//		Cliente cliente; //objeto sem área de memória
		Cliente cliente = new Cliente(); // //objeto com área de memória
		cliente.id=1;
		cliente.nome="João Silva";
		cliente.telefone="(87)99999-9999";
		cliente.email="joao@gmail.com";
		System.out.println(cliente.id);
		System.out.println(cliente.nome);
		
		Cliente cliente2 = new Cliente("Maria Santos", "(87)99999-9999", "maria@gmail.com", 4);
		System.out.println(cliente2.id);
	}
}
