
public class Trio implements MenuItem {

Sandwich sandwich;
Salad salad; 
Drink drink;

Public Trio(Sandwich sand, Salad sal, Drink dri)
{
    sandwich = sand;
    salad = sal;
    drink = dri;
}

String getName()
{
    return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + "/ Trio";
}

double getPrice()
{
    if(sandwich.getPrice() > salad.getPrice() && sandwich.getPrice() > drink.getPrice())

        if(salad.getPrice() > drink.getPrice())
            return sandwich.getPrice() + salad.getPrice();
        else
            return sandwich.getPrice() + drink.getPrice();

    else if(sandwich.getPrice() < salad.getPrice() && salad.getPrice() > drink.getPrice())

        if(sandwich.getPrice() > drink.getPrice())
            return sandwich.getPrice() + salad.getPrice();
        else
            return salad.getPrice() + drink.getPrice();

    else 

        if(sandwich.getPrice() > salad.getPrice())
            return sandwich.getPrice() + drink.getPrice();
        else   
            return salad.getprice() + drink.getPrice();
}

}
