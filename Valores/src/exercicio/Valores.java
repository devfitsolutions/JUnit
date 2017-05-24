package exercicio;

import java.util.ArrayList;
import java.util.Collections;

public class Valores implements ValoresITF {

	private ArrayList<Integer> lista = new ArrayList<>();

	// Métodos do exercício

	public boolean ins(int v) { //insere um valor
	
		return v > 0 && size() < 10 ? lista.add(v) : false;
	/*	
		if(v > 0 && size() < 10) {
            return lista.add(v);
        }
        return false; */
	}

	public int del(int i) { // remove/retorna valor indice i
		return (i >= 0 && i < size()) ? lista.remove(i) : -1;
	}

	public int size() { // retorna qtdade valores armazenados
		return lista.size();
	}

	public double mean() { // retorna média valores armazenados
		Integer soma = 0;
		for (Integer v : lista) {
			soma += v;
		}
		return size() > 0 ? soma.doubleValue() / size() : 0;
	}

	public int greater() { // retorna maior valor armazenado
		return Collections.max(lista);
	}

	public int lower() { // retorna o menor valor armazenado
		return Collections.min(lista);
	}

}
