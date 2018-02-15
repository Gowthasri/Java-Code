package com.gowthasri;

public class overloading {
    public static void main(String[] args){
        clacFeetAndInchesToCentimeteres(6,0);
        clacFeetAndInchesToCentimeteres(100);

    }
    public static int clacFeetAndInchesToCentimeteres(double feet, double inches){
        if(feet>=0&&(inches>=0 && inches<=12)){
           double totalCentimeters=((feet*12)*2.54)+ inches*2.54;
            System.out.println("totalCentimeters here is "+ totalCentimeters);
        }
       return -1;
    }
    public static int clacFeetAndInchesToCentimeteres(double inches){
        if(inches>=0){
            double feets= inches/12;
            double inchess=inches%12;
            clacFeetAndInchesToCentimeteres(feets,inchess);
            System.out.println("Given " + inches +" centimeters are " + feets +" feet and " + inchess +" inches" );
        }
        return -1;
    }

}
