package StackJava;

public class Tumpukan {
    final int MAKSDATA = 5;
    String [] tumpukan = new String[MAKSDATA];

    private int  puncak ;
    public Tumpukan(){
        puncak = -1;
    }
    public boolean push(String data){
        if (puncak == (MAKSDATA - 1)){
            System.out.println("Tumpukan Data Penuh !");
            System.out.println(data + "tidak dimasukkan");
            return false;
        }
        puncak++;
        tumpukan [puncak] = data;
        return true;
    }
    public boolean empty(){
        return (puncak == -1);
    }
    public String pop(){
        if(!empty()){
            return tumpukan[puncak--];
        }else {
            return "Error";
        }
    }
}
