public class SimpleStack {
    private int size;
    private String[] string;

    public SimpleStack() {
        string = new String[0];
        size = 0;
    }

    public boolean empty() {
        if (size == 0) {
            return (size == 0);
        }
        else {
            return false;
        }
    }

    public String peek() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("Index " + size + " out of bounds for length " + size);
        }
        else {
            return string[size-1];
        }
    }

    public String pop() {
        String popped = string[size-1];
        if (size == -1) {
            throw new IndexOutOfBoundsException();
        }

        else {
            string[size - 1] = null;
            size--;
            return popped;
        }
    }

    public void push(String pushItem) {
        if (string.length == size) {
            String[] temp = new String[size+1];

            for(int i = 0; i < size; i++) {
                temp[i] = string[i];
            }

            string = temp;
        }
        size ++;
        string[size-1] = pushItem;
    }

    public int search(String searchItem) {
        for (int i = 0; i < size; i++) {
            if (string[i] == searchItem) {
                return size-i;
            }
        }
        return -1;
    }

    public String toString() {
        String startString = "[";
        for (int i = 0; i < size - 1; i++) {
            startString = startString + string[i] + ", ";
        }
        if (size != 0) {
            startString = startString + string[size-1] + "]";
        }
        else {
            startString = startString + "]";
        }

        return startString;

    }
}