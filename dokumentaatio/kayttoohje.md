# Käyttöohje 

Lataa tiedosto [ykkirjanpitosovellus-1.0-SNAPSHOT.jar](https://github.com/miikahyttinen/Otm-harjoitustyo-Yksinkertainen-kirjanpitosovellus/releases/tag/viikko7) 

## Konfigurointi

Ohjelma ei vaadi konfigurointeja. Ohjelma luo uudet tiedostot hakemistoon, josta se suoritettiin. Luo käyttöliittymässä ensin uusi tilikausi ja lisää sinne kirjauksia, jotta voi koittaa olemassa olevan tilikauden avaamista.

## Ohjelman käynnistäminen

Ohjelma käynnistetään komennolla tai suorittamalla JAR-tiedosto.

```
java -jar ykkirjanpitosovellus-1.0-SNAPSHOT.JAR
```

## Alkunäkymä

Sovelluksen alkunäkymässä voit avata tilikauden tai luoda uuden tilikauden. Uusi tilikausi luo CSV-tiedoston käynnistyshakemistoon.

(https://github.com/miikahyttinen/Otm-harjoitustyo-Yksinkertainen-kirjanpitosovellus/blob/master/dokumentaatio/gui%20pics/start%20view.png "Alkynäkymä")

## Uuden tilikauden luominen

Klikkaamalla "uusi tilikausi" voi luoda uuden tilikauden. Anna haluamasi nimi (max 50 merkkiä) sekä päivämäärät muodossa DD.MM.YYYY.

<img src="https://github.com/miikahyttinen/Otm-harjoitustyo-Yksinkertainen-kirjanpitosovellus/blob/master/dokumentaatio/gui%20pics/create%20a%20new%20accounting%20year.png" width="500">

## Olemassa olevan tilikauden avaaminen

Klikkaamalla "avaa tilikausi" avautuu tiedoston valintaikkuna, josta voit avata haluamasi tiedoston. Huom tiedoston pitää olla .csv -päätteinen ja datan täytyy olla oikeassa muodossa. Luo ensin tilikausi ja siihen kirjauksia.

<img src="https://github.com/miikahyttinen/Otm-harjoitustyo-Yksinkertainen-kirjanpitosovellus/blob/master/dokumentaatio/gui%20pics/file%20chooser.png" width="500">

## Tilikauden listausnäkymä

Näkymä listaa kaikki tiliakauden kirjaukset ja laskee tilikauden tuloksen. Voit myöt lisätä ja poistaa kirjauksen tästä näkymäst. 

<img src="https://github.com/miikahyttinen/Otm-harjoitustyo-Yksinkertainen-kirjanpitosovellus/blob/master/dokumentaatio/gui%20pics/show%20accounting%20year.png" width="400">

## Uuden kirjauksen tekeminen

Kun tilikausi on avattu tai uusi luotu, voi tehdä kirjauksia klikkaamalla uusi kirjaus. Ohjelma kirjoitta uuden 
kirjauksen suoraan tiedostoon.

<img src="https://github.com/miikahyttinen/Otm-harjoitustyo-Yksinkertainen-kirjanpitosovellus/blob/master/dokumentaatio/gui%20pics/new%20entry.png" width="500">

## Kirjauksen poisto

Tilikauden listausnäkymästä voit poistaa kirjauksen. Anna kirjauksen numero (ID), jonka haluat poistaa.
ID:t näet listausnäkymästä. 

<img src="https://github.com/miikahyttinen/Otm-harjoitustyo-Yksinkertainen-kirjanpitosovellus/blob/master/dokumentaatio/gui%20pics/remove%20entry.png" width="300">






