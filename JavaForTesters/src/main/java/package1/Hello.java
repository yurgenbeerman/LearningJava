package package1;

import static java.util.Arrays.copyOf;

public class Hello {
    static int[] iArray;
    static int[] iArray2;
    static int iExchanges = 0;
    static int iTE = 0; // Total Exchanges = Total swaps
    static long lStartTime = 0;
    static long lFinishTime = 0;
    static boolean flag;

    public static void main(String[] args) {
        //System.out.println("Привіт світе!");
//        System.out.println("HELLO man!");
//
//        System.out.println("\n------- typesDemo() ---------");
//        typesDemo();
//
//        System.out.println("\n------- operationsDemo() ---------");
//        operationsDemo();
//
//        System.out.println("\n------- controlStructuresDemo() ---------");
//        controlStructuresDemo();
//
//        System.out.println("\n------- practice1() ---------");
//        System.out.println("\n------- practice1Fibonacci() ---------");
//        practice1Fibonacci();
//        System.out.println("\n------- practice1Sort1() ---------");
//        practice1Sort1();
//        System.out.println("\n------- practice1Sort2() ---------");
//        practice1Sort2();
//        System.out.println("\n------- practice1Sort3() ---------");
//        practice1Sort3();
//        System.out.println("\n------- practice1Sort4() ---------");
//        practice1Sort4();
//        System.out.println("\n------- practice1Sort5() ---------");
//        practice1Sort5();

        System.out.println("\n------- practice2() ---------");
        // practice2 http://yuriytkach.blogspot.com/2012/06/java-practice-lesson-2.html
        System.out.println("\n------- practice2BinarySearch() ==---------");
        practice2BinarySearch();
    }

    static void typesDemo() {
        int iNumber = 10;
        char cCharacter = 'q';
        float fNum = 19;  //can't set 1.9
        boolean bFlag = true;
        byte bByte = 127;
        double dNum = 5.5e55;
        int[] iArr = new int[10];  // array is OBJECT
        iArr[0] = 3;   //array is object
        int[] iArr2 = {9,8,7,6,5}; //but CAN NOT initialize array of objects
        String[] sArr = new String[5];
        String[] sArr2 = {"aaa", "bbbb", "ccc"};
        System.out.println("Let's watch the variables:");
        System.out.println("iNumber = " + iNumber);
        System.out.println("cCharacter = " + cCharacter);
        System.out.println("fNum = " + fNum);
        System.out.println("bFlag = " + bFlag);
        System.out.println("bByte = " + bByte);
        System.out.println("dNum = " + dNum);
        System.out.println("iArr[0] = " + iArr[0]);
        System.out.println("iArr2[4] = " + iArr2[4]);
        System.out.println("sArr2[2] = " + sArr2[2]);
    }

    static void operationsDemo() {
        int a;
        int b;
        int c = 10;
        a = 2;
        b = 3;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        c = ++a - b++;
        System.out.println("c = ++a - b++;");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        // int /
        // float /
        // %
        // +=  -=  /=  *=
        //USE class "Math" for arithmetic operations.

        //  <  >  <=  >=  !  ==
        int aa=5;
        boolean bol = aa < 10;
        System.out.println("aa = " + aa);
        System.out.println("boolean bol = aa < 10;");
        System.out.println("bol = " + bol);
        //  &&  ||
        bol= (a > 5) && (a<3); // second comparation is not performed if first is false
        System.out.println("bol= (a > 5) && (a<3);");
        System.out.println("bol = " + bol);
    /*
        Eval e;
        bol = (e==null) || (e.verify());
    */
        if (6 == a) {   //write constant first!
        }
    }


	//****************** Blocks:
	/*
		{
		}
	*/
	
