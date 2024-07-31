package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p082eb.C7153i;
import p082eb.C7159o;
import p159ib.AbstractC7955a;
import p159ib.C7956b;

/* renamed from: com.google.common.util.concurrent.d */
/* loaded from: classes2.dex */
public final class C5918d extends AbstractC5919e {

    /* renamed from: com.google.common.util.concurrent.d$a */
    /* loaded from: classes2.dex */
    private static final class a<V> implements Runnable {

        /* renamed from: a */
        final Future<V> f12473a;

        /* renamed from: b */
        final InterfaceC5917c<? super V> f12474b;

        a(Future<V> future, InterfaceC5917c<? super V> interfaceC5917c) {
            this.f12473a = future;
            this.f12474b = interfaceC5917c;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable m24441a;
            Future<V> future = this.f12473a;
            if ((future instanceof AbstractC7955a) && (m24441a = C7956b.m24441a((AbstractC7955a) future)) != null) {
                this.f12474b.mo14082a(m24441a);
                return;
            }
            try {
                this.f12474b.onSuccess(C5918d.m15177b(this.f12473a));
            } catch (Error e10) {
                e = e10;
                this.f12474b.mo14082a(e);
            } catch (RuntimeException e11) {
                e = e11;
                this.f12474b.mo14082a(e);
            } catch (ExecutionException e12) {
                this.f12474b.mo14082a(e12.getCause());
            }
        }

        public String toString() {
            return C7153i.m21274c(this).m21286k(this.f12474b).toString();
        }
    }

    /* renamed from: a */
    public static <V> void m15176a(InterfaceFutureC5920f<V> interfaceFutureC5920f, InterfaceC5917c<? super V> interfaceC5917c, Executor executor) {
        C7159o.m21312o(interfaceC5917c);
        interfaceFutureC5920f.addListener(new a(interfaceFutureC5920f, interfaceC5917c), executor);
    }

    /* renamed from: b */
    public static <V> V m15177b(Future<V> future) {
        C7159o.m21322y(future.isDone(), "Future was expected to be done: %s", future);
        return (V) C5926l.m15188a(future);
    }
}
