package hg;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c */
    static final String[] f16767c = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: d */
    static final int[][] f16768d = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: e */
    private static final int[][] f16769e;

    /* renamed from: f */
    static final int[][] f16770f;

    /* renamed from: a */
    private final byte[] f16771a;

    /* renamed from: b */
    private final Charset f16772b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Comparator<f> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            return fVar.f() - fVar2.f();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, RecognitionOptions.QR_CODE);
        f16769e = iArr;
        iArr[0][32] = 1;
        for (int i10 = 65; i10 <= 90; i10++) {
            f16769e[0][i10] = (i10 - 65) + 2;
        }
        f16769e[1][32] = 1;
        for (int i11 = 97; i11 <= 122; i11++) {
            f16769e[1][i11] = (i11 - 97) + 2;
        }
        f16769e[2][32] = 1;
        for (int i12 = 48; i12 <= 57; i12++) {
            f16769e[2][i12] = (i12 - 48) + 2;
        }
        int[] iArr2 = f16769e[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i13 = 0; i13 < 28; i13++) {
            f16769e[3][iArr3[i13]] = i13;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i14 = 0; i14 < 31; i14++) {
            int i15 = iArr4[i14];
            if (i15 > 0) {
                f16769e[4][i15] = i14;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 6);
        f16770f = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f16770f;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public d(byte[] bArr, Charset charset) {
        this.f16771a = bArr;
        this.f16772b = charset;
    }

    private static Collection<f> b(Iterable<f> iterable) {
        boolean z10;
        LinkedList linkedList = new LinkedList();
        for (f fVar : iterable) {
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                f fVar2 = (f) it.next();
                if (fVar2.h(fVar)) {
                    z10 = false;
                    break;
                }
                if (fVar.h(fVar2)) {
                    it.remove();
                }
            }
            if (z10) {
                linkedList.addFirst(fVar);
            }
        }
        return linkedList;
    }

    private void c(f fVar, int i10, Collection<f> collection) {
        char c10 = (char) (this.f16771a[i10] & 255);
        boolean z10 = f16769e[fVar.g()][c10] > 0;
        f fVar2 = null;
        for (int i11 = 0; i11 <= 4; i11++) {
            int i12 = f16769e[i11][c10];
            if (i12 > 0) {
                if (fVar2 == null) {
                    fVar2 = fVar.d(i10);
                }
                if (!z10 || i11 == fVar.g() || i11 == 2) {
                    collection.add(fVar2.i(i11, i12));
                }
                if (!z10 && f16770f[fVar.g()][i11] >= 0) {
                    collection.add(fVar2.j(i11, i12));
                }
            }
        }
        if (fVar.e() > 0 || f16769e[fVar.g()][c10] == 0) {
            collection.add(fVar.a(i10));
        }
    }

    private static void d(f fVar, int i10, int i11, Collection<f> collection) {
        f d10 = fVar.d(i10);
        collection.add(d10.i(4, i11));
        if (fVar.g() != 4) {
            collection.add(d10.j(4, i11));
        }
        if (i11 == 3 || i11 == 4) {
            collection.add(d10.i(2, 16 - i11).i(2, 1));
        }
        if (fVar.e() > 0) {
            collection.add(fVar.a(i10).a(i10 + 1));
        }
    }

    private Collection<f> e(Iterable<f> iterable, int i10) {
        LinkedList linkedList = new LinkedList();
        Iterator<f> it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next(), i10, linkedList);
        }
        return b(linkedList);
    }

    private static Collection<f> f(Iterable<f> iterable, int i10, int i11) {
        LinkedList linkedList = new LinkedList();
        Iterator<f> it = iterable.iterator();
        while (it.hasNext()) {
            d(it.next(), i10, i11, linkedList);
        }
        return b(linkedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kg.a a() {
        /*
            r8 = this;
            hg.f r0 = hg.f.f16776f
            java.nio.charset.Charset r1 = r8.f16772b
            if (r1 == 0) goto L2e
            kg.d r1 = kg.d.b(r1)
            if (r1 == 0) goto L15
            int r1 = r1.m()
            hg.f r0 = r0.b(r1)
            goto L2e
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No ECI code for character set "
            r1.append(r2)
            java.nio.charset.Charset r2 = r8.f16772b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2e:
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = r1
        L34:
            byte[] r3 = r8.f16771a
            int r4 = r3.length
            if (r2 >= r4) goto L78
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L41
            r5 = r3[r4]
            goto L42
        L41:
            r5 = r1
        L42:
            r3 = r3[r2]
            r6 = 13
            if (r3 == r6) goto L64
            r6 = 44
            r7 = 32
            if (r3 == r6) goto L60
            r6 = 46
            if (r3 == r6) goto L5c
            r6 = 58
            if (r3 == r6) goto L58
        L56:
            r3 = r1
            goto L69
        L58:
            if (r5 != r7) goto L56
            r3 = 5
            goto L69
        L5c:
            if (r5 != r7) goto L56
            r3 = 3
            goto L69
        L60:
            if (r5 != r7) goto L56
            r3 = 4
            goto L69
        L64:
            r3 = 10
            if (r5 != r3) goto L56
            r3 = 2
        L69:
            if (r3 <= 0) goto L71
            java.util.Collection r0 = f(r0, r2, r3)
            r2 = r4
            goto L75
        L71:
            java.util.Collection r0 = r8.e(r0, r2)
        L75:
            int r2 = r2 + 1
            goto L34
        L78:
            hg.d$a r1 = new hg.d$a
            r1.<init>()
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            hg.f r0 = (hg.f) r0
            byte[] r1 = r8.f16771a
            kg.a r0 = r0.k(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.d.a():kg.a");
    }
}
