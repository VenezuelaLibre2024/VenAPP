package vc;

import ad.C0103f;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import cd.C1947d;
import cd.InterfaceC1952i;
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
import p420wc.C12152e;
import p420wc.C12161n;
import p442xc.AbstractC12426f0;
import p442xc.AbstractC12428g0;
import sc.C10889g;
import sc.InterfaceC10883a;
import sc.InterfaceC10890h;
import tc.InterfaceC11237a;
import vc.C11865v;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: vc.p */
/* loaded from: classes.dex */
public class C11853p {

    /* renamed from: t */
    static final FilenameFilter f31261t = new FilenameFilter() { // from class: vc.o
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean m37782M;
            m37782M = C11853p.m37782M(file, str);
            return m37782M;
        }
    };

    /* renamed from: a */
    private final Context f31262a;

    /* renamed from: b */
    private final C11869x f31263b;

    /* renamed from: c */
    private final C11859s f31264c;

    /* renamed from: d */
    private final C12161n f31265d;

    /* renamed from: e */
    private final C11849n f31266e;

    /* renamed from: f */
    private final C11826b0 f31267f;

    /* renamed from: g */
    private final C0103f f31268g;

    /* renamed from: h */
    private final C11823a f31269h;

    /* renamed from: i */
    private final C12152e f31270i;

    /* renamed from: j */
    private final InterfaceC10883a f31271j;

    /* renamed from: k */
    private final InterfaceC11237a f31272k;

    /* renamed from: l */
    private final C11847m f31273l;

    /* renamed from: m */
    private final C11856q0 f31274m;

    /* renamed from: n */
    private C11865v f31275n;

    /* renamed from: o */
    private InterfaceC1952i f31276o = null;

    /* renamed from: p */
    final TaskCompletionSource<Boolean> f31277p = new TaskCompletionSource<>();

    /* renamed from: q */
    final TaskCompletionSource<Boolean> f31278q = new TaskCompletionSource<>();

    /* renamed from: r */
    final TaskCompletionSource<Void> f31279r = new TaskCompletionSource<>();

    /* renamed from: s */
    final AtomicBoolean f31280s = new AtomicBoolean(false);

    /* renamed from: vc.p$a */
    /* loaded from: classes.dex */
    class a implements C11865v.a {
        a() {
        }

        @Override // vc.C11865v.a
        /* renamed from: a */
        public void mo37832a(InterfaceC1952i interfaceC1952i, Thread thread, Throwable th2) {
            C11853p.this.m37813J(interfaceC1952i, thread, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vc.p$b */
    /* loaded from: classes.dex */
    public class b implements Callable<Task<Void>> {

        /* renamed from: a */
        final /* synthetic */ long f31282a;

        /* renamed from: b */
        final /* synthetic */ Throwable f31283b;

        /* renamed from: c */
        final /* synthetic */ Thread f31284c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC1952i f31285d;

        /* renamed from: e */
        final /* synthetic */ boolean f31286e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: vc.p$b$a */
        /* loaded from: classes.dex */
        public class a implements SuccessContinuation<C1947d, Void> {

            /* renamed from: a */
            final /* synthetic */ Executor f31288a;

            /* renamed from: b */
            final /* synthetic */ String f31289b;

            a(Executor executor, String str) {
                this.f31288a = executor;
                this.f31289b = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task<Void> then(C1947d c1947d) {
                if (c1947d == null) {
                    C10889g.m33216f().m33225k("Received null app settings, cannot send reports at crash time.");
                    return Tasks.forResult(null);
                }
                Task[] taskArr = new Task[2];
                taskArr[0] = C11853p.this.m37784P();
                taskArr[1] = C11853p.this.f31274m.m37866y(this.f31288a, b.this.f31286e ? this.f31289b : null);
                return Tasks.whenAll((Task<?>[]) taskArr);
            }
        }

        b(long j10, Throwable th2, Thread thread, InterfaceC1952i interfaceC1952i, boolean z10) {
            this.f31282a = j10;
            this.f31283b = th2;
            this.f31284c = thread;
            this.f31285d = interfaceC1952i;
            this.f31286e = z10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> call() {
            long m37781H = C11853p.m37781H(this.f31282a);
            String m37777D = C11853p.this.m37777D();
            if (m37777D == null) {
                C10889g.m33216f().m33219d("Tried to write a fatal exception while no session was open.");
                return Tasks.forResult(null);
            }
            C11853p.this.f31264c.m37896a();
            C11853p.this.f31274m.m37861t(this.f31283b, this.f31284c, m37777D, m37781H);
            C11853p.this.m37810y(this.f31282a);
            C11853p.this.m37830v(this.f31285d);
            C11853p.this.m37809x(new C11837h(C11853p.this.f31267f).toString(), Boolean.valueOf(this.f31286e));
            if (!C11853p.this.f31263b.m37936d()) {
                return Tasks.forResult(null);
            }
            Executor m37768c = C11853p.this.f31266e.m37768c();
            return this.f31285d.mo10187a().onSuccessTask(m37768c, new a(m37768c, m37777D));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vc.p$c */
    /* loaded from: classes.dex */
    public class c implements SuccessContinuation<Void, Boolean> {
        c() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Boolean> then(Void r12) {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vc.p$d */
    /* loaded from: classes.dex */
    public class d implements SuccessContinuation<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ Task f31292a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: vc.p$d$a */
        /* loaded from: classes.dex */
        public class a implements Callable<Task<Void>> {

            /* renamed from: a */
            final /* synthetic */ Boolean f31294a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: vc.p$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C13259a implements SuccessContinuation<C1947d, Void> {

                /* renamed from: a */
                final /* synthetic */ Executor f31296a;

                C13259a(Executor executor) {
                    this.f31296a = executor;
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Task<Void> then(C1947d c1947d) {
                    if (c1947d == null) {
                        C10889g.m33216f().m33225k("Received null app settings at app startup. Cannot send cached reports");
                    } else {
                        C11853p.this.m37784P();
                        C11853p.this.f31274m.m37865x(this.f31296a);
                        C11853p.this.f31279r.trySetResult(null);
                    }
                    return Tasks.forResult(null);
                }
            }

            a(Boolean bool) {
                this.f31294a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task<Void> call() {
                if (this.f31294a.booleanValue()) {
                    C10889g.m33216f().m33217b("Sending cached crash reports...");
                    C11853p.this.f31263b.m37935c(this.f31294a.booleanValue());
                    Executor m37768c = C11853p.this.f31266e.m37768c();
                    return d.this.f31292a.onSuccessTask(m37768c, new C13259a(m37768c));
                }
                C10889g.m33216f().m33223i("Deleting cached crash reports...");
                C11853p.m37807s(C11853p.this.m37816N());
                C11853p.this.f31274m.m37864w();
                C11853p.this.f31279r.trySetResult(null);
                return Tasks.forResult(null);
            }
        }

        d(Task task) {
            this.f31292a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> then(Boolean bool) {
            return C11853p.this.f31266e.m37771i(new a(bool));
        }
    }

    /* renamed from: vc.p$e */
    /* loaded from: classes.dex */
    class e implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ long f31298a;

        /* renamed from: b */
        final /* synthetic */ String f31299b;

        e(long j10, String str) {
            this.f31298a = j10;
            this.f31299b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (C11853p.this.m37815L()) {
                return null;
            }
            C11853p.this.f31270i.m38936g(this.f31298a, this.f31299b);
            return null;
        }
    }

    /* renamed from: vc.p$f */
    /* loaded from: classes.dex */
    class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ long f31301a;

        /* renamed from: b */
        final /* synthetic */ Throwable f31302b;

        /* renamed from: c */
        final /* synthetic */ Thread f31303c;

        f(long j10, Throwable th2, Thread thread) {
            this.f31301a = j10;
            this.f31302b = th2;
            this.f31303c = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C11853p.this.m37815L()) {
                return;
            }
            long m37781H = C11853p.m37781H(this.f31301a);
            String m37777D = C11853p.this.m37777D();
            if (m37777D == null) {
                C10889g.m33216f().m33225k("Tried to write a non-fatal exception while no session was open.");
            } else {
                C11853p.this.f31274m.m37862u(this.f31302b, this.f31303c, m37777D, m37781H);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vc.p$g */
    /* loaded from: classes.dex */
    public class g implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ String f31305a;

        g(String str) {
            this.f31305a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            C11853p.this.m37809x(this.f31305a, Boolean.FALSE);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vc.p$h */
    /* loaded from: classes.dex */
    public class h implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ long f31307a;

        h(long j10) {
            this.f31307a = j10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt(Constants.FATAL, 1);
            bundle.putLong(Constants.TIMESTAMP, this.f31307a);
            C11853p.this.f31272k.mo32542a(Constants.FIREBASE_APPLICATION_EXCEPTION, bundle);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11853p(Context context, C11849n c11849n, C11826b0 c11826b0, C11869x c11869x, C0103f c0103f, C11859s c11859s, C11823a c11823a, C12161n c12161n, C12152e c12152e, C11856q0 c11856q0, InterfaceC10883a interfaceC10883a, InterfaceC11237a interfaceC11237a, C11847m c11847m) {
        this.f31262a = context;
        this.f31266e = c11849n;
        this.f31267f = c11826b0;
        this.f31263b = c11869x;
        this.f31268g = c0103f;
        this.f31264c = c11859s;
        this.f31269h = c11823a;
        this.f31265d = c12161n;
        this.f31270i = c12152e;
        this.f31271j = interfaceC10883a;
        this.f31272k = interfaceC11237a;
        this.f31273l = c11847m;
        this.f31274m = c11856q0;
    }

    /* renamed from: A */
    private void m37775A(String str) {
        C10889g.m33216f().m33223i("Finalizing native report for session " + str);
        InterfaceC10890h mo33192a = this.f31271j.mo33192a(str);
        File mo33202c = mo33192a.mo33202c();
        AbstractC12426f0.a mo33201b = mo33192a.mo33201b();
        if (m37785R(str, mo33202c, mo33201b)) {
            C10889g.m33216f().m33225k("No native core present");
            return;
        }
        long lastModified = mo33202c.lastModified();
        C12152e c12152e = new C12152e(this.f31268g, str);
        File m456i = this.f31268g.m456i(str);
        if (!m456i.isDirectory()) {
            C10889g.m33216f().m33225k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        m37810y(lastModified);
        List<InterfaceC11832e0> m37779F = m37779F(mo33192a, str, this.f31268g, c12152e.m38932b());
        C11834f0.m37705b(m456i, m37779F);
        C10889g.m33216f().m33217b("CrashlyticsController#finalizePreviousNativeSession");
        this.f31274m.m37856j(str, m37779F, mo33201b);
        c12152e.m38931a();
    }

    /* renamed from: C */
    private static boolean m37776C() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public String m37777D() {
        SortedSet<String> m37859p = this.f31274m.m37859p();
        if (m37859p.isEmpty()) {
            return null;
        }
        return m37859p.first();
    }

    /* renamed from: E */
    private static long m37778E() {
        return m37781H(System.currentTimeMillis());
    }

    /* renamed from: F */
    static List<InterfaceC11832e0> m37779F(InterfaceC10890h interfaceC10890h, String str, C0103f c0103f, byte[] bArr) {
        File m461o = c0103f.m461o(str, "user-data");
        File m461o2 = c0103f.m461o(str, "keys");
        File m461o3 = c0103f.m461o(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C11835g("logs_file", "logs", bArr));
        arrayList.add(new C11824a0("crash_meta_file", "metadata", interfaceC10890h.mo33203d()));
        arrayList.add(new C11824a0("session_meta_file", "session", interfaceC10890h.mo33206g()));
        arrayList.add(new C11824a0("app_meta_file", "app", interfaceC10890h.mo33204e()));
        arrayList.add(new C11824a0("device_meta_file", "device", interfaceC10890h.mo33200a()));
        arrayList.add(new C11824a0("os_meta_file", "os", interfaceC10890h.mo33205f()));
        arrayList.add(m37786S(interfaceC10890h));
        arrayList.add(new C11824a0("user_meta_file", io.flutter.plugins.firebase.auth.Constants.USER, m461o));
        arrayList.add(new C11824a0("keys_file", "keys", m461o2));
        arrayList.add(new C11824a0("rollouts_file", "rollouts", m461o3));
        return arrayList;
    }

    /* renamed from: G */
    private InputStream m37780G(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            C10889g.m33216f().m33225k("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        C10889g.m33216f().m33221g("No version control information found");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public static long m37781H(long j10) {
        return j10 / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static /* synthetic */ boolean m37782M(File file, String str) {
        return str.startsWith(".ae");
    }

    /* renamed from: O */
    private Task<Void> m37783O(long j10) {
        if (m37776C()) {
            C10889g.m33216f().m33225k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        C10889g.m33216f().m33217b("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new h(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public Task<Void> m37784P() {
        ArrayList arrayList = new ArrayList();
        for (File file : m37816N()) {
            try {
                arrayList.add(m37783O(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                C10889g.m33216f().m33225k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* renamed from: R */
    private static boolean m37785R(String str, File file, AbstractC12426f0.a aVar) {
        if (file == null || !file.exists()) {
            C10889g.m33216f().m33225k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            C10889g.m33216f().m33221g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    /* renamed from: S */
    private static InterfaceC11832e0 m37786S(InterfaceC10890h interfaceC10890h) {
        File mo33202c = interfaceC10890h.mo33202c();
        return (mo33202c == null || !mo33202c.exists()) ? new C11835g("minidump_file", "minidump", new byte[]{0}) : new C11824a0("minidump_file", "minidump", mo33202c);
    }

    /* renamed from: U */
    private static byte[] m37787U(InputStream inputStream) {
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

    /* renamed from: b0 */
    private Task<Boolean> m37790b0() {
        if (this.f31263b.m37936d()) {
            C10889g.m33216f().m33217b("Automatic data collection is enabled. Allowing upload.");
            this.f31277p.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        C10889g.m33216f().m33217b("Automatic data collection is disabled.");
        C10889g.m33216f().m33223i("Notifying that unsent reports are available.");
        this.f31277p.trySetResult(Boolean.TRUE);
        Task<TContinuationResult> onSuccessTask = this.f31263b.m37938j().onSuccessTask(new c());
        C10889g.m33216f().m33217b("Waiting for send/deleteUnsentReports to be called.");
        return C11870x0.m37953n(onSuccessTask, this.f31278q.getTask());
    }

    /* renamed from: c0 */
    private void m37792c0(String str) {
        List<ApplicationExitInfo> historicalProcessExitReasons;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            C10889g.m33216f().m33223i("ANR feature enabled, but device is API " + i10);
            return;
        }
        historicalProcessExitReasons = ((ActivityManager) this.f31262a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f31274m.m37863v(str, historicalProcessExitReasons, new C12152e(this.f31268g, str), C12161n.m39000l(str, this.f31268g, this.f31266e));
        } else {
            C10889g.m33216f().m33223i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    /* renamed from: p */
    private static AbstractC12428g0.a m37804p(C11826b0 c11826b0, C11823a c11823a) {
        return AbstractC12428g0.a.m40424b(c11826b0.m37684f(), c11823a.f31211f, c11823a.f31212g, c11826b0.mo37682a().mo37689c(), EnumC11871y.m37955b(c11823a.f31209d).m37956h(), c11823a.f31213h);
    }

    /* renamed from: q */
    private static AbstractC12428g0.b m37805q(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return AbstractC12428g0.b.m40425c(C11839i.m37730k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), C11839i.m37721b(context), statFs.getBlockCount() * statFs.getBlockSize(), C11839i.m37742w(), C11839i.m37731l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    /* renamed from: r */
    private static AbstractC12428g0.c m37806r() {
        return AbstractC12428g0.c.m40426a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, C11839i.m37743x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static void m37807s(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    private void m37808w(boolean z10, InterfaceC1952i interfaceC1952i) {
        String str;
        ArrayList arrayList = new ArrayList(this.f31274m.m37859p());
        if (arrayList.size() <= z10) {
            C10889g.m33216f().m33223i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z10 ? 1 : 0);
        if (interfaceC1952i.mo10188b().f7999b.f8007b) {
            m37792c0(str2);
        } else {
            C10889g.m33216f().m33223i("ANR feature disabled.");
        }
        if (this.f31271j.mo33195d(str2)) {
            m37775A(str2);
        }
        if (z10 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f31273l.m37761e(null);
            str = null;
        }
        this.f31274m.m37857k(m37778E(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m37809x(String str, Boolean bool) {
        long m37778E = m37778E();
        C10889g.m33216f().m33217b("Opening a new session with ID " + str);
        this.f31271j.mo33194c(str, String.format(Locale.US, "Crashlytics Android SDK/%s", C11857r.m37873l()), m37778E, AbstractC12428g0.m40423b(m37804p(this.f31267f, this.f31269h), m37806r(), m37805q(this.f31262a)));
        if (bool.booleanValue() && str != null) {
            this.f31265d.m39009q(str);
        }
        this.f31270i.m38934e(str);
        this.f31273l.m37761e(str);
        this.f31274m.m37860q(str, m37778E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m37810y(long j10) {
        try {
            if (this.f31268g.m452e(".ae" + j10).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            C10889g.m33216f().m33226l("Could not create app exception marker file.", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean m37811B(InterfaceC1952i interfaceC1952i) {
        this.f31266e.m37767b();
        if (m37815L()) {
            C10889g.m33216f().m33225k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        C10889g.m33216f().m33223i("Finalizing previously open sessions.");
        try {
            m37808w(true, interfaceC1952i);
            C10889g.m33216f().m33223i("Closed all previously open sessions.");
            return true;
        } catch (Exception e10) {
            C10889g.m33216f().m33220e("Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    /* renamed from: I */
    String m37812I() {
        InputStream m37780G = m37780G("META-INF/version-control-info.textproto");
        if (m37780G == null) {
            return null;
        }
        C10889g.m33216f().m33217b("Read version control info");
        return Base64.encodeToString(m37787U(m37780G), 0);
    }

    /* renamed from: J */
    void m37813J(InterfaceC1952i interfaceC1952i, Thread thread, Throwable th2) {
        m37814K(interfaceC1952i, thread, th2, false);
    }

    /* renamed from: K */
    synchronized void m37814K(InterfaceC1952i interfaceC1952i, Thread thread, Throwable th2, boolean z10) {
        C10889g.m33216f().m33217b("Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName());
        try {
            C11870x0.m37945f(this.f31266e.m37771i(new b(System.currentTimeMillis(), th2, thread, interfaceC1952i, z10)));
        } catch (TimeoutException unused) {
            C10889g.m33216f().m33219d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e10) {
            C10889g.m33216f().m33220e("Error handling uncaught exception", e10);
        }
    }

    /* renamed from: L */
    boolean m37815L() {
        C11865v c11865v = this.f31275n;
        return c11865v != null && c11865v.m37928a();
    }

    /* renamed from: N */
    List<File> m37816N() {
        return this.f31268g.m453f(f31261t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void m37817Q(Thread thread, Throwable th2) {
        InterfaceC1952i interfaceC1952i = this.f31276o;
        if (interfaceC1952i == null) {
            C10889g.m33216f().m33225k("settingsProvider not set");
        } else {
            m37814K(interfaceC1952i, thread, th2, true);
        }
    }

    /* renamed from: T */
    void m37818T(String str) {
        this.f31266e.m37770h(new g(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public void m37819V() {
        try {
            String m37812I = m37812I();
            if (m37812I != null) {
                m37822Y("com.crashlytics.version-control-info", m37812I);
                C10889g.m33216f().m33221g("Saved version control info");
            }
        } catch (IOException e10) {
            C10889g.m33216f().m33226l("Unable to save version control info", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public Task<Void> m37820W() {
        this.f31278q.trySetResult(Boolean.TRUE);
        return this.f31279r.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public void m37821X(String str, String str2) {
        try {
            this.f31265d.m39007o(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f31262a;
            if (context != null && C11839i.m37740u(context)) {
                throw e10;
            }
            C10889g.m33216f().m33219d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public void m37822Y(String str, String str2) {
        try {
            this.f31265d.m39008p(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f31262a;
            if (context != null && C11839i.m37740u(context)) {
                throw e10;
            }
            C10889g.m33216f().m33219d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public void m37823Z(String str) {
        this.f31265d.m39010r(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public Task<Void> m37824a0(Task<C1947d> task) {
        if (this.f31274m.m37858n()) {
            C10889g.m33216f().m33223i("Crash reports are available to be sent.");
            return m37790b0().onSuccessTask(new d(task));
        }
        C10889g.m33216f().m33223i("No crash reports are available to be sent.");
        this.f31277p.trySetResult(Boolean.FALSE);
        return Tasks.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void m37825d0(Thread thread, Throwable th2) {
        this.f31266e.m37769g(new f(System.currentTimeMillis(), th2, thread));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void m37826e0(long j10, String str) {
        this.f31266e.m37770h(new e(j10, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public Task<Boolean> m37827o() {
        if (this.f31280s.compareAndSet(false, true)) {
            return this.f31277p.getTask();
        }
        C10889g.m33216f().m33225k("checkForUnsentReports should only be called once per execution.");
        return Tasks.forResult(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public Task<Void> m37828t() {
        this.f31278q.trySetResult(Boolean.FALSE);
        return this.f31279r.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean m37829u() {
        if (!this.f31264c.m37897c()) {
            String m37777D = m37777D();
            return m37777D != null && this.f31271j.mo33195d(m37777D);
        }
        C10889g.m33216f().m33223i("Found previous crash marker.");
        this.f31264c.m37898d();
        return true;
    }

    /* renamed from: v */
    void m37830v(InterfaceC1952i interfaceC1952i) {
        m37808w(false, interfaceC1952i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m37831z(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC1952i interfaceC1952i) {
        this.f31276o = interfaceC1952i;
        m37818T(str);
        C11865v c11865v = new C11865v(new a(), interfaceC1952i, uncaughtExceptionHandler, this.f31271j);
        this.f31275n = c11865v;
        Thread.setDefaultUncaughtExceptionHandler(c11865v);
    }
}
