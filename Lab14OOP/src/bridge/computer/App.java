package bridge.computer;

public class App {
    public static void main(String[] args) {
        OperatingSystem macOS = new MacOS();
        OperatingSystem windowOS = new WindowsOS();

        Computer laptop1 = new Laptop(macOS);
        laptop1.startup();
        laptop1.browseInternet("refactoring.guru");
        System.out.println();

        Computer laptop2 = new Laptop(windowOS);
        laptop2.startup();
        laptop2.browseInternet("refactoring.guru");
        System.out.println();

        Computer pc1 = new PC(windowOS);
        pc1.startup();
        pc1.browseInternet("refactoring.guru");
        System.out.println();

        Computer pc2 = new PC(macOS);
        pc2.startup();
        pc2.browseInternet("refactoring.guru");
    }
}
