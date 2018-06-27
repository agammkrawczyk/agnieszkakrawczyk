package com.kodilla.stream.world;
import org.junit.*;

import java.math.BigDecimal;


public class peopleWorldTest {

    @Before
    public void before(){
        System.out.println("Test Case : begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Process counting people of the World : begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Process counting people of the World: end");
    }


    @Test
    public void testGetPeopleQuantity() {
        //Given

        //South America countries
        Country Argentyna = new Country("Argentyna", new BigDecimal("44082000"));
        Country Boliwia = new Country("Boliwia", new BigDecimal("11071000"));
        Country Brazylia = new Country("Brazylia", new BigDecimal("207679000"));
        Country Chile = new Country("Chile", new BigDecimal("18383000"));
        Country Ekwador = new Country("Ekwador", new BigDecimal("16777000"));
        Country Gujana = new Country("Gujana", new BigDecimal("770000"));
        Country Kolumbia = new Country("Kolumbia", new BigDecimal("49292000"));
        Country Paragwaj = new Country("Paragwaj", new BigDecimal("6943739"));
        Country Peru= new Country(  "Peru",new BigDecimal ("33036196"));
        Country Surinam= new Country(  "Surinam",new BigDecimal ("591919"));
        Country Wnezuela= new Country( "Wenezuela", new BigDecimal("31431000"));
        Country Urugwaj= new Country( "Urugwaj",new BigDecimal ("3360148") );
        Country TrynidadITobago= new Country("Trynidad i Tobago",new BigDecimal ("1218208") );

        //Australia i Oceania countries
        Country Australia = new Country( " Australia", new BigDecimal( "24511800" ) );
        Country Fidzi= new Country( "Fidżi", new BigDecimal( 885000 ) );
        Country Kiribati= new Country( "Kiribati", new BigDecimal( 115000 ) );
        Country Mikronezja= new Country( "Mikronezja", new BigDecimal( "104196" )    );
        Country Nauru = new Country( "Nauru", new BigDecimal( 9642 ) );
        Country NowaZelandia= new Country( "Nowa Zelandia", new BigDecimal( 4510327 ) );
        Country Palau= new Country( "Palau", new BigDecimal( 21431 ) );
        Country PapuaNowaGwinea= new Country( "Papua-Nowa Gwinea", new BigDecimal( 6909701) );
        Country Samoa= new Country( "Samoa", new BigDecimal( 200108 ) );
        Country Tonga= new Country( "Tonga", new BigDecimal( 106479 ) );
        Country Tuvalu= new Country( "Tuvalu", new BigDecimal( 11052 ) );
        Country Vanuatu= new Country( "Vanuatu", new BigDecimal( 282814 ) );
        Country WyspyMarshalla= new Country( "Wyspy Marshalla", new BigDecimal( 55000 ) );
        Country WysypySalomona= new Country( "Wyspy Salomona/", new BigDecimal( "647581" ) );

        //Creating continents
        Continent SouthAmerica = new Continent("South America");
        SouthAmerica.addCountryToContintnet( Argentyna );
        SouthAmerica.addCountryToContintnet( Boliwia );
        SouthAmerica.addCountryToContintnet( Brazylia );
        SouthAmerica.addCountryToContintnet( Chile );
        SouthAmerica.addCountryToContintnet( Ekwador );
        SouthAmerica.addCountryToContintnet( Gujana );
        SouthAmerica.addCountryToContintnet( Kolumbia );
        SouthAmerica.addCountryToContintnet( Paragwaj );
        SouthAmerica.addCountryToContintnet( Peru );
        SouthAmerica.addCountryToContintnet( Surinam );
        SouthAmerica.addCountryToContintnet( Wnezuela );
        SouthAmerica.addCountryToContintnet( Urugwaj );
        SouthAmerica.addCountryToContintnet( TrynidadITobago );

        Continent AustraliaAndOceania= new Continent( "Australia and Oceania" );
        AustraliaAndOceania.addCountryToContintnet( Australia );
        AustraliaAndOceania.addCountryToContintnet( Fidzi );
        AustraliaAndOceania.addCountryToContintnet( Kiribati );
        AustraliaAndOceania.addCountryToContintnet( Mikronezja );
        AustraliaAndOceania.addCountryToContintnet( Nauru );
        AustraliaAndOceania.addCountryToContintnet( NowaZelandia );
        AustraliaAndOceania.addCountryToContintnet( Palau );
        AustraliaAndOceania.addCountryToContintnet( PapuaNowaGwinea );
        AustraliaAndOceania.addCountryToContintnet( Samoa );
        AustraliaAndOceania.addCountryToContintnet( Tonga );
        AustraliaAndOceania.addCountryToContintnet( Tuvalu );
        AustraliaAndOceania.addCountryToContintnet( Vanuatu );
        AustraliaAndOceania.addCountryToContintnet( WyspyMarshalla );
        AustraliaAndOceania.addCountryToContintnet( WysypySalomona );

        // creating World
        World world = new World();
        world.addContinentToWorld( SouthAmerica );
        world.addContinentToWorld(AustraliaAndOceania);
        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();
        //Then
        Assert.assertEquals(new BigDecimal("463005341"), peopleQuantity);
    }


}

