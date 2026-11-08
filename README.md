<h1>java-binary-tree-toolkit</h1>
<p>Clean Object-Oriented Binary Search Tree (BST) implementation with recursive traversal, dynamic insertion, and frequency analysis in Java</p>

<h2>Project description</h2>
<p>This project implements fundamental tree-based data structures and recursive traversal algorithms from scratch in Java without external collections:</p>
<ol>
  <li>Encapsulates tree nodes using a lightweight pointer-based model (<code>Node</code>) containing left and right sub-branches.</li>
  <li>
    <dl>
      <dt>Implements core Binary Search Tree operations:</dt>
      <dd><b>Dynamic Insertion (<code>add</code>):</b> Recursively balances branch placement based on key comparison (<i>O(log n)</i> average time complexity).</dd>
      <dd><b>Recursive Lookup (<code>search</code>):</b> Navigates left/right sub-trees to locate target nodes efficiently.</dd>
      <dd><b>Frequency Counter (<code>countOccurrences</code>):</b> Traverses all tree branches via Depth-First Search (DFS) to compute the total occurrence count of a specified value.</dd>
    </dl>
  </li>
  <li>Provides a standalone demonstration in <code>Main.java</code> verifying node population, subtree consistency, and frequency metrics.</li>
</ol>

<h2>Project files</h2>
<table>
  <tr>
    <th colspan="2">java-binary-tree-toolkit</th>
  </tr>
  <tr>
    <td>src/Node.java</td>
    <td>Elementary node structure storing data value and left/right references</td>
  </tr>
  <tr>
    <td>src/BinaryTree.java</td>
    <td>Core tree container providing insertion, search, and recursive DFS counting methods</td>
  </tr>
  <tr>
    <td>src/Main.java</td>
    <td>Execution runner and sample dataset demonstration</td>
  </tr>
  <tr>
    <td>README.md</td>
    <td>Project documentation and architectural specification</td>
  </tr>
  <tr>
    <td>.gitignore</td>
    <td>Exclusion rules for compiled bytecode (.class) and IntelliJ / Eclipse configurations</td>
  </tr>
</table>

<h2>Installation and launch</h2>
<ol>
  <b>
    <li>
      <dl>
        <dt>Clone the repository</dt>
        <dd>
          <code>git clone https://github.com/Kyoryuu-lab/java-binary-tree-toolkit.git</code>
        </dd>
        <dd>
          <code>cd java-binary-tree-toolkit</code>
        </dd>
      </dl>
    </li>
  </b>
  <b>
    <li>
      <dl>
        <dt>Compile Java source files</dt>
        <dd>
          <code>javac -d bin src/*.java</code>
        </dd>
      </dl>
    </li>
  </b>
  <b>
    <li>
      <dl>
        <dt>Execute the application</dt>
        <dd>
          <code>java -cp bin Main</code>
        </dd>
      </dl>
    </li>
  </b>
</ol>

<h2>Example of console output</h2>
<samp>
  <p>
    ========================================================================<br />
    &nbsp;&nbsp;BINARY SEARCH TREE (BST) DEMONSTRATION &amp; ANALYSIS<br />
    ========================================================================<br />
    [*] Initializing empty BinaryTree instance...<br />
    [*] Inserting node sequence: [1, 2, 3, 2, 4]<br />
    <br />
    --- Tree Traversal &amp; Search Queries ---<br />
    Target value to locate : 3<br />
    Lookup Status          : Found (Node address verified)<br />
    <br />
    --- Frequency &amp; Occurrence Metric ---<br />
    Target element to count: 2<br />
    Number of occurrences of 2: 2<br />
    ========================================================================<br />
    &nbsp;&nbsp;TEST EXECUTION COMPLETED SUCCESSFULLY.<br />
    ========================================================================<br />
  </p>
</samp>
