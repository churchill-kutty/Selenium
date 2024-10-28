$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\java\\Meesho\\Meesho.feature");
formatter.feature({
  "name": "Meesho application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add to cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user should be navigate the product",
  "keyword": "Given "
});
formatter.match({
  "location": "Meesho_AddCart_Product.userShouldBeNavigateTheProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Should be move to the Cursor in men link and click on casual shoe",
  "keyword": "And "
});
formatter.match({
  "location": "Meesho_AddCart_Product.userShouldBeMoveToTheCursorInMenLinkAndClickOnCasualShoe()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Should be Click on Adab trendy men Casul Shoes",
  "keyword": "And "
});
formatter.match({
  "location": "Meesho_AddCart_Product.userShouldBeClickOnAdabTrendyMenCasulShoes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be Select the Size number7",
  "keyword": "And "
});
formatter.match({
  "location": "Meesho_AddCart_Product.userShouldBeSelectTheSizeNumber(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be Click on AddCart",
  "keyword": "And "
});
formatter.match({
  "location": "Meesho_AddCart_Product.userShouldBeClickOnAddCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "AddCart Should be Succesfull",
  "keyword": "Then "
});
formatter.match({
  "location": "Meesho_AddCart_Product.addcartShouldBeSuccesfull()"
});
formatter.result({
  "status": "passed"
});
});