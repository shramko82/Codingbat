
public class GHappy {
    // We'll say that a lowercase 'g' in a string is "happy" if there is another
    // 'g' immediately to its left or right. Return true if all the g's in the
    // given string are happy.
    //
    // gHappy("xxggxx") > true
    // gHappy("xxgxx") > false
    // gHappy("xxggyygxx") > false
    public boolean gHappy(String str) {

        if (str.length() == 0)
            return true;

        int i = 0;
        while (i < str.length())
        {
               if (str.charAt(i) == 'g')
               {
                   if (i == str.length()-1 || str.charAt(i+1) != 'g')
                       return false;

                   while(i < str.length()-1 && str.charAt(i+1) == 'g')
                       i++;
               }
               i++;   
        }
        return true;
    }
}
