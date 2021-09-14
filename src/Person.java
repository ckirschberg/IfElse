//See Table 4.1 in Building Java Programs for valid operators
//See end of chapter 4, Building Java Programs for more if-else exercises.

public class Person
{
    private String firstname;
    private String lastname;
    private int age;
    private boolean male; //note: male=true means a male, male=false means a female (SORRY all women!!)
    // (We learn a more intuitive way to do this later)

    public Person(String firstname, String lastname, int age, boolean male) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.male = male;
    }

    //The methods has to work no matter what the actual values
    //are for the personobject in question!


    //The idea here is we want an answer to the question:
    //Is this persons age 15? (true or false?)
    public boolean isAge(int age)
    {
        //Your code here.
        return true;
    }

    //Code method that responds if name is the same as the parameter.
    public boolean IsPersonsName(String name)
    {
        return true;
    }

    //Here we want a method that responds true if the name of the personobject is NOT the same
    //as the parameter.
    public boolean IsPersonsNameNot(String name)
    {
        return true;
    }

    //Not operator with other expression. Age must match and name must not match to return true
    public boolean IsPersonsNameNotButAgeIs(String name, int age)
    {
        return true;
    }

    //return true if name and age are the same as this person and otherwise false
    public boolean IsPersonAgeAndName(String name, int age)
    {
        return true;
    }

    //Only return true if all 3 parameters (name, age and male) are the same as the person object
    public boolean IsPersonIdentical(String name, int age, boolean male)
    {
        return true;
    }


    //age between 0 - 5: return "Small Child"
    //age between 6 - 12: return "Child"
    //age between 13 - 19: return "Teenager"
    //age between 20 - 45: return "Adult"
    //age between 46 - 60: return "Mid age"
    //age between 61 - 75: return "Old"
    //age between 76 and up: return "Very Old"
    public String WhichAgeGroup()
    {
        return "";
    }


    /////////////
    // Extended / Difficult
    ////////////
    // Hint: Google for how to compare "Case insensitive" if you did not notice how when you read the chapter in the book.
    // The suggestions (after you hit the . after object name, can also help you...
    public boolean IsPersonsNameCaseInsensitive(String name)
    {
        return true;
    }
}