package p437x7;

import p351s8.C10832l0;
import p351s8.C10833m;
import p351s8.C10835n;
import p351s8.InterfaceC10827j;
import p361t6.C11108u1;
import p437x7.InterfaceC12341g;
import p459y6.C12614e;

/* renamed from: x7.m */
/* loaded from: classes.dex */
public final class C12347m extends AbstractC12340f {

    /* renamed from: j */
    private final InterfaceC12341g f33160j;

    /* renamed from: k */
    private InterfaceC12341g.b f33161k;

    /* renamed from: l */
    private long f33162l;

    /* renamed from: m */
    private volatile boolean f33163m;

    public C12347m(InterfaceC10827j interfaceC10827j, C10835n c10835n, C11108u1 c11108u1, int i10, Object obj, InterfaceC12341g interfaceC12341g) {
        super(interfaceC10827j, c10835n, 2, c11108u1, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f33160j = interfaceC12341g;
    }

    @Override // p351s8.C10818e0.e
    /* renamed from: b */
    public void mo223b() {
        if (this.f33162l == 0) {
            this.f33160j.mo39898c(this.f33161k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C10835n m33028e = this.f33114b.m33028e(this.f33162l);
            C10832l0 c10832l0 = this.f33121i;
            C12614e c12614e = new C12614e(c10832l0, m33028e.f27413g, c10832l0.mo162o(m33028e));
            while (!this.f33163m && this.f33160j.mo39896a(c12614e)) {
                try {
                } finally {
                    this.f33162l = c12614e.getPosition() - this.f33114b.f27413g;
                }
            }
        } finally {
            C10833m.m33019a(this.f33121i);
        }
    }

    @Override // p351s8.C10818e0.e
    /* renamed from: c */
    public void mo224c() {
        this.f33163m = true;
    }

    /* renamed from: g */
    public void m39939g(InterfaceC12341g.b bVar) {
        this.f33161k = bVar;
    }
}
