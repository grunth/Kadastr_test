//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.06 at 12:22:20 PM MSK 
//


package XML.MP_v06;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dStreets.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dStreets"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="аллея"/&gt;
 *     &lt;enumeration value="б-р"/&gt;
 *     &lt;enumeration value="въезд"/&gt;
 *     &lt;enumeration value="дор"/&gt;
 *     &lt;enumeration value="жт"/&gt;
 *     &lt;enumeration value="заезд"/&gt;
 *     &lt;enumeration value="кв-л"/&gt;
 *     &lt;enumeration value="км"/&gt;
 *     &lt;enumeration value="кольцо"/&gt;
 *     &lt;enumeration value="линия"/&gt;
 *     &lt;enumeration value="наб"/&gt;
 *     &lt;enumeration value="остров"/&gt;
 *     &lt;enumeration value="парк"/&gt;
 *     &lt;enumeration value="пер"/&gt;
 *     &lt;enumeration value="переезд"/&gt;
 *     &lt;enumeration value="пл"/&gt;
 *     &lt;enumeration value="пл-ка"/&gt;
 *     &lt;enumeration value="проезд"/&gt;
 *     &lt;enumeration value="пр-кт"/&gt;
 *     &lt;enumeration value="просек"/&gt;
 *     &lt;enumeration value="просёлок"/&gt;
 *     &lt;enumeration value="проулок"/&gt;
 *     &lt;enumeration value="сад"/&gt;
 *     &lt;enumeration value="сквер"/&gt;
 *     &lt;enumeration value="стр"/&gt;
 *     &lt;enumeration value="тер"/&gt;
 *     &lt;enumeration value="тракт"/&gt;
 *     &lt;enumeration value="туп"/&gt;
 *     &lt;enumeration value="ул"/&gt;
 *     &lt;enumeration value="уч-к"/&gt;
 *     &lt;enumeration value="ш"/&gt;
 *     &lt;enumeration value="аал"/&gt;
 *     &lt;enumeration value="аул"/&gt;
 *     &lt;enumeration value="высел"/&gt;
 *     &lt;enumeration value="городок"/&gt;
 *     &lt;enumeration value="д"/&gt;
 *     &lt;enumeration value="ж/д_будка"/&gt;
 *     &lt;enumeration value="ж/д_казарм"/&gt;
 *     &lt;enumeration value="ж/д_оп"/&gt;
 *     &lt;enumeration value="ж/д_пост"/&gt;
 *     &lt;enumeration value="ж/д_рзд"/&gt;
 *     &lt;enumeration value="ж/д_ст"/&gt;
 *     &lt;enumeration value="казарма"/&gt;
 *     &lt;enumeration value="м"/&gt;
 *     &lt;enumeration value="мкр"/&gt;
 *     &lt;enumeration value="нп"/&gt;
 *     &lt;enumeration value="платф"/&gt;
 *     &lt;enumeration value="п"/&gt;
 *     &lt;enumeration value="п/о"/&gt;
 *     &lt;enumeration value="п/р"/&gt;
 *     &lt;enumeration value="п/ст"/&gt;
 *     &lt;enumeration value="полустанок"/&gt;
 *     &lt;enumeration value="починок"/&gt;
 *     &lt;enumeration value="рзд"/&gt;
 *     &lt;enumeration value="с"/&gt;
 *     &lt;enumeration value="сл"/&gt;
 *     &lt;enumeration value="ст"/&gt;
 *     &lt;enumeration value="х"/&gt;
 *     &lt;enumeration value="ж/д_платф"/&gt;
 *     &lt;enumeration value="арбан"/&gt;
 *     &lt;enumeration value="спуск"/&gt;
 *     &lt;enumeration value="канал"/&gt;
 *     &lt;enumeration value="гск"/&gt;
 *     &lt;enumeration value="снт"/&gt;
 *     &lt;enumeration value="лпх"/&gt;
 *     &lt;enumeration value="проток"/&gt;
 *     &lt;enumeration value="коса"/&gt;
 *     &lt;enumeration value="вал"/&gt;
 *     &lt;enumeration value="ферма"/&gt;
 *     &lt;enumeration value="мост"/&gt;
 *     &lt;enumeration value="ряды"/&gt;
 *     &lt;enumeration value="а/я"/&gt;
 *     &lt;enumeration value="берег"/&gt;
 *     &lt;enumeration value="просека"/&gt;
 *     &lt;enumeration value="протока"/&gt;
 *     &lt;enumeration value="бугор"/&gt;
 *     &lt;enumeration value="зона"/&gt;
 *     &lt;enumeration value="днп"/&gt;
 *     &lt;enumeration value="н/п"/&gt;
 *     &lt;enumeration value="ф/х"/&gt;
 *     &lt;enumeration value="местность"/&gt;
 *     &lt;enumeration value="балка"/&gt;
 *     &lt;enumeration value="бухта"/&gt;
 *     &lt;enumeration value="причал"/&gt;
 *     &lt;enumeration value="мыс"/&gt;
 *     &lt;enumeration value="маяк"/&gt;
 *     &lt;enumeration value="горка"/&gt;
 *     &lt;enumeration value="тоннель"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "dStreets")
