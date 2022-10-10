
  Feature: Register Test Scenario Outline

    Scenario Outline: Create on Accounts

      Given Navigate on Websites
      And click Sign in button
      And  type email "<Email>"
      And click on Create an Account button
      And choose title
      And type firstname "<firstname>" and lastname "<lastname>"
      And type password "<password>"
      And type Company "<Company>"
      And type address "<address>"
      Examples:
        | Email | firstname | lastname | password | Company | address |
        | emir123@gmail.com | Emirhan | Şahin | password1 | Company1 | address1 |
        | kisi1@gmail.com | kisi1 | Şahin | password2 | Company2 | address2 |
        | kisi2@gmail.com | kisi2 | Şahin | password3 | Company3 | address3 |