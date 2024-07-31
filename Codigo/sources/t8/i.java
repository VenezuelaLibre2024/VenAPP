package t8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class i<E> implements Iterable<E> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f26674a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map<E, Integer> f26675b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private Set<E> f26676c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    private List<E> f26677d = Collections.emptyList();

    public void c(E e10) {
        synchronized (this.f26674a) {
            ArrayList arrayList = new ArrayList(this.f26677d);
            arrayList.add(e10);
            this.f26677d = Collections.unmodifiableList(arrayList);
            Integer num = this.f26675b.get(e10);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f26676c);
                hashSet.add(e10);
                this.f26676c = Collections.unmodifiableSet(hashSet);
            }
            this.f26675b.put(e10, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public int d(E e10) {
        int intValue;
        synchronized (this.f26674a) {
            intValue = this.f26675b.containsKey(e10) ? this.f26675b.get(e10).intValue() : 0;
        }
        return intValue;
    }

    public void f(E e10) {
        synchronized (this.f26674a) {
            Integer num = this.f26675b.get(e10);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f26677d);
            arrayList.remove(e10);
            this.f26677d = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f26675b.remove(e10);
                HashSet hashSet = new HashSet(this.f26676c);
                hashSet.remove(e10);
                this.f26676c = Collections.unmodifiableSet(hashSet);
            } else {
                this.f26675b.put(e10, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f26674a) {
            it = this.f26677d.iterator();
        }
        return it;
    }

    public Set<E> z0() {
        Set<E> set;
        synchronized (this.f26674a) {
            set = this.f26676c;
        }
        return set;
    }
}
