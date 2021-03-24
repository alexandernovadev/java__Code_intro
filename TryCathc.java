class TryCathc {

public static void main(String[] args) {
    int i, j, aux;

    int[] A = new int[] { 1, 9, 3, 9, 5, 6, 4, 8, 2, 3 };
    for (i = 0; i < A.length - 1; i++) {
        for (j = 0; j < A.length - i - 1; j++) {
            if (A[j + 1] < A[j]) {
                aux = A[j + 1];
                A[j + 1] = A[j];
                A[j] = aux;
            }
        }
    }

    // Imprimir
    for (int k = 0; k < A.length + 3; k++) {
        try {
            System.out.println(A[k] + " ");
        } catch (Exception e) {
            System.out.println("Aca la exepcion -> " + e);
        }
    }

}
}