package lesson2_3;

public class Tovar {
    private String nazvanie;
    private String dataProizvodstwa;
    private String proizvoditel;
    private String stranaProishozhdeniya;
    private double tsena;
    private String sostoyanieBronirovaniya;

    public Tovar(String nazvanie, String dataProizvodstwa, String proizvoditel,
                 String stranaProishozhdeniya, double tsena, String sostoyanieBronirovaniya) {
        this.nazvanie = nazvanie;
        this.dataProizvodstwa = dataProizvodstwa;
        this.proizvoditel = proizvoditel;
        this.stranaProishozhdeniya = stranaProishozhdeniya;
        this.tsena = tsena;
        this.sostoyanieBronirovaniya = sostoyanieBronirovaniya;
    }

    public void printInfo() {
        System.out.println("Название: " + nazvanie);
        System.out.println("Дата производства: " + dataProizvodstwa);
        System.out.println("Производитель: " + proizvoditel);
        System.out.println("Страна происхождения: " + stranaProishozhdeniya);
        System.out.println("Цена: " + tsena);
        System.out.println("Состояние бронирования: " + sostoyanieBronirovaniya);
    }
}

