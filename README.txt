This is a sample application that uses Java Swing and SQLite to demonstrate how easy it is to use them. 

SQLite defines itself as follows (from sqlite.org): SQLite is a self-contained, high-reliability, embedded, full-featured, public-domain, SQL database engine. SQLite is the most used database engine in the world.

In simpler words, it is a simple SQL engine that does not require anything other than a single file. If you install it from its homepage, it comes with a simple command line client. You can use SQLite Browser (http://sqlitebrowser.org/) for a graphical user interface, if you'd like to. 

SQLite is a popular solution; it has all basic SQL commands, such as CREATE TABLE, INSERT, UPDATE, etc. Make sure you look at its documentation for the syntax. There are differences from other SQL engines, such as MySQL (http://www.sqlite.org/docs.html). 

In order to use SQLite with Java, we need a connector. The lib/ directory here includes this file. I've downloaded it from https://github.com/xerial/sqlite-jdbc. You can check this web site to see how you can use it. I've used pieces of codes from there, as well. 

Finally, Swing is Java's user interface. It is easy to learn and use. I've talked about listeners before. You can see examples here as well. 

The structure of the application is as follows; the Main function creates a MainWindow, called MyWindow. This Window creates a simple two panel user interface. On the left there is a list, on the right there is a text field and there are two buttons. Whatever you write to the text field is added to the list, and also into the database with the "Add to list" button. The other button loops from the database and creates popup windows to display the elements of the list. That is all. 

When you look at MyWindow.java, you can see that I've used widgets (window gadgets, such as text fields, buttons) and added them to the panels. These panels can have layouts. I chose the most basic one: Flow Layout. See a list of layouts here: https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html

Then, you can see that I've created two classes to handle the events for the buttons. One of them is ButtonListener.java, which simply adds the text to the list and to the database. The other one is DBLister, which connects to the database and popups elements one by one. 

The most important class is MyDBConnection.java. This file is the global access point to the database. I've created a Singleton class. You can read about the Singleton pattern here: https://sourcemaking.com/design_patterns/singleton - In short, it allows only one instance of an object to be created. Notice that the constructor is private. Therefore you cannot write

MyDBConnection myconn = new MyDBConnection();

because it is private. Instead you call the static MyDBConnection.getInstance() which returns the single instance. This instance can execute three functions; an insert function, a loop function that popups windows and another function which returns the list of elements in the database so that I can restore them when the application restarts. Thanks to this, the data is persistent. I can quit the application, run it again, and the data will be there... 

Java DB connector has "prepared statement" where you can prepare statements such as the variable "ekle" - which inserts a new record to the database. This speeds up the process, and it also makes it possible to create a simple function to which I can pass the variables that will be saved to the database. 

The ResultSet is a collection that is returned after a "SELECT" query, so that you can loop through it. The code is self-explaining. All I do is while I loop, I ask for the field "name". I know that this field is a string, so I use the "getString" method of the ResultSet.

Well, I believe this will give you a boost if you are thinking of using Java and SQLite... I hope it helps... 