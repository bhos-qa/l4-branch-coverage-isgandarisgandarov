I will try to explain what I have learnt about code coverage

## What is a code coverage?
Code coverage is a measure which describes the degree of which the source code of the program has been tested. It is one form of white box testing which finds the areas of the program not exercised by a set of test cases. It also creates some test cases to increase coverage and determining a quantitative measure of code coverage.

In most cases, code coverage system gathers information about the running program. It also combines that with source code information to generate a report about the test suite’s code coverage.

### Code Coverage Methods
Code coverage tools will use one or more criteria to determine how your code was exercised or not during the execution of your test suite. The common metrics that you might see mentioned in my coverage reports include:

*Function coverage: how many of the functions defined have been called.
*Statement coverage: how many of the statements in the program have been executed.
*Branches coverage: how many of the branches of the control structures (if statements for instance) have been executed.
*Condition coverage: how many of the boolean sub-expressions have been tested for a true and a false value.
*Line coverage: how many of lines of source code have been tested.


### Branch Coverage
Branch Coverage is a white box testing method in which every outcome from a code module(statement or loop) is tested. The purpose of branch coverage is to ensure that each decision condition from every branch is executed at least once. It helps to measure fractions of independent code segments and to find out sections having no branches.

For example, if the outcomes are binary, you need to test both True and False outcomes.

I found a formula to calculate Branch Coverage by research-number of executed branches divided by total number of branches is equal to Branch coverage.

### What are the advantages of Branch coverage:

Branch coverage Testing offers the following advantages:

* It helps us to validate-all the branches in the code
* Assist  to ensure that no branched lead to any abnormality of the program’s operation
* Branch coverage method removes issues which happen because of statement coverage testing
* Allows you to find those areas which are not tested by other testing methods
* It allows you to find a quantitative measure of code coverage
* Branch coverage ignores branches inside the Boolean expressions