	//----- Control structures
    static void controlStructuresDemo() {
        if  (true) {int aaa = 5;}
        //aaa++; // out of visible

        if (true) {
        } else if (true) {
        } else if (true) {
        } else {
        }

        int z = 5; // switch needs z to be defined!
        switch (z) {  //z must be numerable type  -- ПЕРЕЧИСЛЯЕМЫЙ ТИП String --- NOT acceptable
        case 0:
            z++;
            break; // continue (for loop, next iteration) // return; // System.exit;
        default:
            z = 10;
        }


        for (int i=0;i<10;i++) {
            System.out.println(i);
        }

        int ii=0;
        for (;ii<10;ii++) {
        }

        int[] iArr3 = {0,1,2,3,4,5,6,7,8,9};
        int iArrLen = iArr3.length;
        System.out.println("iArrLen = " + iArrLen);
        for (int i=0;i<iArr3.length;i++) {
            System.out.println(i);
        }
        System.out.println("-- using for (int elem : iArr3) --");
        for (int elem : iArr3) {
            System.out.println(elem);
            if (4 == elem) break;
        }
        /*
        while (a>b) {
        }

        do {
        } while (a>b);
        */
    }

	//--------- Practice 1 (after Lesson 2) ---------
    static void practice1Fibonacci() {
        String sString1;
        // sString1.indexOf[];

        //1) Написать программу, которая выдает заданное число из последовательности Фибоначчи.
        //https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%B0_%D0%A4%D0%B8%D0%B1%D0%BE%D0%BD%D0%B0%D1%87%D1%87%D0%B8
        //arr[i] = arr[i-2]+arr[i-1];
        System.out.println("\nPRACTICE 1, TASK 1: Fibbonacci numbers");
        int num = 10; //num of index of Fibo number -- starts from 1

        //int[] iArrFibo = new int[num];
        int i = 3;
        double res = -1;
        double resBefore, resBefore1;
        resBefore = resBefore1 = 1;
        //iArrFibo[0] = 1;
        if ((2==num) || (1==num)) {
            res = 1;
            return;
        } else if (3==num) {
            res = 2;
            return;
        }
        while (num>=i) {
            res = resBefore + resBefore1;
            System.out.println("Fibo step " + i + ": res = " + res + ", resBefore = " + resBefore + ", resBefore1 = " + resBefore1);
            resBefore1 = resBefore;
            resBefore = res;
            i++;
            // may use recursion

        }
        System.out.println("Fibo num of index = " + num + ", the Fibo number = " + res + " (-1 means wrong num of index or error)");
    }

    static void practice1Sort1() {
        // 2) Написать программу, которая сортирует массив чисел.
        // сотрировать не используя дополнительной памяти
        System.out.println("\nPRACTICE 1, TASK 2: sort an array of numbers");

        //the initial array
        iArray = new int[] {3, 7, 1, 99, 57, 43, 34, 25, 36, 2, 9, 99, 22, 75, 83, 95, 84, 52, 7, 42, 36, 7, 1, 99, 57, 43, 34, 25, 36, 2, 9, 99, 22, 75, 83, 95, 84, 52, 7, 42, 36, 7, 1, 99, 57, 43, 34, 25, 36, 2, 9, 99, 22, 75, 83, 95, 84, 52, 7, 42, 36, 7, 1, 99, 57, 43, 34, 25, 36, 2, 9, 99, 22, 75, 83, 95, 84, 52, 7, 42, 36};
        System.out.println("\n\nThe initial array iArray is:");
        for (int elem : iArray) System.out.print(elem + ", ");

        //copy (backup) the initial array
        iArray2 = new int[iArray.length];
        for (int j=iArray.length-1; j>=0; j--) {iArray2[j] = iArray[j];}
        System.out.println("\n\nThe copied array iArray2 is:");
        for (int elem : iArray2) System.out.print(elem + ", ");

        System.out.println("\n\nThe pointers of arrays iArray and iArray2 are: " + iArray + " and " + iArray2);

        //int[] iArray2 = iArray;  //works by poiter
//        System.out.println("\n\nThe initial array is:");
//        for (int elem : iArray) System.out.print(elem + ", ");


        //long lStartTime, lFinishTime;
        //int iTE; //Total Exchanges;


        //I want to implement two ways sorting
        //boolean flag;
        iTE = 0;
        lStartTime = System.nanoTime();
        do {
            flag = false;
            for (int j=0; j<iArray.length-2; j++) {
                if (iArray[j] > iArray[j+1]) {
                    int number = iArray[j];
                    iArray[j] = iArray[j+1];
                    iArray[j+1] = number;
                    flag = true;
                    iTE++;
                }
            }
            if (!flag) break; else flag = false;
            for (int j=iArray.length-2; j>=0; j--) {
                if (iArray[j] > iArray[j+1]) {
                    int number = iArray[j];
                    iArray[j] = iArray[j+1];
                    iArray[j+1] = number;
                    flag = true;
                    iTE++;
                }
            }
        }  while (flag);
        lFinishTime = System.nanoTime();
        System.out.print("\n\nNanoseconds spent: " + (lFinishTime - lStartTime) + ", Total Exchanges = " + iTE);
        System.out.println("\nThe SORTED array is:");
        for (int elem : iArray) System.out.print(elem + ", ");
    }

