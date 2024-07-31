package v7;

import android.util.SparseArray;

/* loaded from: classes.dex */
final class b1<V> {

    /* renamed from: c, reason: collision with root package name */
    private final t8.h<V> f28262c;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<V> f28261b = new SparseArray<>();

    /* renamed from: a, reason: collision with root package name */
    private int f28260a = -1;

    public b1(t8.h<V> hVar) {
        this.f28262c = hVar;
    }

    public void a(int i10, V v10) {
        if (this.f28260a == -1) {
            t8.a.g(this.f28261b.size() == 0);
            this.f28260a = 0;
        }
        if (this.f28261b.size() > 0) {
            SparseArray<V> sparseArray = this.f28261b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            t8.a.a(i10 >= keyAt);
            if (keyAt == i10) {
                t8.h<V> hVar = this.f28262c;
                SparseArray<V> sparseArray2 = this.f28261b;
                hVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f28261b.append(i10, v10);
    }

    public void b() {
        for (int i10 = 0; i10 < this.f28261b.size(); i10++) {
            this.f28262c.accept(this.f28261b.valueAt(i10));
        }
        this.f28260a = -1;
        this.f28261b.clear();
    }

    public void c(int i10) {
        for (int size = this.f28261b.size() - 1; size >= 0 && i10 < this.f28261b.keyAt(size); size--) {
            this.f28262c.accept(this.f28261b.valueAt(size));
            this.f28261b.removeAt(size);
        }
        this.f28260a = this.f28261b.size() > 0 ? Math.min(this.f28260a, this.f28261b.size() - 1) : -1;
    }

    public void d(int i10) {
        int i11 = 0;
        while (i11 < this.f28261b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f28261b.keyAt(i12)) {
                return;
            }
            this.f28262c.accept(this.f28261b.valueAt(i11));
            this.f28261b.removeAt(i11);
            int i13 = this.f28260a;
            if (i13 > 0) {
                this.f28260a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public V e(int i10) {
        if (this.f28260a == -1) {
            this.f28260a = 0;
        }
        while (true) {
            int i11 = this.f28260a;
            if (i11 <= 0 || i10 >= this.f28261b.keyAt(i11)) {
                break;
            }
            this.f28260a--;
        }
        while (this.f28260a < this.f28261b.size() - 1 && i10 >= this.f28261b.keyAt(this.f28260a + 1)) {
            this.f28260a++;
        }
        return this.f28261b.valueAt(this.f28260a);
    }

    public V f() {
        return this.f28261b.valueAt(r0.size() - 1);
    }

    public boolean g() {
        return this.f28261b.size() == 0;
    }
}
