# POO-tp-finle
Program Overview:
The program models a PC (Personal Computer) and its components such as the CPU (Central Processing Unit), RAM (Random Access Memory), and various peripherals like monitors and keyboards. It calculates the power consumption of the PC based on its components and peripherals and throws a custom exception if the power consumption exceeds a certain threshold.

Classes and Their Responsibilities:

ConsoException: This class defines a custom exception ConsoException that is thrown when the power consumption of the PC exceeds a certain threshold (1000 watts). It extends the built-in Exception class.
UC: Represents the central processing unit (CPU) of the PC. It contains attributes such as CPU frequency, RAM capacity, and power consumption. It also provides methods to get and set these attributes.
Peripherique: Abstract class representing a peripheral device connected to the PC. It contains common attributes such as ID and model and defines an abstract method calculerPuissance() to calculate the power consumption of the peripheral.
Clavier: Subclass of Peripherique representing a keyboard peripheral. It calculates power consumption based on the number of keys and a constant power value.
Moniteur: Subclass of Peripherique representing a monitor peripheral. It calculates power consumption based on its classification, dimensions, and maximum resolution.
PC: Represents the PC itself, composed of a CPU (UC) and an array of peripherals (Peripherique). It provides methods to calculate the total power consumption (calConsoElec()) and a constructor to initialize the PC with its components.
Main Method:

The main method in the PC class serves as a test case for the program. It creates a sample PC configuration with a CPU, monitor, and keyboard, and then calculates the power consumption for a duration of 5 hours. If the power consumption exceeds the threshold, it catches and handles the ConsoException by printing an error message.

Design Considerations:

The program uses object-oriented principles to model the components of a PC and their relationships.
Exception handling is used to handle exceptional scenarios such as excessive power consumption.
The program is modular, with each class responsible for a specific aspect of the PC configuration and functionality.
Potential Improvements:

Error handling could be enhanced by providing more informative error messages or additional error checks.
More peripheral types could be added to the system to make the simulation more realistic.
Input validation could be implemented to ensure that valid parameters are provided during PC configuration.
Overall, the program provides a basic framework for simulating a PC and calculating its power consumption, demonstrating object-oriented design principles and exception handling in Java.