    static void practice1Sort2() {
        for (int j=iArray2.length-1; j>=0; j--) {iArray[j] = iArray2[j];}
        System.out.println("\nThe initial array is:");
        for (int elem : iArray) System.out.print(elem + ", ");
        iTE = 0;
        lStartTime = System.nanoTime();
        do {
            flag = false;
            for (int j=0; j<iArray.length-2; j++) {
                if (iArray[j] < iArray[j+1]) {
                    int number = iArray[j];   //TODO use swapSmaller(iArray, j, j+1);
                    iArray[j] = iArray[j+1];
                    iArray[j+1] = number;
                    flag = true;
                    iTE++;
                }
            }
            if (!flag) break; else flag = false;
            for (int j=iArray.length-2; j>=0; j--) {
                if (iArray[j] < iArray[j+1]) {
                    int number = iArray[j];
                    iArray[j] = iArray[j+1];
                    iArray[j+1] = number;
                    flag = true;
                    iTE++;
                }
            }
        }  while (flag);
        lFinishTime = System.nanoTime();
        System.out.print("\n\nNanoseconds spent: " + (lFinishTime - lStartTime) + ", Total Exchanges = " + iTE);
        System.out.println("\nThe BACK-sorted array is:");
        for (int elem : iArray) System.out.print(elem + ", ");
    }

    //В кодревью Викладач сказав, що варто уникати холостих проходів!
    static void practice1Sort3() {
        int iExchanges;
        for (int j=iArray.length-1; j>=0; j--) {iArray[j] = iArray2[j];}
        System.out.println("\nThe initial array is:");
        for (int elem : iArray) System.out.print(elem + ", ");
        iTE = 0;
        lStartTime = System.nanoTime();
        do {
            iExchanges = 0;
            for (int j=0; j<iArray.length-2; j++) {
                if (iArray[j] > iArray[j+1]) {
                    int number = iArray[j];
                    iArray[j] = iArray[j+1];
                    iArray[j+1] = number;
                    iExchanges++;
                    iTE++;
                }
            }
            if (iExchanges < 2) break; else iExchanges = 0;
            for (int j=iArray.length-2; j>=0; j--) {
                if (iArray[j] > iArray[j+1]) {
                    int number = iArray[j];//TODO TEST swapSmaller(iArray, j, j+1);
                    iArray[j] = iArray[j+1];
                    iArray[j+1] = number;
                    iExchanges++;
                    iTE++;
                }
            }
        }  while (iExchanges > 1);
        lFinishTime = System.nanoTime();
        System.out.print("\n\nNanoseconds spent: " + (lFinishTime - lStartTime) + ", Total Exchanges = " + iTE);
        System.out.println("\nThe SORTED array is:");
        for (int elem : iArray) System.out.print(elem + ", ");
    }