@XmlEnum
public enum DStreets {


    /**
     * Аллея
     * 
     */
    @XmlEnumValue("\u0430\u043b\u043b\u0435\u044f")
    АЛЛЕЯ("\u0430\u043b\u043b\u0435\u044f"),

    /**
     * Бульвар
     * 
     */
    @XmlEnumValue("\u0431-\u0440")
    Б_Р("\u0431-\u0440"),

    /**
     * Въезд
     * 
     */
    @XmlEnumValue("\u0432\u044a\u0435\u0437\u0434")
    ВЪЕЗД("\u0432\u044a\u0435\u0437\u0434"),

    /**
     * Дорога
     * 
     */
    @XmlEnumValue("\u0434\u043e\u0440")
    ДОР("\u0434\u043e\u0440"),

    /**
     * Животноводческая точка
     * 
     */
    @XmlEnumValue("\u0436\u0442")
    ЖТ("\u0436\u0442"),

    /**
     * Заезд
     * 
     */
    @XmlEnumValue("\u0437\u0430\u0435\u0437\u0434")
    ЗАЕЗД("\u0437\u0430\u0435\u0437\u0434"),

    /**
     * Квартал
     * 
     */
    @XmlEnumValue("\u043a\u0432-\u043b")
    КВ_Л("\u043a\u0432-\u043b"),

    /**
     * Километр
     * 
     */
    @XmlEnumValue("\u043a\u043c")
    КМ("\u043a\u043c"),

    /**
     * Кольцо
     * 
     */
    @XmlEnumValue("\u043a\u043e\u043b\u044c\u0446\u043e")
    КОЛЬЦО("\u043a\u043e\u043b\u044c\u0446\u043e"),

    /**
     * Линия
     * 
     */
    @XmlEnumValue("\u043b\u0438\u043d\u0438\u044f")
    ЛИНИЯ("\u043b\u0438\u043d\u0438\u044f"),

    /**
     * Набережная
     * 
     */
    @XmlEnumValue("\u043d\u0430\u0431")
    НАБ("\u043d\u0430\u0431"),

    /**
     * Остров
     * 
     */
    @XmlEnumValue("\u043e\u0441\u0442\u0440\u043e\u0432")
    ОСТРОВ("\u043e\u0441\u0442\u0440\u043e\u0432"),

    /**
     * Парк
     * 
     */
    @XmlEnumValue("\u043f\u0430\u0440\u043a")
    ПАРК("\u043f\u0430\u0440\u043a"),

    /**
     * Переулок
     * 
     */
    @XmlEnumValue("\u043f\u0435\u0440")
    ПЕР("\u043f\u0435\u0440"),

    /**
     * Переезд
     * 
     */
    @XmlEnumValue("\u043f\u0435\u0440\u0435\u0435\u0437\u0434")
    ПЕРЕЕЗД("\u043f\u0435\u0440\u0435\u0435\u0437\u0434"),

    /**
     * Площадь
     * 
     */
    @XmlEnumValue("\u043f\u043b")
    ПЛ("\u043f\u043b"),

    /**
     * Площадка
     * 
     */
    @XmlEnumValue("\u043f\u043b-\u043a\u0430")
    ПЛ_КА("\u043f\u043b-\u043a\u0430"),

    /**
     * Проезд
     * 
     */
    @XmlEnumValue("\u043f\u0440\u043e\u0435\u0437\u0434")
    ПРОЕЗД("\u043f\u0440\u043e\u0435\u0437\u0434"),

    /**
     * Проспект
     * 
     */
    @XmlEnumValue("\u043f\u0440-\u043a\u0442")
    ПР_КТ("\u043f\u0440-\u043a\u0442"),

    /**
     * Просек
     * 
     */
    @XmlEnumValue("\u043f\u0440\u043e\u0441\u0435\u043a")
    ПРОСЕК("\u043f\u0440\u043e\u0441\u0435\u043a"),

