import java.util.Scanner;
public class form{
    public static void(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.print("enter name here: ");
        String name=scanner.nextLine();

        System.out.print("enter age: ");
        int age=scanner.nextint();

        System.out.print("Enter weight");
        float weight=scanner.nextfloat();

        System.out.print("Do you code? (True or false)");
        boolean cool =scanner.nextboolean();

        System.out.printin("\n--Medical form")
        System.out.printin("name"+name);
        System.out.printin("Age" +age);
        System.out.printin("weight" + weight);
        System.out.printin("Coder" + cool);
        scanner.close();

    }
}
