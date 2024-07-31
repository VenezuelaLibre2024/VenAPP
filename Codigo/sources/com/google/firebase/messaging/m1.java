package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m1 implements ServiceConnection {

    /* renamed from: a */
    private final Context f12138a;

    /* renamed from: b */
    private final Intent f12139b;

    /* renamed from: c */
    private final ScheduledExecutorService f12140c;

    /* renamed from: d */
    private final Queue<a> f12141d;

    /* renamed from: e */
    private j1 f12142e;

    /* renamed from: f */
    private boolean f12143f;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Intent f12144a;

        /* renamed from: b */
        private final TaskCompletionSource<Void> f12145b = new TaskCompletionSource<>();

        a(Intent intent) {
            this.f12144a = intent;
        }

        public /* synthetic */ void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f12144a.getAction() + " finishing.");
            d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            e().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.l1

                /* renamed from: a */
                public final /* synthetic */ ScheduledFuture f12133a;

                public /* synthetic */ l1(ScheduledFuture scheduledFuture) {
                    r1 = scheduledFuture;
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    r1.cancel(false);
                }
            });
        }

        public void d() {
            this.f12145b.trySetResult(null);
        }

        Task<Void> e() {
            return this.f12145b.getTask();
        }
    }

    public m1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new ma.b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    m1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f12141d = new ArrayDeque();
        this.f12143f = false;
        Context applicationContext = context.getApplicationContext();
        this.f12138a = applicationContext;
        this.f12139b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f12140c = scheduledExecutorService;
    }

    private void a() {
        while (!this.f12141d.isEmpty()) {
            this.f12141d.poll().d();
        }
    }

    private synchronized void b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f12141d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            j1 j1Var = this.f12142e;
            if (j1Var == null || !j1Var.isBinderAlive()) {
                d();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f12142e.c(this.f12141d.poll());
        }
    }

    private void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f12143f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f12143f) {
            return;
        }
        this.f12143f = true;
        try {
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        if (ka.b.b().a(this.f12138a, this.f12139b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f12143f = false;
        a();
    }

    public synchronized Task<Void> c(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        aVar.c(this.f12140c);
        this.f12141d.add(aVar);
        b();
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f12143f = false;
        if (iBinder instanceof j1) {
            this.f12142e = (j1) iBinder;
            b();
            return;
        }
        Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
        a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        b();
    }
}
