package ug;

import com.google.android.gms.common.api.a;
import dg.m;
import tg.r;

/* loaded from: classes2.dex */
public abstract class a extends r {

    /* renamed from: b, reason: collision with root package name */
    private final int[] f27674b;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f27677e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f27678f;

    /* renamed from: a, reason: collision with root package name */
    private final int[] f27673a = new int[4];

    /* renamed from: c, reason: collision with root package name */
    private final float[] f27675c = new float[4];

    /* renamed from: d, reason: collision with root package name */
    private final float[] f27676d = new float[4];

    /* JADX INFO: Access modifiers changed from: protected */
    public a() {
        int[] iArr = new int[8];
        this.f27674b = iArr;
        this.f27677e = new int[iArr.length / 2];
        this.f27678f = new int[iArr.length / 2];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void h(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f10 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            float f11 = fArr[i11];
            if (f11 < f10) {
                i10 = i11;
                f10 = f11;
            }
        }
        iArr[i10] = iArr[i10] - 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void o(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f10 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            float f11 = fArr[i11];
            if (f11 > f10) {
                i10 = i11;
                f10 = f11;
            }
        }
        iArr[i10] = iArr[i10] + 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean p(int[] iArr) {
        float f10 = (iArr[0] + iArr[1]) / ((iArr[2] + r1) + iArr[3]);
        if (f10 < 0.7916667f || f10 > 0.89285713f) {
            return false;
        }
        int i10 = a.e.API_PRIORITY_OTHER;
        int i11 = Integer.MIN_VALUE;
        for (int i12 : iArr) {
            if (i12 > i11) {
                i11 = i12;
            }
            if (i12 < i10) {
                i10 = i12;
            }
        }
        return i11 < i10 * 10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int q(int[] iArr, int[][] iArr2) {
        for (int i10 = 0; i10 < iArr2.length; i10++) {
            if (r.e(iArr, iArr2[i10], 0.45f) < 0.2f) {
                return i10;
            }
        }
        throw m.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int[] i() {
        return this.f27674b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int[] j() {
        return this.f27673a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int[] k() {
        return this.f27678f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float[] l() {
        return this.f27676d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int[] m() {
        return this.f27677e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float[] n() {
        return this.f27675c;
    }
}
