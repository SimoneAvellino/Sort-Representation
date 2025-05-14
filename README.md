# Sorting Algorithm Visualizer

This project is a **Java-based graphical visualizer for sorting algorithms**. It allows users to visually observe how various sorting algorithms work, thanks to an intuitive GUI and a flexible strategy-based architecture. 

## Overview

The application generates a random array of integers and displays it in a graphical window. It then sorts the array using a specified sorting algorithm, updating the visualization in real time. The project is built using Java Swing and employs design patterns such as **Strategy** and **Observer** for modular and extensible logic. The UML is in `src/UML.png` .

## Features

- Visual representation of sorting steps.
- Pluggable sorting algorithms (easily extendable).
- Adjustable array length and sorting speed.
- Intuitive GUI using `MainFrame` and `ArrayViewerPanel`.

## Sorting Algorithms Included

The following sorting strategies are currently implemented:

- `SelectionSortStrategy`
- `QuickSortStrategy`
- `MergeSortStrategy`
- `InsertionSortStrategy`
- `HeapSortStrategy`
- `BubbleSortStrategy`
- `BogoSortStrategy` (for educational/demonstrative purposes)

Thanks to the **Strategy** design pattern is really easy to implement other sorting algoritms.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher.
- Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse) or CLI tools.

### How to Run

1. Clone or download the repository.
2. Open the project in your Java IDE.
3. Navigate to the `Main.java` file.
4. (Optional) Choose the sorting algorithm by setting the strategy:
   ```java
   private static SortStrategy strategy = new MergeSortStrategy(); // Change as needed
5. Run the `Main` class

