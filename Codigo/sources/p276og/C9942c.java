package p276og;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Set;
import kg.C9265c;
import kg.C9272j;
import p066dg.C6947h;

/* renamed from: og.c */
/* loaded from: classes2.dex */
final class C9942c {

    /* renamed from: b */
    private static final char[] f24480b;

    /* renamed from: d */
    private static final char[] f24482d;

    /* renamed from: a */
    private static final char[] f24479a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: c */
    private static final char[] f24481c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: e */
    private static final char[] f24483e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    /* renamed from: og.c$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24484a;

        static {
            int[] iArr = new int[b.values().length];
            f24484a = iArr;
            try {
                iArr[b.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24484a[b.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24484a[b.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24484a[b.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24484a[b.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24484a[b.ECI_ENCODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: og.c$b */
    /* loaded from: classes2.dex */
    public enum b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE,
        ECI_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        f24480b = cArr;
        f24482d = cArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kg.C9267e m29708a(byte[] r13) {
        /*
            kg.c r0 = new kg.c
            r0.<init>(r13)
            kg.j r1 = new kg.j
            r2 = 100
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.<init>(r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5.<init>(r6)
            og.c$b r8 = p276og.C9942c.b.ASCII_ENCODE
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
        L27:
            og.c$b r10 = p276og.C9942c.b.ASCII_ENCODE
            if (r8 != r10) goto L30
            og.c$b r8 = m29710c(r0, r1, r2, r9)
            goto L59
        L30:
            int[] r11 = p276og.C9942c.a.f24484a
            int r8 = r8.ordinal()
            r8 = r11[r8]
            switch(r8) {
                case 1: goto L55;
                case 2: goto L51;
                case 3: goto L4d;
                case 4: goto L49;
                case 5: goto L45;
                case 6: goto L40;
                default: goto L3b;
            }
        L3b:
            dg.h r13 = p066dg.C6947h.m20094a()
            throw r13
        L40:
            m29713f(r0, r1)
            r3 = r6
            goto L58
        L45:
            m29711d(r0, r1, r5)
            goto L58
        L49:
            m29714g(r0, r1)
            goto L58
        L4d:
            m29709b(r0, r1)
            goto L58
        L51:
            m29715h(r0, r1, r9)
            goto L58
        L55:
            m29712e(r0, r1, r9)
        L58:
            r8 = r10
        L59:
            og.c$b r10 = p276og.C9942c.b.PAD_ENCODE
            if (r8 == r10) goto L63
            int r10 = r0.m27616a()
            if (r10 > 0) goto L27
        L63:
            int r0 = r2.length()
            if (r0 <= 0) goto L6c
            r1.m27655e(r2)
        L6c:
            r0 = 5
            r2 = 4
            if (r3 == 0) goto L98
            boolean r3 = r9.contains(r4)
            if (r3 != 0) goto L96
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            boolean r3 = r9.contains(r3)
            if (r3 == 0) goto L81
            goto L96
        L81:
            boolean r3 = r9.contains(r7)
            if (r3 != 0) goto L94
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r9.contains(r0)
            if (r0 == 0) goto L92
            goto L94
        L92:
            r12 = r2
            goto Lbd
        L94:
            r6 = 6
            goto Lbc
        L96:
            r12 = r0
            goto Lbd
        L98:
            boolean r3 = r9.contains(r4)
            if (r3 != 0) goto Lbb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r9.contains(r2)
            if (r2 == 0) goto La9
            goto Lbb
        La9:
            boolean r2 = r9.contains(r7)
            if (r2 != 0) goto Lb9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r9.contains(r0)
            if (r0 == 0) goto Lbc
        Lb9:
            r6 = 3
            goto Lbc
        Lbb:
            r6 = 2
        Lbc:
            r12 = r6
        Lbd:
            kg.e r0 = new kg.e
            java.lang.String r9 = r1.toString()
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto Lca
            r5 = 0
        Lca:
            r10 = r5
            r11 = 0
            r7 = r0
            r8 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p276og.C9942c.m29708a(byte[]):kg.e");
    }

    /* renamed from: b */
    private static void m29709b(C9265c c9265c, C9272j c9272j) {
        int m27619d;
        char c10;
        int i10;
        int[] iArr = new int[3];
        while (c9265c.m27616a() != 8 && (m27619d = c9265c.m27619d(8)) != 254) {
            m29716i(m27619d, c9265c.m27619d(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                if (i12 == 0) {
                    c10 = '\r';
                } else if (i12 == 1) {
                    c10 = '*';
                } else if (i12 == 2) {
                    c10 = '>';
                } else if (i12 != 3) {
                    if (i12 < 14) {
                        i10 = i12 + 44;
                    } else {
                        if (i12 >= 40) {
                            throw C6947h.m20094a();
                        }
                        i10 = i12 + 51;
                    }
                    c10 = (char) i10;
                } else {
                    c10 = ' ';
                }
                c9272j.m27652b(c10);
            }
            if (c9265c.m27616a() <= 0) {
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0037. Please report as an issue. */
    /* renamed from: c */
    private static b m29710c(C9265c c9265c, C9272j c9272j, StringBuilder sb2, Set<Integer> set) {
        String str;
        boolean z10 = false;
        do {
            int m27619d = c9265c.m27619d(8);
            if (m27619d == 0) {
                throw C6947h.m20094a();
            }
            if (m27619d > 128) {
                if (m27619d != 129) {
                    if (m27619d > 229) {
                        switch (m27619d) {
                            case 230:
                                return b.C40_ENCODE;
                            case 231:
                                return b.BASE256_ENCODE;
                            case 232:
                                set.add(Integer.valueOf(c9272j.m27658i()));
                                c9272j.m27652b((char) 29);
                                break;
                            case 233:
                            case 234:
                                break;
                            case 235:
                                z10 = true;
                                break;
                            case 236:
                                str = "[)>\u001e05\u001d";
                                c9272j.m27654d(str);
                                sb2.insert(0, "\u001e\u0004");
                                break;
                            case 237:
                                str = "[)>\u001e06\u001d";
                                c9272j.m27654d(str);
                                sb2.insert(0, "\u001e\u0004");
                                break;
                            case 238:
                                return b.ANSIX12_ENCODE;
                            case 239:
                                return b.TEXT_ENCODE;
                            case 240:
                                return b.EDIFACT_ENCODE;
                            case 241:
                                return b.ECI_ENCODE;
                            default:
                                if (m27619d != 254 || c9265c.m27616a() != 0) {
                                    throw C6947h.m20094a();
                                }
                                break;
                        }
                    } else {
                        int i10 = m27619d - 130;
                        if (i10 < 10) {
                            c9272j.m27652b('0');
                        }
                        c9272j.m27653c(i10);
                    }
                } else {
                    return b.PAD_ENCODE;
                }
            } else {
                if (z10) {
                    m27619d += RecognitionOptions.ITF;
                }
                c9272j.m27652b((char) (m27619d - 1));
                return b.ASCII_ENCODE;
            }
        } while (c9265c.m27616a() > 0);
        return b.ASCII_ENCODE;
    }

    /* renamed from: d */
    private static void m29711d(C9265c c9265c, C9272j c9272j, Collection<byte[]> collection) {
        int m27618c = c9265c.m27618c() + 1;
        int i10 = m27618c + 1;
        int m29717j = m29717j(c9265c.m27619d(8), m27618c);
        if (m29717j == 0) {
            m29717j = c9265c.m27616a() / 8;
        } else if (m29717j >= 250) {
            m29717j = ((m29717j - 249) * 250) + m29717j(c9265c.m27619d(8), i10);
            i10++;
        }
        if (m29717j < 0) {
            throw C6947h.m20094a();
        }
        byte[] bArr = new byte[m29717j];
        int i11 = 0;
        while (i11 < m29717j) {
            if (c9265c.m27616a() < 8) {
                throw C6947h.m20094a();
            }
            bArr[i11] = (byte) m29717j(c9265c.m27619d(8), i10);
            i11++;
            i10++;
        }
        collection.add(bArr);
        c9272j.m27654d(new String(bArr, StandardCharsets.ISO_8859_1));
    }

    /* renamed from: e */
    private static void m29712e(C9265c c9265c, C9272j c9272j, Set<Integer> set) {
        int m27619d;
        int i10;
        char c10;
        char c11;
        int[] iArr = new int[3];
        boolean z10 = false;
        int i11 = 0;
        while (c9265c.m27616a() != 8 && (m27619d = c9265c.m27619d(8)) != 254) {
            m29716i(m27619d, c9265c.m27619d(8), iArr);
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = iArr[i12];
                if (i11 != 0) {
                    if (i11 == 1) {
                        if (z10) {
                            i10 = i13 + RecognitionOptions.ITF;
                            c11 = (char) i10;
                            c9272j.m27652b(c11);
                            z10 = false;
                        }
                        c10 = (char) i13;
                        c9272j.m27652b(c10);
                    } else if (i11 == 2) {
                        char[] cArr = f24480b;
                        if (i13 < cArr.length) {
                            c10 = cArr[i13];
                            if (z10) {
                                c11 = (char) (c10 + 128);
                                c9272j.m27652b(c11);
                                z10 = false;
                            }
                        } else if (i13 == 27) {
                            set.add(Integer.valueOf(c9272j.m27658i()));
                            c10 = 29;
                        } else {
                            if (i13 != 30) {
                                throw C6947h.m20094a();
                            }
                            z10 = true;
                        }
                        c9272j.m27652b(c10);
                    } else {
                        if (i11 != 3) {
                            throw C6947h.m20094a();
                        }
                        if (z10) {
                            i10 = i13 + 224;
                            c11 = (char) i10;
                            c9272j.m27652b(c11);
                            z10 = false;
                        } else {
                            i13 += 96;
                            c10 = (char) i13;
                            c9272j.m27652b(c10);
                        }
                    }
                    i11 = 0;
                } else if (i13 < 3) {
                    i11 = i13 + 1;
                } else {
                    char[] cArr2 = f24479a;
                    if (i13 >= cArr2.length) {
                        throw C6947h.m20094a();
                    }
                    char c12 = cArr2[i13];
                    if (z10) {
                        c9272j.m27652b((char) (c12 + 128));
                        z10 = false;
                    } else {
                        c9272j.m27652b(c12);
                    }
                }
            }
            if (c9265c.m27616a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: f */
    private static void m29713f(C9265c c9265c, C9272j c9272j) {
        if (c9265c.m27616a() < 8) {
            throw C6947h.m20094a();
        }
        int m27619d = c9265c.m27619d(8);
        if (m27619d <= 127) {
            c9272j.m27656f(m27619d - 1);
        }
    }

    /* renamed from: g */
    private static void m29714g(C9265c c9265c, C9272j c9272j) {
        while (c9265c.m27616a() > 16) {
            for (int i10 = 0; i10 < 4; i10++) {
                int m27619d = c9265c.m27619d(6);
                if (m27619d == 31) {
                    int m27617b = 8 - c9265c.m27617b();
                    if (m27617b != 8) {
                        c9265c.m27619d(m27617b);
                        return;
                    }
                    return;
                }
                if ((m27619d & 32) == 0) {
                    m27619d |= 64;
                }
                c9272j.m27652b((char) m27619d);
            }
            if (c9265c.m27616a() <= 0) {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r3 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        r3 = (char) (r4 + 128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004c, code lost:
    
        if (r3 != false) goto L22;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m29715h(kg.C9265c r9, kg.C9272j r10, java.util.Set<java.lang.Integer> r11) {
        /*
            r0 = 3
            int[] r1 = new int[r0]
            r2 = 0
            r3 = r2
            r4 = r3
        L6:
            int r5 = r9.m27616a()
            r6 = 8
            if (r5 != r6) goto Lf
            return
        Lf:
            int r5 = r9.m27619d(r6)
            r7 = 254(0xfe, float:3.56E-43)
            if (r5 != r7) goto L18
            return
        L18:
            int r6 = r9.m27619d(r6)
            m29716i(r5, r6, r1)
            r5 = r2
        L20:
            if (r5 >= r0) goto L9e
            r6 = r1[r5]
            if (r4 == 0) goto L7c
            r7 = 1
            if (r4 == r7) goto L6c
            r8 = 2
            if (r4 == r8) goto L45
            if (r4 != r0) goto L40
            char[] r4 = p276og.C9942c.f24483e
            int r7 = r4.length
            if (r6 >= r7) goto L3b
            char r4 = r4[r6]
            if (r3 == 0) goto L77
        L37:
            int r4 = r4 + 128
            char r3 = (char) r4
            goto L71
        L3b:
            dg.h r9 = p066dg.C6947h.m20094a()
            throw r9
        L40:
            dg.h r9 = p066dg.C6947h.m20094a()
            throw r9
        L45:
            char[] r4 = p276og.C9942c.f24482d
            int r8 = r4.length
            if (r6 >= r8) goto L4f
            char r4 = r4[r6]
            if (r3 == 0) goto L77
            goto L37
        L4f:
            r4 = 27
            if (r6 == r4) goto L5e
            r3 = 30
            if (r6 != r3) goto L59
            r3 = r7
            goto L7a
        L59:
            dg.h r9 = p066dg.C6947h.m20094a()
            throw r9
        L5e:
            int r4 = r10.m27658i()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r11.add(r4)
            r4 = 29
            goto L77
        L6c:
            if (r3 == 0) goto L76
            int r6 = r6 + 128
            char r3 = (char) r6
        L71:
            r10.m27652b(r3)
            r3 = r2
            goto L7a
        L76:
            char r4 = (char) r6
        L77:
            r10.m27652b(r4)
        L7a:
            r4 = r2
            goto L96
        L7c:
            if (r6 >= r0) goto L82
            int r6 = r6 + 1
            r4 = r6
            goto L96
        L82:
            char[] r7 = p276og.C9942c.f24481c
            int r8 = r7.length
            if (r6 >= r8) goto L99
            char r6 = r7[r6]
            if (r3 == 0) goto L93
            int r6 = r6 + 128
            char r3 = (char) r6
            r10.m27652b(r3)
            r3 = r2
            goto L96
        L93:
            r10.m27652b(r6)
        L96:
            int r5 = r5 + 1
            goto L20
        L99:
            dg.h r9 = p066dg.C6947h.m20094a()
            throw r9
        L9e:
            int r5 = r9.m27616a()
            if (r5 > 0) goto L6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p276og.C9942c.m29715h(kg.c, kg.j, java.util.Set):void");
    }

    /* renamed from: i */
    private static void m29716i(int i10, int i11, int[] iArr) {
        int i12 = ((i10 << 8) + i11) - 1;
        int i13 = i12 / 1600;
        iArr[0] = i13;
        int i14 = i12 - (i13 * 1600);
        int i15 = i14 / 40;
        iArr[1] = i15;
        iArr[2] = i14 - (i15 * 40);
    }

    /* renamed from: j */
    private static int m29717j(int i10, int i11) {
        int i12 = i10 - (((i11 * 149) % 255) + 1);
        return i12 >= 0 ? i12 : i12 + RecognitionOptions.QR_CODE;
    }
}
