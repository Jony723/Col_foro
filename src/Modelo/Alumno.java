/* la clase alumno se crea para manejar mejor los datos 
a traves de metodos geters y setters de cada uno de los atributos q tenemos

*/
package Modelo;

/**
 *
 * @author Jony
 */

public class Alumno {
    /*se declara matricula de tipo String por que a pesar de ser un número, se uttilizara como una cadena no como numero
    es decir no se realizara ninguna operación matematica con esa variable
    */
private String matricula=null;
private String nombre=null;
private String apellidoP= null;
private String apellidoM=null;
private int promedio=0;

    public Alumno() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

}