    static void practice1Sort4() {
        for (int j=iArray.length-1; j>=0; j--) {iArray[j] = iArray2[j];}
        System.out.println("\nThe initial array is:");
        for (int elem : iArray) System.out.print(elem + ", ");
        iTE = 0;
        lStartTime = System.nanoTime();
        do {
            iExchanges = 0;
            for (int j=0; j<iArray.length-2; j++) {
                if (iArray[j] < iArray[j+1]) {
                    int number = iArray[j]; //TODO TEST swapSmaller(iArray, j, j+1);
                    iArray[j] = iArray[j+1];
                    iArray[j+1] = number;
                    iExchanges++;
                    iTE++;
                }
            }
            if (iExchanges < 2) break; else iExchanges = 0;
            for (int j=iArray.length-2; j>=0; j--) {
                if (iArray[j] < iArray[j+1]) {
                    int number = iArray[j]; //TODO TEST swapSmaller(iArray, j, j+1);
                    iArray[j] = iArray[j+1];
                    iArray[j+1] = number;
                    iExchanges++;
                    iTE++;
                }
            }
        }  while (iExchanges > 1);
        lFinishTime = System.nanoTime();
        System.out.print("\n\nNanoseconds spent: " + (lFinishTime - lStartTime) + ", Total Exchanges = " + iTE);
        System.out.println("\nThe BACK-sorted array is:");
        for (int elem : iArray) System.out.print(elem + ", ");
    }

    static void practice1Sort5() {
//OPERATING ARRAYS: http://www.javaprobooks.ru/java-%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5/%D0%BC%D0%B0%D1%81%D1%81%D0%B8%D0%B2%D1%8B-java-%D1%81%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0.html
//      import java.util.Arrays;
//      import static java.util.Arrays.copyOf;
//      Часть рутинных операций реализована доблестными программистами Sun в его методах. Посмотрим, что же нам предлагают:
//
//      asList — метод, который формирует оболочку List для переданного массива.
//      binarySearch — метод выполняет бинарный поиск по массиву, переданному первым параметром, значения из второго параметра.
//              copyOf — копирует переданный массив. Вторым параметром передаём количество элементов, которое хотим получить в новом массиве.
//              copyOfRange — то же, что и copyOf, но передаём индекс начала и индекс конца области копирования.
//      deepEquals — сравнивает два массива, учитывая, что они могут быть многомерными
//      deepHashCode — высчитывает хэш массива, учитывая, что они могут быть многомерными
//      deepToString — преобразует массив в строку, учитывая, что они могут быть многомерными
//      equals — сравниват массивы
//      fill — заполняет массив одним и тем же значением, переданным вторым параметром
//      hashCode — считает хэш
//      sort — сортирует массив
//      toString — преобразует массив в строку
//      Замечу, что функции binarySearch, copyOf, copyOfRange, equals, fill, hashCode, sort и toString перегружены для массивов всех примитивных типов и для массивов объектов Object.

          // DONE BELOW AND TESTED sort this way:
          // 1. find MIN number and put it in 1-st place
          // 2. shorten the range. 3. find MIN number and put it in 2-nd place
          // 4. shorten the range. 5. find MIN number and put it in 3-rd place,,,
          //stop evaluation must be like "if range = 2 then {if biggerr then exchange; break;}"
          for (int j=iArray.length-1; j>=0; j--) {iArray[j] = iArray2[j];}
          System.out.println("\n\nThe initial array is:");
          for (int elem : iArray) System.out.print(elem + ", ");
          iArray = copyOf(iArray2, iArray2.length);
          System.out.println("\n--------- iArray = copyOf(iArray2, iArray2.length); -------\n The initial array is:");
          for (int elem : iArray) System.out.print(elem + ", ");

          lStartTime = System.nanoTime();
          int arrLength = iArray.length-1;
          for (int i=0; i<arrLength-1; i++){
              // 1. find MIN number
              int minIndex = i;
    //          int minNum = iArray[i];
              for(int j=i+1; j<=arrLength;j++) if (iArray[j]<=iArray[minIndex]) minIndex = j;
    //          {
    //            minNum = iArray[j];
    //          }
              // put MIN number in i place, and the i-element put to old place of the MIN number
              if (iArray[i]!=iArray[minIndex]){ //TODO TEST swapSmaller(iArray, j, j+1);
                  int temp = iArray[minIndex];
                  iArray[minIndex] = iArray[i];
                  iArray[i] = temp;
              }
          }
          lFinishTime = System.nanoTime();
          System.out.print("\n\nNanoseconds spent: " + (lFinishTime - lStartTime));
          System.out.println("\nThe sorted array is:");
          for (int elem : iArray) System.out.print(elem + ", ");
    }

