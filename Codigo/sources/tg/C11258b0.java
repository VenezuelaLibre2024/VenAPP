package tg;

import java.util.Collection;
import java.util.Collections;
import p066dg.C6947h;
import p066dg.EnumC6940a;

/* renamed from: tg.b0 */
/* loaded from: classes2.dex */
public final class C11258b0 extends AbstractC11282z {
    @Override // tg.AbstractC11275s
    /* renamed from: d */
    public boolean[] mo35182d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + AbstractC11281y.m35249r(C11256a0.m35176s(str));
            } catch (C6947h e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got " + length);
            }
            try {
                if (!AbstractC11281y.m35244i(C11256a0.m35176s(str))) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (C6947h unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        AbstractC11275s.m35229c(str);
        int digit = Character.digit(str.charAt(0), 10);
        if (digit != 0 && digit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i10 = C11256a0.f29196k[digit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int m35228b = AbstractC11275s.m35228b(zArr, 0, AbstractC11281y.f29251d, true);
        for (int i11 = 1; i11 <= 6; i11++) {
            int digit2 = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                digit2 += 10;
            }
            m35228b += AbstractC11275s.m35228b(zArr, m35228b, AbstractC11281y.f29255h[digit2], false);
        }
        AbstractC11275s.m35228b(zArr, m35228b, AbstractC11281y.f29253f, false);
        return zArr;
    }

    @Override // tg.AbstractC11275s
    /* renamed from: g */
    protected Collection<EnumC6940a> mo35183g() {
        return Collections.singleton(EnumC6940a.UPC_E);
    }
}
