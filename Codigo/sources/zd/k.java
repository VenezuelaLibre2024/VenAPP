package zd;

import android.app.Application;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final u2 f32654a;

    /* renamed from: b, reason: collision with root package name */
    private final Application f32655b;

    /* renamed from: c, reason: collision with root package name */
    private final ce.a f32656c;

    /* renamed from: d, reason: collision with root package name */
    private pf.e f32657d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(u2 u2Var, Application application, ce.a aVar) {
        this.f32654a = u2Var;
        this.f32655b = application;
        this.f32656c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(pf.e eVar) {
        long e02 = eVar.e0();
        long a10 = this.f32656c.a();
        File file = new File(this.f32655b.getApplicationContext().getFilesDir(), "fiam_eligible_campaigns_cache_file");
        return e02 != 0 ? a10 < e02 : !file.exists() || a10 < file.lastModified() + TimeUnit.DAYS.toMillis(1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ pf.e h() {
        return this.f32657d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(pf.e eVar) {
        this.f32657d = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(Throwable th2) {
        this.f32657d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(pf.e eVar) {
        this.f32657d = eVar;
    }

    public dj.j<pf.e> f() {
        return dj.j.l(new Callable() { // from class: zd.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                pf.e h10;
                h10 = k.this.h();
                return h10;
            }
        }).x(this.f32654a.e(pf.e.h0()).f(new jj.d() { // from class: zd.g
            @Override // jj.d
            public final void accept(Object obj) {
                k.this.i((pf.e) obj);
            }
        })).h(new jj.g() { // from class: zd.h
            @Override // jj.g
            public final boolean test(Object obj) {
                boolean g10;
                g10 = k.this.g((pf.e) obj);
                return g10;
            }
        }).e(new jj.d() { // from class: zd.i
            @Override // jj.d
            public final void accept(Object obj) {
                k.this.j((Throwable) obj);
            }
        });
    }

    public dj.b l(final pf.e eVar) {
        return this.f32654a.f(eVar).g(new jj.a() { // from class: zd.j
            @Override // jj.a
            public final void run() {
                k.this.k(eVar);
            }
        });
    }
}
