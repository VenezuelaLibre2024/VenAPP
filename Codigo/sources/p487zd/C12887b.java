package p487zd;

import ac.C0095a;
import ac.C0096b;
import ac.C0097c;
import java.util.Date;
import java.util.concurrent.Executor;
import p063dc.InterfaceC6880b;
import p311qd.C10453m;

/* renamed from: zd.b */
/* loaded from: classes.dex */
public class C12887b {

    /* renamed from: a */
    private final C0097c f35109a;

    /* renamed from: b */
    Executor f35110b;

    public C12887b(C0097c c0097c, @InterfaceC6880b Executor executor) {
        this.f35109a = c0097c;
        this.f35110b = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m42669b(C10453m c10453m) {
        try {
            C12940l2.m42840a("Updating active experiment: " + c10453m.toString());
            this.f35109a.m407o(new C0096b(c10453m.m31359d0(), c10453m.m31364i0(), c10453m.m31362g0(), new Date(c10453m.m31360e0()), c10453m.m31363h0(), c10453m.m31361f0()));
        } catch (C0095a e10) {
            C12940l2.m42841b("Unable to set experiment as active with ABT, missing analytics?\n" + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m42670c(final C10453m c10453m) {
        this.f35110b.execute(new Runnable() { // from class: zd.a
            @Override // java.lang.Runnable
            public final void run() {
                C12887b.this.m42669b(c10453m);
            }
        });
    }
}
