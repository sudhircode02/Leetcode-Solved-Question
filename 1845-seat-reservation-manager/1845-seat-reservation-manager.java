class SeatManager {

    private PriorityQueue<Integer> seats;
    
    public SeatManager(int n) {
        seats =new PriorityQueue<>();
        for(int seat=1; seat<=n; seat++){
            seats.offer(seat);
        }
    
    }
    
    public int reserve() {
        if(!seats.isEmpty()) return seats.poll();
        else return -1;
    }
    
    public void unreserve(int seatNumber) {
        seats.offer(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */