package printingnumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author emergon
 */
public class PrintingNumbers {

    public static void main(String[] args) {
        /*
Create a new project. The program asks the user "how many products do you want to insert?". The user responds with a number(numOfProducts).
The program asks the user for inserting products as many times as he decided.
Store the products in a list (listOfProducts).
Print the products in the following format: product1, product2, ..., productN.
Sort the products alphabetically.
Print them again with the same format as before.
***Use a method for every question that the program makes
***Use a method to print the lists        
         */
        Scanner input = new Scanner(System.in);
        ArrayList<String> listOfProductsMain = new ArrayList();
        listOfProductsMain = getProductListFromInput(input);
        printList(listOfProductsMain);
        System.out.println("******Sorting and Printing List**********");
        Collections.sort(listOfProductsMain);
        printList(listOfProductsMain);
        printMessage("Thank you");
        
    }
    
    static void printList(ArrayList<String> list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            if(i<list.size()-1){
                System.out.print(", ");
            }else{
                System.out.println(".");
            }
        }
    }
    //..../return DataType   /Method name        /(DataType name_of_variable) 
    static ArrayList<String> getProductListFromInput(Scanner inputMethod) {
        ArrayList<String> listOfProducts = new ArrayList();
        printMessage("Hello, how many products would you like to insert?");
        int x = inputMethod.nextInt();
        for (int i = 0; i < x; i++) {
            printMessage("Please insert product "+(i+1)+":");
            String product = inputMethod.next();
            listOfProducts.add(product);
        }
        return listOfProducts;
    }

    static void printMessage(String message) {
        System.out.println(message);
    }

    /*
    Γράψτε ένα πρόγραμμα στο οποίο θα εισάγετε αριθμούς 
    μέχρι το άθροισμα τους να ξεπεράσει το 100. 
    Επίσης, εμφανίστε ένα μήνυμα με πόσους αριθμούς εισάγατε.
     */
    static void addingNumbersUntil_100_3() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int i;
        for (i = 0; sum <= 100; i++) {
            System.out.print("Enter number:");
            int n = input.nextInt();
            sum += n;
        }
        System.out.println("The number you submitted :" + i + ", sum:" + sum);
        input.close();
    }

    static void addingNumbersUntil_100_2() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int howManyNumbers = 0;
        while (sum < 100) {
            System.out.println("Give me a number:");
            int number = input.nextInt();
            sum += number;
            howManyNumbers++;
        }
        System.out.println("Inserted:" + howManyNumbers + " numbers and sum is " + sum);
        input.close();
    }

    static void addingNumbersUntil_100_1() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int howManyNumbers = 0;
        while (true) {
            System.out.println("Give me a number:");
            int number = input.nextInt();
            sum += number;
            howManyNumbers++;
            if (sum > 100) {
                break;
            }
        }
        System.out.println("Inserted:" + howManyNumbers + " numbers and sum is " + sum);
    }

    /*        
    Γράψτε ένα πρόγραμμα σε Java το οποίο θα εκτυπώνει το άθροισμα των αριθμών
    από το 0 ως το 1000 μόνο όμως των πολλαπλάσιών του 5.
     */
    static void addingNumbers() {
        int sum = 0;
        for (int i = 5; i <= 1000; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum:" + sum);
    }

    static void printingNumbers1() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                //ta noumera apo to 1 mexri to noumero tis grammis
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void printingNumbers2() {
        int n = 10;
        String out = "";
        for (int i = 1; i <= n; i++) {
//          out = out + i;
            out += i;
            System.out.println(out);
        }
    }

    static void printingNumbers3() {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            listOfNumbers.add(i);
            System.out.println(listOfNumbers.toString().substring(1).replace("]", "").replace(", ", ""));
        }
        System.out.println(listOfNumbers);
    }

}
