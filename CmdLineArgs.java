public class CmdLineArgs {
    public static void main(String[] args) {

        System.out.println(args.length);
        System.out.println(args[0]);

        if (args.length == 0) {
            System.out.println("warning! No Arguments passed");
            return;
        }

        String name = args[0];
        String location = args[1];

        System.out.println("welcome to " + name + " academy and it's located in " +
                location);
    }
}