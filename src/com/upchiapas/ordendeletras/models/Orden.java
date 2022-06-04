package com.upchiapas.ordendeletras.models;

import java.util.Scanner;
import java.util.Stack;
import javax.swing.JOptionPane;
public class Orden {

        Scanner teclado = new Scanner(System.in);
        String auxiliarpila1="";
        String auxiliarpila2="";

        public void CapDa(){
                //JOptionPane.showMessageDialog(null, "-------------ORDENAMIENTO DE DATOS----------");
                System.out.println("Ingrese la expresion: ");
                String ordenamiento = teclado.next();

                Stack <Character> pila1 = new Stack<Character>();
                Stack <Character> pila2 = new Stack<Character>();

                for ( int i=0; i<ordenamiento.length();i++){
                        if(ordenamiento.charAt(i) == '+' || ordenamiento.charAt(i) == '-' || ordenamiento.charAt(i) == '/' || ordenamiento.charAt(i) == '*' ){
                                pila1.push(ordenamiento.charAt(i));

                        }else {
                                pila2.push(ordenamiento.charAt(i));
                        }

                }
                while (!pila1.isEmpty()){
                        auxiliarpila1 = auxiliarpila1 + pila1.pop();
                }

                while (!pila2.isEmpty()){
                        auxiliarpila2 = auxiliarpila2 + pila2.pop();
                }
                System.out.println(" ");
                System.out.println("El Orden de la pila es: "+auxiliarpila1+auxiliarpila2);
        }

}
