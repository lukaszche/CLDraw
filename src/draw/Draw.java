package draw;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Draw {
	
	Team [] pot1;
	Team [] pot2;
	Team [] pot3;
	Team [] pot4;
	
	String tmp1;
	
	ArrayList<Team> groupA=new ArrayList<Team>();
	ArrayList<Team> groupB=new ArrayList<Team>();
	ArrayList<Team> groupC=new ArrayList<Team>();
	ArrayList<Team> groupD=new ArrayList<Team>();
	ArrayList<Team> groupE=new ArrayList<Team>();
	ArrayList<Team> groupF=new ArrayList<Team>();
	ArrayList<Team> groupG=new ArrayList<Team>();
	ArrayList<Team> groupH=new ArrayList<Team>();
	
	public Draw(String path) throws FileNotFoundException {
		File file=new File(path);
		Scanner in=new Scanner(file);
		tmp1=in.nextLine();
	}
	
}
