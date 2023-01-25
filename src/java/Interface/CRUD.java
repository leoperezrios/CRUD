/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import Modelo.Persona;
import java.util.List;

/**
 *
 * @author LEONEL
 */
public interface CRUD {
    public List listar();
    public Persona list();
    public boolean add(int id);
    public boolean adit(Persona per);
    public boolean eliminar(int id);
}
