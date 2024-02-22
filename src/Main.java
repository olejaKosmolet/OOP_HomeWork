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

import Mage.Monk;
import Mage.Witch;
import Shooters.Crossbowman;
import Shooters.Sniper;
import Warriors.Peasant;
import Warriors.Rogue;
import Warriors.Spearman;

public class Main {
    public static void main(String[] args) {
        Peasant peasant1 = new Peasant("Bob", 1, "sickle", 10, 3, 1,1,1);
        System.out.println(peasant1.toString());
        Rogue rogue1 = new Rogue("Sonya", 5, "knife", 12, 8, 10, 4, 3);
        System.out.println(rogue1.toString());
        Sniper sniper1 = new Sniper("Tom", 2, "rifle", 10, 7, 9, 40, 10);
        System.out.println(sniper1.toString());
        Witch witch1 = new Witch("Helga", 2, "magic wand", 8, 5, 35, "fire", 5);
        System.out.println(witch1.toString());
        Spearman spearman1 = new Spearman("Joe", 15, "pique", 20, 6, 5, 5, 10);
        System.out.println(spearman1.toString());
        Crossbowman crossbowman1 = new Crossbowman("Vika", 2, "crossbow", 3, 5, 15, 30, 16);
        System.out.println(crossbowman1.toString());
        Monk monk1 = new Monk("Rick", 4, "staff", 10, 6, 30, 10, 10);
        System.out.println(monk1.toString());
    }
}