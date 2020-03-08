import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;
public class cpt {
static int count=2;
static int i;
static int a;
static int row=0;
static int column=0;
static String num="";
static String player="";
static String turn="";
static String name1="";
static String name2="";
static String mode="";
static String level="";
static String n="";
static String[][]tictactoe= {{" "," "," "},
                             {" "," "," "},
                             {" "," "," "}
          }; 
public static void table(int row,int column,String num) {
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
	e.printStackTrace();
}
if(mode.equals("single")&&turn.equals("two")) {
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
tictactoe[row-1][column-1]=num;
System.out.println("             ↓COLUMN↓");
System.out.println("          1     2     3  ");
System.out.println("  →  1    "+tictactoe[0][0]+"  |  "+tictactoe[0][1]+"  |  "+tictactoe[0][2]+"");
System.out.println("  R      -----------------");
System.out.println("  O  2    "+tictactoe[1][0]+"  |  "+tictactoe[1][1]+"  |  "+tictactoe[1][2]+"");
System.out.println("  W      -----------------");
System.out.println("  →  3    "+tictactoe[2][0]+"  |  "+tictactoe[2][1]+"  |  "+tictactoe[2][2]+"");
System.out.println("");
}
public static void wincheck() {
 for(i=0;i<3;i++) {
      if(tictactoe[i][0].equals("X")&&tictactoe[i][1].equals("X")&&tictactoe[i][2].equals("X")){
       count=-1;
      }
      if(tictactoe[i][0].equals("O")&&tictactoe[i][1].equals("O")&&tictactoe[i][2].equals("O")){
       count=-1;
      }
  }
  i=0;
 for(i=0;i<3;i++) {
   if(tictactoe[0][i].equals("X")&&tictactoe[1][i].equals("X")&&tictactoe[2][i].equals("X")){
   count=-1;
   }
   if(tictactoe[0][i].equals("O")&&tictactoe[1][i].equals("O")&&tictactoe[2][i].equals("O")){
   count=-1;
   }
  }
  i=0;
  if(tictactoe[0][0].equals("X")&&tictactoe[1][1].equals("X")&&tictactoe[2][2].equals("X")){
  count=-1;
  }
  if(tictactoe[0][0].equals("O")&&tictactoe[1][1].equals("O")&&tictactoe[2][2].equals("O")){
    count=-1;
       }
        if(tictactoe[2][0].equals("X")&&tictactoe[1][1].equals("X")&&tictactoe[0][2].equals("X")){
         count=-1;
        }
        if(tictactoe[2][0].equals("O")&&tictactoe[1][1].equals("O")&&tictactoe[0][2].equals("O")){
         count=-1;
  } 
}
public static void positoncheck() {
	 if(tictactoe[row-1][column-1].equals("X")||tictactoe[row-1][column-1].equals("O")) {
	  System.out.println("invalid spot!");
	  System.out.println("player "+player+" try again");
	  if(tictactoe[row-1][column-1].equals("O")&&turn.equals("one")) {
	    num="O";
	  }
	  else if(tictactoe[row-1][column-1].equals("X")&&turn.equals("two")) {
	    num="X";
	   }

	   count--;
	  } 
	}
public static void ai(String n) {
	if(mode.equals("single")&&turn.equals("two")) {
		//:.   .=X/O
		if(tictactoe[1][0].equals(n)&&tictactoe[2][1].equals(n)&&(tictactoe[2][0].equals(" "))){
			row=3;
			column=1;
		}
		if(tictactoe[0][1].equals(n)&&tictactoe[1][2].equals(n)&&(tictactoe[0][2].equals(" "))){
			row=1;
			column=3;
		}
		if(tictactoe[1][0].equals(n)&&tictactoe[0][1].equals(n)&&(tictactoe[0][0].equals(" "))){
			row=1;
			column=1;
		}
		if(tictactoe[2][1].equals(n)&&tictactoe[1][2].equals(n)&&(tictactoe[2][2].equals(" "))){
			row=3;
			column=3;
		}
for(a=0;a<3;a++){
		if(tictactoe[a][0].equals(n)&&tictactoe[a][1].equals(n)&&(tictactoe[a][2].equals(" "))){
			row=a+1;
			column=3;
		}
	}
a=0;
for(a=0;a<3;a++){
		if(tictactoe[a][1].equals(n)&&tictactoe[a][2].equals(n)&&(tictactoe[a][0].equals(" "))){
			row=a+1;
			column=1;
		}
	}
a=0;
for(a=0;a<3;a++){
	if(tictactoe[0][a].equals(n)&&tictactoe[1][a].equals(n)&&(tictactoe[2][a].equals(" "))){
		row=3;
		column=a+1;
	}
}
a=0;
for(a=0;a<3;a++){
	if(tictactoe[1][a].equals(n)&&tictactoe[2][a].equals(n)&&(tictactoe[0][a].equals(" "))){
		row=1;
		column=a+1;
	}
}
a=0;
//********** X|     |X********
for(a=0;a<3;a++){
	if(tictactoe[a][0].equals(n)&&tictactoe[a][2].equals(n)&&(tictactoe[a][1].equals(" "))){
		row=a+1;
		column=2;
	}
}
a=0;
for(a=0;a<3;a++){
	if(tictactoe[0][a].equals(n)&&tictactoe[2][a].equals(n)&&(tictactoe[1][a].equals(" "))){
		row=2;
		column=a+1;
	}
}
a=0;
if(tictactoe[0][0].equals(n)&&tictactoe[1][1].equals(n)&&(tictactoe[2][2].equals(" "))){
	row=3;
	column=3;
}
if(tictactoe[2][2].equals(n)&&tictactoe[1][1].equals(n)&&(tictactoe[0][0].equals(" "))){
	row=1;
	column=1;
}
if(tictactoe[2][0].equals(n)&&tictactoe[1][1].equals(n)&&(tictactoe[0][2].equals(" "))){
	row=1;
	column=3;
}
if(tictactoe[0][2].equals(n)&&tictactoe[1][1].equals(n)&&(tictactoe[2][0].equals(" "))){
	row=3;
	column=1;
}
////opposite corners 
if(tictactoe[0][0].equals(n)&&tictactoe[2][2].equals(n)&&(tictactoe[1][1].equals(" "))){
	row=2;
	column=2;
}
if(tictactoe[2][0].equals(n)&&tictactoe[0][2].equals(n)&&(tictactoe[1][1].equals(" "))){
	row=2;
	column=2;
}
}
}
//********************************************************************************
public static void main(String[] args) {
Scanner sc= new Scanner( System.in ); 
Random rand = new Random();
String level="";
String winner="";
String choice="";
int rd=0;
String player1="";
String player2="";
System.out.println("WELCOME TO TICTACTOE");
System.out.println();
table(1,1," ");
//incorrect user input avoidance>>>
while(!(mode.equals("single"))&&!(mode.equals("double"))){
System.out.println("Do you want to play single or double player(SINGLE/DOUBLE));");
mode=sc.nextLine().toLowerCase();
if (!(mode.equals("single"))&&!(mode.equals("double"))){
	System.out.println("***invalid mode***");
}
System.out.println();
}
if(mode.equals("double")) {
	System.out.println("Enter the name of player one:");
	player1=sc.nextLine();
    System.out.println("Enter the name of player two:");
    player2=sc.nextLine();
    while(!(choice.equals("yes"))&&!(choice.equals("no"))) {
	System.out.println("Do you want to randomly choose who goes first ");
	choice=sc.nextLine().toLowerCase();
	name1=player1;
	name2=player2;
}
}
if(choice.equals("yes")) {
	rd=rand.nextInt(2) + 1;
	if(rd==1){
   name1=player2;
   name2=player1;
	}
}
if(mode.equals("single")) {
while(!(level.equals("easy"))&&!(level.equals("hard"))&&!(level.equals("medium"))){
 System.out.println("Choose a level[easy/medium/hard(impossible to win mode)]");
 level=sc.nextLine().toLowerCase();
 if(!(level.equals("easy"))&&!(level.equals("hard"))&&!(level.equals("medium"))) {
 System.out.println("***invalid level***");
 }
 System.out.println();
 }
}
table(1,1," ");
////<<<incorrect user input avoidance 
do {
//player turn>>>
if(count%2==0) {
 turn="one";
 player=name1;
 num="X";
}
if(count%2==1) {
 turn="two";
    num="O";
    player=name2;
    do {
    row= rand.nextInt(3) + 1;
    column= rand.nextInt(3) + 1;
    }
    while(tictactoe[row-1][column-1].equals("X")||tictactoe[row-1][column-1].equals("O"));  
    
    System.out.println(count);
    if (mode.equals("single")) { 
    System.out.println("computers turn>>>");
    //computer AI>>>
    if(level.equals("hard")&&count==3&&tictactoe[1][1].equals(" ")) {
       row=2;
       column=2;
    }
    if(level.equals("hard")&&count==3&&tictactoe[1][1].equals("X")&&tictactoe[2][2].equals(" ")) {
        row=3;
        column=3;
     }
    else if(tictactoe[0][0].equals("X")&&tictactoe[2][2].equals("X")&&count==5 && tictactoe[2][1].equals(" ")||tictactoe[0][2].equals("X")&&tictactoe[2][0].equals("X")&&count==5&&tictactoe[2][1].equals(" ")) {
   row=3;
   column=2;
    }
    else if (count==7&&tictactoe[0][0].equals("X")&&tictactoe[0][2].equals(" ")) {
    row=1;
    column=3;
    }
    
    else if (count==7&&tictactoe[0][2].equals("X")&&tictactoe[0][0].equals(" ")){
      row=1;
      column=1;
    }
      else if(count==9&&tictactoe[0][0].equals("X")&&tictactoe[1][0].equals(" ")){
      row=2;
     column=1;
    }
     else if(count==9&&tictactoe[0][2].equals("X")&&tictactoe[1][2].equals(" ")){
      row=2;
     column=3;
    }
if (level.equals("medium")||level.equals("hard")) {
ai("X");
ai("O");
}
//<<<player turn
}
}

//player input>>>
if (mode.equals("double")) {
System.out.println(""+player+"'s turn>>>");
System.out.println("");
System.out.println(""+player +": enter the ROW");
 row=sc.nextInt();
System.out.println(""+ player+": enter the COLUMN");
 column=sc.nextInt();
}
if (mode.equals("single")&& turn.equals("one")) {
 System.out.println("your turn now>>>");
 System.out.println("enter the ROW:");
  row=sc.nextInt();
 System.out.println("enter the COLUMN:");
  column=sc.nextInt(); 
}

//<<<player input
 //used to avoid invalid positions>>
positoncheck();
//<<<used to avoid invalid positions
//prints new position>>>
table(row,column,num);
//<<<<prints new position
count++;//counting loop 
//checks for win>>>
wincheck(); 
//<<<checks for win       
} 
while(count>0 && count<=10);{
 if(count<0) {
	 if(mode.equals("single")&&turn.equals("one")){
		 winner="you";
		 }
	 else if(mode.equals("single")&&turn.equals("two")) {
		 winner="the computer";
		 
	 }
	 else {
		 winner= player;
	 }
 System.out.println("The game is over, "+winner.toUpperCase()+" won!");
 }
 else{
 System.out.println("CATS GAME!");
 }
} 
}
}