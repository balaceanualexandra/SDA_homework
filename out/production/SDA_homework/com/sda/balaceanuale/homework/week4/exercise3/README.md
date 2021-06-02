Do as many as you like. DM me anytime for help
1. Create a Car class with the fields: brand, model, number of doors
2. Make the fields private and generate getters for them
3. Create a constructor with all the parameters
4. Validate in the constructor that the received brand and model are not null or empty strings.
5. validate in the constructor that the number of doors is a positive value.
6. Create a Engine class with the fields: horse power, capacity
7. Make the fields private and generate getters for them
8. Create a constructor with all the parameters
9. Validate in the constructor that the horse power and the capacity are values > 0
10. In the Car class, declare a field of type Engine (meaning: private Engine engine;)
11. Update the constructor to receive the engine as parameter as well
12. Create a getter for the engine as well
    Optional:
13. Create a stateless CarManager class with method:
  - Given a List of Cars and a brand as parameters, return the cars of that model
14. Create a few cars and print out the informations of them. You can generate the toString method to help you with that.
    (You need to first create the Engine object and pass it to the Car's constructor)