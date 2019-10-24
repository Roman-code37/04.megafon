package ru.itpark;

import ru.itpark.Rates.Rest;
import ru.itpark.Rates.TariffForModem;
import ru.itpark.Rates.TureOn;

public class Main {
    public static void main(String[] args) {
        TureOn speak = new TureOn("Говори",
                300,
                "5",
                "Безлимитный интернет на месседжер",
                30,
                300);

        TariffForModem sixMonth = new TariffForModem("Твой безлимит на 6 месяцев",
                3100,
                "unlimited",
                "Трафик без ограничений для использования дома и в поездках по России",
                6);
        Rest goToZero = new Rest("Переходи на ноль",
                0,
                "25 рублей за 100МБ",
                "Поминутная тарификация",
                1,
                1);
    }
}
