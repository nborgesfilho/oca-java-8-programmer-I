package book.oca.se.chapter.two;

public class Operators {

	public static void main(String args[]){
		
		/*
		 * operators
		 * 
		 * post-unary                     : expression++, expression--
		 * pre-unary                      : ++expression, --expression
		 * others unary                   : +, -, !
		 * 
		 * Multiplicate/Division/Modulus  : *,/,%
		 * Addition/Subtraction           : +,-
		 * Shift Operators                : <<,>>,>>>
		 * Relational Operators           : <=, >=, <, >, instanceof
		 * Equal to, not Equal to         : ==, !=
		 * Logical Operators              : |,&,^
		 * Short-circuit logical operators: ||, &&
		 * Ternary operator               : expression ? expression1 : expression2
		 * Assignments Operators          : =,+=,-=,*=,/=,%=,&=,^=,!=, <<=,>>=, >>>=
		 */
		
		/** exemplo 1 */
		int y1 = 4;
		// ordem de precedencia: multiplicacao do valor antes da decrementação, decrementação, soma dos valores
		double x1 = 3 + 2 * --y1;
		System.out.println("y1: " + y1 + " x1: " + x1);
		
		/** exemplo 2 : alteração na ordem de precedencia*/
		// ordem de precedencia: multiplicacoes 2*5 e 3*4 e soma ou subtração dos valores gerados
		int x2 = 2 * 5 + 3 * 4 - 8;
		// ordem de precedencia: soma dos parenteses internos, multiplicacao, subtracao e multiplicacao final
		int y2 = 2 * ((5 + 3) * 4 - 8);
		System.out.println("x2: " + x2 + " y2: " + y2);
		
		/** exemplo 3: modulus*/
		System.out.println("9/3:" + 9/3 + " 9%3:" + 9%3 + " 10/3: " + 10/3 + " 10%3: " + 10%3 + " 11/3: " + 11/3 + 
				" 11%3: " + 11%3 + " 12/3: " + 12/3 + " 12%3: " + 12%3);
		
		/*Numeric promotion rules:
		 * 1) Quando o operador envolve duas variaveis de tipos diferentes, uma das variaveis será promovida para o tipo maior dentre as duas 
		 * 2) Quando a operação e entre um valor int e um valor flutuante, o valor int será promovido para um valor flutuante
		 * 3) Os tipos short, char, e byte são promovidos para int antes das operações
		 * 4) O valor de retorno de uma operação será do mesmo tipo resultante da promoção 
		 * */
		
		/** exemplo 4*/
		int x4 = 1;
		long y4 = 33;
		System.out.println((x4 * y4) + " type:long "); // primeira regra
		
		/** exemplo 5*/
		int x5 = 2;
		double y5 = 2.3;
		System.out.println((x5 * y5) + " type:double "); // segunda regra
		
		/** exemplo 6*/
		short x6 = 10;
		short y6 = 3;
		System.out.println((x6 * y6) + " type:int "); // terceira regra
		
		/** exemplo 7*/
		short x7 = 14;
		float y7 = 13;
		double z7 = 30;
		System.out.println((x7 * y7 / z7) + " type:double "); // todas as regras: x6 é convertido para int para realizar a operação de multiplicaaco
		// x6 é convertido para float para realizar uma multiplicacao com uma variavel float
		// o valor resultado em x6 * y6 é promovido para double para realizar uma divisão com z6
		// O valor final é do tipo da promoção final: double
		
		/** exemplo 8 */
		boolean x8 = false;
		System.out.println(x8);
		x8 = !x8;
		System.out.println(x8);
		
		/** exemplo 9 */
		double x9 = 1.21;
		System.out.println(x9);
		x9 = -x9;
		System.out.println(x9);
		
		/** exemplo 10*/
		int x10 = 0;
		System.out.println(x10);
		System.out.println(++x10);
		System.out.println(x10++);
		System.out.println(x10);
		
		/** exemplo 11 */
		int x11 = 3;
		int y11 =  ++x11 * 5 / x11-- + --x11; // will be evaluated in: 4 * 5 / 4 + 2
		System.out.println(y11);
		
		/** exemplo 12: casting */
		int x12 = (int) 1.0;
		System.out.println(x12);
		short y12 = (short)1921222; //overflow
		System.out.println(y12 + " overflow!!");
		int fail = 2147483647+1;
		System.out.println(fail);
		
		
		/** exempo 13*/
		short x13 = 10;
		short y13 = 3;
		short z13 = (short)(x13 * y13); // necessidade do cast, pois de acordo com a regra 3, o short é convertido para int no momento da operação
		short a13 = 10;
		a13 *= y13; // ou utilizar o operador composto de atribuição e multiplicação ( *= )
		System.out.println(z13);
		System.out.println(a13);
		
	}
}
