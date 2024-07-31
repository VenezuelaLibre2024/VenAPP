package p155i7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.EOFException;
import p155i7.InterfaceC7879i0;
import p361t6.C11005b3;
import p363t8.C11137a;
import p363t8.C11144d0;
import p363t8.C11146e0;
import p459y6.C12612d;
import p459y6.C12635y;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12626p;
import p459y6.InterfaceC12636z;

/* renamed from: i7.h */
/* loaded from: classes.dex */
public final class C7876h implements InterfaceC12621k {

    /* renamed from: m */
    public static final InterfaceC12626p f18917m = new InterfaceC12626p() { // from class: i7.g
        @Override // p459y6.InterfaceC12626p
        /* renamed from: c */
        public final InterfaceC12621k[] mo9153c() {
            InterfaceC12621k[] m24216i;
            m24216i = C7876h.m24216i();
            return m24216i;
        }
    };

    /* renamed from: a */
    private final int f18918a;

    /* renamed from: b */
    private final C7878i f18919b;

    /* renamed from: c */
    private final C11146e0 f18920c;

    /* renamed from: d */
    private final C11146e0 f18921d;

    /* renamed from: e */
    private final C11144d0 f18922e;

    /* renamed from: f */
    private InterfaceC12623m f18923f;

    /* renamed from: g */
    private long f18924g;

    /* renamed from: h */
    private long f18925h;

    /* renamed from: i */
    private int f18926i;

    /* renamed from: j */
    private boolean f18927j;

    /* renamed from: k */
    private boolean f18928k;

    /* renamed from: l */
    private boolean f18929l;

    public C7876h() {
        this(0);
    }

    public C7876h(int i10) {
        this.f18918a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f18919b = new C7878i(true);
        this.f18920c = new C11146e0(RecognitionOptions.PDF417);
        this.f18926i = -1;
        this.f18925h = -1L;
        C11146e0 c11146e0 = new C11146e0(10);
        this.f18921d = c11146e0;
        this.f18922e = new C11144d0(c11146e0.m34682e());
    }

    /* renamed from: d */
    private void m24213d(InterfaceC12622l interfaceC12622l) {
        if (this.f18927j) {
            return;
        }
        this.f18926i = -1;
        interfaceC12622l.mo41534f();
        long j10 = 0;
        if (interfaceC12622l.getPosition() == 0) {
            m24218k(interfaceC12622l);
        }
        int i10 = 0;
        int i11 = 0;
        while (interfaceC12622l.mo41533d(this.f18921d.m34682e(), 0, 2, true)) {
            try {
                this.f18921d.m34677U(0);
                if (!C7878i.m24248m(this.f18921d.m34670N())) {
                    break;
                }
                if (!interfaceC12622l.mo41533d(this.f18921d.m34682e(), 0, 4, true)) {
                    break;
                }
                this.f18922e.m34640p(14);
                int m34632h = this.f18922e.m34632h(13);
                if (m34632h <= 6) {
                    this.f18927j = true;
                    throw C11005b3.m33715a("Malformed ADTS stream", null);
                }
                j10 += m34632h;
                i11++;
                if (i11 != 1000 && interfaceC12622l.mo41539p(m34632h - 6, true)) {
                }
                break;
            } catch (EOFException unused) {
            }
        }
        i10 = i11;
        interfaceC12622l.mo41534f();
        if (i10 > 0) {
            this.f18926i = (int) (j10 / i10);
        } else {
            this.f18926i = -1;
        }
        this.f18927j = true;
    }

    /* renamed from: g */
    private static int m24214g(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }

    /* renamed from: h */
    private InterfaceC12636z m24215h(long j10, boolean z10) {
        return new C12612d(j10, this.f18925h, m24214g(this.f18926i, this.f18919b.m24259k()), this.f18926i, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ InterfaceC12621k[] m24216i() {
        return new InterfaceC12621k[]{new C7876h()};
    }

    /* renamed from: j */
    private void m24217j(long j10, boolean z10) {
        if (this.f18929l) {
            return;
        }
        boolean z11 = (this.f18918a & 1) != 0 && this.f18926i > 0;
        if (z11 && this.f18919b.m24259k() == -9223372036854775807L && !z10) {
            return;
        }
        if (!z11 || this.f18919b.m24259k() == -9223372036854775807L) {
            this.f18923f.mo323p(new InterfaceC12636z.b(-9223372036854775807L));
        } else {
            this.f18923f.mo323p(m24215h(j10, (this.f18918a & 2) != 0));
        }
        this.f18929l = true;
    }

    /* renamed from: k */
    private int m24218k(InterfaceC12622l interfaceC12622l) {
        int i10 = 0;
        while (true) {
            interfaceC12622l.mo41540q(this.f18921d.m34682e(), 0, 10);
            this.f18921d.m34677U(0);
            if (this.f18921d.m34667K() != 4801587) {
                break;
            }
            this.f18921d.m34678V(3);
            int m34663G = this.f18921d.m34663G();
            i10 += m34663G + 10;
            interfaceC12622l.mo41536k(m34663G);
        }
        interfaceC12622l.mo41534f();
        interfaceC12622l.mo41536k(i10);
        if (this.f18925h == -1) {
            this.f18925h = i10;
        }
        return i10;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: a */
    public void mo121a(long j10, long j11) {
        this.f18928k = false;
        this.f18919b.mo24187c();
        this.f18924g = j11;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: b */
    public void mo122b(InterfaceC12623m interfaceC12623m) {
        this.f18923f = interfaceC12623m;
        this.f18919b.mo24188d(interfaceC12623m, new InterfaceC7879i0.d(0, 1));
        interfaceC12623m.mo324q();
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: e */
    public boolean mo123e(InterfaceC12622l interfaceC12622l) {
        int m24218k = m24218k(interfaceC12622l);
        int i10 = m24218k;
        int i11 = 0;
        int i12 = 0;
        do {
            interfaceC12622l.mo41540q(this.f18921d.m34682e(), 0, 2);
            this.f18921d.m34677U(0);
            if (C7878i.m24248m(this.f18921d.m34670N())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                interfaceC12622l.mo41540q(this.f18921d.m34682e(), 0, 4);
                this.f18922e.m34640p(14);
                int m34632h = this.f18922e.m34632h(13);
                if (m34632h > 6) {
                    interfaceC12622l.mo41536k(m34632h - 6);
                    i12 += m34632h;
                }
            }
            i10++;
            interfaceC12622l.mo41534f();
            interfaceC12622l.mo41536k(i10);
            i11 = 0;
            i12 = 0;
        } while (i10 - m24218k < 8192);
        return false;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: f */
    public int mo124f(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        C11137a.m34607i(this.f18923f);
        long length = interfaceC12622l.getLength();
        int i10 = this.f18918a;
        if (((i10 & 2) == 0 && ((i10 & 1) == 0 || length == -1)) ? false : true) {
            m24213d(interfaceC12622l);
        }
        int read = interfaceC12622l.read(this.f18920c.m34682e(), 0, RecognitionOptions.PDF417);
        boolean z10 = read == -1;
        m24217j(length, z10);
        if (z10) {
            return -1;
        }
        this.f18920c.m34677U(0);
        this.f18920c.m34676T(read);
        if (!this.f18928k) {
            this.f18919b.mo24190f(this.f18924g, 4);
            this.f18928k = true;
        }
        this.f18919b.mo24186b(this.f18920c);
        return 0;
    }

    @Override // p459y6.InterfaceC12621k
    public void release() {
    }
}
