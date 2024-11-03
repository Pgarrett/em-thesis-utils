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
import static org.hamcrest.Matchers.*;
import  io.restassured.config.JsonConfig;
import  io.restassured.path.json.config.JsonPathConfig;
import static io.restassured.config.RedirectConfig.redirectConfig;
import static org.evomaster.client.java.controller.contentMatchers.NumberMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.StringMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.SubStringMatcher.*;




/**
*  This file was automatically generated by EvoMaster on 2024-11-03T01:04:45.173-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 6 tests
 * <br>
*  Covered targets: 22
 * <br>
*  Used time: 0h 16m 12s
 * <br>
*  Needed budget for current results: 89%
 * <br>
*  This file contains test cases that represent successful calls.
*/
public class EvoMaster_successes_Test {

    
    private static String baseUrlOfSut = "http://localhost:8080";
    
    
    @BeforeClass
    public static void initClass() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.urlEncodingEnabled = false;
        RestAssured.config = RestAssured.config()
            .jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.DOUBLE))
            .redirect(redirectConfig().followRedirects(false));
    }
    
    
    
    
    
    
    
    
    @Test(timeout = 60000)
    public void test_0_getOnCountriesReturns247Elements() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/countries")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(247))
                .body("", hasItems("Afghanistan", "Åland Islands", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "The Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bonaire", "Bosnia and Herzegovina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory", "United States Minor Outlying Islands", "British Virgin Islands", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Republic of the Congo", "Democratic Republic of the Congo", "Cook Islands", "Costa Rica", "Croatia", "Cuba", "Curaçao", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands", "Faroe Islands", "Fiji", "Finland", "France", "French Guiana", "French Polynesia", "French Southern and Antarctic Lands", "Gabon", "The Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guernsey", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard Island and McDonald Islands", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Ivory Coast", "Iran", "Iraq", "Republic of Ireland", "Isle of Man", "Israel", "Italy", "Jamaica", "Japan", "Jersey", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Republic of Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Federated States of Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "North Korea", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn Islands", "Poland", "Portugal", "Puerto Rico", "Qatar", "Republic of Kosovo", "Réunion", "Romania", "Russia", "Rwanda", "Saint Barthélemy", "Saint Helena", "Saint Kitts and Nevis", "Saint Lucia", "Saint Martin", "Saint Pierre and Miquelon", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "São Tomé and Príncipe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Sint Maarten", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia", "South Korea", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Svalbard and Jan Mayen", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "East Timor", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Wallis and Futuna", "Western Sahara", "Yemen", "Zambia", "Zimbabwe"));
    }
    
    
    @Test(timeout = 60000)
    public void test_1_getOnApi_docsReturnsObject() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/v2/api-docs")
                .then()
                .statusCode(200);
    }
    
    
    @Test(timeout = 60000)
    public void test_2_getOnNewsReturnsEmptyList() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .get(baseUrlOfSut + "/news?country=PQN")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_3_getOnNewsReturnsEmptyList() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .get(baseUrlOfSut + "/news?authorId=_f111yK")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_4_getOnNewsReturns2Elements() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .get(baseUrlOfSut + "/news")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("size()", equalTo(2))
                .body("[0].'newsId'", containsString("2"))
                .body("[0].'authorId'", containsString("0JsMqM_5npq7jk8T"))
                .body("[0].'text'", containsString("GrH"))
                .body("[0].'country'", containsString("Spain"))
                .body("[0].'creationTime'", containsString("2024-11-03T01:01:28.058-03:00"))
                .body("[1].'newsId'", containsString("4"))
                .body("[1].'authorId'", containsString("0JsMqM_5npq7jk8T"))
                .body("[1].'text'", containsString("GrH"))
                .body("[1].'country'", containsString("Spain"))
                .body("[1].'creationTime'", containsString("2024-11-03T01:03:41.09-03:00"));
    }
    
    
    @Test(timeout = 60000)
    public void test_5_postOnNewsReturns201() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .contentType("application/json;charset=UTF-8")
                .body(" { " + 
                    " \"authorId\": \"0JsMqM_5npq7jk8T\", " + 
                    " \"country\": \"Spain\", " + 
                    " \"text\": \"GrH\" " + 
                    " } ")
                .post(baseUrlOfSut + "/news")
                .then()
                .statusCode(201)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body(containsString("6"));
    }


}
