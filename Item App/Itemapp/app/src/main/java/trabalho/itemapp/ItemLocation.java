package trabalho.itemapp;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

public class ItemLocation {

    String WSDL = "http://192.168.43.193:8080/LocationService/ItemLocationService?wsdl";

    public ItemLocation(){

    }

    public double addLat(double Lat) throws XmlPullParserException, IOException {

        SoapObject soap = new SoapObject("http://item_location/", "addLat");
        soap.addProperty("Lat", Lat);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        MarshalDouble marshaldDouble = new MarshalDouble();
        marshaldDouble.register(envelope);
        envelope.setOutputSoapObject(soap);

        HttpTransportSE httpTrans = new HttpTransportSE(WSDL);
        httpTrans.call("addLat", envelope);

        Object result =  envelope.getResponse();

        return Double.parseDouble(result.toString());
    }

    public double addLng(double Lng) throws XmlPullParserException, IOException {

        SoapObject soap = new SoapObject("http://item_location/", "addLng");
        soap.addProperty("Lng", Lng);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        MarshalDouble marshaldDouble = new MarshalDouble();
        marshaldDouble.register(envelope);
        envelope.setOutputSoapObject(soap);

        HttpTransportSE httpTrans = new HttpTransportSE(WSDL);
        httpTrans.call("addLat", envelope);

        Object result =  envelope.getResponse();

        return Double.parseDouble(result.toString());
    }
}
