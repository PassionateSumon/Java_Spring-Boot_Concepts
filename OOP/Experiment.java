// abstract class InnerExperiment {
//     InnerExperiment() {
//         System.out.println("InnerExperiment constructor");
//     }
//     abstract void run();
// }

// class OuterExperiment extends InnerExperiment {
//     OuterExperiment() {
//         System.out.println("OuterExperiment constructor");
//     }
//     void run() {
//         System.out.println("Running experiment");
//     }
// }

abstract class Base {
    Base() {
        init(); // DANGER: calls subclass override before subclass fields are ready
    }
    abstract void init();
}

class Derived extends Base {
    private String s = "ready";
    @Override void init() {
        System.out.println(s.toUpperCase()); // can be NPE if s not yet set!
    }
}


public class Experiment {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.init(); //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toUpperCase()" because "this.s" is null
    }
}
