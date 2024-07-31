package io.grpc.internal;

import gb.C7536c;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.internal.a1 */
/* loaded from: classes3.dex */
public class C8827a1 {

    /* renamed from: a */
    private static final long f20251a = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: a */
    public static List<Map<String, ?>> m25257a(List<?> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!(list.get(i10) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i10), Integer.valueOf(i10), list));
            }
        }
        return list;
    }

    /* renamed from: b */
    public static List<String> m25258b(List<?> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!(list.get(i10) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", list.get(i10), Integer.valueOf(i10), list));
            }
        }
        return list;
    }

    /* renamed from: c */
    private static boolean m25259c(long j10, int i10) {
        if (j10 >= -315576000000L && j10 <= 315576000000L) {
            long j11 = i10;
            if (j11 >= -999999999 && j11 < f20251a) {
                if (j10 >= 0 && i10 >= 0) {
                    return true;
                }
                if (j10 <= 0 && i10 <= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public static Boolean m25260d(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    /* renamed from: e */
    public static List<?> m25261e(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    /* renamed from: f */
    public static List<Map<String, ?>> m25262f(Map<String, ?> map, String str) {
        List<?> m25261e = m25261e(map, str);
        if (m25261e == null) {
            return null;
        }
        return m25257a(m25261e);
    }

    /* renamed from: g */
    public static List<String> m25263g(Map<String, ?> map, String str) {
        List<?> m25261e = m25261e(map, str);
        if (m25261e == null) {
            return null;
        }
        return m25258b(m25261e);
    }

    /* renamed from: h */
    public static Double m25264h(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    /* renamed from: i */
    public static Integer m25265i(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d10 = (Double) obj;
        int intValue = d10.intValue();
        if (intValue == d10.doubleValue()) {
            return Integer.valueOf(intValue);
        }
        throw new ClassCastException("Number expected to be integer: " + d10);
    }

    /* renamed from: j */
    public static Map<String, ?> m25266j(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    /* renamed from: k */
    public static String m25267k(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    /* renamed from: l */
    public static Long m25268l(Map<String, ?> map, String str) {
        String m25267k = m25267k(map, str);
        if (m25267k == null) {
            return null;
        }
        try {
            return Long.valueOf(m25270n(m25267k));
        } catch (ParseException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: m */
    private static long m25269m(long j10, int i10) {
        long j11 = i10;
        long j12 = f20251a;
        if (j11 <= (-j12) || j11 >= j12) {
            j10 = C7536c.m22886a(j10, j11 / j12);
            i10 = (int) (j11 % j12);
        }
        if (j10 > 0 && i10 < 0) {
            i10 = (int) (i10 + j12);
            j10--;
        }
        if (j10 < 0 && i10 > 0) {
            i10 = (int) (i10 - j12);
            j10++;
        }
        if (m25259c(j10, i10)) {
            return m25272p(TimeUnit.SECONDS.toNanos(j10), i10);
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j10), Integer.valueOf(i10)));
    }

    /* renamed from: n */
    private static long m25270n(String str) {
        boolean z10;
        String str2;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: " + str, 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z10 = true;
        } else {
            z10 = false;
        }
        String substring = str.substring(0, str.length() - 1);
        int indexOf = substring.indexOf(46);
        if (indexOf != -1) {
            str2 = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
        } else {
            str2 = "";
        }
        long parseLong = Long.parseLong(substring);
        int m25271o = str2.isEmpty() ? 0 : m25271o(str2);
        if (parseLong < 0) {
            throw new ParseException("Invalid duration string: " + str, 0);
        }
        if (z10) {
            parseLong = -parseLong;
            m25271o = -m25271o;
        }
        try {
            return m25269m(parseLong, m25271o);
        } catch (IllegalArgumentException unused) {
            throw new ParseException("Duration value is out of range.", 0);
        }
    }

    /* renamed from: o */
    private static int m25271o(String str) {
        int i10 = 0;
        for (int i11 = 0; i11 < 9; i11++) {
            i10 *= 10;
            if (i11 < str.length()) {
                if (str.charAt(i11) < '0' || str.charAt(i11) > '9') {
                    throw new ParseException("Invalid nanoseconds.", 0);
                }
                i10 += str.charAt(i11) - '0';
            }
        }
        return i10;
    }

    /* renamed from: p */
    private static long m25272p(long j10, long j11) {
        long j12 = j10 + j11;
        return (((j11 ^ j10) > 0L ? 1 : ((j11 ^ j10) == 0L ? 0 : -1)) < 0) | ((j10 ^ j12) >= 0) ? j12 : ((j12 >>> 63) ^ 1) + Long.MAX_VALUE;
    }
}
