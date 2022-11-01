

public class MyMinHeap {

    private int MAX_SIZE = 100;
    private int[] heap = new int[MAX_SIZE];
    private int size = 0;

    private void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    public void insert(int d) {
        int p = size++;
        heap[p] = d;
        int parent = (p - 1) / 2;
        while ((p > 2) && (heap[p] < heap[parent])) {
            swap(p, parent);
            p = parent;
            parent = (p - 1) / 2;
        }
    }

    public int remove() {
        int d = heap[0];
        heap[0] = heap[--size];
        int p = 0;
        while (true) {
            int left = 2 * p + 1;
            if (left >= size) break;   
            int right = 2 * p + 2;
            if (right == size) {        
                if (heap[p] > heap[left]) {
                    swap(p, left);
                }
                break;  
            } else {                   
                int q = heap[left] < heap[right] ? left : right;
                if (heap[p] > heap[q]) {
                    swap(p, q);
                } else {
                    break;
                }
                p = q;
            }
        }
        return d;
    }

    public int peek() {
        return heap[0];
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (size == 1) {
            sb.append("parent: ").append(heap[0]);
        } else {
            for (int i = 0; i < size / 2; i++) {
                sb.append("parent: ").append(heap[i]);
                sb.append("\n\tleftChild: ").append(heap[(i * 2) + 1]);
                sb.append("\n\trightChild: ").append(heap[(i * 2) + 2]);
                sb.append("\n");
            }
        }
        return new String(sb);
    }

}
