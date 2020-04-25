public class ParqueTesting {
    public static void main(String[] args) {
        Parque test = new Parque();
        Lugar l1 = new Lugar("SX-68-90", "Jessica", 30, true);
        Lugar l2 = new Lugar("AF-72-79", "Jose", 30, false);
        Lugar l3 = new Lugar("LO-44-92", "Maria", 30, false);
        Lugar l4 = new Lugar("AX-23-42", "Antonio", 30, false);
        Lugar l5 = new Lugar("BB-11-22", "quicktest1", 10, true);
        Lugar l6 = new Lugar("CC-33-44", "quicktest2", 30, true);
        Lugar l7 = new Lugar("DD-55-66", "quicktest3", 30, true);
        test.registaLugar(l1);
        test.registaLugar(l2);
        test.registaLugar(l3);
        test.registaLugar(l4);

        System.out.println("Teste toString:");
        System.out.println(test);

        System.out.println("Teste getLugaresOcupadosMatricula");
        System.out.println(test.getLugaresOcupadosMatriculas());

        System.out.println("Teste removeLugar + setTempo");
        test.removeLugar("AF-72-79");
        test.setTempo("AX-23-42", 10);
        System.out.println(test);

        System.out.println("Teste getTotalMinutosInternal");
        System.out.println("Total minutos: " + test.getTotalMinutosInternal());
        System.out.println("Teste getTotalMinutosExternal");
        System.out.println("Total minutos: " + test.getTotalMinutosExternal());

        System.out.println("Teste existeLugar");
        System.out.println("Should print true: " + test.existeLugar("SX-68-90"));
        System.out.println("Should print false: " + test.existeLugar("AA-00-00"));

        test.registaLugar(l5);
        test.registaLugar(l6);
        test.registaLugar(l7);

        System.out.println("Teste getMatriculasByMinimumTimeInternal");
        System.out.println(test.getMatriculasByMinimumTimeInternal(15));
        System.out.println("Teste getMatriculasByMinimumTimeExternal");
        System.out.println(test.getMatriculasByMinimumTimeExternal(15));

        System.out.println("Teste getInfoLugar");
        System.out.println(test.getInfoLugar("DD-55-66"));
    }
}
