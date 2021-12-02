import java.util.Scanner;
public class Checkers
{
    public static void main(String[] args) {
String[][] gameboard = {{"│ ○ ","│ ○ ","│ ○ ","│ ○ ","│ ○ ","│ ○ ","│ ○ ","│ ○ ","│\n",
 "---------------------------------","\n"},
{"│ ○ ","│ ○ ","│ ○ ","│ ○ ","│ ○ ","│ ○ ","│ ○ ","│ ○ ","│\n",
"---------------------------------","\n"},
{"│   ","│   ","│   ","│   ","│   ","│   ","│   ","│   ","│\n",
 "---------------------------------","\n"},
{"│   ","│   ","│   ","│   ","│   ","│   ","│   ","│   ","│\n",
 "---------------------------------","\n"} ,
{"│   ","│   ","│   ","│   ","│   ","│   ","│   ","│   ","│\n",
 "---------------------------------","\n"},
{"│   ","│   ","│   ","│   ","│   ","│   ","│   ","│   ","│\n",
 "---------------------------------","\n"},
{"│ • ","│ • ","│ • ","│ • ","│ • ","│ • ","│ • ","│ • ","│\n",
 "---------------------------------","\n"},
{"│ • ","│ • ","│ • ","│ • ","│ • ","│ • ","│ • ","│ • ","│\n",
 "---------------------------------","\n"}
};

boolean P1TurnChecker = true;
 
while(true){
for(int i = 0; i<gameboard.length; i++)
    {for(int j = 0; j<gameboard[0].length; j++)
        {System.out.print(gameboard[i][j]);}};

Scanner scan = new Scanner(System.in);
int Prow = scan.nextInt()-1;
int Pcol = scan.nextInt()-1;

if(gameboard[Prow][Pcol] == "│ • " & P1TurnChecker == true){gameboard[Prow][Pcol] = "│ ◘ "; P1TurnChecker = false;}
else if(gameboard[Prow][Pcol] == "│ ○ " & P1TurnChecker == false){gameboard[Prow][Pcol] = "│ ◙ "; P1TurnChecker = true;}

for(int i = 0; i<gameboard.length; i++)
    {for(int j = 0; j<gameboard[0].length; j++)
        {System.out.print(gameboard[i][j]);}};

char move = scan.next().charAt(0);

//• ◘ ◙ ○  right up = -10 left up = -12 right down = +12 left down = +10

String MoveInput = "duh...";
String MoveInput2 = "meh...";
String selected = gameboard[Prow][Pcol];
int Prowi = 0;
int Prowi2 =0;
int Pcoli = 0;
int Pcoli2 = 0;

if(gameboard[Prow][Pcol] == "│ ◘ "){MoveInput = "│ • "; MoveInput2 = "│ ○ ";}
else if(gameboard[Prow][Pcol] == "│ ◙ "){MoveInput = "│ ○ "; MoveInput2 = "│ • ";}

if(move == 'L' & gameboard[Prow][Pcol] == "│ ◘ "){Prowi = Prow-1; Prowi2 = Prow-2; Pcoli = Pcol-1; Pcoli2 = Pcol-2;}
else if(move == 'R' & gameboard[Prow][Pcol] == "│ ◘ "){Prowi = Prow-1; Prowi2 = Prow-2; Pcoli = Pcol+1; Pcoli2 = Pcol+2;}
else if(move == 'L' & gameboard[Prow][Pcol] == "│ ◙ "){Prowi = Prow+1; Prowi2 = Prow+2; Pcoli = Pcol-1; Pcoli2 = Pcol-2;}
else if(move == 'R' & gameboard[Prow][Pcol] == "│ ◙ "){Prowi = Prow+1; Prowi2 = Prow+2; Pcoli = Pcol+1; Pcoli2 = Pcol+2;}

 
switch(selected){
     case "│ ◘ " : if(gameboard[Prowi][Pcoli] == "│   "){gameboard[Prow][Pcol] = "│   " ; gameboard[Prowi][Pcoli] = MoveInput;}
                                              else if(gameboard[Prowi][Pcoli] == MoveInput2 & gameboard[Prowi2][Pcoli2] == "│   "){gameboard[Prow][Pcol] = "│   " ; gameboard[Prowi][Pcoli] = "│   "; gameboard[Prowi2][Pcoli2] = MoveInput;}
                                              else{System.out.println("Invalid move");}break;
     case "│ ◙ " : if(gameboard[Prowi][Pcoli] == "│   "){gameboard[Prow][Pcol] = "│   " ; gameboard[Prowi][Pcoli] = MoveInput;}
                                              else if(gameboard[Prowi][Pcoli] == MoveInput2 & gameboard[Prowi2][Pcoli2] == "│   "){gameboard[Prow][Pcol] = "│   " ; gameboard[Prowi][Pcoli] = "│   "; gameboard[Prowi2][Pcoli2] = MoveInput;}
                                              else{System.out.println("Invalid move");}break;}

System.out.println();
    }
}
}
