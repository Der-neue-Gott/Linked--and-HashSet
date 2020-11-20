import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class HistoryOfIvan {
	public static void main (String[] args) {

	    Set<Integer> soms = new HashSet<>();
		    soms.add(50);
            soms.add(200);
            soms.add(1000);
            soms.add(500);
            soms.add(100);

//  -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -

		System.out.println("\t [01.09.2020] \n " +
        "Иван имеет суммарно 1850 сом разными целыми купюрами: ");
		    soms.forEach(System.out::println);


        System.out.println("\t [04.09.2020] \n " +
        "Иван отмечает день своего Рождения. Он получил ещё купюру в 2000 сом: ");
		    soms.add(2000);
		    soms.forEach(System.out::println);


        System.out.println("\t [06.09.2020] \n " +
        "Иван желает сходить с друзьями в кафе. По окончанию мероприятия он оплачивает счёт на свои 500 сом: " + soms.remove(500));
		System.out.println("Теперь у Ивана остались такие купюры: ");
            soms.forEach(System.out::println);


        System.out.println("\t [07.09.2020] \n " +
        "Утром, после отдыха с друзьями, Иван решил пересчитать свои деньги. " +
        "Первым делом он обнаруживает в кошельке купюру в 2000 сом: " + soms.contains(2000));
        System.out.println("Все деньги на месте, значит теперь Иван может быть спокоен. \n " +
        "Иван решает посчитать количество купюр в своём кошельке и получает результат: " + soms.size() + " целых купюр");


        System.out.println("\t [10.09.2020] \n " +
        "Утром Иван занимает матери по её просьбе все свои деньги на неопределённый срок.");
            soms.clear();
        System.out.println("Иван остался без денег: " + soms.isEmpty());

//  -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -

        Set<Integer> mothersDebt = new LinkedHashSet<Integer>();
            mothersDebt.add(100);
            mothersDebt.add(50);
            mothersDebt.add(2000);
            mothersDebt.add(200);
            mothersDebt.add(1000);


        System.out.println("\t \t \t \t \t \t - - - - - - - - - - - - -");

        System.out.println("\t [20.09.2020] \n " +
        "Мама Ивана возвращает ему долг. Теперь у Ивана снова появились деньги: ");

/*      mothersDebt.forEach(System.out::println);

        for (Integer money : mothersDebt) {
            System.out.println(money);
        } */

        Iterator money = mothersDebt.iterator();
            while(money.hasNext()) {
                System.out.println(money.next());
            }

	}
}