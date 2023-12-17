package model;

public class Owner extends Akun {
    private String idOwner;
    private String jenisKelamin;
    private String noTelp;

    public String getIdOwner() {
        return idOwner;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public Owner setIdOwner(String idOwner) {
        this.idOwner = idOwner;
        return this;
    }

    public Owner setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
        return this;
    }

    public Owner setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        return this;
    }
}
