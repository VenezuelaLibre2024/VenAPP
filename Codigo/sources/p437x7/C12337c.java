package p437x7;

import p363t8.C11173s;
import p397v7.C11732u0;
import p437x7.InterfaceC12341g;
import p459y6.C12620j;
import p459y6.InterfaceC12609b0;

/* renamed from: x7.c */
/* loaded from: classes.dex */
public final class C12337c implements InterfaceC12341g.b {

    /* renamed from: a */
    private final int[] f33093a;

    /* renamed from: b */
    private final C11732u0[] f33094b;

    public C12337c(int[] iArr, C11732u0[] c11732u0Arr) {
        this.f33093a = iArr;
        this.f33094b = c11732u0Arr;
    }

    /* renamed from: a */
    public int[] m39890a() {
        int[] iArr = new int[this.f33094b.length];
        int i10 = 0;
        while (true) {
            C11732u0[] c11732u0Arr = this.f33094b;
            if (i10 >= c11732u0Arr.length) {
                return iArr;
            }
            iArr[i10] = c11732u0Arr[i10].m37051G();
            i10++;
        }
    }

    /* renamed from: b */
    public void m39891b(long j10) {
        for (C11732u0 c11732u0 : this.f33094b) {
            c11732u0.m37064a0(j10);
        }
    }

    @Override // p437x7.InterfaceC12341g.b
    /* renamed from: d */
    public InterfaceC12609b0 mo39892d(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f33093a;
            if (i12 >= iArr.length) {
                C11173s.m34964c("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                return new C12620j();
            }
            if (i11 == iArr[i12]) {
                return this.f33094b[i12];
            }
            i12++;
        }
    }
}
