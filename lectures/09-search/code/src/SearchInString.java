// A code similar to search and find feature in devices. returns the index positions of all the occurances of a substring in a larger input string.

// Both uppercase and lowercase should be considered similarly.

import java.util.Scanner;

public class SearchInString {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the line: ");
        String input = inp.nextLine();

        System.out.print("What are you searching for?: ");
        String search = inp.nextLine();

        // Difference between .next() and .nextLine()?
        /* .next(): takes input until it hits a whitespace.
            .nextLine(): takes entire line as an input.

         */
        System.out.println(find(input, search));
    }

    // Is there something similar to substring in Java?
    // Ans: yes
    private static int find(String input, String search) {

        // can we access String's char using foreach?
        // Ans: no.

        int inputLength = input.length();
        int searchLength = search.length();
        int count = 0;

        for (int i = 0; i < inputLength - searchLength + 1; i++){

            if (input.charAt(i) == search.charAt(0)){

                for (int j = 0; j < searchLength; j++){
                    if (input.charAt(i+j) != search.charAt(j)){
                        break;
                    }
                    else count++;
                }

                if (count == searchLength){
                    return i+1;
                } else count = 0;
            }

        }

        return -1;
    }


}


/* Possibilities of improvement:
1/ use substring -- avoid one for loop.
2/ give index of all the occurances.
3/ consider both upper and lower cases similarly.
 */