package com.adilhassan.interfaces;

public class Fighter {
  private String name;
  private Battle battle;

  public Fighter(String name, Battle battle) {
    this.name = name;
    this.battle = battle;
  }

  public void fight() {
    battle.fight();
  }
}
