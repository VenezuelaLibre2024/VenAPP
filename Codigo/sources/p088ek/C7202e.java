package p088ek;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C9322n;

/* renamed from: ek.e */
/* loaded from: classes3.dex */
public final class C7202e<K, V> extends AbstractC7198a<Map.Entry<K, V>, K, V> {

    /* renamed from: a */
    private final C7201d<K, V> f16168a;

    public C7202e(C7201d<K, V> backing) {
        C9322n.m27781e(backing, "backing");
        this.f16168a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends Map.Entry<K, V>> elements) {
        C9322n.m27781e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // dk.AbstractC7007f
    /* renamed from: c */
    public int mo20347c() {
        return this.f16168a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f16168a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> elements) {
        C9322n.m27781e(elements, "elements");
        return this.f16168a.m21516n(elements);
    }

    @Override // p088ek.AbstractC7198a
    /* renamed from: f */
    public boolean mo21456f(Map.Entry<? extends K, ? extends V> element) {
        C9322n.m27781e(element, "element");
        return this.f16168a.m21517o(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f16168a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f16168a.m21518s();
    }

    @Override // p088ek.AbstractC7198a
    /* renamed from: k */
    public boolean mo21457k(Map.Entry element) {
        C9322n.m27781e(element, "element");
        return this.f16168a.m21509I(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry<K, V> element) {
        C9322n.m27781e(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        C9322n.m27781e(elements, "elements");
        this.f16168a.m21515l();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        C9322n.m27781e(elements, "elements");
        this.f16168a.m21515l();
        return super.retainAll(elements);
    }
}
