 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String stars = "";
        for(int i=0; i<numberOfStars;i++){
            stars = stars + "*";
        }
        return stars;
    }
    
    public static String getTriangle(int numberOfRows) {
        String stars = "";
        for(int i=0; i<numberOfRows;i++){
            for(int x=0;x<=i;x++){
                stars = stars + "*";
            }
            stars = stars + "\n";
        }
        return stars;
    }

    public static String getSmallTriangle() {
        String stars = "";
        for(int i=0; i<4;i++){
            for(int x=0;x<=i;x++){
                stars = stars + "*";
            }
            stars = stars + "\n";
        }
        return stars;
    }

    public static String getLargeTriangle() {
        String stars = "";
        for(int i=0; i<9;i++){
            for(int x=0;x<=i;x++){
                stars = stars + "*";
            }
            stars = stars + "\n";
        }
        return stars;
    }
}
