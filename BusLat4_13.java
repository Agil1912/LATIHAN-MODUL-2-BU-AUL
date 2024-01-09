public class Bus {
    private int penumpang,maxpenumpang;

    public Bus(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }
    public void pluspenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if(temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            this.penumpang=temp;
        }
    }
        public void getpassword(int password){
            if (password==90){
                System.out.println("Pass bener");
            }
            else{
            System.out.println("Pass salah ygy");
        }
    }

    public void cetak(){
        System.out.println("penumpang sekarang: "+penumpang);
        System.out.println("Penumpang seharusnya adalah: "+ maxpenumpang);

    }
}

