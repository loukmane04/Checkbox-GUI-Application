Checkbox GUI Application
This Java program creates a graphical user interface (GUI) application that allows users to select and deselect checkboxes for different shapes: circle, triangle, and square. It also provides buttons to clear the selected checkboxes and display the current selected state.

Prerequisites
Java Development Kit (JDK) installed on your system.
A Java IDE or text editor for code editing.
How to Run
Open your terminal or command prompt.

Navigate to the directory where you have saved the Java source code file (Main.java).

Compile the code using the javac command:

bash
Copy code
javac Main.java
Run the compiled Java program:

bash
Copy code
java Main
Usage
Upon running the program, a GUI window will appear with the following components:

Three checkboxes for selecting shapes: circle, triangle, and square.
Two buttons: "RAZ" and "STATE."
The interface is divided into three panels with different background colors (black, blue, and orange).
Check the checkboxes to select the shapes you want.

Click the "RAZ" button to clear the selected checkboxes.

Click the "STATE" button to display the currently selected shapes in the console.

How it Works
The program uses Java's Swing library to create the GUI components.

It implements the ActionListener interface to handle button clicks and checkbox selections.

When the "STATE" button is clicked, the program checks which checkboxes are selected and prints the selected shapes to the console.

When the "RAZ" button is clicked, all checkboxes are deselected.

Customization
You can customize this program by modifying the code to add more checkboxes, buttons, or other GUI elements. You can also change the appearance of the GUI, such as colors, layout, and window size, to suit your preferences.

Feel free to explore and enhance this simple GUI application according to your needs!
