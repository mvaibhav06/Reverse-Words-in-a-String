class Solution {
    public String reverseWords(String s) {
        int i = 0;
        
        List<String> temp = new ArrayList<>();

        while(i < s.length()){
            if(s.charAt(i)==' '){
                i++;
                continue;
            }else{
                int j = i;
                while(j < s.length()){
                    if(s.charAt(j)==' '){
                        break;
                    }else{
                        j++;
                    }
                }
                StringBuilder sb = new StringBuilder(s);
                temp.add(sb.substring(i,j));
                i = j+1;
            }
        }

        StringBuilder out = new StringBuilder("");
        int size = temp.size();
        for(int k=size-1; k>=0; k--){
            out.append(temp.get(k));
            if(k != 0){
                out.append(" ");
            }
        }
        return out.toString();
    }
}
