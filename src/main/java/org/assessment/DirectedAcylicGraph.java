package org.assessment;
import java.util.*;

public class DirectedAcylicGraph {
    private final Map<String, List<String>> graph = new HashMap<>();

    public void addEdge(String source, String destination) {
        if (!graph.containsKey(source)) {
            graph.put(source, new ArrayList<>());
        }
        graph.get(source).add(destination);
    }

    private boolean isCyclicUtil(String node, Set<String> visited, Set<String> recStack) {
        if (recStack.contains(node)) return true;
        if (visited.contains(node)) return false;

        visited.add(node);
        recStack.add(node);

        List<String> children = graph.get(node);
        if (children != null) {
            for (String child : children) {
                if (isCyclicUtil(child, visited, recStack)) return true;
            }
        }

        recStack.remove(node);
        return false;
    }

    public boolean isDAG() {
        Set<String> visited = new HashSet<>();
        Set<String> recStack = new HashSet<>();

        for (String node : graph.keySet()) {
            if (isCyclicUtil(node, visited, recStack)) {
                return false;
            }
        }
        return true;
    }
}

