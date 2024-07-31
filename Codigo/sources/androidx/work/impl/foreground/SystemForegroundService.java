package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.n;
import androidx.work.impl.foreground.b;
import f2.j;

/* loaded from: classes.dex */
public class SystemForegroundService extends n implements b.InterfaceC0096b {

    /* renamed from: f */
    private static final String f5817f = j.i("SystemFgService");

    /* renamed from: r */
    private static SystemForegroundService f5818r = null;

    /* renamed from: b */
    private Handler f5819b;

    /* renamed from: c */
    private boolean f5820c;

    /* renamed from: d */
    androidx.work.impl.foreground.b f5821d;

    /* renamed from: e */
    NotificationManager f5822e;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f5823a;

        /* renamed from: b */
        final /* synthetic */ Notification f5824b;

        /* renamed from: c */
        final /* synthetic */ int f5825c;

        a(int i10, Notification notification, int i11) {
            this.f5823a = i10;
            this.f5824b = notification;
            this.f5825c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                e.a(SystemForegroundService.this, this.f5823a, this.f5824b, this.f5825c);
            } else if (i10 >= 29) {
                d.a(SystemForegroundService.this, this.f5823a, this.f5824b, this.f5825c);
            } else {
                SystemForegroundService.this.startForeground(this.f5823a, this.f5824b);
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f5827a;

        /* renamed from: b */
        final /* synthetic */ Notification f5828b;

        b(int i10, Notification notification) {
            this.f5827a = i10;
            this.f5828b = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f5822e.notify(this.f5827a, this.f5828b);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f5830a;

        c(int i10) {
            this.f5830a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f5822e.cancel(this.f5830a);
        }
    }

    /* loaded from: classes.dex */
    static class d {
        static void a(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    /* loaded from: classes.dex */
    static class e {
        static void a(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                j.e().l(SystemForegroundService.f5817f, "Unable to start foreground service", e10);
            }
        }
    }

    private void f() {
        this.f5819b = new Handler(Looper.getMainLooper());
        this.f5822e = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.b bVar = new androidx.work.impl.foreground.b(getApplicationContext());
        this.f5821d = bVar;
        bVar.n(this);
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0096b
    public void a(int i10, Notification notification) {
        this.f5819b.post(new b(i10, notification));
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0096b
    public void c(int i10, int i11, Notification notification) {
        this.f5819b.post(new a(i10, notification, i11));
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0096b
    public void d(int i10) {
        this.f5819b.post(new c(i10));
    }

    @Override // androidx.lifecycle.n, android.app.Service
    public void onCreate() {
        super.onCreate();
        f5818r = this;
        f();
    }

    @Override // androidx.lifecycle.n, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f5821d.l();
    }

    @Override // androidx.lifecycle.n, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f5820c) {
            j.e().f(f5817f, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f5821d.l();
            f();
            this.f5820c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f5821d.m(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0096b
    public void stop() {
        this.f5820c = true;
        j.e().a(f5817f, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f5818r = null;
        stopSelf();
    }
}
