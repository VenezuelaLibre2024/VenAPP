package p010a8;

import android.util.SparseArray;
import p363t8.C11164n0;

/* renamed from: a8.s */
/* loaded from: classes.dex */
public final class C0061s {

    /* renamed from: a */
    private final SparseArray<C11164n0> f291a = new SparseArray<>();

    /* renamed from: a */
    public C11164n0 m343a(int i10) {
        C11164n0 c11164n0 = this.f291a.get(i10);
        if (c11164n0 != null) {
            return c11164n0;
        }
        C11164n0 c11164n02 = new C11164n0(9223372036854775806L);
        this.f291a.put(i10, c11164n02);
        return c11164n02;
    }

    /* renamed from: b */
    public void m344b() {
        this.f291a.clear();
    }
}
