public class switchJava {

	public static void main(String[] args) {
		String result = "";
		String day = "M";
		switch (day) {
			case "M":
			case "W":
			case "F": {
				result = "MWF";
				break;
			}
			case "T":
			case "TH":
			case "S": {
				result = "TTS";
				break;
			}
		}
		;
		System.out.println("Old Switch Results:");
		System.out.println(result);
	}

}