import java.io.File;
import java.sql.SQLOutput;

public class Main
{public static void main(String[] args)
        goldilocks.txt

        FileInputSteam1 file 1 = FileInputSteam (name: "src/Goldilocks.txt");
        FileInputSteam2 file 2 = FileInputSteam (name: "src/hansel_and_gretal.txt");
        FileInputSteam3 file 3 = FileInputSteam (name: "src/mary_had_a_little_lamb.txt);


        {Scanner scanner = new Scanner;(System.in);
            System.out.printn("We have 3 story options to choose from: \n 1. Goldilocks.txt) \n 2. Hansel and Gretel. \n 3. Mary had a little lamb");


            String input = "";
            int lineNun = 0;
            while (true) {

                char choice = getStringInput(scanner, prompt: "Enter the number of a story to read: ");
                switch (choice) {
                    case '1':
                        displayOutput( input, lineNum, file);
                        break;
                        case '2':
                            displayOutput( input, lineNum, file2);
                            break;
                            case '3':
                                displayOutout( input, lineNum, file 3);
                                break;
                                default:
                                    System.out.println("Sorry I coudn't get that")
                  }
              }

            }

