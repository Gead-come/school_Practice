package annot;

public @interface my_annot {
    String name();
    int age()default 100;
    String sex();

}
