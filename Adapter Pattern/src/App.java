public class App {
    public static void main(String[] args) throws Exception {
        OldPrinter oldPrinter = new OldPrinter();
        oldPrinter.print("Hello World from oldPrinter!");


        NewPrinter newPrinter = new Adapter(oldPrinter);
        newPrinter.print("hello");
    }
}
