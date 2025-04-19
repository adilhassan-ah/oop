package com.adilhassan.interfaces;

public class Client {
  public static void main(String[] args) {
//    Battle battleOfKashmir = new BattleOfKashmir();
//    Battle battleOfPalestine = new BattleOfPalestine();

//    Fighter fighter1 = new Fighter("A", battleOfKashmir);
//    Fighter fighter2 = new Fighter("A", battleOfPalestine);

//    fighter1.fight();
//    fighter2.fight();

    Battle kashmir = new BattleOfKashmir();
    BattleOfPalestine palestine = new BattleOfPalestine();


    Battle[] battles = {kashmir, palestine};
    for (Battle battle : battles) {

      if (battle instanceof BattleOfKashmir) {
        BattleOfKashmir battleOfKashmir = (BattleOfKashmir) battle;
        battleOfKashmir.drive();
      }

      battle.fight();
    }

    Fighter fighter = new Fighter("X", kashmir);
    fighter.fight();

  }
}
