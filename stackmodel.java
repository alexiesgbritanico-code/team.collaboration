Description: An array-based bounded stack with a maximum
capacity of 10 elements.

Programmed by: Group Walang kanin bossing, BSIT 2nd year , [48160], [Data Structure and algorithm]
Last Modified: October 22, 2026
Version: 1.0
Acknowledgements: ChatGPT by OpenAI, GPT-6.
Prompt: Create a Java array-based stack class with push,
pop, peek, isEmpty, isFull, size, and clear methods.
*/

public class StackModel {

    private final int MAX = 10;
    private int[] items = new int[MAX];
    private int top = -1;

    public boolean push(int value) {
        if (isFull()) {
            return false;
        }

        items[++top] = value;
        return true;
    }

    public Integer pop() {
        if (isEmpty()) {
            return null;
        }

        return items[top--];
    }

    public Integer peek() {
        if (isEmpty()) {
            return null;
        }

        return items[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == MAX - 1;
    }

    public int size() {
        return top + 1;
    }

    public int capacity() {
        return MAX;
    }

    public void clear() {
        top = -1;
    }

    // Returns a copy; the GUI cannot modify the internal array.
    public int[] getItems() {
        int[] copy = new int[size()];

        for (int i = 0; i < size(); i++) {
            copy[i] = items[i];
        }

        return copy;
    }
}
