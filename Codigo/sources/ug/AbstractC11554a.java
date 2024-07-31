package ug;

import com.google.android.gms.common.api.C5101a;
import p066dg.C6952m;
import tg.AbstractC11274r;

/* renamed from: ug.a */
/* loaded from: classes2.dex */
public abstract class AbstractC11554a extends AbstractC11274r {

    /* renamed from: b */
    private final int[] f29997b;

    /* renamed from: e */
    private final int[] f30000e;

    /* renamed from: f */
    private final int[] f30001f;

    /* renamed from: a */
    private final int[] f29996a = new int[4];

    /* renamed from: c */
    private final float[] f29998c = new float[4];

    /* renamed from: d */
    private final float[] f29999d = new float[4];

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11554a() {
        int[] iArr = new int[8];
        this.f29997b = iArr;
        this.f30000e = new int[iArr.length / 2];
        this.f30001f = new int[iArr.length / 2];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public static void m36207h(int[] iArr, float[] fArr) {
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
    /* renamed from: o */
    public static void m36208o(int[] iArr, float[] fArr) {
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
    /* renamed from: p */
    public static boolean m36209p(int[] iArr) {
        float f10 = (iArr[0] + iArr[1]) / ((iArr[2] + r1) + iArr[3]);
        if (f10 < 0.7916667f || f10 > 0.89285713f) {
            return false;
        }
        int i10 = C5101a.e.API_PRIORITY_OTHER;
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
    /* renamed from: q */
    public static int m36210q(int[] iArr, int[][] iArr2) {
        for (int i10 = 0; i10 < iArr2.length; i10++) {
            if (AbstractC11274r.m35225e(iArr, iArr2[i10], 0.45f) < 0.2f) {
                return i10;
            }
        }
        throw C6952m.m20106a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final int[] m36211i() {
        return this.f29997b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final int[] m36212j() {
        return this.f29996a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public final int[] m36213k() {
        return this.f30001f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final float[] m36214l() {
        return this.f29999d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final int[] m36215m() {
        return this.f30000e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final float[] m36216n() {
        return this.f29998c;
    }
}
