/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import controle.Cliente;
import java.util.ArrayList;

/**
 *
 * @author iiury
 */
public class ControlaCliente {
    public ArrayList<Cliente> clientes = new ArrayList<>();
    
    public boolean salvar(Cliente c){
        if(c!=null){
            clientes.add(c);
            return true;
        }else{
            return false;
        }
    }
    public boolean excluir(Cliente c){
        if(c!=null){
            clientes.remove(c);
            return true;
        }else{
            return false;
        }
    }
    public ArrayList<Cliente> retornarTodos(){
        return clientes;
    }
}
