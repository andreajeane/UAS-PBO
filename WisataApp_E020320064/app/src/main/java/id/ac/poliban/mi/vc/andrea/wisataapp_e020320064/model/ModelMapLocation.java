package id.ac.poliban.mi.vc.andrea.wisataapp_e020320064.model;

import com.google.android.gms.maps.model.LatLng;


public class ModelMapLocation {

    // Nama  : Andrea Jeane Elquita
    // NIM   : E020320064
    // Kelas : 5C MI

    public String name;
    public LatLng center;

    public ModelMapLocation() {}

    public ModelMapLocation(String name, double lat, double lng) {
        this.name = name;
        this.center = new LatLng(lat, lng);
    }
}
