package p397v7;

import android.util.SparseArray;
import p363t8.C11137a;
import p363t8.InterfaceC11151h;

/* renamed from: v7.b1 */
/* loaded from: classes.dex */
final class C11688b1<V> {

    /* renamed from: c */
    private final InterfaceC11151h<V> f30632c;

    /* renamed from: b */
    private final SparseArray<V> f30631b = new SparseArray<>();

    /* renamed from: a */
    private int f30630a = -1;

    public C11688b1(InterfaceC11151h<V> interfaceC11151h) {
        this.f30632c = interfaceC11151h;
    }

    /* renamed from: a */
    public void m36823a(int i10, V v10) {
        if (this.f30630a == -1) {
            C11137a.m34605g(this.f30631b.size() == 0);
            this.f30630a = 0;
        }
        if (this.f30631b.size() > 0) {
            SparseArray<V> sparseArray = this.f30631b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            C11137a.m34599a(i10 >= keyAt);
            if (keyAt == i10) {
                InterfaceC11151h<V> interfaceC11151h = this.f30632c;
                SparseArray<V> sparseArray2 = this.f30631b;
                interfaceC11151h.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f30631b.append(i10, v10);
    }

    /* renamed from: b */
    public void m36824b() {
        for (int i10 = 0; i10 < this.f30631b.size(); i10++) {
            this.f30632c.accept(this.f30631b.valueAt(i10));
        }
        this.f30630a = -1;
        this.f30631b.clear();
    }

    /* renamed from: c */
    public void m36825c(int i10) {
        for (int size = this.f30631b.size() - 1; size >= 0 && i10 < this.f30631b.keyAt(size); size--) {
            this.f30632c.accept(this.f30631b.valueAt(size));
            this.f30631b.removeAt(size);
        }
        this.f30630a = this.f30631b.size() > 0 ? Math.min(this.f30630a, this.f30631b.size() - 1) : -1;
    }

    /* renamed from: d */
    public void m36826d(int i10) {
        int i11 = 0;
        while (i11 < this.f30631b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f30631b.keyAt(i12)) {
                return;
            }
            this.f30632c.accept(this.f30631b.valueAt(i11));
            this.f30631b.removeAt(i11);
            int i13 = this.f30630a;
            if (i13 > 0) {
                this.f30630a = i13 - 1;
            }
            i11 = i12;
        }
    }

    /* renamed from: e */
    public V m36827e(int i10) {
        if (this.f30630a == -1) {
            this.f30630a = 0;
        }
        while (true) {
            int i11 = this.f30630a;
            if (i11 <= 0 || i10 >= this.f30631b.keyAt(i11)) {
                break;
            }
            this.f30630a--;
        }
        while (this.f30630a < this.f30631b.size() - 1 && i10 >= this.f30631b.keyAt(this.f30630a + 1)) {
            this.f30630a++;
        }
        return this.f30631b.valueAt(this.f30630a);
    }

    /* renamed from: f */
    public V m36828f() {
        return this.f30631b.valueAt(r0.size() - 1);
    }

    /* renamed from: g */
    public boolean m36829g() {
        return this.f30631b.size() == 0;
    }
}
