package a8;

import android.util.SparseArray;
import t8.n0;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray<n0> f240a = new SparseArray<>();

    public n0 a(int i10) {
        n0 n0Var = this.f240a.get(i10);
        if (n0Var != null) {
            return n0Var;
        }
        n0 n0Var2 = new n0(9223372036854775806L);
        this.f240a.put(i10, n0Var2);
        return n0Var2;
    }

    public void b() {
        this.f240a.clear();
    }
}
