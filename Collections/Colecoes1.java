package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecoes1
{
	public static void main(String[] args)
	{
		//Criação do list
		List<Integer> minhaLista = new ArrayList<Integer>();
		
		//Inserção dos elementos do array List minhaLista
		minhaLista.add(2);
		minhaLista.add(5);
		minhaLista.add(2);
		minhaLista.add(3);
		minhaLista.add(1);
		minhaLista.add(8);
		minhaLista.add(5);
		minhaLista.add(1);
		
		 /* Percorrer todos os elementos da minha lista,
		 * os dois pontos indicam que a variavel "listaElementos" 
		 * vai percorer todos os itens armazenados em "minhaLista" */
		for(Integer listaElemento : minhaLista)
		{
			System.out.println(listaElemento);
		}
		
		System.out.println("Removendo um elemento da lista");
		
		//Limpando memoria cash
		System.out.println();
		
		//Removendo elementos atraves do indice
		minhaLista.remove(0);
		
		//Conferindo se o remove removeu
		for(Integer listaElemento : minhaLista)
		{
			System.out.println(listaElemento);
		}
		
		//o get pega o elemento da lista atraves do indice
		int primeiroElemento = minhaLista.get(0);
		System.out.println("primeiro elemento da lisa (indice 0): " + primeiroElemento);
		
		//O size serve para pegar o tamanho da lista
		for(int i=0 ; i<minhaLista.size() ; i++)
		{
			System.out.println("Elemento: " + minhaLista.get(i));
		}
		
		//O metodo sort() ordena a lista por ordem crescente
		Collections.sort(minhaLista);
		
		System.out.println("Depois de ordenada a lista, temos: ");
		System.out.println(minhaLista);
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(6);
		meuSet.add(1);
		meuSet.add(4);
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(2);
		
		/*
		 * terator é uma API que organiza os dados em ordem e elimina os elementos que são identicos
		 * é case sensitive
		 */
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext())
		{
			System.out.println(iMeuSet.next());
		}
	}
}
