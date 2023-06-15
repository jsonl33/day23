package java_super;

class ParentPoint14 {
    protected int a = 10;
    protected int b = 10;

    ParentPoint14() {
    }

    ParentPoint14(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class ChildPoint14 extends ParentPoint14 {
    protected int c = 30;

    ChildPoint14() {
    }

    public ChildPoint14(int a, int b, int c) {
        super(100, 200);
        this.c = 300;
    }
}

public class ExtendEx14 {
    public static void main(String[] args) {

    }
}
