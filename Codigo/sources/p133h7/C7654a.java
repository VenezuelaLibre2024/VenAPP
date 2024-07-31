package p133h7;

import java.io.EOFException;
import java.io.IOException;
import p363t8.C11137a;
import p363t8.C11172r0;
import p459y6.C12607a0;
import p459y6.C12624n;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12636z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h7.a */
/* loaded from: classes.dex */
public final class C7654a implements InterfaceC7660g {

    /* renamed from: a */
    private final C7659f f18107a;

    /* renamed from: b */
    private final long f18108b;

    /* renamed from: c */
    private final long f18109c;

    /* renamed from: d */
    private final AbstractC7662i f18110d;

    /* renamed from: e */
    private int f18111e;

    /* renamed from: f */
    private long f18112f;

    /* renamed from: g */
    private long f18113g;

    /* renamed from: h */
    private long f18114h;

    /* renamed from: i */
    private long f18115i;

    /* renamed from: j */
    private long f18116j;

    /* renamed from: k */
    private long f18117k;

    /* renamed from: l */
    private long f18118l;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h7.a$b */
    /* loaded from: classes.dex */
    public final class b implements InterfaceC12636z {
        private b() {
        }

        @Override // p459y6.InterfaceC12636z
        /* renamed from: d */
        public InterfaceC12636z.a mo125d(long j10) {
            return new InterfaceC12636z.a(new C12607a0(j10, C11172r0.m34944r((C7654a.this.f18108b + ((C7654a.this.f18110d.m23280c(j10) * (C7654a.this.f18109c - C7654a.this.f18108b)) / C7654a.this.f18112f)) - 30000, C7654a.this.f18108b, C7654a.this.f18109c - 1)));
        }

        @Override // p459y6.InterfaceC12636z
        /* renamed from: h */
        public boolean mo126h() {
            return true;
        }

        @Override // p459y6.InterfaceC12636z
        /* renamed from: i */
        public long mo127i() {
            return C7654a.this.f18110d.m23279b(C7654a.this.f18112f);
        }
    }

    public C7654a(AbstractC7662i abstractC7662i, long j10, long j11, long j12, long j13, boolean z10) {
        C11137a.m34599a(j10 >= 0 && j11 > j10);
        this.f18110d = abstractC7662i;
        this.f18108b = j10;
        this.f18109c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f18112f = j13;
            this.f18111e = 4;
        } else {
            this.f18111e = 0;
        }
        this.f18107a = new C7659f();
    }

    /* renamed from: i */
    private long m23245i(InterfaceC12622l interfaceC12622l) {
        if (this.f18115i == this.f18116j) {
            return -1L;
        }
        long position = interfaceC12622l.getPosition();
        if (!this.f18107a.m23272d(interfaceC12622l, this.f18116j)) {
            long j10 = this.f18115i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f18107a.m23269a(interfaceC12622l, false);
        interfaceC12622l.mo41534f();
        long j11 = this.f18114h;
        C7659f c7659f = this.f18107a;
        long j12 = c7659f.f18137c;
        long j13 = j11 - j12;
        int i10 = c7659f.f18142h + c7659f.f18143i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f18116j = position;
            this.f18118l = j12;
        } else {
            this.f18115i = interfaceC12622l.getPosition() + i10;
            this.f18117k = this.f18107a.f18137c;
        }
        long j14 = this.f18116j;
        long j15 = this.f18115i;
        if (j14 - j15 < 100000) {
            this.f18116j = j15;
            return j15;
        }
        long position2 = interfaceC12622l.getPosition() - (i10 * (j13 <= 0 ? 2L : 1L));
        long j16 = this.f18116j;
        long j17 = this.f18115i;
        return C11172r0.m34944r(position2 + ((j13 * (j16 - j17)) / (this.f18118l - this.f18117k)), j17, j16 - 1);
    }

    /* renamed from: k */
    private void m23246k(InterfaceC12622l interfaceC12622l) {
        while (true) {
            this.f18107a.m23271c(interfaceC12622l);
            this.f18107a.m23269a(interfaceC12622l, false);
            C7659f c7659f = this.f18107a;
            if (c7659f.f18137c > this.f18114h) {
                interfaceC12622l.mo41534f();
                return;
            } else {
                interfaceC12622l.mo41538n(c7659f.f18142h + c7659f.f18143i);
                this.f18115i = interfaceC12622l.getPosition();
                this.f18117k = this.f18107a.f18137c;
            }
        }
    }

    @Override // p133h7.InterfaceC7660g
    /* renamed from: a */
    public long mo23247a(InterfaceC12622l interfaceC12622l) {
        int i10 = this.f18111e;
        if (i10 == 0) {
            long position = interfaceC12622l.getPosition();
            this.f18113g = position;
            this.f18111e = 1;
            long j10 = this.f18109c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long m23245i = m23245i(interfaceC12622l);
                if (m23245i != -1) {
                    return m23245i;
                }
                this.f18111e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            m23246k(interfaceC12622l);
            this.f18111e = 4;
            return -(this.f18117k + 2);
        }
        this.f18112f = m23251j(interfaceC12622l);
        this.f18111e = 4;
        return this.f18113g;
    }

    @Override // p133h7.InterfaceC7660g
    /* renamed from: c */
    public void mo23249c(long j10) {
        this.f18114h = C11172r0.m34944r(j10, 0L, this.f18112f - 1);
        this.f18111e = 2;
        this.f18115i = this.f18108b;
        this.f18116j = this.f18109c;
        this.f18117k = 0L;
        this.f18118l = this.f18112f;
    }

    @Override // p133h7.InterfaceC7660g
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b mo23248b() {
        if (this.f18112f != 0) {
            return new b();
        }
        return null;
    }

    /* renamed from: j */
    long m23251j(InterfaceC12622l interfaceC12622l) {
        long j10;
        C7659f c7659f;
        this.f18107a.m23270b();
        if (!this.f18107a.m23271c(interfaceC12622l)) {
            throw new EOFException();
        }
        this.f18107a.m23269a(interfaceC12622l, false);
        C7659f c7659f2 = this.f18107a;
        interfaceC12622l.mo41538n(c7659f2.f18142h + c7659f2.f18143i);
        do {
            j10 = this.f18107a.f18137c;
            C7659f c7659f3 = this.f18107a;
            if ((c7659f3.f18136b & 4) == 4 || !c7659f3.m23271c(interfaceC12622l) || interfaceC12622l.getPosition() >= this.f18109c || !this.f18107a.m23269a(interfaceC12622l, true)) {
                break;
            }
            c7659f = this.f18107a;
        } while (C12624n.m41568e(interfaceC12622l, c7659f.f18142h + c7659f.f18143i));
        return j10;
    }
}
