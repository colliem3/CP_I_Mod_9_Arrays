import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Random gen = new Random();

        int[] values  = new int[100];

        for(int i=0; i < values.length; i++)
        {
            values[i] = gen.nextInt(100) + 1; // set all to 1 to 100
        }

        System.out.println("\n\n");

        for(int i=0; i < values.length; i++)
            System.out.printf("%4d", values[i]);

        //Array Algorithms
        //sum
        int sum = 0;
        double avg = 0;
        for(int i=0; i < values.length; i++)
            sum += values[i];

        System.out.println("\nThe sum of the values is " + sum);
        avg = (double) sum / values.length;
        System.out.printf("Avg is %5.2f", avg);
        System.out.println("\nThe average is " + sum / values.length); //displays as an int TRUNCATED

        //Min Max
        int min = values[0];
        int max = values[0];

        for(int i=0; i < values.length; i++)
        {
            if(values[i] < min) //NEW Min
                min = values[i]; // so save it
            if(values[i] > max) //NEW Max
                max = values[i]; // so save it
        }
        System.out.println("Min is " + min);
        System.out.println("Max is " + max);

        //Search Algorithms
        //Find any or Find All
        int target = 53;
        boolean found = false;
        for(int i=0; i < values.length; i++)
        {
            if(values[i] == target)
            {
                System.out.println("Found at " + i);
                found = true;
            }
        }
        if(!found)
            System.out.println("Value is not in the array!");

        //Find First
        target = 53;
        found = false;
        for(int i=0; i < values.length; i++)
        {
            if(values[i] == target)
            {
                System.out.println("Find First Found at " + i);
                found = true;
                break;
            }
        }
        if(!found)
            System.out.println("Value is not in the array!");

        //Find Last
        found = false;
        for(int i=values.length - 1; i >= 0; i--)
        {
            if(values[i] == target)
            {
                System.out.println("Find Last Found at " + i);
                found = true;
                break;
            }
        }
        if(!found)
            System.out.println("Value is not in the array!");

        String[] names = {"Bob", "Carol", "Ted", "Alice"};
       System.out.println(names.length);

       System.out.println(names[0]);

       for(int i=0; i < names.length; i++)
           System.out.printf("%8s", names[i]);


       int[] scores = new int[100]; // creates an array of 100 ints Not set yet
        for(int i=0; i < scores.length; i++)
            scores[i] = 0;              // sets all the data points to 0

        for(int i=0; i < scores.length; i++)
            System.out.printf("%4d", scores[i]);

    }
}