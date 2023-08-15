package programacion2.trabajopractico2;

public class P1 {
    private int binario1, binario2;
    private int i = 0;
    private int re = 0;
    private int[] sum = new int[20];

    public P1(int binario1, int binario2) {
        this.binario1 = binario1;
        this.binario2 = binario2;
    }
    
    public void binarios (){
        while (binario1 != 0 || binario2 != 0) {
            sum[i++] = (binario1 % 10 + binario2 % 10 + re) % 2;
            re = (binario1 % 10 + binario2 % 10 + re) / 2;
            binario1 = binario1 / 10;
            binario2 = binario2 / 10;
        }

        if (re != 0) {
            sum[i++] = re;
        }

        --i;
        System.out.println("El resultado der la suma es: ");
        while (i >= 0) {
            System.out.println(sum[i--]);
        }
    }
}
