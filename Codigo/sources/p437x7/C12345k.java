package p437x7;

import p351s8.C10832l0;
import p351s8.C10833m;
import p351s8.C10835n;
import p351s8.InterfaceC10827j;
import p361t6.C11108u1;
import p437x7.InterfaceC12341g;
import p459y6.C12614e;

/* renamed from: x7.k */
/* loaded from: classes.dex */
public class C12345k extends AbstractC12335a {

    /* renamed from: o */
    private final int f33152o;

    /* renamed from: p */
    private final long f33153p;

    /* renamed from: q */
    private final InterfaceC12341g f33154q;

    /* renamed from: r */
    private long f33155r;

    /* renamed from: s */
    private volatile boolean f33156s;

    /* renamed from: t */
    private boolean f33157t;

    public C12345k(InterfaceC10827j interfaceC10827j, C10835n c10835n, C11108u1 c11108u1, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, InterfaceC12341g interfaceC12341g) {
        super(interfaceC10827j, c10835n, c11108u1, i10, obj, j10, j11, j12, j13, j14);
        this.f33152o = i11;
        this.f33153p = j15;
        this.f33154q = interfaceC12341g;
    }

    @Override // p351s8.C10818e0.e
    /* renamed from: b */
    public final void mo223b() {
        if (this.f33155r == 0) {
            C12337c m39884j = m39884j();
            m39884j.m39891b(this.f33153p);
            InterfaceC12341g interfaceC12341g = this.f33154q;
            InterfaceC12341g.b m39936l = m39936l(m39884j);
            long j10 = this.f33086k;
            long j11 = j10 == -9223372036854775807L ? -9223372036854775807L : j10 - this.f33153p;
            long j12 = this.f33087l;
            interfaceC12341g.mo39898c(m39936l, j11, j12 == -9223372036854775807L ? -9223372036854775807L : j12 - this.f33153p);
        }
        try {
            C10835n m33028e = this.f33114b.m33028e(this.f33155r);
            C10832l0 c10832l0 = this.f33121i;
            C12614e c12614e = new C12614e(c10832l0, m33028e.f27413g, c10832l0.mo162o(m33028e));
            do {
                try {
                    if (this.f33156s) {
                        break;
                    }
                } finally {
                    this.f33155r = c12614e.getPosition() - this.f33114b.f27413g;
                }
            } while (this.f33154q.mo39896a(c12614e));
            C10833m.m33019a(this.f33121i);
            this.f33157t = !this.f33156s;
        } catch (Throwable th2) {
            C10833m.m33019a(this.f33121i);
            throw th2;
        }
    }

    @Override // p351s8.C10818e0.e
    /* renamed from: c */
    public final void mo224c() {
        this.f33156s = true;
    }

    @Override // p437x7.AbstractC12348n
    /* renamed from: g */
    public long mo39935g() {
        return this.f33164j + this.f33152o;
    }

    @Override // p437x7.AbstractC12348n
    /* renamed from: h */
    public boolean mo225h() {
        return this.f33157t;
    }

    /* renamed from: l */
    protected InterfaceC12341g.b m39936l(C12337c c12337c) {
        return c12337c;
    }
}
