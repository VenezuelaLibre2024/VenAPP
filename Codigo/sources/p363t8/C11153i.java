package p363t8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: t8.i */
/* loaded from: classes.dex */
public final class C11153i<E> implements Iterable<E> {

    /* renamed from: a */
    private final Object f28970a = new Object();

    /* renamed from: b */
    private final Map<E, Integer> f28971b = new HashMap();

    /* renamed from: c */
    private Set<E> f28972c = Collections.emptySet();

    /* renamed from: d */
    private List<E> f28973d = Collections.emptyList();

    /* renamed from: c */
    public void m34726c(E e10) {
        synchronized (this.f28970a) {
            ArrayList arrayList = new ArrayList(this.f28973d);
            arrayList.add(e10);
            this.f28973d = Collections.unmodifiableList(arrayList);
            Integer num = this.f28971b.get(e10);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f28972c);
                hashSet.add(e10);
                this.f28972c = Collections.unmodifiableSet(hashSet);
            }
            this.f28971b.put(e10, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    /* renamed from: d */
    public int m34727d(E e10) {
        int intValue;
        synchronized (this.f28970a) {
            intValue = this.f28971b.containsKey(e10) ? this.f28971b.get(e10).intValue() : 0;
        }
        return intValue;
    }

    /* renamed from: f */
    public void m34728f(E e10) {
        synchronized (this.f28970a) {
            Integer num = this.f28971b.get(e10);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f28973d);
            arrayList.remove(e10);
            this.f28973d = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f28971b.remove(e10);
                HashSet hashSet = new HashSet(this.f28972c);
                hashSet.remove(e10);
                this.f28972c = Collections.unmodifiableSet(hashSet);
            } else {
                this.f28971b.put(e10, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f28970a) {
            it = this.f28973d.iterator();
        }
        return it;
    }

    /* renamed from: z0 */
    public Set<E> m34729z0() {
        Set<E> set;
        synchronized (this.f28970a) {
            set = this.f28972c;
        }
        return set;
    }
}
