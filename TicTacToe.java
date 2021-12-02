
import java.util.Scanner;
import java.util.Random;
public class TicTacToe {
    public static void main(String args[]) {
      char[] board = {' ','|',' ','|',' ','\n',
    '-','+','-','+','-','\n',
    ' ','|',' ','|',' ','\n',
    '-','+','-','+','-','\n',
    ' ','|',' ','|',' ','\n'};
    System.out.print(board);

String failsafe = "alpha";
    
while(true){

if(failsafe != "omega"){

Scanner scan = new Scanner(System.in);
    int input = scan.nextInt();
    int p1 = -1;
    if(input<=9){p1 = input;}
    else{System.out.println("Wrong input");
    failsafe = "delta";}
    System.out.println(p1);

    switch (p1) {
          case 1 : if(board[0] == ' '){board[0]='X';
                        failsafe = "alpha";}
                        else{ System.out.println("Place taken"); failsafe = "delta";}
    break;
          case 2 : if(board[2] == ' '){board[2]='X';
                        failsafe = "alpha";}
                        else{ System.out.println("Place taken"); failsafe = "delta";}
    break;
          case 3 : if(board[4] == ' '){board[4]='X';
                        failsafe = "alpha";}
                        else{ System.out.println("Place taken"); failsafe = "delta";}
    break;
          case 4 : if(board[12] == ' '){board[12]='X';
                        failsafe = "alpha";}
                        else{ System.out.println("Place taken"); failsafe = "delta";}
    break;
          case 5 : if(board[14] == ' '){board[14]='X';
                        failsafe = "alpha";}
                        else{ System.out.println("Place taken"); failsafe = "delta";}
    break;
          case 6 : if(board[16] == ' '){board[16]='X';
                        failsafe = "alpha";}
                        else{ System.out.println("Place taken"); failsafe = "delta";}
    break;
          case 7 : if(board[24] == ' '){board[24]='X';
                        failsafe = "alpha";}
                        else{ System.out.println("Place taken"); failsafe = "delta";}
    break;
          case 8 : if(board[26] == ' '){board[26]='X';
                        failsafe = "alpha";}
                        else{ System.out.println("Place taken"); failsafe = "delta";}
    break;
          case 9 : if(board[28] == ' '){board[28]='X';
                        failsafe = "alpha";}
                        else{ System.out.println("Place taken"); failsafe = "delta";}
    break;
}
    System.out.println(board);
}

if(failsafe != "delta"){

Random rand = new Random();
    int cpuinput = rand.nextInt(9)+1;
    int cpu = -1;
    if(cpu<=9){cpu = cpuinput;
   }
    System.out.println(cpu);

switch (cpu) {
          case 1 : if(board[0] == ' '){board[0]='O';
                         failsafe = "alpha";}
                        else{failsafe = "omega";}
    break;
          case 2 : if(board[2] == ' '){board[2]='O';
                         failsafe = "alpha";}
                        else{failsafe = "omega";}
    break;
          case 3 : if(board[4] == ' '){board[4]='O';
                         failsafe = "alpha";}
                        else{failsafe = "omega";}
    break;
          case 4 : if(board[12] == ' '){board[12]='O';
                         failsafe = "alpha";}
                        else{failsafe = "omega";}
    break;
          case 5 : if(board[14] == ' '){board[14]='O';
                         failsafe = "alpha";}
                        else{failsafe = "omega";}
    break;
          case 6 : if(board[16] == ' '){board[16]='O';
                         failsafe = "alpha";}
                        else{failsafe = "omega";}
    break;
          case 7 : if(board[24] == ' '){board[24]='O';
                         failsafe = "alpha";}
                        else{failsafe = "omega";}
    break;
          case 8 : if(board[26] == ' '){board[26]='O';
                         failsafe = "alpha";}
                        else{failsafe = "omega";}
    break;
          case 9 : if(board[28] == ' '){board[28]='O';
                         failsafe = "alpha";}
                        else{failsafe = "omega";}
    break;
}
    
    System.out.println(board);}

if(board[0] == 'O' & board[2] == 'O' & board[4] == 'O')
{System.out.println("Cpu win");break;}
else if(board[12] == 'O' & board[14] == 'O' & board[16] == 'O')
{System.out.println("Cpu win");break;}
else if(board[24] == 'O' & board[26] == 'O' & board[28] == 'O')
{System.out.println("Cpu win");break;}
else if(board[2] == 'O' & board[14] == 'O' & board[26] == 'O')
{System.out.println("Cpu win");break;}
else if(board[0] == 'O' & board[12] == 'O' & board[24] == 'O')
{System.out.println("Cpu win");break;}
else if(board[4] == 'O' & board[16] == 'O' & board[28] == 'O')
{System.out.println("Cpu win");break;}
else if(board[0] == 'O' & board[14] == 'O' & board[28] == 'O')
{System.out.println("Cpu win");break;}
else if(board[4] == 'O' & board[14] == 'O' & board[24] == 'O')
{System.out.println("Cpu win");break;}

if(board[0] == 'X' & board[2] == 'X' & board[4] == 'X')
{System.out.println("P1 win");break;}
else if(board[12] == 'X' & board[14] == 'X' & board[16] == 'X')
{System.out.println("P1 win");break;}
else if(board[24] == 'X' & board[26] == 'X' & board[28] == 'X')
{System.out.println("P1 win");break;}
else if(board[2] == 'X' & board[14] == 'X' & board[26] == 'X')
{System.out.println("P1 win");break;}
else if(board[0] == 'X' & board[12] == 'X' & board[24] == 'X')
{System.out.println("P1 win");break;}
else if(board[4] == 'X' & board[16] == 'X' & board[28] == 'X')
{System.out.println("P1 win");break;}
else if(board[0] == 'X' & board[14] == 'X' & board[28] == 'X')
{System.out.println("P1 win");break;}
else if(board[4] == 'X' & board[14] == 'X' & board[24] == 'X')
{System.out.println("P1 win");break;}
}
}
}
