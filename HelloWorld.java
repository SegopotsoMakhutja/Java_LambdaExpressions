// public class HelloWorld {
//     public static void main(String[] args) {
//         new Thread(new Runnable() {
//             public void run() {
//                 System.out.println("Hello World!");
//             }
//         }).start();
//     }
// }

public class HelloWorld {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Hello World!")).start();
    }
}