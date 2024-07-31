package p036c4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: c4.h */
/* loaded from: classes.dex */
public class C1867h<T, Y> {

    /* renamed from: a */
    private final Map<T, a<Y>> f7794a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    private final long f7795b;

    /* renamed from: c */
    private long f7796c;

    /* renamed from: d */
    private long f7797d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c4.h$a */
    /* loaded from: classes.dex */
    public static final class a<Y> {

        /* renamed from: a */
        final Y f7798a;

        /* renamed from: b */
        final int f7799b;

        a(Y y10, int i10) {
            this.f7798a = y10;
            this.f7799b = i10;
        }
    }

    public C1867h(long j10) {
        this.f7795b = j10;
        this.f7796c = j10;
    }

    /* renamed from: f */
    private void m9935f() {
        m9943m(this.f7796c);
    }

    /* renamed from: b */
    public void m9936b() {
        m9943m(0L);
    }

    /* renamed from: g */
    public synchronized Y m9937g(T t10) {
        a<Y> aVar;
        aVar = this.f7794a.get(t10);
        return aVar != null ? aVar.f7798a : null;
    }

    /* renamed from: h */
    public synchronized long m9938h() {
        return this.f7796c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public int mo9939i(Y y10) {
        return 1;
    }

    /* renamed from: j */
    protected void mo9940j(T t10, Y y10) {
    }

    /* renamed from: k */
    public synchronized Y m9941k(T t10, Y y10) {
        int mo9939i = mo9939i(y10);
        long j10 = mo9939i;
        if (j10 >= this.f7796c) {
            mo9940j(t10, y10);
            return null;
        }
        if (y10 != null) {
            this.f7797d += j10;
        }
        a<Y> put = this.f7794a.put(t10, y10 == null ? null : new a<>(y10, mo9939i));
        if (put != null) {
            this.f7797d -= put.f7799b;
            if (!put.f7798a.equals(y10)) {
                mo9940j(t10, put.f7798a);
            }
        }
        m9935f();
        return put != null ? put.f7798a : null;
    }

    /* renamed from: l */
    public synchronized Y m9942l(T t10) {
        a<Y> remove = this.f7794a.remove(t10);
        if (remove == null) {
            return null;
        }
        this.f7797d -= remove.f7799b;
        return remove.f7798a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public synchronized void m9943m(long j10) {
        while (this.f7797d > j10) {
            Iterator<Map.Entry<T, a<Y>>> it = this.f7794a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.f7797d -= value.f7799b;
            T key = next.getKey();
            it.remove();
            mo9940j(key, value.f7798a);
        }
    }
}
