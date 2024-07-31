package p211l2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p230m2.InterfaceExecutorC9535a;

/* renamed from: l2.u */
/* loaded from: classes.dex */
public class C9369u implements InterfaceExecutorC9535a {

    /* renamed from: b */
    private final Executor f22690b;

    /* renamed from: c */
    private Runnable f22691c;

    /* renamed from: a */
    private final ArrayDeque<a> f22689a = new ArrayDeque<>();

    /* renamed from: d */
    final Object f22692d = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l2.u$a */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a */
        final C9369u f22693a;

        /* renamed from: b */
        final Runnable f22694b;

        a(C9369u c9369u, Runnable runnable) {
            this.f22693a = c9369u;
            this.f22694b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f22694b.run();
                synchronized (this.f22693a.f22692d) {
                    this.f22693a.m27887a();
                }
            } catch (Throwable th2) {
                synchronized (this.f22693a.f22692d) {
                    this.f22693a.m27887a();
                    throw th2;
                }
            }
        }
    }

    public C9369u(Executor executor) {
        this.f22690b = executor;
    }

    /* renamed from: a */
    void m27887a() {
        a poll = this.f22689a.poll();
        this.f22691c = poll;
        if (poll != null) {
            this.f22690b.execute(poll);
        }
    }

    @Override // p230m2.InterfaceExecutorC9535a
    /* renamed from: a0 */
    public boolean mo27888a0() {
        boolean z10;
        synchronized (this.f22692d) {
            z10 = !this.f22689a.isEmpty();
        }
        return z10;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f22692d) {
            this.f22689a.add(new a(this, runnable));
            if (this.f22691c == null) {
                m27887a();
            }
        }
    }
}
