public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1300, 2019 );
        System.out.println("Notebook's weight:" + " " + notebook.weight + "; " + "Notebook's price:" + " " + notebook.price + "; " + "Year:" + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook(950, 999, 2010);
        System.out.println("Notebook's weight:" + " " + heavyNotebook.weight + "; " + "Notebook's price:" + " " + heavyNotebook.price + "; " + "Year:" + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook(1500, 888, 2005);
        System.out.println("Notebook's weight:" + " " + oldNotebook.weight + "; " + "Notebook's price:" + " " + oldNotebook.price + "; " + "Year:" + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();
        }
    }