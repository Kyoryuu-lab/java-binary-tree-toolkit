public class Main {
    public static void main(String[] args) {
        System.out.println("========================================================================");
        System.out.println("  BINARY SEARCH TREE (BST) DEMONSTRATION & ANALYSIS");
        System.out.println("========================================================================");

        BinaryTree tree = new BinaryTree();

        // 1. Заполнение дерева данными
        int[] values = {1, 2, 3, 2, 4};
        System.out.print("[*] Inserting node sequence: [");
        for (int i = 0; i < values.length; i++) {
            tree.add(values[i]);
            System.out.print(values[i] + (i < values.length - 1 ? ", " : ""));
        }
        System.out.println("]");

        // 2. Тестирование поиска
        System.out.println("\n--- Tree Traversal & Search Queries ---");
        int targetSearch = 3;
        Node foundNode = tree.search(targetSearch);
        System.out.println("Target value to locate : " + targetSearch);
        System.out.println("Lookup Status          : " + (foundNode != null ? "Found (Node verified)" : "Not Found"));

        // 3. Подсчет дубликатов / частоты
        System.out.println("\n--- Frequency & Occurrence Metric ---");
        int targetCount = 2;
        int occurrences = tree.countOccurrences(tree.root, targetCount);
        System.out.println("Target element to count: " + targetCount);
        System.out.println("Number of occurrences of " + targetCount + ": " + occurrences);

        System.out.println("========================================================================");
        System.out.println("  TEST EXECUTION COMPLETED SUCCESSFULLY.");
        System.out.println("========================================================================");
    }
}
