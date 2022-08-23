class Program {
    public static void main(String[] args) {
        //System.out.println("Hello Java!");
        byte a = 0;
    }
    private static void printBinary(byte value, int size){
        for(int i = size - 1; i >= 0; i--){
            long mask = 1 << i;
            long result = (mask & value) >> i;
            System.out.print(result);
        }
        System.out.println();
    }
}
