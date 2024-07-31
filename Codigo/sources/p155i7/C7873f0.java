package p155i7;

import p363t8.C11146e0;
import p363t8.C11164n0;
import p363t8.C11172r0;
import p363t8.C11173s;
import p459y6.C12635y;
import p459y6.InterfaceC12622l;

/* renamed from: i7.f0 */
/* loaded from: classes.dex */
final class C7873f0 {

    /* renamed from: a */
    private final int f18908a;

    /* renamed from: d */
    private boolean f18911d;

    /* renamed from: e */
    private boolean f18912e;

    /* renamed from: f */
    private boolean f18913f;

    /* renamed from: b */
    private final C11164n0 f18909b = new C11164n0(0);

    /* renamed from: g */
    private long f18914g = -9223372036854775807L;

    /* renamed from: h */
    private long f18915h = -9223372036854775807L;

    /* renamed from: i */
    private long f18916i = -9223372036854775807L;

    /* renamed from: c */
    private final C11146e0 f18910c = new C11146e0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7873f0(int i10) {
        this.f18908a = i10;
    }

    /* renamed from: a */
    private int m24203a(InterfaceC12622l interfaceC12622l) {
        this.f18910c.m34674R(C11172r0.f29045f);
        this.f18911d = true;
        interfaceC12622l.mo41534f();
        return 0;
    }

    /* renamed from: f */
    private int m24204f(InterfaceC12622l interfaceC12622l, C12635y c12635y, int i10) {
        int min = (int) Math.min(this.f18908a, interfaceC12622l.getLength());
        long j10 = 0;
        if (interfaceC12622l.getPosition() != j10) {
            c12635y.f34331a = j10;
            return 1;
        }
        this.f18910c.m34673Q(min);
        interfaceC12622l.mo41534f();
        interfaceC12622l.mo41540q(this.f18910c.m34682e(), 0, min);
        this.f18914g = m24205g(this.f18910c, i10);
        this.f18912e = true;
        return 0;
    }

    /* renamed from: g */
    private long m24205g(C11146e0 c11146e0, int i10) {
        int m34684g = c11146e0.m34684g();
        for (int m34683f = c11146e0.m34683f(); m34683f < m34684g; m34683f++) {
            if (c11146e0.m34682e()[m34683f] == 71) {
                long m24272c = C7881j0.m24272c(c11146e0, m34683f, i10);
                if (m24272c != -9223372036854775807L) {
                    return m24272c;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: h */
    private int m24206h(InterfaceC12622l interfaceC12622l, C12635y c12635y, int i10) {
        long length = interfaceC12622l.getLength();
        int min = (int) Math.min(this.f18908a, length);
        long j10 = length - min;
        if (interfaceC12622l.getPosition() != j10) {
            c12635y.f34331a = j10;
            return 1;
        }
        this.f18910c.m34673Q(min);
        interfaceC12622l.mo41534f();
        interfaceC12622l.mo41540q(this.f18910c.m34682e(), 0, min);
        this.f18915h = m24207i(this.f18910c, i10);
        this.f18913f = true;
        return 0;
    }

    /* renamed from: i */
    private long m24207i(C11146e0 c11146e0, int i10) {
        int m34683f = c11146e0.m34683f();
        int m34684g = c11146e0.m34684g();
        for (int i11 = m34684g - 188; i11 >= m34683f; i11--) {
            if (C7881j0.m24271b(c11146e0.m34682e(), m34683f, m34684g, i11)) {
                long m24272c = C7881j0.m24272c(c11146e0, i11, i10);
                if (m24272c != -9223372036854775807L) {
                    return m24272c;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    public long m24208b() {
        return this.f18916i;
    }

    /* renamed from: c */
    public C11164n0 m24209c() {
        return this.f18909b;
    }

    /* renamed from: d */
    public boolean m24210d() {
        return this.f18911d;
    }

    /* renamed from: e */
    public int m24211e(InterfaceC12622l interfaceC12622l, C12635y c12635y, int i10) {
        if (i10 <= 0) {
            return m24203a(interfaceC12622l);
        }
        if (!this.f18913f) {
            return m24206h(interfaceC12622l, c12635y, i10);
        }
        if (this.f18915h == -9223372036854775807L) {
            return m24203a(interfaceC12622l);
        }
        if (!this.f18912e) {
            return m24204f(interfaceC12622l, c12635y, i10);
        }
        long j10 = this.f18914g;
        if (j10 == -9223372036854775807L) {
            return m24203a(interfaceC12622l);
        }
        long m34825b = this.f18909b.m34825b(this.f18915h) - this.f18909b.m34825b(j10);
        this.f18916i = m34825b;
        if (m34825b < 0) {
            C11173s.m34970i("TsDurationReader", "Invalid duration: " + this.f18916i + ". Using TIME_UNSET instead.");
            this.f18916i = -9223372036854775807L;
        }
        return m24203a(interfaceC12622l);
    }
}
