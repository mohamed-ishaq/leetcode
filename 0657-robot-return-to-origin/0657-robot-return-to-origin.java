class Solution {
    public boolean judgeCircle(String moves) {
      int countlr = 0;
      int countud = 0;
      for(int i=0;i<moves.length();i++){
        char ch = moves.charAt(i);
        if(ch == 'U'){
            countud++;
        }
        else if(ch == 'L'){
            countlr++;
        }
        else if(ch == 'R'){
            countlr--;
        }
        else if(ch == 'D'){
            countud--;
        }
      }  
      if(countlr == 0 && countud == 0){
        return true;
      }
      return false;
    }
}