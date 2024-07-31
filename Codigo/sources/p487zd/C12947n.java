package p487zd;

import java.util.concurrent.atomic.AtomicBoolean;
import p254nd.C9705a;
import p254nd.InterfaceC9706b;
import p254nd.InterfaceC9708d;
import p485zb.C12862b;
import p485zb.C12867g;

/* renamed from: zd.n */
/* loaded from: classes.dex */
public class C12947n {

    /* renamed from: a */
    private C12966q3 f35229a;

    /* renamed from: b */
    private AtomicBoolean f35230b;

    public C12947n(C12867g c12867g, C12966q3 c12966q3, InterfaceC9708d interfaceC9708d) {
        this.f35229a = c12966q3;
        this.f35230b = new AtomicBoolean(c12867g.m42634x());
        interfaceC9708d.mo29098b(C12862b.class, new InterfaceC9706b() { // from class: zd.m
            @Override // p254nd.InterfaceC9706b
            /* renamed from: a */
            public final void mo10159a(C9705a c9705a) {
                C12947n.this.m42875e(c9705a);
            }
        });
    }

    /* renamed from: c */
    private boolean m42873c() {
        return this.f35229a.m42911e("firebase_inapp_messaging_auto_data_collection_enabled");
    }

    /* renamed from: d */
    private boolean m42874d() {
        return this.f35229a.m42912f("auto_init");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m42875e(C9705a c9705a) {
        this.f35230b.set(((C12862b) c9705a.m29095a()).f35063a);
    }

    /* renamed from: b */
    public boolean m42876b() {
        return m42874d() ? this.f35229a.m42910d("auto_init", true) : m42873c() ? this.f35229a.m42909c("firebase_inapp_messaging_auto_data_collection_enabled", true) : this.f35230b.get();
    }

    /* renamed from: f */
    public void m42877f(Boolean bool) {
        if (bool == null) {
            this.f35229a.m42907a("auto_init");
        } else {
            this.f35229a.m42913g("auto_init", Boolean.TRUE.equals(bool));
        }
    }
}
