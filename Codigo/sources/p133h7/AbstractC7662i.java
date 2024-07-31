package p133h7;

import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p459y6.C12635y;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12636z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h7.i */
/* loaded from: classes.dex */
public abstract class AbstractC7662i {

    /* renamed from: b */
    private InterfaceC12609b0 f18150b;

    /* renamed from: c */
    private InterfaceC12623m f18151c;

    /* renamed from: d */
    private InterfaceC7660g f18152d;

    /* renamed from: e */
    private long f18153e;

    /* renamed from: f */
    private long f18154f;

    /* renamed from: g */
    private long f18155g;

    /* renamed from: h */
    private int f18156h;

    /* renamed from: i */
    private int f18157i;

    /* renamed from: k */
    private long f18159k;

    /* renamed from: l */
    private boolean f18160l;

    /* renamed from: m */
    private boolean f18161m;

    /* renamed from: a */
    private final C7658e f18149a = new C7658e();

    /* renamed from: j */
    private b f18158j = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h7.i$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        C11108u1 f18162a;

        /* renamed from: b */
        InterfaceC7660g f18163b;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h7.i$c */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC7660g {
        private c() {
        }

        @Override // p133h7.InterfaceC7660g
        /* renamed from: a */
        public long mo23247a(InterfaceC12622l interfaceC12622l) {
            return -1L;
        }

        @Override // p133h7.InterfaceC7660g
        /* renamed from: b */
        public InterfaceC12636z mo23248b() {
            return new InterfaceC12636z.b(-9223372036854775807L);
        }

        @Override // p133h7.InterfaceC7660g
        /* renamed from: c */
        public void mo23249c(long j10) {
        }
    }

    /* renamed from: a */
    private void m23275a() {
        C11137a.m34607i(this.f18150b);
        C11172r0.m34928j(this.f18151c);
    }

    /* renamed from: i */
    private boolean m23276i(InterfaceC12622l interfaceC12622l) {
        while (this.f18149a.m23266d(interfaceC12622l)) {
            this.f18159k = interfaceC12622l.getPosition() - this.f18154f;
            if (!mo23256h(this.f18149a.m23265c(), this.f18154f, this.f18158j)) {
                return true;
            }
            this.f18154f = interfaceC12622l.getPosition();
        }
        this.f18156h = 3;
        return false;
    }

    /* renamed from: j */
    private int m23277j(InterfaceC12622l interfaceC12622l) {
        if (!m23276i(interfaceC12622l)) {
            return -1;
        }
        C11108u1 c11108u1 = this.f18158j.f18162a;
        this.f18157i = c11108u1.f28777K;
        if (!this.f18161m) {
            this.f18150b.mo332c(c11108u1);
            this.f18161m = true;
        }
        InterfaceC7660g interfaceC7660g = this.f18158j.f18163b;
        if (interfaceC7660g == null) {
            if (interfaceC12622l.getLength() != -1) {
                C7659f m23264b = this.f18149a.m23264b();
                this.f18152d = new C7654a(this, this.f18154f, interfaceC12622l.getLength(), m23264b.f18142h + m23264b.f18143i, m23264b.f18137c, (m23264b.f18136b & 4) != 0);
                this.f18156h = 2;
                this.f18149a.m23268f();
                return 0;
            }
            interfaceC7660g = new c();
        }
        this.f18152d = interfaceC7660g;
        this.f18156h = 2;
        this.f18149a.m23268f();
        return 0;
    }

    /* renamed from: k */
    private int m23278k(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        long mo23247a = this.f18152d.mo23247a(interfaceC12622l);
        if (mo23247a >= 0) {
            c12635y.f34331a = mo23247a;
            return 1;
        }
        if (mo23247a < -1) {
            mo23282e(-(mo23247a + 2));
        }
        if (!this.f18160l) {
            this.f18151c.mo323p((InterfaceC12636z) C11137a.m34607i(this.f18152d.mo23248b()));
            this.f18160l = true;
        }
        if (this.f18159k <= 0 && !this.f18149a.m23266d(interfaceC12622l)) {
            this.f18156h = 3;
            return -1;
        }
        this.f18159k = 0L;
        C11146e0 m23265c = this.f18149a.m23265c();
        long mo23255f = mo23255f(m23265c);
        if (mo23255f >= 0) {
            long j10 = this.f18155g;
            if (j10 + mo23255f >= this.f18153e) {
                long m23279b = m23279b(j10);
                this.f18150b.m41511a(m23265c, m23265c.m34684g());
                this.f18150b.mo331b(m23279b, 1, m23265c.m34684g(), 0, null);
                this.f18153e = -1L;
            }
        }
        this.f18155g += mo23255f;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public long m23279b(long j10) {
        return (j10 * 1000000) / this.f18157i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public long m23280c(long j10) {
        return (this.f18157i * j10) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m23281d(InterfaceC12623m interfaceC12623m, InterfaceC12609b0 interfaceC12609b0) {
        this.f18151c = interfaceC12623m;
        this.f18150b = interfaceC12609b0;
        mo23257l(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23282e(long j10) {
        this.f18155g = j10;
    }

    /* renamed from: f */
    protected abstract long mo23255f(C11146e0 c11146e0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final int m23283g(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        m23275a();
        int i10 = this.f18156h;
        if (i10 == 0) {
            return m23277j(interfaceC12622l);
        }
        if (i10 == 1) {
            interfaceC12622l.mo41538n((int) this.f18154f);
            this.f18156h = 2;
            return 0;
        }
        if (i10 == 2) {
            C11172r0.m34928j(this.f18152d);
            return m23278k(interfaceC12622l, c12635y);
        }
        if (i10 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    /* renamed from: h */
    protected abstract boolean mo23256h(C11146e0 c11146e0, long j10, b bVar);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public void mo23257l(boolean z10) {
        int i10;
        if (z10) {
            this.f18158j = new b();
            this.f18154f = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f18156h = i10;
        this.f18153e = -1L;
        this.f18155g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final void m23284m(long j10, long j11) {
        this.f18149a.m23267e();
        if (j10 == 0) {
            mo23257l(!this.f18160l);
        } else if (this.f18156h != 0) {
            this.f18153e = m23280c(j11);
            ((InterfaceC7660g) C11172r0.m34928j(this.f18152d)).mo23249c(this.f18153e);
            this.f18156h = 2;
        }
    }
}
