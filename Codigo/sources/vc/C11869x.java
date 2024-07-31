package vc;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.Executor;
import p485zb.C12867g;
import sc.C10889g;

/* renamed from: vc.x */
/* loaded from: classes.dex */
public class C11869x {

    /* renamed from: a */
    private final SharedPreferences f31363a;

    /* renamed from: b */
    private final C12867g f31364b;

    /* renamed from: c */
    private final Object f31365c;

    /* renamed from: d */
    TaskCompletionSource<Void> f31366d;

    /* renamed from: e */
    boolean f31367e;

    /* renamed from: f */
    private boolean f31368f;

    /* renamed from: g */
    private Boolean f31369g;

    /* renamed from: h */
    private final TaskCompletionSource<Void> f31370h;

    public C11869x(C12867g c12867g) {
        Object obj = new Object();
        this.f31365c = obj;
        this.f31366d = new TaskCompletionSource<>();
        this.f31367e = false;
        this.f31368f = false;
        this.f31370h = new TaskCompletionSource<>();
        Context m42630m = c12867g.m42630m();
        this.f31364b = c12867g;
        this.f31363a = C11839i.m37736q(m42630m);
        Boolean m37930b = m37930b();
        this.f31369g = m37930b == null ? m37929a(m42630m) : m37930b;
        synchronized (obj) {
            if (m37936d()) {
                this.f31366d.trySetResult(null);
                this.f31367e = true;
            }
        }
    }

    /* renamed from: a */
    private Boolean m37929a(Context context) {
        Boolean m37933g = m37933g(context);
        if (m37933g == null) {
            this.f31368f = false;
            return null;
        }
        this.f31368f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(m37933g));
    }

    /* renamed from: b */
    private Boolean m37930b() {
        if (!this.f31363a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f31368f = false;
        return Boolean.valueOf(this.f31363a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    /* renamed from: e */
    private boolean m37931e() {
        try {
            return this.f31364b.m42634x();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    /* renamed from: f */
    private void m37932f(boolean z10) {
        C10889g.m33216f().m33217b(String.format("Crashlytics automatic data collection %s by %s.", z10 ? "ENABLED" : "DISABLED", this.f31369g == null ? "global Firebase setting" : this.f31368f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    /* renamed from: g */
    private static Boolean m37933g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), RecognitionOptions.ITF)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e10) {
            C10889g.m33216f().m33220e("Could not read data collection permission from manifest", e10);
            return null;
        }
    }

    /* renamed from: i */
    private static void m37934i(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bool != null) {
            edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            edit.remove("firebase_crashlytics_collection_enabled");
        }
        edit.apply();
    }

    /* renamed from: c */
    public void m37935c(boolean z10) {
        if (!z10) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f31370h.trySetResult(null);
    }

    /* renamed from: d */
    public synchronized boolean m37936d() {
        boolean booleanValue;
        Boolean bool = this.f31369g;
        booleanValue = bool != null ? bool.booleanValue() : m37931e();
        m37932f(booleanValue);
        return booleanValue;
    }

    /* renamed from: h */
    public synchronized void m37937h(Boolean bool) {
        if (bool != null) {
            try {
                this.f31368f = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f31369g = bool != null ? bool : m37929a(this.f31364b.m42630m());
        m37934i(this.f31363a, bool);
        synchronized (this.f31365c) {
            if (m37936d()) {
                if (!this.f31367e) {
                    this.f31366d.trySetResult(null);
                    this.f31367e = true;
                }
            } else if (this.f31367e) {
                this.f31366d = new TaskCompletionSource<>();
                this.f31367e = false;
            }
        }
    }

    /* renamed from: j */
    public Task<Void> m37938j() {
        Task<Void> task;
        synchronized (this.f31365c) {
            task = this.f31366d.getTask();
        }
        return task;
    }

    /* renamed from: k */
    public Task<Void> m37939k(Executor executor) {
        return C11870x0.m37954o(executor, this.f31370h.getTask(), m37938j());
    }
}
