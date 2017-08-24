package draw;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class Draw {
	
	private ArrayList<Team> pot1=new ArrayList<Team>();
	private ArrayList<Team> pot2=new ArrayList<Team>();
	private ArrayList<Team> pot3=new ArrayList<Team>();
	private ArrayList<Team> pot4=new ArrayList<Team>();
	
	private ArrayList<Integer> balls=new ArrayList<Integer>();
	
	public Team tmp2;
	public String tmp1;
	
	private ArrayList<Group> groups=new ArrayList<Group>();
	
	
	public Draw(String path) throws IOException {
		File file=new File(path);
		Scanner in=new Scanner(file);
		fillPots(in);
		setGroups();
		
		fillBalls();
		drawPot1();
		fillBalls();
		drawPot2();
		fillBalls();
		drawPot3();
		fillBalls();
		drawPot4();
		
		
		
		//System.out.println("Team: "+pot1.get(6).getName()+"   Country: "+pot1.get(6).getNation().toString());
	}

	public void getGroupsConsole(){
		for(int i=0;i<groups.size();i++){
			System.out.println(groups.get(i).getName());
			for (int j=0;j<4;j++){
				if(groups.get(i).getTeam(j)!=null)
					System.out.println(groups.get(i).getTeam(j).getName());
				else
					System.out.println("To be drawn.");
			}
			

			System.out.println("-----------------------");
		}
	}
	
	
	public void drawPot1(){
		Random rand=new Random();
		int n,b;
		for(int i=0;i<8;i++){
			
			n=rand.nextInt(pot1.size());
			b=rand.nextInt(balls.size());
			
			groups.get(balls.get(b)).setTeam(0, pot1.get(n));
			
			pot1.remove(n);
			balls.remove(b);
		}
	}
	
	public void drawPot2(){
		Random rand=new Random();
		int n,b;
		for(int i=0;i<8;i++){
			
			n=rand.nextInt(pot2.size());
			b=rand.nextInt(balls.size());
			
			groups.get(balls.get(b)).setTeam(1, pot2.get(n));
			
			pot2.remove(n);
			balls.remove(b);
		}
	}
	
	public void drawPot3(){
		Random rand=new Random();
		int n,b;
		for(int i=0;i<8;i++){
			
			n=rand.nextInt(pot3.size());
			b=rand.nextInt(balls.size());
			
			groups.get(balls.get(b)).setTeam(2, pot3.get(n));
			
			pot3.remove(n);
			balls.remove(b);
		}
	}
	
	public void drawPot4(){
		Random rand=new Random();
		int n,b;
		for(int i=0;i<8;i++){
			
			n=rand.nextInt(pot4.size());
			b=rand.nextInt(balls.size());
			
			groups.get(balls.get(b)).setTeam(3, pot4.get(n));
			
			pot4.remove(n);
			balls.remove(b);
		}
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
	
	private void fillBalls(){
		for (int i = 0; i < 8; i++){
			balls.add(i);
		}
	}
	
	private void setGroups(){
		groups.add(new Group("A"));
		groups.add(new Group("B"));
		groups.add(new Group("C"));
		groups.add(new Group("D"));
		groups.add(new Group("E"));
		groups.add(new Group("F"));
		groups.add(new Group("G"));
		groups.add(new Group("H"));	
	}
	
}
