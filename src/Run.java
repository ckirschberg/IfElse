public class Run
{
    public static void main(String[] args)
    {
        Person person1 = new Person("Peter", "Jensen", 12, true);

        System.out.println("Is persons age 12: " + person1.isAge(12));
        System.out.println("Is persons name Peter Jensen: " + person1.IsPersonsName("Peter Jensen"));
        System.out.println("Is persons name not Peter Jensen: " + person1.IsPersonsNameNot("Peter Jensen"));
        System.out.println("Is persons age 12 and name NOT Peter Jensen: " + person1.IsPersonsNameNotButAgeIs("Peter Jensen", 12));
        System.out.println("Is persons age 12 and name Peter Jensen: " + person1.IsPersonAgeAndName("Peter Jensen", 12));
        System.out.println("Is persons age 12 and name not Peter Jensen: " + person1.IsPersonsNameNotButAgeIs("Peter Jensen", 12));

        System.out.println("Is person identical: " + person1.IsPersonIdentical("Peter Jensen", 12, true));

        System.out.println("Is name case insensitive: " + person1.IsPersonsNameCaseInsensitive("peter Jensen"));
        System.out.println("Age group: " + person1.WhichAgeGroup());
    }
}