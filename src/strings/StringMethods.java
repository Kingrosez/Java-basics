package strings;

import java.util.stream.IntStream;

public class StringMethods {
	public static void main(String[] args) {
		String str = "hello world";
		System.out.println("this is a string: " + str);

		// charAt(): returns the character at the specified index
		// Example: str.charAt(6) => 'w'
		char charAt = str.charAt(6);
		System.out.println("charAt given index is: " + charAt);

		// chars(): returns an IntStream of char values (Unicode code units)
		// Example: 'h', 'e', 'l'... will be printed from the stream
		IntStream chars = str.chars();
		chars.forEach(ch -> System.out.print((char) ch));

		// codePointAt(): returns the Unicode code point at the specified index
		// Example: str.codePointAt(6) => 119 ('w')
		int codePointAt = str.codePointAt(6);
		System.out.println("\nthe given index character unicode is " + codePointAt);

		// codePointBefore(): returns the Unicode code point before the specified index
		// Example: str.codePointBefore(7) => 119 ('w')
		System.out.println("the given index character before character unicode is " + str.codePointBefore(7));

		// codePointCount(): returns the number of Unicode code points in the specified text range
		// Example: str.codePointCount(0, 6) => 6
		System.out.println("Unicode character count from index 0 to 6: " + str.codePointCount(0, 6));

		// codePoints(): returns an IntStream of Unicode code points from the string
		// Example: "A😊B" prints Unicode values and their character equivalents
		String str1 = "A😊B";
		str1.codePoints().forEach(cp -> {
			System.out.println("Code Point: " + cp + " -> " + new String(Character.toChars(cp)));
		});

		// compareTo(): compares two strings lexicographically
		// Returns: 0 if equal, >0 if str > str2, <0 if str < str2
		int compareTo = str.compareTo(str);
		System.out.println(compareTo);

		// compareToIgnoreCase(): compares two strings lexicographically, ignoring case
		// Returns: 0 if equal ignoring case, otherwise a difference
		String a = "Apple";
		String b = "apple";
		String c = "Banana";
		System.out.println(a.compareTo(b));            // case-sensitive compare
		System.out.println(a.compareToIgnoreCase(b));  // case-insensitive compare
		System.out.println(a.compareToIgnoreCase(c));  // "Apple" < "Banana"

		// concat(): joins two strings
		// Returns: concatenated result of two strings
		String concat = str.concat(" " + str1);
		System.out.println(concat);

		// contains(): checks if the string contains a specified sequence
		// Returns: true or false
		boolean contains = str.contains("hello");
		System.out.println(contains);

		// endsWith(): checks if the string ends with the specified suffix
		// Returns: true or false
		System.out.println("Ends with 'world': " + str.endsWith("world"));

		// startsWith(): checks if the string starts with the specified prefix
		// Returns: true or false
		System.out.println("Starts with 'hello': " + str.startsWith("hello"));

		// equals(): checks if two strings are exactly equal (case-sensitive)
		// Returns: true if equal
		System.out.println("Equal to 'hello world': " + str.equals("hello world"));

		// equalsIgnoreCase(): checks if two strings are equal ignoring case
		// Returns: true if equal ignoring case
		System.out.println("Equal ignoring case: " + str.equalsIgnoreCase("HELLO WORLD"));

		// format(): returns a formatted string using placeholders
		// Example: "Welcome, Fairoz!"
		String formatted = String.format("Welcome, %s!", "Fairoz");
		System.out.println(formatted);

		// indexOf(): returns the index of the first occurrence of a character or substring
		// Example: str.indexOf('o') => 4
		System.out.println("Index of 'o': " + str.indexOf('o'));

		// lastIndexOf(): returns the last occurrence index of a character or substring
		// Example: str.lastIndexOf('o') => 7
		System.out.println("Last index of 'o': " + str.lastIndexOf('o'));

		// isEmpty(): checks if the string is empty
		// Returns: true if empty, false otherwise
		System.out.println("Is empty: " + str.isEmpty());

		// length(): returns the length of the string
		// Example: str.length() => 11
		System.out.println("Length: " + str.length());

		// replace(): replaces all occurrences of a substring with another
		// Example: str.replace("world", "Java") => "hello Java"
		System.out.println("Replace 'world' with 'Java': " + str.replace("world", "Java"));

		// split(): splits the string based on a given delimiter and returns an array
		// Example: str.split(" ") => ["hello", "world"]
		String[] words = str.split(" ");
		System.out.println("Split words:");
		for (String word : words) {
			System.out.println(word);
		}

		// substring(): returns a substring between specified indices
		// Example: str.substring(0, 5) => "hello"
		System.out.println("Substring (0 to 5): " + str.substring(0, 5));

		// toLowerCase(): converts all characters to lowercase
		// Example: "HELLO" => "hello"
		System.out.println("Lowercase: " + str.toLowerCase());

		// toUpperCase(): converts all characters to uppercase
		// Example: "hello" => "HELLO"
		System.out.println("Uppercase: " + str.toUpperCase());

		// trim(): removes leading and trailing spaces
		// Example: "  hello  " => "hello"
		String spaced = "  hello world  ";
		System.out.println("Trimmed: '" + spaced.trim() + "'");

		// valueOf(): converts different types (like int) to string
		// Example: String.valueOf(100) => "100"
		int num = 100;
		String numberStr = String.valueOf(num);
		System.out.println("Value of number: " + numberStr);
	}
}
