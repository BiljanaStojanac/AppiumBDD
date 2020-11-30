Feature: Enter car data

      @Table
      Scenario: Enter validate data in table

      Given Navigate to Car Page
      When User enter following for vehicle data tab
      |Make|Year  |ListPrice |MileagePerYear|Performance|Fuel |Usage  |
      |Audi|2020  |40000     |8000          |800        |Diesel|Private|
      And go to Person page
      When User enter following for person data tab
      |FirstName|LastName    |Birth       |Occupation   |
      |TestName |TestLastName|01/01/1980  |Self-employed|
      And go to ProductDetails page
      When User enter following data for product details tab
      |PreferredStartDate|PaymentOption |DamageInsuranceSum|DamageInsurance|
      |20.07.2020.       |Monthly       |18000000          | Full Coverage |
      Then go to Quote page
      Then Verify data from Quote page


