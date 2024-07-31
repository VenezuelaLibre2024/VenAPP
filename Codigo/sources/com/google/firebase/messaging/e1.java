package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e1 {

    /* renamed from: i, reason: collision with root package name */
    private static final long f12084i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a, reason: collision with root package name */
    private final Context f12085a;

    /* renamed from: b, reason: collision with root package name */
    private final j0 f12086b;

    /* renamed from: c, reason: collision with root package name */
    private final e0 f12087c;

    /* renamed from: d, reason: collision with root package name */
    private final FirebaseMessaging f12088d;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f12090f;

    /* renamed from: h, reason: collision with root package name */
    private final c1 f12092h;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f12089e = new androidx.collection.a();

    /* renamed from: g, reason: collision with root package name */
    private boolean f12091g = false;

    private e1(FirebaseMessaging firebaseMessaging, j0 j0Var, c1 c1Var, e0 e0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f12088d = firebaseMessaging;
        this.f12086b = j0Var;
        this.f12092h = c1Var;
        this.f12087c = e0Var;
        this.f12085a = context;
        this.f12090f = scheduledExecutorService;
    }

    private void b(b1 b1Var, TaskCompletionSource<Void> taskCompletionSource) {
        ArrayDeque<TaskCompletionSource<Void>> arrayDeque;
        synchronized (this.f12089e) {
            String e10 = b1Var.e();
            if (this.f12089e.containsKey(e10)) {
                arrayDeque = this.f12089e.get(e10);
            } else {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque2 = new ArrayDeque<>();
                this.f12089e.put(e10, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(taskCompletionSource);
        }
    }

    private static <T> void c(Task<T> task) {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e12) {
            e = e12;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    private void d(String str) {
        c(this.f12087c.l(this.f12088d.n(), str));
    }

    private void e(String str) {
        c(this.f12087c.m(this.f12088d.n(), str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Task<e1> f(final FirebaseMessaging firebaseMessaging, final j0 j0Var, final e0 e0Var, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.d1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                e1 j10;
                j10 = e1.j(context, scheduledExecutorService, firebaseMessaging, j0Var, e0Var);
                return j10;
            }
        });
    }

    static boolean h() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e1 j(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, j0 j0Var, e0 e0Var) {
        return new e1(firebaseMessaging, j0Var, c1.b(context, scheduledExecutorService), e0Var, context, scheduledExecutorService);
    }

    private void k(b1 b1Var) {
        synchronized (this.f12089e) {
            String e10 = b1Var.e();
            if (this.f12089e.containsKey(e10)) {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.f12089e.get(e10);
                TaskCompletionSource<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.setResult(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f12089e.remove(e10);
                }
            }
        }
    }

    private void p() {
        if (i()) {
            return;
        }
        t(0L);
    }

    boolean g() {
        return this.f12092h.c() != null;
    }

    synchronized boolean i() {
        return this.f12091g;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[Catch: IOException -> 0x009d, TryCatch #0 {IOException -> 0x009d, blocks: (B:3:0x0003, B:12:0x0030, B:14:0x0036, B:15:0x004c, B:19:0x0050, B:21:0x005d, B:22:0x0076, B:24:0x0083, B:25:0x0015, B:28:0x001f), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean l(com.google.firebase.messaging.b1 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 0
            java.lang.String r2 = r7.b()     // Catch: java.io.IOException -> L9d
            int r3 = r2.hashCode()     // Catch: java.io.IOException -> L9d
            r4 = 83
            r5 = 1
            if (r3 == r4) goto L1f
            r4 = 85
            if (r3 == r4) goto L15
            goto L29
        L15:
            java.lang.String r3 = "U"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L9d
            if (r2 == 0) goto L29
            r2 = r5
            goto L2a
        L1f:
            java.lang.String r3 = "S"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L9d
            if (r2 == 0) goto L29
            r2 = r1
            goto L2a
        L29:
            r2 = -1
        L2a:
            java.lang.String r3 = " succeeded."
            if (r2 == 0) goto L76
            if (r2 == r5) goto L50
            boolean r2 = h()     // Catch: java.io.IOException -> L9d
            if (r2 == 0) goto L9c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L9d
            r2.<init>()     // Catch: java.io.IOException -> L9d
            java.lang.String r3 = "Unknown topic operation"
            r2.append(r3)     // Catch: java.io.IOException -> L9d
            r2.append(r7)     // Catch: java.io.IOException -> L9d
            java.lang.String r7 = "."
            r2.append(r7)     // Catch: java.io.IOException -> L9d
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L9d
        L4c:
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> L9d
            goto L9c
        L50:
            java.lang.String r2 = r7.c()     // Catch: java.io.IOException -> L9d
            r6.e(r2)     // Catch: java.io.IOException -> L9d
            boolean r2 = h()     // Catch: java.io.IOException -> L9d
            if (r2 == 0) goto L9c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L9d
            r2.<init>()     // Catch: java.io.IOException -> L9d
            java.lang.String r4 = "Unsubscribe from topic: "
            r2.append(r4)     // Catch: java.io.IOException -> L9d
            java.lang.String r7 = r7.c()     // Catch: java.io.IOException -> L9d
            r2.append(r7)     // Catch: java.io.IOException -> L9d
            r2.append(r3)     // Catch: java.io.IOException -> L9d
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L9d
            goto L4c
        L76:
            java.lang.String r2 = r7.c()     // Catch: java.io.IOException -> L9d
            r6.d(r2)     // Catch: java.io.IOException -> L9d
            boolean r2 = h()     // Catch: java.io.IOException -> L9d
            if (r2 == 0) goto L9c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L9d
            r2.<init>()     // Catch: java.io.IOException -> L9d
            java.lang.String r4 = "Subscribe to topic: "
            r2.append(r4)     // Catch: java.io.IOException -> L9d
            java.lang.String r7 = r7.c()     // Catch: java.io.IOException -> L9d
            r2.append(r7)     // Catch: java.io.IOException -> L9d
            r2.append(r3)     // Catch: java.io.IOException -> L9d
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L9d
            goto L4c
        L9c:
            return r5
        L9d:
            r7 = move-exception
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lc4
            java.lang.String r2 = "INTERNAL_SERVER_ERROR"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lb7
            goto Lc4
        Lb7:
            java.lang.String r2 = r7.getMessage()
            if (r2 != 0) goto Lc3
            java.lang.String r7 = "Topic operation failed without exception message. Will retry Topic operation."
        Lbf:
            android.util.Log.e(r0, r7)
            return r1
        Lc3:
            throw r7
        Lc4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Topic operation failed: "
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = ". Will retry Topic operation."
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            goto Lbf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.e1.l(com.google.firebase.messaging.b1):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(Runnable runnable, long j10) {
        this.f12090f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    Task<Void> n(b1 b1Var) {
        this.f12092h.a(b1Var);
        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
        b(b1Var, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void o(boolean z10) {
        this.f12091g = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        if (g()) {
            p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<Void> r(String str) {
        Task<Void> n10 = n(b1.f(str));
        q();
        return n10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x000d, code lost:
    
        if (h() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0017, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean s() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.c1 r0 = r2.f12092h     // Catch: java.lang.Throwable -> L2b
            com.google.firebase.messaging.b1 r0 = r0.c()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L19
            boolean r0 = h()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L16
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L2b
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            r0 = 1
            return r0
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r2.l(r0)
            if (r1 != 0) goto L22
            r0 = 0
            return r0
        L22:
            com.google.firebase.messaging.c1 r1 = r2.f12092h
            r1.e(r0)
            r2.k(r0)
            goto L0
        L2b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.e1.s():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(long j10) {
        m(new f1(this, this.f12085a, this.f12086b, Math.min(Math.max(30L, 2 * j10), f12084i)), j10);
        o(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<Void> u(String str) {
        Task<Void> n10 = n(b1.g(str));
        q();
        return n10;
    }
}
