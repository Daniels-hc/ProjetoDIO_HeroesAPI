package com.digitalinnovation.livecoding.config;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import static com.digitalinnovation.livecoding.constants.HeroesConstant.ENDPOINT_DYNAMO;
import static com.digitalinnovation.livecoding.constants.HeroesConstant.REGION_DYNAMO;

public class HeroesData {
  public static void main(String[] args) throws Exception {

    AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
      .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(ENDPOINT_DYNAMO, REGION_DYNAMO))
      .build();
    DynamoDB dynamoDB = new DynamoDB(client);

    Table table = dynamoDB.getTable("Heroes_Api_Table");

    Item hero1 = new Item()
            .withPrimaryKey("id", "1")
            .withString("name", "Thor")
            .withString("universe", "Marvel")
            .withNumber("films", 7);

    Item hero2 = new Item()
      .withPrimaryKey("id", "2")
      .withString("name", "Mulher Maravilha")
      .withString("universe", "DC Comics")
      .withNumber("films", 3);

    Item hero3 = new Item()
      .withPrimaryKey("id", "3")
      .withString("name", "Viuva Negra")
      .withString("universe", "Marvel")
      .withNumber("films", 6);

    Item hero4 = new Item()
      .withPrimaryKey("id", "4")
      .withString("name", "Capita Marvel")
      .withString("universe", "Marvel")
      .withNumber("films", 2);

    Item hero5 = new Item()
            .withPrimaryKey("id", "5")
            .withString("name", "Capitão America")
            .withString("universe", "Marvel")
            .withNumber("films", 7);

    Item hero6 = new Item()
            .withPrimaryKey("id", "6")
            .withString("name", "Batman")
            .withString("universe", "DC Comics")
            .withNumber("films", 10);

    Item hero7 = new Item()
            .withPrimaryKey("id", "7")
            .withString("name", "Homem de Ferro")
            .withString("universe", "Marvel")
            .withNumber("films", 8);

    Item hero8 = new Item()
            .withPrimaryKey("id", "8")
            .withString("name", "Superman")
            .withString("universe", "DC comics")
            .withNumber("films", 5);

    Item hero9 = new Item()
            .withPrimaryKey("id", "9")
            .withString("name", "Homem Aranha")
            .withString("universe", "Marvel")
            .withNumber("films", 10);

    PutItemOutcome outcome1 = table.putItem(hero1);
    PutItemOutcome outcome2 = table.putItem(hero2);
    PutItemOutcome outcome3 = table.putItem(hero3);
    PutItemOutcome outcome4 = table.putItem(hero4);
    PutItemOutcome outcome5 = table.putItem(hero5);
    PutItemOutcome outcome6 = table.putItem(hero6);
    PutItemOutcome outcome7 = table.putItem(hero7);
    PutItemOutcome outcome8 = table.putItem(hero8);
    PutItemOutcome outcome9 = table.putItem(hero9);

  }

}

