package printer;

public class BinaryPrinter {
    private static final int DEFAULT_SIZE = 8;
    private int size;
    BinaryPrinter() {
        this.size = DEFAULT_SIZE;
    }

    public BinaryPrinter(int size) {
        this.size = size;
    }

    public void print(long value){
        for(int i = size - 1; i >= 0; i--){
            long mask = 1L << i;
            long result = (mask & value) >> i;
            System.out.print(result);
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size){
        if(size <= 0) {
            throw new RuntimeException("Illegal size" + size);
        }
        this.size = size;
    }
}
