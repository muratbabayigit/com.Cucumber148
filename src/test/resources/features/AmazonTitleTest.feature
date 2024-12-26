Feature: US0012 Amazon Title Test
  @guru
  Scenario: TC 002 Amazon Title degerinin Amazon kelimesini icerdigi dogrulanir

    Given kullanici "amazonUrl" sayfasina gider
    Then  kullanici title degerinin "less" icerdigini dogrular
    And   kullanici sayfayi kapatir