package com.systemspecs.util;

import java.io.IOException;

import javax.xml.stream.XMLStreamException;

public class Json2XmlTest {

	public static void main(String[] args) throws IOException, XMLStreamException {
		String anyString = "{\"rrr\":\"180386970764\",\"channnel\":\"CASH\",\"channel\":\"CASH\",\"amount\":500.0,\"transactiondate\":\"2020-03-12 00:00:00\",\"debitdate\":\"2020-03-12 13:19:17\",\"bank\":\"\",\"branch\":\"\",\"serviceTypeId\":\"4006518755\",\"payerName\":\"MR AROBASALU dominic\",\"payerphonenumber\":\"0703398341\",\"payeremail\":\"remitareceit.fountainpay@gmail.com\",\"type\":\"PY\",\"customFieldData\":[{\"DESCRIPTION\":\"Station\",\"COLVAL\":\"JUDICIAL SERVICE COMMISSION \"}],\"parentRRRDetails\":{},\"chargeFee\":0}";

		String anyString2 = "{\"msg_id\":\"FA_442_4198121__6218_012144\",\"channel_code\":\"REMITA\",\"auth_token\":\"232jdd2222222\",\"tran_today\":\"Y\"}";

		String anyString3 = "{\"rrr\":\"190014112562\",\"channnel\":\"WEB\",\"channel\":\"WEB\",\"amount\":15000.0,\"transactiondate\":\"2017-03-14 00:00:00\",\"debitdate\":\"2017-03-14 15:03:51\",\"bank\":\"057\",\"branch\":\"\",\"serviceTypeId\":\"1509322635002\",\"payerName\":\"Ade Badmus\",\"payerPhoneNumber\":\"\",\"payerEmail\":\"\",\"type\":\"PY\",\"customFieldData\":[{\"DESCRIPTION\":\"Employer Code\",\"COLVAL\":\"12\"}],\"parentRRRDetails\":{},\"chargeFee\":157.5}";

		String anyString4 = "{\"rrr\":\"190014112562\",\"channnel\":\"WEB\",\"channel\":\"WEB\",\"amount\":15000.00,\"transactiondate\":\"2017-03-14 00:00:00\",\"debitdate\":\"2017-03-14 15:03:51\",\"bank\":\"057\",\"branch\":\"\",\"serviceTypeId\":\"1509322635002\",\"payerName\":\"Ade badmus\",\"payerphonenumber\":\"08067493797\",\"payeremail\":\"oshadami.mj@gmail.com\",\"type\":\"PY\",\"customFieldData\":[{\"DESCRIPTION\":\"Employer Code\",\"COLVAL\":\"12\"},{\"DESCRIPTION\":\"Description\",\"COLVAL\":\"Test Payment\"},{\"DESCRIPTION\":\"Station\",\"COLVAL\":\"JUDICIAL SERVICE COMMISSION\"}],\"parentRRRDetails\":{},\"chargeFee\":157.50,\"paymentDescription\":\"Pension Schedule - Collection\"} ";

		String xml = Json2XmlUtil.convert(anyString4);
		String anyString0 = anyString4;
		System.out.println("anyString:\n " + anyString0);
		System.out.println("\nJSON to XML:\n " + xml);
	}
}
