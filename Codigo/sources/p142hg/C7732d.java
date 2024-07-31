package p142hg;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: hg.d */
/* loaded from: classes2.dex */
public final class C7732d {

    /* renamed from: c */
    static final String[] f18417c = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: d */
    static final int[][] f18418d = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: e */
    private static final int[][] f18419e;

    /* renamed from: f */
    static final int[][] f18420f;

    /* renamed from: a */
    private final byte[] f18421a;

    /* renamed from: b */
    private final Charset f18422b;

    /* renamed from: hg.d$a */
    /* loaded from: classes2.dex */
    class a implements Comparator<C7734f> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C7734f c7734f, C7734f c7734f2) {
            return c7734f.m23600f() - c7734f2.m23600f();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, RecognitionOptions.QR_CODE);
        f18419e = iArr;
        iArr[0][32] = 1;
        for (int i10 = 65; i10 <= 90; i10++) {
            f18419e[0][i10] = (i10 - 65) + 2;
        }
        f18419e[1][32] = 1;
        for (int i11 = 97; i11 <= 122; i11++) {
            f18419e[1][i11] = (i11 - 97) + 2;
        }
        f18419e[2][32] = 1;
        for (int i12 = 48; i12 <= 57; i12++) {
            f18419e[2][i12] = (i12 - 48) + 2;
        }
        int[] iArr2 = f18419e[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i13 = 0; i13 < 28; i13++) {
            f18419e[3][iArr3[i13]] = i13;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i14 = 0; i14 < 31; i14++) {
            int i15 = iArr4[i14];
            if (i15 > 0) {
                f18419e[4][i15] = i14;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 6);
        f18420f = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f18420f;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public C7732d(byte[] bArr, Charset charset) {
        this.f18421a = bArr;
        this.f18422b = charset;
    }

    /* renamed from: b */
    private static Collection<C7734f> m23588b(Iterable<C7734f> iterable) {
        boolean z10;
        LinkedList linkedList = new LinkedList();
        for (C7734f c7734f : iterable) {
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                C7734f c7734f2 = (C7734f) it.next();
                if (c7734f2.m23602h(c7734f)) {
                    z10 = false;
                    break;
                }
                if (c7734f.m23602h(c7734f2)) {
                    it.remove();
                }
            }
            if (z10) {
                linkedList.addFirst(c7734f);
            }
        }
        return linkedList;
    }

    /* renamed from: c */
    private void m23589c(C7734f c7734f, int i10, Collection<C7734f> collection) {
        char c10 = (char) (this.f18421a[i10] & 255);
        boolean z10 = f18419e[c7734f.m23601g()][c10] > 0;
        C7734f c7734f2 = null;
        for (int i11 = 0; i11 <= 4; i11++) {
            int i12 = f18419e[i11][c10];
            if (i12 > 0) {
                if (c7734f2 == null) {
                    c7734f2 = c7734f.m23598d(i10);
                }
                if (!z10 || i11 == c7734f.m23601g() || i11 == 2) {
                    collection.add(c7734f2.m23603i(i11, i12));
                }
                if (!z10 && f18420f[c7734f.m23601g()][i11] >= 0) {
                    collection.add(c7734f2.m23604j(i11, i12));
                }
            }
        }
        if (c7734f.m23599e() > 0 || f18419e[c7734f.m23601g()][c10] == 0) {
            collection.add(c7734f.m23596a(i10));
        }
    }

    /* renamed from: d */
    private static void m23590d(C7734f c7734f, int i10, int i11, Collection<C7734f> collection) {
        C7734f m23598d = c7734f.m23598d(i10);
        collection.add(m23598d.m23603i(4, i11));
        if (c7734f.m23601g() != 4) {
            collection.add(m23598d.m23604j(4, i11));
        }
        if (i11 == 3 || i11 == 4) {
            collection.add(m23598d.m23603i(2, 16 - i11).m23603i(2, 1));
        }
        if (c7734f.m23599e() > 0) {
            collection.add(c7734f.m23596a(i10).m23596a(i10 + 1));
        }
    }

    /* renamed from: e */
    private Collection<C7734f> m23591e(Iterable<C7734f> iterable, int i10) {
        LinkedList linkedList = new LinkedList();
        Iterator<C7734f> it = iterable.iterator();
        while (it.hasNext()) {
            m23589c(it.next(), i10, linkedList);
        }
        return m23588b(linkedList);
    }

    /* renamed from: f */
    private static Collection<C7734f> m23592f(Iterable<C7734f> iterable, int i10, int i11) {
        LinkedList linkedList = new LinkedList();
        Iterator<C7734f> it = iterable.iterator();
        while (it.hasNext()) {
            m23590d(it.next(), i10, i11, linkedList);
        }
        return m23588b(linkedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kg.C9263a m23593a() {
        /*
            r8 = this;
            hg.f r0 = p142hg.C7734f.f18426f
            java.nio.charset.Charset r1 = r8.f18422b
            if (r1 == 0) goto L2e
            kg.d r1 = kg.EnumC9266d.m27620b(r1)
            if (r1 == 0) goto L15
            int r1 = r1.m27624m()
            hg.f r0 = r0.m23597b(r1)
            goto L2e
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No ECI code for character set "
            r1.append(r2)
            java.nio.charset.Charset r2 = r8.f18422b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2e:
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = r1
        L34:
            byte[] r3 = r8.f18421a
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
            java.util.Collection r0 = m23592f(r0, r2, r3)
            r2 = r4
            goto L75
        L71:
            java.util.Collection r0 = r8.m23591e(r0, r2)
        L75:
            int r2 = r2 + 1
            goto L34
        L78:
            hg.d$a r1 = new hg.d$a
            r1.<init>()
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            hg.f r0 = (p142hg.C7734f) r0
            byte[] r1 = r8.f18421a
            kg.a r0 = r0.m23605k(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p142hg.C7732d.m23593a():kg.a");
    }
}
