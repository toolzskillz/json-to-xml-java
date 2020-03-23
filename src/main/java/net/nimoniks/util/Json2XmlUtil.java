
package net.nimoniks.util;

import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.Iterator;

import org.json.JSONObject;
import org.json.XML;

public class Json2XmlUtil {

	private static InputStream json;
	private static String pattern = "#.00"; // To 2 decimal places
	private static DecimalFormat decimalFormat = new DecimalFormat(pattern);

	public static String convert(String anyJsonString) {
		String xml = null;
		try {
			JSONObject json = new JSONObject(anyJsonString.toString());
			formatDecimals(json);
			xml = XML.toString(json, "root"); // Set root tag
		} catch (Exception e) {
			e.printStackTrace();
		}
		return xml;
	}

	// Method to format json values to 2 decimals places i.e. double in this case;
	// can be refactored for other data types
	static void formatDecimals(JSONObject json) {
		for (String key : json.keySet()) {
			Object value = json.get(key);
			if (value instanceof Double) {
				value = decimalFormat.format(value);
				json.put(key, value);
			}
		}
	}

	static void formatDecimal2(JSONObject json) throws Exception {
		Iterator iterator = json.keys();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			Object value = json.get(key);
			if (value instanceof Double) {
				value = decimalFormat.format(value);
				json.put(key, value);
			}
		}
	}
}