    static void practice2BinarySearch() {
        // https://www.youtube.com/watch?v=86Whd3UFSCE&list=SPD964614607573AFD&index=2
        // Функции (методы) - Занятие 2 - Java практика
        //задание Binary Search = Поиск методом Золотого сечения:
        //есть отсортированный массив
        //надо выдать индекс элемента массива, равного искомому значению
        //already implemented: Java Arrays.binarySearch
        //протестируй, если кол-во элементов четное и нечетное
        //вконце всех делений надо правильно обработать 1 или 2 последне ячейки
        //ТАКЖЕ стоит написать тестирующую ф-цию:
        System.out.println("\n-----задание Binary Search = Поиск методом Золотого сечения:------");
        char[] arr = {'c','f','i','l','p','q','s','v','w','x','z'};
        for (int elem : arr) System.out.print((char)elem + ", ");
        System.out.print("\n");

        String resultText;
        for(int i=0; i<arr.length; i++){
          //Operations operations = new Operations();
          int res = Operations.findSymbolInCharArray(arr, arr[i]);
          if (res == i) {
              resultText = "good!";
          } else resultText = "ERROR!";
          System.out.println("Test" + i + ", searching for '" + arr[i] + "' - resultText = " + resultText + "\n");
        }
        int res = Operations.findSymbolInCharArray(arr, 'h');
        if (res == -1) {
            resultText = "(not found) good!";
        } else resultText = "ERROR!";
        System.out.println("Test" + " 'h' (not in the array)" + ", searching for 'h' - res = " + res + ", resultText = " + resultText + "\n");

//------ while testing of very long arrays: -----------
//        1) test first element
//        2) test last element
//        3) test 3-5 random elements
//        4) test value(s) out of array elements
    }

}







