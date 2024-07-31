package vc;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import vc.v;
import xc.f0;
import xc.g0;

/* loaded from: classes.dex */
public class p {

    /* renamed from: t */
    static final FilenameFilter f28827t = new FilenameFilter() { // from class: vc.o
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean M;
            M = p.M(file, str);
            return M;
        }
    };

    /* renamed from: a */
    private final Context f28828a;

    /* renamed from: b */
    private final x f28829b;

    /* renamed from: c */
    private final s f28830c;

    /* renamed from: d */
    private final wc.n f28831d;

    /* renamed from: e */
    private final n f28832e;

    /* renamed from: f */
    private final b0 f28833f;

    /* renamed from: g */
    private final ad.f f28834g;

    /* renamed from: h */
    private final vc.a f28835h;

    /* renamed from: i */
    private final wc.e f28836i;

    /* renamed from: j */
    private final sc.a f28837j;

    /* renamed from: k */
    private final tc.a f28838k;

    /* renamed from: l */
    private final m f28839l;

    /* renamed from: m */
    private final q0 f28840m;

    /* renamed from: n */
    private v f28841n;

    /* renamed from: o */
    private cd.i f28842o = null;

    /* renamed from: p */
    final TaskCompletionSource<Boolean> f28843p = new TaskCompletionSource<>();

    /* renamed from: q */
    final TaskCompletionSource<Boolean> f28844q = new TaskCompletionSource<>();

    /* renamed from: r */
    final TaskCompletionSource<Void> f28845r = new TaskCompletionSource<>();

    /* renamed from: s */
    final AtomicBoolean f28846s = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements v.a {
        a() {
        }

        @Override // vc.v.a
        public void a(cd.i iVar, Thread thread, Throwable th2) {
            p.this.J(iVar, thread, th2);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Callable<Task<Void>> {

        /* renamed from: a */
        final /* synthetic */ long f28848a;

        /* renamed from: b */
        final /* synthetic */ Throwable f28849b;

        /* renamed from: c */
        final /* synthetic */ Thread f28850c;

        /* renamed from: d */
        final /* synthetic */ cd.i f28851d;

        /* renamed from: e */
        final /* synthetic */ boolean f28852e;

        /* loaded from: classes.dex */
        public class a implements SuccessContinuation<cd.d, Void> {

            /* renamed from: a */
            final /* synthetic */ Executor f28854a;

            /* renamed from: b */
            final /* synthetic */ String f28855b;

            a(Executor executor, String str) {
                this.f28854a = executor;
                this.f28855b = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* renamed from: a */
            public Task<Void> then(cd.d dVar) {
                if (dVar == null) {
                    sc.g.f().k("Received null app settings, cannot send reports at crash time.");
                    return Tasks.forResult(null);
                }
                Task[] taskArr = new Task[2];
                taskArr[0] = p.this.P();
                taskArr[1] = p.this.f28840m.y(this.f28854a, b.this.f28852e ? this.f28855b : null);
                return Tasks.whenAll((Task<?>[]) taskArr);
            }
        }

        b(long j10, Throwable th2, Thread thread, cd.i iVar, boolean z10) {
            this.f28848a = j10;
            this.f28849b = th2;
            this.f28850c = thread;
            this.f28851d = iVar;
            this.f28852e = z10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Task<Void> call() {
            long H = p.H(this.f28848a);
            String D = p.this.D();
            if (D == null) {
                sc.g.f().d("Tried to write a fatal exception while no session was open.");
                return Tasks.forResult(null);
            }
            p.this.f28830c.a();
            p.this.f28840m.t(this.f28849b, this.f28850c, D, H);
            p.this.y(this.f28848a);
            p.this.v(this.f28851d);
            p.this.x(new vc.h(p.this.f28833f).toString(), Boolean.valueOf(this.f28852e));
            if (!p.this.f28829b.d()) {
                return Tasks.forResult(null);
            }
            Executor c10 = p.this.f28832e.c();
            return this.f28851d.a().onSuccessTask(c10, new a(c10, D));
        }
    }

    /* loaded from: classes.dex */
    public class c implements SuccessContinuation<Void, Boolean> {
        c() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a */
        public Task<Boolean> then(Void r12) {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    /* loaded from: classes.dex */
    public class d implements SuccessContinuation<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ Task f28858a;

        /* loaded from: classes.dex */
        public class a implements Callable<Task<Void>> {

            /* renamed from: a */
            final /* synthetic */ Boolean f28860a;

            /* renamed from: vc.p$d$a$a */
            /* loaded from: classes.dex */
            public class C0465a implements SuccessContinuation<cd.d, Void> {

                /* renamed from: a */
                final /* synthetic */ Executor f28862a;

                C0465a(Executor executor) {
                    this.f28862a = executor;
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
                /* renamed from: a */
                public Task<Void> then(cd.d dVar) {
                    if (dVar == null) {
                        sc.g.f().k("Received null app settings at app startup. Cannot send cached reports");
                    } else {
                        p.this.P();
                        p.this.f28840m.x(this.f28862a);
                        p.this.f28845r.trySetResult(null);
                    }
                    return Tasks.forResult(null);
                }
            }

            a(Boolean bool) {
                this.f28860a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Task<Void> call() {
                if (this.f28860a.booleanValue()) {
                    sc.g.f().b("Sending cached crash reports...");
                    p.this.f28829b.c(this.f28860a.booleanValue());
                    Executor c10 = p.this.f28832e.c();
                    return d.this.f28858a.onSuccessTask(c10, new C0465a(c10));
                }
                sc.g.f().i("Deleting cached crash reports...");
                p.s(p.this.N());
                p.this.f28840m.w();
                p.this.f28845r.trySetResult(null);
                return Tasks.forResult(null);
            }
        }

        d(Task task) {
            this.f28858a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a */
        public Task<Void> then(Boolean bool) {
            return p.this.f28832e.i(new a(bool));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ long f28864a;

        /* renamed from: b */
        final /* synthetic */ String f28865b;

        e(long j10, String str) {
            this.f28864a = j10;
            this.f28865b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            if (p.this.L()) {
                return null;
            }
            p.this.f28836i.g(this.f28864a, this.f28865b);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ long f28867a;

        /* renamed from: b */
        final /* synthetic */ Throwable f28868b;

        /* renamed from: c */
        final /* synthetic */ Thread f28869c;

        f(long j10, Throwable th2, Thread thread) {
            this.f28867a = j10;
            this.f28868b = th2;
            this.f28869c = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (p.this.L()) {
                return;
            }
            long H = p.H(this.f28867a);
            String D = p.this.D();
            if (D == null) {
                sc.g.f().k("Tried to write a non-fatal exception while no session was open.");
            } else {
                p.this.f28840m.u(this.f28868b, this.f28869c, D, H);
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ String f28871a;

        g(String str) {
            this.f28871a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            p.this.x(this.f28871a, Boolean.FALSE);
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class h implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ long f28873a;

        h(long j10) {
            this.f28873a = j10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt(Constants.FATAL, 1);
            bundle.putLong(Constants.TIMESTAMP, this.f28873a);
            p.this.f28838k.a(Constants.FIREBASE_APPLICATION_EXCEPTION, bundle);
            return null;
        }
    }

    public p(Context context, n nVar, b0 b0Var, x xVar, ad.f fVar, s sVar, vc.a aVar, wc.n nVar2, wc.e eVar, q0 q0Var, sc.a aVar2, tc.a aVar3, m mVar) {
        this.f28828a = context;
        this.f28832e = nVar;
        this.f28833f = b0Var;
        this.f28829b = xVar;
        this.f28834g = fVar;
        this.f28830c = sVar;
        this.f28835h = aVar;
        this.f28831d = nVar2;
        this.f28836i = eVar;
        this.f28837j = aVar2;
        this.f28838k = aVar3;
        this.f28839l = mVar;
        this.f28840m = q0Var;
    }

    private void A(String str) {
        sc.g.f().i("Finalizing native report for session " + str);
        sc.h a10 = this.f28837j.a(str);
        File c10 = a10.c();
        f0.a b10 = a10.b();
        if (R(str, c10, b10)) {
            sc.g.f().k("No native core present");
            return;
        }
        long lastModified = c10.lastModified();
        wc.e eVar = new wc.e(this.f28834g, str);
        File i10 = this.f28834g.i(str);
        if (!i10.isDirectory()) {
            sc.g.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        y(lastModified);
        List<e0> F = F(a10, str, this.f28834g, eVar.b());
        f0.b(i10, F);
        sc.g.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f28840m.j(str, F, b10);
        eVar.a();
    }

    private static boolean C() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public String D() {
        SortedSet<String> p10 = this.f28840m.p();
        if (p10.isEmpty()) {
            return null;
        }
        return p10.first();
    }

    private static long E() {
        return H(System.currentTimeMillis());
    }

    static List<e0> F(sc.h hVar, String str, ad.f fVar, byte[] bArr) {
        File o10 = fVar.o(str, "user-data");
        File o11 = fVar.o(str, "keys");
        File o12 = fVar.o(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new vc.g("logs_file", "logs", bArr));
        arrayList.add(new a0("crash_meta_file", "metadata", hVar.d()));
        arrayList.add(new a0("session_meta_file", "session", hVar.g()));
        arrayList.add(new a0("app_meta_file", "app", hVar.e()));
        arrayList.add(new a0("device_meta_file", "device", hVar.a()));
        arrayList.add(new a0("os_meta_file", "os", hVar.f()));
        arrayList.add(S(hVar));
        arrayList.add(new a0("user_meta_file", io.flutter.plugins.firebase.auth.Constants.USER, o10));
        arrayList.add(new a0("keys_file", "keys", o11));
        arrayList.add(new a0("rollouts_file", "rollouts", o12));
        return arrayList;
    }

    private InputStream G(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            sc.g.f().k("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        sc.g.f().g("No version control information found");
        return null;
    }

    public static long H(long j10) {
        return j10 / 1000;
    }

    public static /* synthetic */ boolean M(File file, String str) {
        return str.startsWith(".ae");
    }

    private Task<Void> O(long j10) {
        if (C()) {
            sc.g.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        sc.g.f().b("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new h(j10));
    }

    public Task<Void> P() {
        ArrayList arrayList = new ArrayList();
        for (File file : N()) {
            try {
                arrayList.add(O(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                sc.g.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    private static boolean R(String str, File file, f0.a aVar) {
        if (file == null || !file.exists()) {
            sc.g.f().k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            sc.g.f().g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    private static e0 S(sc.h hVar) {
        File c10 = hVar.c();
        return (c10 == null || !c10.exists()) ? new vc.g("minidump_file", "minidump", new byte[]{0}) : new a0("minidump_file", "minidump", c10);
    }

    private static byte[] U(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[RecognitionOptions.UPC_E];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private Task<Boolean> b0() {
        if (this.f28829b.d()) {
            sc.g.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f28843p.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        sc.g.f().b("Automatic data collection is disabled.");
        sc.g.f().i("Notifying that unsent reports are available.");
        this.f28843p.trySetResult(Boolean.TRUE);
        Task<TContinuationResult> onSuccessTask = this.f28829b.j().onSuccessTask(new c());
        sc.g.f().b("Waiting for send/deleteUnsentReports to be called.");
        return x0.n(onSuccessTask, this.f28844q.getTask());
    }

    private void c0(String str) {
        List<ApplicationExitInfo> historicalProcessExitReasons;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            sc.g.f().i("ANR feature enabled, but device is API " + i10);
            return;
        }
        historicalProcessExitReasons = ((ActivityManager) this.f28828a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f28840m.v(str, historicalProcessExitReasons, new wc.e(this.f28834g, str), wc.n.l(str, this.f28834g, this.f28832e));
        } else {
            sc.g.f().i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    private static g0.a p(b0 b0Var, vc.a aVar) {
        return g0.a.b(b0Var.f(), aVar.f28777f, aVar.f28778g, b0Var.a().c(), y.b(aVar.f28775d).h(), aVar.f28779h);
    }

    private static g0.b q(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return g0.b.c(i.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), i.b(context), statFs.getBlockCount() * statFs.getBlockSize(), i.w(), i.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static g0.c r() {
        return g0.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, i.x());
    }

    public static void s(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void w(boolean z10, cd.i iVar) {
        String str;
        ArrayList arrayList = new ArrayList(this.f28840m.p());
        if (arrayList.size() <= z10) {
            sc.g.f().i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z10 ? 1 : 0);
        if (iVar.b().f7047b.f7055b) {
            c0(str2);
        } else {
            sc.g.f().i("ANR feature disabled.");
        }
        if (this.f28837j.d(str2)) {
            A(str2);
        }
        if (z10 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f28839l.e(null);
            str = null;
        }
        this.f28840m.k(E(), str);
    }

    public void x(String str, Boolean bool) {
        long E = E();
        sc.g.f().b("Opening a new session with ID " + str);
        this.f28837j.c(str, String.format(Locale.US, "Crashlytics Android SDK/%s", r.l()), E, xc.g0.b(p(this.f28833f, this.f28835h), r(), q(this.f28828a)));
        if (bool.booleanValue() && str != null) {
            this.f28831d.q(str);
        }
        this.f28836i.e(str);
        this.f28839l.e(str);
        this.f28840m.q(str, E);
    }

    public void y(long j10) {
        try {
            if (this.f28834g.e(".ae" + j10).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            sc.g.f().l("Could not create app exception marker file.", e10);
        }
    }

    public boolean B(cd.i iVar) {
        this.f28832e.b();
        if (L()) {
            sc.g.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        sc.g.f().i("Finalizing previously open sessions.");
        try {
            w(true, iVar);
            sc.g.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e10) {
            sc.g.f().e("Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    String I() {
        InputStream G = G("META-INF/version-control-info.textproto");
        if (G == null) {
            return null;
        }
        sc.g.f().b("Read version control info");
        return Base64.encodeToString(U(G), 0);
    }

    void J(cd.i iVar, Thread thread, Throwable th2) {
        K(iVar, thread, th2, false);
    }

    synchronized void K(cd.i iVar, Thread thread, Throwable th2, boolean z10) {
        sc.g.f().b("Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName());
        try {
            x0.f(this.f28832e.i(new b(System.currentTimeMillis(), th2, thread, iVar, z10)));
        } catch (TimeoutException unused) {
            sc.g.f().d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e10) {
            sc.g.f().e("Error handling uncaught exception", e10);
        }
    }

    boolean L() {
        v vVar = this.f28841n;
        return vVar != null && vVar.a();
    }

    List<File> N() {
        return this.f28834g.f(f28827t);
    }

    public void Q(Thread thread, Throwable th2) {
        cd.i iVar = this.f28842o;
        if (iVar == null) {
            sc.g.f().k("settingsProvider not set");
        } else {
            K(iVar, thread, th2, true);
        }
    }

    void T(String str) {
        this.f28832e.h(new g(str));
    }

    public void V() {
        try {
            String I = I();
            if (I != null) {
                Y("com.crashlytics.version-control-info", I);
                sc.g.f().g("Saved version control info");
            }
        } catch (IOException e10) {
            sc.g.f().l("Unable to save version control info", e10);
        }
    }

    public Task<Void> W() {
        this.f28844q.trySetResult(Boolean.TRUE);
        return this.f28845r.getTask();
    }

    public void X(String str, String str2) {
        try {
            this.f28831d.o(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f28828a;
            if (context != null && i.u(context)) {
                throw e10;
            }
            sc.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void Y(String str, String str2) {
        try {
            this.f28831d.p(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f28828a;
            if (context != null && i.u(context)) {
                throw e10;
            }
            sc.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void Z(String str) {
        this.f28831d.r(str);
    }

    public Task<Void> a0(Task<cd.d> task) {
        if (this.f28840m.n()) {
            sc.g.f().i("Crash reports are available to be sent.");
            return b0().onSuccessTask(new d(task));
        }
        sc.g.f().i("No crash reports are available to be sent.");
        this.f28843p.trySetResult(Boolean.FALSE);
        return Tasks.forResult(null);
    }

    public void d0(Thread thread, Throwable th2) {
        this.f28832e.g(new f(System.currentTimeMillis(), th2, thread));
    }

    public void e0(long j10, String str) {
        this.f28832e.h(new e(j10, str));
    }

    public Task<Boolean> o() {
        if (this.f28846s.compareAndSet(false, true)) {
            return this.f28843p.getTask();
        }
        sc.g.f().k("checkForUnsentReports should only be called once per execution.");
        return Tasks.forResult(Boolean.FALSE);
    }

    public Task<Void> t() {
        this.f28844q.trySetResult(Boolean.FALSE);
        return this.f28845r.getTask();
    }

    public boolean u() {
        if (!this.f28830c.c()) {
            String D = D();
            return D != null && this.f28837j.d(D);
        }
        sc.g.f().i("Found previous crash marker.");
        this.f28830c.d();
        return true;
    }

    void v(cd.i iVar) {
        w(false, iVar);
    }

    public void z(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, cd.i iVar) {
        this.f28842o = iVar;
        T(str);
        v vVar = new v(new a(), iVar, uncaughtExceptionHandler, this.f28837j);
        this.f28841n = vVar;
        Thread.setDefaultUncaughtExceptionHandler(vVar);
    }
}
