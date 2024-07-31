package p294pc;

import ee.InterfaceC7183b;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: pc.x */
/* loaded from: classes.dex */
public class C10157x<T> implements InterfaceC7183b<Set<T>> {

    /* renamed from: b */
    private volatile Set<T> f24965b = null;

    /* renamed from: a */
    private volatile Set<InterfaceC7183b<T>> f24964a = Collections.newSetFromMap(new ConcurrentHashMap());

    C10157x(Collection<InterfaceC7183b<T>> collection) {
        this.f24964a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C10157x<?> m30367b(Collection<InterfaceC7183b<?>> collection) {
        return new C10157x<>((Set) collection);
    }

    /* renamed from: d */
    private synchronized void m30368d() {
        Iterator<InterfaceC7183b<T>> it = this.f24964a.iterator();
        while (it.hasNext()) {
            this.f24965b.add(it.next().get());
        }
        this.f24964a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m30369a(InterfaceC7183b<T> interfaceC7183b) {
        Set set;
        if (this.f24965b == null) {
            set = this.f24964a;
        } else {
            set = this.f24965b;
            interfaceC7183b = (InterfaceC7183b<T>) interfaceC7183b.get();
        }
        set.add(interfaceC7183b);
    }

    @Override // ee.InterfaceC7183b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f24965b == null) {
            synchronized (this) {
                if (this.f24965b == null) {
                    this.f24965b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m30368d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f24965b);
    }
}
