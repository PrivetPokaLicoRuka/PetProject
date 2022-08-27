class Main {
    public static void main(String[] args) {
        BinaryPrinter printer = new BinaryPrinter(8);

        System.out.println("Original size:" + printer.getSize());

        printer.print(16);
    }
}