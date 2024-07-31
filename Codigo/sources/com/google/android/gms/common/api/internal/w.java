package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public abstract class w<A extends a.b, ResultT> {

    /* renamed from: a */
    private final ca.d[] f9479a;

    /* renamed from: b */
    private final boolean f9480b;

    /* renamed from: c */
    private final int f9481c;

    /* loaded from: classes.dex */
    public static class a<A extends a.b, ResultT> {

        /* renamed from: a */
        private r f9482a;

        /* renamed from: c */
        private ca.d[] f9484c;

        /* renamed from: b */
        private boolean f9483b = true;

        /* renamed from: d */
        private int f9485d = 0;

        /* synthetic */ a(o1 o1Var) {
        }

        public w<A, ResultT> a() {
            com.google.android.gms.common.internal.s.b(this.f9482a != null, "execute parameter required");
            return new n1(this, this.f9484c, this.f9483b, this.f9485d);
        }

        public a<A, ResultT> b(r<A, TaskCompletionSource<ResultT>> rVar) {
            this.f9482a = rVar;
            return this;
        }

        public a<A, ResultT> c(boolean z10) {
            this.f9483b = z10;
            return this;
        }

        public a<A, ResultT> d(ca.d... dVarArr) {
            this.f9484c = dVarArr;
            return this;
        }

        public a<A, ResultT> e(int i10) {
            this.f9485d = i10;
            return this;
        }
    }

    public w(ca.d[] dVarArr, boolean z10, int i10) {
        this.f9479a = dVarArr;
        boolean z11 = false;
        if (dVarArr != null && z10) {
            z11 = true;
        }
        this.f9480b = z11;
        this.f9481c = i10;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    public abstract void b(A a10, TaskCompletionSource<ResultT> taskCompletionSource);

    public boolean c() {
        return this.f9480b;
    }

    public final int d() {
        return this.f9481c;
    }

    public final ca.d[] e() {
        return this.f9479a;
    }
}
