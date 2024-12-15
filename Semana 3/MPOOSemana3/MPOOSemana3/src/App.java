import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
//	Aula 18/11/2024
//	Manipulação de ArrayList
	
//	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
//	clientes.add(((int)clientes.size()/2) +1, )
//	clientes.add(new Cliente("joao", null, "joao@gmail.com"));

/* Você sabe o que é cast?
 *	a=2;
 *	a=2.5;
 *	a = (int) 2.5 //cast
 */
	
		BaseDados.createBase();

//	BaseDados.clientes.add(new Cliente("joao", null, "joao@gmail.com"));
//	BaseDados.clientes.add(new Cliente("joao", null, "joao@gmail.com"));
//	BaseDados.clientes.add(new Cliente("joao", null, "joao@gmail.com"));

//	BaseDados.inicializarBase();

		if (BaseDados.adicionarCliente(new Cliente("joao", null, "joao@gmail.com")))
			JOptionPane.showMessageDialog(null, "Cliente adicionado com sucesso!");
		else
			JOptionPane.showMessageDialog(null, "Erro ao adicionar o cliente!");
			//para dizer o tipo do erro: USAR Exception (Tema da 2VA)
		if (BaseDados.adicionarCliente(new Cliente("joao", null, "joao@gmail.com")))
			JOptionPane.showMessageDialog(null, "Cliente adicionado com sucesso!");
		else
			JOptionPane.showMessageDialog(null, "Erro ao adicionar o cliente!");
		
		if (BaseDados.adicionarCliente(new Cliente("joao", null, "joao@gmail.com")))
			JOptionPane.showMessageDialog(null, "Cliente adicionado com sucesso!");
		else
			JOptionPane.showMessageDialog(null, "Erro ao adicionar o cliente!");
		
		System.out.println(BaseDados.clientes.size());
		
//		BaseDados.removerCliente(new Cliente("Maria", new Telefone(55, 87, "99999-9999"), "maria@gmail.com"));
		BaseDados.removerCliente("maria@gmail.com");

		System.out.println(BaseDados.clientes.size());
		
		//Porque nome apresenta erro: uso de private! Tema da próxima Aula
		BaseDados.clientes.get(0).nome="msxmndbggsdjkds";
		System.out.println(BaseDados.clientes.get(0).nome);
	}
}