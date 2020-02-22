/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author USUARIO
 */
public class ListStudents<Estudiante> implements Ilist<Estudiante> {
    
    private DoubleNode<Estudiante> head;
    private DoubleNode<Estudiante> tail;

    public ListStudents() {
        head = tail = null;
    }

    //CASO PRACTICO ESTUDIANTES
    
    /*Los estudiantes que aprueban la materia, se agregan a la
    cabeza de la lista, desplazando los anteriores estudiantes
    a la derecha.*/
    public void addStudent(Estudiante e) {
        if (isEmpty()) {
            head = tail = new DoubleNode<>(e);
        } else {
            head = new DoubleNode<>(e, null, head);
            head.getNextNode().setPreviousNode(head);
        }
        
    }
    
    public boolean siGanoMateria(Estudiante e) {
        if(e.nFinal > 3) {
            
        }
        return false;
    }
    
    
    
    
    
    
    @Override
    public String showData() {
        String data = "";
        DoubleNode<Estudiante> current = this.head;
        while (current != null) {
            data = data + current.getData() + " ";
            current = current.getNextNode();
        }
        return data;
    }

    //Añade estudiante en la cabeza de la lista
    @Override
    public void add(Estudiante d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Añade estudiante en la cola de la lista
    @Override
    public void addLast(Estudiante d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addOrdered(Estudiante d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteLast() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
