public class Sort {

    public static int[] bubbleSort(int[] liste){
        int x = 0;
        int n = liste.length;

        for(int p = 0; p < (liste.length - 1); p++){
            boolean isSorted = true;
            
            for(int k = 0; k < (liste.length - 1 - p); k++){
                x++;
                if(liste[k]> liste[k+1]){
                    changeElements(k, (k+1), liste);
                    isSorted = false;
                }
                
                
            }

            if(isSorted == true){
                System.out.println ("n= "+ n + ", D = " + x);
                return liste;
            }
            
        }


        

        System.out.println ("n= "+ n + ", D = " + x);

        return liste;

    }


    


   

    public static void changeElements(int i, int n, int[] liste){
        int temp1 = liste [i];
        liste [i] = liste [n];
        liste[n] = temp1;
        
        
    }


    public static String printList(int[] list){
        String text = "";
        for(int i = 0; i < list.length; i++){
            text += list[i] + ", ";
        }
        return text;
    }
    
}
