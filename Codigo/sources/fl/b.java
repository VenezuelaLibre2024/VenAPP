package fl;

import ck.n;
import ck.o;
import el.d0;
import el.l0;
import gk.Continuation;
import gk.f;
import hk.d;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.b0;
import ok.p;
import zk.a0;
import zk.e2;
import zk.v2;

/* loaded from: classes3.dex */
public final class b {
    public static final <R, T> void a(p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r10, Continuation<? super T> continuation) {
        Object a10;
        Object c10;
        Continuation a11 = h.a(continuation);
        try {
            f context = continuation.getContext();
            Object c11 = l0.c(context, null);
            try {
                a10 = ((p) b0.c(pVar, 2)).invoke(r10, a11);
                c10 = d.c();
                if (a10 == c10) {
                    return;
                }
            } finally {
                l0.a(context, c11);
            }
        } catch (Throwable th2) {
            n.a aVar = n.f7126b;
            a10 = o.a(th2);
        }
        a11.resumeWith(n.b(a10));
    }

    public static final <T, R> Object b(d0<? super T> d0Var, R r10, p<? super R, ? super Continuation<? super T>, ? extends Object> pVar) {
        Object a0Var;
        Object c10;
        Object n02;
        Object c11;
        try {
            a0Var = ((p) b0.c(pVar, 2)).invoke(r10, d0Var);
        } catch (Throwable th2) {
            a0Var = new a0(th2, false, 2, null);
        }
        c10 = d.c();
        if (a0Var == c10 || (n02 = d0Var.n0(a0Var)) == e2.f32874b) {
            c11 = d.c();
            return c11;
        }
        if (n02 instanceof a0) {
            throw ((a0) n02).f32837a;
        }
        return e2.h(n02);
    }

    public static final <T, R> Object c(d0<? super T> d0Var, R r10, p<? super R, ? super Continuation<? super T>, ? extends Object> pVar) {
        Object a0Var;
        Object c10;
        Object n02;
        Object c11;
        try {
            a0Var = ((p) b0.c(pVar, 2)).invoke(r10, d0Var);
        } catch (Throwable th2) {
            a0Var = new a0(th2, false, 2, null);
        }
        c10 = d.c();
        if (a0Var == c10 || (n02 = d0Var.n0(a0Var)) == e2.f32874b) {
            c11 = d.c();
            return c11;
        }
        if (n02 instanceof a0) {
            Throwable th3 = ((a0) n02).f32837a;
            if (((th3 instanceof v2) && ((v2) th3).f32938a == d0Var) ? false : true) {
                throw th3;
            }
            if (a0Var instanceof a0) {
                throw ((a0) a0Var).f32837a;
            }
        } else {
            a0Var = e2.h(n02);
        }
        return a0Var;
    }
}
