public class Characters {

    public static void main(String[] args) {
        var caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracteres = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("caracteres = decimal: " + (decimal == caracter));
        
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("caracteres = simbolo: " + (simbolo == caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("tipo char corresponde en byte a " + System.lineSeparator() + Character.BYTES);
        System.out.println("tipo char corresponde en bites a " + Character.SIZE);
        System.out.println("valor máximo de un char " + Character.MAX_VALUE);
        System.out.println("valor mínimo de un char " + Character.MIN_VALUE);
    }
}
