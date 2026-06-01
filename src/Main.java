public class Main {
    // Le classi è bene denominarle con le lettere maiuscole
    // La classe deve essere chiamata esattamente come il nome del file
    public static void main(String[] args){
        // con il metodo main bisogna avere una classe principale, quindi andremo a creare la classe main
        System.out.println("Hello World");  // Shortcut -< sout

        final double DICHIARAZIONE_CONSTANTE = 10.4; // con la parola final si definisce una costante in Java, e si usa lo snake case tutto in maiuscolo
        float numeroDecimale2 = 10.3f; // Sebbene i float occupino metà dello spazio rispetto
        // ai double, è meglio usare SEMPRE I DOUBLE in quanto i processori moderni li usano
        // più efficientemente per i calcoli
        //-----------------------------STRINGHE----------------------
        //Non vengono considerate dati primitivi, perché sono praticamente delle Classi.
        String text = "Hello world!"; //<-- le stringhe hanno sempre gli apici doppi
        System.out.println(text);

    }

}