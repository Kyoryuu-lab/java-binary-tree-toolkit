public class BinaryTree {
    public Node root;

    public BinaryTree() {
        this.root = null;
    }

    // Добавление элемента
    public void add(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            addRecursive(root, value);
        }
    }

    // Рекурсивная вставка (<= позволяет сохранять дубликаты в левом поддереве)
    private void addRecursive(Node current, int value) {
        if (value <= current.value) {
            if (current.left == null) {
                current.left = new Node(value);
            } else {
                addRecursive(current.left, value);
            }
        } else {
            if (current.right == null) {
                current.right = new Node(value);
            } else {
                addRecursive(current.right, value);
            }
        }
    }

    // Поиск узла по значению
    public Node search(int x) {
        return searchRecursive(root, x);
    }

    private Node searchRecursive(Node current, int x) {
        if (current == null || current.value == x) {
            return current;
        }
        if (x < current.value) {
            return searchRecursive(current.left, x);
        }
        return searchRecursive(current.right, x);
    }

    // Подсчет количества вхождений числа в дерево (DFS)
    public int countOccurrences(Node current, int x) {
        if (current == null) {
            return 0;
        }
        int count = (current.value == x) ? 1 : 0;
        count += countOccurrences(current.left, x);
        count += countOccurrences(current.right, x);
        return count;
    }
}
