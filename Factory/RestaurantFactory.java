package Factory;

public class RestaurantFactory {



    public Restaurant getRestaurant(String RestaurantType)
    {
        if(RestaurantType == null)
        {
            return null;
        }
        else if (RestaurantType.equalsIgnoreCase("Pizza"))
        {
            return new restaurant_Pizza();
        }
        else if (RestaurantType.equalsIgnoreCase("Mac"))
        {
            return new restaurant_Mac();

        }
        else if (RestaurantType.equalsIgnoreCase("KFC"))
        {
            return new restaurant_KFC();

        }
        

        return null;
        
    }
    
}
