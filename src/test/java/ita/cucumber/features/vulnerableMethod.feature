# Author: Miguel
# Date: 07/01/2017

@test1
Feature: vulnerableMethod
Scenario: Opening an existing file that has content
	Given I have a file in "src/notEmpty.txt"
	When it has content
	Then its content should be printed

Scenario: Opening an existing file that has no content
	Given I have a file in "src/empty.txt"
	When it has no content
	Then its content should not be printed

