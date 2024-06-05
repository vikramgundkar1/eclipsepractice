package sample;

public class JasonToExcel {
	
	
	
	
	public static void main(String[] args) {
		String jasonData="{\r\n"
				+ "  \"employees\": [\r\n"
				+ "    {\r\n"
				+ "      \"firstName\": \"John\",\r\n"
				+ "      \"lastName\": \"Doe\",\r\n"
				+ "      \"age\": 30,\r\n"
				+ "      \"position\": \"Software Engineer\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"firstName\": \"Anna\",\r\n"
				+ "      \"lastName\": \"Smith\",\r\n"
				+ "      \"age\": 35,\r\n"
				+ "      \"position\": \"Project Manager\"\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}";
		
		
		//ObjectMapper objectMapper = new ObjectMapper();
		
        Workbook workbook = new XSSFWorkbook();
		
		
	}

}
