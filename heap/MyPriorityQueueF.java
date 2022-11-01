

public class MyPriorityQueueF {
    FibonacciMinPQ<Integer> heap = new FibonacciMinPQ<>();
    public void enqueue(int d) {
        heap.insert(d);
    }

    public int dequeue() {
        return heap.delMin();
    }

    public int front() {
        return heap.minKey();
    }


    public boolean isEmpty() {
        return heap.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Integer i: heap){
            sb.append(i).append("\t");
        }
        return new String(sb);
    }
}
