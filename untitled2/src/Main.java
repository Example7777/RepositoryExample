import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String output = "";
        output = calc(input);
        System.out.print(output);
    }
    public static String calc(String outcalculation){
        enum Rimskie{I,II,III,IV,V,VI,VII,VIII,IX,X}
        Rimskie[] sym = new Rimskie[2];
        int[] Sym = new int[2];
        String sign = "";
        int signNumber = 1;
        int l = outcalculation.length();
        for (int i=1;i<l;i++){
            String s1 = outcalculation.substring(i,i+1);
            if (s1.equals("+") | s1.equals("-") | s1.equals("*") | s1.equals("/")){
                sign = s1;
                signNumber = i;
            }
        }
        if (outcalculation.substring(0,signNumber).equals("I")){
            Sym[0] = 1;
            sym[0] = Rimskie.I;
        }
        else if (outcalculation.substring(0,signNumber).equals("II")){
            Sym[0] = 2;
            sym[0] = Rimskie.II;
        }
        else if (outcalculation.substring(0,signNumber).equals("III")){
            Sym[0] = 3;
            sym[0] = Rimskie.III;
        }
        else if (outcalculation.substring(0,signNumber).equals("IV")){
            Sym[0] = 4;
            sym[0] = Rimskie.IV;
        }
        else if (outcalculation.substring(0,signNumber).equals("V")){
            Sym[0] = 5;
            sym[0] = Rimskie.V;
        }
        else if (outcalculation.substring(0,signNumber).equals("VI")){
            Sym[0] = 6;
            sym[0] = Rimskie.VI;
        }
        else if (outcalculation.substring(0,signNumber).equals("VII")){
            Sym[0] = 7;
            sym[0] = Rimskie.VII;
        }
        else if (outcalculation.substring(0,signNumber).equals("VIII")){
            Sym[0] = 8;
            sym[0] = Rimskie.VIII;
        }
        else if (outcalculation.substring(0,signNumber).equals("IX")){
            Sym[0] = 9;
            sym[0] = Rimskie.IX;
        }
        else if (outcalculation.substring(0,signNumber).equals("X")){
            Sym[0] = 10;
            sym[0] = Rimskie.X;
        }
        else{
            Sym[0] = Integer.valueOf(outcalculation.substring(0,signNumber));
        }
        if (outcalculation.substring(signNumber+1,l).equals("I")){
            Sym[1] = 1;
            sym[1] = Rimskie.I;
        }
        else if (outcalculation.substring(signNumber+1,l).equals("II")){
            Sym[1] = 2;
            sym[1] = Rimskie.II;
        }
        else if (outcalculation.substring(signNumber+1,l).equals("III")){
            Sym[1] = 3;
            sym[1] = Rimskie.III;
        }
        else if (outcalculation.substring(signNumber+1,l).equals("IV")){
            Sym[1] = 4;
            sym[1] = Rimskie.IV;
        }
        else if (outcalculation.substring(signNumber+1,l).equals("V")){
            Sym[1] = 5;
            sym[1] = Rimskie.V;
        }
        else if (outcalculation.substring(signNumber+1,l).equals("VI")){
            Sym[1] = 6;
            sym[1] = Rimskie.VI;
        }
        else if (outcalculation.substring(signNumber+1,l).equals("VII")){
            Sym[1] = 7;
            sym[1] = Rimskie.VII;
        }
        else if (outcalculation.substring(signNumber+1,l).equals("VIII")){
            Sym[1] = 8;
            sym[1] = Rimskie.VIII;
        }
        else if (outcalculation.substring(signNumber+1,l).equals("IX")){
            Sym[1] = 9;
            sym[1] = Rimskie.IX;
        }
        else if (outcalculation.substring(signNumber+1,l).equals("X")){
            Sym[1] = 10;
            sym[1] = Rimskie.X;
        }
        else{
            Sym[1] = Integer.valueOf(outcalculation.substring(signNumber+1,l));
        }
        switch(sign){
            case "+":
                outcalculation = Integer.toString(Sym[0]+Sym[1]);
                break;
            case "-":
                outcalculation = Integer.toString(Sym[0]-Sym[1]);
                break;
            case "*":
                outcalculation = Integer.toString(Sym[0]*Sym[1]);
                break;
            case "/":
                outcalculation = Integer.toString(Sym[0]/Sym[1]);
                break;
        }
        int calculation = Integer.valueOf(outcalculation);
        if (sym[0]!=null & sym[1]!=null){
            if(calculation<1){
                outcalculation = "rome digits >0";
            }
            if(calculation<4 && calculation>0){
                switch(calculation){
                    case 1:
                        outcalculation = "I";
                        break;
                    case 2:
                        outcalculation = "II";
                        break;
                    case 3:
                        outcalculation = "III";
                        break;                    
                }                    
            }
            int i=9;
            int j=3;
            String r="V";
            while (i<100){                            
                if (calculation<i && calculation>j){
                    if (calculation == (j+1)) {
                        outcalculation = "I" + r;
                    }
                    else if (calculation == (j+2)){
                        outcalculation = r;
                    }
                    else if (calculation == (j+3)) {
                        outcalculation = r + "I";
                    }
                    else if (calculation == (j+4)) {
                        outcalculation = r + "II";
                    }
                    else if (calculation == (j+5)){
                            outcalculation = r+"III";
                    }            
                }
                if (r.equals("V")){
                    r="X";
                }
                else if (r.equals("X")){
                    r="XV";
                }
                else if (r.equals("XV")){
                    r="XX";
                }
                else if (r.equals("XX")){
                    r="XXV";
                }
                else if (r.equals("XXV")){
                    r="XXX";
                }
                else if (r.equals("XXX")){
                    r="XXXV";
                }
                else if (r.equals("XXXV")){
                    r="XL";
                }
                else if (r.equals("XL")){
                    r="XLV";
                }
                else if (r.equals("XLV")){
                    r="L";
                }
                else if (r.equals("L")){
                    r="LV";
                }
                else if (r.equals("LV")){
                    r="LX";
                }
                else if (r.equals("LX")){
                    r="LXV";
                }
                else if (r.equals("LXV")){
                    r="LXX";
                }
                else if (r.equals("LXX")){
                    r="LXXV";
                }
                else if (r.equals("LXXV")){
                    r="LXXX";
                }
                else if (r.equals("LXXX")){
                    r="LXXXV";
                }
                else if (r.equals("LXXXV")){
                    r="XC";
                }
                i=i+5;
                j=j+5;
            }            
            if (calculation == 100){
                outcalculation = "C";
            }    
        }
        else if (sym[0]==null & sym[1]!=null){
            outcalculation = "2 rome or 2 arabic";
        }
        else if (sym[0]!=null & sym[1]==null){
            outcalculation = "2 rome or 2 arabic";
        }
        return outcalculation;
    }
}
