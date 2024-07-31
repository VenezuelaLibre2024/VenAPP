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
import com.google.firebase.messaging.ServiceConnectionC6246m1;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ma.ThreadFactoryC9560b;
import p200ka.C9214b;

/* renamed from: com.google.firebase.messaging.m1 */
/* loaded from: classes.dex */
class ServiceConnectionC6246m1 implements ServiceConnection {

    /* renamed from: a */
    private final Context f13353a;

    /* renamed from: b */
    private final Intent f13354b;

    /* renamed from: c */
    private final ScheduledExecutorService f13355c;

    /* renamed from: d */
    private final Queue<a> f13356d;

    /* renamed from: e */
    private BinderC6237j1 f13357e;

    /* renamed from: f */
    private boolean f13358f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.messaging.m1$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Intent f13359a;

        /* renamed from: b */
        private final TaskCompletionSource<Void> f13360b = new TaskCompletionSource<>();

        a(Intent intent) {
            this.f13359a = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m17127f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f13359a.getAction() + " finishing.");
            m17130d();
        }

        /* renamed from: c */
        void m17129c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.k1
                @Override // java.lang.Runnable
                public final void run() {
                    ServiceConnectionC6246m1.a.this.m17127f();
                }
            }, 20L, TimeUnit.SECONDS);
            m17131e().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.l1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    schedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public void m17130d() {
            this.f13360b.trySetResult(null);
        }

        /* renamed from: e */
        Task<Void> m17131e() {
            return this.f13360b.getTask();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ServiceConnectionC6246m1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new ThreadFactoryC9560b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    ServiceConnectionC6246m1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f13356d = new ArrayDeque();
        this.f13358f = false;
        Context applicationContext = context.getApplicationContext();
        this.f13353a = applicationContext;
        this.f13354b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f13355c = scheduledExecutorService;
    }

    /* renamed from: a */
    private void m17121a() {
        while (!this.f13356d.isEmpty()) {
            this.f13356d.poll().m17130d();
        }
    }

    /* renamed from: b */
    private synchronized void m17122b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f13356d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            BinderC6237j1 binderC6237j1 = this.f13357e;
            if (binderC6237j1 == null || !binderC6237j1.isBinderAlive()) {
                m17123d();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f13357e.m17079c(this.f13356d.poll());
        }
    }

    /* renamed from: d */
    private void m17123d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f13358f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f13358f) {
            return;
        }
        this.f13358f = true;
        try {
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        if (C9214b.m27395b().m27400a(this.f13353a, this.f13354b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f13358f = false;
        m17121a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized Task<Void> m17124c(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        aVar.m17129c(this.f13355c);
        this.f13356d.add(aVar);
        m17122b();
        return aVar.m17131e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f13358f = false;
        if (iBinder instanceof BinderC6237j1) {
            this.f13357e = (BinderC6237j1) iBinder;
            m17122b();
            return;
        }
        Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
        m17121a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        m17122b();
    }
}
