package dm;

import dm.b;

/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a */
    private static final b.a f14289a = new b.a();

    /* renamed from: b */
    private static final int f14290b = -1234567890;

    public static final boolean a(byte[] a10, int i10, byte[] b10, int i11, int i12) {
        kotlin.jvm.internal.n.e(a10, "a");
        kotlin.jvm.internal.n.e(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final int c() {
        return f14290b;
    }

    public static final int d(e eVar, int i10) {
        kotlin.jvm.internal.n.e(eVar, "<this>");
        return i10 == f14290b ? eVar.B() : i10;
    }

    public static final int e(byte[] bArr, int i10) {
        kotlin.jvm.internal.n.e(bArr, "<this>");
        return i10 == f14290b ? bArr.length : i10;
    }

    public static final int f(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final short g(short s10) {
        int i10 = s10 & 65535;
        return (short) (((i10 & 255) << 8) | ((65280 & i10) >>> 8));
    }

    public static final String h(byte b10) {
        String m10;
        m10 = xk.p.m(new char[]{em.b.f()[(b10 >> 4) & 15], em.b.f()[b10 & 15]});
        return m10;
    }

    public static final String i(int i10) {
        String n10;
        if (i10 == 0) {
            return "0";
        }
        int i11 = 0;
        char[] cArr = {em.b.f()[(i10 >> 28) & 15], em.b.f()[(i10 >> 24) & 15], em.b.f()[(i10 >> 20) & 15], em.b.f()[(i10 >> 16) & 15], em.b.f()[(i10 >> 12) & 15], em.b.f()[(i10 >> 8) & 15], em.b.f()[(i10 >> 4) & 15], em.b.f()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        n10 = xk.p.n(cArr, i11, 8);
        return n10;
    }
}
