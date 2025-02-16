<!-- TOC -->
* [Задачи для освоения BCEL](#задачи-для-освоения-bcel)
    * [1. Вывод "Hello, World!"](#1-вывод-hello-world)
    * [2. Сложение двух чисел](#2-сложение-двух-чисел)
    * [3. Умножение двух чисел](#3-умножение-двух-чисел)
    * [4. Вычисление факториала (итеративно)](#4-вычисление-факториала-итеративно)
    * [5. Проверка четности числа](#5-проверка-четности-числа)
    * [6. Поиск максимума в массиве](#6-поиск-максимума-в-массиве)
    * [7. Обратный порядок массива](#7-обратный-порядок-массива)
    * [8. Подсчет количества положительных чисел в массиве](#8-подсчет-количества-положительных-чисел-в-массиве)
    * [9. Сортировка пузырьком](#9-сортировка-пузырьком)
    * [10. Рекурсивное вычисление факториала](#10-рекурсивное-вычисление-факториала)
    * [11. Вывод чисел Фибоначчи](#11-вывод-чисел-фибоначчи)
    * [12. Подсчет количества слов в строке](#12-подсчет-количества-слов-в-строке)
    * [13. Поиск подстроки в строке](#13-поиск-подстроки-в-строке)
    * [14. Проверка палиндрома](#14-проверка-палиндрома)
    * [15. Быстрая сортировка массива](#15-быстрая-сортировка-массива)
    * [16. Обход дерева в глубину](#16-обход-дерева-в-глубину)
    * [17. Обход дерева в ширину](#17-обход-дерева-в-ширину)
    * [18. Обратная польская нотация](#18-обратная-польская-нотация)
    * [19. Валидация скобок в строке](#19-валидация-скобок-в-строке)
    * [20. Решение задачи "Рюкзак"](#20-решение-задачи-рюкзак)
* [Tasks for Mastering BCEL](#tasks-for-mastering-bcel)
    * [1. Print "Hello, World!"](#1-print-hello-world)
    * [2. Adding Two Numbers](#2-adding-two-numbers)
    * [3. Multiplying Two Numbers](#3-multiplying-two-numbers)
    * [4. Calculating Factorial (Iterative)](#4-calculating-factorial-iterative)
    * [5. Checking Even Number](#5-checking-even-number)
    * [6. Finding Maximum in an Array](#6-finding-maximum-in-an-array)
    * [7. Reversing an Array](#7-reversing-an-array)
    * [8. Counting Positive Numbers in an Array](#8-counting-positive-numbers-in-an-array)
    * [9. Bubble Sort](#9-bubble-sort)
    * [10. Recursive Factorial Calculation](#10-recursive-factorial-calculation)
    * [11. Printing Fibonacci Numbers](#11-printing-fibonacci-numbers)
    * [12. Counting Words in a String](#12-counting-words-in-a-string)
    * [13. Finding Substring in a String](#13-finding-substring-in-a-string)
    * [14. Checking Palindrome](#14-checking-palindrome)
    * [15. Quick Sort Array](#15-quick-sort-array)
    * [16. Depth-First Tree Traversal](#16-depth-first-tree-traversal)
    * [17. Breadth-First Tree Traversal](#17-breadth-first-tree-traversal)
    * [18. Reverse Polish Notation](#18-reverse-polish-notation)
    * [19. Validating Parentheses in a String](#19-validating-parentheses-in-a-string)
    * [20. Solving the "Knapsack" Problem](#20-solving-the-knapsack-problem)
<!-- TOC -->

# Задачи для освоения BCEL

### 1. Вывод "Hello, World!"
**Вводная:** Используйте `GETSTATIC`, `LDC`, `INVOKEVIRTUAL` и `RETURN`. В BCEL используйте `InstructionFactory` для создания вызова метода `println`.  
**Условие:** Реализуйте метод `void printHelloWorld()`, который выводит "Hello, World!" на консоль.

### 2. Сложение двух чисел
**Вводная:** Используйте `ILOAD`, `IADD`, `ISTORE`, `RETURN`. В BCEL используйте `createLoad`, `createStore`.  
**Условие:** Реализуйте метод `int add(int a, int b)`, который возвращает сумму `a` и `b`.

### 3. Умножение двух чисел
**Вводная:** Используйте `ILOAD`, `IMUL`, `ISTORE`, `RETURN`. В BCEL используйте `createLoad`, `createStore`.  
**Условие:** Реализуйте метод `int multiply(int a, int b)`, который возвращает произведение `a` и `b`.

### 4. Вычисление факториала (итеративно)
**Вводная:** Используйте `ILOAD`, `IMUL`, `ISTORE`, `IFGT`, `GOTO`, `ICONST_1`. В BCEL используйте циклы.  
**Условие:** Реализуйте метод `int factorial(int n)`, который возвращает факториал числа `n`.

### 5. Проверка четности числа
**Вводная:** Используйте `ILOAD`, `IREM`, `IFNE`, `ICONST_0`, `ICONST_1`, `RETURN`. В BCEL используйте условные переходы.  
**Условие:** Реализуйте метод `boolean isEven(int n)`, который возвращает `true`, если число четное.

### 6. Поиск максимума в массиве
**Вводная:** Используйте `ALOAD`, `IALOAD`, `IF_ICMPGT`, `GOTO`, `RETURN`. В BCEL используйте массивы.  
**Условие:** Реализуйте метод `int findMax(int[] data)`, который возвращает максимальное значение в массиве.

### 7. Обратный порядок массива
**Вводная:** Используйте `ALOAD`, `IALOAD`, `IASTORE`, `GOTO`, `IF_ICMPGE`. В BCEL используйте циклы и массивы.  
**Условие:** Реализуйте метод `void reverse(int[] data)`, который меняет порядок элементов массива на обратный.

### 8. Подсчет количества положительных чисел в массиве
**Вводная:** Используйте `ILOAD`, `IFGT`, `IINC`, `GOTO`, `RETURN`. В BCEL используйте циклы и условные проверки.  
**Условие:** Реализуйте метод `int countPositive(int[] data)`, который возвращает количество положительных чисел в массиве.

### 9. Сортировка пузырьком
**Вводная:** Используйте `ALOAD`, `IALOAD`, `IASTORE`, `IF_ICMPGT`, `SWAP`, `GOTO`. В BCEL используйте циклы и массивы.  
**Условие:** Реализуйте метод `void bubbleSort(int[] data)`, который сортирует массив методом пузырька.

### 10. Рекурсивное вычисление факториала
**Вводная:** Используйте `ILOAD`, `IFLE`, `IMUL`, `IRETURN`. В BCEL используйте рекурсию.  
**Условие:** Реализуйте метод `int factorialRecursive(int n)`, который возвращает факториал числа `n` рекурсивно.

### 11. Вывод чисел Фибоначчи
**Вводная:** Используйте `ILOAD`, `IADD`, `ISTORE`, `GOTO`. В BCEL используйте циклы.  
**Условие:** Реализуйте метод `void printFibonacci(int n)`, который выводит первые `n` чисел Фибоначчи.

### 12. Подсчет количества слов в строке
**Вводная:** Используйте `ALOAD`, `INVOKEVIRTUAL`, `IFNULL`, `GOTO`. В BCEL используйте строки и вызовы методов.  
**Условие:** Реализуйте метод `int countWords(String text)`, который возвращает количество слов в строке.

### 13. Поиск подстроки в строке
**Вводная:** Используйте `ALOAD`, `INVOKEVIRTUAL`, `IFNE`, `GOTO`. В BCEL используйте строки и условные проверки.  
**Условие:** Реализуйте метод `boolean containsSubstring(String text, String sub)`, который возвращает `true`, если `text` содержит `sub`.

### 14. Проверка палиндрома
**Вводная:** Используйте `ALOAD`, `IALOAD`, `IF_ICMPNE`, `GOTO`. В BCEL используйте циклы и строки.  
**Условие:** Реализуйте метод `boolean isPalindrome(String text)`, который возвращает `true`, если строка является палиндромом.

### 15. Быстрая сортировка массива
**Вводная:** Используйте `ALOAD`, `IALOAD`, `IASTORE`, `IF_ICMPGT`, `SWAP`, `GOTO`, `INVOKEVIRTUAL`. В BCEL используйте рекурсию и массивы.  
**Условие:** Реализуйте метод `void quickSort(int[] data)`, который сортирует массив методом быстрой сортировки.

### 16. Обход дерева в глубину
**Вводная:** Используйте `ALOAD`, `INVOKEVIRTUAL`, `IFNULL`, `GOTO`. В BCEL используйте рекурсию и структуры данных.  
**Условие:** Реализуйте метод `void depthFirstTraversal(TreeNode node)`, который обходит бинарное дерево в глубину.

### 17. Обход дерева в ширину
**Вводная:** Используйте `ALOAD`, `INVOKEVIRTUAL`, `IFNULL`, `GOTO`. В BCEL используйте очереди и структуры данных.  
**Условие:** Реализуйте метод `void breadthFirstTraversal(TreeNode node)`, который обходит бинарное дерево в ширину.

### 18. Обратная польская нотация
**Вводная:** Используйте `ILOAD`, `IADD`, `ISUB`, `IMUL`, `IDIV`, `IF_ICMPEQ`. В BCEL используйте стеки.  
**Условие:** Реализуйте метод `int evaluateRPN(String expression)`, который вычисляет значение выражения в обратной польской нотации.

### 19. Валидация скобок в строке
**Вводная:** Используйте `ALOAD`, `INVOKEVIRTUAL`, `IF_ICMPEQ`, `GOTO`. В BCEL используйте стеки и строки.  
**Условие:** Реализуйте метод `boolean isValidParentheses(String s)`, который проверяет, правильно ли расставлены скобки в строке.

### 20. Решение задачи "Рюкзак"
**Вводная:** Используйте `ILOAD`, `IADD`, `IF_ICMPGT`, `GOTO`, `INVOKEVIRTUAL`. В BCEL используйте динамическое программирование.  
**Условие:** Реализуйте метод `int knapsack(int[] weights, int[] values, int capacity)`, который решает задачу "Рюкзак".

---

# Tasks for Mastering BCEL

### 1. Print "Hello, World!"
**Introduction:** Use `GETSTATIC`, `LDC`, `INVOKEVIRTUAL`, and `RETURN`. In BCEL, use `InstructionFactory` to create a `println` method call.  
**Condition:** Implement the method `void printHelloWorld()` that prints "Hello, World!" to the console.

### 2. Adding Two Numbers
**Introduction:** Use `ILOAD`, `IADD`, `ISTORE`, `RETURN`. In BCEL, use `createLoad`, `createStore`.  
**Condition:** Implement the method `int add(int a, int b)` that returns the sum of `a` and `b`.

### 3. Multiplying Two Numbers
**Introduction:** Use `ILOAD`, `IMUL`, `ISTORE`, `RETURN`. In BCEL, use `createLoad`, `createStore`.  
**Condition:** Implement the method `int multiply(int a, int b)` that returns the product of `a` and `b`.

### 4. Calculating Factorial (Iterative)
**Introduction:** Use `ILOAD`, `IMUL`, `ISTORE`, `IFGT`, `GOTO`, `ICONST_1`. In BCEL, use loops.  
**Condition:** Implement the method `int factorial(int n)` that returns the factorial of `n`.

### 5. Checking Even Number
**Introduction:** Use `ILOAD`, `IREM`, `IFNE`, `ICONST_0`, `ICONST_1`, `RETURN`. In BCEL, use conditional jumps.  
**Condition:** Implement the method `boolean isEven(int n)` that returns `true` if the number is even.

### 6. Finding Maximum in an Array
**Introduction:** Use `ALOAD`, `IALOAD`, `IF_ICMPGT`, `GOTO`, `RETURN`. In BCEL, use arrays.  
**Condition:** Implement the method `int findMax(int[] data)` that returns the maximum value in the array.

### 7. Reversing an Array
**Introduction:** Use `ALOAD`, `IALOAD`, `IASTORE`, `GOTO`, `IF_ICMPGE`. In BCEL, use loops and arrays.  
**Condition:** Implement the method `void reverse(int[] data)` that reverses the order of elements in the array.

### 8. Counting Positive Numbers in an Array
**Introduction:** Use `ILOAD`, `IFGT`, `IINC`, `GOTO`, `RETURN`. In BCEL, use loops and conditional checks.  
**Condition:** Implement the method `int countPositive(int[] data)` that returns the number of positive numbers in the array.

### 9. Bubble Sort
**Introduction:** Use `ALOAD`, `IALOAD`, `IASTORE`, `IF_ICMPGT`, `SWAP`, `GOTO`. In BCEL, use loops and arrays.  
**Condition:** Implement the method `void bubbleSort(int[] data)` that sorts the array using the bubble sort method.

### 10. Recursive Factorial Calculation
**Introduction:** Use `ILOAD`, `IFLE`, `IMUL`, `IRETURN`. In BCEL, use recursion.  
**Condition:** Implement the method `int factorialRecursive(int n)` that returns the factorial of `n` recursively.

### 11. Printing Fibonacci Numbers
**Introduction:** Use `ILOAD`, `IADD`, `ISTORE`, `GOTO`. In BCEL, use loops.  
**Condition:** Implement the method `void printFibonacci(int n)` that prints the first `n` Fibonacci numbers.

### 12. Counting Words in a String
**Introduction:** Use `ALOAD`, `INVOKEVIRTUAL`, `IFNULL`, `GOTO`. In BCEL, use strings and method calls.  
**Condition:** Implement the method `int countWords(String text)` that returns the number of words in the string.

### 13. Finding Substring in a String
**Introduction:** Use `ALOAD`, `INVOKEVIRTUAL`, `IFNE`, `GOTO`. In BCEL, use strings and conditional checks.  
**Condition:** Implement the method `boolean containsSubstring(String text, String sub)` that returns `true` if `text` contains `sub`.

### 14. Checking Palindrome
**Introduction:** Use `ALOAD`, `IALOAD`, `IF_ICMPNE`, `GOTO`. In BCEL, use loops and strings.  
**Condition:** Implement the method `boolean isPalindrome(String text)` that returns `true` if the string is a palindrome.

### 15. Quick Sort Array
**Introduction:** Use `ALOAD`, `IALOAD`, `IASTORE`, `IF_ICMPGT`, `SWAP`, `GOTO`, `INVOKEVIRTUAL`. In BCEL, use recursion and arrays.  
**Condition:** Implement the method `void quickSort(int[] data)` that sorts the array using the quicksort method.

### 16. Depth-First Tree Traversal
**Introduction:** Use `ALOAD`, `INVOKEVIRTUAL`, `IFNULL`, `GOTO`. In BCEL, use recursion and data structures.  
**Condition:** Implement the method `void depthFirstTraversal(TreeNode node)` that performs a depth-first traversal of a binary tree.

### 17. Breadth-First Tree Traversal
**Introduction:** Use `ALOAD`, `INVOKEVIRTUAL`, `IFNULL`, `GOTO`. In BCEL, use queues and data structures.  
**Condition:** Implement the method `void breadthFirstTraversal(TreeNode node)` that performs a breadth-first traversal of a binary tree.

### 18. Reverse Polish Notation
**Introduction:** Use `ILOAD`, `IADD`, `ISUB`, `IMUL`, `IDIV`, `IF_ICMPEQ`. In BCEL, use stacks.  
**Condition:** Implement the method `int evaluateRPN(String expression)` that evaluates the value of an expression in reverse Polish notation.

### 19. Validating Parentheses in a String
**Introduction:** Use `ALOAD`, `INVOKEVIRTUAL`, `IF_ICMPEQ`, `GOTO`. In BCEL, use stacks and strings.  
**Condition:** Implement the method `boolean isValidParentheses(String s)` that checks if the parentheses are correctly placed in the string.

### 20. Solving the "Knapsack" Problem
**Introduction:** Use `ILOAD`, `IADD`, `IF_ICMPGT`, `GOTO`, `INVOKEVIRTUAL`. In BCEL, use dynamic programming.  
**Condition:** Implement the method `int knapsack(int[] weights, int[] values, int capacity)` that solves the "Knapsack" problem.