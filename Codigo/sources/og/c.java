package og;

import com.google.android.libraries.barhopper.RecognitionOptions;
import dg.h;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Set;
import kg.j;

/* loaded from: classes2.dex */
final class c {

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f22547b;

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f22549d;

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f22546a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f22548c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: e, reason: collision with root package name */
    private static final char[] f22550e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22551a;

        static {
            int[] iArr = new int[b.values().length];
            f22551a = iArr;
            try {
                iArr[b.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22551a[b.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22551a[b.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22551a[b.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22551a[b.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22551a[b.ECI_ENCODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
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
        f22547b = cArr;
        f22549d = cArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kg.e a(byte[] r13) {
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
            og.c$b r8 = og.c.b.ASCII_ENCODE
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
        L27:
            og.c$b r10 = og.c.b.ASCII_ENCODE
            if (r8 != r10) goto L30
            og.c$b r8 = c(r0, r1, r2, r9)
            goto L59
        L30:
            int[] r11 = og.c.a.f22551a
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
            dg.h r13 = dg.h.a()
            throw r13
        L40:
            f(r0, r1)
            r3 = r6
            goto L58
        L45:
            d(r0, r1, r5)
            goto L58
        L49:
            g(r0, r1)
            goto L58
        L4d:
            b(r0, r1)
            goto L58
        L51:
            h(r0, r1, r9)
            goto L58
        L55:
            e(r0, r1, r9)
        L58:
            r8 = r10
        L59:
            og.c$b r10 = og.c.b.PAD_ENCODE
            if (r8 == r10) goto L63
            int r10 = r0.a()
            if (r10 > 0) goto L27
        L63:
            int r0 = r2.length()
            if (r0 <= 0) goto L6c
            r1.e(r2)
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
        throw new UnsupportedOperationException("Method not decompiled: og.c.a(byte[]):kg.e");
    }

    private static void b(kg.c cVar, j jVar) {
        int d10;
        char c10;
        int i10;
        int[] iArr = new int[3];
        while (cVar.a() != 8 && (d10 = cVar.d(8)) != 254) {
            i(d10, cVar.d(8), iArr);
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
                            throw h.a();
                        }
                        i10 = i12 + 51;
                    }
                    c10 = (char) i10;
                } else {
                    c10 = ' ';
                }
                jVar.b(c10);
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0037. Please report as an issue. */
    private static b c(kg.c cVar, j jVar, StringBuilder sb2, Set<Integer> set) {
        String str;
        boolean z10 = false;
        do {
            int d10 = cVar.d(8);
            if (d10 == 0) {
                throw h.a();
            }
            if (d10 > 128) {
                if (d10 != 129) {
                    if (d10 > 229) {
                        switch (d10) {
                            case 230:
                                return b.C40_ENCODE;
                            case 231:
                                return b.BASE256_ENCODE;
                            case 232:
                                set.add(Integer.valueOf(jVar.i()));
                                jVar.b((char) 29);
                                break;
                            case 233:
                            case 234:
                                break;
                            case 235:
                                z10 = true;
                                break;
                            case 236:
                                str = "[)>\u001e05\u001d";
                                jVar.d(str);
                                sb2.insert(0, "\u001e\u0004");
                                break;
                            case 237:
                                str = "[)>\u001e06\u001d";
                                jVar.d(str);
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
                                if (d10 != 254 || cVar.a() != 0) {
                                    throw h.a();
                                }
                                break;
                        }
                    } else {
                        int i10 = d10 - 130;
                        if (i10 < 10) {
                            jVar.b('0');
                        }
                        jVar.c(i10);
                    }
                } else {
                    return b.PAD_ENCODE;
                }
            } else {
                if (z10) {
                    d10 += RecognitionOptions.ITF;
                }
                jVar.b((char) (d10 - 1));
                return b.ASCII_ENCODE;
            }
        } while (cVar.a() > 0);
        return b.ASCII_ENCODE;
    }

    private static void d(kg.c cVar, j jVar, Collection<byte[]> collection) {
        int c10 = cVar.c() + 1;
        int i10 = c10 + 1;
        int j10 = j(cVar.d(8), c10);
        if (j10 == 0) {
            j10 = cVar.a() / 8;
        } else if (j10 >= 250) {
            j10 = ((j10 - 249) * 250) + j(cVar.d(8), i10);
            i10++;
        }
        if (j10 < 0) {
            throw h.a();
        }
        byte[] bArr = new byte[j10];
        int i11 = 0;
        while (i11 < j10) {
            if (cVar.a() < 8) {
                throw h.a();
            }
            bArr[i11] = (byte) j(cVar.d(8), i10);
            i11++;
            i10++;
        }
        collection.add(bArr);
        jVar.d(new String(bArr, StandardCharsets.ISO_8859_1));
    }

    private static void e(kg.c cVar, j jVar, Set<Integer> set) {
        int d10;
        int i10;
        char c10;
        char c11;
        int[] iArr = new int[3];
        boolean z10 = false;
        int i11 = 0;
        while (cVar.a() != 8 && (d10 = cVar.d(8)) != 254) {
            i(d10, cVar.d(8), iArr);
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = iArr[i12];
                if (i11 != 0) {
                    if (i11 == 1) {
                        if (z10) {
                            i10 = i13 + RecognitionOptions.ITF;
                            c11 = (char) i10;
                            jVar.b(c11);
                            z10 = false;
                        }
                        c10 = (char) i13;
                        jVar.b(c10);
                    } else if (i11 == 2) {
                        char[] cArr = f22547b;
                        if (i13 < cArr.length) {
                            c10 = cArr[i13];
                            if (z10) {
                                c11 = (char) (c10 + 128);
                                jVar.b(c11);
                                z10 = false;
                            }
                        } else if (i13 == 27) {
                            set.add(Integer.valueOf(jVar.i()));
                            c10 = 29;
                        } else {
                            if (i13 != 30) {
                                throw h.a();
                            }
                            z10 = true;
                        }
                        jVar.b(c10);
                    } else {
                        if (i11 != 3) {
                            throw h.a();
                        }
                        if (z10) {
                            i10 = i13 + 224;
                            c11 = (char) i10;
                            jVar.b(c11);
                            z10 = false;
                        } else {
                            i13 += 96;
                            c10 = (char) i13;
                            jVar.b(c10);
                        }
                    }
                    i11 = 0;
                } else if (i13 < 3) {
                    i11 = i13 + 1;
                } else {
                    char[] cArr2 = f22546a;
                    if (i13 >= cArr2.length) {
                        throw h.a();
                    }
                    char c12 = cArr2[i13];
                    if (z10) {
                        jVar.b((char) (c12 + 128));
                        z10 = false;
                    } else {
                        jVar.b(c12);
                    }
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static void f(kg.c cVar, j jVar) {
        if (cVar.a() < 8) {
            throw h.a();
        }
        int d10 = cVar.d(8);
        if (d10 <= 127) {
            jVar.f(d10 - 1);
        }
    }

    private static void g(kg.c cVar, j jVar) {
        while (cVar.a() > 16) {
            for (int i10 = 0; i10 < 4; i10++) {
                int d10 = cVar.d(6);
                if (d10 == 31) {
                    int b10 = 8 - cVar.b();
                    if (b10 != 8) {
                        cVar.d(b10);
                        return;
                    }
                    return;
                }
                if ((d10 & 32) == 0) {
                    d10 |= 64;
                }
                jVar.b((char) d10);
            }
            if (cVar.a() <= 0) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(kg.c r9, kg.j r10, java.util.Set<java.lang.Integer> r11) {
        /*
            r0 = 3
            int[] r1 = new int[r0]
            r2 = 0
            r3 = r2
            r4 = r3
        L6:
            int r5 = r9.a()
            r6 = 8
            if (r5 != r6) goto Lf
            return
        Lf:
            int r5 = r9.d(r6)
            r7 = 254(0xfe, float:3.56E-43)
            if (r5 != r7) goto L18
            return
        L18:
            int r6 = r9.d(r6)
            i(r5, r6, r1)
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
            char[] r4 = og.c.f22550e
            int r7 = r4.length
            if (r6 >= r7) goto L3b
            char r4 = r4[r6]
            if (r3 == 0) goto L77
        L37:
            int r4 = r4 + 128
            char r3 = (char) r4
            goto L71
        L3b:
            dg.h r9 = dg.h.a()
            throw r9
        L40:
            dg.h r9 = dg.h.a()
            throw r9
        L45:
            char[] r4 = og.c.f22549d
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
            dg.h r9 = dg.h.a()
            throw r9
        L5e:
            int r4 = r10.i()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r11.add(r4)
            r4 = 29
            goto L77
        L6c:
            if (r3 == 0) goto L76
            int r6 = r6 + 128
            char r3 = (char) r6
        L71:
            r10.b(r3)
            r3 = r2
            goto L7a
        L76:
            char r4 = (char) r6
        L77:
            r10.b(r4)
        L7a:
            r4 = r2
            goto L96
        L7c:
            if (r6 >= r0) goto L82
            int r6 = r6 + 1
            r4 = r6
            goto L96
        L82:
            char[] r7 = og.c.f22548c
            int r8 = r7.length
            if (r6 >= r8) goto L99
            char r6 = r7[r6]
            if (r3 == 0) goto L93
            int r6 = r6 + 128
            char r3 = (char) r6
            r10.b(r3)
            r3 = r2
            goto L96
        L93:
            r10.b(r6)
        L96:
            int r5 = r5 + 1
            goto L20
        L99:
            dg.h r9 = dg.h.a()
            throw r9
        L9e:
            int r5 = r9.a()
            if (r5 > 0) goto L6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: og.c.h(kg.c, kg.j, java.util.Set):void");
    }

    private static void i(int i10, int i11, int[] iArr) {
        int i12 = ((i10 << 8) + i11) - 1;
        int i13 = i12 / 1600;
        iArr[0] = i13;
        int i14 = i12 - (i13 * 1600);
        int i15 = i14 / 40;
        iArr[1] = i15;
        iArr[2] = i14 - (i15 * 40);
    }

    private static int j(int i10, int i11) {
        int i12 = i10 - (((i11 * 149) % 255) + 1);
        return i12 >= 0 ? i12 : i12 + RecognitionOptions.QR_CODE;
    }
}
