import java.util.ArrayList;

public class BaseDados {
	
//	static Cliente cliente1 = new Cliente("Maria", new Telefone(55, 87, "99999-9999"), "maria@gmail.com");
//	static Cliente cliente2 = new Cliente("João", new Telefone(55, 87, "99999-9999"), "joão@gmail.com");
//	static Cliente cliente3 = new Cliente("José", new Telefone(55, 87, "99999-9999"), "jose@gmail.com");
	
	//Evolução do sistema: Passaremos a usar a cardinlaidade por ArrayList
	static ArrayList<Cliente> clientes;
	
	static void createBase() {
		 clientes = new ArrayList<Cliente>();
		 //Futuramente em BD: vários codigos de conexão com o banco de dados
		 inicializarBase();
	}
	
	/*[Questionamento]: Como esconder um atributo ou método de outra classe?
	 * Resp.: Usar encapsulamento - public, protected, private, default
	 */
	
	static void inicializarBase() {
		clientes.add(new Cliente("Maria", new Telefone(55, 87, "99999-9999"), "maria@gmail.com"));
		clientes.add(new Cliente("João", new Telefone(55, 87, "99999-9999"), "joao@gmail.com"));
		clientes.add(new Cliente("José", new Telefone(55, 87, "99999-9999"), "jose@gmail.com"));
	}
	
	/*	[Questionamento]: Como fazer para garantir a consistência da base?
	 *  CRUD: Create (Criar), Read/Retrieve (Ler/Recuperar), Update (Atualizar) e Delete (Deletar)
	 *  Vamos implementar:
	 *  	adicionarCliente, buscarCliente, atualizarCliente, removerCliente,
	 */	

	static boolean adicionarCliente(Cliente cliente) {
		//Regra de Negócio (RN): lógica de existência de um cliente
		
		//varrer a lista!
		
		//obs.: "Maria"!="maria" -> Java é "Caso Sensitivo"!
		//String: uso de método para comparar String!
		//[Questionamento]: Como faço para instalar o javadoc?

	// Programando como 1º período - NÃO FAZER.
//		for(int i=0; i<clientes.size();i++) {
//			if(clientes.get(i).email.equalsIgnoreCase(cliente.email))
//				return false;
//		}
//		return clientes.add(cliente);
		
	// Programando como 3º período - FAZER foreach! 
//		for (Cliente clienteCurrent : clientes) {
//			if (clienteCurrent.email.equalsIgnoreCase(cliente.email))
//				return false;
//		}
//		return clientes.add(cliente);
		
	// MAS: Usando buscar para "evitar duplicidade de código"!
		if (buscarCliente(cliente)==null)
			return clientes.add(cliente);
		else
			return false;
	}
	
/*	[Questionamento]: Em POO, qual conceito permite que exista mais de um método com o mesmo nome?
 *	Resposta: 
 *			Polimorfismo de Método - permite ao programador implementar sobrecarga
 *	Obs.:
 *			Sobrecarga - técnica de programação
 *  		Sobrecarga há em outras linguagens, mas não se pode programá-la. Ex.: Ling. C
 *				printf("casa"); (1 parâmetro)
 *				printf("%d", a);(2 parâmetros)
*/
	
//	[Questionamento]: Como o compilador faz para diferenciar os métodos sobrecarregados?
	
	static boolean removerCliente(Cliente cliente) {
//		for (Cliente clienteCurrent : clientes) 
//			if (clienteCurrent.email.equalsIgnoreCase(cliente.email))
//				return clientes.remove(clienteCurrent);
//		return false;

		// MAS: Usando buscar para "evitar duplicidade de código"!
		return clientes.remove(buscarCliente(cliente));
	}
	
	static boolean removerCliente(String email) {
//		clientes.remove(new Cliente(null, null, email));
//		for (Cliente clienteCurrent : clientes) 
//			if (clienteCurrent.email.equalsIgnoreCase(email))
//				return clientes.remove(clienteCurrent);
//		return false;	

		// MAS: Usando buscar para "evitar duplicidade de código"!
		if (email==null)
			return false;
		return clientes.remove(buscarCliente(email));
	}
	
	//Buscar foi criado para evitar duplicidade de código?
	static Cliente buscarCliente(Cliente cliente) {
		if (cliente==null)
			return null;
		
		for (Cliente clienteCurrent : clientes) 
			if (clienteCurrent.email.equalsIgnoreCase(cliente.email))
				return clienteCurrent;
		
		return null;
	}

	static Cliente buscarCliente(String email) {
		for (Cliente clienteCurrent : clientes) 
			if (clienteCurrent.email.equalsIgnoreCase(email))
				return clienteCurrent;
		
		return null;
	}
	
//	[DESAFIO]: Implemente o atualizarCliente
	
//	static boolean atualizarCliente(Cliente clienteOld, Cliente clienteNew) {
////		busca
////		editar
//		//		remover
////		adicionar
//		//FAZER
//		clientes.metodo de editar de arraylist! :)
//	}
}