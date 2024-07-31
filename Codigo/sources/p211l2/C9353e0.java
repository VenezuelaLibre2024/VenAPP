package p211l2;

import java.util.HashMap;
import java.util.Map;
import p094f2.AbstractC7277j;
import p094f2.InterfaceC7284q;
import p192k2.C9124m;

/* renamed from: l2.e0 */
/* loaded from: classes.dex */
public class C9353e0 {

    /* renamed from: e */
    private static final String f22665e = AbstractC7277j.m21769i("WorkTimer");

    /* renamed from: a */
    final InterfaceC7284q f22666a;

    /* renamed from: b */
    final Map<C9124m, b> f22667b = new HashMap();

    /* renamed from: c */
    final Map<C9124m, a> f22668c = new HashMap();

    /* renamed from: d */
    final Object f22669d = new Object();

    /* renamed from: l2.e0$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo8629a(C9124m c9124m);
    }

    /* renamed from: l2.e0$b */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: a */
        private final C9353e0 f22670a;

        /* renamed from: b */
        private final C9124m f22671b;

        b(C9353e0 c9353e0, C9124m c9124m) {
            this.f22670a = c9353e0;
            this.f22671b = c9124m;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f22670a.f22669d) {
                if (this.f22670a.f22667b.remove(this.f22671b) != null) {
                    a remove = this.f22670a.f22668c.remove(this.f22671b);
                    if (remove != null) {
                        remove.mo8629a(this.f22671b);
                    }
                } else {
                    AbstractC7277j.m21767e().mo21770a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f22671b));
                }
            }
        }
    }

    public C9353e0(InterfaceC7284q interfaceC7284q) {
        this.f22666a = interfaceC7284q;
    }

    /* renamed from: a */
    public void m27856a(C9124m c9124m, long j10, a aVar) {
        synchronized (this.f22669d) {
            AbstractC7277j.m21767e().mo21770a(f22665e, "Starting timer for " + c9124m);
            m27857b(c9124m);
            b bVar = new b(this, c9124m);
            this.f22667b.put(c9124m, bVar);
            this.f22668c.put(c9124m, aVar);
            this.f22666a.mo8674b(j10, bVar);
        }
    }

    /* renamed from: b */
    public void m27857b(C9124m c9124m) {
        synchronized (this.f22669d) {
            if (this.f22667b.remove(c9124m) != null) {
                AbstractC7277j.m21767e().mo21770a(f22665e, "Stopping timer for " + c9124m);
                this.f22668c.remove(c9124m);
            }
        }
    }
}
