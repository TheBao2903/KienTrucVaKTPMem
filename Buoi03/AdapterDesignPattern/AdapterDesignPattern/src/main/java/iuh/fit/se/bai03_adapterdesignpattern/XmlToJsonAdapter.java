package iuh.fit.se.bai03_adapterdesignpattern;

public class XmlToJsonAdapter implements JsonService {

    private XmlSystem xmlSystem;

    public XmlToJsonAdapter(XmlSystem xmlSystem) {
        this.xmlSystem = xmlSystem;
    }

    @Override
    public void processJson(String json) {
        // Chuyển JSON sang XML (demo đơn giản)
        String xml = convertJsonToXml(json);
        xmlSystem.processXml(xml);
    }

    private String convertJsonToXml(String json) {
        // Demo logic (thực tế dùng thư viện Jackson, Gson, JAXB...)
        return "<data>" + json + "</data>";
    }
}
