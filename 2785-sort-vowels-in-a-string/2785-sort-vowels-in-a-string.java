class Solution {
    public String sortVowels(String s) {
        int len = s.length();
        List<Character> list = new ArrayList<>();
        char[] arr = s.toCharArray();
        for(int i=0; i<len; i++){
            char ch = arr[i];
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){

                list.add(ch);
                arr[i] = '@';
            }
        }
        Collections.sort(list);
        int j=0;
        for(int i=0; i<len; i++){
            if(arr[i] == '@'){
                arr[i] = list.get(j++);
            }
        }
        return new String(arr);

    }
}