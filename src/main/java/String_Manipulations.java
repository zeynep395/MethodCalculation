import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class String_Manipulations {


    /*
        Create a function that accepts a string,
            checks if it's a valid email address and returns either true or false, depending on the evaluation.
        ** The string must contain an @ character.
        ** The string must contain a . character.
        ** The @ must have at least one character in front of it.   --->>> e.g. "e@edabit.com" is valid while "@edabit.com" is invalid.
        ** The . and the @ must be in the appropriate places.       --->>> e.g. "hello.email@com" is invalid while "john.smith@email.com" is valid.

        If the string passes these tests, it's considered a valid email address.
        System.out.println(emailVerify("as@fr.com"));
    */

    public static void main(String[] args) {
        String name= " MarIa";
        String fullName;
        String email = "maria@yopmail.com";
        String lastName = "Efe";
        String address = "   ";
        String sentence;


/*
    charAt():       String bir ifadede, istinilen karakterin index cinsinden String'deki yerine gore  alinmasini saglar.
                    Return Type     : char
                        For Example:
*/

        System.out.println("Name1 = " + name.charAt(4)); // "I" --->> name'deki 4. index'teki harfi verir. Tabi name'in en az 5 harften olusmasi lazim. Basta bosluk var.
        System.out.println("Name2 = " + name.charAt(name.length() - 1)); // "a" --->> String ifadede son index'in karakterini verir.



/*
    concat():       Birlestirme methodudur. Stringin sonuna parantezin icine yazilan ifade ya da karakter eklenir.
                    Return Type     : String
                        For Example:

*/
        fullName = name.concat(" Efe ");
        System.out.println("Full Name1 = " + fullName); // " MarIa Efe"


/*
    contains():     String'in icinde aranan ifade yada karakter parantez icine yazilir.
                    Return Type     : Boolean
                        For Example:
*/
        System.out.println("Email With\"@\" = " + email.contains("@")); //true


/*
    endsWith():     String'in parantez icinde yazilan ifade ya da karakter ile bitip bitmedigini test eder.
                    Return Type     : Boolean
                        For Example:
*/
        System.out.println("Name3 = " + name.startsWith("fe")); // false



/*
    equals():       String bir ifadenin istenilen ifadeye esit olup olmadigini sorgular. Kucuk-buyuk harf duyarliligi vardir.
                    Return Type     : Boolean


    equalsIgnoreCase(): String bir ifadeyi kucuk-buyuk harfe dikkat etmeden esit olup olmadigini sorgular.
                    Return Type     : Boolean

                    Bosluga iki method da duyarlidir. esitlik istenen ifadenin doru yazilmasi gerekir.
                    Sadece buyuk-kucuk harf duyarliligina gore degisir.
                        For Example:
*/

        System.out.println("LastName1 = " + lastName.equals("efe"));  // --->>  false     lastName.equals("Efe") olursa true doner.
        System.out.println("LastName2 = " + lastName.equalsIgnoreCase("efe"));    //  true Buyuk=kucuk harf duyarliligi olmadi icin



/*
    isBlank():      String bir ifade bosluk haric hicbir sey olup olmadigini kontrol eder. Boslukla - hicbir seyin olmamasi aynidir.
                    Return Type     : Boolean
                        For Example:
                        lastName.isBlank();   --->> lastName'de bosluk haric hicbir sey olmadiginda true doner.


    isEmpty():      String bir ifadenin bos olup olmadigini kontrol eder. Bosluk dahi olsa dolu sayar.
                    Return Type     : Boolean
                        For Example:
                        lastName.isEmpty();   --->> lastName tamamen bossa yani bosluk bile yoksa true doner.

                        length()==0 ile isEmpty() same

                        isEmpty("")==> true     isEmpty("    ")==> false
                        isBlank("")==> true     isBlank("    ")==> true
*/

        System.out.println("Address2 = " + address.isBlank());   // ture --->> address te bosluktan baska birsey olmadigi icin icin.
        System.out.println("Address1 = " + address.isEmpty());   // false --->> address tamamen bos olmadigi icin.




/*
    indexOf():      String bir ifadede istenilen ifadenin ya da karakterin ilk basladigi yerin index numarasini verir.
                    Return Type     : Int

                        Eger aranan karakter yoksa -1 doner.

                        Parametreli kullanilirsa;
                        fullName.indexOf("E", 5);


    lastIndexOf():  String bir ifadede istenilen ifadenin ya da karakterin son basladigi yerin index numarasini verir. Yani sonun basi
                    Return Type     : Int

                        Parametreli kullanilirsa;
                            Parametreli kullanildiginda son indexten basa dogru aramaya baslar. Yani sagdan sola dogru.
                        fullName.lastIndexOf("E",8) --->> fullName'de 8. indexten itibaren 0. indexe dogru aramaya baslar ve ilk buldugu index numarasini verir. //8

        IKI METHOD'da Buyuk-Kucuk harf duyarlidir.
*/
        // indexOf()
        System.out.println("FullName2 = " + fullName.indexOf("r")); // 3 --->> fullName'deki "r" harfinin ilk basladigi index numarasini verir.
        System.out.println("FullName3 = " + fullName.indexOf("Efe")); // 7 --->> fullName'deki "Efe" ifadesinin ilk basladigi index numarasini verir.
        System.out.println("FullName4 = " + fullName.indexOf("EFE")); // -1 --->> fullName'deki "EFE" ifadesinin ilk basladigi index numarasini verir.
                                                                                // Buyuk-kucuk harf duyarli oldugu icin   bulumadigindan.
        //Parametreli kullanim.
        System.out.println("FullName5 = " + fullName.indexOf("a", 1)); // 2 --->> fullName'de 1. indexten sonra "a" harfinin ilk basladigi index numarasini verir.
        System.out.println("FullName6 = " + fullName.indexOf("a", 3)); // 5 --->> fullName'de 3. indexten sonra "a" harfinin ilk basladigi index numarasini verir.

        // lastIndexOf()
        System.out.println("FullName7 = " + fullName.lastIndexOf("F")); // -1 --->> buyuk-kucuk harf duyarliligi var.
        System.out.println("FullName8 = " + fullName.lastIndexOf("e")); // 9  --->> fullName'deki "e" harfinin son basladigi index numarasini verir.
        System.out.println("FullName9 = " + fullName.lastIndexOf("Efe")); // 7  --->> fullName'deki "Efe" ifadesinin son basladigi index numarasini verir.

        //Parametreli kullanim.
        System.out.println("FullName10 = " + fullName.lastIndexOf("a", 8)); // 5 --->> fullName'de 8. indexten itibaren 0. indexe dogru aramaya baslar
                                                                                         // ve ilk buldugu "a" harfinin oldugu index numarasini verir.
        System.out.println("FullName11 = " + fullName.lastIndexOf("E", 7)); //  7  --->> fullName'de 7. indexten itibaren 0. indexe dogru aramaya baslar
                                                                                         // ve ilk buldugu " E" harfinin index numarasini verir.


/*
    length():       String'in uzunlugunu int olarak bize verir.
                    Return Type     : Int
                        For Example:
*/

        System.out.println("FullNameSize = " + fullName.length());  // 11
        System.out.println("lastNameSize = " + lastName.length());  // 3
        System.out.println("EmailSize = " + email.length());        // 17
        System.out.println("AdsressSize = " + address.length());    // 3 Normalde sadece bosluk var. Bosluklari da saydigi icin


/*
    next():         Scanner sınıfı kullanılarak konsoldan kullanıcıdan veri girişi alınir.
    nextLine():     Scanner sınıfında, next() ve nextLine() metodları, farklı türlerde kullanıcı girişlerini okumak için kullanılırlar.
                    Disaridan girilen ifadeyi String olarak algilar.
                    nextLine()  --->>>  Cumle olarak
                    next()      --->>>  Kelime olarak algilar.
                                        Cumle olarak atansa bile next() kullanildigi icin Cumlenin ilk kelimesini algilar.

                    Return Type     : String
                        For Example:
*/
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your address: ");
//        String address2 = scanner.nextLine();
//        System.out.println("Your address is: " + address2);  // nextline() kullanildigi icin  tum String i yazdirir.
//
//        System.out.print("Enter your full name: ");
//        String fullName2 = scanner.next();
//        System.out.println("Your name is: " + fullName2);    // next() kullanildigi icin String'in ilk kelimesini yazdirir.

/*
    replace():      String bir ifadede degistirilmek istenen ifade ya da karakter ile yeni karakterler parantezin icine yazilir.
                    Return Type     : String

    replaceFirst(): String bir ifadede ilk degistirilmek istenen ifade ya da karakter ile yeni karakterler parantezin icine yazilir.
                    Return Type     : String

    replaceAll():   regex'ler ile de kullanilir.
                    Return Type     : String

                    [0-9A-Za-z]     tum rakam ve buyuk kucuk harfler.
                    [aeiou]         tum sesli harfler.
                    [^0-9]          rakamlarin disindakiler.    same   [\\D]
                    [^a-zA-Z]       harflerin disindakiler.
                    [\\s]           tum bosluklar.
                    [\\S]           bosluk disindakiler.
                    [\\p{Punct}]    tum noktalama isaretleri

                    For Example:
*/

        // FOR EXAMPLE :

        System.out.println("Name4 = " + name.replace("a", "e"));  // MerIe  --->>  name deki tum a harflerini e ile degistirir.
        System.out.println("Name5 = " + name.replace("MarIa", "Sofia")); // Sofia --->>  name deki Maria kelimelerini  Sofia ile degistirir.
        System.out.println("Name6 = " + name.replaceFirst("a", "e")); // MerIa --->>  name deki ilk a harfini e ile degistirir. diger "a" harflerini degistirmez.
        System.out.println("Name7 = " + name.replaceFirst("MarI", "Sofi")); // Sofia--->>  name deki ilk MarI kelimesini Sofi ile degistirir.

                sentence = "ilim ilim bilmektir, ilim kendin bilmektir, Sen kendin bilmezsen, Bu nice okumaktir.";

        System.out.println("Sentence1 = " + sentence.replace("ilim", "*")); //Tum ilim'ler "*" ile degisir.
        System.out.println("Sentence2 = " + sentence.replaceAll("ilim", "*")); //Tum ilim'ler "*" ile degisir.
        System.out.println("Sentence3 = " + sentence.replaceFirst("ilim", "*")); // Sadece ilk ilim "*" ile degisir.
        System.out.println("Sentence4 = " + sentence.replaceFirst("[aeiou]", "*")); // Sadece ilk sesli harf "*" ile degisir.
        System.out.println("Sentence5 = " + sentence.replaceAll("[aeiou]", "*")); // Tum  sesli harfler "*" ile degisir.

        System.out.println("Name8 = " + name.replaceAll("[a-z]", "*")); // M**I* --->> name'deki tum kucuk harfleri "*" ile degistirir.

        // substring() methodu ile replace() methodunu kullanma. Yani index'e gore
        System.out.println("Name9 = " + name.replace(name.substring(2),"s-Sofia")); // " Ms-Sofia"



/*
    split():        Parantezin icine yazilan ifadeye gore String'i ayirir. Yazdirmak icin Arrays.toString() methodu yada for dongusu kullanilir.
                    Return Type     : String[]
                        For Example:
*/

        System.out.println("FulName12 = " + Arrays.toString(fullName.split(" ")));   // [, MarIa, Efe]  --->> String ifadeyi bosluklardan ayirir. Ve ayirdigi kadar index olusur.
                                                                                           // split() methodu ile ayrilan string'ler bir Array olusturur.

        System.out.println("FulName13 = " + fullName.split(" ")[1]);  // MarIa  --->> Bu sekilde yazarsak ayirdiktan sonra,
                                                                            // ayrilan String lerin 1. index'indeki ifadeyi verir.
                                                                            // Verdigi ifade Array degil String'dir.

        System.out.println("SentenceSplitSize = " + sentence.split(" ").length);  // 12 --->> Bosluklardan ayrilan String'in kac tane oldugunu verir.

        System.out.println("SentenceSplits = " + Arrays.toString(sentence.split(" "))); // --->> Arrays.toString() ile Array lerin yazdirilmasini saglar.
        // [ilim, ilim, bilmektir,, ilim, kendin, bilmektir,, Sen, kendin, bilmezsen,, Bu, nice, okumaktir.]
        // Splitler yazilirken Array'in icinde virgul ile ayriliyor.


        String[] nameSplit = name.split(" ");
        String firstSprit = name.split(" ")[1];
        System.out.println("FirstSprit = " + firstSprit); // MarIa

        System.out.println("Name10= " + Arrays.toString(nameSplit)); // [, MarIa] --->>  Name 'de basinda bosluk oldugu icin 2 splite ayrilmistir.
                                                        // Array yazdirmak icin  Arrays.toString() methodu kullanilir. Ya da for dongusu

/*
    substring():    String bir ifadenin isteinlen karakterlerini almamizi saglar.
                    Return Type     : String
                        For Example:
*/
        System.out.println("Name11 = " + name.substring(2, 5)); // arI  --->> name'in 2. indexi dahil 5. index'e kadar olan ifadeleri alir. 5. index dahil degil. Bosluklari da sayar.
        System.out.println("Name12 = " + name.substring(2)); // arIa  -->> name'in 2. indexden sonraki tum ifadelerini alir.
        System.out.println("Sentence6 = " + sentence.substring(44)); // Sen kendin bilmezsen, Bu nice okumaktir.  -->> sentence'in 44. indexden sonraki tum ifadelerini alir.
        System.out.println("Sentence7 = " + sentence.substring(21, 42)); // ilim kendin bilmektir  -->> sentence'in 21. index'i dahil 42. index'e kadar olan ifadeleri alir.



/*
    startsWith():   String'in parantez icinde yazilan ifade ya da karakter ile baslayip baslamadigini test eder.
                    Return Type     : Boolean
                    parametreli olarakta kullanilir.
                        For Example:
*/
        System.out.println("Name13 = " + name.startsWith("Mar")); // false --->> name= " MarIa" basinda bosluk oldugu icin

        // parametreli kullanilirsa;
        System.out.println("Name14 = " + name.startsWith("Ma", 1)); // true ----> 1. index'ten "Ma" ile baslayip baslamadigini kontrol eder. 0. index'te bosluk var.




/*
    toLowerCase():  String ifadenin hepsini kucuk harf yapar.
                    Return Type     : String


    toUpperCase():  String ifadenin hepsini buyuk harf yapar.
                    Return Type     : String

                    Parametreli olarakta kullanilir. Ulkelerin diline gore ayarlanabilir.
                        For Example:
*/

        System.out.println("Name15 = " + name.toLowerCase());           //  marıa
        System.out.println("Name16 = " + name.toUpperCase());           //  MARIA

        // Parametreli
        System.out.println("Name17 = " + name.toLowerCase(Locale.UK));  //  maria



/*
    trim():         String ifadenin hem basindaki hem sonundaki bosluklari kaldirir. Ortadakilerini kaldirmaz.
                    Return Type     : String
                        For Example:
*/
        name.trim();
        System.out.println("Name18 = " + name);     // MarIa
        System.out.println("FullName12 = " + fullName.trim()); // MarIa Efe




/*
    valueOf():      Datatipi degistirmede kullanilir.
                        For Example:
*/
                int i = 42;
                String valueOf1 = String.valueOf(i);
                System.out.println("ValueOf1 = " + valueOf1); // "42"

                // Artik datamiz String oldugu icin String methodlarini kullanabilriiz.
                System.out.println("valueOf1 = " + valueOf1.replaceAll("2", "5")); //45 --->> replaceAll() methodu ile
                System.out.println("valueOf1 = " + valueOf1.replace(valueOf1.substring(1),"5")); //45 replace() methodu ile

                double d = 14.45;
                System.out.println("ValueOf3 = " + String.valueOf(d)); // "14.45"

                boolean b = true;
                System.out.println("ValueOf2 = " + String.valueOf(b)); // "true"
    }
}
