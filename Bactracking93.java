// 93. Restore IP Addresses
class Solution {
    public List<String> restoreIpAddresses(String s) {

        List<String> result = new ArrayList<>();
        List<String> currentPart = new ArrayList<>();

        joining(0, s, result, currentPart);

        return result;
        
    }


    public void joining(int i, String s, List<String> result, List<String> currentPart)
    {
        int stringLength = s.length();
        int currentSize = currentPart.size();

        //test the base cases

        if( i>= stringLength && currentSize == 4){
            result.add(String.join(".", currentPart));
            return;
        }

        if( i>= stringLength && currentSize >= 4){
            return; 
        }

        for(int j =i; j< Math.min(i+3, stringLength); j++){

            if(isValid(s, i, j)){
                currentPart.add(s.substring(i, j + 1));
                joining(j +1, s, result, currentPart);
                currentPart.remove(currentPart.size() -1);
            }
        }

    }

    public boolean isValid(String s, int start, int end)
    {

        if (s.charAt(start) == '0' && start != end) {
            return false;
        }

        int num = Integer.parseInt(s.substring(start, end + 1));
        //System.out.printIn(num);
        return num >= 0 && num <= 255;
    }


}
