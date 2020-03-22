package com.systemspecs.util;

import java.io.IOException;

import javax.xml.stream.XMLStreamException;

public class Json2XmlTest {

	public static void main(String[] args) throws IOException, XMLStreamException {
		
		String jsonString = "  {\n" + 
				"       \"document\":{\n" + 
				"          \"a\":1,\n" + 
				"          \"b\":2,\n" + 
				"          \"c\":{\n" + 
				"             \"d\":\"text\"\n" + 
				"          },\n" + 
				"          \"e\":[1, 2, 3],\n" + 
				"          \"f\":[[1, 2, 3], [4, 5,6]],\n" + 
				"          \"g\":null,\n" + 
				"          \"h\":[\n" + 
				"             {\n" + 
				"                \"i\":true,\n" + 
				"                \"j\":false\n" + 
				"             }\n" + 
				"          ],\n" + 
				"          \"k\":[\n" + 
				"             [\n" + 
				"                {\"l\":1, \"m\":2}\n" + 
				"             ],\n" + 
				"             [\n" + 
				"                {\"n\":3, \"o\":4},\n" + 
				"                {\"p\":5, \"q\":6}\n" + 
				"             ]\n" + 
				"          ]\n" + 
				"       }\n" + 
				"    }";

		String xml = Json2XmlUtil.convert(jsonString);
		System.out.println("JSON:\n " + jsonString);
		System.out.println("\nXML:\n" + xml);
	}
}
