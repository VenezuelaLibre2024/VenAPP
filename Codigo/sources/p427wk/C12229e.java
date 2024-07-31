package p427wk;

import ck.C2029n;
import ck.C2030o;
import ck.C2037v;
import hk.C7752d;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.jvm.internal.C9302h;
import kotlin.jvm.internal.C9322n;
import p124gk.C7588g;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;
import pk.InterfaceC10201a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wk.e */
/* loaded from: classes3.dex */
public final class C12229e<T> extends AbstractC12230f<T> implements Iterator<T>, Continuation<C2037v>, InterfaceC10201a {

    /* renamed from: a */
    private int f32699a;

    /* renamed from: b */
    private T f32700b;

    /* renamed from: c */
    private Iterator<? extends T> f32701c;

    /* renamed from: d */
    private Continuation<? super C2037v> f32702d;

    /* renamed from: e */
    private final Throwable m39365e() {
        int i10 = this.f32699a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f32699a);
    }

    /* renamed from: f */
    private final T m39366f() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // p427wk.AbstractC12230f
    /* renamed from: a */
    public Object mo39367a(T t10, Continuation<? super C2037v> continuation) {
        Object m23655c;
        Object m23655c2;
        Object m23655c3;
        this.f32700b = t10;
        this.f32699a = 3;
        this.f32702d = continuation;
        m23655c = C7752d.m23655c();
        m23655c2 = C7752d.m23655c();
        if (m23655c == m23655c2) {
            C9302h.m27753c(continuation);
        }
        m23655c3 = C7752d.m23655c();
        return m23655c == m23655c3 ? m23655c : C2037v.f8089a;
    }

    /* renamed from: g */
    public final void m39368g(Continuation<? super C2037v> continuation) {
        this.f32702d = continuation;
    }

    @Override // p124gk.Continuation
    public InterfaceC7587f getContext() {
        return C7588g.f17931a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i10 = this.f32699a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw m39365e();
                }
                Iterator<? extends T> it = this.f32701c;
                C9322n.m27778b(it);
                if (it.hasNext()) {
                    this.f32699a = 2;
                    return true;
                }
                this.f32701c = null;
            }
            this.f32699a = 5;
            Continuation<? super C2037v> continuation = this.f32702d;
            C9322n.m27778b(continuation);
            this.f32702d = null;
            C2029n.a aVar = C2029n.f8078b;
            continuation.resumeWith(C2029n.m10340b(C2037v.f8089a));
        }
    }

    @Override // java.util.Iterator
    public T next() {
        int i10 = this.f32699a;
        if (i10 == 0 || i10 == 1) {
            return m39366f();
        }
        if (i10 == 2) {
            this.f32699a = 1;
            Iterator<? extends T> it = this.f32701c;
            C9322n.m27778b(it);
            return it.next();
        }
        if (i10 != 3) {
            throw m39365e();
        }
        this.f32699a = 0;
        T t10 = this.f32700b;
        this.f32700b = null;
        return t10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p124gk.Continuation
    public void resumeWith(Object obj) {
        C2030o.m10349b(obj);
        this.f32699a = 4;
    }
}
