
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//
//        while (true) {
//            System.out.print("> ");
//
//            String input = scan.nextLine();
//            if (input.equals("quit")) {
//                break;
//            }
//
//        }

        Container container = new Container();
        System.out.println(container);

        container.add(50);
        System.out.println(container);
        System.out.println(container.contains());

        container.remove(60);
        System.out.println(container);

        container.add(200);
        System.out.println(container);

    }

}
