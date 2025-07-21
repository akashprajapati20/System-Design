import com.sun.source.tree.SynchronizedTree;

//Lazy way
public class Samosa {
    private static  Samosa samosa;

    private Samosa(){

    }



    public synchronized static Samosa getSamosa(){
        if(samosa==null){
            samosa=new Samosa();
        }
        return samosa;
    }
}

//Lazy way issue - thread issue


//public class Samosa {
//    // volatile ensures changes are visible to all threads
//    private static volatile Samosa samosa;
//
//    private Samosa() {
//        // private constructor
//    }
//
//    public static Samosa getSamosa() {
//        // First check (non-synchronized for performance)
//        if (samosa == null) {
//            // Synchronize only the creation block
//            synchronized (Samosa.class) {
//                // Double-check within synchronized block
//                if (samosa == null) {
//                    samosa = new Samosa();
//                }
//            }
//        }
//        return samosa;
//    }
//}
