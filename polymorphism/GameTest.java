class Character {
String name;
Character(String name) {
this.name = name;
}
void attack() {
System.out.println(name + " performs a basic attack");
}
}
class Warrior extends Character {
Warrior(String name) {
super(name);
}
@Override
void attack() {
System.out.println(name + " swings a sword ");
}
}
class Mage extends Character {
Mage(String name) {
super(name);
}
@Override
void attack() {
System.out.println(name + " casts a fire spell ");
}
}
class Archer extends Character {
Archer(String name) {
super(name);
}
@Override
void attack() {
System.out.println(name + " shoots an arrow");
}
}
public class GameTest {
public static void main(String[] args) {
Character c1 = new Warrior("Arjun");
Character c2 = new Mage("Riya");
Character c3 = new Archer("Kabir");
c1.attack();
c2.attack();
c3.attack();
}
}
