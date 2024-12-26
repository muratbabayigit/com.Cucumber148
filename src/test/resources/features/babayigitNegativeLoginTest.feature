Feature: Kullanici login bilgileri ile giris yapmayı dener
  @babayigit
  Scenario Outline: Kullanici yanlis bilgilerle giris yapamadigini dogrular

    Given kullanici "babayigitTest" sayfasina girer
    Then kullanici Login butonuna tiklar
    Then kullanici username olarak "<username>" girer
    Then kullanici sifre olarak "<password>" girer
    Then kullanici giris butonuna tiklar
    Then kullanici giris yapilamadigini dogrular
    Then kullanici sayfayi kapatir

    Examples:
      | username      | password |
      | mubam         | 12345    |
      | alim          | hnfg     |
      | kafi          | Kfimtrak |


