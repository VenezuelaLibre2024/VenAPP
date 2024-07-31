package vc;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28883a;

    /* renamed from: b, reason: collision with root package name */
    private final zb.g f28884b;

    /* renamed from: c, reason: collision with root package name */
    private final x f28885c;

    /* renamed from: f, reason: collision with root package name */
    private s f28888f;

    /* renamed from: g, reason: collision with root package name */
    private s f28889g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f28890h;

    /* renamed from: i, reason: collision with root package name */
    private p f28891i;

    /* renamed from: j, reason: collision with root package name */
    private final b0 f28892j;

    /* renamed from: k, reason: collision with root package name */
    private final ad.f f28893k;

    /* renamed from: l, reason: collision with root package name */
    public final uc.b f28894l;

    /* renamed from: m, reason: collision with root package name */
    private final tc.a f28895m;

    /* renamed from: n, reason: collision with root package name */
    private final ExecutorService f28896n;

    /* renamed from: o, reason: collision with root package name */
    private final n f28897o;

    /* renamed from: p, reason: collision with root package name */
    private final m f28898p;

    /* renamed from: q, reason: collision with root package name */
    private final sc.a f28899q;

    /* renamed from: r, reason: collision with root package name */
    private final sc.k f28900r;

    /* renamed from: e, reason: collision with root package name */
    private final long f28887e = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    private final g0 f28886d = new g0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Callable<Task<Void>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ cd.i f28901a;

        a(cd.i iVar) {
            this.f28901a = iVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> call() {
            return r.this.i(this.f28901a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ cd.i f28903a;

        b(cd.i iVar) {
            this.f28903a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.i(this.f28903a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Callable<Boolean> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            try {
                boolean d10 = r.this.f28888f.d();
                if (!d10) {
                    sc.g.f().k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d10);
            } catch (Exception e10) {
                sc.g.f().e("Problem encountered deleting Crashlytics initialization marker.", e10);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Callable<Boolean> {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(r.this.f28891i.u());
        }
    }

    public r(zb.g gVar, b0 b0Var, sc.a aVar, x xVar, uc.b bVar, tc.a aVar2, ad.f fVar, ExecutorService executorService, m mVar, sc.k kVar) {
        this.f28884b = gVar;
        this.f28885c = xVar;
        this.f28883a = gVar.m();
        this.f28892j = b0Var;
        this.f28899q = aVar;
        this.f28894l = bVar;
        this.f28895m = aVar2;
        this.f28896n = executorService;
        this.f28893k = fVar;
        this.f28897o = new n(executorService);
        this.f28898p = mVar;
        this.f28900r = kVar;
    }

    private void d() {
        boolean z10;
        try {
            z10 = Boolean.TRUE.equals((Boolean) x0.f(this.f28897o.h(new d())));
        } catch (Exception unused) {
            z10 = false;
        }
        this.f28890h = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> i(cd.i iVar) {
        r();
        try {
            this.f28894l.a(new uc.a() { // from class: vc.q
                @Override // uc.a
                public final void a(String str) {
                    r.this.n(str);
                }
            });
            this.f28891i.V();
            if (!iVar.b().f7047b.f7054a) {
                sc.g.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f28891i.B(iVar)) {
                sc.g.f().k("Previous sessions could not be finalized.");
            }
            return this.f28891i.a0(iVar.a());
        } catch (Exception e10) {
            sc.g.f().e("Crashlytics encountered a problem during asynchronous initialization.", e10);
            return Tasks.forException(e10);
        } finally {
            q();
        }
    }

    private void k(cd.i iVar) {
        sc.g f10;
        String str;
        Future<?> submit = this.f28896n.submit(new b(iVar));
        sc.g.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            f10 = sc.g.f();
            str = "Crashlytics was interrupted during initialization.";
            f10.e(str, e);
        } catch (ExecutionException e11) {
            e = e11;
            f10 = sc.g.f();
            str = "Crashlytics encountered a problem during initialization.";
            f10.e(str, e);
        } catch (TimeoutException e12) {
            e = e12;
            f10 = sc.g.f();
            str = "Crashlytics timed out during initialization.";
            f10.e(str, e);
        }
    }

    public static String l() {
        return "18.6.0";
    }

    static boolean m(String str, boolean z10) {
        if (!z10) {
            sc.g.f().i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    public Task<Boolean> e() {
        return this.f28891i.o();
    }

    public Task<Void> f() {
        return this.f28891i.t();
    }

    public boolean g() {
        return this.f28890h;
    }

    boolean h() {
        return this.f28888f.c();
    }

    public Task<Void> j(cd.i iVar) {
        return x0.h(this.f28896n, new a(iVar));
    }

    public void n(String str) {
        this.f28891i.e0(System.currentTimeMillis() - this.f28887e, str);
    }

    public void o(Throwable th2) {
        this.f28891i.d0(Thread.currentThread(), th2);
    }

    public void p(Throwable th2) {
        sc.g.f().b("Recorded on-demand fatal events: " + this.f28886d.b());
        sc.g.f().b("Dropped on-demand fatal events: " + this.f28886d.a());
        this.f28891i.Y("com.crashlytics.on-demand.recorded-exceptions", Integer.toString(this.f28886d.b()));
        this.f28891i.Y("com.crashlytics.on-demand.dropped-exceptions", Integer.toString(this.f28886d.a()));
        this.f28891i.Q(Thread.currentThread(), th2);
    }

    void q() {
        this.f28897o.h(new c());
    }

    void r() {
        this.f28897o.b();
        this.f28888f.a();
        sc.g.f().i("Initialization marker file was created.");
    }

    public boolean s(vc.a aVar, cd.i iVar) {
        if (!m(aVar.f28773b, i.i(this.f28883a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String hVar = new h(this.f28892j).toString();
        try {
            this.f28889g = new s("crash_marker", this.f28893k);
            this.f28888f = new s("initialization_marker", this.f28893k);
            wc.n nVar = new wc.n(hVar, this.f28893k, this.f28897o);
            wc.e eVar = new wc.e(this.f28893k);
            dd.a aVar2 = new dd.a(RecognitionOptions.UPC_E, new dd.c(10));
            this.f28900r.c(nVar);
            this.f28891i = new p(this.f28883a, this.f28897o, this.f28892j, this.f28885c, this.f28893k, this.f28889g, aVar, nVar, eVar, q0.h(this.f28883a, this.f28892j, this.f28893k, aVar, eVar, nVar, aVar2, iVar, this.f28886d, this.f28898p), this.f28899q, this.f28895m, this.f28898p);
            boolean h10 = h();
            d();
            this.f28891i.z(hVar, Thread.getDefaultUncaughtExceptionHandler(), iVar);
            if (!h10 || !i.d(this.f28883a)) {
                sc.g.f().b("Successfully configured exception handler.");
                return true;
            }
            sc.g.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            k(iVar);
            return false;
        } catch (Exception e10) {
            sc.g.f().e("Crashlytics was not started due to an exception during initialization", e10);
            this.f28891i = null;
            return false;
        }
    }

    public Task<Void> t() {
        return this.f28891i.W();
    }

    public void u(Boolean bool) {
        this.f28885c.h(bool);
    }

    public void v(String str, String str2) {
        this.f28891i.X(str, str2);
    }

    public void w(String str, String str2) {
        this.f28891i.Y(str, str2);
    }

    public void x(String str) {
        this.f28891i.Z(str);
    }
}
