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

/* loaded from: classes.dex */
public class x {

    /* renamed from: a */
    private final SharedPreferences f28929a;

    /* renamed from: b */
    private final zb.g f28930b;

    /* renamed from: c */
    private final Object f28931c;

    /* renamed from: d */
    TaskCompletionSource<Void> f28932d;

    /* renamed from: e */
    boolean f28933e;

    /* renamed from: f */
    private boolean f28934f;

    /* renamed from: g */
    private Boolean f28935g;

    /* renamed from: h */
    private final TaskCompletionSource<Void> f28936h;

    public x(zb.g gVar) {
        Object obj = new Object();
        this.f28931c = obj;
        this.f28932d = new TaskCompletionSource<>();
        this.f28933e = false;
        this.f28934f = false;
        this.f28936h = new TaskCompletionSource<>();
        Context m10 = gVar.m();
        this.f28930b = gVar;
        this.f28929a = i.q(m10);
        Boolean b10 = b();
        this.f28935g = b10 == null ? a(m10) : b10;
        synchronized (obj) {
            if (d()) {
                this.f28932d.trySetResult(null);
                this.f28933e = true;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean g10 = g(context);
        if (g10 == null) {
            this.f28934f = false;
            return null;
        }
        this.f28934f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(g10));
    }

    private Boolean b() {
        if (!this.f28929a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f28934f = false;
        return Boolean.valueOf(this.f28929a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    private boolean e() {
        try {
            return this.f28930b.x();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void f(boolean z10) {
        sc.g.f().b(String.format("Crashlytics automatic data collection %s by %s.", z10 ? "ENABLED" : "DISABLED", this.f28935g == null ? "global Firebase setting" : this.f28934f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    private static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), RecognitionOptions.ITF)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e10) {
            sc.g.f().e("Could not read data collection permission from manifest", e10);
            return null;
        }
    }

    private static void i(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bool != null) {
            edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            edit.remove("firebase_crashlytics_collection_enabled");
        }
        edit.apply();
    }

    public void c(boolean z10) {
        if (!z10) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f28936h.trySetResult(null);
    }

    public synchronized boolean d() {
        boolean booleanValue;
        Boolean bool = this.f28935g;
        booleanValue = bool != null ? bool.booleanValue() : e();
        f(booleanValue);
        return booleanValue;
    }

    public synchronized void h(Boolean bool) {
        if (bool != null) {
            try {
                this.f28934f = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f28935g = bool != null ? bool : a(this.f28930b.m());
        i(this.f28929a, bool);
        synchronized (this.f28931c) {
            if (d()) {
                if (!this.f28933e) {
                    this.f28932d.trySetResult(null);
                    this.f28933e = true;
                }
            } else if (this.f28933e) {
                this.f28932d = new TaskCompletionSource<>();
                this.f28933e = false;
            }
        }
    }

    public Task<Void> j() {
        Task<Void> task;
        synchronized (this.f28931c) {
            task = this.f28932d.getTask();
        }
        return task;
    }

    public Task<Void> k(Executor executor) {
        return x0.o(executor, this.f28936h.getTask(), j());
    }
}
