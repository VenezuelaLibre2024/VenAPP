package f0;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f14843a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<T> f14844b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f14845c = new Object();

    /* renamed from: d, reason: collision with root package name */
    final c<T> f14846d;

    public a(int i10, c<T> cVar) {
        this.f14843a = i10;
        this.f14844b = new ArrayDeque<>(i10);
        this.f14846d = cVar;
    }

    public T a() {
        T removeLast;
        synchronized (this.f14845c) {
            removeLast = this.f14844b.removeLast();
        }
        return removeLast;
    }

    public void b(T t10) {
        T a10;
        synchronized (this.f14845c) {
            a10 = this.f14844b.size() >= this.f14843a ? a() : null;
            this.f14844b.addFirst(t10);
        }
        c<T> cVar = this.f14846d;
        if (cVar == null || a10 == null) {
            return;
        }
        cVar.a(a10);
    }

    public boolean c() {
        boolean isEmpty;
        synchronized (this.f14845c) {
            isEmpty = this.f14844b.isEmpty();
        }
        return isEmpty;
    }
}
