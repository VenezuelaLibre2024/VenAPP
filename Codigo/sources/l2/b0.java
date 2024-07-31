package l2;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public class b0 implements Runnable {

    /* renamed from: r, reason: collision with root package name */
    static final String f20807r = f2.j.i("WorkForegroundRunnable");

    /* renamed from: a, reason: collision with root package name */
    final androidx.work.impl.utils.futures.c<Void> f20808a = androidx.work.impl.utils.futures.c.s();

    /* renamed from: b, reason: collision with root package name */
    final Context f20809b;

    /* renamed from: c, reason: collision with root package name */
    final k2.u f20810c;

    /* renamed from: d, reason: collision with root package name */
    final androidx.work.c f20811d;

    /* renamed from: e, reason: collision with root package name */
    final f2.f f20812e;

    /* renamed from: f, reason: collision with root package name */
    final m2.b f20813f;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f20814a;

        a(androidx.work.impl.utils.futures.c cVar) {
            this.f20814a = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            if (b0.this.f20808a.isCancelled()) {
                return;
            }
            try {
                f2.e eVar = (f2.e) this.f20814a.get();
                if (eVar == null) {
                    throw new IllegalStateException("Worker was marked important (" + b0.this.f20810c.f20225c + ") but did not provide ForegroundInfo");
                }
                f2.j.e().a(b0.f20807r, "Updating notification for " + b0.this.f20810c.f20225c);
                b0 b0Var = b0.this;
                b0Var.f20808a.q(b0Var.f20812e.a(b0Var.f20809b, b0Var.f20811d.getId(), eVar));
            } catch (Throwable th2) {
                b0.this.f20808a.p(th2);
            }
        }
    }

    public b0(Context context, k2.u uVar, androidx.work.c cVar, f2.f fVar, m2.b bVar) {
        this.f20809b = context;
        this.f20810c = uVar;
        this.f20811d = cVar;
        this.f20812e = fVar;
        this.f20813f = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(androidx.work.impl.utils.futures.c cVar) {
        if (this.f20808a.isCancelled()) {
            cVar.cancel(true);
        } else {
            cVar.q(this.f20811d.getForegroundInfoAsync());
        }
    }

    public com.google.common.util.concurrent.f<Void> b() {
        return this.f20808a;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f20810c.f20239q || Build.VERSION.SDK_INT >= 31) {
            this.f20808a.o(null);
            return;
        }
        final androidx.work.impl.utils.futures.c s10 = androidx.work.impl.utils.futures.c.s();
        this.f20813f.a().execute(new Runnable() { // from class: l2.a0
            @Override // java.lang.Runnable
            public final void run() {
                b0.this.c(s10);
            }
        });
        s10.addListener(new a(s10), this.f20813f.a());
    }
}
