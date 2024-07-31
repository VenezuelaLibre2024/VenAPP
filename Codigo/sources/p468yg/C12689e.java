package p468yg;

import java.math.BigInteger;
import java.util.Arrays;
import kg.C9267e;
import kg.C9272j;
import p066dg.C6947h;
import p446xg.C12485c;

/* renamed from: yg.e */
/* loaded from: classes2.dex */
final class C12689e {

    /* renamed from: a */
    private static final char[] f34397a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b */
    private static final char[] f34398b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c */
    private static final BigInteger[] f34399c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yg.e$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f34400a;

        static {
            int[] iArr = new int[b.values().length];
            f34400a = iArr;
            try {
                iArr[b.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34400a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34400a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34400a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34400a[b.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34400a[b.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yg.e$b */
    /* loaded from: classes2.dex */
    public enum b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f34399c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i10 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f34399c;
            if (i10 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i10] = bigIntegerArr2[i10 - 1].multiply(valueOf);
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0045, code lost:
    
        if (r11 == 924) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0049, code lost:
    
        if (r8 >= r12[0]) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004d, code lost:
    
        if (r12[r8] >= 900) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004f, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0051, code lost:
    
        if (r13 >= 6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0053, code lost:
    
        r14.m27651a((byte) (r6 >> ((5 - r13) * 8)));
        r13 = r13 + 1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m41770a(int r11, int[] r12, int r13, kg.C9272j r14) {
        /*
            r0 = 0
            r1 = r0
        L2:
            r2 = r12[r0]
            if (r13 >= r2) goto L8a
            if (r1 != 0) goto L8a
        L8:
            r2 = r12[r0]
            r3 = 927(0x39f, float:1.299E-42)
            r4 = 1
            if (r13 >= r2) goto L1c
            r5 = r12[r13]
            if (r5 != r3) goto L1c
            int r13 = r13 + 1
            r2 = r12[r13]
            r14.m27656f(r2)
            int r13 = r13 + r4
            goto L8
        L1c:
            if (r13 >= r2) goto L87
            r2 = r12[r13]
            r5 = 900(0x384, float:1.261E-42)
            if (r2 < r5) goto L26
            goto L87
        L26:
            r6 = 0
            r2 = r0
        L29:
            r8 = 900(0x384, double:4.447E-321)
            long r6 = r6 * r8
            int r8 = r13 + 1
            r13 = r12[r13]
            long r9 = (long) r13
            long r6 = r6 + r9
            int r2 = r2 + r4
            r13 = 5
            if (r2 >= r13) goto L41
            r9 = r12[r0]
            if (r8 >= r9) goto L41
            r9 = r12[r8]
            if (r9 < r5) goto L3f
            goto L41
        L3f:
            r13 = r8
            goto L29
        L41:
            if (r2 != r13) goto L61
            r13 = 924(0x39c, float:1.295E-42)
            if (r11 == r13) goto L4f
            r13 = r12[r0]
            if (r8 >= r13) goto L61
            r13 = r12[r8]
            if (r13 >= r5) goto L61
        L4f:
            r13 = r0
        L50:
            r2 = 6
            if (r13 >= r2) goto L84
            int r2 = 5 - r13
            int r2 = r2 * 8
            long r2 = r6 >> r2
            int r2 = (int) r2
            byte r2 = (byte) r2
            r14.m27651a(r2)
            int r13 = r13 + 1
            goto L50
        L61:
            int r8 = r8 - r2
        L62:
            r13 = r12[r0]
            if (r8 >= r13) goto L84
            if (r1 != 0) goto L84
            int r13 = r8 + 1
            r2 = r12[r8]
            if (r2 >= r5) goto L74
            byte r2 = (byte) r2
            r14.m27651a(r2)
            r8 = r13
            goto L62
        L74:
            if (r2 != r3) goto L7f
            int r2 = r13 + 1
            r13 = r12[r13]
            r14.m27656f(r13)
            r8 = r2
            goto L62
        L7f:
            int r13 = r13 + (-1)
            r8 = r13
            r1 = r4
            goto L62
        L84:
            r13 = r8
            goto L2
        L87:
            r1 = r4
            goto L2
        L8a:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p468yg.C12689e.m41770a(int, int[], int, kg.j):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x001f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0022. Please report as an issue. */
    /* renamed from: b */
    public static C9267e m41771b(int[] iArr, String str) {
        int i10;
        C9272j c9272j = new C9272j(iArr.length * 2);
        int m41776g = m41776g(iArr, 1, c9272j);
        C12485c c12485c = new C12485c();
        while (m41776g < iArr[0]) {
            int i11 = m41776g + 1;
            int i12 = iArr[m41776g];
            if (i12 != 913) {
                switch (i12) {
                    case 900:
                        m41776g = m41776g(iArr, i11, c9272j);
                        break;
                    case 901:
                        m41776g = m41770a(i12, iArr, i11, c9272j);
                        break;
                    case 902:
                        m41776g = m41775f(iArr, i11, c9272j);
                        break;
                    default:
                        switch (i12) {
                            case 922:
                            case 923:
                                throw C6947h.m20094a();
                            case 924:
                                m41776g = m41770a(i12, iArr, i11, c9272j);
                                break;
                            case 925:
                                i10 = i11 + 1;
                                m41776g = i10;
                                break;
                            case 926:
                                i10 = i11 + 2;
                                m41776g = i10;
                                break;
                            case 927:
                                m41776g = i11 + 1;
                                c9272j.m27656f(iArr[i11]);
                                break;
                            case 928:
                                m41776g = m41773d(iArr, i11, c12485c);
                                break;
                            default:
                                i11--;
                                m41776g = m41776g(iArr, i11, c9272j);
                                break;
                        }
                }
            } else {
                m41776g = i11 + 1;
                c9272j.m27652b((char) iArr[i11]);
            }
        }
        if (c9272j.m27657h() && c12485c.m40825a() == null) {
            throw C6947h.m20094a();
        }
        C9267e c9267e = new C9267e(null, c9272j.toString(), null, str);
        c9267e.m27638n(c12485c);
        return c9267e;
    }

    /* renamed from: c */
    private static String m41772c(int[] iArr, int i10) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i11 = 0; i11 < i10; i11++) {
            bigInteger = bigInteger.add(f34399c[(i10 - i11) - 1].multiply(BigInteger.valueOf(iArr[i11])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw C6947h.m20094a();
    }

    /* renamed from: d */
    static int m41773d(int[] iArr, int i10, C12485c c12485c) {
        int i11;
        if (i10 + 2 > iArr[0]) {
            throw C6947h.m20094a();
        }
        int[] iArr2 = new int[2];
        int i12 = 0;
        while (i12 < 2) {
            iArr2[i12] = iArr[i10];
            i12++;
            i10++;
        }
        String m41772c = m41772c(iArr2, 2);
        if (m41772c.isEmpty()) {
            c12485c.m40835k(0);
        } else {
            try {
                c12485c.m40835k(Integer.parseInt(m41772c));
            } catch (NumberFormatException unused) {
                throw C6947h.m20094a();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        while (i10 < iArr[0] && i10 < iArr.length && (i11 = iArr[i10]) != 922 && i11 != 923) {
            sb2.append(String.format("%03d", Integer.valueOf(i11)));
            i10++;
        }
        if (sb2.length() == 0) {
            throw C6947h.m20094a();
        }
        c12485c.m40829e(sb2.toString());
        int i13 = iArr[i10] == 923 ? i10 + 1 : -1;
        while (i10 < iArr[0]) {
            int i14 = iArr[i10];
            if (i14 == 922) {
                i10++;
                c12485c.m40832h(true);
            } else {
                if (i14 != 923) {
                    throw C6947h.m20094a();
                }
                int i15 = i10 + 1;
                switch (iArr[i15]) {
                    case 0:
                        C9272j c9272j = new C9272j();
                        i10 = m41776g(iArr, i15 + 1, c9272j);
                        c12485c.m40830f(c9272j.toString());
                        break;
                    case 1:
                        C9272j c9272j2 = new C9272j();
                        i10 = m41775f(iArr, i15 + 1, c9272j2);
                        c12485c.m40834j(Integer.parseInt(c9272j2.toString()));
                        break;
                    case 2:
                        C9272j c9272j3 = new C9272j();
                        i10 = m41775f(iArr, i15 + 1, c9272j3);
                        c12485c.m40837m(Long.parseLong(c9272j3.toString()));
                        break;
                    case 3:
                        C9272j c9272j4 = new C9272j();
                        i10 = m41776g(iArr, i15 + 1, c9272j4);
                        c12485c.m40836l(c9272j4.toString());
                        break;
                    case 4:
                        C9272j c9272j5 = new C9272j();
                        i10 = m41776g(iArr, i15 + 1, c9272j5);
                        c12485c.m40827c(c9272j5.toString());
                        break;
                    case 5:
                        C9272j c9272j6 = new C9272j();
                        i10 = m41775f(iArr, i15 + 1, c9272j6);
                        c12485c.m40831g(Long.parseLong(c9272j6.toString()));
                        break;
                    case 6:
                        C9272j c9272j7 = new C9272j();
                        i10 = m41775f(iArr, i15 + 1, c9272j7);
                        c12485c.m40828d(Integer.parseInt(c9272j7.toString()));
                        break;
                    default:
                        throw C6947h.m20094a();
                }
            }
        }
        if (i13 != -1) {
            int i16 = i10 - i13;
            if (c12485c.m40826b()) {
                i16--;
            }
            c12485c.m40833i(Arrays.copyOfRange(iArr, i13, i16 + i13));
        }
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x007c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0020. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x009c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x00c1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p468yg.C12689e.b m41774e(int[] r15, int[] r16, int r17, kg.C9272j r18, p468yg.C12689e.b r19) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p468yg.C12689e.m41774e(int[], int[], int, kg.j, yg.e$b):yg.e$b");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x002c. Please report as an issue. */
    /* renamed from: f */
    private static int m41775f(int[] iArr, int i10, C9272j c9272j) {
        int[] iArr2 = new int[15];
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            int i12 = iArr[0];
            if (i10 < i12 && !z10) {
                int i13 = i10 + 1;
                int i14 = iArr[i10];
                if (i13 == i12) {
                    z10 = true;
                }
                if (i14 < 900) {
                    iArr2[i11] = i14;
                    i11++;
                } else {
                    if (i14 != 900 && i14 != 901 && i14 != 927 && i14 != 928) {
                        switch (i14) {
                        }
                    }
                    i13--;
                    z10 = true;
                }
                if ((i11 % 15 == 0 || i14 == 902 || z10) && i11 > 0) {
                    c9272j.m27654d(m41772c(iArr2, i11));
                    i11 = 0;
                }
                i10 = i13;
            }
        }
        return i10;
    }

    /* renamed from: g */
    private static int m41776g(int[] iArr, int i10, C9272j c9272j) {
        int i11 = iArr[0];
        int[] iArr2 = new int[(i11 - i10) * 2];
        int[] iArr3 = new int[(i11 - i10) * 2];
        b bVar = b.ALPHA;
        boolean z10 = false;
        int i12 = 0;
        while (i10 < iArr[0] && !z10) {
            int i13 = i10 + 1;
            int i14 = iArr[i10];
            if (i14 < 900) {
                iArr2[i12] = i14 / 30;
                iArr2[i12 + 1] = i14 % 30;
                i12 += 2;
            } else if (i14 == 913) {
                iArr2[i12] = 913;
                i10 = i13 + 1;
                iArr3[i12] = iArr[i13];
                i12++;
            } else if (i14 != 927) {
                if (i14 != 928) {
                    switch (i14) {
                        case 900:
                            iArr2[i12] = 900;
                            i12++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i14) {
                            }
                    }
                }
                i13--;
                z10 = true;
            } else {
                b m41774e = m41774e(iArr2, iArr3, i12, c9272j, bVar);
                int i15 = i13 + 1;
                c9272j.m27656f(iArr[i13]);
                int i16 = iArr[0];
                int[] iArr4 = new int[(i16 - i15) * 2];
                i12 = 0;
                bVar = m41774e;
                i10 = i15;
                iArr3 = new int[(i16 - i15) * 2];
                iArr2 = iArr4;
            }
            i10 = i13;
        }
        m41774e(iArr2, iArr3, i12, c9272j, bVar);
        return i10;
    }
}
