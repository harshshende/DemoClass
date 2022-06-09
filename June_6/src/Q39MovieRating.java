public class Q39MovieRating {
    private String title;
    private String studio;
    private String rating;

    public Q39MovieRating(String t, String s, String r) {
        title = t;
        studio = s;
        rating = r;
    }

    public Q39MovieRating(String t, String s) {
        title = t;
        studio = s;
        rating = "PG";
    }

    public void setTitle(String t) {
        title = t;

    }

    public void setStudio(String s) {
        studio = s;

    }

    public void setRating(String r) {
        rating = r;

    }

    public String getTitle() {

        return title;
    }

    public String getStudio() {

        return studio;
    }

    public String getRating() {

        return rating;
    }

    public static Q39MovieRating[] getPG(Q39MovieRating[] mov) {
        Q39MovieRating[] pgMov = new Q39MovieRating[mov.length];
        int newArrayIndex = 0;
        for (int i = 0; i < mov.length; i++) {
            if (mov[i].rating.equals("PG")) {
                pgMov[newArrayIndex] = mov[i];
                newArrayIndex++;
            }
        }
        return pgMov;
    }

    public static void main(String[] args) {
        Q39MovieRating mov = new Q39MovieRating("Casino Royale", "Eon Productions", "PG-13");
        System.out.println(mov.getTitle());
        System.out.println(mov.getStudio());
        System.out.println(mov.getRating());


    }
}
