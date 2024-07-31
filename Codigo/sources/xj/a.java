package xj;

/* loaded from: classes3.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    final int f31380a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f31381b;

    /* renamed from: c, reason: collision with root package name */
    Object[] f31382c;

    /* renamed from: d, reason: collision with root package name */
    int f31383d;

    /* renamed from: xj.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0526a<T> extends jj.g<T> {
        @Override // jj.g
        boolean test(T t10);
    }

    public a(int i10) {
        this.f31380a = i10;
        Object[] objArr = new Object[i10 + 1];
        this.f31381b = objArr;
        this.f31382c = objArr;
    }

    public void a(T t10) {
        int i10 = this.f31380a;
        int i11 = this.f31383d;
        if (i11 == i10) {
            Object[] objArr = new Object[i10 + 1];
            this.f31382c[i10] = objArr;
            this.f31382c = objArr;
            i11 = 0;
        }
        this.f31382c[i11] = t10;
        this.f31383d = i11 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(xj.a.InterfaceC0526a<? super T> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f31381b
            int r1 = r4.f31380a
        L4:
            if (r0 == 0) goto L1d
            r2 = 0
        L7:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L18
        Le:
            boolean r3 = r5.test(r3)
            if (r3 == 0) goto L15
            return
        L15:
            int r2 = r2 + 1
            goto L7
        L18:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xj.a.b(xj.a$a):void");
    }
}
