package org.jschool;


public class Converter {
    public static void main(String[] args) {
		double n = 36.6;
		showTemp(n,"Celsium");
        showTemp(n,"Fahrenheit");
        showTemp(n,"Kalvin");
        showTemp(n,"Rankin");
        showTemp(n,"Delisle");
        showTemp(n,"Newton");
        showTemp(n,"Romer");
        }

    public static double getTemp(double c,String s) {
        switch (s) {
            case "Fahrenheit": return c * 9/5 + 32;
            case "Kalvin": return c + 273.15;
            case "Rankin": return getTemp(c,"Kalvin")*9/5;
            case "Delisle": return (100 - c)*3/2;
            case "Newton": return c*0.33;
            case "Reaumur": return c*4/5;
            case "Romer": return c*21/40 + 7.5;
            case "Celsium": return c*1;
            default: return c;
        }
    }

    public static void showTemp(double n,String s) {
        System.out.printf("%.2f "+s+"%n",getTemp(n,s));
    }
}

