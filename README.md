# GermanyFine

### Program for calculating the amount of the fine for speeding in Germany.

---

A small program that uses enumerations (enum) to store ranges and values.

The user enters the speed value, the program calculates whether there is a speeding violation, and if so, displays the fine amount.

The program can be set to check the fine for the city:

    new FineCalculator(true, 50, 100).fineCheck();

and outside the city:

    new FineCalculator(false, 50, 100).fineCheck();

`Fines are valid for Germany for 2022.`

