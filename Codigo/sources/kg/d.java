package kg;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum d {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");

    private final String[] otherEncodingNames;
    private final int[] values;
    private static final Map<Integer, d> VALUE_TO_ECI = new HashMap();
    private static final Map<String, d> NAME_TO_ECI = new HashMap();

    static {
        for (d dVar : values()) {
            for (int i10 : dVar.values) {
                VALUE_TO_ECI.put(Integer.valueOf(i10), dVar);
            }
            NAME_TO_ECI.put(dVar.name(), dVar);
            for (String str : dVar.otherEncodingNames) {
                NAME_TO_ECI.put(str, dVar);
            }
        }
    }

    d(int i10) {
        this(new int[]{i10}, new String[0]);
    }

    d(int i10, String... strArr) {
        this.values = new int[]{i10};
        this.otherEncodingNames = strArr;
    }

    d(int[] iArr, String... strArr) {
        this.values = iArr;
        this.otherEncodingNames = strArr;
    }

    public static d b(Charset charset) {
        return NAME_TO_ECI.get(charset.name());
    }

    public static d h(String str) {
        return NAME_TO_ECI.get(str);
    }

    public static d i(int i10) {
        if (i10 < 0 || i10 >= 900) {
            throw dg.h.a();
        }
        return VALUE_TO_ECI.get(Integer.valueOf(i10));
    }

    public Charset l() {
        return Charset.forName(name());
    }

    public int m() {
        return this.values[0];
    }
}
