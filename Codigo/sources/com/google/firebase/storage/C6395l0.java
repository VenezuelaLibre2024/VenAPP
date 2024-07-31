package com.google.firebase.storage;

import android.app.Activity;
import com.google.android.gms.common.internal.C5276s;
import com.google.firebase.storage.AbstractC6381e0;
import com.google.firebase.storage.AbstractC6381e0.a;
import gf.C7559a;
import gf.C7565g;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.storage.l0 */
/* loaded from: classes2.dex */
public class C6395l0<ListenerTypeT, ResultT extends AbstractC6381e0.a> {

    /* renamed from: a */
    private final Queue<ListenerTypeT> f13897a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    private final HashMap<ListenerTypeT, C7565g> f13898b = new HashMap<>();

    /* renamed from: c */
    private AbstractC6381e0<ResultT> f13899c;

    /* renamed from: d */
    private int f13900d;

    /* renamed from: e */
    private a<ListenerTypeT, ResultT> f13901e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.storage.l0$a */
    /* loaded from: classes2.dex */
    public interface a<ListenerTypeT, ResultT> {
        /* renamed from: a */
        void mo17781a(ListenerTypeT listenertypet, ResultT resultt);
    }

    public C6395l0(AbstractC6381e0<ResultT> abstractC6381e0, int i10, a<ListenerTypeT, ResultT> aVar) {
        this.f13899c = abstractC6381e0;
        this.f13900d = i10;
        this.f13901e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m17910f(Object obj, AbstractC6381e0.a aVar) {
        this.f13901e.mo17781a(obj, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m17911g(Object obj, AbstractC6381e0.a aVar) {
        this.f13901e.mo17781a(obj, aVar);
    }

    /* renamed from: d */
    public void m17912d(Activity activity, Executor executor, final ListenerTypeT listenertypet) {
        boolean z10;
        C7565g c7565g;
        C5276s.m13324j(listenertypet);
        synchronized (this.f13899c.m17822J()) {
            boolean z11 = true;
            z10 = (this.f13899c.m17817B() & this.f13900d) != 0;
            this.f13897a.add(listenertypet);
            c7565g = new C7565g(executor);
            this.f13898b.put(listenertypet, c7565g);
            if (activity != null) {
                if (activity.isDestroyed()) {
                    z11 = false;
                }
                C5276s.m13316b(z11, "Activity is already destroyed!");
                C7559a.m22940a().m22942c(activity, listenertypet, new Runnable() { // from class: com.google.firebase.storage.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6395l0.this.m17909e(listenertypet);
                    }
                });
            }
        }
        if (z10) {
            final ResultT m17834g0 = this.f13899c.m17834g0();
            c7565g.m22965a(new Runnable() { // from class: com.google.firebase.storage.k0
                @Override // java.lang.Runnable
                public final void run() {
                    C6395l0.this.m17910f(listenertypet, m17834g0);
                }
            });
        }
    }

    /* renamed from: h */
    public void m17913h() {
        if ((this.f13899c.m17817B() & this.f13900d) != 0) {
            final ResultT m17834g0 = this.f13899c.m17834g0();
            for (final ListenerTypeT listenertypet : this.f13897a) {
                C7565g c7565g = this.f13898b.get(listenertypet);
                if (c7565g != null) {
                    c7565g.m22965a(new Runnable() { // from class: com.google.firebase.storage.i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6395l0.this.m17911g(listenertypet, m17834g0);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m17909e(ListenerTypeT listenertypet) {
        C5276s.m13324j(listenertypet);
        synchronized (this.f13899c.m17822J()) {
            this.f13898b.remove(listenertypet);
            this.f13897a.remove(listenertypet);
            C7559a.m22940a().m22941b(listenertypet);
        }
    }
}
