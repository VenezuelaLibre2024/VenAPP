package l2;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class e0 {

    /* renamed from: e, reason: collision with root package name */
    private static final String f20843e = f2.j.i("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    final f2.q f20844a;

    /* renamed from: b, reason: collision with root package name */
    final Map<k2.m, b> f20845b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final Map<k2.m, a> f20846c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    final Object f20847d = new Object();

    /* loaded from: classes.dex */
    public interface a {
        void a(k2.m mVar);
    }

    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final e0 f20848a;

        /* renamed from: b, reason: collision with root package name */
        private final k2.m f20849b;

        b(e0 e0Var, k2.m mVar) {
            this.f20848a = e0Var;
            this.f20849b = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f20848a.f20847d) {
                if (this.f20848a.f20845b.remove(this.f20849b) != null) {
                    a remove = this.f20848a.f20846c.remove(this.f20849b);
                    if (remove != null) {
                        remove.a(this.f20849b);
                    }
                } else {
                    f2.j.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f20849b));
                }
            }
        }
    }

    public e0(f2.q qVar) {
        this.f20844a = qVar;
    }

    public void a(k2.m mVar, long j10, a aVar) {
        synchronized (this.f20847d) {
            f2.j.e().a(f20843e, "Starting timer for " + mVar);
            b(mVar);
            b bVar = new b(this, mVar);
            this.f20845b.put(mVar, bVar);
            this.f20846c.put(mVar, aVar);
            this.f20844a.b(j10, bVar);
        }
    }

    public void b(k2.m mVar) {
        synchronized (this.f20847d) {
            if (this.f20845b.remove(mVar) != null) {
                f2.j.e().a(f20843e, "Stopping timer for " + mVar);
                this.f20846c.remove(mVar);
            }
        }
    }
}
