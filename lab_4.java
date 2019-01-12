import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lab_4 {

    public static void main(String[] args) {

        Integer size = Integer.parseInt(args[0]);
        List<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println(size);
        int i = 0, j = 0;
        while (j < size) {
            list.add(j,"#");
            ++j;
            System.out.print(i);
            i = (i + 1) % 10;
        }

        System.out.println();
        for (String s : list) {
            System.out.print(s);
        }

        System.out.println();
        String s;
        Integer sizeLocation, Numb = 0;
        int space = 0, first = 0;
        while (!(s = sc.nextLine()).equals("end")) {
            if (s.equals("Z")) {
                System.out.println("Unesite zahtjev za velicinu spremnicke lokacije");
                sizeLocation = Integer.parseInt(sc.nextLine());
                if (sizeLocation > size) {
                    System.out.println("Velicina je veca od memorije, unesite ponovo zahtjev");
                } else {
                    boolean done = true;
                    for(int t = 0; t < list.size(); ++t){

                        if(list.get(t).equals("#")){
                            ++space;
                        }
                        if(space == sizeLocation){
                            first = t - space;
                            while(space > 0){
                                //if()
                                list.remove(first + space);
                                list.add(first+space, Numb.toString());
                                --space;
                            }
                            ++Numb;
                            first = 0;
                            done = false;
                            break;
                        }
                        else if(!list.get(t).equals("#")){
                            space = 0;
                        }
                    }

                    if(done){


                        List<String> temp = new LinkedList<>();
                        for(String t : list){

                            if(!t.equals("#")){
                                temp.add(t);
                            }
                        }

                        for(int t = 0; t < size; ++t){

                            if(t < temp.size()){
                                list.remove(t);
                                list.add(t, temp.get(t));
                            }
                            else{
                                list.remove(t);
                                list.add(t, "#");
                            }
                        }
                        for(int t = 0; t < list.size(); ++t){

                            if(list.get(t).equals("#")){
                                ++space;
                            }
                            if(space == sizeLocation){
                                first = t - space;
                                while(space > 0){
                                    list.remove(first + space);
                                    list.add(first+space, Numb.toString());
                                    --space;
                                }
                                ++Numb;
                                first = 0;
                                done = false;
                                break;
                            }
                            else if(!list.get(t).equals("#")){
                                space = 0;
                            }
                        }
                        }

                    }
                }
            else if(s.equals("0")){
                System.out.println("Koji zahtjev zelite osloboditi?");
                String z = sc.nextLine();
                for(int t = 0; t < list.size(); ++t){
                    if(list.get(t).equals(z)){
                        list.remove(t);
                        list.add(t, "#");
                    }
                }
            }

            j = size;
            while (j > 0) {
                --j;
                System.out.print(i);
                i = (i + 1) % 10;
            }
            System.out.println();
            j = size;
            while (j > 0){
                --j;
                System.out.print("-");
            }
            System.out.println();
            for (String e : list) {
                System.out.print(e);
            }
            System.out.println();
        }


    }
}
