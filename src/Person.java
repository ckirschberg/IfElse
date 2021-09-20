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


    public boolean isAge(int age)
    {
        //return this.age == age;

        if(age == this.age) {
            return true;
        }
        return false;
    }

    //Code method that responds if name is the same as the parameter.
    public boolean IsPersonsName(String name)
    {
        //String fullName = firstname + " " + lastname;
        //if (fullName.equals(name)) {
        if (name.equals(firstname + " " + lastname)) {
            return true;
        } else {
            return false;
        }
    }

    //Here we want a method that responds true if the name of the personobject is NOT the same
    //as the parameter.
    public boolean IsPersonsNameNot(String name)
    {
        //if (!name.equals(firstname + " " + lastname)) {
        if (!IsPersonsName(name)) {
            return true;
        }
        return false;

    }

    //Not operator with other expression. Age must match and name must not match to return true
    public boolean IsPersonsNameNotButAgeIs(String name, int age)
    {
        if (age == this.age && IsPersonsNameNot(name)) {
            return true;
        }
        return false;

    }

    //return true if name and age are the same as this person and otherwise false
    public boolean IsPersonAgeAndName(String name, int age)
    {
        if (isAge(age) && IsPersonsName(name)) {
            return true;
        }
        return false;
    }

    //Only return true if all 3 parameters (name, age and male) are the same as the person object
    public boolean IsPersonIdentical(String name, int age, boolean male)
    {
        if (IsPersonAgeAndName(name, age) && this.male == male) {
            return true;
        }
        return false;
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

        if (age >= 0 && age <= 5) {
            return "Small Child";
        } else if (age >= 6 && age <= 12) {
            return "Child";
        } else if (age >= 13 && age <= 19) {
            return "Teenager";
        } else if (age >= 20 && age <= 45) {
            return "Adult";
        } else if (age >= 46 && age <= 60) {
            return "Mid age";
        } else if (age >= 61 && age <= 75) {
            return "Old";
        } else if (age > 76 ){
            return "Very Old";
        }

        return "Not Defined";
    }


    /////////////
    // Extended / Difficult
    ////////////
    // Hint: Google for how to compare "Case insensitive" if you did not notice how when you read the chapter in the book.
    // The suggestions (after you hit the . after object name, can also help you...
    public boolean IsPersonsNameCaseInsensitive(String name)
    {
        if (name.equalsIgnoreCase(firstname + " " +  lastname)) {
            return true;
        }
        return false;
    }
}