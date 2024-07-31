package l2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class u implements m2.a {

    /* renamed from: b, reason: collision with root package name */
    private final Executor f20868b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f20869c;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque<a> f20867a = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    final Object f20870d = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final u f20871a;

        /* renamed from: b, reason: collision with root package name */
        final Runnable f20872b;

        a(u uVar, Runnable runnable) {
            this.f20871a = uVar;
            this.f20872b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f20872b.run();
                synchronized (this.f20871a.f20870d) {
                    this.f20871a.a();
                }
            } catch (Throwable th2) {
                synchronized (this.f20871a.f20870d) {
                    this.f20871a.a();
                    throw th2;
                }
            }
        }
    }

    public u(Executor executor) {
        this.f20868b = executor;
    }

    void a() {
        a poll = this.f20867a.poll();
        this.f20869c = poll;
        if (poll != null) {
            this.f20868b.execute(poll);
        }
    }

    @Override // m2.a
    public boolean a0() {
        boolean z10;
        synchronized (this.f20870d) {
            z10 = !this.f20867a.isEmpty();
        }
        return z10;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f20870d) {
            this.f20867a.add(new a(this, runnable));
            if (this.f20869c == null) {
                a();
            }
        }
    }
}
