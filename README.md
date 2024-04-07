# DAG
A demo showcasing Directed Acyclic Graph (DAG) based Dependency Graph.

A demo showcasing Directed Acyclic Graph (DAG) based Dependency Graph. Make sure to cover all edge cases and be prepared to talk about them (How are you making sure that the dependency graph passed is a DAG?) Prepare examples for both happy and unhappy test cases.

# Edge Cases and Considerations

Self Loops: The current implementation does not explicitly handle self-loops (a node that depends on itself). Adding a check in addEdge to prevent edges where source equals destination would handle this case.

Disconnected Graph: The algorithm works for both connected and disconnected graphs since it iterates over all nodes.

Multiple Edges: The current implementation does not prevent adding multiple identical edges between the same nodes. While this does not affect the DAG property check, it could be considered unnecessary. Ensuring uniqueness in the adjacency list could be an optimization.