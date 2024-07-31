package tg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class d extends s {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26907a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f26908b;

        static {
            int[] iArr = new int[c.a.values().length];
            f26908b = iArr;
            try {
                iArr[c.a.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26908b[c.a.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26908b[c.a.C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[c.b.values().length];
            f26907a = iArr2;
            try {
                iArr2[c.b.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26907a[c.b.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26907a[c.b.C.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26907a[c.b.SHIFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum b {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private int[][] f26909a;

        /* renamed from: b, reason: collision with root package name */
        private b[][] f26910b;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public enum a {
            A,
            B,
            C,
            NONE
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public enum b {
            A,
            B,
            C,
            SHIFT,
            NONE
        }

        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        private static void b(Collection<int[]> collection, int i10, int[] iArr, int[] iArr2, int i11) {
            collection.add(tg.c.f26906a[i10]);
            if (i11 != 0) {
                iArr2[0] = iArr2[0] + 1;
            }
            iArr[0] = iArr[0] + (i10 * iArr2[0]);
        }

        private boolean c(CharSequence charSequence, a aVar, int i10) {
            int i11;
            char charAt = charSequence.charAt(i10);
            int i12 = a.f26908b[aVar.ordinal()];
            if (i12 == 1) {
                return charAt == 241 || charAt == 242 || charAt == 243 || charAt == 244 || " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fÿ".indexOf(charAt) >= 0;
            }
            if (i12 == 2) {
                return charAt == 241 || charAt == 242 || charAt == 243 || charAt == 244 || " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007fÿ".indexOf(charAt) >= 0;
            }
            if (i12 != 3) {
                return false;
            }
            return charAt == 241 || ((i11 = i10 + 1) < charSequence.length() && f(charAt) && f(charSequence.charAt(i11)));
        }

        private int d(CharSequence charSequence, a aVar, int i10) {
            int i11;
            int i12;
            int i13 = this.f26909a[aVar.ordinal()][i10];
            if (i13 > 0) {
                return i13;
            }
            b bVar = b.NONE;
            int i14 = i10 + 1;
            boolean z10 = i14 >= charSequence.length();
            a[] aVarArr = {a.A, a.B};
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 <= 1; i16++) {
                if (c(charSequence, aVarArr[i16], i10)) {
                    b bVar2 = b.NONE;
                    a aVar2 = aVarArr[i16];
                    if (aVar != aVar2) {
                        bVar2 = b.valueOf(aVar2.toString());
                        i12 = 2;
                    } else {
                        i12 = 1;
                    }
                    if (!z10) {
                        i12 += d(charSequence, aVarArr[i16], i14);
                    }
                    if (i12 < i15) {
                        bVar = bVar2;
                        i15 = i12;
                    }
                    if (aVar == aVarArr[(i16 + 1) % 2]) {
                        b bVar3 = b.SHIFT;
                        int d10 = !z10 ? d(charSequence, aVar, i14) + 2 : 2;
                        if (d10 < i15) {
                            bVar = bVar3;
                            i15 = d10;
                        }
                    }
                }
            }
            a aVar3 = a.C;
            if (c(charSequence, aVar3, i10)) {
                b bVar4 = b.NONE;
                if (aVar != aVar3) {
                    bVar4 = b.C;
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                int i17 = (charSequence.charAt(i10) != 241 ? 2 : 1) + i10;
                if (i17 < charSequence.length()) {
                    i11 += d(charSequence, aVar3, i17);
                }
                if (i11 < i15) {
                    bVar = bVar4;
                    i15 = i11;
                }
            }
            if (i15 != Integer.MAX_VALUE) {
                this.f26909a[aVar.ordinal()][i10] = i15;
                this.f26910b[aVar.ordinal()][i10] = bVar;
                return i15;
            }
            throw new IllegalArgumentException("Bad character in input: ASCII value=" + ((int) charSequence.charAt(i10)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean[] e(java.lang.String r17) {
            /*
                Method dump skipped, instructions count: 270
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tg.d.c.e(java.lang.String):boolean[]");
        }

        private static boolean f(char c10) {
            return c10 >= '0' && c10 <= '9';
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        if (r7.equals("B") == false) goto L12;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0073. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int i(java.lang.String r6, java.util.Map<dg.g, ?> r7) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.d.i(java.lang.String, java.util.Map):int");
    }

    private static int j(CharSequence charSequence, int i10, int i11) {
        b l10;
        b l11;
        char charAt;
        b l12 = l(charSequence, i10);
        b bVar = b.ONE_DIGIT;
        if (l12 == bVar) {
            return i11 == 101 ? 101 : 100;
        }
        b bVar2 = b.UNCODABLE;
        if (l12 == bVar2) {
            return (i10 >= charSequence.length() || ((charAt = charSequence.charAt(i10)) >= ' ' && (i11 != 101 || (charAt >= '`' && (charAt < 241 || charAt > 244))))) ? 100 : 101;
        }
        if (i11 == 101 && l12 == b.FNC_1) {
            return 101;
        }
        if (i11 == 99) {
            return 99;
        }
        if (i11 != 100) {
            if (l12 == b.FNC_1) {
                l12 = l(charSequence, i10 + 1);
            }
            return l12 == b.TWO_DIGITS ? 99 : 100;
        }
        b bVar3 = b.FNC_1;
        if (l12 == bVar3 || (l10 = l(charSequence, i10 + 2)) == bVar2 || l10 == bVar) {
            return 100;
        }
        if (l10 == bVar3) {
            return l(charSequence, i10 + 3) == b.TWO_DIGITS ? 99 : 100;
        }
        int i12 = i10 + 4;
        while (true) {
            l11 = l(charSequence, i12);
            if (l11 != b.TWO_DIGITS) {
                break;
            }
            i12 += 2;
        }
        return l11 == b.ONE_DIGIT ? 100 : 99;
    }

    private static boolean[] k(String str, int i10) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1;
        while (i11 < length) {
            int j10 = i10 == -1 ? j(str, i11, i13) : i10;
            int i15 = 100;
            if (j10 == i13) {
                switch (str.charAt(i11)) {
                    case 241:
                        i15 = 102;
                        break;
                    case 242:
                        i15 = 97;
                        break;
                    case 243:
                        i15 = 96;
                        break;
                    case 244:
                        if (i13 == 101) {
                            i15 = 101;
                            break;
                        }
                        break;
                    default:
                        if (i13 == 100) {
                            i15 = str.charAt(i11) - ' ';
                            break;
                        } else if (i13 == 101) {
                            i15 = str.charAt(i11) - ' ';
                            if (i15 < 0) {
                                i15 += 96;
                                break;
                            }
                        } else {
                            int i16 = i11 + 1;
                            if (i16 == length) {
                                throw new IllegalArgumentException("Bad number of characters for digit only encoding.");
                            }
                            i15 = Integer.parseInt(str.substring(i11, i11 + 2));
                            i11 = i16;
                            break;
                        }
                        break;
                }
                i11++;
            } else {
                if (i13 == 0) {
                    i15 = j10 != 100 ? j10 != 101 ? 105 : 103 : 104;
                } else {
                    i15 = j10;
                }
                i13 = j10;
            }
            arrayList.add(tg.c.f26906a[i15]);
            i12 += i15 * i14;
            if (i11 != 0) {
                i14++;
            }
        }
        return m(arrayList, i12);
    }

    private static b l(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        if (i10 >= length) {
            return b.UNCODABLE;
        }
        char charAt = charSequence.charAt(i10);
        if (charAt == 241) {
            return b.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return b.UNCODABLE;
        }
        int i11 = i10 + 1;
        if (i11 >= length) {
            return b.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i11);
        return (charAt2 < '0' || charAt2 > '9') ? b.ONE_DIGIT : b.TWO_DIGITS;
    }

    static boolean[] m(Collection<int[]> collection, int i10) {
        int[][] iArr = tg.c.f26906a;
        collection.add(iArr[i10 % 103]);
        collection.add(iArr[106]);
        int i11 = 0;
        int i12 = 0;
        for (int[] iArr2 : collection) {
            for (int i13 : iArr2) {
                i12 += i13;
            }
        }
        boolean[] zArr = new boolean[i12];
        Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            i11 += s.b(zArr, i11, it.next(), true);
        }
        return zArr;
    }

    @Override // tg.s
    public boolean[] d(String str) {
        return e(str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // tg.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean[] e(java.lang.String r4, java.util.Map<dg.g, ?> r5) {
        /*
            r3 = this;
            int r0 = i(r4, r5)
            if (r5 == 0) goto L1e
            dg.g r1 = dg.g.CODE128_COMPACT
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L1e
            java.lang.Object r5 = r5.get(r1)
            java.lang.String r5 = r5.toString()
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            if (r5 == 0) goto L1e
            r5 = 1
            goto L1f
        L1e:
            r5 = 0
        L1f:
            if (r5 == 0) goto L2c
            tg.d$c r5 = new tg.d$c
            r0 = 0
            r5.<init>(r0)
            boolean[] r4 = tg.d.c.a(r5, r4)
            goto L30
        L2c:
            boolean[] r4 = k(r4, r0)
        L30:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.d.e(java.lang.String, java.util.Map):boolean[]");
    }

    @Override // tg.s
    protected Collection<dg.a> g() {
        return Collections.singleton(dg.a.CODE_128);
    }
}
