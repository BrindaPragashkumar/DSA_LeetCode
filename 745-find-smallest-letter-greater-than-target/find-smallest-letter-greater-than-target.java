// class Solution {
//     // https://mkyong.com/java/java-string-compareto-examples/
//     public char nextGreatestLetter(char[] letters, char target) {

//        for(int i=0; i<letters.length;i++){
//             if ((letters[i].compareTo(target)) == 0){
//                 return target;
//             } else if ((letters[i].compareTo(target)) < 1){
//                 return letters[i];
//             }
            
//     }
//      return letters[0];

   
// }}


class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
           if (letters[i] > target) { 
                return letters [i];
            }
        }
        return letters[0];  // Wrap around to first letter if no greater found
    }
}