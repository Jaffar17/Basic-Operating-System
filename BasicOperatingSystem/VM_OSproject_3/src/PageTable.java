/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaffar Abbas
 */
public class PageTable {
    int paget[];
//    int flag[] = new int[64];
    int size = 0;

    PageTable(int sizze) { //constructor
        this.size = sizze;
        paget = null;
//        flag = null;
        paget = new int[this.size];
//        flag = new int[this.size];
    }

    int getf(int pageno) { //gettter for frame given page no

// if(flag[pageno] == 1)
        return paget[pageno];
//else
//    return -1;
    }

    void setf(int frameno, int pageno) { //setter of frame no at particular index
        paget[pageno] = frameno;
//        flag[pageno] = 1;
    }

    int delf(int i) { //delete frame
//        flag[i] = 0;
        return paget[i];
    }

//    int getflag(int i) { //getter for page table flag
//        return flag[i];
//    }

    /*
void pagetable(){ //constructor
for(int i=0; i<30; i++){
paget[i]=0;
flag[i] =0;
}
 *

}
     */
    void print_table() { //print table
        int i = 0;
        while (i < 30) {
            System.out.println(paget[i] + "  ");
            i++;
        }

    }

}