// OOP
//		"исполнять методы на объекте"
/*
Architecture:
Objects
	state
		fields = variables
	behaviour
		methods


	class -- describes object

	in Java object can belong to one class only
	objects appear in

	--------------------------------------------
	incapsulation
	--------------------------------------------
		some object properties are hidden inside it
		their values can not be changed directly, only though object methods


	--------------------------------------------
	inheritance -- наследование:
	--------------------------------------------
	MainClass (mainField1, mainField2)
		IheritedClass1 (mainField1, mainField2, uniqueField1)
		IheritedClass2 (mainField1, mainField2, uniqueField2)
			IheritedClass21 (mainField1, mainField2, uniqueField2, uniqueField21)
	!!! в Java наслідування завжди від одного "батька", нема множинного наслідування!
	але є прийоми, які дозволяють це реалізувати: 0:19:22 https://www.youtube.com/watch?v=lGQxeGiqmKU&list=SPB0276A0A62BDEF06&index=3
	просто дублюють методи з потрібних класів

	Java policy - obligatory
	Java convention - non obligatory

	модифікатор доступу public

	Declaration:
		public class Car {
			String model;
			String name;


		}

		public class Formula1Car extends Car {
			String tiresName;
		}

	Implementation:

		Car c = new Car(); // call for constructor of class Car
		c.name = "rover"; //

		Formula1Car f1c = new Formula1Car();
		f1c.name = "bmw";
		f1c.tiresName = "goodyer";

		Прагнуть обєкти зробити максимально незалежними один від одного.
		Також приховують внутрішню логіку, назовні видають лише найпростіші методи для взаємодії інших з цим обєктом.

		___________
		поліморфізм -- можливість звертатись до обєкта не лише батьківського класу, а й його послідовників
		------------------- за назвою методу суперкласу викликаємо методи його підкласів
	class ColorTool {
		String name;
		String color;

		make();
	}

	class RyushechkaTool extends ColorTool {
		make(); //redefined method
	}

	Spring -- configurator
	exterlal program
	Tool t= new...
	t.make();

	--------------------------------------
	Модифікатори доступу:
	----------------------------------------
		public
		protected
		default (package local)
		private

..................................................................
http://www.amse.ru/courses/oopjava/14.php
.................................................................
Права доступа по умолчанию
Отсутствие явно указанного модификатора прав доступа перед членом класса означает, что этот член будет доступен во всех классах из данного пакета и не доступен вне пакета. Этот уровень доступа также называют package local.
Таким образом, в Java есть всего четыре уровня доступа: public, private, protected и default (package local)
...
Чтобы не возникало неоднозначностей с правами доступа, например при наследовании, в Java protected-уровень включает ещё и default. То есть protected член доступен всем подклассам, плюс классам внутри пакета.
Иерархия уровней доступа выглядит следующим образом:
private < default < protected < public  (!)
...
Дополнение: модификаторы доступа для внешних классов
По мимо обычных внешних public классов в Java можно также создавать так называемые local классы. Они могут лежать в одном файле с public классом и являются аналогами вложенных классов.
public class A {
    ...
}
class B {
   ...
}
В одном файле может быть только один public класс и сколько угодно local. Файл должен называться так же, как и public класс.
.............
http://www.drfits.com/?p=182
.................
Таблица показывает уровни доступа к элементам класса в зависимости от модификатора

Модификатор доступа
			Class	Package	Subclass	World
public	Да			Да			Да		Да
protected Да			Да			Да		Нет
default 	Да			Да			Нет*		Нет
private	Да			Нет			Нет		Нет
*default (package-private) для Subclass будет виден только если Subclass находится в том же пакете, что и класс родитель(Parent). В остальных случаях - не виден(как на таблице) (Спасибо Dmitry Staurou за дополнение)



	for fields and methods both
	The DEFAULT access modifier -- when we define no access modifier:
		it is like "protected" and is visible by classes of one package

		public class Car {
			String model;
			String name;  //visible in package
			protected String specialCode; //subsidiaries may use it too

			public pubFunc(); //any can call it
			private privFunc(); //for this classs only
			protected protFunc(); //subsidiaries may use it too
		}

		class CCAARR {  //is visible by package
		}

	inner class
	anonymous class

	--------
	static
	--------
	means it concerns to definition only (it is object for Java too, it is stored as an object example)
	распространяется на все объекты этого класса (это не совсем ООП-подход)
	class A {
	  static int is;

	  static void setIS(int iss) {
	     ...

	  //in Java by DEFAULT
	  static void getClass();
	  }
	}
	...
	A.is = ...;
	A.setIS(5);

	A b = new(A);
	bClass = b.getClass();

	READ more here:
	.....................................................
	http://habrahabr.ru/post/197802/   16 октября 2013
	.....................................................
	А знаете ли Вы, что возвращает .getClass()?
JAVA*
Я думаю, почти любого Java разработчика когда-то спрашивали на собеседовании: «Какие есть методы у класса Object?»
Меня, по крайней мере, спрашивали неоднократно. И, если в первый раз это было неожиданностью (кажется, забыл про clone), то потом я был уверен, что уж методы Object'а-то я знаю;)
И каково же было мое удивление, когда спустя несколько лет разработки я наткнулся на собственное незнание сигнатуры метода getClass()
Под катом пара слов про Class, .class, .getClass и, собственно, сюрприз, на который я наткнулся.
....

public class B extends A {
{
...
A a1 = new B();
a1.getClass(); // то же самое, что B.class, где   B -- название КЛАССА, а не объекта
...
ввиду полиморфизма нужно не забывать, что фактический класс объекта a — не обязательно A — это может быть любой подкласс:
Class<? extends A> result = a.getClass(); // Compilation successfull

class — это не статическое поле, коим может показаться (и даже не нативное-псевдо-статическое поле, как думал я), а особая конструкция языка. И, в отличие от статического поля, обратиться к нему через объект нельзя!
a.class; // Compile error! Unknown class: "a"
*/

