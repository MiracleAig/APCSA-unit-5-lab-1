import java.util.Scanner;

public class Main {



    static double LOPOX;
    static double LOPOY;
    static double LOPTX;
    static double LOPTY;
    static double LTPOX;
    static double LTPOY;
    static double LTPTX;
    static double LTPTY;

    static MyPoint LOPO;
    static MyPoint LOPT;
    static MyPoint LTPO;
    static MyPoint LTPT;
    static MyLine L1;
    static MyLine L2;

    static int userSelection;

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Set up your lines:");
        System.out.println();
        System.out.println("Line one point one...");
        System.out.print("Enter the x value: ");
        LOPOX = s.nextDouble();
        System.out.print("Enter the y value: ");
        LOPOY = s.nextDouble();
        System.out.println();
        System.out.println("Line one point two...");
        System.out.print("Enter the x value: ");
        LOPTX = s.nextDouble();
        System.out.print("Enter the y value: ");
        LOPTY = s.nextDouble();
        System.out.println();
        System.out.println("Line two point one...");
        System.out.print("Enter the x value: ");
        LTPOX = s.nextDouble();
        System.out.print("Enter the y value: ");
        LTPOY = s.nextDouble();
        System.out.println();
        System.out.println("Line two point two...");
        System.out.print("Enter the x value: ");
        LTPTX = s.nextDouble();
        System.out.print("Enter the y value: ");
        LTPTY = s.nextDouble();
        System.out.println();

        LOPO = new MyPoint(LOPOX, LOPOY);
        LOPT = new MyPoint(LOPTX, LOPTY);
        LTPO = new MyPoint(LTPOX, LTPOY);
        LTPT = new MyPoint(LTPTX, LTPTY);
        L1 = new MyLine(LOPO, LOPT);
        L2 = new MyLine(LTPO, LTPT);
        showMenu();
    }


    public static void showMenu(){
        System.out.println();
        System.out.println("- Main Menu -");
        System.out.println("1. Change line 1\n2. Change line 2\n3. View line 1\n4. View line 2\n5. View line intersection\n6. Exit");
        getUserSelection();
    }

    public static void getUserSelection(){
        System.out.print("Enter selection: ");
        userSelection = s.nextInt();
        processUserSelection(userSelection);
    }

    public static void processUserSelection(int selection){
        if(selection == 1){
            System.out.println();
            System.out.println(L1.toString());
        }
    }



}
