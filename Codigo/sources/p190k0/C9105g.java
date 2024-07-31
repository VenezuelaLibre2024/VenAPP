package p190k0;

/* renamed from: k0.g */
/* loaded from: classes.dex */
class C9105g<T> implements InterfaceC9104f<T> {

    /* renamed from: a */
    private final Object[] f21898a;

    /* renamed from: b */
    private int f21899b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9105g(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f21898a = new Object[i10];
    }

    @Override // p190k0.InterfaceC9104f
    /* renamed from: a */
    public boolean mo26798a(T t10) {
        int i10 = this.f21899b;
        Object[] objArr = this.f21898a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = t10;
        this.f21899b = i10 + 1;
        return true;
    }

    @Override // p190k0.InterfaceC9104f
    /* renamed from: b */
    public T mo26799b() {
        int i10 = this.f21899b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f21898a;
        T t10 = (T) objArr[i11];
        objArr[i11] = null;
        this.f21899b = i10 - 1;
        return t10;
    }

    @Override // p190k0.InterfaceC9104f
    /* renamed from: c */
    public void mo26800c(T[] tArr, int i10) {
        if (i10 > tArr.length) {
            i10 = tArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            T t10 = tArr[i11];
            int i12 = this.f21899b;
            Object[] objArr = this.f21898a;
            if (i12 < objArr.length) {
                objArr[i12] = t10;
                this.f21899b = i12 + 1;
            }
        }
    }
}
