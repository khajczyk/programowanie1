package day2.generic;

public class Main {

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.addElement("Content");
        lista.addElement("ELO");
        String[] newLista = (String[]) lista.getLista();

    }
}
