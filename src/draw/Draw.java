package draw;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Draw {
	
	private ArrayList<Team> pot1=new ArrayList<Team>();
	private ArrayList<Team> pot2=new ArrayList<Team>();
	private ArrayList<Team> pot3=new ArrayList<Team>();
	private ArrayList<Team> pot4=new ArrayList<Team>();
	
	public Team tmp2;
	public String tmp1;
	
	private ArrayList<Team> groupA=new ArrayList<Team>();
	private ArrayList<Team> groupB=new ArrayList<Team>();
	private ArrayList<Team> groupC=new ArrayList<Team>();
	private ArrayList<Team> groupD=new ArrayList<Team>();
	private ArrayList<Team> groupE=new ArrayList<Team>();
	private ArrayList<Team> groupF=new ArrayList<Team>();
	private ArrayList<Team> groupG=new ArrayList<Team>();
	private ArrayList<Team> groupH=new ArrayList<Team>();
	
	public Draw(String path) throws IOException {
		File file=new File(path);
		Scanner in=new Scanner(file);
		fillPots(in);
		System.out.println("Team: "+pot1.get(6).getName()+"   Country: "+pot1.get(6).getNation().toString());
	}

	private void fillPots(Scanner in) {

		for (int i = 0; i < 32; i++) {
			if (i < 8) {
				pot1.add(new Team(in.next(), Integer.parseInt(in.next())));
			} else if (i < 16) {
				pot2.add(new Team(in.next(), Integer.parseInt(in.next())));
			} else if (i < 24) {
				pot3.add(new Team(in.next(), Integer.parseInt(in.next())));
			} else if (i < 32) {
				pot4.add(new Team(in.next(), Integer.parseInt(in.next())));
			}
		}
	}
}
