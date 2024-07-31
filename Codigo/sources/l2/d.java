package l2;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import f2.m;
import java.util.List;

/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    private static final String f20833c = f2.j.i("EnqueueRunnable");

    /* renamed from: a, reason: collision with root package name */
    private final androidx.work.impl.x f20834a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.o f20835b;

    public d(androidx.work.impl.x xVar) {
        this(xVar, new androidx.work.impl.o());
    }

    public d(androidx.work.impl.x xVar, androidx.work.impl.o oVar) {
        this.f20834a = xVar;
        this.f20835b = oVar;
    }

    private static boolean b(androidx.work.impl.x xVar) {
        boolean c10 = c(xVar.g(), xVar.f(), (String[]) androidx.work.impl.x.l(xVar).toArray(new String[0]), xVar.d(), xVar.b());
        xVar.k();
        return c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean c(androidx.work.impl.e0 r18, java.util.List<? extends f2.u> r19, java.lang.String[] r20, java.lang.String r21, f2.d r22) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.d.c(androidx.work.impl.e0, java.util.List, java.lang.String[], java.lang.String, f2.d):boolean");
    }

    private static boolean e(androidx.work.impl.x xVar) {
        List<androidx.work.impl.x> e10 = xVar.e();
        boolean z10 = false;
        if (e10 != null) {
            for (androidx.work.impl.x xVar2 : e10) {
                if (xVar2.j()) {
                    f2.j.e().k(f20833c, "Already enqueued work ids (" + TextUtils.join(", ", xVar2.c()) + ")");
                } else {
                    z10 |= e(xVar2);
                }
            }
        }
        return b(xVar) | z10;
    }

    public boolean a() {
        WorkDatabase r10 = this.f20834a.g().r();
        r10.e();
        try {
            boolean e10 = e(this.f20834a);
            r10.B();
            return e10;
        } finally {
            r10.i();
        }
    }

    public f2.m d() {
        return this.f20835b;
    }

    public void f() {
        androidx.work.impl.e0 g10 = this.f20834a.g();
        androidx.work.impl.u.b(g10.k(), g10.r(), g10.p());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f20834a.h()) {
                throw new IllegalStateException("WorkContinuation has cycles (" + this.f20834a + ")");
            }
            if (a()) {
                q.a(this.f20834a.g().j(), RescheduleReceiver.class, true);
                f();
            }
            this.f20835b.a(f2.m.f14891a);
        } catch (Throwable th2) {
            this.f20835b.a(new m.b.a(th2));
        }
    }
}
