public class App {
    public static void main(String[] args) throws Exception {
        if(args.length > 0)
            System.out.println("Hello, World! This was the first arg passed: " + args[0]);
        else
            System.out.println("Hello, World! No args passed.");
        
    }
}