    /**
     * Просёлок
     * 
     */
    @XmlEnumValue("\u043f\u0440\u043e\u0441\u0451\u043b\u043e\u043a")
    ПРОСЁЛОК("\u043f\u0440\u043e\u0441\u0451\u043b\u043e\u043a"),

    /**
     * Проулок
     * 
     */
    @XmlEnumValue("\u043f\u0440\u043e\u0443\u043b\u043e\u043a")
    ПРОУЛОК("\u043f\u0440\u043e\u0443\u043b\u043e\u043a"),

    /**
     * Сад
     * 
     */
    @XmlEnumValue("\u0441\u0430\u0434")
    САД("\u0441\u0430\u0434"),

    /**
     * Сквер
     * 
     */
    @XmlEnumValue("\u0441\u043a\u0432\u0435\u0440")
    СКВЕР("\u0441\u043a\u0432\u0435\u0440"),

    /**
     * Строение
     * 
     */
    @XmlEnumValue("\u0441\u0442\u0440")
    СТР("\u0441\u0442\u0440"),

    /**
     * Территория
     * 
     */
    @XmlEnumValue("\u0442\u0435\u0440")
    ТЕР("\u0442\u0435\u0440"),

    /**
     * Тракт
     * 
     */
    @XmlEnumValue("\u0442\u0440\u0430\u043a\u0442")
    ТРАКТ("\u0442\u0440\u0430\u043a\u0442"),

    /**
     * Тупик
     * 
     */
    @XmlEnumValue("\u0442\u0443\u043f")
    ТУП("\u0442\u0443\u043f"),

    /**
     * Улица
     * 
     */
    @XmlEnumValue("\u0443\u043b")
    УЛ("\u0443\u043b"),

    /**
     * Участок
     * 
     */
    @XmlEnumValue("\u0443\u0447-\u043a")
    УЧ_К("\u0443\u0447-\u043a"),

    /**
     * Шоссе
     * 
     */
    @XmlEnumValue("\u0448")
    Ш("\u0448"),

    /**
     * Аал
     * 
     */
    @XmlEnumValue("\u0430\u0430\u043b")
    ААЛ("\u0430\u0430\u043b"),

    /**
     * Аул
     * 
     */
    @XmlEnumValue("\u0430\u0443\u043b")
    АУЛ("\u0430\u0443\u043b"),

    /**
     * Выселки(ок)
     * 
     */
    @XmlEnumValue("\u0432\u044b\u0441\u0435\u043b")
    ВЫСЕЛ("\u0432\u044b\u0441\u0435\u043b"),

    /**
     * Городок
     * 
     */
    @XmlEnumValue("\u0433\u043e\u0440\u043e\u0434\u043e\u043a")
    ГОРОДОК("\u0433\u043e\u0440\u043e\u0434\u043e\u043a"),

    /**
     * Деревня
     * 
     */
    @XmlEnumValue("\u0434")
    Д("\u0434"),

    /**
     * Железнодорожная будка
     * 
     */
    @XmlEnumValue("\u0436/\u0434_\u0431\u0443\u0434\u043a\u0430")
    Ж_Д_БУДКА("\u0436/\u0434_\u0431\u0443\u0434\u043a\u0430"),

    /**
     * Железнодорожная казарма
     * 
     */
    @XmlEnumValue("\u0436/\u0434_\u043a\u0430\u0437\u0430\u0440\u043c")
    Ж_Д_КАЗАРМ("\u0436/\u0434_\u043a\u0430\u0437\u0430\u0440\u043c"),

    /**
     * Ж/д остановочный (обгонный) пункт
     * 
     */
    @XmlEnumValue("\u0436/\u0434_\u043e\u043f")
    Ж_Д_ОП("\u0436/\u0434_\u043e\u043f"),

    /**
     * Железнодорожный пост
     * 
     */
    @XmlEnumValue("\u0436/\u0434_\u043f\u043e\u0441\u0442")
    Ж_Д_ПОСТ("\u0436/\u0434_\u043f\u043e\u0441\u0442"),

    /**
     * Железнодорожный разъезд
     * 
     */
    @XmlEnumValue("\u0436/\u0434_\u0440\u0437\u0434")
    Ж_Д_РЗД("\u0436/\u0434_\u0440\u0437\u0434"),

    /**
     * Железнодорожная станция
     * 
     */
    @XmlEnumValue("\u0436/\u0434_\u0441\u0442")
    Ж_Д_СТ("\u0436/\u0434_\u0441\u0442"),

