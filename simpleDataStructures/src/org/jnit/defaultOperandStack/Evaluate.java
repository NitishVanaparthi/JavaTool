/*
 * package org.jnit.defaultOperandStack;
 * 
 * import java.util.*;
 * 
 * public class Evaluate { public final static int MAXCOLS = 80;
 * 
 * public static void main(String[] args) { // Making using of operand stack
 * which is a sub class of Vector class of // java.util package
 * 
 * String instring, poststring; System.out.println("Enter an infix string: ");
 * instring = readString(); System.out.println(
 * "the original infix expression is" + instring); poststring =
 * postfix(instring); System.out.println("Instring it is" + poststring);
 * System.out.println("its value is" + eval(poststring));
 * 
 * }
 * 
 * public static String postfix(String infix) { int position, outpos = 0; char
 * symb, topsymb = '+'; boolean wasEmpty = true; char[] postr = new
 * char[MAXCOLS]; Stack opstk = new Stack(); for (position = 0; position <
 * infix.length(); position++) { symb = infix.charAt(position); if
 * (isOperand(symb)) postr[outpos++] = symb; else { if (!opstk.empty()) {
 * wasEmpty = false; topsymb = ((Character) opstk.pop()).charValue();
 * 
 * } else wasEmpty = true; while(!wasEmpty&&precedence(topsymb, symb)){
 * postr[outpos++] = topsymb; if(!opstk.empty()){ wasEmpty =false;
 * topsymb=((Character) opstk.pop()).charValue();
 * 
 * } else wasEmpty = true; } if(!wasEmpty){ Character item = new
 * Character(topsymb); opstk.push(item); } if(wasEmpty || (symb!=')')){
 * Character item = new Character(symb); opstk.push(item); } else topsymb =
 * ((Character) opstk.pop()).charValue();
 * 
 * } } while(!opstk.empty()){ postr[outpos++] = ((Character)
 * opstk.pop()).charValue(); } return String.copyValueOf(postr, 0, outpos); }
 * public static double eval(String expr){ char c; int position; double opnd1,
 * opnd2; Stack opndstk = new Stack(); for(position = 0; position<expr.length();
 * position++){ c=expr.charAt(position); if(Character.isDigit(c)){ Double value=
 * new Double((double)Character.digit(c, 10)); opndstk.push(value); } else{
 * opnd2=((Double) opndstk.pop()).doubleValue(); opnd1 = ((Double)
 * opndstk.pop()).doubleValue(); Double value = new Double(oper(c, opnd1,
 * opnd2)); opndstk.push(value); } return ((Double)
 * opndstk.pop()).doubleValue(); } public static String readString()throws
 * IOException{ public static boolean isOperand(char symb){ public static
 * boolean precdence(char op1, op2){ public static double oper(char symb, double
 * op1, double op2){
 * 
 * } } } } }
 * 
 * }
 */