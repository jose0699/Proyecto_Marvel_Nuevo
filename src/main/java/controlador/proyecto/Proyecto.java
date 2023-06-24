/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package controlador.proyecto;

//Vistas a invocar
import Controlador_Proyecto.Controlador_Inicio.Controlador_Login;
import Vista.Login;
//Fin de Vista
/**
 *
 * @author José Luis López
 */
public class Proyecto  {
    
 public void mostrarLogin() {
        Login login = new Login();
        Controlador_Login controlador = new Controlador_Login(login);
        controlador.iniciar();
    }
    public static void main(String[] args) {       
    Proyecto proyecto = new Proyecto();
    proyecto.mostrarLogin();              
    }
}
