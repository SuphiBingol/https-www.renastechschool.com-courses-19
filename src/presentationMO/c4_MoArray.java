package presentationMO;

import java.util.Arrays;

public class c4_MoArray {

    public static void main(String[] args) {

        int[] numbers = {3, 2, 5, 1, 9};
        String[] names = {"Ibrahim", "Tre=Aryan", "Recep", "Musab"};
        char[] letters = {'c', 'a', 'd', 'b'};

        Arrays.sort(numbers);
        Arrays.sort(names);
        Arrays.sort(letters);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(letters));
        main(7);

    }

    public static void main(int number) { }

}
