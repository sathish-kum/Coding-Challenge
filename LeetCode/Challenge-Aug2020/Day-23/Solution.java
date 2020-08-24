class StreamChecker {
    
    Trie root;
    
    StringBuilder sb;

    public StreamChecker(String[] words) {
        
        this.root = new Trie();
        this.sb = new StringBuilder();
        
        for(String str: words) {
            insert(str);
        }
        
        
    }
    
    private void insert(String word) {
        
        Trie curr = root;
        
        for(int i=word.length()-1;i>=0;i--) {
            
            char c = word.charAt(i);
            
            Trie next = curr.child[c-'a'];
            
            if(next==null) {
                next = new Trie();
                curr.child[c-'a'] = next;
            }
            
            curr = curr.child[c-'a'];
            
        }
        
        curr.eow = true;
        
    }
    
    public boolean query(char letter) {
        
        sb.append(letter);
        
        Trie curr = root;
        
        for(int i=sb.length()-1;i>=0;i--) {
            
            if(curr.child[sb.charAt(i)-'a']==null) {
                return false;
            }
            
            curr = curr.child[sb.charAt(i)-'a'];
            
            if(curr.eow) {
                return true;
            }
            
            
        }
        
        return false;
        
    }
}

class Trie {
    
    boolean eow;
    Trie child[];
    
    Trie() {
        this.eow = false;
        child = new Trie[26]; 
    }
}
