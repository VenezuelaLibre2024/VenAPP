package dm;

import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class u extends e {

    /* renamed from: f, reason: collision with root package name */
    private final transient byte[][] f14335f;

    /* renamed from: r, reason: collision with root package name */
    private final transient int[] f14336r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(byte[][] segments, int[] directory) {
        super(e.f14292e.n());
        kotlin.jvm.internal.n.e(segments, "segments");
        kotlin.jvm.internal.n.e(directory, "directory");
        this.f14335f = segments;
        this.f14336r = directory;
    }

    private final e J() {
        return new e(E());
    }

    private final Object writeReplace() {
        return J();
    }

    @Override // dm.e
    public e D() {
        return J().D();
    }

    @Override // dm.e
    public byte[] E() {
        byte[] bArr = new byte[B()];
        int length = I().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = H()[length + i10];
            int i14 = H()[i10];
            int i15 = i14 - i11;
            dk.l.d(I()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // dm.e
    public void G(b buffer, int i10, int i11) {
        kotlin.jvm.internal.n.e(buffer, "buffer");
        int i12 = i10 + i11;
        int b10 = em.c.b(this, i10);
        while (i10 < i12) {
            int i13 = b10 == 0 ? 0 : H()[b10 - 1];
            int i14 = H()[b10] - i13;
            int i15 = H()[I().length + b10];
            int min = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            s sVar = new s(I()[b10], i16, i16 + min, true, false);
            s sVar2 = buffer.f14280a;
            if (sVar2 == null) {
                sVar.f14329g = sVar;
                sVar.f14328f = sVar;
                buffer.f14280a = sVar;
            } else {
                kotlin.jvm.internal.n.b(sVar2);
                s sVar3 = sVar2.f14329g;
                kotlin.jvm.internal.n.b(sVar3);
                sVar3.c(sVar);
            }
            i10 += min;
            b10++;
        }
        buffer.j0(buffer.size() + i11);
    }

    public final int[] H() {
        return this.f14336r;
    }

    public final byte[][] I() {
        return this.f14335f;
    }

    @Override // dm.e
    public String b() {
        return J().b();
    }

    @Override // dm.e
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.B() == B() && v(0, eVar, 0, B())) {
                return true;
            }
        }
        return false;
    }

    @Override // dm.e
    public int hashCode() {
        int o10 = o();
        if (o10 != 0) {
            return o10;
        }
        int length = I().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = H()[length + i10];
            int i14 = H()[i10];
            byte[] bArr = I()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        x(i11);
        return i11;
    }

    @Override // dm.e
    public e i(String algorithm) {
        kotlin.jvm.internal.n.e(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = I().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = H()[length + i10];
            int i13 = H()[i10];
            messageDigest.update(I()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digestBytes = messageDigest.digest();
        kotlin.jvm.internal.n.d(digestBytes, "digestBytes");
        return new e(digestBytes);
    }

    @Override // dm.e
    public int p() {
        return H()[I().length - 1];
    }

    @Override // dm.e
    public String r() {
        return J().r();
    }

    @Override // dm.e
    public byte[] s() {
        return E();
    }

    @Override // dm.e
    public byte t(int i10) {
        c0.b(H()[I().length - 1], i10, 1L);
        int b10 = em.c.b(this, i10);
        return I()[b10][(i10 - (b10 == 0 ? 0 : H()[b10 - 1])) + H()[I().length + b10]];
    }

    @Override // dm.e
    public String toString() {
        return J().toString();
    }

    @Override // dm.e
    public boolean v(int i10, e other, int i11, int i12) {
        kotlin.jvm.internal.n.e(other, "other");
        if (i10 < 0 || i10 > B() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int b10 = em.c.b(this, i10);
        while (i10 < i13) {
            int i14 = b10 == 0 ? 0 : H()[b10 - 1];
            int i15 = H()[b10] - i14;
            int i16 = H()[I().length + b10];
            int min = Math.min(i13, i15 + i14) - i10;
            if (!other.w(i11, I()[b10], i16 + (i10 - i14), min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }

    @Override // dm.e
    public boolean w(int i10, byte[] other, int i11, int i12) {
        kotlin.jvm.internal.n.e(other, "other");
        if (i10 < 0 || i10 > B() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int b10 = em.c.b(this, i10);
        while (i10 < i13) {
            int i14 = b10 == 0 ? 0 : H()[b10 - 1];
            int i15 = H()[b10] - i14;
            int i16 = H()[I().length + b10];
            int min = Math.min(i13, i15 + i14) - i10;
            if (!c0.a(I()[b10], i16 + (i10 - i14), other, i11, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }
}
