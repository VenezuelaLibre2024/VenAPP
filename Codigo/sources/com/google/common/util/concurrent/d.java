package com.google.common.util.concurrent;

import eb.o;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public final class d extends e {

    /* loaded from: classes2.dex */
    private static final class a<V> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Future<V> f11258a;

        /* renamed from: b, reason: collision with root package name */
        final c<? super V> f11259b;

        a(Future<V> future, c<? super V> cVar) {
            this.f11258a = future;
            this.f11259b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable a10;
            Future<V> future = this.f11258a;
            if ((future instanceof ib.a) && (a10 = ib.b.a((ib.a) future)) != null) {
                this.f11259b.a(a10);
                return;
            }
            try {
                this.f11259b.onSuccess(d.b(this.f11258a));
            } catch (Error e10) {
                e = e10;
                this.f11259b.a(e);
            } catch (RuntimeException e11) {
                e = e11;
                this.f11259b.a(e);
            } catch (ExecutionException e12) {
                this.f11259b.a(e12.getCause());
            }
        }

        public String toString() {
            return eb.i.c(this).k(this.f11259b).toString();
        }
    }

    public static <V> void a(f<V> fVar, c<? super V> cVar, Executor executor) {
        o.o(cVar);
        fVar.addListener(new a(fVar, cVar), executor);
    }

    public static <V> V b(Future<V> future) {
        o.y(future.isDone(), "Future was expected to be done: %s", future);
        return (V) l.a(future);
    }
}
