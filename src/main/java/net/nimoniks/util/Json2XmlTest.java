package net.nimoniks.util;

import java.io.IOException;

import javax.xml.stream.XMLStreamException;

public class Json2XmlTest {

	public static void main(String[] args) throws IOException, XMLStreamException {
//	System.out.println("Hello World");
		String jsonString = "{\"rrr\":\"190014112562\",\"channnel\":\"WEB\",\"channel\":\"WEB\",\"amount\":15000.00,\"transactiondate\":\"2017-03-14 00:00:00\",\"debitdate\":\"2017-03-14 15:03:51\",\"bank\":\"057\",\"branch\":\"\",\"serviceTypeId\":\"1509322635002\",\"payerName\":\"Ade Badmus\",\"payerPhoneNumber\":\"\",\"payerEmail\":\"\",\"type\":\"PY\",\"customFieldData\":[{\"DESCRIPTION\":\"Employer Code\",\"COLVAL\":\"12\"}],\"parentRRRDetails\":{},\"chargeFee\":157.50}";

		String xml = Json2XmlUtil.convert(jsonString);
		System.out.println("JSON:\n " + jsonString);
		System.out.println("\nXML:\n" + xml);
	}
}
