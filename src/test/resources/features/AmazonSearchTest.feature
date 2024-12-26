Feature: US 0013 Amazon Arama Testi
  @guru
  Scenario: TC 003 kullanici amazonda nutella arayıp sonuc sayisini yazdirir

    Given kullanici "amazonUrl" sayfasina gider
    Then kullanici "nutella" kelimesini yazip arama tusuna tiklar
    Then kullanici arama sonuclarini yazdirir
    Then kullanici sayfayi kapatir