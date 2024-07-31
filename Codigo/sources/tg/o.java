package tg;

import java.util.Collection;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class o extends s {

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f26931b = {1, 1, 1, 1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f26932c = {3, 1, 1};

    /* renamed from: d, reason: collision with root package name */
    private static final int[][] f26933d = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // tg.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
        }
        s.c(str);
        boolean[] zArr = new boolean[(length * 9) + 9];
        int b10 = s.b(zArr, 0, f26931b, true);
        for (int i10 = 0; i10 < length; i10 += 2) {
            int digit = Character.digit(str.charAt(i10), 10);
            int digit2 = Character.digit(str.charAt(i10 + 1), 10);
            int[] iArr = new int[10];
            for (int i11 = 0; i11 < 5; i11++) {
                int i12 = i11 * 2;
                int[][] iArr2 = f26933d;
                iArr[i12] = iArr2[digit][i11];
                iArr[i12 + 1] = iArr2[digit2][i11];
            }
            b10 += s.b(zArr, b10, iArr, true);
        }
        s.b(zArr, b10, f26932c, true);
        return zArr;
    }

    @Override // tg.s
    protected Collection<dg.a> g() {
        return Collections.singleton(dg.a.ITF);
    }
}
