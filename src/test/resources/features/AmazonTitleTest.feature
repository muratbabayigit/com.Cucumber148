Feature: US0012 Amazon Title Test

  Scenario: TC 002 Amazon Title degerinin Amazon kelimesini icerdigi dogrulanir

    Given kullanici "amazonUrl" sayfasina gider
    Then  kullanici title degerinin "Amazon" icerdigini dogrular
    And   kullanici sayfayi kapatir