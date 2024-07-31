package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.util.j0 */
/* loaded from: classes.dex */
public final class C5003j0 {

    /* renamed from: a */
    private final String[] f10086a;

    /* renamed from: b */
    private final double[] f10087b;

    /* renamed from: c */
    private final double[] f10088c;

    /* renamed from: d */
    private final int[] f10089d;

    /* renamed from: e */
    private int f10090e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5003j0(C4995h0 c4995h0, C4999i0 c4999i0) {
        List list;
        List list2;
        List list3;
        List list4;
        list = c4995h0.f10076b;
        int size = list.size();
        list2 = c4995h0.f10075a;
        this.f10086a = (String[]) list2.toArray(new String[size]);
        list3 = c4995h0.f10076b;
        this.f10087b = m12641c(list3);
        list4 = c4995h0.f10077c;
        this.f10088c = m12641c(list4);
        this.f10089d = new int[size];
        this.f10090e = 0;
    }

    /* renamed from: c */
    private static final double[] m12641c(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) list.get(i10)).doubleValue();
        }
        return dArr;
    }

    /* renamed from: a */
    public final List m12642a() {
        C5003j0 c5003j0 = this;
        ArrayList arrayList = new ArrayList(c5003j0.f10086a.length);
        int i10 = 0;
        while (true) {
            String[] strArr = c5003j0.f10086a;
            if (i10 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i10];
            double[] dArr = c5003j0.f10088c;
            double[] dArr2 = c5003j0.f10087b;
            int[] iArr = c5003j0.f10089d;
            double d10 = dArr[i10];
            double d11 = dArr2[i10];
            int i11 = iArr[i10];
            arrayList.add(new C4991g0(str, d10, d11, i11 / c5003j0.f10090e, i11));
            i10++;
            c5003j0 = this;
        }
    }

    /* renamed from: b */
    public final void m12643b(double d10) {
        this.f10090e++;
        int i10 = 0;
        while (true) {
            double[] dArr = this.f10088c;
            if (i10 >= dArr.length) {
                return;
            }
            double d11 = dArr[i10];
            if (d11 <= d10 && d10 < this.f10087b[i10]) {
                int[] iArr = this.f10089d;
                iArr[i10] = iArr[i10] + 1;
            }
            if (d10 < d11) {
                return;
            } else {
                i10++;
            }
        }
    }
}