/* ---------------------------------------------------------------------
https://www.youtube.com/watch?v=CYUgc0EhqS4&list=SPB0276A0A62BDEF06
Урок 4 - ООП - Java для тестировщиков
 --------------------------------------------------------------------- */
/*
public class Bike {
    private int num; //поле класса
    public void ride() {
        num=5;
    }

    public void getNum() {
        //check if num is inicialized
        //...
        //return the right value
        return num;
    }

    public void setNum(int newValue) {
        num = newValue;
    }

    //Overloading of methods
    int defaultSpeed = 7;
    public vioid drive() {
        drive(defaultSpeed);
    }

    public vioid drive(int a) {
        //...
    }

    public vioid drive(string ss) {
        //...
    }

    public vioid drive(int a, double b) {
        //...
    }

    //Constructors
//may be public and private both
    public Bike() {   //no type of method is defined  //constructor1
        //...
    }
    public Bike(int a) {   //no type of method is defined  //constructor2
        //...
    }
}
Bike bike = new(Bike); //call constructor1
        bike.drive(3, 2.5);

        Bike bike1 = new(Bike(5)); //call constructor2

public class A {
}
A a = new(A); // call for default constructor of class A
*/
/*Хитрость Java (!)
Если в классе определен конструктор с параметрами, то конструктор по-умолчанию будет НЕ ДОСТУПЕН.
Чтобы избежать этого, стоит определить конструктор без параметров.
private Bike() {} //minimum
*/
/*
public class Sum {
    public Sum(int a, int b) {
        a = 10;
        return a+ b;
    }
}
int a = 5;
Sum s = new Sum();
    println(s.sum(a,5);
    println(s.sum(a,new Integer(6));

//Примитивные типы всегда передаются по значению (!)
// int -- special name of primitive type
// Integer -- class name -- IMMUTABLE class, does not change state of object, its methods return copies of object only;
// Объекты передаются ПО ССЫЛКЕ (!)
public class Sum1 {
    public Sum(int a, Integer b) {
        a = 10;
        b = new Integer(10);
        return a+ b;
    }
}
int a = 5;
Integer b = new Integer(5);
Sum1 s1 = new Sum1();
    print(s1.sum(a,b));

        BigInteger bb = new BigInteger();
        bb.add(5); //change inner state of the bb object

//--------

public class Bike {
    private int num; //поле класса
    public void ride() {
        num=5;
    }

    public int getNum() {
        //check if num is inicialized
        //...
        //return the right value
        return num; //return is obligatore because we define type int (not void)
    }

    public Bike (int n) {
        num = n;
    }

    public boolean equals (Bike b2) {
        //этод метод надо писать ПРАВИЛЬНО !!!
        //IDE умеют это делать автоматически
        //check null
        //check in memory
        //compare fields
        return num == b2.getNum();
    }
	//public void setNum(int newValue) {
	//	num = newValue;
	//}


}

Bike b1 = new Bike(5);
Bike b2 = new Bike(5);
//logically they are equal, but in memory they are in different places

// let's compare bikes b1 and b2:  b1 == b2
(b1 == b2) // false -- different memory slots

        Bike b3 = b1; // same memory slot
        (b1 == b3) // true


//Java contains method to compare objects:
// method equals is in class Object
        b1.equals(b2); //"на объекте вызвать метод"

//(!) use ONLY equals() to compare OBJECTS;

        String a1 = "aa";
        String a2 = "aa";
        a1 == a2 //false

        if (a1 != null) a1.equals(a2); //true, check if a1 is not null -- to avoit NullPointerException!!!
//DO NOT USE a1.equals(a2) IF YOU ARE NOT TOTALLY SURE a1 object exists!!!
*/


