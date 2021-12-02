import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
class LCM{
public static void main(String args[]){
  System.out.println("I completely fried my brain trying to make this,\nyou can check the code to see what i mean.\nSo... please give a star...");
while(true){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number:");
int N = sc.nextInt();
System.out.println("Enter the second number:");
int M = sc.nextInt();
int m1=M;
int n1=N;
int compare = 0;
int Compare = 0;
int LCM = 1;
int duplicate = 0; 

ArrayList<Integer> factorsN = new ArrayList<Integer>();
ArrayList<Integer> factorsM = new ArrayList<Integer>();
ArrayList<Integer> lcm = new ArrayList<Integer>();
ArrayList<Integer> countN = new ArrayList<Integer>();
ArrayList<Integer> countM = new ArrayList<Integer>();
ArrayList<Integer> FactorN = new ArrayList<Integer>();
ArrayList<Integer> FactorM = new ArrayList<Integer>();

for(int i = 2; i<=n1; i++){if(n1%i==0){factorsN.add(i);
n1=n1/i;i=1;}}

for(int j = 2; j<=m1; j++){if(m1%j==0){factorsM.add(j);m1=m1/j;j=1;}}

factorsN.add(1);
factorsM.add(1);

for(int r=0; r<factorsN.size()-1; r++){if(factorsN.get(r)==factorsN.get(r+1))
{duplicate = duplicate + 1;}
else if(factorsN.get(r)!=factorsN.get(r+1)){countN.add(duplicate+1);duplicate =0;
FactorN.add(factorsN.get(r));
FactorN.add(factorsN.get(r+1));}}

duplicate =0;

for(int s=0; s<factorsM.size()-1; s++){if(factorsM.get(s)==factorsM.get(s+1)){duplicate = duplicate + 1;}
else if(factorsM.get(s)!=factorsM.get(s+1)){countM.add(duplicate+1);duplicate =0;
FactorM.add(factorsM.get(s));
FactorM.add(factorsM.get(s+1));}}

for(int t=0; t<FactorM.size()-1; t++){if(FactorM.get(t)==FactorM.get(t+1)){FactorM.remove(FactorM.get(t));}}

for(int u=0; u<FactorN.size()-1; u++){if(FactorN.get(u)==FactorN.get(u+1)){FactorN.remove(FactorN.get(u));}}

FactorN.remove(FactorN.get(FactorN.size()-1));
FactorM.remove(FactorM.get(FactorM.size()-1));

int[][] mapN = new int[countN.size()][2];
for(int v = 0; v<countN.size(); v++)
{mapN[v][0]=FactorN.get(v);
mapN[v][1]=countN.get(v);}

int[][] mapM = new int[countM.size()][2];
for(int w = 0; w<countM.size(); w++)
{mapM[w][0]=FactorM.get(w);
mapM[w][1]=countM.get(w);}

if(countM.size()>countN.size()){Compare = countM.size();}
else{Compare =countN.size();}

for(int x = 0; x<countN.size(); x++){
for(int y = 0; y<countM.size(); y++){
if(mapN[x][0]==mapM[y][0] & mapN[x][1]>mapM[y][1]){int convert1 = (int) Math.pow(mapN[x][0],mapN[x][1]);
lcm.add(convert1);}
else if(mapN[x][0]==mapM[y][0] & mapN[x][1]<=mapM[y][1]){int convert2 = (int) Math.pow(mapM[y][0],mapM[y][1]);
lcm.add(convert2);}}}

if(M>N){compare = M;}
else{compare =N;}
for(int k = 2; k<=compare; k++){if(!factorsN.contains(k) & factorsM.contains(k)){lcm.add(k);}
else if(factorsN.contains(k) & !factorsM.contains(k)){lcm.add(k);}
}

for(int m = 0; m<lcm.size(); m++)
{LCM = LCM * lcm.get(m);}
System.out.println("The LCM is: " + LCM);
}
}
}
