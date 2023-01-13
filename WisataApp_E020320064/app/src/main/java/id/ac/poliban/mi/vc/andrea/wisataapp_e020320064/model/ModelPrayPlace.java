package id.ac.poliban.mi.vc.andrea.wisataapp_e020320064.model;

import java.io.Serializable;

public class ModelPrayPlace implements Serializable {

    // Nama  : Andrea Jeane Elquita
    // NIM   : E020320064
    // Kelas : 5C MI

    private String txtTempatIbadah;
    private double latitude;
    private double longitude;

    public String getTxtTempatIbadah() {
        return txtTempatIbadah;
    }

    public void setTxtTempatIbadah(String txtTempatIbadah) {
        this.txtTempatIbadah = txtTempatIbadah;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
