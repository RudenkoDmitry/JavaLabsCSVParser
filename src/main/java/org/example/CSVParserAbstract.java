package org.example;

import java.io.IOException;
import java.util.List;

public interface CSVParserAbstract {

    /**
     * Метод получает путь к csv файлу из поля исходного класса
     * @return Строка пути к csv файлу
     */
    String getFilepath();

    /**
     * Метод присваивает путь к csv файлу в поле исходного класса
     * @param path Строка пути к csv файлу
     */
    void setFilepath(String path);

    /**
     * Метод считывает csv файл и располагает данные в список соответсвенно созданным структурам хранения
     * @return Список типа класса Person, хранящий данные работниках, с данными из исходного файла
     * @throws IOException Ошибка при считывании пути файла
     */
    public List<Person> fileRead() throws IOException;

    /**
     * Метод проверяет чтобы файл по указанному адресу имел расширение csv и в случае успеха присвает указанный путь полю класса
     * @param path Строка пути к файлу который проходит проверку
     * @return Возвращает true в случае если по указанному пути располагается файл расширения csv и false в ином случае
     */
    boolean correctInputFilepath(String path);
}
