package org.example

    /**-----Example 01-----*/
    // Определение enum-класса Capital, который содержит перечисление стран и их столиц.
    enum class Capital(val capital: String) {
        // Каждое значение перечисления представляет страну и ее столицу.
        Canada("Ottawa"),
        Ukraine("Kyiv"),
        USA("Washington")
    }

    /**-----Example 02-----*/
    // Определение enum-класса DayOfWeek, представляющего дни недели.
    enum class DayOfWeek(val number: Int) {
        // Каждое значение перечисления представляет день недели и его порядковый номер.
        MONDAY(1),      // Понедельник, первый день недели
        TUESDAY(2),     // Вторник, второй день недели
        WEDNESDAY(3),   // Среда, третий день недели
        THURSDAY(4),    // Четверг, четвертый день недели
        FRIDAY(5),      // Пятница, пятый день недели
        SATURDAY(6),    // Суббота, шестой день недели
        SUNDAY(7)       // Воскресенье, седьмой день недели
    }

    /**-----Example 03-----*/
    // Определение enum-класса CountryCurrency, представляющего страны с их столицами и валютами.
    enum class CountryCurrency(val capital: String, val currency: String) {
        // Каждое значение перечисления представляет страну, её столицу и валюту.
        USA("Washington", "Dollar"),             // США: столица - Вашингтон, валюта - доллар
        Ukraine("Kyiv", "Hryvnia"),            // Украина: столица - Киев, валюта - гривна
        Belarus("Minsk", "Belarusian ruble")   // Беларусь: столица - Минск, валюта - белорусский рубль
    }

    /**-----Example 04-----*/
    // Определение enum-класса Animals, представляющего имена животных и их вид.
    enum class Animals(val animalName: String, val animalSpecies: String? = "Собака") {
        // Каждое значение перечисления представляет имя кота и его пол.
        AnimalOne("Шарик"),                  // Шарик, по умолчанию "Собака"
        AnimalTwo("Рекс"),                 // Рекс, по умолчанию "Собака"
        AnimalThree("Мурка", "Кошка")           // Мурка, явное указание вид - Кошка
    }

    fun main() {

        /**-----Example 01-----*/
        // Создание экземпляра StringBuilder для построения строки.
        val builderOne = StringBuilder()

        // Добавление строк с названием страны и её столицей в StringBuilder.
        builderOne.append("\nCanada = ${Capital.Canada.capital}")
        builderOne.append("\nUkraine = ${Capital.Ukraine.capital}")
        builderOne.append("\nUSA = ${Capital.USA.capital}")

        // Отображаем текст в консоли, собранным в StringBuilder.
        println(builderOne.toString())
        // Вывод:
        // Canada = Ottawa
        // Ukraine = Kyiv
        // USA = Washington

        /**-----Example 02-----*/
        // Вызов функции getDayNumber с аргументом DayOfWeek.SATURDAY и вывод результата в консоль.
        println(getDayNumber(DayOfWeek.SATURDAY)) // 6

        /**-----Example 03-----*/
        // Создание экземпляра StringBuilder для построения строки.
        val builderThree = StringBuilder()
        // Добавление строк с информацией о стране, её столице и валюте в StringBuilder.
        builderThree.append("\nUSA = ${CountryCurrency.USA.capital}, ${CountryCurrency.USA.currency}")
        builderThree.append("\nUkraine = ${CountryCurrency.Ukraine.capital}, ${CountryCurrency.Ukraine.currency}")
        builderThree.append("\nBelarus = ${CountryCurrency.Belarus.capital}, ${CountryCurrency.Belarus.currency}")

        // Отображаем текст в консоли, собранным в StringBuilder.
        println(builderThree.toString())
        // Вывод:
        // USA = Washington, Dollar
        // Ukraine = Kyiv, Hryvnia
        // Belarus = Minsk, Belarusian ruble

        /**-----Example 04-----*/
        // Создание экземпляра StringBuilder для построения строки.
        val builderFour = StringBuilder()
        // Добавление строк с именем животных и вида в StringBuilder.
        builderFour.append("\n${Animals.AnimalOne.animalName}, ${Animals.AnimalOne.animalSpecies}")
        builderFour.append("\n${Animals.AnimalTwo.animalName}, ${Animals.AnimalTwo.animalSpecies}")
        builderFour.append("\n${Animals.AnimalThree.animalName}, ${Animals.AnimalThree.animalSpecies}")

        // Отображаем текст в консоли, собранным в StringBuilder.
        println(builderFour.toString())
        // Вывод:
        // Шарик, Собака
        // Рекс, Собака
        // Мурка, Кошка

    }

    /**-----Example 02-----*/
    // Функция, принимающая значение DayOfWeek и возвращающая порядковый номер дня недели.
    fun getDayNumber(day: DayOfWeek): Int {
        // Возвращает число, соответствующее дню недели.
        return day.number
    }