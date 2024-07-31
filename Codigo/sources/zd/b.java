package zd;

import java.util.Date;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final ac.c f32558a;

    /* renamed from: b, reason: collision with root package name */
    Executor f32559b;

    public b(ac.c cVar, @dc.b Executor executor) {
        this.f32558a = cVar;
        this.f32559b = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(qd.m mVar) {
        try {
            l2.a("Updating active experiment: " + mVar.toString());
            this.f32558a.o(new ac.b(mVar.d0(), mVar.i0(), mVar.g0(), new Date(mVar.e0()), mVar.h0(), mVar.f0()));
        } catch (ac.a e10) {
            l2.b("Unable to set experiment as active with ABT, missing analytics?\n" + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(final qd.m mVar) {
        this.f32559b.execute(new Runnable() { // from class: zd.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.b(mVar);
            }
        });
    }
}
