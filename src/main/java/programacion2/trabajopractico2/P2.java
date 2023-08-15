package programacion2.trabajopractico2;


public class P2 {
    private int n;
    private int fac = 1;
    private int c =  1;

    public P2(int n) {
        this.n = n;
    }
    
    public void factorial (){
        while (c <= n) {
            fac = fac * c;

            System.out.print("*"+c);;

            c = c + 1;
        }
        System.out.print(" = "+fac);
    }
}
