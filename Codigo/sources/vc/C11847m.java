package vc;

import ad.C0103f;
import p084ef.InterfaceC7185b;
import sc.C10889g;

/* renamed from: vc.m */
/* loaded from: classes.dex */
public class C11847m implements InterfaceC7185b {

    /* renamed from: a */
    private final C11869x f31249a;

    /* renamed from: b */
    private final C11845l f31250b;

    public C11847m(C11869x c11869x, C0103f c0103f) {
        this.f31249a = c11869x;
        this.f31250b = new C11845l(c0103f);
    }

    @Override // p084ef.InterfaceC7185b
    /* renamed from: a */
    public boolean mo21389a() {
        return this.f31249a.m37936d();
    }

    @Override // p084ef.InterfaceC7185b
    /* renamed from: b */
    public void mo21390b(InterfaceC7185b.b bVar) {
        C10889g.m33216f().m33217b("App Quality Sessions session changed: " + bVar);
        this.f31250b.m37757h(bVar.m21393a());
    }

    @Override // p084ef.InterfaceC7185b
    /* renamed from: c */
    public InterfaceC7185b.a mo21391c() {
        return InterfaceC7185b.a.CRASHLYTICS;
    }

    /* renamed from: d */
    public String m37760d(String str) {
        return this.f31250b.m37756c(str);
    }

    /* renamed from: e */
    public void m37761e(String str) {
        this.f31250b.m37758i(str);
    }
}
