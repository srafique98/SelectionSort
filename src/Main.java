// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int size = args.length;
        int [] arr = new int[size];

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i =0; i < size; i++)
            arr[i] = Integer.parseInt(args[i]);

        for (int s: arr)
            System.out.print(" "+ s);

        for (int i =0; i < size-1; i++){
            int minElement = i;
            for (int j =i+1; j < size; j++){
                if (arr[j] < arr[minElement])
                    minElement = j;
            }
            int temp = arr[minElement];
            arr[minElement] = arr[i];
            arr[i] = temp;
        }

        for (int s: arr)
            System.out.println(s);


    }
}