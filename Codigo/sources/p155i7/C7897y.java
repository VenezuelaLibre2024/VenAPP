package p155i7;

import p363t8.C11146e0;
import p363t8.C11164n0;
import p363t8.C11172r0;
import p363t8.C11173s;
import p459y6.C12635y;
import p459y6.InterfaceC12622l;

/* renamed from: i7.y */
/* loaded from: classes.dex */
final class C7897y {

    /* renamed from: c */
    private boolean f19199c;

    /* renamed from: d */
    private boolean f19200d;

    /* renamed from: e */
    private boolean f19201e;

    /* renamed from: a */
    private final C11164n0 f19197a = new C11164n0(0);

    /* renamed from: f */
    private long f19202f = -9223372036854775807L;

    /* renamed from: g */
    private long f19203g = -9223372036854775807L;

    /* renamed from: h */
    private long f19204h = -9223372036854775807L;

    /* renamed from: b */
    private final C11146e0 f19198b = new C11146e0();

    /* renamed from: a */
    private static boolean m24347a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    /* renamed from: b */
    private int m24348b(InterfaceC12622l interfaceC12622l) {
        this.f19198b.m34674R(C11172r0.f29045f);
        this.f19199c = true;
        interfaceC12622l.mo41534f();
        return 0;
    }

    /* renamed from: f */
    private int m24349f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    /* renamed from: h */
    private int m24350h(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        int min = (int) Math.min(20000L, interfaceC12622l.getLength());
        long j10 = 0;
        if (interfaceC12622l.getPosition() != j10) {
            c12635y.f34331a = j10;
            return 1;
        }
        this.f19198b.m34673Q(min);
        interfaceC12622l.mo41534f();
        interfaceC12622l.mo41540q(this.f19198b.m34682e(), 0, min);
        this.f19202f = m24351i(this.f19198b);
        this.f19200d = true;
        return 0;
    }

    /* renamed from: i */
    private long m24351i(C11146e0 c11146e0) {
        int m34684g = c11146e0.m34684g();
        for (int m34683f = c11146e0.m34683f(); m34683f < m34684g - 3; m34683f++) {
            if (m24349f(c11146e0.m34682e(), m34683f) == 442) {
                c11146e0.m34677U(m34683f + 4);
                long m24354l = m24354l(c11146e0);
                if (m24354l != -9223372036854775807L) {
                    return m24354l;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: j */
    private int m24352j(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        long length = interfaceC12622l.getLength();
        int min = (int) Math.min(20000L, length);
        long j10 = length - min;
        if (interfaceC12622l.getPosition() != j10) {
            c12635y.f34331a = j10;
            return 1;
        }
        this.f19198b.m34673Q(min);
        interfaceC12622l.mo41534f();
        interfaceC12622l.mo41540q(this.f19198b.m34682e(), 0, min);
        this.f19203g = m24353k(this.f19198b);
        this.f19201e = true;
        return 0;
    }

    /* renamed from: k */
    private long m24353k(C11146e0 c11146e0) {
        int m34683f = c11146e0.m34683f();
        for (int m34684g = c11146e0.m34684g() - 4; m34684g >= m34683f; m34684g--) {
            if (m24349f(c11146e0.m34682e(), m34684g) == 442) {
                c11146e0.m34677U(m34684g + 4);
                long m24354l = m24354l(c11146e0);
                if (m24354l != -9223372036854775807L) {
                    return m24354l;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: l */
    public static long m24354l(C11146e0 c11146e0) {
        int m34683f = c11146e0.m34683f();
        if (c11146e0.m34679a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c11146e0.m34688l(bArr, 0, 9);
        c11146e0.m34677U(m34683f);
        if (m24347a(bArr)) {
            return m24355m(bArr);
        }
        return -9223372036854775807L;
    }

    /* renamed from: m */
    private static long m24355m(byte[] bArr) {
        byte b10 = bArr[0];
        long j10 = (((b10 & 56) >> 3) << 30) | ((b10 & 3) << 28) | ((bArr[1] & 255) << 20);
        byte b11 = bArr[2];
        return j10 | (((b11 & 248) >> 3) << 15) | ((b11 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    /* renamed from: c */
    public long m24356c() {
        return this.f19204h;
    }

    /* renamed from: d */
    public C11164n0 m24357d() {
        return this.f19197a;
    }

    /* renamed from: e */
    public boolean m24358e() {
        return this.f19199c;
    }

    /* renamed from: g */
    public int m24359g(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        if (!this.f19201e) {
            return m24352j(interfaceC12622l, c12635y);
        }
        if (this.f19203g == -9223372036854775807L) {
            return m24348b(interfaceC12622l);
        }
        if (!this.f19200d) {
            return m24350h(interfaceC12622l, c12635y);
        }
        long j10 = this.f19202f;
        if (j10 == -9223372036854775807L) {
            return m24348b(interfaceC12622l);
        }
        long m34825b = this.f19197a.m34825b(this.f19203g) - this.f19197a.m34825b(j10);
        this.f19204h = m34825b;
        if (m34825b < 0) {
            C11173s.m34970i("PsDurationReader", "Invalid duration: " + this.f19204h + ". Using TIME_UNSET instead.");
            this.f19204h = -9223372036854775807L;
        }
        return m24348b(interfaceC12622l);
    }
}
