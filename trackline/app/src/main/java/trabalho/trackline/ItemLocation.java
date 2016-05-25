package trabalho.trackline;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

public class ItemLocation {

    public static double mLat, mLng;
    String WSDL = "http://192.168.43.193:8080/LocationService/ItemLocationService?wsdl";


    public Locale pickLoc(int id) throws XmlPullParserException, IOException {
        Locale loc;

        SoapObject soap = new SoapObject("http://item_location/", "pickLoc");
        soap.addProperty("pickLoc", id);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(soap);

        HttpTransportSE httpTrans = new HttpTransportSE(WSDL);
        httpTrans.call("pickLock", envelope);

        SoapObject resp = (SoapObject) envelope.getResponse();

        loc = new Locale();
        loc.setId(Long.parseLong(resp.getProperty("id").toString()));
        loc.setLat(Double.parseDouble(resp.getProperty("lat").toString()));
        loc.setLng(Double.parseDouble(resp.getProperty("lng").toString()));

        mLat = Double.parseDouble(resp.getProperty("lat").toString());
        mLng = Double.parseDouble(resp.getProperty("lng").toString());

        return loc;
    }
}
