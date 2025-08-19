public class CmdLineArgs {
    public static void main(String[] args) {
        String name = args[0];
        String location = args[1];

        System.out.println("welcome to " + name + " academy and it's located in " + location);
        // System.out.println("args 1 : " + args[0]);
    }
}