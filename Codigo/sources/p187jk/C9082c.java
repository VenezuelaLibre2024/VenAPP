package p187jk;

/* renamed from: jk.c */
/* loaded from: classes3.dex */
public final class C9082c {
    /* renamed from: a */
    private static final int m26685a(int i10, int i11, int i12) {
        return m26689e(m26689e(i10, i12) - m26689e(i11, i12), i12);
    }

    /* renamed from: b */
    private static final long m26686b(long j10, long j11, long j12) {
        return m26690f(m26690f(j10, j12) - m26690f(j11, j12), j12);
    }

    /* renamed from: c */
    public static final int m26687c(int i10, int i11, int i12) {
        if (i12 > 0) {
            return i10 >= i11 ? i11 : i11 - m26685a(i11, i10, i12);
        }
        if (i12 < 0) {
            return i10 <= i11 ? i11 : i11 + m26685a(i10, i11, -i12);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: d */
    public static final long m26688d(long j10, long j11, long j12) {
        if (j12 > 0) {
            return j10 >= j11 ? j11 : j11 - m26686b(j11, j10, j12);
        }
        if (j12 < 0) {
            return j10 <= j11 ? j11 : j11 + m26686b(j10, j11, -j12);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: e */
    private static final int m26689e(int i10, int i11) {
        int i12 = i10 % i11;
        return i12 >= 0 ? i12 : i12 + i11;
    }

    /* renamed from: f */
    private static final long m26690f(long j10, long j11) {
        long j12 = j10 % j11;
        return j12 >= 0 ? j12 : j12 + j11;
    }
}
