import java.lang.ref.WeakReference;

public class Demo {
    public static void main(String[] args) {
        WeakReference<String> weakRef = new WeakReference<>(new String("Hello, Weak Reference!"));
        System.out.println("Before GC: " + weakRef.get());
        System.gc();
        System.out.println("After GC: " + weakRef.get());
    }
}
