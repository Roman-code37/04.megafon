package ru.itpark;

import ru.itpark.rate.RestTariff;
import ru.itpark.rate.TariffForModem;
import ru.itpark.rate.TureOnTariff;

public class Main {
    public static void main(String[] args) {
        TureOnTariff speak = new TureOnTariff(1,
                "Говори",
                300,
                "5",
                "Безлимитный интернет на месседжер",
                30,
                300);

        TariffForModem sixMonth = new TariffForModem(3,
                "Твой безлимит на 6 месяцев",
                3100,
                "unlimited",
                "Трафик без ограничений для использования дома и в поездках по России",
                6);
        RestTariff goToZero = new RestTariff(2,
                "Переходи на ноль",
                0,
                "25 рублей за 100МБ",
                "Поминутная тарификация",
                1,
                1);
    }
}
