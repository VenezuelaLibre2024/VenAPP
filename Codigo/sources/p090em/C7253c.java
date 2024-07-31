package p090em;

import dm.C7077u;
import kotlin.jvm.internal.C9322n;

/* renamed from: em.c */
/* loaded from: classes3.dex */
public final class C7253c {
    /* renamed from: a */
    public static final int m21702a(int[] iArr, int i10, int i11, int i12) {
        C9322n.m27781e(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    /* renamed from: b */
    public static final int m21703b(C7077u c7077u, int i10) {
        C9322n.m27781e(c7077u, "<this>");
        int m21702a = m21702a(c7077u.m20845H(), i10 + 1, 0, c7077u.m20846I().length);
        return m21702a >= 0 ? m21702a : ~m21702a;
    }
}
