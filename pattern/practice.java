
import java.util.*;


public class practice {
    static class hashmap<K,V>{
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key= key;
                this.value=value;
            }
        }

        private int N;//bi
        private int n;//di
        private LinkedList<Node>bucket[];//N
        

        public hashmap(){
            this.N=4;
            this.bucket=new LinkedList[4];

            for(int i=0;i<N;i++){
                 this.bucket[i]=new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int bi=key.hashCode();
            return Math.abs(bi)%N;
        }

        private int searchLl(K key,int  bi){
            LinkedList<Node>ll=bucket[bi];
            for(int i=0;i<ll.size();i++){
                if (ll.get(i).key.equals(key)){
                    return i;
                }
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldBucket[]=bucket;
            bucket=new LinkedList[N*2];
            for(int i=0; i<bucket.length;i++){
                bucket[i]=new LinkedList<>();
            }

            for(int i=0;i<oldBucket.length;i++){
                LinkedList<Node>ll=oldBucket[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    put(node.key, node.value);
                }
            }
        }


        private void put(K key, V value){
            int  bi=hashFunction(key);
            int di=searchLl(key,bi);

            if(di==-1){
                bucket[bi].add(new Node(key, value));
                n++;
            }else{
               Node node=bucket[bi].get(di);
               node.value=value;
            }
            double lambda=n/N;
            if(lambda>2.0){
                rehash();
            }
        }

        private boolean containKey(K key){
             int  bi=hashFunction(key);
            int di=searchLl(key,bi);

            if(di==-1){
                return false;
            }else{
              return true;
            }
        }

        private V get(K key){
            int  bi=hashFunction(key);
            int di=searchLl(key,bi);

            if(di==-1){
                return null;
            }else{
               Node node=bucket[bi].get(di);
               return node.value;
            }
        }

        private V remove(K key){
            int  bi=hashFunction(key);
            int di=searchLl(key,bi);

            if(di==-1){
                return null;
            }else{
               Node node=bucket[bi].remove(di);
               return node.value;
            }
        }

        private ArrayList<K> keyset(){
            ArrayList<K>keys=new ArrayList<>();
            for(int i=0;i<bucket.length;i++){
                LinkedList<Node>ll=bucket[i];
                for(int j=0; j<ll.size();j++) {
                    Node node =ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }


    }
    public static void main(String args[]) {
        hashmap<String, Integer> map = new hashmap<>();
        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 50);
        // map.remove("India");
        System.out.println("China: " + map.get("China"));
    }
    
}
