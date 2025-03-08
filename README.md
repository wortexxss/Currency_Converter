Currency Converter
Description
Currency Converter is a simple Java-based application that allows users to convert currencies between AZN (Azerbaijani Manat), USD (US Dollar), TRY (Turkish Lira), and RUB (Russian Ruble). The program offers a user-friendly interface where users can choose the currency they want to convert from and the currency they want to convert to. The conversion rates are predefined and the application supports continuous use until the user decides to exit.

Features
Convert AZN to USD, TRY, or RUB.
Convert USD to AZN, TRY, or RUB.
Convert TRY to AZN, USD, or RUB.
Convert RUB to AZN, USD, or TRY.
Easy-to-use menu for selecting operations.
Continuous operation until the user decides to exit.
Conversion Rates (As of the current version):
1 AZN = 0.59 USD
1 USD = 1.69 AZN
1 TRY = 0.12 AZN
1 RUB = 0.0085 AZN
These rates are predefined in the program and are subject to change based on real-time data.

How to Use
Clone the repository:

bash
Kopyala
Düzenle
git clone https://github.com/yourusername/currency-converter.git
Compile the Java program:

bash
Kopyala
Düzenle
javac CurrencyConverter.java
Run the program:

bash
Kopyala
Düzenle
java currencyconverter.CurrencyConverter
Select an operation:

The program will prompt you to select a currency.
Enter a number to select the currency you wish to convert from (1 for AZN, 2 for USD, 3 for TRY, 4 for RUB).
After selecting a currency, choose the target currency (e.g., from AZN to USD, TRY, or RUB).
Enter the amount you want to convert.
Exit the program:

To exit the program, simply enter 0 when asked to select an operation.
Example Usage
plaintext
Kopyala
Düzenle
Welcome to the Currency Converter
Please select the currency you want to convert:
1: AZN
2: USD
3: TRY
4: RUB
0: Exit
Select an operation (Enter 0 to exit):
1
Enter the amount you want to convert:
100
Which currency do you want to convert AZN to?
1: USD
2: TRY
3: RUB
1
100 AZN = 59.0 USD
In this example, the user selects AZN (Azerbaijani Manat) and enters 100. The program then converts 100 AZN to USD based on the predefined exchange rate (1 AZN = 0.59 USD), and the result is displayed as 100 AZN = 59.0 USD.
