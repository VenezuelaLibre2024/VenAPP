package vc;

import ad.C0103f;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import cd.InterfaceC1952i;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p064dd.C6883a;
import p064dd.C6885c;
import p381uc.InterfaceC11529a;
import p381uc.InterfaceC11530b;
import p420wc.C12152e;
import p420wc.C12161n;
import p485zb.C12867g;
import sc.C10889g;
import sc.C10893k;
import sc.InterfaceC10883a;
import tc.InterfaceC11237a;

/* renamed from: vc.r */
/* loaded from: classes.dex */
public class C11857r {

    /* renamed from: a */
    private final Context f31317a;

    /* renamed from: b */
    private final C12867g f31318b;

    /* renamed from: c */
    private final C11869x f31319c;

    /* renamed from: f */
    private C11859s f31322f;

    /* renamed from: g */
    private C11859s f31323g;

    /* renamed from: h */
    private boolean f31324h;

    /* renamed from: i */
    private C11853p f31325i;

    /* renamed from: j */
    private final C11826b0 f31326j;

    /* renamed from: k */
    private final C0103f f31327k;

    /* renamed from: l */
    public final InterfaceC11530b f31328l;

    /* renamed from: m */
    private final InterfaceC11237a f31329m;

    /* renamed from: n */
    private final ExecutorService f31330n;

    /* renamed from: o */
    private final C11849n f31331o;

    /* renamed from: p */
    private final C11847m f31332p;

    /* renamed from: q */
    private final InterfaceC10883a f31333q;

    /* renamed from: r */
    private final C10893k f31334r;

    /* renamed from: e */
    private final long f31321e = System.currentTimeMillis();

    /* renamed from: d */
    private final C11836g0 f31320d = new C11836g0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vc.r$a */
    /* loaded from: classes.dex */
    public class a implements Callable<Task<Void>> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC1952i f31335a;

