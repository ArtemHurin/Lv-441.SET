package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloName {

	public static void main(String[] args) throws IOException {

		String name;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input your name");

		name = br.readLine();

		System.out.println("Hello " + name + "!");

	}

}
