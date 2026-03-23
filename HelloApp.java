public class HelloArgs {
    public static void main(String[] args) {
        String result = "Hello ";

        // Loop through command-line arguments
        for (int i = 0; i < args.length; i++) {
            result += args[i];
            result += ", ";  // delimiter
        }

        // Remove trailing ", " using substring
        if (args.length > 0) {
            result = result.substring(0, result.length() - 2);
        }

        // Print result
        System.out.println(result);
    }
}
