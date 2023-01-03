package mvc;

public class Model {
    private String no;
    private String namabrg;
    private String jumlah;
    private boolean status;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNamabrg() {
        return namabrg;
    }

    public void setNamabrg(String namabrg) {
        this.namabrg = namabrg;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public Model(String no, String namabrg, String jumlah, boolean status){
        this.no = no;
        this.namabrg = namabrg;
        this.jumlah = jumlah;
        this.status = status;
    }
}
