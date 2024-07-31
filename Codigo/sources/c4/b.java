package c4;

/* loaded from: classes.dex */
public final class b<K, V> extends androidx.collection.a<K, V> {

    /* renamed from: t, reason: collision with root package name */
    private int f6834t;

    @Override // androidx.collection.h, java.util.Map
    public void clear() {
        this.f6834t = 0;
        super.clear();
    }

    @Override // androidx.collection.h, java.util.Map
    public int hashCode() {
        if (this.f6834t == 0) {
            this.f6834t = super.hashCode();
        }
        return this.f6834t;
    }

    @Override // androidx.collection.h
    public void k(androidx.collection.h<? extends K, ? extends V> hVar) {
        this.f6834t = 0;
        super.k(hVar);
    }

    @Override // androidx.collection.h
    public V l(int i10) {
        this.f6834t = 0;
        return (V) super.l(i10);
    }

    @Override // androidx.collection.h
    public V m(int i10, V v10) {
        this.f6834t = 0;
        return (V) super.m(i10, v10);
    }

    @Override // androidx.collection.h, java.util.Map
    public V put(K k10, V v10) {
        this.f6834t = 0;
        return (V) super.put(k10, v10);
    }
}
