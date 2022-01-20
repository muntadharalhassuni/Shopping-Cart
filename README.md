# Shopping-Cart
	In this Cart System, I created a basic shopping cart system that reads from a file of default items and displays those items to the user in order to add them to their cart.
	A new item can be added at any time to the system and items can be removed from the system as well as from the cart. 

Work-Flow:
	The cart system starts by asking the user to select whether they would like to:

1. Add an item to the System:

In this case, the system asks the user to enter the new item's name, a description for the new item, the new item's price and the available quantity of the new item, finally, the new item will be added to the app. 
-------------------------------------
2. Add an item to the Cart: 

In this case, the system displays all of the available items in the app system and asks the user to enter the name of an item to added to the cart. The item will be added to the cart by searching the name for that item in the collection of items available in the app system. If the item has already been added to the cart, the quantity of that item in that cart is increased by one. 
-------------------------------------
3. Display Cart:
 
All the items in the cart are displayed, the system then calculates the sub-total by calculating the total sum of the products of the price and quantity of each item in the cart(Sum(item's Price * item's Quantity)). The sub-total is displayed along with the tax, which is (sub-total * 0.05), and the total, which (sub-total + tax) for all items in the cart. 
-------------------------------------
4.Display System: 

The system displays all the items that are available in the app.
------------------------------------- 
5. Remove an item from the cart: 

In this case, The system asks the user for the name of the item to be removed from the cart. 
-------------------------------------
6. Remove an item from the system:

 In this case, the system asks the user for the name of the item to be removed from the app. If an item is removed from the app, but it was already added to the cart. It will also be removed from the cart. 
-------------------------------------
7. Quit : 

The option terminates the program. 
