package integratedStudy;

class Stack<E> {
    private Object[] objects;
    private int sp = 0;
    private static final int DEFAULT_STACK_SIZE = 10;

    Stack() {
        objects = new Object[DEFAULT_STACK_SIZE];
    }

    Stack(int size) {
        objects = new Object[size];
    }

    public void push(E data) {
        objects[sp] = data;
        sp++;
    }

    @SuppressWarnings("unchecked")
    public E pop() {
        Object o = objects[sp - 1];
        sp--;
        return (E) o;
    }

    public void show() {
        for (int i = sp - 1; i >= 0; i-- )
            System.out.println("[" + i + "] " + objects[i]);
    }

    public int size() {
        return objects.length;
    }

    public int getSP() {
        return sp;
    }

    public boolean canPush() {
        return size() > getSP();
    }

    public boolean canPop() {
        return getSP() > 0;
    }
}
