/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s208e19
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
//
//        DoubleNode<Integer> n1 = new DoubleNode<>(55);
//        DoubleNode<Integer> n2 = new DoubleNode<>(66,n1,null);
//        DoubleNode<Integer> n3 = new DoubleNode<>(77,n2,null);
//        n1.setNextNode(n2);
//        n2.setNextNode(n3);
//        CircularDoublyLinkedList<Integer> myCDLL = new CircularDoublyLinkedList<>();
//        myCDLL.addLast(99);
//        myCDLL.addLast(88);
//        myCDLL.addLast(77);
//        myCDLL.addLast(66);
//        myCDLL.addLast(55);
//
//        System.out.println("Contenido de la lista simple: " + myCDLL.showData());
//        try {
//            myCDLL.delete();
//            myCDLL.delete();
//            myCDLL.delete();
//            myCDLL.delete();
//            myCDLL.delete();
//      
//     
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }    
        //       System.out.println("Contenido de la lista simple despues del borrado: " + myCDLL.showData());
//        CircularSinglyLinkedList<Integer> myCSLL = new CircularSinglyLinkedList<>();
//        myCSLL.add(99);
//        myCSLL.add(88);
//        myCSLL.add(77);
//        myCSLL.add(66);
//        myCSLL.add(55);
//        
//        System.out.println("Contenido de la lista simple antes de borrar: " + myCSLL.showData());
//        try {
//            myCSLL.delete();
//            myCSLL.delete();
//            myCSLL.delete();
//            myCSLL.delete();
//            myCSLL.delete();
//            myCSLL.delete();
//        } catch (Exception e) {
//            System.out.println("Error de borrado: " + e.getMessage());
//        }
//        
//        
//        System.out.println("Contenido de la lista simple despues de borrar: " + myCSLL.showData());
        DoublyLinkedList<Integer> myDoublelist = new DoublyLinkedList<>();
        myDoublelist.addOrdered(66);
        myDoublelist.addOrdered(11);
        myDoublelist.addOrdered(99);
        myDoublelist.addOrdered(33);
        myDoublelist.addOrdered(44);
        myDoublelist.addOrdered(22);
        myDoublelist.addOrdered(101);

        System.out.println("Los datos de la lista son: " + myDoublelist.showData());
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese el dato a buscar: ");
        int d1 = teclado.nextInt();
        if (myDoublelist.searchData(d1)) {
            System.out.println("El dato fue encontrado ");
        } else {
            System.out.println("El dato no existe ");
        }
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese el numero de datos a agregar de mayor a menor en la lista: ");
        int n = teclado.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el dato " + (i+1));
            int d = teclado.nextInt();
            myDoublelist.addOrderedMaxToMin(d);
        }

        System.out.println("-------------------------------------------");
        System.out.println("Los datos de la lista son: " + myDoublelist.showData());
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese el dato a eliminar");
        int d3 = teclado.nextInt();
        myDoublelist.deleteSpecific(d3);
        System.out.println("-------------------------------------------");
        System.out.println("Los datos de la lista son: " + myDoublelist.showData());
        System.out.println("----------------------------------------");
        System.out.println("Ingrese el dato especifico");
        int dEspecifico = teclado.nextInt();
        System.out.println("Ingrese el dato que tendrá el nodo");
        int dNuevo = teclado.nextInt();
        myDoublelist.addAfter(dEspecifico, dNuevo);
        System.out.println("----------------------------------------");
        System.out.println("Los datos de la lista son: " + myDoublelist.showData());
        System.out.println("----------------------------------------");
        System.out.println("CASO PRACTICO");
        System.out.println("----------------------------------------");
        
        DoublyLinkedList<Estudiante> lstStudents = new DoublyLinkedList<Estudiante>();
//        DoublyLinkedList<Estudiante> estructuraDatos = new DoublyLinkedList<>();
//        estructuraDatos.insertarEstudiante("43888555","Esperanza","Laureles",4.9);
//        estructuraDatos.insertarEstudiante("71666888","Gabriel","Belen",3.2);      

//        SinglyLinkedList<Integer> miLista = new SinglyLinkedList<>();
//        miLista.addOrdered(11);
//        miLista.addOrdered(33);
//        miLista.addOrdered(4);
//        miLista.addOrdered(88);
//        miLista.addOrdered(99);
//        miLista.addOrdered(22);
//        miLista.deletaData(88);
//
//        SinglyLinkedList<Integer> miLista2 = new SinglyLinkedList<>();
//        miLista2.addOrdered(11);
//        miLista2.addOrdered(33);
//        miLista2.addOrdered(4);
//        miLista2.addOrdered(88);
//        miLista2.addOrdered(99);
//        miLista2.addOrdered(22);
//        miLista2.deletaData(88);
//
//        System.out.println("Son iguales?:" + miLista.checkEqualList(miLista2));
//
//        SinglyLinkedList<Double> miListica = new SinglyLinkedList<>();
//        miListica.addOrdered(1.1);
//        miListica.addOrdered(3.3);
//        miListica.addOrdered(4.0);
//        miListica.addOrdered(8.8);
//        miListica.addOrdered(9.9);
//        miListica.addOrdered(2.2);
//        miListica.addLast(6.6);
//        miListica.addLast(7.7);
//
//        try {
//            miListica.averageList();
//
//        } catch (ArithmeticException exA) {
//            System.out.println("Error: " + exA.getMessage());
//        } catch (Exception ex) {
//            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        try {
//            miListica.deleteLast();
//            miListica.deleteLast();
//            miListica.deleteLast();
//        } catch (Exception ex) {
//            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        System.out.println(miListica.showData());
    }

}
