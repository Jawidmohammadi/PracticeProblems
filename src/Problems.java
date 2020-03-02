public class Problems {



  public int countYZ(String str) {
// count is counting the char 'y' and 'z';
    int count = 0;
    str = str.toLowerCase();


    // for is a loop going through each char of the string and looking for white spaces;
    for(int i= 0;i<str.length();i++){
      // if ithElement of our String is not a letter return true.
      if(!Character.isLetter(str.charAt(i)) && i != 0) {
          // if char at  the ithElement-1 is equal to 'y' or 'z' count them.
          if (str.charAt(i - 1) == ('y') || str.charAt(i - 1) == ('z')) {
            count++;
          }
      }
    }

    // if the last char the string is "z" || "y" count them.
    if(str.substring(str.length()-1).equalsIgnoreCase("y") || str.substring(str.length()-1).equalsIgnoreCase("Z")){
      count++;
    }

    return count;
  }

}
