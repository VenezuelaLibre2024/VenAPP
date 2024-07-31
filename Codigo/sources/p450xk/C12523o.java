package p450xk;

import kotlin.jvm.internal.C9322n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xk.o */
/* loaded from: classes3.dex */
public class C12523o extends C12522n {
    /* renamed from: i */
    public static Integer m41023i(String str) {
        C9322n.m27781e(str, "<this>");
        return m41024j(str, 10);
    }

    /* renamed from: j */
    public static final Integer m41024j(String str, int i10) {
        boolean z10;
        int i11;
        int i12;
        C9322n.m27781e(str, "<this>");
        C12510b.m40956a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char charAt = str.charAt(0);
        int i14 = -2147483647;
        if (C9322n.m27782f(charAt, 48) < 0) {
            i11 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i14 = Integer.MIN_VALUE;
                z10 = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            i11 = 0;
        }
        int i15 = -59652323;
        while (i11 < length) {
            int m40957b = C12510b.m40957b(str.charAt(i11), i10);
            if (m40957b < 0) {
                return null;
            }
            if ((i13 < i15 && (i15 != -59652323 || i13 < (i15 = i14 / i10))) || (i12 = i13 * i10) < i14 + m40957b) {
                return null;
            }
            i13 = i12 - m40957b;
            i11++;
        }
        return z10 ? Integer.valueOf(i13) : Integer.valueOf(-i13);
    }

    /* renamed from: k */
    public static Long m41025k(String str) {
        C9322n.m27781e(str, "<this>");
        return m41026l(str, 10);
    }

    /* renamed from: l */
    public static final Long m41026l(String str, int i10) {
        boolean z10;
        C9322n.m27781e(str, "<this>");
        C12510b.m40956a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char charAt = str.charAt(0);
        long j10 = -9223372036854775807L;
        if (C9322n.m27782f(charAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j10 = Long.MIN_VALUE;
                i11 = 1;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z10 = false;
                i11 = 1;
            }
        } else {
            z10 = false;
        }
        long j11 = -256204778801521550L;
        long j12 = 0;
        long j13 = -256204778801521550L;
        while (i11 < length) {
            int m40957b = C12510b.m40957b(str.charAt(i11), i10);
            if (m40957b < 0) {
                return null;
            }
            if (j12 < j13) {
                if (j13 == j11) {
                    j13 = j10 / i10;
                    if (j12 < j13) {
                    }
                }
                return null;
            }
            long j14 = j12 * i10;
            long j15 = m40957b;
            if (j14 < j10 + j15) {
                return null;
            }
            j12 = j14 - j15;
            i11++;
            j11 = -256204778801521550L;
        }
        return z10 ? Long.valueOf(j12) : Long.valueOf(-j12);
    }
}
