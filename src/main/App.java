package main;

import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        LogicaClasificacion lC = new LogicaClasificacion();
        Queue<String> cN= new LinkedList<>();
            cN.add("Ana");
            cN.add("Luis");
            cN.add("Pedro");
        System.out.println("Entrada" + cN);
        Queue<String> in = lC.invertirColaNombres(cN);
        System.out.println("Salida esperada" + in);

        Queue<Integer> cI = new LinkedList<>();
            cI.add(null)
    }
}

