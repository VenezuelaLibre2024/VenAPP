package qg;

import com.google.android.gms.common.api.a;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class j {
    public static int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = i10;
        while (i11 < length && f(charSequence.charAt(i11))) {
            i11++;
        }
        return i11 - i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r8, qg.m r9, dg.f r10, dg.f r11, boolean r12) {
        /*
            qg.c r0 = new qg.c
            r0.<init>()
            r1 = 6
            qg.g[] r1 = new qg.g[r1]
            qg.a r2 = new qg.a
            r2.<init>()
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r0
            qg.n r4 = new qg.n
            r4.<init>()
            r5 = 2
            r1[r5] = r4
            qg.o r4 = new qg.o
            r4.<init>()
            r6 = 3
            r1[r6] = r4
            qg.f r4 = new qg.f
            r4.<init>()
            r6 = 4
            r1[r6] = r4
            qg.b r4 = new qg.b
            r4.<init>()
            r7 = 5
            r1[r7] = r4
            qg.h r4 = new qg.h
            r4.<init>(r8)
            r4.n(r9)
            r4.l(r10, r11)
            java.lang.String r9 = "[)>\u001e05\u001d"
            boolean r9 = r8.startsWith(r9)
            java.lang.String r10 = "\u001e\u0004"
            if (r9 == 0) goto L5d
            boolean r9 = r8.endsWith(r10)
            if (r9 == 0) goto L5d
            r8 = 236(0xec, float:3.31E-43)
        L50:
            r4.r(r8)
            r4.m(r5)
            int r8 = r4.f23989f
            int r8 = r8 + 7
            r4.f23989f = r8
            goto L6e
        L5d:
            java.lang.String r9 = "[)>\u001e06\u001d"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L6e
            boolean r8 = r8.endsWith(r10)
            if (r8 == 0) goto L6e
            r8 = 237(0xed, float:3.32E-43)
            goto L50
        L6e:
            if (r12 == 0) goto L7a
            r0.d(r4)
        L73:
            int r3 = r4.e()
            r4.j()
        L7a:
            boolean r8 = r4.i()
            if (r8 == 0) goto L8c
            r8 = r1[r3]
            r8.a(r4)
            int r8 = r4.e()
            if (r8 < 0) goto L7a
            goto L73
        L8c:
            int r8 = r4.a()
            r4.p()
            qg.l r9 = r4.g()
            int r9 = r9.a()
            if (r8 >= r9) goto La8
            if (r3 == 0) goto La8
            if (r3 == r7) goto La8
            if (r3 == r6) goto La8
            r8 = 254(0xfe, float:3.56E-43)
            r4.r(r8)
        La8:
            java.lang.StringBuilder r8 = r4.b()
            int r10 = r8.length()
            if (r10 >= r9) goto Lb7
            r10 = 129(0x81, float:1.81E-43)
        Lb4:
            r8.append(r10)
        Lb7:
            int r10 = r8.length()
            if (r10 >= r9) goto Lc7
            int r10 = r8.length()
            int r10 = r10 + r2
            char r10 = r(r10)
            goto Lb4
        Lc7:
            java.lang.StringBuilder r8 = r4.b()
            java.lang.String r8 = r8.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.j.b(java.lang.String, qg.m, dg.f, dg.f, boolean):java.lang.String");
    }

    private static int c(float[] fArr, int[] iArr, int i10, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i11 = 0; i11 < 6; i11++) {
            int ceil = (int) Math.ceil(fArr[i11]);
            iArr[i11] = ceil;
            if (i10 > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i10 = ceil;
            }
            if (i10 == ceil) {
                bArr[i11] = (byte) (bArr[i11] + 1);
            }
        }
        return i10;
    }

    private static int d(byte[] bArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 += bArr[i11];
        }
        return i10;
    }

    public static void e(char c10) {
        String hexString = Integer.toHexString(c10);
        throw new IllegalArgumentException("Illegal character: " + c10 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    public static boolean f(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    public static boolean g(char c10) {
        return c10 >= 128 && c10 <= 255;
    }

    public static boolean h(char c10) {
        return c10 == ' ' || (c10 >= '0' && c10 <= '9') || (c10 >= 'A' && c10 <= 'Z');
    }

    public static boolean i(char c10) {
        return c10 >= ' ' && c10 <= '^';
    }

    public static boolean j(char c10) {
        return c10 == ' ' || (c10 >= '0' && c10 <= '9') || (c10 >= 'a' && c10 <= 'z');
    }

    public static boolean k(char c10) {
        return m(c10) || c10 == ' ' || (c10 >= '0' && c10 <= '9') || (c10 >= 'A' && c10 <= 'Z');
    }

    private static boolean l(char c10) {
        return false;
    }

    private static boolean m(char c10) {
        return c10 == '\r' || c10 == '*' || c10 == '>';
    }

    public static int n(CharSequence charSequence, int i10, int i11) {
        int o10 = o(charSequence, i10, i11);
        if (i11 == 3 && o10 == 3) {
            int min = Math.min(i10 + 3, charSequence.length());
            while (i10 < min) {
                if (!k(charSequence.charAt(i10))) {
                    return 0;
                }
                i10++;
            }
        } else if (i11 == 4 && o10 == 4) {
            int min2 = Math.min(i10 + 4, charSequence.length());
            while (i10 < min2) {
                if (!i(charSequence.charAt(i10))) {
                    return 0;
                }
                i10++;
            }
        }
        return o10;
    }

    static int o(CharSequence charSequence, int i10, int i11) {
        char c10;
        if (i10 >= charSequence.length()) {
            return i11;
        }
        int i12 = 6;
        float[] fArr = {1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
        if (i11 == 0) {
            // fill-array-data instruction
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            fArr[2] = 1.0f;
            fArr[3] = 1.0f;
            fArr[4] = 1.0f;
            fArr[5] = 1.25f;
        } else {
            fArr[i11] = 0.0f;
        }
        int i13 = 0;
        while (true) {
            int i14 = i10 + i13;
            if (i14 == charSequence.length()) {
                byte[] bArr = new byte[i12];
                int[] iArr = new int[i12];
                int c11 = c(fArr, iArr, a.e.API_PRIORITY_OTHER, bArr);
                int d10 = d(bArr);
                if (iArr[0] == c11) {
                    return 0;
                }
                if (d10 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (d10 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (d10 != 1 || bArr[2] <= 0) {
                    return (d10 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt = charSequence.charAt(i14);
            i13++;
            if (f(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (g(charAt)) {
                float ceil = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil;
                fArr[0] = ceil + 2.0f;
            } else {
                float ceil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil2;
                fArr[0] = ceil2 + 1.0f;
            }
            if (h(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (j(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (k(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (i(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (g(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (l(charAt)) {
                c10 = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c10 = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i13 >= 4) {
                int[] iArr2 = new int[i12];
                c(fArr, iArr2, a.e.API_PRIORITY_OTHER, new byte[i12]);
                if (iArr2[0] < q(iArr2[c10], iArr2[1], iArr2[2], iArr2[3], iArr2[4])) {
                    return 0;
                }
                int i15 = iArr2[c10];
                if (i15 < iArr2[0] || i15 + 1 < p(iArr2[1], iArr2[2], iArr2[3], iArr2[4])) {
                    return 5;
                }
                if (iArr2[4] + 1 < q(iArr2[5], iArr2[1], iArr2[2], iArr2[3], iArr2[0])) {
                    return 4;
                }
                if (iArr2[2] + 1 < q(iArr2[5], iArr2[1], iArr2[4], iArr2[3], iArr2[0])) {
                    return 2;
                }
                if (iArr2[3] + 1 < q(iArr2[5], iArr2[1], iArr2[4], iArr2[2], iArr2[0])) {
                    return 3;
                }
                if (iArr2[1] + 1 >= p(iArr2[0], iArr2[5], iArr2[4], iArr2[2])) {
                    continue;
                } else {
                    int i16 = iArr2[1];
                    int i17 = iArr2[3];
                    if (i16 < i17) {
                        return 1;
                    }
                    if (i16 == i17) {
                        for (int i18 = i10 + i13 + 1; i18 < charSequence.length(); i18++) {
                            char charAt2 = charSequence.charAt(i18);
                            if (m(charAt2)) {
                                return 3;
                            }
                            if (!k(charAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            }
            i12 = 6;
        }
    }

    private static int p(int i10, int i11, int i12, int i13) {
        return Math.min(i10, Math.min(i11, Math.min(i12, i13)));
    }

    private static int q(int i10, int i11, int i12, int i13, int i14) {
        return Math.min(p(i10, i11, i12, i13), i14);
    }

    private static char r(int i10) {
        int i11 = ((i10 * 149) % 253) + 1 + 129;
        if (i11 > 254) {
            i11 -= 254;
        }
        return (char) i11;
    }
}
