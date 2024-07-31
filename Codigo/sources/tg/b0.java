package tg;

import java.util.Collection;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class b0 extends z {
    @Override // tg.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + y.r(a0.s(str));
            } catch (dg.h e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got " + length);
            }
            try {
                if (!y.i(a0.s(str))) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (dg.h unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        s.c(str);
        int digit = Character.digit(str.charAt(0), 10);
        if (digit != 0 && digit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i10 = a0.f26900k[digit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int b10 = s.b(zArr, 0, y.f26949d, true);
        for (int i11 = 1; i11 <= 6; i11++) {
            int digit2 = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                digit2 += 10;
            }
            b10 += s.b(zArr, b10, y.f26953h[digit2], false);
        }
        s.b(zArr, b10, y.f26951f, false);
        return zArr;
    }

    @Override // tg.s
    protected Collection<dg.a> g() {
        return Collections.singleton(dg.a.UPC_E);
    }
}
