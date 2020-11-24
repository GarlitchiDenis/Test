public class Main {
    public static void main(String[] args) throws Exception {
        Director a=new Director("dir1");
        FisierTxt file1 =new FisierTxt("file1");
        file1.setAlignStrategy(new AlignCenter());
        FisierTxt file2 =new FisierTxt("file2");
        file2.setAlignStrategy(new AlignLeft());
        FisierTxt file3 =new FisierTxt("file3");
        file3.setAlignStrategy(new AlignRight());
        FisierMp3 file4 =new FisierMp3("file4");
        FisierSvg file5 =new FisierSvg("file5");

        Director b=new Director("temp");

        a.AddElement(b);
        a.AddElement(file1);
        a.AddElement(file2);
        a.AddElement(file3);
        a.AddElement(file4);
        a.AddElement(file5);




        a.print();
    }
}


//Director: dir1
//Director: temp
//<<<<<file1>>>>>
//<<<<<<file2
//file3>>>>>>>
//FisierMp3: file4
//FisierSvg: file5


