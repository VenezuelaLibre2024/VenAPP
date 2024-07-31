package tg;

import java.util.Collection;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class l extends z {
    @Override // tg.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + y.r(str);
            } catch (dg.h e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got " + length);
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
        boolean[] zArr = new boolean[67];
        int b10 = s.b(zArr, 0, y.f26949d, true) + 0;
        for (int i10 = 0; i10 <= 3; i10++) {
            b10 += s.b(zArr, b10, y.f26952g[Character.digit(str.charAt(i10), 10)], false);
        }
        int b11 = b10 + s.b(zArr, b10, y.f26950e, false);
        for (int i11 = 4; i11 <= 7; i11++) {
            b11 += s.b(zArr, b11, y.f26952g[Character.digit(str.charAt(i11), 10)], true);
        }
        s.b(zArr, b11, y.f26949d, true);
        return zArr;
    }

    @Override // tg.s
    protected Collection<dg.a> g() {
        return Collections.singleton(dg.a.EAN_8);
    }
}
