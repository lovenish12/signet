

Feature: Smoke Test zales site.


@TC02
@smoke
Scenario: I want to test the functionality of zales application.

Given I navigate on to the "pagoda" sites
#And I take a screenshot of zales home page
And I click on sign in button
And I enter the "zales" data
#And I take a screenshot of zales login page
And I click on signin button
#And I take a screenshot of zales user account page
And I click on the serachbox field
And I enter "rings" in the searchbox
And I click on the serachbox submit button
#And I take a screenshot of search result page
#And I verify the number of product on search result page
#And I click on favorite icon on PLP page
#And I verify that compare button is disabled on PLP page
#And I hover my mouse on product
#And I click on add to compare button
#And I click on add to compare button for second product
#And I verify that compare button is enabled on PLP page
And I click on product "2" available on PLP page
#And I take a screenshot of PDP page
And I click on add to shopping bag on PDP page
#And I click on checkout now button on PDP page
#And I click on proceed to checkout
And I click on mini shopping bag icon
#And I take a screenshot of checkout page
And I click on checkout button
And I click on save address on shipping detail page
And I select saved address on shipping detail page
And I click next button on shipping detail page
And I click on next button on gift message page
And I click on save address on payment detail page
And I select saved address on payment detail page
And I enter "691" cvv on payment details page
And I click on next button on payment detail page
And I click on place an order on summary page
#And I click on ship to store
#And I enter "7890" zip code on store location field
#And I click on search for stores button
#And I take a screenshot for delivery page

#And I take a screenshot for gift page
#And I click on next button on gift message page
#And I click on save credit card
#And I select save credit card
#And I enter "691" cvv on payment details page
#And I take a screenshot for payment page
#And I click on next button on payment detail page
#And I take a screenshot for summary page
#And I click on place an order on summary page


Scenario Outline: Title of your scenario outline

Examples:

