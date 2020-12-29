class AngkaBerurutan {
   public static void main(String[] args) {
     
       int[] value = {4,2,3,3,2,4,6,7,3,9};
        System.out.println(ujian(value));
    }
    
    public static int ujian(int[] value) {

        int evaluate =1, max =1;
        for (int j = 1; j < value.length; j++) {
          
            if (value[j] > value[j - 1]) {
                evaluate++;
                
            } else {
              
                evaluate = 1;
            }
            if (evaluate >= max) {
                max = evaluate;
            }
        }
        return max;
    }
}