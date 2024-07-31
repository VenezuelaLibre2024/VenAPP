package wk;

import ck.n;
import ck.o;
import ck.v;
import gk.Continuation;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class e<T> extends f<T> implements Iterator<T>, Continuation<v>, pk.a {

    /* renamed from: a */
    private int f30187a;

    /* renamed from: b */
    private T f30188b;

    /* renamed from: c */
    private Iterator<? extends T> f30189c;

    /* renamed from: d */
    private Continuation<? super v> f30190d;

    private final Throwable e() {
        int i10 = this.f30187a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f30187a);
    }

    private final T f() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // wk.f
    public Object a(T t10, Continuation<? super v> continuation) {
        Object c10;
        Object c11;
        Object c12;
        this.f30188b = t10;
        this.f30187a = 3;
        this.f30190d = continuation;
        c10 = hk.d.c();
        c11 = hk.d.c();
        if (c10 == c11) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        c12 = hk.d.c();
        return c10 == c12 ? c10 : v.f7137a;
    }

    public final void g(Continuation<? super v> continuation) {
        this.f30190d = continuation;
    }

    @Override // gk.Continuation
    public gk.f getContext() {
        return gk.g.f16294a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i10 = this.f30187a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw e();
                }
                Iterator<? extends T> it = this.f30189c;
                n.b(it);
                if (it.hasNext()) {
                    this.f30187a = 2;
                    return true;
                }
                this.f30189c = null;
            }
            this.f30187a = 5;
            Continuation<? super v> continuation = this.f30190d;
            n.b(continuation);
            this.f30190d = null;
            n.a aVar = ck.n.f7126b;
            continuation.resumeWith(ck.n.b(v.f7137a));
        }
    }

    @Override // java.util.Iterator
    public T next() {
        int i10 = this.f30187a;
        if (i10 == 0 || i10 == 1) {
            return f();
        }
        if (i10 == 2) {
            this.f30187a = 1;
            Iterator<? extends T> it = this.f30189c;
            kotlin.jvm.internal.n.b(it);
            return it.next();
        }
        if (i10 != 3) {
            throw e();
        }
        this.f30187a = 0;
        T t10 = this.f30188b;
        this.f30188b = null;
        return t10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // gk.Continuation
    public void resumeWith(Object obj) {
        o.b(obj);
        this.f30187a = 4;
    }
}
