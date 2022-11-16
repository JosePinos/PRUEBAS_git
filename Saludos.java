import javax.swing.JOptionPane;

public class Saludos {
    public static void main(String[] args) {

        System.out.println("Bienvenido Miguel a este git para hacer pruebas :)");

        String nombre_1 = JOptionPane.showInputDialog("Ingresa tu nombre");
        //la variable es de tipo byte porque edad es un tipo de dato pequeño -150 a 150 aprox
        //no es necenario un int
        byte edad = Byte.parseByte( JOptionPane.showInputDialog("Ingresa tu edad") );

        if(edad > 18){
            System.out.println(nombre_1 + " puedes entrar al bar");
        }

    }
}
