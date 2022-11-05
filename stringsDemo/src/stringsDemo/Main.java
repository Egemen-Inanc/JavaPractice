package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String message ="Weather is nice today.";
		System.out.println(message);
		System.out.println("5.th character:"+message.charAt(4));
		System.out.println(message.concat("Great for a walk in the park!"));
		System.out.println(message.startsWith("W"));
		System.out.println(message.endsWith("."));
		char[] characters = new char[7];
		message.getChars(0, 7, characters, 0);
		System.out.println(characters);
		System.out.println(message.indexOf("is"));
		System.out.println(message.lastIndexOf("a"));
		String newMessage = message.replace(' ','-');
		System.out.println(newMessage);
		for(String word:message.split(" "))
		{
			System.out.println(word);
		}
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		
	}

}
