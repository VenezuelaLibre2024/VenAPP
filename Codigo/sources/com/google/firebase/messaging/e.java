package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.o;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.c;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    private final ExecutorService f12075a;

    /* renamed from: b */
    private final Context f12076b;

    /* renamed from: c */
    private final k0 f12077c;

    public e(Context context, k0 k0Var, ExecutorService executorService) {
        this.f12075a = executorService;
        this.f12076b = context;
        this.f12077c = k0Var;
    }

    private boolean b() {
        if (((KeyguardManager) this.f12076b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!la.p.f()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f12076b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    private void c(c.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f12076b.getSystemService("notification")).notify(aVar.f12062b, aVar.f12063c, aVar.f12061a.c());
    }

    private g0 d() {
        g0 f10 = g0.f(this.f12077c.p("gcm.n.image"));
        if (f10 != null) {
            f10.j(this.f12075a);
        }
        return f10;
    }

    private void e(o.e eVar, g0 g0Var) {
        if (g0Var == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(g0Var.g(), 5L, TimeUnit.SECONDS);
            eVar.v(bitmap);
            eVar.H(new o.b().p(bitmap).o(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            g0Var.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            g0Var.close();
        }
    }

    public boolean a() {
        if (this.f12077c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        g0 d10 = d();
        c.a e10 = c.e(this.f12076b, this.f12077c);
        e(e10.f12061a, d10);
        c(e10);
        return true;
    }
}
