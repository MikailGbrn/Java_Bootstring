public class switchNew {

	public static void main(String[] args) {
		String day = "M";
		String result = switch (day) {
			case "M", "W", "F" -> "MWF";
			case "T", "TH", "S" -> "TTS";
			case "" -> "Please insert valid day.";
			default -> "Looks like a Sunday";
		};
		System.out.println(result);
	}
}