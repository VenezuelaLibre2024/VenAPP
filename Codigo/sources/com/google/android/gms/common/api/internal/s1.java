package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.n;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class s1<R extends com.google.android.gms.common.api.n> extends com.google.android.gms.common.api.r<R> implements com.google.android.gms.common.api.o<R> {

    /* renamed from: g */
    private final WeakReference f9471g;

    /* renamed from: h */
    private final q1 f9472h;

    /* renamed from: a */
    private com.google.android.gms.common.api.q f9465a = null;

    /* renamed from: b */
    private s1 f9466b = null;

    /* renamed from: c */
    private volatile com.google.android.gms.common.api.p f9467c = null;

    /* renamed from: d */
    private com.google.android.gms.common.api.i f9468d = null;

    /* renamed from: e */
    private final Object f9469e = new Object();

    /* renamed from: f */
    private Status f9470f = null;

    /* renamed from: i */
    private boolean f9473i = false;

    public s1(WeakReference weakReference) {
        com.google.android.gms.common.internal.s.k(weakReference, "GoogleApiClient reference must not be null");
        this.f9471g = weakReference;
        com.google.android.gms.common.api.f fVar = (com.google.android.gms.common.api.f) weakReference.get();
        this.f9472h = new q1(this, fVar != null ? fVar.f() : Looper.getMainLooper());
    }

    public final void k(Status status) {
        synchronized (this.f9469e) {
            this.f9470f = status;
            m(status);
        }
    }

    private final void l() {
        if (this.f9465a == null && this.f9467c == null) {
            return;
        }
        com.google.android.gms.common.api.f fVar = (com.google.android.gms.common.api.f) this.f9471g.get();
        if (!this.f9473i && this.f9465a != null && fVar != null) {
            fVar.i(this);
            this.f9473i = true;
        }
        Status status = this.f9470f;
        if (status != null) {
            m(status);
            return;
        }
        com.google.android.gms.common.api.i iVar = this.f9468d;
        if (iVar != null) {
            iVar.setResultCallback(this);
        }
    }

    private final void m(Status status) {
        synchronized (this.f9469e) {
            com.google.android.gms.common.api.q qVar = this.f9465a;
            if (qVar != null) {
                ((s1) com.google.android.gms.common.internal.s.j(this.f9466b)).k((Status) com.google.android.gms.common.internal.s.k(qVar.a(status), "onFailure must not return null"));
            } else if (n()) {
                ((com.google.android.gms.common.api.p) com.google.android.gms.common.internal.s.j(this.f9467c)).b(status);
            }
        }
    }

    private final boolean n() {
        return (this.f9467c == null || ((com.google.android.gms.common.api.f) this.f9471g.get()) == null) ? false : true;
    }

    public static final void o(com.google.android.gms.common.api.n nVar) {
        if (nVar instanceof com.google.android.gms.common.api.k) {
            try {
                ((com.google.android.gms.common.api.k) nVar).release();
            } catch (RuntimeException e10) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(nVar)), e10);
            }
        }
    }

    @Override // com.google.android.gms.common.api.o
    public final void a(com.google.android.gms.common.api.n nVar) {
        synchronized (this.f9469e) {
            if (!nVar.getStatus().y1()) {
                k(nVar.getStatus());
                o(nVar);
            } else if (this.f9465a != null) {
                h1.a().submit(new p1(this, nVar));
            } else if (n()) {
                ((com.google.android.gms.common.api.p) com.google.android.gms.common.internal.s.j(this.f9467c)).c(nVar);
            }
        }
    }

    public final <S extends com.google.android.gms.common.api.n> com.google.android.gms.common.api.r<S> b(com.google.android.gms.common.api.q<? super R, ? extends S> qVar) {
        s1 s1Var;
        synchronized (this.f9469e) {
            boolean z10 = true;
            com.google.android.gms.common.internal.s.o(this.f9465a == null, "Cannot call then() twice.");
            if (this.f9467c != null) {
                z10 = false;
            }
            com.google.android.gms.common.internal.s.o(z10, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.f9465a = qVar;
            s1Var = new s1(this.f9471g);
            this.f9466b = s1Var;
            l();
        }
        return s1Var;
    }

    public final void j(com.google.android.gms.common.api.i iVar) {
        synchronized (this.f9469e) {
            this.f9468d = iVar;
            l();
        }
    }
}
