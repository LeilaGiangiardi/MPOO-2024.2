
public class BaseDados {
	
	static Cliente cliente1 = new Cliente("Maria", new Telefone(55, 87, "99999-9999"), "maria@gmail.com");
	static Cliente cliente2 = new Cliente("João", new Telefone(55, 87, "99999-9999"), "joão@gmail.com");
	static Cliente cliente3 = new Cliente("José", new Telefone(55, 87, "99999-9999"), "jose@gmail.com");

	//Próxima Aula: Evoluir - passaremos a usar ArrayList
	
//	[Questionamento]: Como fazer para garantir a consistência da base?
//	Resposta: Criar os métodos CRUD:
/*Métodos CRUD:
 *		adicionarCliente, buscarCliente, atualizarCliente, removerCliente,  
 */
}