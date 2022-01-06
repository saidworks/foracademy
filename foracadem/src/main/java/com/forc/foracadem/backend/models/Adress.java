package com.forc.foracadem.backend.models;

public class Adress {
    private int id_adress;
    private String line_adress;
    private String ville_adress;
    private int code_postale_adress;

    public Adress() {
    }

    public Adress(int id_adress, String line_adress, String ville_adress, int code_postale_adress) {
        this.id_adress = id_adress;
        this.line_adress = line_adress;
        this.ville_adress = ville_adress;
        this.code_postale_adress = code_postale_adress;
    }

    public int getId_adress() {
        return id_adress;
    }

    public void setId_adress(int id_adress) {
        this.id_adress = id_adress;
    }

    public String getLine_adress() {
        return line_adress;
    }

    public void setLine_adress(String line_adress) {
        this.line_adress = line_adress;
    }

    public String getVille_adress() {
        return ville_adress;
    }

    public void setVille_adress(String ville_adress) {
        this.ville_adress = ville_adress;
    }

    public int getCode_postale_adress() {
        return code_postale_adress;
    }

    public void setCode_postale_adress(int code_postale_adress) {
        this.code_postale_adress = code_postale_adress;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "id_adress=" + id_adress +
                ", line_adress='" + line_adress + '\'' +
                ", ville_adress='" + ville_adress + '\'' +
                ", code_postale_adress=" + code_postale_adress +
                '}';
    }
}
