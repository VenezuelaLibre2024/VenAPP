package p133h7;

import p361t6.C11005b3;
import p363t8.C11137a;
import p363t8.C11146e0;
import p459y6.C12624n;
import p459y6.InterfaceC12622l;

/* renamed from: h7.f */
/* loaded from: classes.dex */
final class C7659f {

    /* renamed from: a */
    public int f18135a;

    /* renamed from: b */
    public int f18136b;

    /* renamed from: c */
    public long f18137c;

    /* renamed from: d */
    public long f18138d;

    /* renamed from: e */
    public long f18139e;

    /* renamed from: f */
    public long f18140f;

    /* renamed from: g */
    public int f18141g;

    /* renamed from: h */
    public int f18142h;

    /* renamed from: i */
    public int f18143i;

    /* renamed from: j */
    public final int[] f18144j = new int[255];

    /* renamed from: k */
    private final C11146e0 f18145k = new C11146e0(255);

    /* renamed from: a */
    public boolean m23269a(InterfaceC12622l interfaceC12622l, boolean z10) {
        m23270b();
        this.f18145k.m34673Q(27);
        if (!C12624n.m41565b(interfaceC12622l, this.f18145k.m34682e(), 0, 27, z10) || this.f18145k.m34666J() != 1332176723) {
            return false;
        }
        int m34664H = this.f18145k.m34664H();
        this.f18135a = m34664H;
        if (m34664H != 0) {
            if (z10) {
                return false;
            }
            throw C11005b3.m33719e("unsupported bit stream revision");
        }
        this.f18136b = this.f18145k.m34664H();
        this.f18137c = this.f18145k.m34697v();
        this.f18138d = this.f18145k.m34699x();
        this.f18139e = this.f18145k.m34699x();
        this.f18140f = this.f18145k.m34699x();
        int m34664H2 = this.f18145k.m34664H();
        this.f18141g = m34664H2;
        this.f18142h = m34664H2 + 27;
        this.f18145k.m34673Q(m34664H2);
        if (!C12624n.m41565b(interfaceC12622l, this.f18145k.m34682e(), 0, this.f18141g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f18141g; i10++) {
            this.f18144j[i10] = this.f18145k.m34664H();
            this.f18143i += this.f18144j[i10];
        }
        return true;
    }

    /* renamed from: b */
    public void m23270b() {
        this.f18135a = 0;
        this.f18136b = 0;
        this.f18137c = 0L;
        this.f18138d = 0L;
        this.f18139e = 0L;
        this.f18140f = 0L;
        this.f18141g = 0;
        this.f18142h = 0;
        this.f18143i = 0;
    }

    /* renamed from: c */
    public boolean m23271c(InterfaceC12622l interfaceC12622l) {
        return m23272d(interfaceC12622l, -1L);
    }

    /* renamed from: d */
    public boolean m23272d(InterfaceC12622l interfaceC12622l, long j10) {
        C11137a.m34599a(interfaceC12622l.getPosition() == interfaceC12622l.mo19807i());
        this.f18145k.m34673Q(4);
        while (true) {
            if ((j10 == -1 || interfaceC12622l.getPosition() + 4 < j10) && C12624n.m41565b(interfaceC12622l, this.f18145k.m34682e(), 0, 4, true)) {
                this.f18145k.m34677U(0);
                if (this.f18145k.m34666J() == 1332176723) {
                    interfaceC12622l.mo41534f();
                    return true;
                }
                interfaceC12622l.mo41538n(1);
            }
        }
        do {
            if (j10 != -1 && interfaceC12622l.getPosition() >= j10) {
                break;
            }
        } while (interfaceC12622l.mo41532a(1) != -1);
        return false;
    }
}
