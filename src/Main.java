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

        LOPO = new MyPoint(LOPOX, LOPOY);
        LOPT = new MyPoint(LOPTX, LOPTY);
        LTPO = new MyPoint(LTPOX, LTPOY);
        LTPT = new MyPoint(LTPTX, LTPTY);
        L1 = new MyLine(LOPO, LOPT);
        L2 = new MyLine(LTPO, LTPT);

        showMenu();
    }

    public static void viewLine(MyLine line, int userSelection){
        if(userSelection == 3){
            System.out.println();
            System.out.println("Line one:");
            System.out.println(line.toString());
            showMenu();
        }else if(userSelection == 4){
            System.out.println();
            System.out.println("Line two:");
            System.out.println(line.toString());
            showMenu();
        }
    }


    public static void showMenu(){
        System.out.println();
        System.out.println("-Main Menu-");
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
            System.out.println("Data for line 1:");
            System.out.println(L1.toString());
            showChangeMenu();
        }else if(selection == 3){
            viewLine(L1, 3);
        }else if(selection == 4){
            viewLine(L2, 4);
        }
    }

    public static void processUserSelectionChangeMenu(int userSelection){
        if(userSelection == 1){
            changePointOneLineOne(L1);
        }else if(userSelection == 2){
            changePointTwoLineOne(L1);
        }
    }
    public static void showChangeMenu(){
        System.out.println();
        System.out.println("-Change Menu-");
        System.out.println("1. Change point 1");
        System.out.println("2. Change point 2");
        System.out.println("3. Change both points");
        System.out.println("4. Cancel");
        System.out.print("Enter selection: ");
        int userSelectionChangeMenu = s.nextInt();
        processUserSelectionChangeMenu(userSelectionChangeMenu);

    }



    public static void changePointOneLineOne(MyLine line){
            System.out.println();
            System.out.println("New point one for line one...");
            System.out.print("Enter the x value: ");
            double newXval = s.nextDouble();
            System.out.print("Enter the y value: ");
            double newYval = s.nextDouble();
            MyPoint newPointOne = new MyPoint(newXval, newYval);
            line.setPointOne(newPointOne);
            showMenu();
    }

    public static void changePointTwoLineOne(MyLine line){
        System.out.println();
        System.out.println("New point one for line one...");
        System.out.print("Enter the x value: ");
        double newXval = s.nextDouble();
        System.out.print("Enter the y value");
        double newYval = s.nextDouble();
        MyPoint newPointTwo = new MyPoint(newXval, newYval);
        line.setPointTwo(newPointTwo);
        showMenu();
    }




}