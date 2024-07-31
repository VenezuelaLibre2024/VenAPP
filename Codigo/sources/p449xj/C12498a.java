package p449xj;

import p186jj.InterfaceC9079g;

/* renamed from: xj.a */
/* loaded from: classes3.dex */
public class C12498a<T> {

    /* renamed from: a */
    final int f33900a;

    /* renamed from: b */
    final Object[] f33901b;

    /* renamed from: c */
    Object[] f33902c;

    /* renamed from: d */
    int f33903d;

    /* renamed from: xj.a$a */
    /* loaded from: classes3.dex */
    public interface a<T> extends InterfaceC9079g<T> {
        @Override // p186jj.InterfaceC9079g
        boolean test(T t10);
    }

    public C12498a(int i10) {
        this.f33900a = i10;
        Object[] objArr = new Object[i10 + 1];
        this.f33901b = objArr;
        this.f33902c = objArr;
    }

    /* renamed from: a */
    public void m40921a(T t10) {
        int i10 = this.f33900a;
        int i11 = this.f33903d;
        if (i11 == i10) {
            Object[] objArr = new Object[i10 + 1];
            this.f33902c[i10] = objArr;
            this.f33902c = objArr;
            i11 = 0;
        }
        this.f33902c[i11] = t10;
        this.f33903d = i11 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        continue;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m40922b(p449xj.C12498a.a<? super T> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f33901b
            int r1 = r4.f33900a
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
        throw new UnsupportedOperationException("Method not decompiled: p449xj.C12498a.m40922b(xj.a$a):void");
    }
}
