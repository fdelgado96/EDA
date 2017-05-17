import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Tob on 17/05/2017.
 */
public  class Graph<V, A extends Arc> {

    protected class Node{
        public V info;
        public boolean visited;
        public List<Arc> adj;

        public Node(V info){
            this.info = info;
            this.visited = false;
            this.adj = new ArrayList<Arc>();
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((info == null) ? 0:info.hashCode());
            return result;
        }

        public boolean equals(Object obj){
            if(this == obj)
                return true;
            if(obj == null)
                return false;
            if(getClass() != obj.getClass())
                return false;
            Node other = (Node)obj;
            if(info == null) {
                if (other.info != null)
                    return false;
            }
            else if(!info.equals(other.info))
                return false;
            return true;

        }
    }

    protected class Arc {
        public A info;
        public Node neighbor;

        public Arc(A info, Node neighbor){
            this.info = info;
            this.neighbor = neighbor;
        }
    }

    protected HashMap<V, Node> nodes;
    protected List<Node> nodeList;

    public Graph(){
        this.nodes = new HashMap<>();
        this.nodeList = new ArrayList<>();
    }

    public boolean isEmpty(){return nodeList.isEmpty();}

    public void AddVertex(V vertex){
        if(!nodes.containsKey(vertex))
    }


}
