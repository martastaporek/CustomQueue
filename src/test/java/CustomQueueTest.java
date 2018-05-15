import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomQueueTest {

    private CustomQueue customQueue;

    @BeforeEach
    void setup() {
        this.customQueue = new CustomQueue();
    }

    @Test
    void createEmptyQueue(){
        assertEquals(-1, this.customQueue.getFreeIndex());
    }

    @Test
    void addOneElement(){
        this.customQueue.enqueue(2);
        assertEquals(0, this.customQueue.getFreeIndex() );
    }

    @Test
    void addThreeElements(){
        this.customQueue.enqueue(1);
        this.customQueue.enqueue(4);
        this.customQueue.enqueue(3);
    }

    @Test
    void testGrowMethod(){
        for(int i = 1; i <=7; i++){
            this.customQueue.enqueue(i);
        }
        assertEquals(8, this.customQueue.getSize());
    }

    @Test
    void testDequeue(){
        this.customQueue.enqueue(7);
        this.customQueue.dequeue();
        assertEquals(-1, this.customQueue.getFreeIndex());
    }


}