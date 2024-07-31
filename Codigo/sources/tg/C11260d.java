package tg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import p066dg.EnumC6940a;

/* renamed from: tg.d */
/* loaded from: classes2.dex */
public final class C11260d extends AbstractC11275s {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tg.d$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f29203a;

        /* renamed from: b */
        static final /* synthetic */ int[] f29204b;

        static {
            int[] iArr = new int[c.a.values().length];
            f29204b = iArr;
            try {
                iArr[c.a.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29204b[c.a.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29204b[c.a.C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[c.b.values().length];
            f29203a = iArr2;
            try {
                iArr2[c.b.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29203a[c.b.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29203a[c.b.C.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29203a[c.b.SHIFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tg.d$b */
    /* loaded from: classes2.dex */
    public enum b {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tg.d$c */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a */
        private int[][] f29205a;

        /* renamed from: b */
        private b[][] f29206b;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: tg.d$c$a */
        /* loaded from: classes2.dex */
        public enum a {
            A,
            B,
            C,
            NONE
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: tg.d$c$b */
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

        /* renamed from: b */
        private static void m35193b(Collection<int[]> collection, int i10, int[] iArr, int[] iArr2, int i11) {
            collection.add(C11259c.f29202a[i10]);
            if (i11 != 0) {
                iArr2[0] = iArr2[0] + 1;
            }
            iArr[0] = iArr[0] + (i10 * iArr2[0]);
        }

        /* renamed from: c */
        private boolean m35194c(CharSequence charSequence, a aVar, int i10) {
            int i11;
            char charAt = charSequence.charAt(i10);
            int i12 = a.f29204b[aVar.ordinal()];
            if (i12 == 1) {
                return charAt == 241 || charAt == 242 || charAt == 243 || charAt == 244 || " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fÿ".indexOf(charAt) >= 0;
            }
            if (i12 == 2) {
                return charAt == 241 || charAt == 242 || charAt == 243 || charAt == 244 || " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007fÿ".indexOf(charAt) >= 0;
            }
            if (i12 != 3) {
                return false;
            }
            return charAt == 241 || ((i11 = i10 + 1) < charSequence.length() && m35197f(charAt) && m35197f(charSequence.charAt(i11)));
        }

        /* renamed from: d */
        private int m35195d(CharSequence charSequence, a aVar, int i10) {
            int i11;
            int i12;
            int i13 = this.f29205a[aVar.ordinal()][i10];
            if (i13 > 0) {
                return i13;
            }
            b bVar = b.NONE;
            int i14 = i10 + 1;
            boolean z10 = i14 >= charSequence.length();
            a[] aVarArr = {a.A, a.B};
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 <= 1; i16++) {
                if (m35194c(charSequence, aVarArr[i16], i10)) {
                    b bVar2 = b.NONE;
                    a aVar2 = aVarArr[i16];
                    if (aVar != aVar2) {
                        bVar2 = b.valueOf(aVar2.toString());
                        i12 = 2;
                    } else {
                        i12 = 1;
                    }
                    if (!z10) {
                        i12 += m35195d(charSequence, aVarArr[i16], i14);
                    }
                    if (i12 < i15) {
                        bVar = bVar2;
                        i15 = i12;
                    }
                    if (aVar == aVarArr[(i16 + 1) % 2]) {
                        b bVar3 = b.SHIFT;
                        int m35195d = !z10 ? m35195d(charSequence, aVar, i14) + 2 : 2;
                        if (m35195d < i15) {
                            bVar = bVar3;
                            i15 = m35195d;
                        }
                    }
                }
            }
            a aVar3 = a.C;
            if (m35194c(charSequence, aVar3, i10)) {
                b bVar4 = b.NONE;
                if (aVar != aVar3) {
                    bVar4 = b.C;
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                int i17 = (charSequence.charAt(i10) != 241 ? 2 : 1) + i10;
                if (i17 < charSequence.length()) {
                    i11 += m35195d(charSequence, aVar3, i17);
                }
                if (i11 < i15) {
                    bVar = bVar4;
                    i15 = i11;
                }
            }
            if (i15 != Integer.MAX_VALUE) {
                this.f29205a[aVar.ordinal()][i10] = i15;
                this.f29206b[aVar.ordinal()][i10] = bVar;
                return i15;
            }
            throw new IllegalArgumentException("Bad character in input: ASCII value=" + ((int) charSequence.charAt(i10)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean[] m35196e(java.lang.String r17) {
            /*
                Method dump skipped, instructions count: 270
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tg.C11260d.c.m35196e(java.lang.String):boolean[]");
        }

        /* renamed from: f */
        private static boolean m35197f(char c10) {
            return c10 >= '0' && c10 <= '9';
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        if (r7.equals("B") == false) goto L12;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0073. Please report as an issue. */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m35186i(java.lang.String r6, java.util.Map<p066dg.EnumC6946g, ?> r7) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.C11260d.m35186i(java.lang.String, java.util.Map):int");
    }

    /* renamed from: j */
    private static int m35187j(CharSequence charSequence, int i10, int i11) {
        b m35189l;
        b m35189l2;
        char charAt;
        b m35189l3 = m35189l(charSequence, i10);
        b bVar = b.ONE_DIGIT;
        if (m35189l3 == bVar) {
            return i11 == 101 ? 101 : 100;
        }
        b bVar2 = b.UNCODABLE;
        if (m35189l3 == bVar2) {
            return (i10 >= charSequence.length() || ((charAt = charSequence.charAt(i10)) >= ' ' && (i11 != 101 || (charAt >= '`' && (charAt < 241 || charAt > 244))))) ? 100 : 101;
        }
        if (i11 == 101 && m35189l3 == b.FNC_1) {
            return 101;
        }
        if (i11 == 99) {
            return 99;
        }
        if (i11 != 100) {
            if (m35189l3 == b.FNC_1) {
                m35189l3 = m35189l(charSequence, i10 + 1);
            }
            return m35189l3 == b.TWO_DIGITS ? 99 : 100;
        }
        b bVar3 = b.FNC_1;
        if (m35189l3 == bVar3 || (m35189l = m35189l(charSequence, i10 + 2)) == bVar2 || m35189l == bVar) {
            return 100;
        }
        if (m35189l == bVar3) {
            return m35189l(charSequence, i10 + 3) == b.TWO_DIGITS ? 99 : 100;
        }
        int i12 = i10 + 4;
        while (true) {
            m35189l2 = m35189l(charSequence, i12);
            if (m35189l2 != b.TWO_DIGITS) {
                break;
            }
            i12 += 2;
        }
        return m35189l2 == b.ONE_DIGIT ? 100 : 99;
    }

    /* renamed from: k */
    private static boolean[] m35188k(String str, int i10) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1;
        while (i11 < length) {
            int m35187j = i10 == -1 ? m35187j(str, i11, i13) : i10;
            int i15 = 100;
            if (m35187j == i13) {
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
                    i15 = m35187j != 100 ? m35187j != 101 ? 105 : 103 : 104;
                } else {
                    i15 = m35187j;
                }
                i13 = m35187j;
            }
            arrayList.add(C11259c.f29202a[i15]);
            i12 += i15 * i14;
            if (i11 != 0) {
                i14++;
            }
        }
        return m35190m(arrayList, i12);
    }

    /* renamed from: l */
    private static b m35189l(CharSequence charSequence, int i10) {
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

    /* renamed from: m */
    static boolean[] m35190m(Collection<int[]> collection, int i10) {
        int[][] iArr = C11259c.f29202a;
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
            i11 += AbstractC11275s.m35228b(zArr, i11, it.next(), true);
        }
        return zArr;
    }

    @Override // tg.AbstractC11275s
    /* renamed from: d */
    public boolean[] mo35182d(String str) {
        return mo35191e(str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // tg.AbstractC11275s
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean[] mo35191e(java.lang.String r4, java.util.Map<p066dg.EnumC6946g, ?> r5) {
        /*
            r3 = this;
            int r0 = m35186i(r4, r5)
            if (r5 == 0) goto L1e
            dg.g r1 = p066dg.EnumC6946g.CODE128_COMPACT
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
            boolean[] r4 = tg.C11260d.c.m35192a(r5, r4)
            goto L30
        L2c:
            boolean[] r4 = m35188k(r4, r0)
        L30:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.C11260d.mo35191e(java.lang.String, java.util.Map):boolean[]");
    }

    @Override // tg.AbstractC11275s
    /* renamed from: g */
    protected Collection<EnumC6940a> mo35183g() {
        return Collections.singleton(EnumC6940a.CODE_128);
    }
}
