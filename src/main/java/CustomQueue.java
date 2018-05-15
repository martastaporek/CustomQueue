import java.util.Arrays;

public class CustomQueue implements Queue {

    private int [] array = new int[2];
    private int freeIndex = -1;

    public CustomQueue() {
    }

    public int getFreeIndex() {
        return freeIndex;
    }

    public int getSize(){
        return this.array.length;
    }

    public void enqueue(int elem){
        if(isFull()) {
            grow();
        }
        this.array[++freeIndex] = elem;
    }

    public void dequeue(){
        int [] temp = this.array;
        int [] newArray = new int [this.array.length];
        for(int i = 0; i < temp.length - 1; i++){
            newArray [i] = temp [i+1];
        }
        this.array = newArray;
        freeIndex--;
    }

    void grow(){
        int [] temp = this.array;
        int newLength = this.array.length*2;
        int [] newArray = new int [newLength];
        for(int i = 0; i < temp.length; i++){
            newArray [i] = temp [i];
        }
        this.array = newArray;

    }

    public boolean isFull(){
        return (freeIndex == this.array.length - 1);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
