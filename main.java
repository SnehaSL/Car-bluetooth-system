import java.util.Scanner;
import static java.lang.System.exit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        queueusinglinkedlist queue = new queueusinglinkedlist();
        stackusinglinkedlist stack = new stackusinglinkedlist();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter the operation to be performed from the menu:");
            System.out.println(" 1. To display available devices");
            System.out.println(" 2. To Pair any available devices");
            System.out.println(" 3. To connect any desired device");
            System.out.println(" 4. To unpair and pair any new device");
            System.out.println("5.To display paired devices");
            int number = sc.nextInt();
            if (number == 1) {
                availdevices();
            }
            if (number == 2) {
                //System.out.println(queue.size());
                //pair devices
                System.out.println("Enter device to pair:");
                if (queue.size() != 5) {
                    Scanner pairdev = new Scanner(System.in);
                    String strdevice = pairdev.nextLine();
                    queue.enqueue(strdevice);
                    System.out.println(strdevice + " Device paired successfully ");
                } else {
                    queue.dequeue();
                    Scanner pairdev = new Scanner(System.in);
                    String strdevice = pairdev.nextLine();
                    queue.enqueue(strdevice);
                    System.out.println(strdevice + " Device paired successfully ");
                }
            }
            if (number == 3) {
                // connect device
                if (stack.peek() == null) {
                    System.out.println(queue.frontelement() + " connected");
                    stack.push(queue.frontelement());
                } else {
                    System.out.println(stack.peek() + " connected ");
                }
            }

            if (number == 4) {

                //add new device
                if (queue.size() == 5) {
                    queue.dequeue();
                    System.out.println(" enter a new device to pair");
                    Scanner a = new Scanner(System.in);
                    String newdevice = a.nextLine();
                    queue.enqueue(newdevice);
                    System.out.println(newdevice + "paired successfully");

                } else {
                    System.out.println("pair new device using operation 2 of the menu as devices connected are lesser than 5");
                }
            }
            if (number == 5) {
                queue.display();
            }

        }

    }
    static void availdevices() {
        System.out.println(" AVAILABLE DEVICES:- ");
        System.out.println(" ANDROID OS ");
        System.out.println(" APPLE OS ");
        System.out.println(" PALM OS ");
        System.out.println(" WINDOWS MOBILE OS ");
        System.out.println(" LINUX MOBILE OS ");
        System.out.println(" BLACKBERRY OS ");

    }
}

