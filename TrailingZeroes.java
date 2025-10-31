class TrailingZeroes {
    public int trailingZeroes(int n) {
        int count = 0;
        int currentPowerOfFive = 5;
        while(n >= currentPowerOfFive){
            count += (n / currentPowerOfFive);
            currentPowerOfFive *= 5;
        }
        return count;
    }
}
//Time comp = (log5 n)
//sc = o(1) -- constant