package tg;

import java.util.Collection;
import java.util.Collections;
import p066dg.C6947h;
import p066dg.EnumC6940a;

/* renamed from: tg.j */
/* loaded from: classes2.dex */
public final class C11266j extends AbstractC11282z {
    @Override // tg.AbstractC11275s
    /* renamed from: d */
    public boolean[] mo35182d(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + AbstractC11281y.m35249r(str);
            } catch (C6947h e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got " + length);
            }
            try {
                if (!AbstractC11281y.m35244i(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (C6947h unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        AbstractC11275s.m35229c(str);
        int i10 = C11265i.f29223j[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int m35228b = AbstractC11275s.m35228b(zArr, 0, AbstractC11281y.f29251d, true) + 0;
        for (int i11 = 1; i11 <= 6; i11++) {
            int digit = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                digit += 10;
            }
            m35228b += AbstractC11275s.m35228b(zArr, m35228b, AbstractC11281y.f29255h[digit], false);
        }
        int m35228b2 = m35228b + AbstractC11275s.m35228b(zArr, m35228b, AbstractC11281y.f29252e, false);
        for (int i12 = 7; i12 <= 12; i12++) {
            m35228b2 += AbstractC11275s.m35228b(zArr, m35228b2, AbstractC11281y.f29254g[Character.digit(str.charAt(i12), 10)], true);
        }
        AbstractC11275s.m35228b(zArr, m35228b2, AbstractC11281y.f29251d, true);
        return zArr;
    }

    @Override // tg.AbstractC11275s
    /* renamed from: g */
    protected Collection<EnumC6940a> mo35183g() {
        return Collections.singleton(EnumC6940a.EAN_13);
    }
}
