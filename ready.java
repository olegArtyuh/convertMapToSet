import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("Kot1", new Cat("Misha"));
        map.put("Kot2", new Cat("Oleg"));
        map.put("Kot3", new Cat("Sanya"));
        map.put("Kot4", new Cat("Zheka"));
        map.put("Kot5", new Cat("Mika"));
        map.put("Kot6", new Cat("Vaska"));
        map.put("Kot7", new Cat("Zumba"));
        map.put("Kot8", new Cat("Vorons"));
        map.put("Kot9", new Cat("Lalka"));
        map.put("Kot10", new Cat("Sheila"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cats = new HashSet<Cat>();
        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            cats.add(pair.getValue());
        } return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat:set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;
        public Cat(String name) {
            this.name = name;
        }
        public String toString() {
            return "Cat "+this.name;
        }
    }
}