/*
https://www.youtube.com/watch?v=ZtwG6gcaWxE&list=SPB0276A0A62BDEF06
Урок 5 - ООП - Java для тестировщиков

1) (from start) about this.attribute
2) (from 0:06:30) about call this(value)
3) (0:13:00) nested and inner classes
4) (0:23:00) Interfaces //Занятие 6 Java Практика - Interfaces
*/
/*
public class Outer {
    public class Inner {
        public void test(){
            Inner i = new Inner();
        }
    }
}

public class Action {
    public void setActions(Object a) {
        //...
    }

    private class MouseHandler {
        //...
    }

    private class KeyboardHandler {
        //...
    }
}

// ------- Interfaces -------------
// an interface difines behavior of a class, but not implements it
public interface Actions {
    public void doSmth();
    public int getNum();
    public void do();
}
public interface Ride {
    public void stop();
}

//this class must implement all methods of the Actions interface "класс реализовывает интерфейс"
// интерфейс выступает как жеткий контракт взаимодействия; это список методов
// еще одна причина использования интерфейсов это скрытие реализации
// у класса можно "спросить", имплементит ли он какой-либо конкретный интерфейс
// часто интерфейсы используются для сервисов и нескольких их реализаций
// часто их использують для тестирования, тогда реализующие методы подставляют тестовые значения
// интерфейсы хранятся в отдельных файлах
// интерфейсы НЕ бывают вложенными
// при проектировании первыми пишут сервисы: что как с чем взаимодействует
//когда интерфейсы написаны, уже можно начинать писать тесты

public class Hello implements Actions {
    public void doSmth() {
        //...
    }

    public int getNum() {
        return 0;
        //...
    }
}

public class All implements Actions, Ride {
    public void doSmth() {
        //...
    }

    public int getNum() {
        return 0;
        //...
    }

    public void stop() {
        //...
    }
}
Hello h = new Hello();
Actions a = h; //Java understands it
Actions a1 = new Hello();
Actions a2 = new All();
a.do(); //можно вызвать только тот метод, который описан в этом интерфейсе
        a1.do();

//------- Abstract Classes and methods ---------------
public abstract class Super {
    private int id;
    public int getId() {
        return id;
    }
    public abstract void test(); //abstract method is not implemented
}
public abstract class SubSuper extends Super{
    private int idea;
    public int getIdea() {
        return idea;
    }

    public  void test() {
        //...implementation of test() from Super
    }
    public abstract void subTest(); //abstract method is not implemented
}
public class Hello extends SubSuper {
    public  void subTest() {
        //...implementation of subTest() from SubSuper
    }
    public  void test() {
        //...reload of test() from SubSuper  // Overriding the method
    }
}
Super s = new Super(); //Compile ERROR!
Hello h = new Hello();
h.test();
        h.getId();
        Super r = new Hello(); //getId is the only defined here, but real object is of Hello class
        r.getId();
        r.test();
*/
//в отличие от интерфейса, абстрактный класс может содержать реализации методов
//неизменные свойства и поведение выделяют в абстрактные суперклассы, например "четырехколесное транспортное средство"
//методы, которые могут быть реализованы по-разному, делают абстрактными
//изменяемое поведение (методы) определяют в интерфейсах, например, для "грузовик" и "легковушка"
//Интерфейсы также могут НАСЛЕДОВАТЬСЯ


//-----------------------
/*
public abstract class Super {
    private int id;
    public int getId() {
        return id;
    }
    public abstract void test(); //abstract method is not implemented
}
public class Hello extends Super {
    public int id;
    public int getId() {   //Overriding the method
        //return 0;
        return super.getId;
    }
}
    // также super можно использовать в конструкторах
    Super(5)
*/
/* Reserved words
this -- обращаемся к себе
super -- вызов метода с таким названием ближайшего родителя -- С МАЛЕНЬКОЙ БУКВЫ
*/

// what about practice 2?
// NEXT  is Practice 3 https://www.youtube.com/watch?annotation_id=annotation_1288425167&feature=iv&index=3&list=PLD964614607573AFD&src_vid=lGQxeGiqmKU&v=dLVquhA3TQ8
//Занятие 6 Java Практика - Interfaces

/*
Урок 6 - ООП - Java для тестировщиков
https://www.youtube.com/watch?v=wlWBT-gwBkU&list=SPB0276A0A62BDEF06
*/
