package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.AbstractC5109i;
import com.google.android.gms.common.api.AbstractC5206p;
import com.google.android.gms.common.api.AbstractC5207q;
import com.google.android.gms.common.api.AbstractC5208r;
import com.google.android.gms.common.api.InterfaceC5201k;
import com.google.android.gms.common.api.InterfaceC5204n;
import com.google.android.gms.common.api.InterfaceC5205o;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5276s;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.s1 */
/* loaded from: classes.dex */
public final class C5178s1<R extends InterfaceC5204n> extends AbstractC5208r<R> implements InterfaceC5205o<R> {

    /* renamed from: g */
    private final WeakReference f10585g;

    /* renamed from: h */
    private final HandlerC5172q1 f10586h;

    /* renamed from: a */
    private AbstractC5207q f10579a = null;

    /* renamed from: b */
    private C5178s1 f10580b = null;

    /* renamed from: c */
    private volatile AbstractC5206p f10581c = null;

    /* renamed from: d */
    private AbstractC5109i f10582d = null;

    /* renamed from: e */
    private final Object f10583e = new Object();

    /* renamed from: f */
    private Status f10584f = null;

    /* renamed from: i */
    private boolean f10587i = false;

    public C5178s1(WeakReference weakReference) {
        C5276s.m13325k(weakReference, "GoogleApiClient reference must not be null");
        this.f10585g = weakReference;
        AbstractC5106f abstractC5106f = (AbstractC5106f) weakReference.get();
        this.f10586h = new HandlerC5172q1(this, abstractC5106f != null ? abstractC5106f.mo12988f() : Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final void m13179k(Status status) {
        synchronized (this.f10583e) {
            this.f10584f = status;
            m13181m(status);
        }
    }

    /* renamed from: l */
    private final void m13180l() {
        if (this.f10579a == null && this.f10581c == null) {
            return;
        }
        AbstractC5106f abstractC5106f = (AbstractC5106f) this.f10585g.get();
        if (!this.f10587i && this.f10579a != null && abstractC5106f != null) {
            abstractC5106f.mo12991i(this);
            this.f10587i = true;
        }
        Status status = this.f10584f;
        if (status != null) {
            m13181m(status);
            return;
        }
        AbstractC5109i abstractC5109i = this.f10582d;
        if (abstractC5109i != null) {
            abstractC5109i.setResultCallback(this);
        }
    }

    /* renamed from: m */
    private final void m13181m(Status status) {
        synchronized (this.f10583e) {
            AbstractC5207q abstractC5207q = this.f10579a;
            if (abstractC5207q != null) {
                ((C5178s1) C5276s.m13324j(this.f10580b)).m13179k((Status) C5276s.m13325k(abstractC5207q.m13217a(status), "onFailure must not return null"));
            } else if (m13182n()) {
                ((AbstractC5206p) C5276s.m13324j(this.f10581c)).m13215b(status);
            }
        }
    }

    /* renamed from: n */
    private final boolean m13182n() {
        return (this.f10581c == null || ((AbstractC5106f) this.f10585g.get()) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m13183o(InterfaceC5204n interfaceC5204n) {
        if (interfaceC5204n instanceof InterfaceC5201k) {
            try {
                ((InterfaceC5201k) interfaceC5204n).release();
            } catch (RuntimeException e10) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(interfaceC5204n)), e10);
            }
        }
    }

    @Override // com.google.android.gms.common.api.InterfaceC5205o
    /* renamed from: a */
    public final void mo13184a(InterfaceC5204n interfaceC5204n) {
        synchronized (this.f10583e) {
            if (!interfaceC5204n.getStatus().m12972y1()) {
                m13179k(interfaceC5204n.getStatus());
                m13183o(interfaceC5204n);
            } else if (this.f10579a != null) {
                C5141h1.m13069a().submit(new RunnableC5169p1(this, interfaceC5204n));
            } else if (m13182n()) {
                ((AbstractC5206p) C5276s.m13324j(this.f10581c)).m13216c(interfaceC5204n);
            }
        }
    }

    /* renamed from: b */
    public final <S extends InterfaceC5204n> AbstractC5208r<S> m13185b(AbstractC5207q<? super R, ? extends S> abstractC5207q) {
        C5178s1 c5178s1;
        synchronized (this.f10583e) {
            boolean z10 = true;
            C5276s.m13329o(this.f10579a == null, "Cannot call then() twice.");
            if (this.f10581c != null) {
                z10 = false;
            }
            C5276s.m13329o(z10, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.f10579a = abstractC5207q;
            c5178s1 = new C5178s1(this.f10585g);
            this.f10580b = c5178s1;
            m13180l();
        }
        return c5178s1;
    }

    /* renamed from: j */
    public final void m13186j(AbstractC5109i abstractC5109i) {
        synchronized (this.f10583e) {
            this.f10582d = abstractC5109i;
            m13180l();
        }
    }
}
