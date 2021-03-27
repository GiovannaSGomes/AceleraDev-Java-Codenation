package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public abstract class DesafioApplication {

	public static List<Integer> fibonacci() {
		return Finabocci.finabocciLista();
	}

	public static Boolean isFibonacci(Integer a) {
		return Finabocci.finabocciLista(a).contains(a);
		}
	}

