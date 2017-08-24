package draw;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainCons {
	public static void main(String[] Args) throws IOException{
			Draw d=new Draw("teams.txt");
			System.out.println(d.tmp1); 
	}
}
