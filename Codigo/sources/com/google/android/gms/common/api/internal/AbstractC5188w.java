package com.google.android.gms.common.api.internal;

import ca.C1898d;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.C5101a.b;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.w */
/* loaded from: classes.dex */
public abstract class AbstractC5188w<A extends C5101a.b, ResultT> {

    /* renamed from: a */
    private final C1898d[] f10593a;

    /* renamed from: b */
    private final boolean f10594b;

    /* renamed from: c */
    private final int f10595c;

    /* renamed from: com.google.android.gms.common.api.internal.w$a */
    /* loaded from: classes.dex */
    public static class a<A extends C5101a.b, ResultT> {

        /* renamed from: a */
        private InterfaceC5173r f10596a;

        /* renamed from: c */
        private C1898d[] f10598c;

        /* renamed from: b */
        private boolean f10597b = true;

        /* renamed from: d */
        private int f10599d = 0;

        /* synthetic */ a(C5166o1 c5166o1) {
        }

        /* renamed from: a */
        public AbstractC5188w<A, ResultT> m13195a() {
            C5276s.m13316b(this.f10596a != null, "execute parameter required");
            return new C5163n1(this, this.f10598c, this.f10597b, this.f10599d);
        }

        /* renamed from: b */
        public a<A, ResultT> m13196b(InterfaceC5173r<A, TaskCompletionSource<ResultT>> interfaceC5173r) {
            this.f10596a = interfaceC5173r;
            return this;
        }

        /* renamed from: c */
        public a<A, ResultT> m13197c(boolean z10) {
            this.f10597b = z10;
            return this;
        }

        /* renamed from: d */
        public a<A, ResultT> m13198d(C1898d... c1898dArr) {
            this.f10598c = c1898dArr;
            return this;
        }

        /* renamed from: e */
        public a<A, ResultT> m13199e(int i10) {
            this.f10599d = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5188w(C1898d[] c1898dArr, boolean z10, int i10) {
        this.f10593a = c1898dArr;
        boolean z11 = false;
        if (c1898dArr != null && z10) {
            z11 = true;
        }
        this.f10594b = z11;
        this.f10595c = i10;
    }

    /* renamed from: a */
    public static <A extends C5101a.b, ResultT> a<A, ResultT> m13190a() {
        return new a<>(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo13144b(A a10, TaskCompletionSource<ResultT> taskCompletionSource);

    /* renamed from: c */
    public boolean m13191c() {
        return this.f10594b;
    }

    /* renamed from: d */
    public final int m13192d() {
        return this.f10595c;
    }

    /* renamed from: e */
    public final C1898d[] m13193e() {
        return this.f10593a;
    }
}
