package StackJava;

public class TumpukanApp {
    public static void main(String[] args) {
        Tumpukan tumpuk = new Tumpukan();

        tumpuk.push("D");
        tumpuk.push("E");
        tumpuk.push("A");
        tumpuk.pop();
        tumpuk.pop();
        tumpuk.push("K");
        tumpuk.push("S");
        tumpuk.pop();

        System.out.println("Isi Tumpukkan : ");
        while (!tumpuk.empty()){
            String huruf  = tumpuk.pop();
            System.out.println(huruf);
        }
    }
}
