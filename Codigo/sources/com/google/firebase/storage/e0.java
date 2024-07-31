package com.google.firebase.storage;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.storage.e0;
import com.google.firebase.storage.e0.a;
import com.google.firebase.storage.l0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class e0<ResultT extends a> extends c<ResultT> {

    /* renamed from: j, reason: collision with root package name */
    private static final HashMap<Integer, HashSet<Integer>> f12585j;

    /* renamed from: k, reason: collision with root package name */
    private static final HashMap<Integer, HashSet<Integer>> f12586k;

    /* renamed from: a, reason: collision with root package name */
    protected final Object f12587a = new Object();

    /* renamed from: b, reason: collision with root package name */
    final l0<OnSuccessListener<? super ResultT>, ResultT> f12588b = new l0<>(this, RecognitionOptions.ITF, new l0.a() { // from class: com.google.firebase.storage.x
        @Override // com.google.firebase.storage.l0.a
        public final void a(Object obj, Object obj2) {
            e0.this.P((OnSuccessListener) obj, (e0.a) obj2);
        }
    });

    /* renamed from: c, reason: collision with root package name */
    final l0<OnFailureListener, ResultT> f12589c = new l0<>(this, 64, new l0.a() { // from class: com.google.firebase.storage.y
        @Override // com.google.firebase.storage.l0.a
        public final void a(Object obj, Object obj2) {
            e0.this.Q((OnFailureListener) obj, (e0.a) obj2);
        }
    });

    /* renamed from: d, reason: collision with root package name */
    final l0<OnCompleteListener<ResultT>, ResultT> f12590d = new l0<>(this, 448, new l0.a() { // from class: com.google.firebase.storage.z
        @Override // com.google.firebase.storage.l0.a
        public final void a(Object obj, Object obj2) {
            e0.this.R((OnCompleteListener) obj, (e0.a) obj2);
        }
    });

    /* renamed from: e, reason: collision with root package name */
    final l0<OnCanceledListener, ResultT> f12591e = new l0<>(this, RecognitionOptions.QR_CODE, new l0.a() { // from class: com.google.firebase.storage.a0
        @Override // com.google.firebase.storage.l0.a
        public final void a(Object obj, Object obj2) {
            e0.this.S((OnCanceledListener) obj, (e0.a) obj2);
        }
    });

    /* renamed from: f, reason: collision with root package name */
    final l0<m<? super ResultT>, ResultT> f12592f = new l0<>(this, -465, new l0.a() { // from class: com.google.firebase.storage.b0
        @Override // com.google.firebase.storage.l0.a
        public final void a(Object obj, Object obj2) {
            ((m) obj).a((e0.a) obj2);
        }
    });

    /* renamed from: g, reason: collision with root package name */
    final l0<l<? super ResultT>, ResultT> f12593g = new l0<>(this, 16, new l0.a() { // from class: com.google.firebase.storage.c0
        @Override // com.google.firebase.storage.l0.a
        public final void a(Object obj, Object obj2) {
            ((l) obj).a((e0.a) obj2);
        }
    });

    /* renamed from: h, reason: collision with root package name */
    private volatile int f12594h = 1;

    /* renamed from: i, reason: collision with root package name */
    private ResultT f12595i;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public interface a {
        Exception a();
    }

    /* loaded from: classes2.dex */
    public class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final Exception f12596a;

        public b(Exception exc) {
            n nVar;
            Status status;
            if (exc != null) {
                this.f12596a = exc;
                return;
            }
            if (e0.this.isCanceled()) {
                status = Status.f9296v;
            } else {
                if (e0.this.B() != 64) {
                    nVar = null;
                    this.f12596a = nVar;
                }
                status = Status.f9294t;
            }
            nVar = n.c(status);
            this.f12596a = nVar;
        }

        @Override // com.google.firebase.storage.e0.a
        public Exception a() {
            return this.f12596a;
        }

        public p b() {
            return c().I();
        }

        public e0<ResultT> c() {
            return e0.this;
        }
    }

    static {
        HashMap<Integer, HashSet<Integer>> hashMap = new HashMap<>();
        f12585j = hashMap;
        HashMap<Integer, HashSet<Integer>> hashMap2 = new HashMap<>();
        f12586k = hashMap2;
        Integer valueOf = Integer.valueOf(RecognitionOptions.QR_CODE);
        hashMap.put(1, new HashSet<>(Arrays.asList(16, valueOf)));
        hashMap.put(2, new HashSet<>(Arrays.asList(8, 32)));
        hashMap.put(4, new HashSet<>(Arrays.asList(8, 32)));
        hashMap.put(16, new HashSet<>(Arrays.asList(2, valueOf)));
        hashMap.put(64, new HashSet<>(Arrays.asList(2, valueOf)));
        hashMap2.put(1, new HashSet<>(Arrays.asList(2, 64)));
        Integer valueOf2 = Integer.valueOf(RecognitionOptions.ITF);
        hashMap2.put(2, new HashSet<>(Arrays.asList(4, 64, valueOf2)));
        hashMap2.put(4, new HashSet<>(Arrays.asList(4, 64, valueOf2)));
        hashMap2.put(8, new HashSet<>(Arrays.asList(16, 64, valueOf2)));
        hashMap2.put(32, new HashSet<>(Arrays.asList(valueOf, 64, valueOf2)));
    }

    private ResultT A() {
        ResultT resultt = this.f12595i;
        if (resultt != null) {
            return resultt;
        }
        if (!isComplete()) {
            return null;
        }
        if (this.f12595i == null) {
            this.f12595i = g0();
        }
        return this.f12595i;
    }

    private String G(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? i10 != 16 ? i10 != 32 ? i10 != 64 ? i10 != 128 ? i10 != 256 ? "Unknown Internal State!" : "INTERNAL_STATE_CANCELED" : "INTERNAL_STATE_SUCCESS" : "INTERNAL_STATE_FAILURE" : "INTERNAL_STATE_CANCELING" : "INTERNAL_STATE_PAUSED" : "INTERNAL_STATE_PAUSING" : "INTERNAL_STATE_IN_PROGRESS" : "INTERNAL_STATE_QUEUED" : "INTERNAL_STATE_NOT_STARTED";
    }

    private String H(int[] iArr) {
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 : iArr) {
            sb2.append(G(i10));
            sb2.append(", ");
        }
        return sb2.substring(0, sb2.length() - 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(Continuation continuation, TaskCompletionSource taskCompletionSource, Task task) {
        try {
            Object then = continuation.then(this);
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            taskCompletionSource.setResult(then);
        } catch (RuntimeExecutionException e10) {
            e = e10;
            if (e.getCause() instanceof Exception) {
                e = (Exception) e.getCause();
            }
            taskCompletionSource.setException(e);
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(Continuation continuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource, Task task) {
        try {
            Task task2 = (Task) continuation.then(this);
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            if (task2 == null) {
                taskCompletionSource.setException(new NullPointerException("Continuation returned null"));
                return;
            }
            task2.addOnSuccessListener(new s(taskCompletionSource));
            task2.addOnFailureListener(new t(taskCompletionSource));
            Objects.requireNonNull(cancellationTokenSource);
            task2.addOnCanceledListener(new u(cancellationTokenSource));
        } catch (RuntimeExecutionException e10) {
            e = e10;
            if (e.getCause() instanceof Exception) {
                e = (Exception) e.getCause();
            }
            taskCompletionSource.setException(e);
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O() {
        try {
            e0();
        } finally {
            z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(OnSuccessListener onSuccessListener, a aVar) {
        f0.b().c(this);
        onSuccessListener.onSuccess(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(OnFailureListener onFailureListener, a aVar) {
        f0.b().c(this);
        onFailureListener.onFailure(aVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(OnCompleteListener onCompleteListener, a aVar) {
        f0.b().c(this);
        onCompleteListener.onComplete(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(OnCanceledListener onCanceledListener, a aVar) {
        f0.b().c(this);
        onCanceledListener.onCanceled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T(SuccessContinuation successContinuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource, a aVar) {
        try {
            Task then = successContinuation.then(aVar);
            Objects.requireNonNull(taskCompletionSource);
            then.addOnSuccessListener(new s(taskCompletionSource));
            then.addOnFailureListener(new t(taskCompletionSource));
            Objects.requireNonNull(cancellationTokenSource);
            then.addOnCanceledListener(new u(cancellationTokenSource));
        } catch (RuntimeExecutionException e10) {
            e = e10;
            if (e.getCause() instanceof Exception) {
                e = (Exception) e.getCause();
            }
            taskCompletionSource.setException(e);
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    private <ContinuationResultT> Task<ContinuationResultT> i0(Executor executor, final SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f12588b.d(null, executor, new OnSuccessListener() { // from class: com.google.firebase.storage.d0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                e0.T(SuccessContinuation.this, taskCompletionSource, cancellationTokenSource, (e0.a) obj);
            }
        });
        return taskCompletionSource.getTask();
    }

    private <ContinuationResultT> Task<ContinuationResultT> x(Executor executor, final Continuation<ResultT, ContinuationResultT> continuation) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12590d.d(null, executor, new OnCompleteListener() { // from class: com.google.firebase.storage.r
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                e0.this.M(continuation, taskCompletionSource, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    private <ContinuationResultT> Task<ContinuationResultT> y(Executor executor, final Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f12590d.d(null, executor, new OnCompleteListener() { // from class: com.google.firebase.storage.w
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                e0.this.N(continuation, taskCompletionSource, cancellationTokenSource, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    private void z() {
        if (isComplete() || L() || B() == 2 || j0(RecognitionOptions.QR_CODE, false)) {
            return;
        }
        j0(64, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int B() {
        return this.f12594h;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public ResultT getResult() {
        if (A() == null) {
            throw new IllegalStateException();
        }
        Exception a10 = A().a();
        if (a10 == null) {
            return A();
        }
        throw new RuntimeExecutionException(a10);
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public <X extends Throwable> ResultT getResult(Class<X> cls) {
        if (A() == null) {
            throw new IllegalStateException();
        }
        if (cls.isInstance(A().a())) {
            throw cls.cast(A().a());
        }
        Exception a10 = A().a();
        if (a10 == null) {
            return A();
        }
        throw new RuntimeExecutionException(a10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Runnable E() {
        return new Runnable() { // from class: com.google.firebase.storage.v
            @Override // java.lang.Runnable
            public final void run() {
                e0.this.O();
            }
        };
    }

    public ResultT F() {
        return g0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract p I();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object J() {
        return this.f12587a;
    }

    public boolean K() {
        return (B() & (-465)) != 0;
    }

    public boolean L() {
        return (B() & 16) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void U() {
    }

    protected void V() {
    }

    protected void W() {
    }

    protected void X() {
    }

    protected void Y() {
    }

    protected void Z() {
    }

    public boolean a0() {
        return k0(new int[]{16, 8}, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b0() {
        if (!j0(2, false)) {
            return false;
        }
        f0();
        return true;
    }

    void c0() {
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> continueWith(Continuation<ResultT, ContinuationResultT> continuation) {
        return x(null, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> continueWith(Executor executor, Continuation<ResultT, ContinuationResultT> continuation) {
        return x(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> continueWithTask(Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        return y(null, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> continueWithTask(Executor executor, Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        return y(executor, continuation);
    }

    public boolean d0() {
        if (!j0(2, true)) {
            return false;
        }
        c0();
        f0();
        return true;
    }

    abstract void e0();

    abstract void f0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public ResultT g0() {
        ResultT h02;
        synchronized (this.f12587a) {
            h02 = h0();
        }
        return h02;
    }

    @Override // com.google.android.gms.tasks.Task
    public Exception getException() {
        if (A() == null) {
            return null;
        }
        return A().a();
    }

    abstract ResultT h0();

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public e0<ResultT> addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        com.google.android.gms.common.internal.s.j(onCanceledListener);
        com.google.android.gms.common.internal.s.j(activity);
        this.f12591e.d(activity, null, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isCanceled() {
        return B() == 256;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isComplete() {
        return (B() & 448) != 0;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isSuccessful() {
        return (B() & RecognitionOptions.ITF) != 0;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public e0<ResultT> addOnCanceledListener(OnCanceledListener onCanceledListener) {
        com.google.android.gms.common.internal.s.j(onCanceledListener);
        this.f12591e.d(null, null, onCanceledListener);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j0(int i10, boolean z10) {
        return k0(new int[]{i10}, z10);
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public e0<ResultT> addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        com.google.android.gms.common.internal.s.j(onCanceledListener);
        com.google.android.gms.common.internal.s.j(executor);
        this.f12591e.d(null, executor, onCanceledListener);
        return this;
    }

    boolean k0(int[] iArr, boolean z10) {
        HashMap<Integer, HashSet<Integer>> hashMap = z10 ? f12585j : f12586k;
        synchronized (this.f12587a) {
            for (int i10 : iArr) {
                HashSet<Integer> hashSet = hashMap.get(Integer.valueOf(B()));
                if (hashSet != null && hashSet.contains(Integer.valueOf(i10))) {
                    this.f12594h = i10;
                    int i11 = this.f12594h;
                    if (i11 == 2) {
                        f0.b().a(this);
                        Y();
                    } else if (i11 == 4) {
                        X();
                    } else if (i11 == 16) {
                        W();
                    } else if (i11 == 64) {
                        V();
                    } else if (i11 == 128) {
                        Z();
                    } else if (i11 == 256) {
                        U();
                    }
                    this.f12588b.h();
                    this.f12589c.h();
                    this.f12591e.h();
                    this.f12590d.h();
                    this.f12593g.h();
                    this.f12592f.h();
                    if (Log.isLoggable("StorageTask", 3)) {
                        Log.d("StorageTask", "changed internal state to: " + G(i10) + " isUser: " + z10 + " from state:" + G(this.f12594h));
                    }
                    return true;
                }
            }
            Log.w("StorageTask", "unable to change internal state to: " + H(iArr) + " isUser: " + z10 + " from state:" + G(this.f12594h));
            return false;
        }
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public e0<ResultT> addOnCompleteListener(Activity activity, OnCompleteListener<ResultT> onCompleteListener) {
        com.google.android.gms.common.internal.s.j(onCompleteListener);
        com.google.android.gms.common.internal.s.j(activity);
        this.f12590d.d(activity, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public e0<ResultT> addOnCompleteListener(OnCompleteListener<ResultT> onCompleteListener) {
        com.google.android.gms.common.internal.s.j(onCompleteListener);
        this.f12590d.d(null, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public e0<ResultT> addOnCompleteListener(Executor executor, OnCompleteListener<ResultT> onCompleteListener) {
        com.google.android.gms.common.internal.s.j(onCompleteListener);
        com.google.android.gms.common.internal.s.j(executor);
        this.f12590d.d(null, executor, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public e0<ResultT> addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        com.google.android.gms.common.internal.s.j(onFailureListener);
        com.google.android.gms.common.internal.s.j(activity);
        this.f12589c.d(activity, null, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> onSuccessTask(SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        return i0(null, successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> onSuccessTask(Executor executor, SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        return i0(executor, successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public e0<ResultT> addOnFailureListener(OnFailureListener onFailureListener) {
        com.google.android.gms.common.internal.s.j(onFailureListener);
        this.f12589c.d(null, null, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public e0<ResultT> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        com.google.android.gms.common.internal.s.j(onFailureListener);
        com.google.android.gms.common.internal.s.j(executor);
        this.f12589c.d(null, executor, onFailureListener);
        return this;
    }

    public e0<ResultT> r(l<? super ResultT> lVar) {
        com.google.android.gms.common.internal.s.j(lVar);
        this.f12593g.d(null, null, lVar);
        return this;
    }

    public e0<ResultT> s(m<? super ResultT> mVar) {
        com.google.android.gms.common.internal.s.j(mVar);
        this.f12592f.d(null, null, mVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public e0<ResultT> addOnSuccessListener(Activity activity, OnSuccessListener<? super ResultT> onSuccessListener) {
        com.google.android.gms.common.internal.s.j(activity);
        com.google.android.gms.common.internal.s.j(onSuccessListener);
        this.f12588b.d(activity, null, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public e0<ResultT> addOnSuccessListener(OnSuccessListener<? super ResultT> onSuccessListener) {
        com.google.android.gms.common.internal.s.j(onSuccessListener);
        this.f12588b.d(null, null, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public e0<ResultT> addOnSuccessListener(Executor executor, OnSuccessListener<? super ResultT> onSuccessListener) {
        com.google.android.gms.common.internal.s.j(executor);
        com.google.android.gms.common.internal.s.j(onSuccessListener);
        this.f12588b.d(null, executor, onSuccessListener);
        return this;
    }

    public boolean w() {
        return k0(new int[]{RecognitionOptions.QR_CODE, 32}, true);
    }
}
