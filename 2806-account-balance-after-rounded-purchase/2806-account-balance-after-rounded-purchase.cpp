class Solution {
public:
    int accountBalanceAfterPurchase(int purchaseAmount) {
        if(purchaseAmount < 5 ) return 100;
        
        if(purchaseAmount < 15) return 100-10;
        
        if(purchaseAmount < 25) return 100-20;
       
        if(purchaseAmount < 35) return 100-30;
        
        if(purchaseAmount < 45) return 100-40;
        
        if(purchaseAmount < 55) return 100-50;
        
        if(purchaseAmount < 65) return 100-60;
       
        if(purchaseAmount < 75) return 100-70;
      
        if(purchaseAmount < 85) return 100-80;
       
        if(purchaseAmount < 95) return 100-90;
        
        return 0;
    }
};