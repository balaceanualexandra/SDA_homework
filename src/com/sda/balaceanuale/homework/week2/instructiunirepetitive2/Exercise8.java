package com.sda.balaceanuale.homework.week2.instructiunirepetitive2;


import java.util.Scanner;

public class Exercise8
{
    //  Exercitiul8:
    //  Scrieti un program afiseaza un meniu de forma:
    //  Pentru majoritatea optiunilor se cer 4 numere de la tastatura.
    //      1. Afiseaza nr cel mai mic.
    //      2. Afisare nr cel mai mare.
    //      3. Afiseaza suma numerelor.
    //      4. Afisarea suma numerelor de doua cifre.(Daca nu exista sa se afiseze un mesaj corespunzator).
    //      5. Afiseaza diferenta numerelor.
    //      6. Afiseaza diferenta numerelor impare.
    //      7. Afiseaza suma dintre produsul numerelor de o cifra si produsul numerelor de doua cifre.
    //          (Daca nu exista atunci se afiseaza un mesaj corespunzator).
    //      8. Afiseaza catul si restul impartirii numerelor
    //          (Se vor cere 2 numere noi si se va afisa catul si restul impartirii acestor doua numere intre ele).
    //      9. Afiseaza tabla inmultirii.
    //          (Pentru aceasta optiune nu se mai cer cele 4 numere ci se cere numarul
    //          care va fi inmultit si numarul pana la care se va efectua tabla inmultirii).
    //      10. Exit (Pentru aceasta optiune nu se mai cere utilizatorului sa introduca nimic
    //          de la tastatura ci doar ii afiseaza un mesaj de la revedere).
    //
    //  Cititi de la tastatura optiunea utilizatorului si executati operatiunea aleasa.
    //  Utilizatorul poate executa optiuni cat timp nu a apasat in mod intentionat pe optiunea de Exit.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int optionNumber = 0;
        do
        {
            System.out.println("___________________________________");
            System.out.println("OPTIUNI:");
            System.out.println("1. Afiseaza nr cel mai mic.");
            System.out.println("2. Afisare nr cel mai mare.");
            System.out.println("3. Afiseaza suma numerelor.");
            System.out.println("4. Afisarea suma numerelor de doua cifre.");
            System.out.println("5. Afiseaza diferenta numerelor.");
            System.out.println("6. Afiseaza diferenta numerelor impare.");
            System.out.println("7. Afiseaza suma dintre produsul numerelor de o cifra si produsul numerelor de doua cifre.");
            System.out.println("8. Afiseaza catul si restul impartirii numerelor");
            System.out.println("9. Afiseaza tabla inmultirii.");
            System.out.println("10. Exit");
            System.out.println("___________________________________");

            System.out.print("Introduceti optiunea de la 1 la 10: ");
            optionNumber = scanner.nextInt();
            switch (optionNumber)
            {
                case 1:
                    System.out.println("Afiseaza nr cel mai mic.");
                {
                    System.out.println("Introduceti primul numar.");
                    int var1 = scanner.nextInt();
                    System.out.println("Introduceti al doilea numar.");
                    int var2 = scanner.nextInt();
                    System.out.println("Introduceti al treilea numar.");
                    int var3 = scanner.nextInt();
                    System.out.println("Introduceti al patrulea numar.");
                    int var4 = scanner.nextInt();
                    int min = var1;
                    if (var2 < min)
                    {
                        min = var2;
                    }
                    if (var3 < min)
                    {
                        min = var3;
                    }
                    if (var4 < min)
                    {
                        min = var4;
                    }
                    System.out.println("Numarul cel mai mic este: " + min);
                }
                break;

                case 2:
                    System.out.println("Afiseaza nr cel mai mare.");
                {
                    System.out.println("Introduceti primul numar.");
                    int var1 = scanner.nextInt();
                    System.out.println("Introduceti al doilea numar.");
                    int var2 = scanner.nextInt();
                    System.out.println("Introduceti al treilea numar.");
                    int var3 = scanner.nextInt();
                    System.out.println("Introduceti al patrulea numar.");
                    int var4 = scanner.nextInt();
                    int max = var1;
                    if (var2 > max)
                    {
                        max = var2;
                    }
                    if (var3 > max)
                    {
                        max = var3;
                    }
                    if (var4 > max)
                    {
                        max = var4;
                    }
                    System.out.println("Numarul cel mai mare este: " + max);
                }
                break;
                case 3:
                    System.out.println("Afiseaza suma numerelor.");
                {
                    System.out.println("Introduceti primul numar.");
                    int var1 = scanner.nextInt();
                    System.out.println("Introduceti al doilea numar.");
                    int var2 = scanner.nextInt();
                    System.out.println("Introduceti al treilea numar.");
                    int var3 = scanner.nextInt();
                    System.out.println("Introduceti al patrulea numar.");
                    int var4 = scanner.nextInt();
                    int sum = var1 + var2 + var3 + var4;
                    System.out.println("Suma numerelor este: " + sum);
                }
                break;
                case 4:
                    System.out.println("Afisarea suma numerelor de doua cifre.");
                {
                    System.out.println("Introduceti primul numar.");
                    int var1 = scanner.nextInt();
                    System.out.println("Introduceti al doilea numar.");
                    int var2 = scanner.nextInt();
                    System.out.println("Introduceti al treilea numar.");
                    int var3 = scanner.nextInt();
                    System.out.println("Introduceti al patrulea numar.");
                    int var4 = scanner.nextInt();
                   int sumNrDouble =0;
                   if (Integer.toString(var1).length()==2)
                   {
                       sumNrDouble =var1;
                   }
                   if (Integer.toString(var2).length()==2)
                   {
                       sumNrDouble = sumNrDouble +var2;
                   }
                   if (Integer.toString(var3).length()==2)
                    {
                        sumNrDouble =sumNrDouble +var3;
                    }
                    if (Integer.toString(var4).length()==2)
                    {
                        sumNrDouble = sumNrDouble + var4;
                    }
                    if (sumNrDouble>0)
                    {
                        System.out.println("Suma numerelor din 2 cifre este: " + sumNrDouble);
                    }
                    else
                    {
                        System.out.println("Nu au fost numere din doua cifre.");
                    }

                }
                break;
                case 5:
                    System.out.println("Afiseaza diferenta numerelor.");
                {
                    System.out.println("Introduceti primul numar.");
                    int var1 = scanner.nextInt();
                    System.out.println("Introduceti al doilea numar.");
                    int var2 = scanner.nextInt();
                    System.out.println("Introduceti al treilea numar.");
                    int var3 = scanner.nextInt();
                    System.out.println("Introduceti al patrulea numar.");
                    int var4 = scanner.nextInt();
                    int dif = var1 - var2 - var3 -var4;
                    System.out.println("Diferenta numerelor este: " + dif);
                }
                break;
                case 6:
                    System.out.println("Afiseaza diferenta numerelor impare.");
                {
                    System.out.println("Introduceti primul numar.");
                    int var1 = scanner.nextInt();
                    System.out.println("Introduceti al doilea numar.");
                    int var2 = scanner.nextInt();
                    System.out.println("Introduceti al treilea numar.");
                    int var3 = scanner.nextInt();
                    System.out.println("Introduceti al patrulea numar.");
                    int var4 = scanner.nextInt();
                    int difImpare = 0;
                    boolean foundimpar =false;
                    if (var1 %2 !=0)
                    {
                        difImpare = var1;
                        foundimpar =true;
                    }
                    if (var2 %2 !=0)
                    {
                        difImpare =difImpare - var2;
                        foundimpar =true;
                    }
                    if (var3 %2 !=0)
                    {
                        difImpare = difImpare - var3;
                        foundimpar =true;
                    }
                    if (var4 %2 !=0)
                    {
                        difImpare = difImpare - var4;
                        foundimpar =true;
                    }
                    if (foundimpar)
                    {
                        System.out.println("Diferenta numerelor impare este: " + difImpare);
                    }
                    else
                    {
                        System.out.println("Nu au fost numere impare.");
                    }
                }
                break;
                case 7:
                    System.out.println("Afiseaza suma dintre produsul numerelor de o cifra si produsul numerelor de doua cifre.");
                {
                    System.out.println("Introduceti primul numar.");
                    int var1 = scanner.nextInt();
                    System.out.println("Introduceti al doilea numar.");
                    int var2 = scanner.nextInt();
                    System.out.println("Introduceti al treilea numar.");
                    int var3 = scanner.nextInt();
                    System.out.println("Introduceti al patrulea numar.");
                    int var4 = scanner.nextInt();

                    int produsOne = 1;
                    int produsTwo = 1;

                    if (Integer.toString(var1).length()==2)
                    {
                        produsTwo = produsTwo * var1;
                    }
                    if (Integer.toString(var1).length()==1)
                    {
                        produsOne = produsOne * var1;
                    }

                    if (Integer.toString(var2).length()==2)
                    {
                        produsTwo = produsTwo * var2;
                    }
                    if (Integer.toString(var2).length()==1)
                    {
                        produsOne = produsOne * var2;
                    }

                    if (Integer.toString(var3).length()==2)
                    {
                        produsTwo = produsTwo * var3;
                    }
                    if (Integer.toString(var3).length()==1)
                    {
                        produsOne = produsOne * var3;
                    }

                    if (Integer.toString(var4).length()==2)
                    {
                        produsTwo = produsTwo * var4;
                    }
                    if (Integer.toString(var4).length()==1)
                    {
                        produsOne = produsOne * var4;
                    }
                    System.out.println("Rezultatul este: " + (produsOne + produsTwo));
                }
                break;
                case 8:
                    System.out.println("Afiseaza catul si restul impartirii numerelor");
                {
                    System.out.println("Introduceti primul numar.");
                    int var1 = scanner.nextInt();
                    System.out.println("Introduceti al doilea numar.");
                    int var2 = scanner.nextInt();
                    System.out.println("Introduceti al treilea numar.");
                    int var3 = scanner.nextInt();
                    System.out.println("Introduceti al patrulea numar.");
                    int var4 = scanner.nextInt();

                    System.out.println("Restul impartirii: " + var1 % var2);
                    System.out.println("Catul impartirii: " + var3 / var4);
                }
                break;
                case 9:
                    System.out.println("Afiseaza tabla inmultirii.");
                {
                    System.out.println("Introduceti numar.");
                    int var1 = scanner.nextInt();
                    System.out.println("Introduceti limita tabla inmultirii.");
                    int var2 = scanner.nextInt();
                    while (var2 > 0)
                    {
                        System.out.println(var1 + "x" + var2 + "=" + var1*var2);
                        var2--;
                    }
                }
                break;
                case 10:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Optiunea introdusa este gresita! ");
            }
        }
        while (optionNumber <= 9);
    }
}


