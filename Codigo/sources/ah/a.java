package ah;

import dg.c;
import dg.e;
import dg.s;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f435a = {0, 4, 1, 5};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f436b = {6, 2, 7, 3};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f437c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f438d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    private static void a(s[] sVarArr, s[] sVarArr2, int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            sVarArr[iArr[i10]] = sVarArr2[i10];
        }
    }

    public static b b(c cVar, Map<e, ?> map, boolean z10) {
        kg.b a10 = cVar.a();
        List<s[]> c10 = c(z10, a10);
        for (int i10 = 0; c10.isEmpty() && i10 < 3; i10++) {
            a10 = a10.clone();
            if (i10 != 1) {
                a10.p();
            } else {
                a10.q();
            }
            c10 = c(z10, a10);
        }
        return new b(a10, c10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r4 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r3 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r3.hasNext() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r4 = (dg.s[]) r3.next();
        r7 = r4[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r7 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r2 = (int) java.lang.Math.max(r2, r7.d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r4 = r4[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r4 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        r2 = java.lang.Math.max(r2, (int) r4.d());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<dg.s[]> c(boolean r8, kg.b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
            r3 = r2
        L8:
            r4 = r3
        L9:
            int r5 = r9.j()
            if (r2 >= r5) goto L75
            dg.s[] r3 = f(r9, r2, r3)
            r5 = r3[r1]
            r6 = 1
            if (r5 != 0) goto L50
            r5 = 3
            r7 = r3[r5]
            if (r7 != 0) goto L50
            if (r4 != 0) goto L20
            goto L75
        L20:
            java.util.Iterator r3 = r0.iterator()
        L24:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4c
            java.lang.Object r4 = r3.next()
            dg.s[] r4 = (dg.s[]) r4
            r7 = r4[r6]
            if (r7 == 0) goto L3e
            float r2 = (float) r2
            float r7 = r7.d()
            float r2 = java.lang.Math.max(r2, r7)
            int r2 = (int) r2
        L3e:
            r4 = r4[r5]
            if (r4 == 0) goto L24
            float r4 = r4.d()
            int r4 = (int) r4
            int r2 = java.lang.Math.max(r2, r4)
            goto L24
        L4c:
            int r2 = r2 + 5
            r3 = r1
            goto L8
        L50:
            r0.add(r3)
            if (r8 != 0) goto L56
            goto L75
        L56:
            r2 = 2
            r4 = r3[r2]
            if (r4 == 0) goto L63
            float r4 = r4.c()
            int r4 = (int) r4
            r2 = r3[r2]
            goto L6d
        L63:
            r2 = 4
            r4 = r3[r2]
            float r4 = r4.c()
            int r4 = (int) r4
            r2 = r3[r2]
        L6d:
            float r2 = r2.d()
            int r2 = (int) r2
            r3 = r4
            r4 = r6
            goto L9
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.a.c(boolean, kg.b):java.util.List");
    }

    private static int[] d(kg.b bVar, int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i13 = 0;
        while (bVar.g(i10, i11) && i10 > 0) {
            int i14 = i13 + 1;
            if (i13 >= 3) {
                break;
            }
            i10--;
            i13 = i14;
        }
        int length = iArr.length;
        int i15 = i10;
        int i16 = 0;
        boolean z10 = false;
        while (i10 < i12) {
            if (bVar.g(i10, i11) != z10) {
                iArr2[i16] = iArr2[i16] + 1;
            } else {
                if (i16 != length - 1) {
                    i16++;
                } else {
                    if (g(iArr2, iArr) < 0.42f) {
                        return new int[]{i15, i10};
                    }
                    i15 += iArr2[0] + iArr2[1];
                    int i17 = i16 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i17);
                    iArr2[i17] = 0;
                    iArr2[i16] = 0;
                    i16--;
                }
                iArr2[i16] = 1;
                z10 = !z10;
            }
            i10++;
        }
        if (i16 != length - 1 || g(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i15, i10 - 1};
    }

    private static s[] e(kg.b bVar, int i10, int i11, int i12, int i13, int[] iArr) {
        boolean z10;
        int i14;
        int i15;
        s[] sVarArr = new s[4];
        int[] iArr2 = new int[iArr.length];
        int i16 = i12;
        while (true) {
            if (i16 >= i10) {
                z10 = false;
                break;
            }
            int[] d10 = d(bVar, i13, i16, i11, iArr, iArr2);
            if (d10 != null) {
                int i17 = i16;
                int[] iArr3 = d10;
                int i18 = i17;
                while (true) {
                    if (i18 <= 0) {
                        i15 = i18;
                        break;
                    }
                    int i19 = i18 - 1;
                    int[] d11 = d(bVar, i13, i19, i11, iArr, iArr2);
                    if (d11 == null) {
                        i15 = i19 + 1;
                        break;
                    }
                    iArr3 = d11;
                    i18 = i19;
                }
                float f10 = i15;
                sVarArr[0] = new s(iArr3[0], f10);
                sVarArr[1] = new s(iArr3[1], f10);
                z10 = true;
                i16 = i15;
            } else {
                i16 += 5;
            }
        }
        int i20 = i16 + 1;
        if (z10) {
            int[] iArr4 = {(int) sVarArr[0].c(), (int) sVarArr[1].c()};
            int i21 = i20;
            int i22 = 0;
            while (true) {
                if (i21 >= i10) {
                    i14 = i22;
                    break;
                }
                i14 = i22;
                int[] d12 = d(bVar, iArr4[0], i21, i11, iArr, iArr2);
                if (d12 != null && Math.abs(iArr4[0] - d12[0]) < 5 && Math.abs(iArr4[1] - d12[1]) < 5) {
                    iArr4 = d12;
                    i22 = 0;
                } else {
                    if (i14 > 25) {
                        break;
                    }
                    i22 = i14 + 1;
                }
                i21++;
            }
            i20 = i21 - (i14 + 1);
            float f11 = i20;
            sVarArr[2] = new s(iArr4[0], f11);
            sVarArr[3] = new s(iArr4[1], f11);
        }
        if (i20 - i16 < 10) {
            Arrays.fill(sVarArr, (Object) null);
        }
        return sVarArr;
    }

    private static s[] f(kg.b bVar, int i10, int i11) {
        int j10 = bVar.j();
        int m10 = bVar.m();
        s[] sVarArr = new s[8];
        a(sVarArr, e(bVar, j10, m10, i10, i11, f437c), f435a);
        s sVar = sVarArr[4];
        if (sVar != null) {
            i11 = (int) sVar.c();
            i10 = (int) sVarArr[4].d();
        }
        a(sVarArr, e(bVar, j10, m10, i10, i11, f438d), f436b);
        return sVarArr;
    }

    private static float g(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f10 = i10;
        float f11 = f10 / i11;
        float f12 = 0.8f * f11;
        float f13 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            float f14 = iArr2[i13] * f11;
            float f15 = iArr[i13];
            float f16 = f15 > f14 ? f15 - f14 : f14 - f15;
            if (f16 > f12) {
                return Float.POSITIVE_INFINITY;
            }
            f13 += f16;
        }
        return f13 / f10;
    }
}
