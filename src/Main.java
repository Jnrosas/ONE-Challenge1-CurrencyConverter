import models.ConversionHistory;
import models.CurrencyExchangeCalculator;
import models.CurrencyGenerator;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String menu = """
                 \n===========================================
                 CURRENCY EXCHANGE CALCULATOR
                 ===========================================
                 Menu:
                 1. Argentine Peso (ARS) => US Dollar (USD)
                 2. US Dollar (USD) =>  Argentine Peso (ARS)
                 3. Brazilian Real (BRL) => US Dollar (USD)
                 4. US Dollar (USD) => Brazilian Real (BRL)
                 5. Mexican Peso (MXN) => US Dollar (USD)
                 6. US Dollars (USD) => Mexican Peso (MXN)
                 7. Chilean Peso (CLP) => US Dollars (USD)
                 8. US Dollars (USD) => Chilean Peso (CLP)
                 0. Exit
                 ===========================================
                 """;
      DecimalFormat df = new DecimalFormat("###.##");

      while (true) {
         try {
            System.out.println(menu);
            System.out.print("Enter your option:\t");
            var option = Integer.parseInt(scanner.next());

            if (option == 0){
               break;
            }

            CurrencyGenerator generator = new CurrencyGenerator();

            switch (option) {
               case 1:
                  System.out.print("\nEnter ARS: ");
                  var ars2usd = scanner.nextDouble();

                  var result1 = generator.getDataFromAPI("USD");
                  CurrencyExchangeCalculator calculator = new CurrencyExchangeCalculator(result1.getConversion_rates());
                  var usd = df.format(calculator.calculateARS2USD(ars2usd));

                  //Feeds the history file through ConversionHistory class
                  var output = STR."\nARS \{ars2usd} are USD \{usd}";
                  ConversionHistory convert = new ConversionHistory();
                  convert.saveConversions(output);

                  System.out.println(output);
                  break;

               case 2:
                  System.out.print("\nEnter USD: ");
                  var usd2ars = scanner.nextDouble();

                  var result2 = generator.getDataFromAPI("ARS");
                  CurrencyExchangeCalculator calculator2 = new CurrencyExchangeCalculator(result2.getConversion_rates());
                  var ars = df.format(calculator2.calculateDollarsToOthers(usd2ars));

                  //Feeds the history file through ConversionHistory class
                  var output2 = STR."\nUSD \{usd2ars} are ARS \{ars}";
                  ConversionHistory convert2 = new ConversionHistory();
                  convert2.saveConversions(output2);

                  System.out.println(output2);
                  break;

               case 3:
                  System.out.print("\nEnter BRL: ");
                  var brl2usd = scanner.nextDouble();

                  var result3 = generator.getDataFromAPI("USD");
                  CurrencyExchangeCalculator calculator3 = new CurrencyExchangeCalculator(result3.getConversion_rates());
                  var usd3 = df.format(calculator3.calculateBRL2USD(brl2usd));

                  //Feeds the history file through ConversionHistory class
                  var output3 = STR."\nBRL \{brl2usd} are USD \{usd3}";
                  ConversionHistory convert3 = new ConversionHistory();
                  convert3.saveConversions(output3);

                  System.out.println(output3);
                  break;
               case 4:
                  System.out.print("\nEnter USD: ");
                  var usd2brl = scanner.nextDouble();

                  var result4 = generator.getDataFromAPI("BRL");
                  CurrencyExchangeCalculator calculator4 = new CurrencyExchangeCalculator(result4.getConversion_rates());
                  var brl4 = df.format(calculator4.calculateDollarsToOthers(usd2brl));

                  //Feeds the history file through ConversionHistory class
                  var output4 = STR."\nUSD \{usd2brl} are BRL \{brl4}";
                  ConversionHistory convert4 = new ConversionHistory();
                  convert4.saveConversions(output4);

                  System.out.println(output4);
                  break;

               case 5:
                  System.out.print("\nEnter MXN: ");
                  var mxn2usd = scanner.nextDouble();

                  var result5 = generator.getDataFromAPI("USD");
                  CurrencyExchangeCalculator calculator5 = new CurrencyExchangeCalculator(result5.getConversion_rates());
                  var usd5 = df.format(calculator5.calculateMXN2USD(mxn2usd));

                  //Feeds the history file through ConversionHistory class
                  var output5 = STR."\nMXN \{mxn2usd} are USD \{usd5}";
                  ConversionHistory convert5 = new ConversionHistory();
                  convert5.saveConversions(output5);

                  System.out.println(output5);
                  break;

               case 6:
                  System.out.print("\nEnter USD: ");
                  var usd2mxn = scanner.nextDouble();

                  var result6 = generator.getDataFromAPI("MXN");
                  CurrencyExchangeCalculator calculator6 = new CurrencyExchangeCalculator(result6.getConversion_rates());
                  var mxn6 = df.format(calculator6.calculateDollarsToOthers(usd2mxn));

                  //Feeds the history file through ConversionHistory class
                  var output6 = STR."\nUSD \{usd2mxn} are MXN \{mxn6}";
                  ConversionHistory convert6 = new ConversionHistory();
                  convert6.saveConversions(output6);

                  System.out.println(output6);
                  break;

               case 7:
                  System.out.print("\nEnter CLP: ");
                  var clp2usd = scanner.nextDouble();

                  var result7 = generator.getDataFromAPI("USD");
                  CurrencyExchangeCalculator calculator7 = new CurrencyExchangeCalculator(result7.getConversion_rates());
                  var usd7 = df.format(calculator7.calculateCLP2USD(clp2usd));

                  //Feeds the history file through ConversionHistory class
                  var output7 = STR."\nCLP \{clp2usd} are USD \{usd7}";
                  ConversionHistory convert7 = new ConversionHistory();
                  convert7.saveConversions(output7);

                  System.out.println(output7);
                  break;

               case 8:
                  System.out.print("\nEnter USD: ");
                  var usd2clp = scanner.nextDouble();

                  var result8 = generator.getDataFromAPI("CLP");
                  CurrencyExchangeCalculator calculator8 = new CurrencyExchangeCalculator(result8.getConversion_rates());
                  var clp8 = df.format(calculator8.calculateDollarsToOthers(usd2clp));

                  //Feeds the history file through ConversionHistory class
                  var output8 = STR."\nUSD \{usd2clp} are CLP \{clp8}";
                  ConversionHistory convert8 = new ConversionHistory();
                  convert8.saveConversions(output8);

                  System.out.println(output8);
                  break;

               default:
                  System.out.println("\nInvalid input");
            }
         } catch (NumberFormatException | IOException e) {
            System.out.println("\nThere was an exception:\n" + e.getMessage());
         }
      }
      System.out.println("\nThank you, app closed!");
      scanner.close();
   }
}
