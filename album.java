package lab2;

public class album {
    private int maCD;
    private String tenCD;
    private int soBH;
    private float giaThanh;
    public album() {
    }
    public album(int cD, String tenCD, int soBH, float giaThanh) {
        this.maCD = maCD;
        this.tenCD = tenCD;
        this.soBH = soBH;
        this.giaThanh = giaThanh;
    }
    public int getMaCD() {
        return maCD;
    }
    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }
 
    public String getTenCD() {
        return tenCD;
    }
 
    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }
    
    public int getSoBH() {
        return soBH;
    }
 
    public void setSoBH(int soBH) {
        this.soBH = soBH;
    }
 
    public float getGiaThanh() {
        return giaThanh;
    }
 
    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }

    @Override
    public String toString() {
        return "album{" + "maCD=" + maCD + ", tenCD=" + tenCD +  ", soBH=" + soBH + ", giaThanh=" + giaThanh + '}';
    }
   
  
    //khởi tạo phương thức hiện thị theo format
    public void Hienthialbum(){
        System.out.printf("%-10d %-10s %-10d %-20.1f \n",maCD,tenCD,soBH,giaThanh);
    }
 
}


