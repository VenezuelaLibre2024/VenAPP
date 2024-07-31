package sc;

import bf.InterfaceC1776a;
import ee.InterfaceC7182a;
import ee.InterfaceC7183b;
import p420wc.C12161n;

/* renamed from: sc.k */
/* loaded from: classes.dex */
public class C10893k {

    /* renamed from: a */
    private final InterfaceC7182a<InterfaceC1776a> f27596a;

    public C10893k(InterfaceC7182a<InterfaceC1776a> interfaceC7182a) {
        this.f27596a = interfaceC7182a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m33234b(C10887e c10887e, InterfaceC7183b interfaceC7183b) {
        ((InterfaceC1776a) interfaceC7183b.get()).mo9488a("firebase", c10887e);
        C10889g.m33216f().m33217b("Registering RemoteConfig Rollouts subscriber");
    }

    /* renamed from: c */
    public void m33235c(C12161n c12161n) {
        if (c12161n == null) {
            C10889g.m33216f().m33225k("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final C10887e c10887e = new C10887e(c12161n);
            this.f27596a.mo21379a(new InterfaceC7182a.a() { // from class: sc.j
                @Override // ee.InterfaceC7182a.a
                /* renamed from: a */
                public final void mo21380a(InterfaceC7183b interfaceC7183b) {
                    C10893k.m33234b(C10887e.this, interfaceC7183b);
                }
            });
        }
    }
}