        a(InterfaceC1952i interfaceC1952i) {
            this.f31335a = interfaceC1952i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> call() {
            return C11857r.this.m37871i(this.f31335a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vc.r$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC1952i f31337a;

        b(InterfaceC1952i interfaceC1952i) {
            this.f31337a = interfaceC1952i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11857r.this.m37871i(this.f31337a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vc.r$c */
    /* loaded from: classes.dex */
    public class c implements Callable<Boolean> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            try {
                boolean m37898d = C11857r.this.f31322f.m37898d();
                if (!m37898d) {
                    C10889g.m33216f().m33225k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(m37898d);
            } catch (Exception e10) {
                C10889g.m33216f().m33220e("Problem encountered deleting Crashlytics initialization marker.", e10);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vc.r$d */
    /* loaded from: classes.dex */
    public class d implements Callable<Boolean> {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(C11857r.this.f31325i.m37829u());
        }
    }

    public C11857r(C12867g c12867g, C11826b0 c11826b0, InterfaceC10883a interfaceC10883a, C11869x c11869x, InterfaceC11530b interfaceC11530b, InterfaceC11237a interfaceC11237a, C0103f c0103f, ExecutorService executorService, C11847m c11847m, C10893k c10893k) {
        this.f31318b = c12867g;
        this.f31319c = c11869x;
        this.f31317a = c12867g.m42630m();
        this.f31326j = c11826b0;
        this.f31333q = interfaceC10883a;
        this.f31328l = interfaceC11530b;
        this.f31329m = interfaceC11237a;
        this.f31330n = executorService;
        this.f31327k = c0103f;
        this.f31331o = new C11849n(executorService);
        this.f31332p = c11847m;
        this.f31334r = c10893k;
    }

    /* renamed from: d */
    private void m37870d() {
        boolean z10;
        try {
            z10 = Boolean.TRUE.equals((Boolean) C11870x0.m37945f(this.f31331o.m37770h(new d())));
        } catch (Exception unused) {
            z10 = false;
        }
        this.f31324h = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public Task<Void> m37871i(InterfaceC1952i interfaceC1952i) {
        m37884r();
        try {
            this.f31328l.mo32541a(new InterfaceC11529a() { // from class: vc.q
                @Override // p381uc.InterfaceC11529a
                /* renamed from: a */
                public final void mo36089a(String str) {
                    C11857r.this.m37880n(str);
                }
            });
            this.f31325i.m37819V();
            if (!interfaceC1952i.mo10188b().f7999b.f8006a) {
                C10889g.m33216f().m33217b("Collection of crash reports disabled in Crashlytics settings.");
                return Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f31325i.m37811B(interfaceC1952i)) {
                C10889g.m33216f().m33225k("Previous sessions could not be finalized.");
            }
            return this.f31325i.m37824a0(interfaceC1952i.mo10187a());
        } catch (Exception e10) {
            C10889g.m33216f().m33220e("Crashlytics encountered a problem during asynchronous initialization.", e10);
            return Tasks.forException(e10);
        } finally {
            m37883q();
        }
    }

    /* renamed from: k */
    private void m37872k(InterfaceC1952i interfaceC1952i) {
        C10889g m33216f;
        String str;
        Future<?> submit = this.f31330n.submit(new b(interfaceC1952i));
        C10889g.m33216f().m33217b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            m33216f = C10889g.m33216f();
            str = "Crashlytics was interrupted during initialization.";
            m33216f.m33220e(str, e);
        } catch (ExecutionException e11) {
            e = e11;
            m33216f = C10889g.m33216f();
            str = "Crashlytics encountered a problem during initialization.";
            m33216f.m33220e(str, e);
        } catch (TimeoutException e12) {
            e = e12;
            m33216f = C10889g.m33216f();
            str = "Crashlytics timed out during initialization.";
            m33216f.m33220e(str, e);
        }
    }

    /* renamed from: l */
    public static String m37873l() {
        return "18.6.0";
    }

    /* renamed from: m */
    static boolean m37874m(String str, boolean z10) {
        if (!z10) {
            C10889g.m33216f().m33223i("Configured not to require a build ID.");
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

    /* renamed from: e */
    public Task<Boolean> m37875e() {
        return this.f31325i.m37827o();
    }

    /* renamed from: f */
    public Task<Void> m37876f() {
        return this.f31325i.m37828t();
    }

    /* renamed from: g */
    public boolean m37877g() {
        return this.f31324h;
    }

    /* renamed from: h */
    boolean m37878h() {
        return this.f31322f.m37897c();
    }

    /* renamed from: j */
    public Task<Void> m37879j(InterfaceC1952i interfaceC1952i) {
        return C11870x0.m37947h(this.f31330n, new a(interfaceC1952i));
    }

    /* renamed from: n */
    public void m37880n(String str) {
        this.f31325i.m37826e0(System.currentTimeMillis() - this.f31321e, str);
    }

    /* renamed from: o */
    public void m37881o(Throwable th2) {
        this.f31325i.m37825d0(Thread.currentThread(), th2);
    }

    /* renamed from: p */
    public void m37882p(Throwable th2) {
        C10889g.m33216f().m33217b("Recorded on-demand fatal events: " + this.f31320d.m37709b());
        C10889g.m33216f().m33217b("Dropped on-demand fatal events: " + this.f31320d.m37708a());
        this.f31325i.m37822Y("com.crashlytics.on-demand.recorded-exceptions", Integer.toString(this.f31320d.m37709b()));
        this.f31325i.m37822Y("com.crashlytics.on-demand.dropped-exceptions", Integer.toString(this.f31320d.m37708a()));
        this.f31325i.m37817Q(Thread.currentThread(), th2);
    }

    /* renamed from: q */
    void m37883q() {
        this.f31331o.m37770h(new c());
    }

    /* renamed from: r */
    void m37884r() {
        this.f31331o.m37767b();
        this.f31322f.m37896a();
        C10889g.m33216f().m33223i("Initialization marker file was created.");
    }

    /* renamed from: s */
    public boolean m37885s(C11823a c11823a, InterfaceC1952i interfaceC1952i) {
        if (!m37874m(c11823a.f31207b, C11839i.m37728i(this.f31317a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String c11837h = new C11837h(this.f31326j).toString();
        try {
            this.f31323g = new C11859s("crash_marker", this.f31327k);
            this.f31322f = new C11859s("initialization_marker", this.f31327k);
            C12161n c12161n = new C12161n(c11837h, this.f31327k, this.f31331o);
            C12152e c12152e = new C12152e(this.f31327k);
            C6883a c6883a = new C6883a(RecognitionOptions.UPC_E, new C6885c(10));
            this.f31334r.m33235c(c12161n);
            this.f31325i = new C11853p(this.f31317a, this.f31331o, this.f31326j, this.f31319c, this.f31327k, this.f31323g, c11823a, c12161n, c12152e, C11856q0.m37849h(this.f31317a, this.f31326j, this.f31327k, c11823a, c12152e, c12161n, c6883a, interfaceC1952i, this.f31320d, this.f31332p), this.f31333q, this.f31329m, this.f31332p);
            boolean m37878h = m37878h();
            m37870d();
            this.f31325i.m37831z(c11837h, Thread.getDefaultUncaughtExceptionHandler(), interfaceC1952i);
            if (!m37878h || !C11839i.m37723d(this.f31317a)) {
                C10889g.m33216f().m33217b("Successfully configured exception handler.");
                return true;
            }
            C10889g.m33216f().m33217b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            m37872k(interfaceC1952i);
            return false;
        } catch (Exception e10) {
            C10889g.m33216f().m33220e("Crashlytics was not started due to an exception during initialization", e10);
            this.f31325i = null;
            return false;
        }
    }

    /* renamed from: t */
    public Task<Void> m37886t() {
        return this.f31325i.m37820W();
    }

    /* renamed from: u */
    public void m37887u(Boolean bool) {
        this.f31319c.m37937h(bool);
    }

    /* renamed from: v */
    public void m37888v(String str, String str2) {
        this.f31325i.m37821X(str, str2);
    }

    /* renamed from: w */
    public void m37889w(String str, String str2) {
        this.f31325i.m37822Y(str, str2);
    }

    /* renamed from: x */
    public void m37890x(String str) {
        this.f31325i.m37823Z(str);
    }
}
