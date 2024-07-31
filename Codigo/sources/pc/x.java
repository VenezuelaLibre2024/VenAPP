package pc;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class x<T> implements ee.b<Set<T>> {

    /* renamed from: b, reason: collision with root package name */
    private volatile Set<T> f23032b = null;

    /* renamed from: a, reason: collision with root package name */
    private volatile Set<ee.b<T>> f23031a = Collections.newSetFromMap(new ConcurrentHashMap());

    x(Collection<ee.b<T>> collection) {
        this.f23031a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x<?> b(Collection<ee.b<?>> collection) {
        return new x<>((Set) collection);
    }

    private synchronized void d() {
        Iterator<ee.b<T>> it = this.f23031a.iterator();
        while (it.hasNext()) {
            this.f23032b.add(it.next().get());
        }
        this.f23031a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(ee.b<T> bVar) {
        Set set;
        if (this.f23032b == null) {
            set = this.f23031a;
        } else {
            set = this.f23032b;
            bVar = (ee.b<T>) bVar.get();
        }
        set.add(bVar);
    }

    @Override // ee.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f23032b == null) {
            synchronized (this) {
                if (this.f23032b == null) {
                    this.f23032b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f23032b);
    }
}
