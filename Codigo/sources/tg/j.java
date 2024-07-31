package tg;

import java.util.Collection;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class j extends z {
    @Override // tg.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + y.r(str);
            } catch (dg.h e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got " + length);
            }
            try {
                if (!y.i(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (dg.h unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        s.c(str);
        int i10 = i.f26921j[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int b10 = s.b(zArr, 0, y.f26949d, true) + 0;
        for (int i11 = 1; i11 <= 6; i11++) {
            int digit = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                digit += 10;
            }
            b10 += s.b(zArr, b10, y.f26953h[digit], false);
        }
        int b11 = b10 + s.b(zArr, b10, y.f26950e, false);
        for (int i12 = 7; i12 <= 12; i12++) {
            b11 += s.b(zArr, b11, y.f26952g[Character.digit(str.charAt(i12), 10)], true);
        }
        s.b(zArr, b11, y.f26949d, true);
        return zArr;
    }

    @Override // tg.s
    protected Collection<dg.a> g() {
        return Collections.singleton(dg.a.EAN_13);
    }
}
