# Mini Project README 
## Introduction 
Congratulations - you've almost finished the Intro to Java course!

To tie everything we've learnt together, we're going to build a banking application which runs 
in the command line. 

To describe the desired behaviour of the application, we'll be using *user stories*. These are 
an informal, general explanation of a software feature written frm the perspective of the end user.

### Core User Stories 
1. As a user, I want to be able to sign in to my online banking by typing in my account number.
2. As a user, I want to be able to check my balance after I have signed in.
3. As a user, I want to be able to make deposits to and withdrawals from my account.
4. As a user, I want to be able to find out my balance (including interest) as at some future date.
5. As a user, I want to be able to sign out of the system.

### Extension User Stories 
6. As a user, I want my account protected by a password or PIN.
7. As the bank, I do not want people to be able to withdraw beyond their overdraft limit.
8. As the bank, I want to charge overdraft fees at a higher interest rate

Now, let's write our application!

## User Story 1 
*"As a user, I want to be able to sign in to my online banking by typing in my account number."*

Open the `BankingApplication` class. This is the top-level application which we'll be running in 
this mini-project. 

Some code has already been written. What do you notice? What do you think the `UserInput.getString`
method will do? What do you think the application will do when you run it? 

Run the application and see if you were right! We'll come back to this user story later on.

## User Story 2
*"As a user, I want to be able to check my balance after I have signed in."*

At the top of our `main` method, we have a `Map<Integer, Integer> accountNumbersToOpeningBalances`.

Use this map to get the balance for the user that has signed just in, and print it to the console. 

What should we do if the account number that is given at the start isn't recognised by the system?

## User Story 1 - Revisited
Right now, we greet the user by their account number. This isn't very friendly, so it would be nice to 
greet them by their name.

Create a new class `BankAccount` which holds the details of the bank account. What should these details be? 

Update the map in our `BankingApplication` so that the values we store are `BankAccount`s rather than `Integer`.
Does your application still work as before? *(Hint - it should!)*

Now update the greeting so that we greet the user by name. Don't forget to run to app to test your change!

## User Story 3 
*"As a user, I want to be able to make deposits and withdrawals to my account."*

We need a way to ask the user what they'd like to do.

One way to do this would be to provide them the available options, and ask for their input - for example
our prompt could ask:

```
What would you like to do?
D - Deposit money, W - Withdraw money
```

The user would then be expected to type in 'D' if they want to deposit money into their account, or 'W' if 
they want to withdraw some. 

Use the `UserInput` class to add this prompt to the application, and then let's start with implementing deposits.

### Deposits
If the users input is 'D', then we need to deposit money into their account. 

First, we need to ask the user how much they'd like to deposit. Use `UserInput` to ask how much the user 
would like to deposit to their account.

Now we need to add the deposit amount to their opening balance.

We *could* add the code that does this directly to the banking application - but there's already a lot of
code in here, and this wouldn't be very object-oriented!

Therefore, we'll instead *separate our concerns* and create a new class `BankAccountService` which will contain 
all of the logic relating doing things with a bank account, such as depositing or withdrawing money.

Create this class, and add a method which deposits money to the account. What should the method take as parameters? 
What should the return type be?

In the body of this method, we'll need to calculate the new balance, and set this on our `BankAccount`.

You've already created a `Calculator`, so use this in your `BankAccountService` to do the calculation!

Your `BankAccountService` now has a *dependency* on `Calculator`. What is the best way to provide this dependency 
to `BankAccountService`? 

Now test this change. Run your application and make a deposit! 

If you sign in to the same account again, does it remember the updated balance? 

### Withdrawals 
If the users input is 'W', then we need to withdraw money into their account. 

Update the banking application so that the user can withdraw money. 

*Hint: this should look very similar to depositing money. Follow all the same principles: use the `UserInput` to ask 
for the amount, add a new method to `BankAccountService` to withdraw money, etc.*

Now test this change by running your application and making a withdrawal. Can you make deposits and withdrawals for 
the same account? 

What happens if the user enters an option that isn't available - e.g. 'A'. What do you think *should* happen? 

## User Story 4
*As a user, I want to be able to find out my balance (including interest) as at some future date.*

Our bank account will now be able to accrue interest!

Add another option to the prompt which allows the user to enquire on what their balance will be in the future, 
which will include any accrued interest.

This could, for example, ask in how many days or months they'd like to know their balance, or it could ask the user 
to enter a date in the future on which they'd like to know their balance. 

Add a new method to `BankAccountService` which uses your `Calculator` to calculate the amount of interest that 
will be accrued, and print the future balance to the user.

*Hints: you'll need to decide on what the interest rate is. You can hard-code this somewhere in the application or services 
for now, or maybe different accounts could have different interest rates. How you do this is entirely up to you!*

*Interest rates are usually expressed annually - that is, if I have £100 in my account at a 5% interest rate, I expect to
have £105 in a years time. Therefore to calculate the interest for a period of days (for example), you'll need to 
calculate what fraction of the year that the period spans. There are actually a lot of different ways to do this in the finance 
industry (this is known as the "Interest Basis"). One way is to just divide the number of days by 365, which is the typical 
length of a non-leap year.*

Now test this change by running your application and enquiring on the future balance. How can you check the balances 
are what you expect? 

## User Story 5 
*As a user, I want to be able to sign out of the system.*

Right now, your application should allow a user to sign in, show them their balance, and then allow them to either 
deposit to their account, withdraw from it, or enquire on their future balance including interest. It will then ask 
the next user to sign in, and keep doing this until the application is terminated.

What if a user wants to do several things in the application, e.g. deposit £500, then withdraw £100, and then find 
out what their balance in 30 days time will be? 

Add a Logout option to the options that the user is presented with, and use a loop so that the user keeps being 
prompted for what they want to do until they choose to logout. How will you represent whether a user is signed in, 
and what kind of loop will you use? 

Now that you've done all this - congratulations! You've created a working banking application in Java. 

## Extensions
If you complete all this and fancy a further challenge, try implementing these user stories:

### User Story 6
*As a user, I want my account protected by a password or PIN.*

Which class should you add this password to? 

### User Story 7
*As the bank, I do not want people to be able to withdraw beyond their overdraft limit.*

What class should you add this limit to? Where should the logic that checks this go? 

### User Story 8 
*As the bank, I want to charge overdraft fees at a higher interest rate*

### Further Extensions
What other user stories can you come up with for a banking application? Come up with some and try to implement them!