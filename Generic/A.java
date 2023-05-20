import java.util.ArrayList;

class myganeric<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;
    public myganeric(int val,T1 t1,T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}

public class A {
    public static void main(String[] args){
       myganeric g = new myganeric(10,"Ami Turjo",03);
        System.out.println(g.getT1());
    }
}
