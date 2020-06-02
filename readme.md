Homework Revising Abstract Classes, Interfaces and Polymorphism.
# Theme Park
Learning Objectives
Practice modelling a large real world domain and what you have learned about using:

- classes
- inheritance
- abstract classes
- interfaces
- ThemePark

**MVP**

Classes and Abstract Classes

Look through the start code and understand what is set up for you already.

- Visitor class with age, height and money.
- Attraction abstract class with name, rating and visitCount (which starts at 0).
- Rollercoaster, Dodgems, Park and Playground classes which inherit from Attraction
- Stall abstract class which has name, owner name, rating and parking spot.
- CandyFlossStall. TobaccoStall and IceCreamStall which inherit from Stall.
- All of these classes have tests set up for them.

**Interfaces**

Introduce some Interfaces to enable charging, restricting and reviewing attractions and stalls:

- ITicketed promises double defaultPrice() and double priceFor(Visitor)
- ISecurity promises boolean isAllowedTo(Visitor)
- IReviewed promises int getRating() and String getName()

Have some of the classes implement these interfaces. 

Below are the rules about what the implementations should be:

- Playground implements ISecurity because it has a maximum age of 15
- TobaccoStall implements ISecurity because it has a minimum age of 18
- Rollercoster implements ISecurity and requires a visitor to be over 145cm tall and over 12 years of age
- All Stalls and Attractions implement IReviewed.
- Note: Starting prices are:
*  £8.40 for Rollercoaster
*  £4.50 for Dodgems
- Rollercoaster implements ITicketed and charges tall people over 200cm double fee
- Dodgems implements ITicketed and charge half price to children under 12 years old

Extensions

Create a ThemePark class to manage the attractions and stalls.

- ThemePark stores all Attractions and Stalls in it.
- ThemePark has a method getAllReviewed() which returns an ArrayList of IReviewed objects.
- Add an empty visitedAttractions ArrayList to Visitor which stores a list of Attractions and a method to add an attraction to the list.
- ThemePark has a method visit(Visitor, Attraction) calls for the attraction to increment its visitCount by 1 and adds the attraction to the visitors visitedAttractions list.

Advanced Extensions

- ThemePark has a method that can return a new HashMap<String, Integer> with all reviews. The HashMap will have a key of the name and value of review.
- ThemePark has a method getAllAllowedFor(Visitor) which takes a Visitor and returns an ArrayList of IReviewed that the visitor is allowed to go on.