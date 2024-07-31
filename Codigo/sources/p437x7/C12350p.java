package p437x7;

import com.google.android.gms.common.api.C5101a;
import p351s8.C10833m;
import p351s8.C10835n;
import p351s8.InterfaceC10827j;
import p361t6.C11108u1;
import p459y6.C12614e;
import p459y6.InterfaceC12609b0;

/* renamed from: x7.p */
/* loaded from: classes.dex */
public final class C12350p extends AbstractC12335a {

    /* renamed from: o */
    private final int f33166o;

    /* renamed from: p */
    private final C11108u1 f33167p;

    /* renamed from: q */
    private long f33168q;

    /* renamed from: r */
    private boolean f33169r;

    public C12350p(InterfaceC10827j interfaceC10827j, C10835n c10835n, C11108u1 c11108u1, int i10, Object obj, long j10, long j11, long j12, int i11, C11108u1 c11108u12) {
        super(interfaceC10827j, c10835n, c11108u1, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f33166o = i11;
        this.f33167p = c11108u12;
    }

    @Override // p351s8.C10818e0.e
    /* renamed from: b */
    public void mo223b() {
        C12337c m39884j = m39884j();
        m39884j.m39891b(0L);
        InterfaceC12609b0 mo39892d = m39884j.mo39892d(0, this.f33166o);
        mo39892d.mo332c(this.f33167p);
        try {
            long mo162o = this.f33121i.mo162o(this.f33114b.m33028e(this.f33168q));
            if (mo162o != -1) {
                mo162o += this.f33168q;
            }
            C12614e c12614e = new C12614e(this.f33121i, this.f33168q, mo162o);
            for (int i10 = 0; i10 != -1; i10 = mo39892d.m41512f(c12614e, C5101a.e.API_PRIORITY_OTHER, true)) {
                this.f33168q += i10;
            }
            mo39892d.mo331b(this.f33119g, 1, (int) this.f33168q, 0, null);
            C10833m.m33019a(this.f33121i);
            this.f33169r = true;
        } catch (Throwable th2) {
            C10833m.m33019a(this.f33121i);
            throw th2;
        }
    }

    @Override // p351s8.C10818e0.e
    /* renamed from: c */
    public void mo224c() {
    }

    @Override // p437x7.AbstractC12348n
    /* renamed from: h */
    public boolean mo225h() {
        return this.f33169r;
    }
}
