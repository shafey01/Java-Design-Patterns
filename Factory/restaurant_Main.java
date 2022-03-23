package Factory;

import java.util.Scanner;

public class restaurant_Main {

    public static void main(String[] args) {
        RestaurantFactory restaurantFactory = new RestaurantFactory();
        
        System.out.println("Enter Restaturant name : ");
        Scanner obj = new Scanner(System.in);

        String Restaurant_Type = obj.nextLine();

        Restaurant restaurant = restaurantFactory.getRestaurant(Restaurant_Type);
        restaurant.order();
    }

}
