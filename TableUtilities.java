 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String table = "";
        for(int i=0; i<=4;i++){
            for(int x=0;x<=4;x++){
                int product = ((x+1)*(i+1));
                if(product>=10){
                   table = table + " " +product+" |"; 
                }
                else{
                   table = table + "  " +product+" |";
                }
            }
            table = table + "\n";
        }
        return table;
    }

    public static String getLargeMultiplicationTable() {
        String table = "";
        for(int i=0; i<=9;i++){
            for(int x=0;x<=9;x++){
                int product = ((x+1)*(i+1));
                if(product>=10&&product<100){
                   table = table + " "+product+" |"; 
                }
                else if(product>=100){
                   table = table + ""+product+" |"; 
                }
                else{
                   table = table + "  "+product+" |";
                }
            }
            table = table+"\n";
        }
        return table;
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        for(int i=0; i<tableSize;i++){
            for(int x=0;x<tableSize;x++){
                int product = ((x+1)*(i+1));
                if(product>=10&&product<100){
                   table = table + " "+product+" |"; 
                }
                else if(product>=100){
                   table = table + ""+product+" |"; 
                }
                else{
                   table = table + "  "+product+" |";
                }
            }
            table = table+"\n";
        }
        return table;
    }
}
