package Controlador;

import Modelo.Alumno;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jony
 */
public class c_Formulario {

    Alumno alm;
    ArrayList listAlumnos = new ArrayList();// ArrayList que se puede usar  en toda la clase

    public c_Formulario() {///constructor de la clase que recibe como parametro al formulario
        listAlumnos = new ArrayList();
    }

    /////metodos/////
    public void nuevo() {

        if (!listAlumnos.isEmpty()) {
            ///sí la lista es diferente a vacio borramos los elementos
            listAlumnos.clear();
        }
    }

    public void guardar(Alumno alm) {
        ///se guardan los datos del alumno en un ArrayList
        listAlumnos.add(alm);
        JOptionPane.showMessageDialog(null, "Se guardaron los datos");

    }

    public ArrayList<Alumno> mostrar() {
        /// retornamos el valor de lo que esta en la lista
        return listAlumnos = this.listAlumnos;
    }

    public void salir() {
///preguntamos si desea salir de la aplicacion
        int x = JOptionPane.showConfirmDialog(null, "Desea Salir del sistema", "SALIR", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (x == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    /////metodo q se va rehusar 
    public void limpiar(JPanel panel,int x) {

        /* podriamos borrar cada elemento manualmete 1 a 1 pero 
        usamos un bucle for para mayor comodidad, ya q tenemos varios componentes iguales
         */
        ///el parametro x nos indica q vamos a limpiar si jTextbox o jLabel
        switch(x){
            case 1:
                ///creamos un bucle mientras el numero de componenetes del pDatos sea mayor a i
        for (int i = 0; panel.getComponents().length > i; i++) {
            //Sí el componente q esta en pDatos es una instancia de un JTexfiels
            if (panel.getComponents()[i] instanceof JTextField) {
                //el valor componente JtextField sera nulo o vacio
                ((JTextField) panel.getComponents()[i]).setText(null);
            }
        }
        break;
            case 2:
                ///creamos un bucle mientras el numero de componenetes del pDatos sea mayor a i
        for (int i = 0; panel.getComponents().length > i; i++) {
            //Sí el componente q esta en pDatos es una instancia de un JTexfiels
            if (panel.getComponents()[i] instanceof JLabel) {
                //el valor componente JtextField sera nulo o vacio
                ((JLabel) panel.getComponents()[i]).setText(null);
            }
        }
        break;
        }

    }
}
