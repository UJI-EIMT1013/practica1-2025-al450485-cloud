package practica1;

import java.util.*;

public class Practica1 {

    //EJERCICIO 1
    public static Set<Integer> multiplos (Iterator<Integer> it) {
        Set<Integer> vistos = new HashSet<>();
        Set<Integer> resultado = new HashSet<>();

        while(it.hasNext()){
            Integer element = it.next();
            if(element != 0) {
                if(vistos.contains(element)){
                    resultado.add(element);
                }
                else {
                    vistos.add(element);
                    for (int iteraciones : vistos) {
                        if (iteraciones % element == 0 && iteraciones != element) {
                            resultado.add(iteraciones);
                        } else if (element % iteraciones == 0 && element != iteraciones){
                            resultado.add(element);
                        }
                    }
                }
            }
        }
        return resultado;
    }

    //EJERCICIO2
    public static void separate (Set<Integer> cuadrados, Set<Integer> noCuadrados)  {
        //TODO
        Set<Integer> verd_cuadrados = new HashSet<>();
        Set<Integer> verd_no_cuadrados = new HashSet<>();

        for(int elemento : cuadrados){
            for(int elemento2 : noCuadrados){
                if (elemento*elemento == elemento2){
                    verd_cuadrados.add(elemento);
                }
                else if(elemento2*elemento2 == elemento){
                    verd_cuadrados.add(elemento2);
                }
            }
            if(!verd_cuadrados.contains(elemento)){
                verd_no_cuadrados.add(elemento);
            }
        }
        cuadrados.clear();
        cuadrados.addAll(verd_cuadrados);
        noCuadrados.clear();
        noCuadrados.addAll(verd_no_cuadrados);

    }

    //EJERCICIO 3
    public static<T> Collection<Set<T>> divideInSets (Iterator<T> it) {
        //TODO


        return null;
    }

    //EJERCICIO 4
    public static<T> Collection<Set<T>> coverageSet2 (Set<T> u,ArrayList<Set<T>> col) {
        //TODO
        return null;
    }



}
