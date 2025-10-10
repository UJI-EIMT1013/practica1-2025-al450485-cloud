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
        Set<Integer> verd_cuadrados = new HashSet<>();
        Set<Integer> verd_no_cuadrados = new HashSet<>();

        verd_no_cuadrados.addAll(cuadrados);
        verd_no_cuadrados.addAll(noCuadrados);

        for(int elemento : cuadrados){
            if(cuadrados.contains(elemento*elemento)&&elemento!=1){
                verd_cuadrados.add(elemento*elemento);
            }
            if(cuadrados.contains(elemento*elemento)&&elemento !=1){
                verd_cuadrados.add(elemento*elemento);
            }
            for(int elemento2 : noCuadrados){
                if (elemento*elemento == elemento2){
                    verd_cuadrados.add(elemento2);
                }
                if(elemento2*elemento2 == elemento){
                    verd_cuadrados.add(elemento);
                }
            }
        }
        for(int elemento : noCuadrados){
            if(noCuadrados.contains(elemento*elemento)&&elemento!=1){
                verd_cuadrados.add(elemento*elemento);
            }
        }


        verd_no_cuadrados.removeAll(verd_cuadrados);
        noCuadrados.clear();
        noCuadrados.addAll(verd_no_cuadrados);
        cuadrados.clear();
        cuadrados.addAll(verd_cuadrados);
    }

    //EJERCICIO 3
    public static<T> Collection<Set<T>> divideInSets (Iterator<T> it) {
        //TODO
        Collection<Set<T>> resultado = new ArrayList<>();
        List<T> elementos = new ArrayList<>();
        Set<T> conjunto = new HashSet<>();
        boolean continuar = true;


        while(continuar){
            if(it.hasNext()){
                T elemento = it.next();
                if(!conjunto.contains(elemento)){
                    conjunto.add(elemento);
                    it.remove();
                }
                else{
                    elementos.add(elemento);
                }
            }
            if(!conjunto.isEmpty()){
                resultado.add(conjunto);
            }

            resultado.add(conjunto);
            conjunto = new HashSet<>();

            for(T e: elementos){
                if(conjunto.contains(e)){

                }
            }
            /*if(conjunto.contains(elemento)){
                resultado.add(conjunto);
                conjunto = new HashSet<>();
            }*/

        }


        return resultado;
    }

    //EJERCICIO 4
    public static<T> Collection<Set<T>> coverageSet2 (Set<T> u,ArrayList<Set<T>> col) {
        //TODO
        return null;
    }



}
