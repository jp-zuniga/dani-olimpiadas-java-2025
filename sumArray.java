class Main {
    public static void main(String[] args) {
        int size = 5;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }

        int result = sumArray(arr, size);

        System.out.println(result);
    }

    public static int sumArray(int[] arr, int len) {
        int result = 0;

        for (int i = 0; i < len; i++) {
            result += arr[i];
        }

        return result;
    }
}
