/*
* Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
* Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
* Создать абстрактный класс и иерархию наследников. Расположить классы в пакет так,
*  чтобы в основной программе небыло видно их полей. В не абстрактных классах переопределить метод toString() так,
*  чтобы он возвращал название класса или имя.
* Создать в основной программе по одному обьекту каждого не абстрактного класса и вывести в консоль его имя.

Формат сдачи:
Ссылка на гитхаб проект
Подписать фамилию и номер группы
*
* Крестьянин:            Разбойник:           Снайпер:           Колдун:
* Сила                   Ловкость             Ловкость           Мана
* Выносливость           Выносливость         Количество БП      Стихия
* Сопротивляемость       Уклонение            Меткость           Кол-во слов силы
*   Скорость атаки!         Скорость атаки!       Скорость атаки!     Скорость атаки!
*   Оружие!                 Оружие!               Оружие!             Оружие!
*   Броня!                  Броня!                Броня!              Броня!
*   Здоровье!               Здоровье!             Здоровье!           Здоровье!
*   Имя!                    Имя!                  Имя!                Имя!
*
* Копейщик:              Арбалетчик:          Монах:
* Сила                   Ловкость             Мана
* Уклонение              Количество БП        Выносливость
* Защита                 Меткость             Кол-во слов силы
*   Скорость атаки!         Скорость атаки!       Скорость атаки!     Скорость атаки!
*   Оружие!                 Оружие!               Оружие!             Оружие!
*   Броня!                  Броня!                Броня!              Броня!
*   Здоровье!               Здоровье!             Здоровье!           Здоровье!
*   Имя!                    Имя!                  Имя!                Имя!
*
*
* */

package Game;

import Game.AbstractUnit.AbstractUnit;
import Game.Mage.Monk;
import Game.Mage.Witch;
import Game.Shooters.Crossbowman;
import Game.Shooters.Sniper;
import Game.Warriors.Peasant;
import Game.Warriors.Rogue;
import Game.Warriors.Spearman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Peasant peasant1 = new Peasant(getName(), 0, 1);
        System.out.println(peasant1.toString());
        Rogue rogue1 = new Rogue(getName(), 0, 2);
        System.out.println(rogue1.toString());
        Sniper sniper1 = new Sniper(getName(), 0, 3);
        System.out.println(sniper1.toString());
        Witch witch1 = new Witch(getName(), 0,4);
        System.out.println(witch1.toString());
        Spearman spearman1 = new Spearman(getName(), 0, 5);
        System.out.println(spearman1.toString());
        Crossbowman crossbowman1 = new Crossbowman(getName(), 0, 6);
        System.out.println(crossbowman1.toString());
        Monk monk1 = new Monk(getName(), 0, 7);
        System.out.println(monk1.toString());*/

        int quantity = 10;
        Random rand = new Random();
        List<AbstractUnit> team1 = new ArrayList<>();
        List<AbstractUnit> team2 = new ArrayList<>();
        List<AbstractUnit> all = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < quantity; i++) {
            int value = rand.nextInt(7);
            switch (value){
                case 0:
                    team1.add(new Peasant(getName(), i, 9));
                    break;
                case 1:
                    team1.add(new Rogue(getName(), i, 9));
                    break;
                case 2:
                    team1.add(new Spearman(getName(), i, 9));
                    break;
                case 3:
                    team1.add(new Sniper(getName(), i, 9));
                    break;
                case 4:
                    team1.add(new Crossbowman(getName(), i, 9));
                    break;
                case 5:
                    team1.add(new Monk(getName(), i, 9));
                    break;
                case 6:
                    team1.add(new Witch(getName(), i, 9));
                    break;
            }
            switch (value){
                case 0:
                    team2.add(new Peasant(getName(), i, 0));
                    break;
                case 1:
                    team2.add(new Rogue(getName(), i, 0));
                    break;
                case 2:
                    team2.add(new Spearman(getName(), i, 0));
                    break;
                case 3:
                    team2.add(new Sniper(getName(), i, 0));
                    break;
                case 4:
                    team2.add(new Crossbowman(getName(), i, 0));
                    break;
                case 5:
                    team2.add(new Monk(getName(), i, 0));
                    break;
                case 6:
                    team2.add(new Witch(getName(), i, 0));
                    break;
            }
        }

        all.addAll(team1);
        all.addAll(team2);
        all.sort((o1, o2) -> o2.getSpeed() - o1.getSpeed());

        all.forEach(n -> n.print());

    }
    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }
}