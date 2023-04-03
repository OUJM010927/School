/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author gueva
 */
public class Main {
    public static void main(String[] args) {
      Student estudiante = new Student("javier","roman",18,22670018,"22670018@gamil.edu.mx","iguala.gro #9");
      Teacher maestro = new Teacher("pedro","hernandez",30,"hernades@23","iguala.gro");

      estudiante.Soy();
      estudiante.toString();

        System.out.println(" ");

      maestro.soy();
      maestro.toString();

       // System.out.println("mostrar toString();"+maestro.toString());
    }
}