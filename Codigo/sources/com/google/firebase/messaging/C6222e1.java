package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import androidx.collection.C0731a;
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
/* renamed from: com.google.firebase.messaging.e1 */
/* loaded from: classes.dex */
public class C6222e1 {

    /* renamed from: i */
    private static final long f13299i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    private final Context f13300a;

    /* renamed from: b */
    private final C6236j0 f13301b;

    /* renamed from: c */
    private final C6221e0 f13302c;

    /* renamed from: d */
    private final FirebaseMessaging f13303d;

    /* renamed from: f */
    private final ScheduledExecutorService f13305f;

    /* renamed from: h */
    private final C6216c1 f13307h;

    /* renamed from: e */
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f13304e = new C0731a();

    /* renamed from: g */
    private boolean f13306g = false;

    private C6222e1(FirebaseMessaging firebaseMessaging, C6236j0 c6236j0, C6216c1 c6216c1, C6221e0 c6221e0, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f13303d = firebaseMessaging;
        this.f13301b = c6236j0;
        this.f13307h = c6216c1;
        this.f13302c = c6221e0;
        this.f13300a = context;
        this.f13305f = scheduledExecutorService;
    }

    /* renamed from: b */
    private void m16991b(C6213b1 c6213b1, TaskCompletionSource<Void> taskCompletionSource) {
        ArrayDeque<TaskCompletionSource<Void>> arrayDeque;
        synchronized (this.f13304e) {
            String m16948e = c6213b1.m16948e();
            if (this.f13304e.containsKey(m16948e)) {
                arrayDeque = this.f13304e.get(m16948e);
            } else {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque2 = new ArrayDeque<>();
                this.f13304e.put(m16948e, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(taskCompletionSource);
        }
    }

    /* renamed from: c */
    private static <T> void m16992c(Task<T> task) {
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

    /* renamed from: d */
    private void m16993d(String str) {
        m16992c(this.f13302c.m16988l(this.f13303d.m16913n(), str));
    }

    /* renamed from: e */
    private void m16994e(String str) {
        m16992c(this.f13302c.m16989m(this.f13303d.m16913n(), str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static Task<C6222e1> m16995f(final FirebaseMessaging firebaseMessaging, final C6236j0 c6236j0, final C6221e0 c6221e0, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.d1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C6222e1 m16997j;
                m16997j = C6222e1.m16997j(context, scheduledExecutorService, firebaseMessaging, c6236j0, c6221e0);
                return m16997j;
            }
        });
    }

    /* renamed from: h */
    static boolean m16996h() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ C6222e1 m16997j(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C6236j0 c6236j0, C6221e0 c6221e0) {
        return new C6222e1(firebaseMessaging, c6236j0, C6216c1.m16966b(context, scheduledExecutorService), c6221e0, context, scheduledExecutorService);
    }

    /* renamed from: k */
    private void m16998k(C6213b1 c6213b1) {
        synchronized (this.f13304e) {
            String m16948e = c6213b1.m16948e();
            if (this.f13304e.containsKey(m16948e)) {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.f13304e.get(m16948e);
                TaskCompletionSource<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.setResult(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f13304e.remove(m16948e);
                }
            }
        }
    }

    /* renamed from: p */
    private void m16999p() {
        if (m17001i()) {
            return;
        }
        m17009t(0L);
    }

    /* renamed from: g */
    boolean m17000g() {
        return this.f13307h.m16969c() != null;
    }

    /* renamed from: i */
    synchronized boolean m17001i() {
        return this.f13306g;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[Catch: IOException -> 0x009d, TryCatch #0 {IOException -> 0x009d, blocks: (B:3:0x0003, B:12:0x0030, B:14:0x0036, B:15:0x004c, B:19:0x0050, B:21:0x005d, B:22:0x0076, B:24:0x0083, B:25:0x0015, B:28:0x001f), top: B:2:0x0003 }] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean m17002l(com.google.firebase.messaging.C6213b1 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 0
            java.lang.String r2 = r7.m16946b()     // Catch: java.io.IOException -> L9d
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
            boolean r2 = m16996h()     // Catch: java.io.IOException -> L9d
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
            java.lang.String r2 = r7.m16947c()     // Catch: java.io.IOException -> L9d
            r6.m16994e(r2)     // Catch: java.io.IOException -> L9d
            boolean r2 = m16996h()     // Catch: java.io.IOException -> L9d
            if (r2 == 0) goto L9c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L9d
            r2.<init>()     // Catch: java.io.IOException -> L9d
            java.lang.String r4 = "Unsubscribe from topic: "
            r2.append(r4)     // Catch: java.io.IOException -> L9d
            java.lang.String r7 = r7.m16947c()     // Catch: java.io.IOException -> L9d
            r2.append(r7)     // Catch: java.io.IOException -> L9d
            r2.append(r3)     // Catch: java.io.IOException -> L9d
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L9d
            goto L4c
        L76:
            java.lang.String r2 = r7.m16947c()     // Catch: java.io.IOException -> L9d
            r6.m16993d(r2)     // Catch: java.io.IOException -> L9d
            boolean r2 = m16996h()     // Catch: java.io.IOException -> L9d
            if (r2 == 0) goto L9c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L9d
            r2.<init>()     // Catch: java.io.IOException -> L9d
            java.lang.String r4 = "Subscribe to topic: "
            r2.append(r4)     // Catch: java.io.IOException -> L9d
            java.lang.String r7 = r7.m16947c()     // Catch: java.io.IOException -> L9d
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C6222e1.m17002l(com.google.firebase.messaging.b1):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m17003m(Runnable runnable, long j10) {
        this.f13305f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    /* renamed from: n */
    Task<Void> m17004n(C6213b1 c6213b1) {
        this.f13307h.m16968a(c6213b1);
        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
        m16991b(c6213b1, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public synchronized void m17005o(boolean z10) {
        this.f13306g = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m17006q() {
        if (m17000g()) {
            m16999p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public Task<Void> m17007r(String str) {
        Task<Void> m17004n = m17004n(C6213b1.m16944f(str));
        m17006q();
        return m17004n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x000d, code lost:
    
        if (m16996h() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0017, code lost:
    
        return true;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m17008s() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.c1 r0 = r2.f13307h     // Catch: java.lang.Throwable -> L2b
            com.google.firebase.messaging.b1 r0 = r0.m16969c()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L19
            boolean r0 = m16996h()     // Catch: java.lang.Throwable -> L2b
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
            boolean r1 = r2.m17002l(r0)
            if (r1 != 0) goto L22
            r0 = 0
            return r0
        L22:
            com.google.firebase.messaging.c1 r1 = r2.f13307h
            r1.m16970e(r0)
            r2.m16998k(r0)
            goto L0
        L2b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C6222e1.m17008s():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m17009t(long j10) {
        m17003m(new RunnableC6225f1(this, this.f13300a, this.f13301b, Math.min(Math.max(30L, 2 * j10), f13299i)), j10);
        m17005o(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public Task<Void> m17010u(String str) {
        Task<Void> m17004n = m17004n(C6213b1.m16945g(str));
        m17006q();
        return m17004n;
    }
}
