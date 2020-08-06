# Add and search word - Datastructure design
Design a data structure that supports the following two operations:

void addWord(word)<br/>
bool search(word)<r/>
search(word) can search a literal word or a regular expression string containing only letters a-z or .. A . means it can represent any one letter.

Example:

addWord("bad")<br/>
addWord("dad")<br/>
addWord("mad")<br/>
search("pad") -> false<br/>
search("bad") -> true<br/>
search(".ad") -> true<br/>
search("b..") -> true<br/>
