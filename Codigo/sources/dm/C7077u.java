package dm;

import dk.C7019l;
import java.security.MessageDigest;
import kotlin.jvm.internal.C9322n;
import p090em.C7253c;

/* renamed from: dm.u */
/* loaded from: classes3.dex */
public final class C7077u extends C7061e {

    /* renamed from: f */
    private final transient byte[][] f15693f;

    /* renamed from: r */
    private final transient int[] f15694r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7077u(byte[][] segments, int[] directory) {
        super(C7061e.f15650e.m20766n());
        C9322n.m27781e(segments, "segments");
        C9322n.m27781e(directory, "directory");
        this.f15693f = segments;
        this.f15694r = directory;
    }

    /* renamed from: J */
    private final C7061e m20844J() {
        return new C7061e(mo20759E());
    }

    private final Object writeReplace() {
        return m20844J();
    }

    @Override // dm.C7061e
    /* renamed from: D */
    public C7061e mo20758D() {
        return m20844J().mo20758D();
    }

    @Override // dm.C7061e
    /* renamed from: E */
    public byte[] mo20759E() {
        byte[] bArr = new byte[m20756B()];
        int length = m20846I().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = m20845H()[length + i10];
            int i14 = m20845H()[i10];
            int i15 = i14 - i11;
            C7019l.m20436d(m20846I()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // dm.C7061e
    /* renamed from: G */
    public void mo20761G(C7056b buffer, int i10, int i11) {
        C9322n.m27781e(buffer, "buffer");
        int i12 = i10 + i11;
        int m21703b = C7253c.m21703b(this, i10);
        while (i10 < i12) {
            int i13 = m21703b == 0 ? 0 : m20845H()[m21703b - 1];
            int i14 = m20845H()[m21703b] - i13;
            int i15 = m20845H()[m20846I().length + m21703b];
            int min = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            C7075s c7075s = new C7075s(m20846I()[m21703b], i16, i16 + min, true, false);
            C7075s c7075s2 = buffer.f15638a;
            if (c7075s2 == null) {
                c7075s.f15687g = c7075s;
                c7075s.f15686f = c7075s;
                buffer.f15638a = c7075s;
            } else {
                C9322n.m27778b(c7075s2);
                C7075s c7075s3 = c7075s2.f15687g;
                C9322n.m27778b(c7075s3);
                c7075s3.m20837c(c7075s);
            }
            i10 += min;
            m21703b++;
        }
        buffer.m20727j0(buffer.size() + i11);
    }

    /* renamed from: H */
    public final int[] m20845H() {
        return this.f15694r;
    }

    /* renamed from: I */
    public final byte[][] m20846I() {
        return this.f15693f;
    }

    @Override // dm.C7061e
    /* renamed from: b */
    public String mo20762b() {
        return m20844J().mo20762b();
    }

    @Override // dm.C7061e
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7061e) {
            C7061e c7061e = (C7061e) obj;
            if (c7061e.m20756B() == m20756B() && mo20773v(0, c7061e, 0, m20756B())) {
                return true;
            }
        }
        return false;
    }

    @Override // dm.C7061e
    public int hashCode() {
        int m20767o = m20767o();
        if (m20767o != 0) {
            return m20767o;
        }
        int length = m20846I().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = m20845H()[length + i10];
            int i14 = m20845H()[i10];
            byte[] bArr = m20846I()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        m20775x(i11);
        return i11;
    }

    @Override // dm.C7061e
    /* renamed from: i */
    public C7061e mo20764i(String algorithm) {
        C9322n.m27781e(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = m20846I().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = m20845H()[length + i10];
            int i13 = m20845H()[i10];
            messageDigest.update(m20846I()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digestBytes = messageDigest.digest();
        C9322n.m27780d(digestBytes, "digestBytes");
        return new C7061e(digestBytes);
    }

    @Override // dm.C7061e
    /* renamed from: p */
    public int mo20768p() {
        return m20845H()[m20846I().length - 1];
    }

    @Override // dm.C7061e
    /* renamed from: r */
    public String mo20770r() {
        return m20844J().mo20770r();
    }

    @Override // dm.C7061e
    /* renamed from: s */
    public byte[] mo20771s() {
        return mo20759E();
    }

    @Override // dm.C7061e
    /* renamed from: t */
    public byte mo20772t(int i10) {
        C7059c0.m20745b(m20845H()[m20846I().length - 1], i10, 1L);
        int m21703b = C7253c.m21703b(this, i10);
        return m20846I()[m21703b][(i10 - (m21703b == 0 ? 0 : m20845H()[m21703b - 1])) + m20845H()[m20846I().length + m21703b]];
    }

    @Override // dm.C7061e
    public String toString() {
        return m20844J().toString();
    }

    @Override // dm.C7061e
    /* renamed from: v */
    public boolean mo20773v(int i10, C7061e other, int i11, int i12) {
        C9322n.m27781e(other, "other");
        if (i10 < 0 || i10 > m20756B() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int m21703b = C7253c.m21703b(this, i10);
        while (i10 < i13) {
            int i14 = m21703b == 0 ? 0 : m20845H()[m21703b - 1];
            int i15 = m20845H()[m21703b] - i14;
            int i16 = m20845H()[m20846I().length + m21703b];
            int min = Math.min(i13, i15 + i14) - i10;
            if (!other.mo20774w(i11, m20846I()[m21703b], i16 + (i10 - i14), min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            m21703b++;
        }
        return true;
    }

    @Override // dm.C7061e
    /* renamed from: w */
    public boolean mo20774w(int i10, byte[] other, int i11, int i12) {
        C9322n.m27781e(other, "other");
        if (i10 < 0 || i10 > m20756B() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int m21703b = C7253c.m21703b(this, i10);
        while (i10 < i13) {
            int i14 = m21703b == 0 ? 0 : m20845H()[m21703b - 1];
            int i15 = m20845H()[m21703b] - i14;
            int i16 = m20845H()[m20846I().length + m21703b];
            int min = Math.min(i13, i15 + i14) - i10;
            if (!C7059c0.m20744a(m20846I()[m21703b], i16 + (i10 - i14), other, i11, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            m21703b++;
        }
        return true;
    }
}