    /**
     * Казарма
     * 
     */
    @XmlEnumValue("\u043a\u0430\u0437\u0430\u0440\u043c\u0430")
    КАЗАРМА("\u043a\u0430\u0437\u0430\u0440\u043c\u0430"),

    /**
     * Местечко
     * 
     */
    @XmlEnumValue("\u043c")
    М("\u043c"),

    /**
     * Микрорайон
     * 
     */
    @XmlEnumValue("\u043c\u043a\u0440")
    МКР("\u043c\u043a\u0440"),

    /**
     * Населённый пункт
     * 
     */
    @XmlEnumValue("\u043d\u043f")
    НП("\u043d\u043f"),

    /**
     * Платформа
     * 
     */
    @XmlEnumValue("\u043f\u043b\u0430\u0442\u0444")
    ПЛАТФ("\u043f\u043b\u0430\u0442\u0444"),

    /**
     * Посёлок
     * 
     */
    @XmlEnumValue("\u043f")
    П("\u043f"),

    /**
     * Почтовое отделение
     * 
     */
    @XmlEnumValue("\u043f/\u043e")
    П_О("\u043f/\u043e"),

    /**
     * Планировочный район
     * 
     */
    @XmlEnumValue("\u043f/\u0440")
    П_Р("\u043f/\u0440"),

    /**
     * Посёлок и(при) станция(и)
     * 
     */
    @XmlEnumValue("\u043f/\u0441\u0442")
    П_СТ("\u043f/\u0441\u0442"),

    /**
     * Полустанок
     * 
     */
    @XmlEnumValue("\u043f\u043e\u043b\u0443\u0441\u0442\u0430\u043d\u043e\u043a")
    ПОЛУСТАНОК("\u043f\u043e\u043b\u0443\u0441\u0442\u0430\u043d\u043e\u043a"),

    /**
     * Починок
     * 
     */
    @XmlEnumValue("\u043f\u043e\u0447\u0438\u043d\u043e\u043a")
    ПОЧИНОК("\u043f\u043e\u0447\u0438\u043d\u043e\u043a"),

    /**
     * Разъезд
     * 
     */
    @XmlEnumValue("\u0440\u0437\u0434")
    РЗД("\u0440\u0437\u0434"),

    /**
     * Село
     * 
     */
    @XmlEnumValue("\u0441")
    С("\u0441"),

    /**
     * Слобода
     * 
     */
    @XmlEnumValue("\u0441\u043b")
    СЛ("\u0441\u043b"),

    /**
     * Станция
     * 
     */
    @XmlEnumValue("\u0441\u0442")
    СТ("\u0441\u0442"),

    /**
     * Хутор
     * 
     */
    @XmlEnumValue("\u0445")
    Х("\u0445"),

    /**
     * Железнодорожная платформа
     * 
     */
    @XmlEnumValue("\u0436/\u0434_\u043f\u043b\u0430\u0442\u0444")
    Ж_Д_ПЛАТФ("\u0436/\u0434_\u043f\u043b\u0430\u0442\u0444"),

    /**
     * Арбан
     * 
     */
    @XmlEnumValue("\u0430\u0440\u0431\u0430\u043d")
    АРБАН("\u0430\u0440\u0431\u0430\u043d"),

    /**
     * Спуск
     * 
     */
    @XmlEnumValue("\u0441\u043f\u0443\u0441\u043a")
    СПУСК("\u0441\u043f\u0443\u0441\u043a"),

    /**
     * Канал
     * 
     */
    @XmlEnumValue("\u043a\u0430\u043d\u0430\u043b")
    КАНАЛ("\u043a\u0430\u043d\u0430\u043b"),

    /**
     * Гаражно-строительный кооператив
     * 
     */
    @XmlEnumValue("\u0433\u0441\u043a")
    ГСК("\u0433\u0441\u043a"),

    /**
     * Садовое некоммерческое товарищество
     * 
     */
    @XmlEnumValue("\u0441\u043d\u0442")
    СНТ("\u0441\u043d\u0442"),

    /**
     * Леспромхоз
     * 
     */
    @XmlEnumValue("\u043b\u043f\u0445")
    ЛПХ("\u043b\u043f\u0445"),

    /**
     * Проток
     * 
     */
    @XmlEnumValue("\u043f\u0440\u043e\u0442\u043e\u043a")
    ПРОТОК("\u043f\u0440\u043e\u0442\u043e\u043a"),

