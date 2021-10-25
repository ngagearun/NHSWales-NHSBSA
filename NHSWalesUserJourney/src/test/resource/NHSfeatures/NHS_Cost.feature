Feature: 
  As a NHS-Wales User I want to identify the cost for treatment

  Background: 
    Given I am on the NHS Cost Checker Tool and click Start button
    And I select Country as "Wales"

  Scenario Outline: NHS Help Checker for children under sixteen years
    And I enter Patients date of birth "<Day>", "<Month>","<Year>"
    Then the Patients gets help with NHS Cost

    Examples: 
      | Day | Month | Year |
      |  03 |    12 | 2005 |

  Scenario Outline: NHS Help Checker for Over 60
    And I enter Patients date of birth "<Day>", "<Month>","<Year>"
    And I select living with Partner info "<LivingwithPartner>"
    And I select Benefits and Tax Credit info "<BenefitsTaxCredit>"
    And I select Injury info when serving in Armed forces "<ArmedforcesInjuryinfo>"
    And I select Permanently living in carehome info "<PermanentCareHome>"
    And I select info of my savings over sixteen thousand "<Over16KSavinginfo>"
    Then the patient gets help with NHS Cost based on the selection

    Examples: 
      | Day | Month | Year | LivingwithPartner | BenefitsTaxCredit | ArmedforcesInjuryinfo | PermanentCareHome | Over16KSavinginfo |
      |  03 |    12 | 1940 | No                | No                | No                    | No                | No                |

  Scenario Outline: NHS Help Checker for children over sixteen years and full time education
    And I enter Patients date of birth "<Day>", "<Month>","<Year>"
    And I enter Full Time Education info "<Full Time Education>"
    Then the Patients gets help with NHS Cost

    Examples: 
      | Day | Month | Year | Full Time Education |
      |  03 |    12 | 2003 | Yes                 |

  Scenario Outline: NHS Help Checker for 32 years old Adult without a Partner, not claiming benefits and is pregnant
    And I enter Patients date of birth "<Day>", "<Month>","<Year>"
    And I select living with Partner info "<LivingwithPartner>"
    And I enter Benefits and Tax Credit info for the adult "<BenefitsTaxCredit>"
    And I enter Pregnancy details of the adult "<PregnancyDetails>"
    And I enter Injury info when serving in Armed forces for the adult "<ArmedforcesInjuryinfo>"
    And I enter Diabetic info about the adult "<Diabeticinfo>"
    And I enter Glaucoma info about the adult "<Glaucoma>"
    And I enter Permanently living in carehome info "<PermCareHome>"
    And I select info of my savings over sixteen thousand "<Over16KSavinginfo>"
    Then the Adult is displayed results page providing detains of NHS Health

    Examples: 
      | Day | Month | Year | LivingwitPartner | BenefitsTaxCredit | PregnancyDetails | ArmedforcesInjuryinfo | Diabeticinfo | Glaucoma | PermCareHome | Over16KSaveinfo |
      |  10 |    07 | 1989 | No               | No                | Yes              | No                    | No           | No       | No           | No              |

  Scenario Outline: NHS Help Checker for 40 years old Adult with Partner,claiming benefits and is pregnant
    And I enter Patients date of birth "<Day>", "<Month>","<Year>"
    And I select living with Partner info "<LivingwithPartner>"
    And I enter Benefits and Tax Credit info for the adult "<BenefitsTaxCredit>"
    And I select partner get paid unviersal card "<UniversalCard>"
    And I select joint unviersal credit "<UniversalCredit>"
    And I select you and your partner have a combined take-home pay of £935 or less in your last Universal Credit period "<TakeHOmePay>"
    Then the claim benefit with partner  is displayed results page providing detains of NHS Health

    Examples: 
      | Day | Month | Year | LivingwitPartner | BenefitsTaxCredit | UniversalCard                             | UniversalCredit | TakeHOmePay |
      |  25 |    10 | 1981 | Yes              | Yes                | Yes, we receive Universal Credit payments | Yes             | Yes         |
