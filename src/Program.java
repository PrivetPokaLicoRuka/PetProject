class Program {
    public static void main(String[] args) {
        //System.out.println("Hello Java!");
    byte a = 8;
    printBinary(a,8);
    }
    private static void printBinary(int value, int size){
        for(int i = size - 1; i >= 0; i--){
            long mask = 1L << i;
            long result = (mask & value) >> i;
            System.out.print(result);
        }
        System.out.println();
    }
}