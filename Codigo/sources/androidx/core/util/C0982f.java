package androidx.core.util;

/* renamed from: androidx.core.util.f */
/* loaded from: classes.dex */
public class C0982f<T> implements InterfaceC0981e<T> {

    /* renamed from: a */
    private final Object[] f4541a;

    /* renamed from: b */
    private int f4542b;

    public C0982f(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f4541a = new Object[i10];
    }

    /* renamed from: c */
    private boolean m4822c(T t10) {
        for (int i10 = 0; i10 < this.f4542b; i10++) {
            if (this.f4541a[i10] == t10) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.util.InterfaceC0981e
    /* renamed from: a */
    public boolean mo4820a(T t10) {
        if (m4822c(t10)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i10 = this.f4542b;
        Object[] objArr = this.f4541a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = t10;
        this.f4542b = i10 + 1;
        return true;
    }

    @Override // androidx.core.util.InterfaceC0981e
    /* renamed from: b */
    public T mo4821b() {
        int i10 = this.f4542b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f4541a;
        T t10 = (T) objArr[i11];
        objArr[i11] = null;
        this.f4542b = i10 - 1;
        return t10;
    }
}
