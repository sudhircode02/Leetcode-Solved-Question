class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boat = 0;
        int s = 0, e = people.length-1;
        Arrays.sort(people);
        while(s <= e){
            if(people[s] + people[e] <= limit){
                s++;
                e--;
            }
            else e--;
            boat++;
        }
        return boat;
    }
}