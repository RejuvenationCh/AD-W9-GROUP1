# AD-W9-GROUP1

# Kamen Rider OOO Driver Simulation System
Become a Kamen Rider and fulfill your inner heart's desire with this terminal-based simulation.

## Group Members
* Angelinn Gozal
* Bryan Thungadhi Jaya
* Chris Brilianto Chandra
* Justin Tandiawan

---

## Compiling & Running the Program
Follow this steps to set up the project on your local machine:

1. **Clone the Repository** Open your terminal and run the following command to download the source code:
   ```bash
   git clone https://github.com/RejuvenationCh/AD-W9-GROUP1.git
   
2. Navigate to the Project Directory

    ```bash
    cd AD-W9-GROUP1

3. Compile the Source Code Compile all Java files into bytecode. This will create .class files for each component:
    ```bash
    >javac *.java

4. Run the Application Launch the simulation via the main entry point:
    ```bash
    >java App

## Collections Framework
EnumMap (OOODriver.java)
Used to store medals. It is highly optimized for Enum keys, offering faster performance and a lower memory footprint than a standard HashMap.

ArrayList (TransformationEngine.java & ComboCatalogue.java)
Used for transformation history and rule storage. It provides dynamic resizing, allowing the system to scale without predefined limits.

## Generics
Type Safety: By using List<ComboRule> and Map<SlotType, CoreMedal>, we enforce strict type checking at compile-time. This prevents logic errors where an incorrect object type might be inserted into the belt or catalogue.

## Exception Handling
try-catch Blocks (App.java): The program wraps user input parsing (using valueOf()) within a try-catch block to ensure stability.

Error Management: If a user enters an invalid medal name (e.g., a typo), the system catches the IllegalArgumentException and displays a clear error message instead of allowing the program to crash.

## Key Features
Medal Management: Slot-based insertion (Head, Arms, Legs) ensuring physical accuracy.
Transformation Logic: Automated matching engine that distinguishes between "Combos" and "Mixed Forms."
Scanning Charge: Implements state tracking to detect consecutive scans for finishers.
History Log: A dynamic list that tracks every action taken during the session.
