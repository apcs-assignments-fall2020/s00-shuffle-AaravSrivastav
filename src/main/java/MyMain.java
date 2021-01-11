public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int[] shuffledArr = new int[arr.length];
        int a = 0;
        int b = arr.length/2;
        for(int i = 0; i<arr.length; i++)
        {
            if(i%2 == 0)
            {
                shuffledArr[i] = arr[a];
                a++;
            }
            else
            {
                shuffledArr[i] = arr[b];
                b++;
            }
        }
        return shuffledArr;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        for (int i = 0; i<arr.length; i++)
        {
            int rand = (int)(Math.random() * arr.length);
            int a = arr[i];
            int b = arr[rand];
            arr[rand] = a;
            arr[i] = b;
        }
        return arr;
    }



    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4 ,5, 6, 7, 8, 9, 0};
        int[] arr2 = perfectShuffle(arr);
        int[] arr3 = selectionShuffle(arr);
        for(int i:arr2)
        {
            System.out.print(i + " ");
        }
        System.out.println("");
        for(int i:arr3)
        {
            System.out.print(i + " ");
        }

    }
}
