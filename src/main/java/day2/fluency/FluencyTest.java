package day2.fluency;

public class FluencyTest {

    public static void main(String[] args) {
        Settings settings = new Settings();
        settings.setColor("yella")
        .setSize(12)
        .setName("hella")
        .setFontFamily("Arial")
        .setStyle("italic");

        System.out.println(settings.toString());
    }
}
