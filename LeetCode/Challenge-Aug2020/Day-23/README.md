# Stream of Characters

Implement the StreamChecker class as follows:

**StreamChecker(words):** Constructor, init the data structure with the given words.<br/>
**query(letter):** returns true if and only if for some k >= 1, the last k characters queried (in order from oldest to newest, including this letter just queried) spell one of the words in the given list.
 

**Example:**

StreamChecker streamChecker = new StreamChecker(["cd","f","kl"]); // init the dictionary.<br/>
streamChecker.query('a');          // return false<br/>
streamChecker.query('b');          // return false<br/>
streamChecker.query('c');          // return false<br/>
streamChecker.query('d');          // return true, because 'cd' is in the wordlist<br/>
streamChecker.query('e');          // return false<br/>
streamChecker.query('f');          // return true, because 'f' is in the wordlist<br/>
streamChecker.query('g');          // return false<br/>
streamChecker.query('h');          // return false<br/>
streamChecker.query('i');          // return false<br/>
streamChecker.query('j');          // return false<br/>
streamChecker.query('k');          // return false<br/>
streamChecker.query('l');          // return true, because 'kl' is in the wordlist<br/>
 

**Note:**

1 <= words.length <= 2000<br/>
1 <= words[i].length <= 2000<br/>
Words will only consist of lowercase English letters.<br/>
Queries will only consist of lowercase English letters.<br/>
The number of queries is at most 40000.
