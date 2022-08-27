import printer.BinaryPrinter;

class Main {
    public static void main(String[] args) {
        BinaryPrinter printer = createPrinter(12);

        System.out.println("Size:" + printer.getSize());

        int value = 16;
        doPrint(printer, value);
        System.out.println("Size:" + printer.getSize());
    }

    private static BinaryPrinter createPrinter(int size){
        return new BinaryPrinter(size);
    }

    private static void doPrint(BinaryPrinter printer, int value){
        printer.print(value);
        try {
            printer.setSize(10);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}