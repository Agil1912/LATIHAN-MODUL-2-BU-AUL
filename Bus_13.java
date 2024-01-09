public class Bus_13 {
    int penumpang;
    private int maxPenumpang;

    public Bus_13(int maxPenumpang){
        this.maxPenumpang=maxPenumpang;
        penumpang = 0;
    }

    public void plusPenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if (temp>=maxPenumpang){
            System.out.println("Overload Penumpang Woilahh");
        }
       else{
        this.penumpang=temp;
       }

    }
    public void cetak(){
        System.out.println("Penumpang sekarang: "+penumpang);
        System.out.println("Penumpang seharusnya: "+maxPenumpang);
    }
}