package l2;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* loaded from: classes.dex */
public class c0 implements f2.f {

    /* renamed from: d, reason: collision with root package name */
    private static final String f20824d = f2.j.i("WMFgUpdater");

    /* renamed from: a, reason: collision with root package name */
    private final m2.b f20825a;

    /* renamed from: b, reason: collision with root package name */
    final androidx.work.impl.foreground.a f20826b;

    /* renamed from: c, reason: collision with root package name */
    final k2.v f20827c;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f20828a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UUID f20829b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f2.e f20830c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f20831d;

        a(androidx.work.impl.utils.futures.c cVar, UUID uuid, f2.e eVar, Context context) {
            this.f20828a = cVar;
            this.f20829b = uuid;
            this.f20830c = eVar;
            this.f20831d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f20828a.isCancelled()) {
                    String uuid = this.f20829b.toString();
                    k2.u h10 = c0.this.f20827c.h(uuid);
                    if (h10 == null || h10.f20224b.h()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    c0.this.f20826b.c(uuid, this.f20830c);
                    this.f20831d.startService(androidx.work.impl.foreground.b.c(this.f20831d, k2.x.a(h10), this.f20830c));
                }
                this.f20828a.o(null);
            } catch (Throwable th2) {
                this.f20828a.p(th2);
            }
        }
    }

    public c0(WorkDatabase workDatabase, androidx.work.impl.foreground.a aVar, m2.b bVar) {
        this.f20826b = aVar;
        this.f20825a = bVar;
        this.f20827c = workDatabase.J();
    }

    @Override // f2.f
    public com.google.common.util.concurrent.f<Void> a(Context context, UUID uuid, f2.e eVar) {
        androidx.work.impl.utils.futures.c s10 = androidx.work.impl.utils.futures.c.s();
        this.f20825a.c(new a(s10, uuid, eVar, context));
        return s10;
    }
}
