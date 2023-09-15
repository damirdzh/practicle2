fun main(args: Array<String>) {
    //println("Hello World!")

    //z1

val age1: Int = 42;
    val age2: Int = 21;
    println (age1)
    println (age2)
    //z2

    val avg1: Int = (42+21)/2;
    println(avg1) //не выводит остаток
    //z3

    val avg2: Double = (42.0+21.0)/2;
    println(avg2)
    //z4

    val firstName: String = "Damir";
    val  lastName: String = "Dzhandar";
    println(firstName)
    println(lastName)
    //z5

    val fullName: String = firstName+ " "+lastName;
    println(fullName)
    //z6

    val myDetails: String = "Привет, меня зовут " + fullName;
    println(myDetails)
    //z7

    val triple = Triple (9, 7, 2023);
    println(triple)
    //z8

    val  month = triple.first
    val day = triple.second
    val  year = triple.third
    println(month)
    println(day)
    println(year)
   //z9



}