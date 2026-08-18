import java.util.Scanner;

public class CopyObject {

    // Member variables
    int num;
    float decimal;

    // Constructor
    public CopyObject(int num, float decimal) {
        this.num = num;
        this.decimal = decimal;
    }

    // Default Constructor
    public CopyObject() {
        this.num = 0;
        this.decimal = 0.0f;
    }

    // Method to copy values from another object
    public void copyFrom(CopyObject source) {
        this.num     = source.num;
        this.decimal = source.decimal;
    }

    // Method to display object values
    public void display(String objectName) {
        System.out.println("\n----- " + objectName + " -----");
        System.out.println("Integer Value : " + num);
        System.out.println("Float Value   : " + decimal);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ------- Object 1 - Take input from user -------
        System.out.println("Enter values for Object 1:");
        System.out.print("Enter Integer value : ");
        int n = sc.nextInt();

        System.out.print("Enter Float value   : ");
        float f = sc.nextFloat();

        // Create Object 1 with user input
        CopyObject obj1 = new CopyObject(n, f);

        // Create Object 2 - Empty
        CopyObject obj2 = new CopyObject();

        // Display before copying
        System.out.println("\n====== BEFORE COPY ======");
        obj1.display("Object 1");
        obj2.display("Object 2");

        // Copy obj1 values to obj2
        obj2.copyFrom(obj1);

        // Display after copying
        System.out.println("\n====== AFTER COPY ======");
        obj1.display("Object 1");
        obj2.display("Object 2");

        System.out.println("\nValues copied successfully!");

        sc.close();
    }
}