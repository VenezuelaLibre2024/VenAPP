package c4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class h<T, Y> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<T, a<Y>> f6845a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private final long f6846b;

    /* renamed from: c, reason: collision with root package name */
    private long f6847c;

    /* renamed from: d, reason: collision with root package name */
    private long f6848d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a<Y> {

        /* renamed from: a, reason: collision with root package name */
        final Y f6849a;

        /* renamed from: b, reason: collision with root package name */
        final int f6850b;

        a(Y y10, int i10) {
            this.f6849a = y10;
            this.f6850b = i10;
        }
    }

    public h(long j10) {
        this.f6846b = j10;
        this.f6847c = j10;
    }

    private void f() {
        m(this.f6847c);
    }

    public void b() {
        m(0L);
    }

    public synchronized Y g(T t10) {
        a<Y> aVar;
        aVar = this.f6845a.get(t10);
        return aVar != null ? aVar.f6849a : null;
    }

    public synchronized long h() {
        return this.f6847c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int i(Y y10) {
        return 1;
    }

    protected void j(T t10, Y y10) {
    }

    public synchronized Y k(T t10, Y y10) {
        int i10 = i(y10);
        long j10 = i10;
        if (j10 >= this.f6847c) {
            j(t10, y10);
            return null;
        }
        if (y10 != null) {
            this.f6848d += j10;
        }
        a<Y> put = this.f6845a.put(t10, y10 == null ? null : new a<>(y10, i10));
        if (put != null) {
            this.f6848d -= put.f6850b;
            if (!put.f6849a.equals(y10)) {
                j(t10, put.f6849a);
            }
        }
        f();
        return put != null ? put.f6849a : null;
    }

    public synchronized Y l(T t10) {
        a<Y> remove = this.f6845a.remove(t10);
        if (remove == null) {
            return null;
        }
        this.f6848d -= remove.f6850b;
        return remove.f6849a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void m(long j10) {
        while (this.f6848d > j10) {
            Iterator<Map.Entry<T, a<Y>>> it = this.f6845a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.f6848d -= value.f6850b;
            T key = next.getKey();
            it.remove();
            j(key, value.f6849a);
        }
    }
}
