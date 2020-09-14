package BuilderDesignPattern;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer comp1 = new Computer.ComputerBuilder("AppleIMac","512GB","Solaris").build();


        Computer comp2 = new Computer.ComputerBuilder("AppleMacBook","1TB","Kat")
                .setExtendableMemory(true)
                .setGraphicsEnabled(true)
                .build();

        comp1.toString();
        comp2.toString();
    }
}
