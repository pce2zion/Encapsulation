package org.example;

public class Player {
    private String name;
    private Integer health = 100;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Player(String name, Integer health) {
        this.name = name;

        if(health > 0 && health <= 100){
            this.health = health;
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }

    public Integer looseHealth(int damage){
        this.health -= damage;
      //  int newHealth = setHealth(getHealth()));
        return this.health;
    }

    public int healthStatus(){
        return  this.health;
    }
}
