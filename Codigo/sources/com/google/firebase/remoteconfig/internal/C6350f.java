package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p284p1.ExecutorC10035b;

/* renamed from: com.google.firebase.remoteconfig.internal.f */
/* loaded from: classes2.dex */
public class C6350f {

    /* renamed from: d */
    private static final Map<String, C6350f> f13676d = new HashMap();

    /* renamed from: e */
    private static final Executor f13677e = new ExecutorC10035b();

    /* renamed from: a */
    private final Executor f13678a;

    /* renamed from: b */
    private final C6365u f13679b;

    /* renamed from: c */
    private Task<C6351g> f13680c = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.remoteconfig.internal.f$b */
    /* loaded from: classes2.dex */
    public static class b<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* renamed from: a */
        private final CountDownLatch f13681a;

        private b() {
            this.f13681a = new CountDownLatch(1);
        }

        /* renamed from: a */
        public boolean m17624a(long j10, TimeUnit timeUnit) {
            return this.f13681a.await(j10, timeUnit);
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.f13681a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            this.f13681a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(TResult tresult) {
            this.f13681a.countDown();
        }
    }

    private C6350f(Executor executor, C6365u c6365u) {
        this.f13678a = executor;
        this.f13679b = c6365u;
    }

    /* renamed from: c */
    private static <TResult> TResult m17613c(Task<TResult> task, long j10, TimeUnit timeUnit) {
        b bVar = new b();
        Executor executor = f13677e;
        task.addOnSuccessListener(executor, bVar);
        task.addOnFailureListener(executor, bVar);
        task.addOnCanceledListener(executor, bVar);
        if (!bVar.m17624a(j10, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    /* renamed from: h */
    public static synchronized C6350f m17614h(Executor executor, C6365u c6365u) {
        C6350f c6350f;
        synchronized (C6350f.class) {
            String m17748b = c6365u.m17748b();
            Map<String, C6350f> map = f13676d;
            if (!map.containsKey(m17748b)) {
                map.put(m17748b, new C6350f(executor, c6365u));
            }
            c6350f = map.get(m17748b);
        }
        return c6350f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Void m17615i(C6351g c6351g) {
        return this.f13679b.m17750e(c6351g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ Task m17616j(boolean z10, C6351g c6351g, Void r32) {
        if (z10) {
            m17617m(c6351g);
        }
        return Tasks.forResult(c6351g);
    }

    /* renamed from: m */
    private synchronized void m17617m(C6351g c6351g) {
        this.f13680c = Tasks.forResult(c6351g);
    }

    /* renamed from: d */
    public void m17618d() {
        synchronized (this) {
            this.f13680c = Tasks.forResult(null);
        }
        this.f13679b.m17747a();
    }

    /* renamed from: e */
    public synchronized Task<C6351g> m17619e() {
        Task<C6351g> task = this.f13680c;
        if (task == null || (task.isComplete() && !this.f13680c.isSuccessful())) {
            Executor executor = this.f13678a;
            final C6365u c6365u = this.f13679b;
            Objects.requireNonNull(c6365u);
            this.f13680c = Tasks.call(executor, new Callable() { // from class: com.google.firebase.remoteconfig.internal.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C6365u.this.m17749d();
                }
            });
        }
        return this.f13680c;
    }

    /* renamed from: f */
    public C6351g m17620f() {
        return m17621g(5L);
    }

    /* renamed from: g */
    C6351g m17621g(long j10) {
        synchronized (this) {
            Task<C6351g> task = this.f13680c;
            if (task != null && task.isSuccessful()) {
                return this.f13680c.getResult();
            }
            try {
                return (C6351g) m17613c(m17619e(), j10, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e10);
                return null;
            }
        }
    }

    /* renamed from: k */
    public Task<C6351g> m17622k(C6351g c6351g) {
        return m17623l(c6351g, true);
    }

    /* renamed from: l */
    public Task<C6351g> m17623l(final C6351g c6351g, final boolean z10) {
        return Tasks.call(this.f13678a, new Callable() { // from class: com.google.firebase.remoteconfig.internal.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void m17615i;
                m17615i = C6350f.this.m17615i(c6351g);
                return m17615i;
            }
        }).onSuccessTask(this.f13678a, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.e
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m17616j;
                m17616j = C6350f.this.m17616j(z10, c6351g, (Void) obj);
                return m17616j;
            }
        });
    }
}
