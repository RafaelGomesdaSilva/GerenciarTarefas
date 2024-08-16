
package br.ulbra.gerenciador;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Tarefas {
    public ArrayList lista;
    
    public Tarefas(){
        lista = new ArrayList();
        
    }   
    public void adicionar(String elemento){
            if (elemento.equals("") || elemento.equals(null)){
                JOptionPane.showMessageDialog(null, "coloca algo ai!");
            
            }else{
                lista.add(elemento);
                JOptionPane.showMessageDialog(null, "salvo com sucesso");
        }
    }
    public void editar(int i, String novoElemento){
        if (lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "não tem nada");
        }else if(i >=lista.size() || i<0){
            JOptionPane.showMessageDialog(null, "tarefa não existe");
        }else{
            lista.set(i, novoElemento);
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
        }
    }
    public void remover(int i){
        if(lista.isEmpty()){
        JOptionPane.showConfirmDialog(null, "Lista vazia");
    }else if(i>=lista.size() || i <0){
        JOptionPane.showConfirmDialog(null, "tarefa não existe");
    }else{
        lista.remove(i);
            JOptionPane.showConfirmDialog(null, "excluido com sucesso");
    }
}
    public String visualizar(){
        return null;
    }
}
