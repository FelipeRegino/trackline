package trabalho.trackline;

/**
 * Created by Felipe on 24/05/2016.
 */
public class Locale {

    long id;
    double Lat;
    double Lng;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public double getLat(){
        return Lat;
    }
    public void setLat(double Lat){
        this.Lat = Lat;
    }
    public double getLng(){
        return Lng;
    }
    public void setLng(double Lng){
        this.Lng = Lng;
    }
}
