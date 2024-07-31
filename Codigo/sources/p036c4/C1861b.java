package p036c4;

import androidx.collection.C0731a;
import androidx.collection.C0738h;

/* renamed from: c4.b */
/* loaded from: classes.dex */
public final class C1861b<K, V> extends C0731a<K, V> {

    /* renamed from: t */
    private int f7783t;

    @Override // androidx.collection.C0738h, java.util.Map
    public void clear() {
        this.f7783t = 0;
        super.clear();
    }

    @Override // androidx.collection.C0738h, java.util.Map
    public int hashCode() {
        if (this.f7783t == 0) {
            this.f7783t = super.hashCode();
        }
        return this.f7783t;
    }

    @Override // androidx.collection.C0738h
    /* renamed from: k */
    public void mo3712k(C0738h<? extends K, ? extends V> c0738h) {
        this.f7783t = 0;
        super.mo3712k(c0738h);
    }

    @Override // androidx.collection.C0738h
    /* renamed from: l */
    public V mo3713l(int i10) {
        this.f7783t = 0;
        return (V) super.mo3713l(i10);
    }

    @Override // androidx.collection.C0738h
    /* renamed from: m */
    public V mo3714m(int i10, V v10) {
        this.f7783t = 0;
        return (V) super.mo3714m(i10, v10);
    }

    @Override // androidx.collection.C0738h, java.util.Map
    public V put(K k10, V v10) {
        this.f7783t = 0;
        return (V) super.put(k10, v10);
    }
}
