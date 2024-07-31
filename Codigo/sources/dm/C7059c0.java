package dm;

import dm.C7056b;
import kotlin.jvm.internal.C9322n;
import p090em.C7252b;
import p450xk.C12524p;

/* renamed from: dm.c0 */
/* loaded from: classes3.dex */
public final class C7059c0 {

    /* renamed from: a */
    private static final C7056b.a f15647a = new C7056b.a();

    /* renamed from: b */
    private static final int f15648b = -1234567890;

    /* renamed from: a */
    public static final boolean m20744a(byte[] a10, int i10, byte[] b10, int i11, int i12) {
        C9322n.m27781e(a10, "a");
        C9322n.m27781e(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final void m20745b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    /* renamed from: c */
    public static final int m20746c() {
        return f15648b;
    }

    /* renamed from: d */
    public static final int m20747d(C7061e c7061e, int i10) {
        C9322n.m27781e(c7061e, "<this>");
        return i10 == f15648b ? c7061e.m20756B() : i10;
    }

    /* renamed from: e */
    public static final int m20748e(byte[] bArr, int i10) {
        C9322n.m27781e(bArr, "<this>");
        return i10 == f15648b ? bArr.length : i10;
    }

    /* renamed from: f */
    public static final int m20749f(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    /* renamed from: g */
    public static final short m20750g(short s10) {
        int i10 = s10 & 65535;
        return (short) (((i10 & 255) << 8) | ((65280 & i10) >>> 8));
    }

    /* renamed from: h */
    public static final String m20751h(byte b10) {
        String m41032m;
        m41032m = C12524p.m41032m(new char[]{C7252b.m21701f()[(b10 >> 4) & 15], C7252b.m21701f()[b10 & 15]});
        return m41032m;
    }

    /* renamed from: i */
    public static final String m20752i(int i10) {
        String m41033n;
        if (i10 == 0) {
            return "0";
        }
        int i11 = 0;
        char[] cArr = {C7252b.m21701f()[(i10 >> 28) & 15], C7252b.m21701f()[(i10 >> 24) & 15], C7252b.m21701f()[(i10 >> 20) & 15], C7252b.m21701f()[(i10 >> 16) & 15], C7252b.m21701f()[(i10 >> 12) & 15], C7252b.m21701f()[(i10 >> 8) & 15], C7252b.m21701f()[(i10 >> 4) & 15], C7252b.m21701f()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        m41033n = C12524p.m41033n(cArr, i11, 8);
        return m41033n;
    }
}
