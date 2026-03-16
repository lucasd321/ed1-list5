# PT-BR: Estruturas de Dados: Manipulação de Arrays em Java

Este repositório contém uma série de implementações em Java focadas em algoritmos fundamentais de manipulação de arrays. O objetivo destes exercícios é demonstrar conceitos de **complexidade de tempo $O(n)$**, gerenciamento de memória e lógica de ponteiros em estruturas sequenciais.

## 🚀 Conteúdo do Repositório

O projeto está dividido em 5 desafios lógicos:

### 1. Inserção com Deslocamento (Shift Right)

Implementação de um algoritmo que insere um elemento em uma posição específica do array. Para isso, todos os elementos à direita do índice desejado são deslocados uma posição para a frente, ilustrando o custo linear de inserção em listas estáticas.

### 2. Redimensionamento Dinâmico (Dynamic Resizing)

Simulação do comportamento de um `ArrayList`. O programa detecta quando o array atingiu sua capacidade máxima e, automaticamente, cria um novo array com o **dobro do tamanho**, migrando os dados para permitir novas inserções.

### 3. Exclusão com Deslocamento (Shift Left)

Algoritmo para remover um valor específico de um arranjo. Ao encontrar o valor, o programa reorganiza a estrutura movendo todos os itens subsequentes para a esquerda, garantindo que não existam "buracos" ou espaços vazios entre os dados válidos.

### 4. Remoção de Duplicatas

Um exercício avançado de busca e manutenção. O algoritmo percorre o array identificando valores repetidos e remove as ocorrências extras, reorganizando o vetor a cada remoção para manter a continuidade dos dados.

### 5. Fusão de Arrays Ordenados (Merge)

Implementação da lógica base do algoritmo *Merge Sort*. O programa recebe dois arrays que já estão em ordem crescente e os funde em um terceiro array. A fusão é feita de forma eficiente, comparando elemento a elemento simultaneamente, sem a necessidade de métodos de ordenação externos.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 17+
* **Conceitos:** Algoritmos de ordenação, Complexidade de Algoritmos (Big O), Gerenciamento de Memória.

## 🧠 O que aprendi com estes exercícios

* A diferença entre **Capacidade** (espaço total) e **Tamanho** (elementos presentes).
* Por que inserções e remoções em arrays possuem custo $O(n)$.
* A importância de evitar lacunas em estruturas de dados sequenciais.
* Lógica de redimensionamento para criar estruturas de dados flexíveis.

---

# ENGLISH: Data Structures: Array Manipulation in Java

This repository contains a series of Java implementations focused on fundamental array manipulation algorithms. The goal of these exercises is to demonstrate concepts of **O(n) time complexity**, memory management, and pointer logic in sequential structures.

## 🚀 Repository Content

The project is divided into 5 logic challenges:

### 1. Shift Right Insertion

Implementation of an algorithm that inserts an element at a specific position in the array. To do this, all elements to the right of the desired index are shifted one position forward, illustrating the linear cost of insertion in static lists.

### 2. Dynamic Resizing

Simulation of the behavior of an `ArrayList`. The program detects when the array has reached its maximum capacity and automatically creates a new array with **twice the size**, migrating the data to allow for new insertions.

### 3. Shift-Left Deletion

Algorithm to remove a specific value from an array. Upon finding the value, the program reorganizes the structure by moving all subsequent items to the left, ensuring that there are no "holes" or empty spaces between valid data.

### 4. Duplicate Removal

An advanced search and maintenance exercise. The algorithm traverses the array identifying repeated values ​​and removes the extra occurrences, reorganizing the vector after each removal to maintain data continuity.

### 5. Merge of Sorted Arrays

Implementation of the basic logic of the *Merge Sort* algorithm. The program receives two arrays that are already in ascending order and merges them into a third array. Merging is done efficiently, comparing element by element simultaneously, without the need for external sorting methods.

---

## 🛠️ Technologies Used

* **Language:** Java 17+
* **Concepts:** Sorting algorithms, Algorithm Complexity (Big O), Memory Management.

## 🧠 What I learned from these exercises

* The difference between **Capacity** (total space) and **Size** (elements present).

* Why insertions and removals in arrays have a cost of $O(n)$.

* The importance of avoiding gaps in sequential data structures.

* Resizing logic to create flexible data structures.

---
