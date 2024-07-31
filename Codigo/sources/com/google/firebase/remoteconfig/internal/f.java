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

/* loaded from: classes2.dex */
public class f {

    /* renamed from: d */
    private static final Map<String, f> f12444d = new HashMap();

    /* renamed from: e */
    private static final Executor f12445e = new p1.b();

    /* renamed from: a */
    private final Executor f12446a;

    /* renamed from: b */
    private final u f12447b;

    /* renamed from: c */
    private Task<g> f12448c = null;

    /* loaded from: classes2.dex */
    public static class b<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* renamed from: a */
        private final CountDownLatch f12449a;

        private b() {
            this.f12449a = new CountDownLatch(1);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public boolean a(long j10, TimeUnit timeUnit) {
            return this.f12449a.await(j10, timeUnit);
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.f12449a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            this.f12449a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(TResult tresult) {
            this.f12449a.countDown();
        }
    }

    private f(Executor executor, u uVar) {
        this.f12446a = executor;
        this.f12447b = uVar;
    }

    private static <TResult> TResult c(Task<TResult> task, long j10, TimeUnit timeUnit) {
        b bVar = new b();
        Executor executor = f12445e;
        task.addOnSuccessListener(executor, bVar);
        task.addOnFailureListener(executor, bVar);
        task.addOnCanceledListener(executor, bVar);
        if (!bVar.a(j10, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public static synchronized f h(Executor executor, u uVar) {
        f fVar;
        synchronized (f.class) {
            String b10 = uVar.b();
            Map<String, f> map = f12444d;
            if (!map.containsKey(b10)) {
                map.put(b10, new f(executor, uVar));
            }
            fVar = map.get(b10);
        }
        return fVar;
    }

    public /* synthetic */ Void i(g gVar) {
        return this.f12447b.e(gVar);
    }

    public /* synthetic */ Task j(boolean z10, g gVar, Void r32) {
        if (z10) {
            m(gVar);
        }
        return Tasks.forResult(gVar);
    }

    private synchronized void m(g gVar) {
        this.f12448c = Tasks.forResult(gVar);
    }

    public void d() {
        synchronized (this) {
            this.f12448c = Tasks.forResult(null);
        }
        this.f12447b.a();
    }

    public synchronized Task<g> e() {
        Task<g> task = this.f12448c;
        if (task == null || (task.isComplete() && !this.f12448c.isSuccessful())) {
            Executor executor = this.f12446a;
            u uVar = this.f12447b;
            Objects.requireNonNull(uVar);
            this.f12448c = Tasks.call(executor, new Callable() { // from class: com.google.firebase.remoteconfig.internal.c
                public /* synthetic */ c() {
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return u.this.d();
                }
            });
        }
        return this.f12448c;
    }

    public g f() {
        return g(5L);
    }

    g g(long j10) {
        synchronized (this) {
            Task<g> task = this.f12448c;
            if (task != null && task.isSuccessful()) {
                return this.f12448c.getResult();
            }
            try {
                return (g) c(e(), j10, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e10);
                return null;
            }
        }
    }

    public Task<g> k(g gVar) {
        return l(gVar, true);
    }

    public Task<g> l(g gVar, boolean z10) {
        return Tasks.call(this.f12446a, new Callable() { // from class: com.google.firebase.remoteconfig.internal.d

            /* renamed from: b */
            public final /* synthetic */ g f12440b;

            public /* synthetic */ d(g gVar2) {
                r2 = gVar2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void i10;
                i10 = f.this.i(r2);
                return i10;
            }
        }).onSuccessTask(this.f12446a, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.e

            /* renamed from: b */
            public final /* synthetic */ boolean f12442b;

            /* renamed from: c */
            public final /* synthetic */ g f12443c;

            public /* synthetic */ e(boolean z102, g gVar2) {
                r2 = z102;
                r3 = gVar2;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task j10;
                j10 = f.this.j(r2, r3, (Void) obj);
                return j10;
            }
        });
    }
}
