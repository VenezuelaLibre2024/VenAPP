package se;

import android.util.SparseIntArray;

/* renamed from: se.f */
/* loaded from: classes.dex */
public class C10907f {

    /* renamed from: se.f$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        int f27721a;

        /* renamed from: b */
        int f27722b;

        /* renamed from: c */
        int f27723c;

        public a(int i10, int i11, int i12) {
            this.f27721a = i10;
            this.f27722b = i11;
            this.f27723c = i12;
        }

        /* renamed from: a */
        public a m33278a(a aVar) {
            return new a(this.f27721a - aVar.m33281d(), this.f27722b - aVar.m33280c(), this.f27723c - aVar.m33279b());
        }

        /* renamed from: b */
        public int m33279b() {
            return this.f27723c;
        }

        /* renamed from: c */
        public int m33280c() {
            return this.f27722b;
        }

        /* renamed from: d */
        public int m33281d() {
            return this.f27721a;
        }
    }

    /* renamed from: a */
    public static a m33277a(SparseIntArray[] sparseIntArrayArr) {
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        int i12 = 0;
        if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i10 = 0;
            i11 = 0;
        } else {
            int i13 = 0;
            i10 = 0;
            i11 = 0;
            while (i12 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i12);
                int valueAt = sparseIntArray.valueAt(i12);
                i13 += valueAt;
                if (keyAt > 700) {
                    i11 += valueAt;
                }
                if (keyAt > 16) {
                    i10 += valueAt;
                }
                i12++;
            }
            i12 = i13;
        }
        return new a(i12, i10, i11);
    }
}
