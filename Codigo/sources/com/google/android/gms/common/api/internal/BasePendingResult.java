package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.n;
import com.google.android.gms.internal.base.zau;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.n> extends com.google.android.gms.common.api.i<R> {
    static final ThreadLocal zaa = new e2();
    public static final /* synthetic */ int zad = 0;

    @KeepName
    private g2 mResultGuardian;
    protected final a zab;
    protected final WeakReference zac;
    private final Object zae;
    private final CountDownLatch zaf;
    private final ArrayList zag;
    private com.google.android.gms.common.api.o zah;
    private final AtomicReference zai;
    private com.google.android.gms.common.api.n zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private com.google.android.gms.common.internal.l zao;
    private volatile s1 zap;
    private boolean zaq;

    /* loaded from: classes.dex */
    public static class a<R extends com.google.android.gms.common.api.n> extends zau {
        public a() {
            super(Looper.getMainLooper());
        }

        public a(Looper looper) {
            super(looper);
        }

        public final void a(com.google.android.gms.common.api.o oVar, com.google.android.gms.common.api.n nVar) {
            int i10 = BasePendingResult.zad;
            sendMessage(obtainMessage(1, new Pair((com.google.android.gms.common.api.o) com.google.android.gms.common.internal.s.j(oVar), nVar)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                com.google.android.gms.common.api.o oVar = (com.google.android.gms.common.api.o) pair.first;
                com.google.android.gms.common.api.n nVar = (com.google.android.gms.common.api.n) pair.second;
                try {
                    oVar.a(nVar);
                    return;
                } catch (RuntimeException e10) {
                    BasePendingResult.zal(nVar);
                    throw e10;
                }
            }
            if (i10 == 2) {
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f9295u);
                return;
            }
            Log.wtf("BasePendingResult", "Don't know how to handle message: " + i10, new Exception());
        }
    }

    @Deprecated
    BasePendingResult() {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(Looper.getMainLooper());
        this.zac = new WeakReference(null);
    }

    @Deprecated
    protected BasePendingResult(Looper looper) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(looper);
        this.zac = new WeakReference(null);
    }

    public BasePendingResult(com.google.android.gms.common.api.f fVar) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(fVar != null ? fVar.f() : Looper.getMainLooper());
        this.zac = new WeakReference(fVar);
    }

    public BasePendingResult(a<R> aVar) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = (a) com.google.android.gms.common.internal.s.k(aVar, "CallbackHandler must not be null");
        this.zac = new WeakReference(null);
    }

    private final com.google.android.gms.common.api.n zaa() {
        com.google.android.gms.common.api.n nVar;
        synchronized (this.zae) {
            com.google.android.gms.common.internal.s.o(!this.zal, "Result has already been consumed.");
            com.google.android.gms.common.internal.s.o(isReady(), "Result is not ready.");
            nVar = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (((t1) this.zai.getAndSet(null)) == null) {
            return (com.google.android.gms.common.api.n) com.google.android.gms.common.internal.s.j(nVar);
        }
        throw null;
    }

    private final void zab(com.google.android.gms.common.api.n nVar) {
        this.zaj = nVar;
        this.zak = nVar.getStatus();
        this.zao = null;
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            com.google.android.gms.common.api.o oVar = this.zah;
            if (oVar != null) {
                this.zab.removeMessages(2);
                this.zab.a(oVar, zaa());
            } else if (this.zaj instanceof com.google.android.gms.common.api.k) {
                this.mResultGuardian = new g2(this, null);
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((i.a) arrayList.get(i10)).a(this.zak);
        }
        this.zag.clear();
    }

    public static void zal(com.google.android.gms.common.api.n nVar) {
        if (nVar instanceof com.google.android.gms.common.api.k) {
            try {
                ((com.google.android.gms.common.api.k) nVar).release();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(nVar)), e10);
            }
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void addStatusListener(i.a aVar) {
        com.google.android.gms.common.internal.s.b(aVar != null, "Callback cannot be null.");
        synchronized (this.zae) {
            if (isReady()) {
                aVar.a(this.zak);
            } else {
                this.zag.add(aVar);
            }
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final R await() {
        com.google.android.gms.common.internal.s.i("await must not be called on the UI thread");
        com.google.android.gms.common.internal.s.o(!this.zal, "Result has already been consumed");
        com.google.android.gms.common.internal.s.o(this.zap == null, "Cannot await if then() has been called.");
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f9293s);
        }
        com.google.android.gms.common.internal.s.o(isReady(), "Result is not ready.");
        return (R) zaa();
    }

    @Override // com.google.android.gms.common.api.i
    public final R await(long j10, TimeUnit timeUnit) {
        if (j10 > 0) {
            com.google.android.gms.common.internal.s.i("await must not be called on the UI thread when time is greater than zero.");
        }
        com.google.android.gms.common.internal.s.o(!this.zal, "Result has already been consumed.");
        com.google.android.gms.common.internal.s.o(this.zap == null, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(j10, timeUnit)) {
                forceFailureUnlessReady(Status.f9295u);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f9293s);
        }
        com.google.android.gms.common.internal.s.o(isReady(), "Result is not ready.");
        return (R) zaa();
    }

    @Override // com.google.android.gms.common.api.i
    public void cancel() {
        synchronized (this.zae) {
            if (!this.zam && !this.zal) {
                com.google.android.gms.common.internal.l lVar = this.zao;
                if (lVar != null) {
                    try {
                        lVar.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                zal(this.zaj);
                this.zam = true;
                zab(createFailedResult(Status.f9296v));
            }
        }
    }

    public abstract R createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zan = true;
            }
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final boolean isCanceled() {
        boolean z10;
        synchronized (this.zae) {
            z10 = this.zam;
        }
        return z10;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    protected final void setCancelToken(com.google.android.gms.common.internal.l lVar) {
        synchronized (this.zae) {
            this.zao = lVar;
        }
    }

    public final void setResult(R r10) {
        synchronized (this.zae) {
            if (this.zan || this.zam) {
                zal(r10);
                return;
            }
            isReady();
            com.google.android.gms.common.internal.s.o(!isReady(), "Results have already been set");
            com.google.android.gms.common.internal.s.o(!this.zal, "Result has already been consumed");
            zab(r10);
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void setResultCallback(com.google.android.gms.common.api.o<? super R> oVar) {
        synchronized (this.zae) {
            if (oVar == null) {
                this.zah = null;
                return;
            }
            boolean z10 = true;
            com.google.android.gms.common.internal.s.o(!this.zal, "Result has already been consumed.");
            if (this.zap != null) {
                z10 = false;
            }
            com.google.android.gms.common.internal.s.o(z10, "Cannot set callbacks if then() has been called.");
            if (isCanceled()) {
                return;
            }
            if (isReady()) {
                this.zab.a(oVar, zaa());
            } else {
                this.zah = oVar;
            }
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void setResultCallback(com.google.android.gms.common.api.o<? super R> oVar, long j10, TimeUnit timeUnit) {
        synchronized (this.zae) {
            if (oVar == null) {
                this.zah = null;
                return;
            }
            boolean z10 = true;
            com.google.android.gms.common.internal.s.o(!this.zal, "Result has already been consumed.");
            if (this.zap != null) {
                z10 = false;
            }
            com.google.android.gms.common.internal.s.o(z10, "Cannot set callbacks if then() has been called.");
            if (isCanceled()) {
                return;
            }
            if (isReady()) {
                this.zab.a(oVar, zaa());
            } else {
                this.zah = oVar;
                a aVar = this.zab;
                aVar.sendMessageDelayed(aVar.obtainMessage(2, this), timeUnit.toMillis(j10));
            }
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final <S extends com.google.android.gms.common.api.n> com.google.android.gms.common.api.r<S> then(com.google.android.gms.common.api.q<? super R, ? extends S> qVar) {
        com.google.android.gms.common.api.r<S> b10;
        com.google.android.gms.common.internal.s.o(!this.zal, "Result has already been consumed.");
        synchronized (this.zae) {
            com.google.android.gms.common.internal.s.o(this.zap == null, "Cannot call then() twice.");
            com.google.android.gms.common.internal.s.o(this.zah == null, "Cannot call then() if callbacks are set.");
            com.google.android.gms.common.internal.s.o(!this.zam, "Cannot call then() if result was canceled.");
            this.zaq = true;
            this.zap = new s1(this.zac);
            b10 = this.zap.b(qVar);
            if (isReady()) {
                this.zab.a(this.zap, zaa());
            } else {
                this.zah = this.zap;
            }
        }
        return b10;
    }

    public final void zak() {
        boolean z10 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z10 = false;
        }
        this.zaq = z10;
    }

    public final boolean zam() {
        boolean isCanceled;
        synchronized (this.zae) {
            if (((com.google.android.gms.common.api.f) this.zac.get()) == null || !this.zaq) {
                cancel();
            }
            isCanceled = isCanceled();
        }
        return isCanceled;
    }

    public final void zan(t1 t1Var) {
        this.zai.set(t1Var);
    }
}
