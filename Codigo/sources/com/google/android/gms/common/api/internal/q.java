package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public class q<A extends a.b, L> {

    /* renamed from: a, reason: collision with root package name */
    public final p<A, L> f9450a;

    /* renamed from: b, reason: collision with root package name */
    public final y f9451b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f9452c;

    /* loaded from: classes.dex */
    public static class a<A extends a.b, L> {

        /* renamed from: a, reason: collision with root package name */
        private r f9453a;

        /* renamed from: b, reason: collision with root package name */
        private r f9454b;

        /* renamed from: d, reason: collision with root package name */
        private k f9456d;

        /* renamed from: e, reason: collision with root package name */
        private ca.d[] f9457e;

        /* renamed from: g, reason: collision with root package name */
        private int f9459g;

        /* renamed from: c, reason: collision with root package name */
        private Runnable f9455c = new Runnable() { // from class: com.google.android.gms.common.api.internal.c1
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* renamed from: f, reason: collision with root package name */
        private boolean f9458f = true;

        /* synthetic */ a(f1 f1Var) {
        }

        public q<A, L> a() {
            com.google.android.gms.common.internal.s.b(this.f9453a != null, "Must set register function");
            com.google.android.gms.common.internal.s.b(this.f9454b != null, "Must set unregister function");
            com.google.android.gms.common.internal.s.b(this.f9456d != null, "Must set holder");
            return new q<>(new d1(this, this.f9456d, this.f9457e, this.f9458f, this.f9459g), new e1(this, (k.a) com.google.android.gms.common.internal.s.k(this.f9456d.b(), "Key must not be null")), this.f9455c, null);
        }

        public a<A, L> b(r<A, TaskCompletionSource<Void>> rVar) {
            this.f9453a = rVar;
            return this;
        }

        public a<A, L> c(boolean z10) {
            this.f9458f = z10;
            return this;
        }

        public a<A, L> d(ca.d... dVarArr) {
            this.f9457e = dVarArr;
            return this;
        }

        public a<A, L> e(int i10) {
            this.f9459g = i10;
            return this;
        }

        public a<A, L> f(r<A, TaskCompletionSource<Boolean>> rVar) {
            this.f9454b = rVar;
            return this;
        }

        public a<A, L> g(k<L> kVar) {
            this.f9456d = kVar;
            return this;
        }
    }

    /* synthetic */ q(p pVar, y yVar, Runnable runnable, g1 g1Var) {
        this.f9450a = pVar;
        this.f9451b = yVar;
        this.f9452c = runnable;
    }

    public static <A extends a.b, L> a<A, L> a() {
        return new a<>(null);
    }
}
