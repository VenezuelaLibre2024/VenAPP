package lf;

import java.util.TimeZone;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final TimeZone f21214a = TimeZone.getTimeZone("UTC");

    private static boolean a(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    private static int b(String str, int i10) {
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (charAt < '0' || charAt > '9') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, NumberFormatException -> 0x01be, IndexOutOfBoundsException -> 0x01c0, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:18:0x0050, B:20:0x0060, B:21:0x0062, B:23:0x006e, B:24:0x0070, B:26:0x0076, B:30:0x0080, B:35:0x0090, B:37:0x0098, B:42:0x00c9, B:44:0x00cf, B:46:0x00d6, B:47:0x0183, B:52:0x00e0, B:53:0x00fb, B:54:0x00fc, B:57:0x0118, B:59:0x0125, B:62:0x012e, B:64:0x014d, B:67:0x015c, B:68:0x017e, B:70:0x0181, B:71:0x0107, B:72:0x01b4, B:73:0x01bb, B:74:0x00b0, B:75:0x00b3), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b4 A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, NumberFormatException -> 0x01be, IndexOutOfBoundsException -> 0x01c0, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:18:0x0050, B:20:0x0060, B:21:0x0062, B:23:0x006e, B:24:0x0070, B:26:0x0076, B:30:0x0080, B:35:0x0090, B:37:0x0098, B:42:0x00c9, B:44:0x00cf, B:46:0x00d6, B:47:0x0183, B:52:0x00e0, B:53:0x00fb, B:54:0x00fc, B:57:0x0118, B:59:0x0125, B:62:0x012e, B:64:0x014d, B:67:0x015c, B:68:0x017e, B:70:0x0181, B:71:0x0107, B:72:0x01b4, B:73:0x01bb, B:74:0x00b0, B:75:0x00b3), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date c(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.a.c(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int d(String str, int i10, int i11) {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int digit = Character.digit(str.charAt(i10), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = -digit;
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int digit2 = Character.digit(str.charAt(i13), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = (i12 * 10) - digit2;
            i13 = i14;
        }
        return -i12;
    }
}