    /**
     * Коса
     * 
     */
    @XmlEnumValue("\u043a\u043e\u0441\u0430")
    КОСА("\u043a\u043e\u0441\u0430"),

    /**
     * Вал
     * 
     */
    @XmlEnumValue("\u0432\u0430\u043b")
    ВАЛ("\u0432\u0430\u043b"),

    /**
     * Ферма
     * 
     */
    @XmlEnumValue("\u0444\u0435\u0440\u043c\u0430")
    ФЕРМА("\u0444\u0435\u0440\u043c\u0430"),

    /**
     * Мост
     * 
     */
    @XmlEnumValue("\u043c\u043e\u0441\u0442")
    МОСТ("\u043c\u043e\u0441\u0442"),

    /**
     * Ряды
     * 
     */
    @XmlEnumValue("\u0440\u044f\u0434\u044b")
    РЯДЫ("\u0440\u044f\u0434\u044b"),

    /**
     * Абонентский ящик
     * 
     */
    @XmlEnumValue("\u0430/\u044f")
    А_Я("\u0430/\u044f"),

    /**
     * Берег
     * 
     */
    @XmlEnumValue("\u0431\u0435\u0440\u0435\u0433")
    БЕРЕГ("\u0431\u0435\u0440\u0435\u0433"),

    /**
     * Просека
     * 
     */
    @XmlEnumValue("\u043f\u0440\u043e\u0441\u0435\u043a\u0430")
    ПРОСЕКА("\u043f\u0440\u043e\u0441\u0435\u043a\u0430"),

    /**
     * Протока
     * 
     */
    @XmlEnumValue("\u043f\u0440\u043e\u0442\u043e\u043a\u0430")
    ПРОТОКА("\u043f\u0440\u043e\u0442\u043e\u043a\u0430"),

    /**
     * Бугор
     * 
     */
    @XmlEnumValue("\u0431\u0443\u0433\u043e\u0440")
    БУГОР("\u0431\u0443\u0433\u043e\u0440"),

    /**
     * Зона
     * 
     */
    @XmlEnumValue("\u0437\u043e\u043d\u0430")
    ЗОНА("\u0437\u043e\u043d\u0430"),

    /**
     * Дачное некоммерческое партнёрство
     * 
     */
    @XmlEnumValue("\u0434\u043d\u043f")
    ДНП("\u0434\u043d\u043f"),

    /**
     * Некоммерческое партнёрство
     * 
     */
    @XmlEnumValue("\u043d/\u043f")
    Н_П("\u043d/\u043f"),

    /**
     * Фермерское хозяйство
     * 
     */
    @XmlEnumValue("\u0444/\u0445")
    Ф_Х("\u0444/\u0445"),

    /**
     * Местность
     * 
     */
    @XmlEnumValue("\u043c\u0435\u0441\u0442\u043d\u043e\u0441\u0442\u044c")
    МЕСТНОСТЬ("\u043c\u0435\u0441\u0442\u043d\u043e\u0441\u0442\u044c"),

    /**
     * Балка
     * 
     */
    @XmlEnumValue("\u0431\u0430\u043b\u043a\u0430")
    БАЛКА("\u0431\u0430\u043b\u043a\u0430"),

    /**
     * Бухта
     * 
     */
    @XmlEnumValue("\u0431\u0443\u0445\u0442\u0430")
    БУХТА("\u0431\u0443\u0445\u0442\u0430"),

    /**
     * Причал
     * 
     */
    @XmlEnumValue("\u043f\u0440\u0438\u0447\u0430\u043b")
    ПРИЧАЛ("\u043f\u0440\u0438\u0447\u0430\u043b"),

    /**
     * Мыс
     * 
     */
    @XmlEnumValue("\u043c\u044b\u0441")
    МЫС("\u043c\u044b\u0441"),

    /**
     * Маяк
     * 
     */
    @XmlEnumValue("\u043c\u0430\u044f\u043a")
    МАЯК("\u043c\u0430\u044f\u043a"),

    /**
     * Горка
     * 
     */
    @XmlEnumValue("\u0433\u043e\u0440\u043a\u0430")
    ГОРКА("\u0433\u043e\u0440\u043a\u0430"),

    /**
     * Тоннель
     * 
     */
    @XmlEnumValue("\u0442\u043e\u043d\u043d\u0435\u043b\u044c")
    ТОННЕЛЬ("\u0442\u043e\u043d\u043d\u0435\u043b\u044c");
    private final String value;

    DStreets(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DStreets fromValue(String v) {
        for (DStreets c: DStreets.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
