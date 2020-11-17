package ru.geekbrains.algorithms.lesson7;

public class Homework7 {

    public static void main(String[] args) {
        getRoute(createGraph());
    }

    private static void getRoute(Graph graph) {
        graph.addEdges("Москва", "Тула", "Рязань", "Калуга");
        graph.addEdge("Тула", "Липецк");
        graph.addEdge("Рязань", "Тамбов");
        graph.addEdge("Калуга", "Орел");
        graph.addEdge("Липецк", "Воронеж");
        graph.addEdge("Тамбов", "Саратов");
        graph.addEdge("Орел", "Курск");
        graph.addEdge("Саратов", "Воронеж");
        graph.addEdge("Курск", "Воронеж");

        graph.getShortRoute("Москва", "Воронеж");
    }

    private static Graph createGraph() {
        Graph graph = new Graph(10);
        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");
        graph.addVertex("Липецк");
        graph.addVertex("Тамбов");
        graph.addVertex("Орел");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");
        graph.addVertex("Воронеж");
        return graph;
    }

}
