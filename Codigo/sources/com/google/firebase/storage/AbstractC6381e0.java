package com.google.firebase.storage;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5276s;
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
import com.google.firebase.storage.AbstractC6381e0;
import com.google.firebase.storage.AbstractC6381e0.a;
import com.google.firebase.storage.C6395l0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.storage.e0 */
/* loaded from: classes2.dex */
public abstract class AbstractC6381e0<ResultT extends a> extends AbstractC6376c<ResultT> {

    /* renamed from: j */
    private static final HashMap<Integer, HashSet<Integer>> f13817j;

    /* renamed from: k */
    private static final HashMap<Integer, HashSet<Integer>> f13818k;

    /* renamed from: a */
    protected final Object f13819a = new Object();

    /* renamed from: b */
    final C6395l0<OnSuccessListener<? super ResultT>, ResultT> f13820b = new C6395l0<>(this, RecognitionOptions.ITF, new C6395l0.a() { // from class: com.google.firebase.storage.x
        @Override // com.google.firebase.storage.C6395l0.a
        /* renamed from: a */
        public final void mo17781a(Object obj, Object obj2) {
            AbstractC6381e0.this.m17800P((OnSuccessListener) obj, (AbstractC6381e0.a) obj2);
        }
    });

    /* renamed from: c */
    final C6395l0<OnFailureListener, ResultT> f13821c = new C6395l0<>(this, 64, new C6395l0.a() { // from class: com.google.firebase.storage.y
        @Override // com.google.firebase.storage.C6395l0.a
        /* renamed from: a */
        public final void mo17781a(Object obj, Object obj2) {
            AbstractC6381e0.this.m17801Q((OnFailureListener) obj, (AbstractC6381e0.a) obj2);
        }
    });

    /* renamed from: d */
    final C6395l0<OnCompleteListener<ResultT>, ResultT> f13822d = new C6395l0<>(this, 448, new C6395l0.a() { // from class: com.google.firebase.storage.z
        @Override // com.google.firebase.storage.C6395l0.a
        /* renamed from: a */
        public final void mo17781a(Object obj, Object obj2) {
            AbstractC6381e0.this.m17802R((OnCompleteListener) obj, (AbstractC6381e0.a) obj2);
        }
    });

    /* renamed from: e */
    final C6395l0<OnCanceledListener, ResultT> f13823e = new C6395l0<>(this, RecognitionOptions.QR_CODE, new C6395l0.a() { // from class: com.google.firebase.storage.a0
        @Override // com.google.firebase.storage.C6395l0.a
        /* renamed from: a */
        public final void mo17781a(Object obj, Object obj2) {
            AbstractC6381e0.this.m17803S((OnCanceledListener) obj, (AbstractC6381e0.a) obj2);
        }
    });

    /* renamed from: f */
    final C6395l0<InterfaceC6396m<? super ResultT>, ResultT> f13824f = new C6395l0<>(this, -465, new C6395l0.a() { // from class: com.google.firebase.storage.b0
        @Override // com.google.firebase.storage.C6395l0.a
        /* renamed from: a */
        public final void mo17781a(Object obj, Object obj2) {
            ((InterfaceC6396m) obj).mo17915a((AbstractC6381e0.a) obj2);
        }
    });

    /* renamed from: g */
    final C6395l0<InterfaceC6394l<? super ResultT>, ResultT> f13825g = new C6395l0<>(this, 16, new C6395l0.a() { // from class: com.google.firebase.storage.c0
        @Override // com.google.firebase.storage.C6395l0.a
        /* renamed from: a */
        public final void mo17781a(Object obj, Object obj2) {
            ((InterfaceC6394l) obj).mo17905a((AbstractC6381e0.a) obj2);
        }
    });

    /* renamed from: h */
    private volatile int f13826h = 1;

