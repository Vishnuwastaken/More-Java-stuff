public class movieMagic2 {
        private int[] year = new int[4];
        private String title;
        private float rating;
        public movieMagic2(){
            for (int i=0; i<4;i++){
                year[i] = 0;
            }
            title = "";
            rating = 0;
        }

    public int[] getYear() {
        return year;
    }
    public String getTitle(){
            return title;
    }
    public float getRating() {
        return rating;
    }

    public void setYear(int[] year) {
        this.year = year;
    }
}
