package org.example;

/**
 * @author laurentleseigneur
 */
public class Main {
    public static void main(String[] args) throws Exception {
        if (requiredParameterIsMissing(args)) {
            displayUsageAndExit();
        }
        if (weHaveUnexpectedParameters(args)) {
            throw new IllegalArgumentException("too many parameters provided!");
        }
        doExpectedJob(args[0]);
    }

    private static void doExpectedJob(String param) {
        System.out.println(String.format("Hello %s!", param));
    }

    private static boolean weHaveUnexpectedParameters(String[] args) {
        return args.length > 1;
    }

    private static boolean requiredParameterIsMissing(String[] args) {
        return args == null || args.length == 0;
    }

    private static void displayUsageAndExit() {
        System.out.println("Usage: java -jar example.jar \"parameter\"");
        System.exit(1);
    }
}