    /* renamed from: i */
    private ResultT f13827i;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.firebase.storage.e0$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        Exception mo17852a();
    }

    /* renamed from: com.google.firebase.storage.e0$b */
    /* loaded from: classes2.dex */
    public class b implements a {

        /* renamed from: a */
        private final Exception f13828a;

        public b(Exception exc) {
            C6398n c6398n;
            Status status;
            if (exc != null) {
                this.f13828a = exc;
                return;
            }
            if (AbstractC6381e0.this.isCanceled()) {
                status = Status.f10404v;
            } else {
                if (AbstractC6381e0.this.m17817B() != 64) {
                    c6398n = null;
                    this.f13828a = c6398n;
                }
                status = Status.f10402t;
            }
            c6398n = C6398n.m17918c(status);
            this.f13828a = c6398n;
        }

        @Override // com.google.firebase.storage.AbstractC6381e0.a
        /* renamed from: a */
        public Exception mo17852a() {
            return this.f13828a;
        }

        /* renamed from: b */
        public C6401p m17853b() {
            return m17854c().mo17785I();
        }

        /* renamed from: c */
        public AbstractC6381e0<ResultT> m17854c() {
            return AbstractC6381e0.this;
        }
    }

    static {
        HashMap<Integer, HashSet<Integer>> hashMap = new HashMap<>();
        f13817j = hashMap;
        HashMap<Integer, HashSet<Integer>> hashMap2 = new HashMap<>();
        f13818k = hashMap2;
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

    /* renamed from: A */
    private ResultT m17794A() {
        ResultT resultt = this.f13827i;
        if (resultt != null) {
            return resultt;
        }
        if (!isComplete()) {
            return null;
        }
        if (this.f13827i == null) {
            this.f13827i = m17834g0();
        }
        return this.f13827i;
    }

    /* renamed from: G */
    private String m17795G(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? i10 != 16 ? i10 != 32 ? i10 != 64 ? i10 != 128 ? i10 != 256 ? "Unknown Internal State!" : "INTERNAL_STATE_CANCELED" : "INTERNAL_STATE_SUCCESS" : "INTERNAL_STATE_FAILURE" : "INTERNAL_STATE_CANCELING" : "INTERNAL_STATE_PAUSED" : "INTERNAL_STATE_PAUSING" : "INTERNAL_STATE_IN_PROGRESS" : "INTERNAL_STATE_QUEUED" : "INTERNAL_STATE_NOT_STARTED";
    }

    /* renamed from: H */
    private String m17796H(int[] iArr) {
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 : iArr) {
            sb2.append(m17795G(i10));
            sb2.append(", ");
        }
        return sb2.substring(0, sb2.length() - 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m17797M(Continuation continuation, TaskCompletionSource taskCompletionSource, Task task) {
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
    /* renamed from: N */
    public /* synthetic */ void m17798N(Continuation continuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource, Task task) {
        try {
            Task task2 = (Task) continuation.then(this);
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            if (task2 == null) {
                taskCompletionSource.setException(new NullPointerException("Continuation returned null"));
                return;
            }
            task2.addOnSuccessListener(new C6404s(taskCompletionSource));
            task2.addOnFailureListener(new C6405t(taskCompletionSource));
            Objects.requireNonNull(cancellationTokenSource);
            task2.addOnCanceledListener(new C6406u(cancellationTokenSource));
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
    /* renamed from: O */
    public /* synthetic */ void m17799O() {
        try {
            mo17787e0();
        } finally {
            m17816z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m17800P(OnSuccessListener onSuccessListener, a aVar) {
        C6383f0.m17874b().m17876c(this);
        onSuccessListener.onSuccess(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m17801Q(OnFailureListener onFailureListener, a aVar) {
        C6383f0.m17874b().m17876c(this);
        onFailureListener.onFailure(aVar.mo17852a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m17802R(OnCompleteListener onCompleteListener, a aVar) {
        C6383f0.m17874b().m17876c(this);
        onCompleteListener.onComplete(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m17803S(OnCanceledListener onCanceledListener, a aVar) {
        C6383f0.m17874b().m17876c(this);
        onCanceledListener.onCanceled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public static /* synthetic */ void m17804T(SuccessContinuation successContinuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource, a aVar) {
        try {
            Task then = successContinuation.then(aVar);
            Objects.requireNonNull(taskCompletionSource);
            then.addOnSuccessListener(new C6404s(taskCompletionSource));
            then.addOnFailureListener(new C6405t(taskCompletionSource));
            Objects.requireNonNull(cancellationTokenSource);
            then.addOnCanceledListener(new C6406u(cancellationTokenSource));
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

    /* renamed from: i0 */
    private <ContinuationResultT> Task<ContinuationResultT> m17813i0(Executor executor, final SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f13820b.m17912d(null, executor, new OnSuccessListener() { // from class: com.google.firebase.storage.d0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                AbstractC6381e0.m17804T(SuccessContinuation.this, taskCompletionSource, cancellationTokenSource, (AbstractC6381e0.a) obj);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: x */
    private <ContinuationResultT> Task<ContinuationResultT> m17814x(Executor executor, final Continuation<ResultT, ContinuationResultT> continuation) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f13822d.m17912d(null, executor, new OnCompleteListener() { // from class: com.google.firebase.storage.r
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                AbstractC6381e0.this.m17797M(continuation, taskCompletionSource, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: y */
    private <ContinuationResultT> Task<ContinuationResultT> m17815y(Executor executor, final Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f13822d.m17912d(null, executor, new OnCompleteListener() { // from class: com.google.firebase.storage.w
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                AbstractC6381e0.this.m17798N(continuation, taskCompletionSource, cancellationTokenSource, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: z */
    private void m17816z() {
        if (isComplete() || m17824L() || m17817B() == 2 || m17837j0(RecognitionOptions.QR_CODE, false)) {
            return;
        }
        m17837j0(64, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public int m17817B() {
        return this.f13826h;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public ResultT getResult() {
        if (m17794A() == null) {
            throw new IllegalStateException();
        }
        Exception mo17852a = m17794A().mo17852a();
        if (mo17852a == null) {
            return m17794A();
        }
        throw new RuntimeExecutionException(mo17852a);
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public <X extends Throwable> ResultT getResult(Class<X> cls) {
        if (m17794A() == null) {
            throw new IllegalStateException();
        }
        if (cls.isInstance(m17794A().mo17852a())) {
            throw cls.cast(m17794A().mo17852a());
        }
        Exception mo17852a = m17794A().mo17852a();
        if (mo17852a == null) {
            return m17794A();
        }
        throw new RuntimeExecutionException(mo17852a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public Runnable m17820E() {
        return new Runnable() { // from class: com.google.firebase.storage.v
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC6381e0.this.m17799O();
            }
        };
    }

    /* renamed from: F */
    public ResultT m17821F() {
        return m17834g0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public abstract C6401p mo17785I();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public Object m17822J() {
        return this.f13819a;
    }

    /* renamed from: K */
    public boolean m17823K() {
        return (m17817B() & (-465)) != 0;
    }

    /* renamed from: L */
    public boolean m17824L() {
        return (m17817B() & 16) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U */
    public void mo17786U() {
    }

    /* renamed from: V */
    protected void m17825V() {
    }

    /* renamed from: W */
    protected void m17826W() {
    }

    /* renamed from: X */
    protected void mo17827X() {
    }

    /* renamed from: Y */
    protected void m17828Y() {
    }

    /* renamed from: Z */
    protected void m17829Z() {
    }

    /* renamed from: a0 */
    public boolean mo17830a0() {
        return m17839k0(new int[]{16, 8}, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public boolean m17831b0() {
        if (!m17837j0(2, false)) {
            return false;
        }
        mo17788f0();
        return true;
    }

    /* renamed from: c0 */
    void mo17832c0() {
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> continueWith(Continuation<ResultT, ContinuationResultT> continuation) {
        return m17814x(null, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> continueWith(Executor executor, Continuation<ResultT, ContinuationResultT> continuation) {
        return m17814x(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> continueWithTask(Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        return m17815y(null, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> continueWithTask(Executor executor, Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        return m17815y(executor, continuation);
    }

    /* renamed from: d0 */
    public boolean mo17833d0() {
        if (!m17837j0(2, true)) {
            return false;
        }
        mo17832c0();
        mo17788f0();
        return true;
    }

    /* renamed from: e0 */
    abstract void mo17787e0();

    /* renamed from: f0 */
    abstract void mo17788f0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public ResultT m17834g0() {
        ResultT mo17789h0;
        synchronized (this.f13819a) {
            mo17789h0 = mo17789h0();
        }
        return mo17789h0;
    }

    @Override // com.google.android.gms.tasks.Task
    public Exception getException() {
        if (m17794A() == null) {
            return null;
        }
        return m17794A().mo17852a();
    }

    /* renamed from: h0 */
    abstract ResultT mo17789h0();

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC6381e0<ResultT> addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        C5276s.m13324j(onCanceledListener);
        C5276s.m13324j(activity);
        this.f13823e.m17912d(activity, null, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isCanceled() {
        return m17817B() == 256;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isComplete() {
        return (m17817B() & 448) != 0;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isSuccessful() {
        return (m17817B() & RecognitionOptions.ITF) != 0;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC6381e0<ResultT> addOnCanceledListener(OnCanceledListener onCanceledListener) {
        C5276s.m13324j(onCanceledListener);
        this.f13823e.m17912d(null, null, onCanceledListener);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j0 */
    public boolean m17837j0(int i10, boolean z10) {
        return m17839k0(new int[]{i10}, z10);
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC6381e0<ResultT> addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        C5276s.m13324j(onCanceledListener);
        C5276s.m13324j(executor);
        this.f13823e.m17912d(null, executor, onCanceledListener);
        return this;
    }

    /* renamed from: k0 */
    boolean m17839k0(int[] iArr, boolean z10) {
        HashMap<Integer, HashSet<Integer>> hashMap = z10 ? f13817j : f13818k;
        synchronized (this.f13819a) {
            for (int i10 : iArr) {
                HashSet<Integer> hashSet = hashMap.get(Integer.valueOf(m17817B()));
                if (hashSet != null && hashSet.contains(Integer.valueOf(i10))) {
                    this.f13826h = i10;
                    int i11 = this.f13826h;
                    if (i11 == 2) {
                        C6383f0.m17874b().m17875a(this);
                        m17828Y();
                    } else if (i11 == 4) {
                        mo17827X();
                    } else if (i11 == 16) {
                        m17826W();
                    } else if (i11 == 64) {
                        m17825V();
                    } else if (i11 == 128) {
                        m17829Z();
                    } else if (i11 == 256) {
                        mo17786U();
                    }
                    this.f13820b.m17913h();
                    this.f13821c.m17913h();
                    this.f13823e.m17913h();
                    this.f13822d.m17913h();
                    this.f13825g.m17913h();
                    this.f13824f.m17913h();
                    if (Log.isLoggable("StorageTask", 3)) {
                        Log.d("StorageTask", "changed internal state to: " + m17795G(i10) + " isUser: " + z10 + " from state:" + m17795G(this.f13826h));
                    }
                    return true;
                }
            }
            Log.w("StorageTask", "unable to change internal state to: " + m17796H(iArr) + " isUser: " + z10 + " from state:" + m17795G(this.f13826h));
            return false;
        }
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC6381e0<ResultT> addOnCompleteListener(Activity activity, OnCompleteListener<ResultT> onCompleteListener) {
        C5276s.m13324j(onCompleteListener);
        C5276s.m13324j(activity);
        this.f13822d.m17912d(activity, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC6381e0<ResultT> addOnCompleteListener(OnCompleteListener<ResultT> onCompleteListener) {
        C5276s.m13324j(onCompleteListener);
        this.f13822d.m17912d(null, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC6381e0<ResultT> addOnCompleteListener(Executor executor, OnCompleteListener<ResultT> onCompleteListener) {
        C5276s.m13324j(onCompleteListener);
        C5276s.m13324j(executor);
        this.f13822d.m17912d(null, executor, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC6381e0<ResultT> addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        C5276s.m13324j(onFailureListener);
        C5276s.m13324j(activity);
        this.f13821c.m17912d(activity, null, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> onSuccessTask(SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        return m17813i0(null, successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> onSuccessTask(Executor executor, SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        return m17813i0(executor, successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC6381e0<ResultT> addOnFailureListener(OnFailureListener onFailureListener) {
        C5276s.m13324j(onFailureListener);
        this.f13821c.m17912d(null, null, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC6381e0<ResultT> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        C5276s.m13324j(onFailureListener);
        C5276s.m13324j(executor);
        this.f13821c.m17912d(null, executor, onFailureListener);
        return this;
    }

    /* renamed from: r */
    public AbstractC6381e0<ResultT> m17846r(InterfaceC6394l<? super ResultT> interfaceC6394l) {
        C5276s.m13324j(interfaceC6394l);
        this.f13825g.m17912d(null, null, interfaceC6394l);
        return this;
    }

    /* renamed from: s */
    public AbstractC6381e0<ResultT> m17847s(InterfaceC6396m<? super ResultT> interfaceC6396m) {
        C5276s.m13324j(interfaceC6396m);
        this.f13824f.m17912d(null, null, interfaceC6396m);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public AbstractC6381e0<ResultT> addOnSuccessListener(Activity activity, OnSuccessListener<? super ResultT> onSuccessListener) {
        C5276s.m13324j(activity);
        C5276s.m13324j(onSuccessListener);
        this.f13820b.m17912d(activity, null, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public AbstractC6381e0<ResultT> addOnSuccessListener(OnSuccessListener<? super ResultT> onSuccessListener) {
        C5276s.m13324j(onSuccessListener);
        this.f13820b.m17912d(null, null, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public AbstractC6381e0<ResultT> addOnSuccessListener(Executor executor, OnSuccessListener<? super ResultT> onSuccessListener) {
        C5276s.m13324j(executor);
        C5276s.m13324j(onSuccessListener);
        this.f13820b.m17912d(null, executor, onSuccessListener);
        return this;
    }

    /* renamed from: w */
    public boolean m17851w() {
        return m17839k0(new int[]{RecognitionOptions.QR_CODE, 32}, true);
    }
}
