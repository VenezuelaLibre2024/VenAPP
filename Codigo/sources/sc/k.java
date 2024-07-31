package sc;

import ee.a;
import wc.n;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final ee.a<bf.a> f25477a;

    public k(ee.a<bf.a> aVar) {
        this.f25477a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(e eVar, ee.b bVar) {
        ((bf.a) bVar.get()).a("firebase", eVar);
        g.f().b("Registering RemoteConfig Rollouts subscriber");
    }

    public void c(n nVar) {
        if (nVar == null) {
            g.f().k("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final e eVar = new e(nVar);
            this.f25477a.a(new a.InterfaceC0227a() { // from class: sc.j
                @Override // ee.a.InterfaceC0227a
                public final void a(ee.b bVar) {
                    k.b(e.this, bVar);
                }
            });
        }
    }
}
