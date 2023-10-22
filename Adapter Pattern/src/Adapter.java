public class Adapter implements NewPrinter {
    public OldPrinter oldPrinter;

    public Adapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

  @Override
  public void print(String text) {
        oldPrinter.print(text);
  }
}
