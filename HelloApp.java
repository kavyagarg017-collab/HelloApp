public class HelloApp {
    public static void main(String[] args) {
        
        if (args.length > 0) {
            // Join all arguments with space
            String result = String.join(" ", args);
            System.out.println("Hello " + result);
        } else {
            // Default message if no arguments
            System.out.println("Hello User");
        }
    }
}
