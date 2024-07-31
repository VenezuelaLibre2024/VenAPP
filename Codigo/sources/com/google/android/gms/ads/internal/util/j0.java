package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a */
    private final String[] f8987a;

    /* renamed from: b */
    private final double[] f8988b;

    /* renamed from: c */
    private final double[] f8989c;

    /* renamed from: d */
    private final int[] f8990d;

    /* renamed from: e */
    private int f8991e;

    public /* synthetic */ j0(h0 h0Var, i0 i0Var) {
        List list;
        List list2;
        List list3;
        List list4;
        list = h0Var.f8977b;
        int size = list.size();
        list2 = h0Var.f8976a;
        this.f8987a = (String[]) list2.toArray(new String[size]);
        list3 = h0Var.f8977b;
        this.f8988b = c(list3);
        list4 = h0Var.f8978c;
        this.f8989c = c(list4);
        this.f8990d = new int[size];
        this.f8991e = 0;
    }

    private static final double[] c(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) list.get(i10)).doubleValue();
        }
        return dArr;
    }

    public final List a() {
        j0 j0Var = this;
        ArrayList arrayList = new ArrayList(j0Var.f8987a.length);
        int i10 = 0;
        while (true) {
            String[] strArr = j0Var.f8987a;
            if (i10 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i10];
            double[] dArr = j0Var.f8989c;
            double[] dArr2 = j0Var.f8988b;
            int[] iArr = j0Var.f8990d;
            double d10 = dArr[i10];
            double d11 = dArr2[i10];
            int i11 = iArr[i10];
            arrayList.add(new g0(str, d10, d11, i11 / j0Var.f8991e, i11));
            i10++;
            j0Var = this;
        }
    }

    public final void b(double d10) {
        this.f8991e++;
        int i10 = 0;
        while (true) {
            double[] dArr = this.f8989c;
            if (i10 >= dArr.length) {
                return;
            }
            double d11 = dArr[i10];
            if (d11 <= d10 && d10 < this.f8988b[i10]) {
                int[] iArr = this.f8990d;
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
