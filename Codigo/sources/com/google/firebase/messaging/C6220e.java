package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.C0818o;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C6214c;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import la.C9471p;

/* renamed from: com.google.firebase.messaging.e */
/* loaded from: classes.dex */
class C6220e {

    /* renamed from: a */
    private final ExecutorService f13290a;

    /* renamed from: b */
    private final Context f13291b;

    /* renamed from: c */
    private final C6239k0 f13292c;

    public C6220e(Context context, C6239k0 c6239k0, ExecutorService executorService) {
        this.f13290a = executorService;
        this.f13291b = context;
        this.f13292c = c6239k0;
    }

    /* renamed from: b */
    private boolean m16972b() {
        if (((KeyguardManager) this.f13291b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!C9471p.m28169f()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f13291b.getSystemService("activity")).getRunningAppProcesses();
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

    /* renamed from: c */
    private void m16973c(C6214c.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f13291b.getSystemService("notification")).notify(aVar.f13277b, aVar.f13278c, aVar.f13276a.m4137c());
    }

    /* renamed from: d */
    private C6227g0 m16974d() {
        C6227g0 m17024f = C6227g0.m17024f(this.f13292c.m17101p("gcm.n.image"));
        if (m17024f != null) {
            m17024f.m17028j(this.f13290a);
        }
        return m17024f;
    }

    /* renamed from: e */
    private void m16975e(C0818o.e eVar, C6227g0 c6227g0) {
        if (c6227g0 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(c6227g0.m17027g(), 5L, TimeUnit.SECONDS);
            eVar.m4153v(bitmap);
            eVar.m4127H(new C0818o.b().m4096p(bitmap).m4095o(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            c6227g0.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            c6227g0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m16976a() {
        if (this.f13292c.m17087a("gcm.n.noui")) {
            return true;
        }
        if (m16972b()) {
            return false;
        }
        C6227g0 m16974d = m16974d();
        C6214c.a m16953e = C6214c.m16953e(this.f13291b, this.f13292c);
        m16975e(m16953e.f13276a, m16974d);
        m16973c(m16953e);
        return true;
    }
}
