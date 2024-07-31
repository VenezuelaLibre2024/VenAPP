package com.google.android.gms.common.api.internal;

import ca.C1898d;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.C5101a.b;
import com.google.android.gms.common.api.internal.C5151k;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.q */
/* loaded from: classes.dex */
public class C5170q<A extends C5101a.b, L> {

    /* renamed from: a */
    public final AbstractC5167p<A, L> f10564a;

    /* renamed from: b */
    public final AbstractC5194y f10565b;

    /* renamed from: c */
    public final Runnable f10566c;

    /* renamed from: com.google.android.gms.common.api.internal.q$a */
    /* loaded from: classes.dex */
    public static class a<A extends C5101a.b, L> {

        /* renamed from: a */
        private InterfaceC5173r f10567a;

        /* renamed from: b */
        private InterfaceC5173r f10568b;

        /* renamed from: d */
        private C5151k f10570d;

        /* renamed from: e */
        private C1898d[] f10571e;

        /* renamed from: g */
        private int f10573g;

        /* renamed from: c */
        private Runnable f10569c = new Runnable() { // from class: com.google.android.gms.common.api.internal.c1
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* renamed from: f */
        private boolean f10572f = true;

        /* synthetic */ a(C5133f1 c5133f1) {
        }

        /* renamed from: a */
        public C5170q<A, L> m13159a() {
            C5276s.m13316b(this.f10567a != null, "Must set register function");
            C5276s.m13316b(this.f10568b != null, "Must set unregister function");
            C5276s.m13316b(this.f10570d != null, "Must set holder");
            return new C5170q<>(new C5125d1(this, this.f10570d, this.f10571e, this.f10572f, this.f10573g), new C5129e1(this, (C5151k.a) C5276s.m13325k(this.f10570d.m13082b(), "Key must not be null")), this.f10569c, null);
        }

        /* renamed from: b */
        public a<A, L> m13160b(InterfaceC5173r<A, TaskCompletionSource<Void>> interfaceC5173r) {
            this.f10567a = interfaceC5173r;
            return this;
        }

        /* renamed from: c */
        public a<A, L> m13161c(boolean z10) {
            this.f10572f = z10;
            return this;
        }

        /* renamed from: d */
        public a<A, L> m13162d(C1898d... c1898dArr) {
            this.f10571e = c1898dArr;
            return this;
        }

        /* renamed from: e */
        public a<A, L> m13163e(int i10) {
            this.f10573g = i10;
            return this;
        }

        /* renamed from: f */
        public a<A, L> m13164f(InterfaceC5173r<A, TaskCompletionSource<Boolean>> interfaceC5173r) {
            this.f10568b = interfaceC5173r;
            return this;
        }

        /* renamed from: g */
        public a<A, L> m13165g(C5151k<L> c5151k) {
            this.f10570d = c5151k;
            return this;
        }
    }

    /* synthetic */ C5170q(AbstractC5167p abstractC5167p, AbstractC5194y abstractC5194y, Runnable runnable, C5137g1 c5137g1) {
        this.f10564a = abstractC5167p;
        this.f10565b = abstractC5194y;
        this.f10566c = runnable;
    }

    /* renamed from: a */
    public static <A extends C5101a.b, L> a<A, L> m13156a() {
        return new a<>(null);
    }
}
