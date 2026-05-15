class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int read = 0;  // read pointer : scans the input array
        int write = 0; // write pointer : where we place the compressed output

        // Indentify goups of identical characters
        while(read < n){

            //Mark the start of the current group
            char current = chars[read];
            int start = read;         

            //Count consecutive chars
            while (read < n && chars[read] == current){
              read++;
            }
            int count = read - start;

            //write the char
            chars[write++] = current;

            //if count > 1, write the digits
            if (count > 1){
               String s = String.valueOf(count); //String representation of count
               for (char c :s.toCharArray()){      //.toCharArray = converts a string to a char array
                 chars[write++] = c;
                }
            }
        }
      // final compressed length of array
      return write;

    }
}