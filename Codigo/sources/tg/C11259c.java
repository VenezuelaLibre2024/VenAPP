package tg;

import kg.C9263a;
import p066dg.C6952m;

/* renamed from: tg.c */
/* loaded from: classes2.dex */
public final class C11259c extends AbstractC11274r {

    /* renamed from: a */
    static final int[][] f29202a = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};

    /* renamed from: h */
    private static int m35184h(C9263a c9263a, int[] iArr, int i10) {
        AbstractC11274r.m35226f(c9263a, i10, iArr);
        float f10 = 0.25f;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[][] iArr2 = f29202a;
            if (i12 >= iArr2.length) {
                break;
            }
            float m35225e = AbstractC11274r.m35225e(iArr, iArr2[i12], 0.7f);
            if (m35225e < f10) {
                i11 = i12;
                f10 = m35225e;
            }
            i12++;
        }
        if (i11 >= 0) {
            return i11;
        }
        throw C6952m.m20106a();
    }

    /* renamed from: i */
    private static int[] m35185i(C9263a c9263a) {
        int m27590l = c9263a.m27590l();
        int m27588j = c9263a.m27588j(0);
        int[] iArr = new int[6];
        boolean z10 = false;
        int i10 = 0;
        int i11 = m27588j;
        while (m27588j < m27590l) {
            if (c9263a.m27586h(m27588j) != z10) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                if (i10 == 5) {
                    int i12 = -1;
                    float f10 = 0.25f;
                    for (int i13 = 103; i13 <= 105; i13++) {
                        float m35225e = AbstractC11274r.m35225e(iArr, f29202a[i13], 0.7f);
                        if (m35225e < f10) {
                            i12 = i13;
                            f10 = m35225e;
                        }
                    }
                    if (i12 >= 0 && c9263a.m27592p(Math.max(0, i11 - ((m27588j - i11) / 2)), i11, false)) {
                        return new int[]{i11, m27588j, i12};
                    }
                    i11 += iArr[0] + iArr[1];
                    int i14 = i10 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i14);
                    iArr[i14] = 0;
                    iArr[i10] = 0;
                    i10--;
                } else {
                    i10++;
                }
                iArr[i10] = 1;
                z10 = !z10;
            }
            m27588j++;
        }
        throw C6952m.m20106a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0137, code lost:
    
        if (r3 != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e0, code lost:
    
        if (r3 != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0139, code lost:
    
        r2 = false;
        r3 = false;
        r5 = false;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0089. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:50:0x00b1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x0102. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0140 A[PHI: r21
      0x0140: PHI (r21v10 boolean) = (r21v5 boolean), (r21v15 boolean) binds: [B:84:0x0102, B:50:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0148 A[PHI: r21
      0x0148: PHI (r21v9 boolean) = (r21v5 boolean), (r21v15 boolean) binds: [B:84:0x0102, B:50:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105 A[FALL_THROUGH, PHI: r21 r22
      0x0105: PHI (r21v8 boolean) = 
      (r21v5 boolean)
      (r21v5 boolean)
      (r21v5 boolean)
      (r21v5 boolean)
      (r21v15 boolean)
      (r21v15 boolean)
      (r21v15 boolean)
      (r21v15 boolean)
     binds: [B:84:0x0102, B:88:0x0119, B:92:0x0125, B:91:0x0121, B:50:0x00b1, B:54:0x00c7, B:58:0x00d3, B:57:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      0x0105: PHI (r22v8 int) = (r22v1 int), (r22v6 int), (r22v6 int), (r22v6 int), (r22v1 int), (r22v12 int), (r22v12 int), (r22v12 int) binds: [B:84:0x0102, B:88:0x0119, B:92:0x0125, B:91:0x0121, B:50:0x00b1, B:54:0x00c7, B:58:0x00d3, B:57:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // tg.AbstractC11274r
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p066dg.C6956q mo35175c(int r26, kg.C9263a r27, java.util.Map<p066dg.EnumC6944e, ?> r28) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.C11259c.mo35175c(int, kg.a, java.util.Map):dg.q");
    }
}
