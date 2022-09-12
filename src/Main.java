import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int value;
        value = 22;
        System.out.println("до применения метода value=" + value);
        changeValue(value);
        System.out.println("после применения метода value=" + value);
        Integer valueInteger = 22;
        System.out.println("до применения метода valueInteger=" + valueInteger);
        changeValueInteger(valueInteger);
        System.out.println("после применения метода Integer  value=" + valueInteger);
        value = setValue(value);
        System.out.println("после присваивания резуьтата метода setValue value=" + value);
        Integer[] arrayValue = {3, 4};
        changeArrayValue(arrayValue);
        System.out.println("после применения метода arrayValue value=" + Arrays.toString(arrayValue));
        changeArrayElement(arrayValue);
        System.out.println("после применения метода arrayElement value=" + Arrays.toString(arrayValue));
        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println(person);
        Person.changePerson(person);
        System.out.println(person);
        Person.changePersonFields(person);
        System.out.println(person);
    }

    public static void changeValue(int value) {
        value = 33;
    }

    public static Integer changeValueInteger(Integer value) {
        value = 33;
        return value;
    }

    public static void changeArrayValue(Integer[] arrayValue) {
        arrayValue = new Integer[]{1, 2};
    }

    public static void changeArrayElement(Integer[] arrayValue) {
        arrayValue[0] = 99;
    }

    public static int setValue(int value) {
        value = 33;
        return value;
    }
}