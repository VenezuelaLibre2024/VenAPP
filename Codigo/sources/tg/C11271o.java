package tg;

import java.util.Collection;
import java.util.Collections;
import p066dg.EnumC6940a;

/* renamed from: tg.o */
/* loaded from: classes2.dex */
public final class C11271o extends AbstractC11275s {

    /* renamed from: b */
    private static final int[] f29233b = {1, 1, 1, 1};

    /* renamed from: c */
    private static final int[] f29234c = {3, 1, 1};

    /* renamed from: d */
    private static final int[][] f29235d = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // tg.AbstractC11275s
    /* renamed from: d */
    public boolean[] mo35182d(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
        }
        AbstractC11275s.m35229c(str);
        boolean[] zArr = new boolean[(length * 9) + 9];
        int m35228b = AbstractC11275s.m35228b(zArr, 0, f29233b, true);
        for (int i10 = 0; i10 < length; i10 += 2) {
            int digit = Character.digit(str.charAt(i10), 10);
            int digit2 = Character.digit(str.charAt(i10 + 1), 10);
            int[] iArr = new int[10];
            for (int i11 = 0; i11 < 5; i11++) {
                int i12 = i11 * 2;
                int[][] iArr2 = f29235d;
                iArr[i12] = iArr2[digit][i11];
                iArr[i12 + 1] = iArr2[digit2][i11];
            }
            m35228b += AbstractC11275s.m35228b(zArr, m35228b, iArr, true);
        }
        AbstractC11275s.m35228b(zArr, m35228b, f29234c, true);
        return zArr;
    }

    @Override // tg.AbstractC11275s
    /* renamed from: g */
    protected Collection<EnumC6940a> mo35183g() {
        return Collections.singleton(EnumC6940a.ITF);
    }
}
