package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] m = new int[5][5];
        llenarMatriz(m);
        mostrar(m);
        System.out.println("\nEl promedio de la matriz es igual a "+promedioMatriz(m)+"\n");
        numMayor(m);
        System.out.println("\nLos numeros primos en la matriz son: ");
        numPrimos(m);
        System.out.println("\nLos numeros pares en la matriz son: ");
        numPares(m);
        System.out.println("\nLa suma de la matrices es igual a "+sumaDiagonales(m));
    }

    public static void llenarMatriz(int[][] m){
        for (int i = 0; i < 5; i ++){
            for (int j = 0; j < 5; j ++){
                m[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    public static void mostrar(int[][] m){
        System.out.println("Elementos de la matriz: ");
        for(int i = 0; i < 5; i ++){
            System.out.print("[");
            for (int j = 0; j < 5; j ++){
                System.out.print(" "+m[i][j]+" ");
            }
            System.out.print("]\n");
        }
    }
    public static float promedioMatriz(int[][] m){
        int s = 0;
        for (int i = 0; i < 5; i ++){
            for (int j = 0; j < 5; j ++){
                s = s + m[i][j];
            }
        }
        float p = (float) s;
        return p / 25;
    }
    public static void numMayor(int[][] m){
        int n = 0,c = 0;
        for (int i = 0; i < 5; i ++){
            for (int j = 0; j < 5; j ++){
                if(m[i][j] > n){
                    n = m[i][j];
                    c = 0;
                }
                if(n == m[i][j]){
                    c ++;
                }
            }
        }
        System.out.println("El numero mayor es "+n+" y se repite "+c+" veces.");
    }
    public static void numPrimos(int[][] m){
        int c = 0;
        System.out.println("Los numeros primos son:");
        for (int i = 0; i < 5; i ++){
            for (int j = 0; j < 5; j ++){
                for(int k = 1; k <= m[i][j]; k ++){
                    if(m[i][j] % k == 0){
                        c ++;
                    }
                }
                if(c == 2){
                    System.out.println("["+i+"]["+j+"]= "+m[i][j]);
                }
                c = 0;
            }
        }
    }
    public static void numPares(int[][] m){
        System.out.println("Los numeros pares son:");
        for (int i = 0; i < 5; i ++){
            for (int j = 0; j < 5; j ++){
                if(m[i][j] % 2 == 0 && m[i][j] != 0){
                    System.out.println("["+i+"]["+j+"]= "+m[i][j]);
                }
            }
        }
    }
    public static int sumaDiagonales(int[][] m){
        int s = 0;
        for (int i = 0; i < 5; i ++){
            for (int j = 0; j < 5; j ++){
                if(i == j){
                    s = s + m[i][j];
                }
            }
        }
        int s2 = 0;
        for (int i = 0, j = 4; i < 5 && j >= 0; i++, j--){
            s2 = s2 + m[i][j];
        }
        return s + s2;
    }
}
