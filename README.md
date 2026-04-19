# AD-W9-GROUP1

<h1>Kamen Rider OOO Driver Simulation System</h1>
<p><Kamen Raider OOO Driver Simulation System, become a kamen raider to fill you inner heart desire./p>
<h3> Group Member : <h3>
<li>
    <ol>Angelinn Gozal</ol>
    <ol>Bryan Thungadhi Jaya</ol>
    <ol>Chris Brilianto Chandra</ol>
    <ol>Justin Tandiawan
</ol>

<h2>Compiling & Running the program</h2>

<p>Follow these steps to set up the project on your local machine:

1. Clone the Repository Open your terminal and run the following command to download the source code:

>git clone (https://github.com/RejuvenationCh/AD-W9-GROUP1.git)

2. Navigate to the Project Directory

>cd AD-W9-GROUP1

3. Compile the Source Code Compile all Java files into bytecode. This will create .class files for each component:

>javac *.java

4. Run the Application Launch the simulation via the main entry point:

>java App

</p>

<h3>Collections Framework  </h3>
<p> EnumMap (OOODriver.java): Used to store medals. It is highly optimized for Enum keys, offering faster performance and lower memory footprint than a standard HashMap.

ArrayList (TransformationEngine.java & ComboCatalogue.java): Used for transformation history and rule storage. It provides dynamic resizing, allowing the system to scale without predefined limits.
</p
>
<h3> Generics </h3>
Type Safety - By using List<ComboRule> and Map<SlotType, CoreMedal>, we enforce strict type checking at compile-time. This prevents logic errors where an incorrect object type might be inserted into the belt or catalogue.

<h3> Exception Handling </h3>
try-catch Blocks (App.java): The program wraps user input parsing (using valueOf()) within a try-catch block.

<h3>Error Management</h3>
If a user enters an invalid medal name (e.g., a typo), the system catches the IllegalArgumentException and displays a clear error message instead of allowing the program to crash.

<h3>Key Features</h3>
Medal Management - Slot-based insertion (Head, Arms, Legs) ensuring physical accuracy.

Transformation Logic - Automated matching engine that distinguishes between "Combos" and "Mixed Forms."

Scanning Charge - Implements state tracking to detect consecutive scans for finishers.

History Log - A dynamic list that tracks every action taken during the session.