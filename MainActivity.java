import java.io.*;
import java.util.*;

public class MainActivity{

  public static void main(String[] args){
    // This is where we need to read the text file
    File file = new File("/home/mansa/Documents/Google_Hash_Code/Pizza/a_example.in");
    try{

      Scanner sc = new Scanner(file);
      // The following code reads the first line of the input file
      // and converts it to an integer array at the end.

      String inputFormat = sc.nextLine();
      String[] fLine = inputFormat.split(" ");
      int[] integers = new int[fLine.length];
      for (int i = 0; i < integers.length; i++){
        integers[i] = Integer.parseInt(fLine[i]);
      }
      int rows,columns,min_ingredients, max_ingredients;
      rows = integers[0];
      columns = integers[1];
      min_ingredients = integers[2];
      max_ingredients = integers[3];
      int num_tomatoes = 0;
      int num_mushrooms = 0;
      // The following code reads the remaining lines in the file
      // and then converts each line to an integer array that represents the
      // parameters of the ride i.e. row of start intersection, column of start intersection
      // and so on.
      System.out.println(rows);
      String[][] grid = new String[rows][columns];
      for (int i = 0; i < rows; i++){
        inputFormat = sc.nextLine();
        fLine = inputFormat.split("");
        for (int j = 0; j < columns; j++){
          grid[i][j] = fLine[j];
          if (grid[i][j].equals("T")){
            num_tomatoes++;
          } else {
            num_mushrooms++;
          }

        }
      }

      System.out.println(grid[1][1]);
      System.out.println(grid[1][2]);
      System.out.println(grid[1][3]);
      System.out.println(num_mushrooms);
      System.out.println(num_tomatoes);

    }
    catch (FileNotFoundException ex)
    {
      System.out.println("File does not exist");
    }

  }

}

//PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
//writer.println("The first line");
//writer.println("The second line");
//writer.close();
