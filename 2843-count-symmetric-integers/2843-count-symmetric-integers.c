int countSymmetricIntegers(int low, int high){
    int count = 0;
    for(int k = low; k<= high; k++){
        
        int l = log10(k)+1;
        
        if(l%2 == 0){
            int n = k;
           int sumL = 0;
            int sumR = 0;
            for(int i=0; i<l/2; i++){
                sumR += n%10;
                n /= 10;
            }
            for(int i=0; i<l/2; i++){
                sumL += n%10;
                n /= 10;
            }
            if(sumL == sumR){
                count++;
            }
        }
    }
    return count;
}