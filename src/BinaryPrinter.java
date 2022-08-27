public class BinaryPrinter {
    private int size;

    BinaryPrinter(int size){
        this.size = size;
    }

    void print(int value){
        for(int i = size - 1; i >= 0; i--){
            long mask = 1L << i;
            long result = (mask & value) >> i;
            System.out.print(result);
        }
        System.out.println();
    }

    int getSize() {
        return size;
    }

    void setSize(int size){
        this.size = size;
    }
}
