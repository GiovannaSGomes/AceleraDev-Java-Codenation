package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class Finabocci {

    private static int limite = 350;

    public static List<Integer> finabocciLista() {
        return finabocciLista(limite);
    }

    public static List<Integer> finabocciLista(int numeroLimite){
        List<Integer> finabocciLista = new ArrayList<>();
        finabocciLista.add(0);
        finabocciLista.add(1);
        while(finabocciLista.get(finabocciLista.size() -1) < numeroLimite) {
            Integer ultimo = lastNumber(finabocciLista);
            Integer penultimo = penultimateNumber(finabocciLista);
            finabocciLista.add(nextNumber(ultimo, penultimo));
        }
        return finabocciLista;
    }
    private static Integer penultimateNumber(List<Integer> lista){
        return lista.get(lista.size() -2);
    }

    private static Integer lastNumber(List<Integer> lista){
        return lista.get(lista.size() -1);
    }

    private  static Integer nextNumber(Integer ultimo, Integer penultimo){
        return penultimo + ultimo;
    }


}
