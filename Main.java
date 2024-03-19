
import java.util.Scanner;
public class Main {
    static void error_message(){
        System.out.println("Invalid choice Please Try again");
    }
    static void answer(int x,int y)
    {
        System.out.println("Sum is: " + sum(x, y));
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object


        while (true) {
            int choice=0;
            System.out.println("Choose the number of parameters to pass to SUM or 0 if u want to break:");
            System.out.println("1\n2");
            try {
                choice = myObj.nextInt();
                if(choice==0)
                    break;
            }
            catch (Exception e) {
                // Catch any exception that occurs
                error_message();
                myObj.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Choose the data type of parameter to pass to SUM:");
                    System.out.println("1. int\n2. double");
                    int select=0;
                    try {
                        select = myObj.nextInt();
                    }
                    catch (Exception ignored)
                    {
                        error_message();
                        myObj.nextLine();
                        continue;

                    }
                    if (select == 1) {
                        System.out.println("Please enter an integer");
                        int input=0;
                        try {
                            input = myObj.nextInt();
                        }
                        catch (Exception ignored)
                        {
                            error_message();
                            myObj.nextLine();
                            continue;
                        }
                        if(input>=0)
                            answer(1,input);
                        else {
                            error_message();
                            continue;
                        }


                    } else if(select==2) {
                        System.out.println("Please enter a float");
                        float input = myObj.nextFloat();
                        int num=(int)input;
                        if(input>=0)
                            answer(1,num);
                        else {
                            error_message();
                            continue;
                        }

                    }
                    else
                    {
                        error_message();;
                        continue;
                    }
                    break;

                case 2:
                    System.out.println("Choose the two integers to pass to SUM:");
                    int min = myObj.nextInt();
                    int max = myObj.nextInt();
                    if(max>=0&&min>=0) {
                        if (max < min) {
                            int temp = max;
                            max = min;
                            min = temp;
                        }
                        answer(min,max);
                    }
                    else
                    {
                        error_message();
                        continue;
                    }

                    break;
                default:
                    error_message();
                    continue;
            }
            System.out.println("Do want another try?");
            System.out.println("1 for yes or 0 for no");
            int z=myObj.nextInt();
            if(z==1)
                continue;
            else
                break;
        }
        myObj.close();
    }
    public static int sum(int min,int max)
    {
        return (max*(max+1)/2)-(min*(min-1)/2);
    }
}