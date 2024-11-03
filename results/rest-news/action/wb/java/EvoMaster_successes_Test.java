import  org.junit.AfterClass;
import  org.junit.BeforeClass;
import  org.junit.Before;
import  org.junit.Test;
import static org.junit.Assert.*;
import  java.util.Map;
import  java.util.Arrays;
import  java.util.List;
import static org.evomaster.test.utils.EMTestUtils.*;
import  org.evomaster.client.java.controller.SutHandler;
import  io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import  io.restassured.response.ValidatableResponse;
import static org.evomaster.client.java.sql.dsl.SqlDsl.sql;
import  org.evomaster.client.java.controller.api.dto.database.operations.InsertionResultsDto;
import  org.evomaster.client.java.controller.api.dto.database.operations.InsertionDto;
import static org.hamcrest.Matchers.*;
import  io.restassured.config.JsonConfig;
import  io.restassured.path.json.config.JsonPathConfig;
import static io.restassured.config.RedirectConfig.redirectConfig;
import static org.evomaster.client.java.controller.contentMatchers.NumberMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.StringMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.SubStringMatcher.*;




/**
*  This file was automatically generated by EvoMaster on 2024-11-03T15:03:49.838-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 22 tests
 * <br>
*  Covered targets: 359
 * <br>
*  Used time: 0h 15m 2s
 * <br>
*  Needed budget for current results: 76%
 * <br>
*  This file contains test cases that represent successful calls.
*/
public class EvoMaster_successes_Test {

    
    private static final SutHandler controller = new em.embedded.org.tsdes.EmbeddedEvoMasterController();
    private static String baseUrlOfSut;
    
    
    @BeforeClass
    public static void initClass() {
        controller.setupForGeneratedTest();
        baseUrlOfSut = controller.startSut();
        controller.registerOrExecuteInitSqlCommandsIfNeeded();
        assertNotNull(baseUrlOfSut);
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.urlEncodingEnabled = false;
        RestAssured.config = RestAssured.config()
            .jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.DOUBLE))
            .redirect(redirectConfig().followRedirects(false));
    }
    
    
    @AfterClass
    public static void tearDown() {
        controller.stopSut();
    }
    
    
    @Before
    public void initTest() {
        controller.resetDatabase(Arrays.asList("NEWS_ENTITY","news_entity"));
        controller.resetStateOfSUT();
    }
    
    
    
    
    @Test(timeout = 60000)
    public void test_0_getOnApi_docsReturnsObject() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/v2/api-docs")
                .then()
                .statusCode(200);
    }
    
    
    @Test(timeout = 60000)
    public void test_1_getOnCountriesReturns247ElementsUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 8L)
                .d("ID", "232")
                .d("AUTHOR_ID", "\"HoLU3W\"")
                .d("COUNTRY", "\"ZFii3g_7W2Jt6G\"")
                .d("CREATION_TIME", "\"2059-10-19 02:54:09\"")
                .d("TEXT", "\"_EM_186_XYZ_\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/countries?authorId=HoLU3W")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(247))
                .body("", hasItems("Afghanistan", "Åland Islands", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "The Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bonaire", "Bosnia and Herzegovina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory", "United States Minor Outlying Islands", "British Virgin Islands", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Republic of the Congo", "Democratic Republic of the Congo", "Cook Islands", "Costa Rica", "Croatia", "Cuba", "Curaçao", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands", "Faroe Islands", "Fiji", "Finland", "France", "French Guiana", "French Polynesia", "French Southern and Antarctic Lands", "Gabon", "The Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guernsey", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard Island and McDonald Islands", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Ivory Coast", "Iran", "Iraq", "Republic of Ireland", "Isle of Man", "Israel", "Italy", "Jamaica", "Japan", "Jersey", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Republic of Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Federated States of Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "North Korea", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn Islands", "Poland", "Portugal", "Puerto Rico", "Qatar", "Republic of Kosovo", "Réunion", "Romania", "Russia", "Rwanda", "Saint Barthélemy", "Saint Helena", "Saint Kitts and Nevis", "Saint Lucia", "Saint Martin", "Saint Pierre and Miquelon", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "São Tomé and Príncipe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Sint Maarten", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia", "South Korea", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Svalbard and Jan Mayen", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "East Timor", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Wallis and Futuna", "Western Sahara", "Yemen", "Zambia", "Zimbabwe"));
    }
    
    
    @Test(timeout = 60000)
    public void test_2_getOnCountriesReturns247ElementsUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 10L)
                .d("ID", "232")
                .d("AUTHOR_ID", "\"ANiPg6ORY8kJxa6D\"")
                .d("COUNTRY", "\"U\"")
                .d("CREATION_TIME", "\"1907-04-03 19:24:57\"")
                .d("TEXT", "\"_EM_204_XYZ_\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "_EM_205_XYZ_")
                .get(baseUrlOfSut + "/countries?country=U")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(247))
                .body("", hasItems("Afghanistan", "Åland Islands", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "The Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bonaire", "Bosnia and Herzegovina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory", "United States Minor Outlying Islands", "British Virgin Islands", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Republic of the Congo", "Democratic Republic of the Congo", "Cook Islands", "Costa Rica", "Croatia", "Cuba", "Curaçao", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands", "Faroe Islands", "Fiji", "Finland", "France", "French Guiana", "French Polynesia", "French Southern and Antarctic Lands", "Gabon", "The Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guernsey", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard Island and McDonald Islands", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Ivory Coast", "Iran", "Iraq", "Republic of Ireland", "Isle of Man", "Israel", "Italy", "Jamaica", "Japan", "Jersey", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Republic of Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Federated States of Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "North Korea", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn Islands", "Poland", "Portugal", "Puerto Rico", "Qatar", "Republic of Kosovo", "Réunion", "Romania", "Russia", "Rwanda", "Saint Barthélemy", "Saint Helena", "Saint Kitts and Nevis", "Saint Lucia", "Saint Martin", "Saint Pierre and Miquelon", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "São Tomé and Príncipe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Sint Maarten", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia", "South Korea", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Svalbard and Jan Mayen", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "East Timor", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Wallis and Futuna", "Western Sahara", "Yemen", "Zambia", "Zimbabwe"));
    }
    
    
    @Test(timeout = 60000)
    public void test_3_getOnNewsReturnsEmptyList() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "_EM_64_XYZ_")
                .get(baseUrlOfSut + "/news?" + 
                    "authorId=3zGPeG&" + 
                    "EMextraParam123=_EM_63_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_4_getOnNewsReturnsEmptyList() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/news?country=EiL")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_5_getOnNewsReturnsEmptyListUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 1753L)
                .d("ID", "-7385")
                .d("AUTHOR_ID", "\"TUEQb\"")
                .d("COUNTRY", "\"Aa9Z_I_4SM9Q\"")
                .d("CREATION_TIME", "\"2059-08-16 06:18:47\"")
                .d("TEXT", "\"_EM_27326_XYZ_\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/news?" + 
                    "authorId=px4J%2CC&" + 
                    "country=_EM_27325_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_6_getOnNewsReturnsEmptyListUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 7L)
                .d("ID", "-4123782286192401408")
                .d("AUTHOR_ID", "\"VmW3kQxhTJBucT\"")
                .d("COUNTRY", "\"_EM_638_XYZ_\"")
                .d("CREATION_TIME", "\"2044-08-07 19:49:05\"")
                .d("TEXT", "\"adMTAhHc9\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "_EM_64_XYZ_")
                .get(baseUrlOfSut + "/news?" + 
                    "authorId=_EM_637_XYZ_&" + 
                    "country=GyXa2kPxF")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_7_getOnNewsReturnsEmptyListUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 243L)
                .d("ID", "453")
                .d("AUTHOR_ID", "\"wy8K5EN1YLLHhywi\"")
                .d("COUNTRY", "\"XFQzBzA7xXVno3\"")
                .d("CREATION_TIME", "\"2048-11-26 21:24:46\"")
                .d("TEXT", "\"_EM_4058_XYZ_\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/news?" + 
                    "authorId=_EM_2665_XYZ_&" + 
                    "country=I&" + 
                    "EMextraParam123=_EM_2666_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_8_getOnNewsReturnsEmptyListUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 2513L)
                .d("ID", "223")
                .d("AUTHOR_ID", "\"wPyy3l_tnLnbhNj\"")
                .d("COUNTRY", "\"Dp\"")
                .d("CREATION_TIME", "\"2090-11-16 02:06:31\"")
                .d("TEXT", "\"jnmLZ\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/news?" + 
                    "authorId=_EM_48671_XYZ_&" + 
                    "country=7W_soY2za0MN99ME")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_9_getOnNewReturnsObjectUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 243L)
                .d("ID", "0")
                .d("AUTHOR_ID", "\"_EM_11433_XYZ_\"")
                .d("COUNTRY", "\"XFQzBzA7xXVno3\"")
                .d("CREATION_TIME", "\"2048-11-26 21:24:46\"")
                .d("TEXT", "\"_EM_4058_XYZ_\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/news/0")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'newsId'", containsString("0"))
                .body("'authorId'", containsString("_EM_11433_XYZ_"))
                .body("'text'", containsString("_EM_4058_XYZ_"))
                .body("'country'", containsString("XFQzBzA7xXVno3"))
                .body("'creationTime'", containsString("2048-11-26T21:24:46-03:00"));
    }
    
    
    @Test(timeout = 60000)
    public void test_10_getOnNewReturnsObjectUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 376L)
                .d("ID", "624")
                .d("AUTHOR_ID", "\"\"")
                .d("COUNTRY", "\"_EM_5802_XYZ_\"")
                .d("CREATION_TIME", "\"1919-03-27 06:28:08\"")
                .d("TEXT", "\"_EM_5803_XYZ_\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/news/624?" + 
                    "EMextraParam123=INIV&" + 
                    "authorId=u8hxh")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'newsId'", containsString("624"))
                .body("'authorId'", containsString(""))
                .body("'text'", containsString("_EM_5803_XYZ_"))
                .body("'country'", containsString("_EM_5802_XYZ_"))
                .body("'creationTime'", containsString("1919-03-27T06:28:08-04:16:48"));
    }
    
    
    @Test(timeout = 60000)
    public void test_11_getOnNewReturnsObjectUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 391L)
                .d("ID", "269")
                .d("AUTHOR_ID", "\"_EM_6024_XYZ_\"")
                .d("COUNTRY", "\"j77e3m77a\"")
                .d("CREATION_TIME", "\"2031-05-22 08:23:11\"")
                .d("TEXT", "\"ebKwnzZSa9\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/news/269?country=_EM_6026_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'newsId'", containsString("269"))
                .body("'authorId'", containsString("_EM_6024_XYZ_"))
                .body("'text'", containsString("ebKwnzZSa9"))
                .body("'country'", containsString("j77e3m77a"))
                .body("'creationTime'", containsString("2031-05-22T08:23:11-03:00"));
    }
    
    
    @Test(timeout = 60000)
    public void test_12_getOnNewsReturns1ElementUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 49L)
                .d("ID", "548")
                .d("AUTHOR_ID", "\"X\"")
                .d("COUNTRY", "\"zAb97bQBXz_\"")
                .d("CREATION_TIME", "\"1919-11-04 22:10:53\"")
                .d("TEXT", "\"JGlwVtvJs\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/news")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("size()", equalTo(1))
                .body("[0].'newsId'", containsString("548"))
                .body("[0].'authorId'", containsString("X"))
                .body("[0].'text'", containsString("JGlwVtvJs"))
                .body("[0].'country'", containsString("zAb97bQBXz_"))
                .body("[0].'creationTime'", containsString("1919-11-04T22:10:53-04:16:48"));
    }
    
    
    @Test(timeout = 60000)
    public void test_13_postOnNewsReturns201UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 1185L)
                .d("ID", "336")
                .d("AUTHOR_ID", "\"LtcdQ2r6\"")
                .d("COUNTRY", "\"Qvz8smZIJAXJ\"")
                .d("CREATION_TIME", "\"2032-11-09 01:19:07\"")
                .d("TEXT", "\"_EM_20505_XYZ_\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "")
                .contentType("application/json;charset=UTF-8")
                .body(" { " + 
                    " \"authorId\": \"_EM_20503_XYZ_\", " + 
                    " \"country\": \"Tonga\", " + 
                    " \"text\": \"C\" " + 
                    " } ")
                .post(baseUrlOfSut + "/news?authorId=LtcdQ2r6")
                .then()
                .statusCode(201)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body(containsString("1"));
    }
    
    
    @Test(timeout = 60000)
    public void test_14_postOnNewsReturns201UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 243L)
                .d("ID", "453")
                .d("AUTHOR_ID", "\"wy8K5EN1YLLHhywi\"")
                .d("COUNTRY", "\"XFQzBzA7xXVno3\"")
                .d("CREATION_TIME", "\"2048-11-26 21:24:46\"")
                .d("TEXT", "\"_EM_4058_XYZ_\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "")
                .contentType("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .body(" { " + 
                    " \"authorId\": \"_EM_4056_XYZ_\", " + 
                    " \"country\": \"Papua New Guinea\", " + 
                    " \"text\": \"vZX35ZqhJLmzH30\" " + 
                    " } ")
                .post(baseUrlOfSut + "/news?" + 
                    "country=w_%3F3DWtb3_JFpAnx&" + 
                    "authorId=_EM_2656_XYZ_")
                .then()
                .statusCode(201)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body(containsString("1"));
    }
    
    
    @Test(timeout = 60000)
    public void test_15_postOnNewsReturns201UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 377L)
                .d("ID", "-81")
                .d("AUTHOR_ID", "\"_EM_5826_XYZ_\"")
                .d("COUNTRY", "\"ClEwPpIGwc4\"")
                .d("CREATION_TIME", "\"2071-09-16 17:44:39\"")
                .d("TEXT", "\"ArirxZV\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "_EM_2654_XYZ_")
                .contentType("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .body(" { " + 
                    " \"authorId\": \"FgP\", " + 
                    " \"country\": \"Papua New Guinea\", " + 
                    " \"text\": \"vZX35ZqhJLmzI30\" " + 
                    " } ")
                .post(baseUrlOfSut + "/news?EMextraParam123=_EM_2653_XYZ_")
                .then()
                .statusCode(201)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body(containsString("1"));
    }
    
    
    @Test(timeout = 60000)
    public void test_16_deleteOnNewReturns204UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 207L)
                .d("ID", "211")
                .d("AUTHOR_ID", "\"q1FOvVuDx2w2Ae1\"")
                .d("COUNTRY", "\"rrdK0nx\"")
                .d("CREATION_TIME", "\"1906-07-16 14:00:09\"")
                .d("TEXT", "\"kn1N2fCT3lSf\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "PDJ1TPNL0IoXl5")
                .delete(baseUrlOfSut + "/news/211?EMextraParam123=_EM_3460_XYZ_")
                .then()
                .statusCode(204)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_17_deleteOnNewReturns204UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 456L)
                .d("ID", "366")
                .d("AUTHOR_ID", "\"uo_cY\"")
                .d("COUNTRY", "\"_EM_16348_XYZ_\"")
                .d("CREATION_TIME", "\"2087-10-11 07:45:01\"")
                .d("TEXT", "\"_IS2gZiIkk\"")
            .and().insertInto("NEWS_ENTITY", 207L)
                .d("ID", "211")
                .d("AUTHOR_ID", "\"_EM_16347_XYZ_\"")
                .d("COUNTRY", "\"rrdKr0nx\"")
                .d("CREATION_TIME", "\"1906-07-16 14:00:09\"")
                .d("TEXT", "\"kn1N2fCT3lSf\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .delete(baseUrlOfSut + "/news/211?" + 
                    "country=rrdKr0nx&" + 
                    "authorId=_EM_16347_XYZ_")
                .then()
                .statusCode(204)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_18_deleteOnNewReturns204UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 456L)
                .d("ID", "0")
                .d("AUTHOR_ID", "\"_EM_23684_XYZ_\"")
                .d("COUNTRY", "\"\"")
                .d("CREATION_TIME", "\"2087-10-11 07:45:01\"")
                .d("TEXT", "\"_IS2gZiIkkM\"")
            .and().insertInto("NEWS_ENTITY", 207L)
                .d("ID", "211")
                .d("AUTHOR_ID", "\"_EM_23683_XYZ_\"")
                .d("COUNTRY", "\"rrdK0nx\"")
                .d("CREATION_TIME", "\"1906-07-16 14:00:09\"")
                .d("TEXT", "\"kn1N2fCT3lSf\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .delete(baseUrlOfSut + "/news/211?" + 
                    "country=rrdK0nx&" + 
                    "authorId=_EM_23683_XYZ_")
                .then()
                .statusCode(204)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_19_putOnTextReturns204UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 25L)
                .d("ID", "-8388040")
                .d("AUTHOR_ID", "\"_EM_3188_XYZ_\"")
                .d("COUNTRY", "\"_EM_774_XYZ_\"")
                .d("CREATION_TIME", "\"1936-03-01 16:51:48\"")
                .d("TEXT", "\"\"_EM_356_XYZ_\"\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("text/plain")
                .body("_EM_356_XYZ_")
                .put(baseUrlOfSut + "/news/-8388040/text?EMextraParam123=_EM_357_XYZ_")
                .then()
                .statusCode(204)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_20_putOnTextReturns204UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 286L)
                .d("ID", "768")
                .d("AUTHOR_ID", "\"hjDgV9AmteMrYBfV\"")
                .d("COUNTRY", "\"United Arab Emirates\"")
                .d("CREATION_TIME", "\"2042-09-15 12:35:55\"")
                .d("TEXT", "\"_EM_4413_XYZ_\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("text/plain")
                .body("hjDgV9AmteMrYBfV")
                .put(baseUrlOfSut + "/news/768/text?" + 
                    "EMextraParam123=42&" + 
                    "country=wWl5na_bwlWjxLDN")
                .then()
                .statusCode(204)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_21_putOnTextReturns204UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 286L)
                .d("ID", "768")
                .d("AUTHOR_ID", "\"hjDgV9AmteMrYBf\"")
                .d("COUNTRY", "\"United Arab Emirates\"")
                .d("CREATION_TIME", "\"2042-09-15 12:35:55\"")
                .d("TEXT", "\"\"hjDgV9AmteMrYBfV\"\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .contentType("text/plain")
                .body("hjDgV9AmteNrYBfV")
                .put(baseUrlOfSut + "/news/768/text?" + 
                    "EMextraParam123=42&" + 
                    "authorId=hjDgV9AmteMrYBf")
                .then()
                .statusCode(204)
                .assertThat()
                .body(isEmptyOrNullString());
    }


}
