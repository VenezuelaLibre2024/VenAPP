package p155i7;

import java.util.Collections;
import java.util.List;
import p155i7.InterfaceC7879i0;
import p361t6.C11108u1;
import p363t8.C11146e0;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12623m;

/* renamed from: i7.l */
/* loaded from: classes.dex */
public final class C7884l implements InterfaceC7885m {

    /* renamed from: a */
    private final List<InterfaceC7879i0.a> f19006a;

    /* renamed from: b */
    private final InterfaceC12609b0[] f19007b;

    /* renamed from: c */
    private boolean f19008c;

    /* renamed from: d */
    private int f19009d;

    /* renamed from: e */
    private int f19010e;

    /* renamed from: f */
    private long f19011f = -9223372036854775807L;

    public C7884l(List<InterfaceC7879i0.a> list) {
        this.f19006a = list;
        this.f19007b = new InterfaceC12609b0[list.size()];
    }

    /* renamed from: a */
    private boolean m24279a(C11146e0 c11146e0, int i10) {
        if (c11146e0.m34679a() == 0) {
            return false;
        }
        if (c11146e0.m34664H() != i10) {
            this.f19008c = false;
        }
        this.f19009d--;
        return this.f19008c;
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: b */
    public void mo24186b(C11146e0 c11146e0) {
        if (this.f19008c) {
            if (this.f19009d != 2 || m24279a(c11146e0, 32)) {
                if (this.f19009d != 1 || m24279a(c11146e0, 0)) {
                    int m34683f = c11146e0.m34683f();
                    int m34679a = c11146e0.m34679a();
                    for (InterfaceC12609b0 interfaceC12609b0 : this.f19007b) {
                        c11146e0.m34677U(m34683f);
                        interfaceC12609b0.m41511a(c11146e0, m34679a);
                    }
                    this.f19010e += m34679a;
                }
            }
        }
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: c */
    public void mo24187c() {
        this.f19008c = false;
        this.f19011f = -9223372036854775807L;
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: d */
    public void mo24188d(InterfaceC12623m interfaceC12623m, InterfaceC7879i0.d dVar) {
        for (int i10 = 0; i10 < this.f19007b.length; i10++) {
            InterfaceC7879i0.a aVar = this.f19006a.get(i10);
            dVar.m24263a();
            InterfaceC12609b0 mo308d = interfaceC12623m.mo308d(dVar.m24265c(), 3);
            mo308d.mo332c(new C11108u1.b().m34540U(dVar.m24264b()).m34552g0("application/dvbsubs").m34541V(Collections.singletonList(aVar.f18981c)).m34543X(aVar.f18979a).m34526G());
            this.f19007b[i10] = mo308d;
        }
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: e */
    public void mo24189e() {
        if (this.f19008c) {
            if (this.f19011f != -9223372036854775807L) {
                for (InterfaceC12609b0 interfaceC12609b0 : this.f19007b) {
                    interfaceC12609b0.mo331b(this.f19011f, 1, this.f19010e, 0, null);
                }
            }
            this.f19008c = false;
        }
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: f */
    public void mo24190f(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f19008c = true;
        if (j10 != -9223372036854775807L) {
            this.f19011f = j10;
        }
        this.f19010e = 0;
        this.f19009d = 2;
    }
}
