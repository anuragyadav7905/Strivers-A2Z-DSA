class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> q=new LinkedList<>();
        q.add(beginWord);
        Set<String> st=new HashSet<>(wordList);
        st.remove(beginWord);

        int steps=1;

        while(!q.isEmpty()){
            int size=q.size();
            for(int k=0;k<size;k++){
                String word=q.poll();
                if(word.equals(endWord)) return steps;

                for(int i=0;i<word.length();i++){
                    char[] arr=word.toCharArray();
                    for(char ch='a';ch<='z';ch++){
                        arr[i]=ch;
                        String newWord=new String(arr);

                        if(st.contains(newWord)){
                            st.remove(newWord);
                            q.add(newWord);
                        }
                    }
                }
            }
            steps++;
        }
        return 0;
        
    }
}