package view;

import controller.ListaController;
import felix.utils.listaencadeada.integer.ListaEncadeadaSimples;
import felix.utils.listaencadeada.integer.No;

public class Principal {

	public static void main(String[] args) {
		ListaController controller = new ListaController();
		
		ListaEncadeadaSimples lista1 = new ListaEncadeadaSimples();
		ListaEncadeadaSimples lista2 = new ListaEncadeadaSimples();
		
		for (int i = 0; i < 5; i++) {
			int num1 = (int) ((Math.random() * 200) + 1);
			lista1.adicionaElemento(new No(num1));
			
			int num2 = (int) ((Math.random() * 200) + 1);
			lista2.adicionaElemento(new No(num2));
		}

		/* System.out.println(lista1.toString()); */
		System.out.println(lista2.toString());
		
		//controller.concat(lista1, lista2);
		
		controller.ascSort(lista2);
	}

}
