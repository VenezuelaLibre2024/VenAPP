package com.google.common.collect;

import java.util.Arrays;
import p082eb.C7155k;

/* renamed from: com.google.common.collect.m */
/* loaded from: classes2.dex */
final class C5887m {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m15001a(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            return i10 <= 256 ? new byte[i10] : i10 <= 65536 ? new short[i10] : new int[i10];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m15002b(int i10, int i11) {
        return i10 & (~i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m15003c(int i10, int i11) {
        return i10 & i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m15004d(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m15005e(int i10) {
        return (i10 < 32 ? 4 : 2) * (i10 + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m15006f(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i11;
        int i12;
        int m15051c = C5901t.m15051c(obj);
        int i13 = m15051c & i10;
        int m15008h = m15008h(obj3, i13);
        if (m15008h == 0) {
            return -1;
        }
        int m15002b = m15002b(m15051c, i10);
        int i14 = -1;
        while (true) {
            i11 = m15008h - 1;
            i12 = iArr[i11];
            if (m15002b(i12, i10) != m15002b || !C7155k.m21289a(obj, objArr[i11]) || (objArr2 != null && !C7155k.m21289a(obj2, objArr2[i11]))) {
                int m15003c = m15003c(i12, i10);
                if (m15003c == 0) {
                    return -1;
                }
                i14 = i11;
                m15008h = m15003c;
            }
        }
        int m15003c2 = m15003c(i12, i10);
        if (i14 == -1) {
            m15009i(obj3, i13, m15003c2);
        } else {
            iArr[i14] = m15004d(iArr[i14], m15003c2, i10);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static void m15007g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m15008h(Object obj, int i10) {
        return obj instanceof byte[] ? ((byte[]) obj)[i10] & 255 : obj instanceof short[] ? ((short[]) obj)[i10] & 65535 : ((int[]) obj)[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m15009i(Object obj, int i10, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m15010j(int i10) {
        return Math.max(4, C5901t.m15049a(i10 + 1, 1.0d));
    }
}
