package ru.itpark;

import ru.itpark.tariff.RestTariff;
import ru.itpark.tariff.TariffForModem;
import ru.itpark.tariff.TurnOnTariff;

public class Main {
    public static void main(String[] args) {
        TurnOnTariff speak = new TurnOnTariff(1,
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
