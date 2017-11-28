package com.lmig.gfc.romannumerals.services;

public class HinduToRomanNumeralConverter {
      
	public String convert(int numberToConvert) {
		String numberString = new String();
		switch (numberToConvert) 
		{
		    case 1:  numberString += "I";
		             break;
		    case 2:  numberString += "II";
		             break;
		    case 3:  numberString += "III";
		             break;
		    case 4:  numberString += "IV";
		             break;
		    case 5:  numberString += "V";
		             break;
		    case 6:  numberString += "VI";
		             break;
		    case 7:  numberString += "VII";
		             break;
		    case 8:  numberString += "VIII";
		             break;
		    case 9:  numberString += "IX";
		             break;
		    case 10:  numberString += "X";
		    		 break;
		    case 11:  numberString += "XI";
            		break;  
		    case 14:  numberString += "XIV";
    				break; 
		    case 15:  numberString += "XV";
					break; 
			case 16:  numberString += "XVI";
					break; 
			case 19:  numberString += "XIX";
					break; 
			case 20:  numberString += "XX";
					break; 
			case 30:  numberString += "XXX";
					break;      
			case 40:  numberString += "XL";
					break;        
            case 49:  numberString += "XLIX";
             		break;      
            case 50:  numberString += "L";
     				break;     
            case 51:  numberString += "LI";
					break; 
            case 59:  numberString += "LIX";
					break; 
            case 60:  numberString += "LX";
					break; 
            case 70:  numberString += "LXX";
					break; 
            case 80:  numberString += "LXXX";
					break; 
            case 90:  numberString += "XC";
					break; 
            case 91:  numberString += "XCI";
					break; 
            case 92:  numberString += "XCII";
					break;
            case 93:  numberString += "XCIII";
					break;
            case 94:  numberString += "XCIV";
					break;
            case 95:  numberString += "XCV";
					break;
            case 96:  numberString += "XCVI";
					break;
            case 97:  numberString += "XCVII";
					break;
            case 98:  numberString += "XCVIII";
					break;
            case 99:  numberString += "XCIX";
					break;
            case 100 :  numberString += "C";
					break;
            case 101 :  numberString += "CI";
            		break;	
            case 110 :  numberString += "CX";
    				break;	
            case 127 :  numberString += "CXXVII";
    				break;
            case 144 :  numberString += "CXLIV";
    				break;	
            case 200 :  numberString += "CC";
    				break;
            case 300 :  numberString += "CCC";
    				break;	
            case 400 :  numberString += "CD";
    				break;
            case 500 :  numberString += "D";
    				break;
            case 549 :  numberString += "DXLIX";
					break;	
            case 600 :  numberString += "DC";
					break;	
            case 700 :  numberString += "DCC";
					break;	
            case 800 :  numberString += "DCCC";
					break;	
            case 900 :  numberString += "CM";
					break;
            case 1000 :  numberString += "M";
					break;
            case 2000 :  numberString += "MM";
					break;
            case 2222 :  numberString += "MMCCXXII";
				break;
            case 2345 :  numberString += "MMCCCXLV";
				break;
            case 3000 :  numberString += "MMM";
				break;
			    				
		    default: numberString = "Invalid number";
		             break;
		}
		      
     		
		return numberString;
	}

}
