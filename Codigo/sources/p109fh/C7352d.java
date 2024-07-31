package p109fh;

/* renamed from: fh.d */
/* loaded from: classes2.dex */
final class C7352d {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m22121a(C7350b c7350b) {
        return m22122b(c7350b, true) + m22122b(c7350b, false);
    }

    /* renamed from: b */
    private static int m22122b(C7350b c7350b, boolean z10) {
        int m22095d = z10 ? c7350b.m22095d() : c7350b.m22096e();
        int m22096e = z10 ? c7350b.m22096e() : c7350b.m22095d();
        byte[][] m22094c = c7350b.m22094c();
        int i10 = 0;
        for (int i11 = 0; i11 < m22095d; i11++) {
            byte b10 = -1;
            int i12 = 0;
            for (int i13 = 0; i13 < m22096e; i13++) {
                byte b11 = z10 ? m22094c[i11][i13] : m22094c[i13][i11];
                if (b11 == b10) {
                    i12++;
                } else {
                    if (i12 >= 5) {
                        i10 += (i12 - 5) + 3;
                    }
                    i12 = 1;
                    b10 = b11;
                }
            }
            if (i12 >= 5) {
                i10 += (i12 - 5) + 3;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m22123c(C7350b c7350b) {
        byte[][] m22094c = c7350b.m22094c();
        int m22096e = c7350b.m22096e();
        int m22095d = c7350b.m22095d();
        int i10 = 0;
        for (int i11 = 0; i11 < m22095d - 1; i11++) {
            byte[] bArr = m22094c[i11];
            int i12 = 0;
            while (i12 < m22096e - 1) {
                byte b10 = bArr[i12];
                int i13 = i12 + 1;
                if (b10 == bArr[i13]) {
                    byte[] bArr2 = m22094c[i11 + 1];
                    if (b10 == bArr2[i12] && b10 == bArr2[i13]) {
                        i10++;
                    }
                }
                i12 = i13;
            }
        }
        return i10 * 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m22124d(C7350b c7350b) {
        byte[][] m22094c = c7350b.m22094c();
        int m22096e = c7350b.m22096e();
        int m22095d = c7350b.m22095d();
        int i10 = 0;
        for (int i11 = 0; i11 < m22095d; i11++) {
            for (int i12 = 0; i12 < m22096e; i12++) {
                byte[] bArr = m22094c[i11];
                int i13 = i12 + 6;
                if (i13 < m22096e && bArr[i12] == 1 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 1 && bArr[i12 + 3] == 1 && bArr[i12 + 4] == 1 && bArr[i12 + 5] == 0 && bArr[i13] == 1 && (m22127g(bArr, i12 - 4, i12) || m22127g(bArr, i12 + 7, i12 + 11))) {
                    i10++;
                }
                int i14 = i11 + 6;
                if (i14 < m22095d && m22094c[i11][i12] == 1 && m22094c[i11 + 1][i12] == 0 && m22094c[i11 + 2][i12] == 1 && m22094c[i11 + 3][i12] == 1 && m22094c[i11 + 4][i12] == 1 && m22094c[i11 + 5][i12] == 0 && m22094c[i14][i12] == 1 && (m22128h(m22094c, i12, i11 - 4, i11) || m22128h(m22094c, i12, i11 + 7, i11 + 11))) {
                    i10++;
                }
            }
        }
        return i10 * 40;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m22125e(C7350b c7350b) {
        byte[][] m22094c = c7350b.m22094c();
        int m22096e = c7350b.m22096e();
        int m22095d = c7350b.m22095d();
        int i10 = 0;
        for (int i11 = 0; i11 < m22095d; i11++) {
            byte[] bArr = m22094c[i11];
            for (int i12 = 0; i12 < m22096e; i12++) {
                if (bArr[i12] == 1) {
                    i10++;
                }
            }
        }
        int m22095d2 = c7350b.m22095d() * c7350b.m22096e();
        return ((Math.abs((i10 * 2) - m22095d2) * 10) / m22095d2) * 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0001. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0045 A[ORIG_RETURN, RETURN] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m22126f(int r1, int r2, int r3) {
        /*
            r0 = 1
            switch(r1) {
                case 0: goto L3f;
                case 1: goto L40;
                case 2: goto L3c;
                case 3: goto L38;
                case 4: goto L33;
                case 5: goto L2c;
                case 6: goto L24;
                case 7: goto L1b;
                default: goto L4;
            }
        L4:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Invalid mask pattern: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L1b:
            int r1 = r3 * r2
            int r1 = r1 % 3
            int r3 = r3 + r2
            r2 = r3 & 1
            int r1 = r1 + r2
            goto L2a
        L24:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
        L2a:
            r1 = r1 & r0
            goto L42
        L2c:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L42
        L33:
            int r3 = r3 / 2
            int r2 = r2 / 3
            goto L3f
        L38:
            int r3 = r3 + r2
            int r1 = r3 % 3
            goto L42
        L3c:
            int r1 = r2 % 3
            goto L42
        L3f:
            int r3 = r3 + r2
        L40:
            r1 = r3 & 1
        L42:
            if (r1 != 0) goto L45
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p109fh.C7352d.m22126f(int, int, int):boolean");
    }

    /* renamed from: g */
    private static boolean m22127g(byte[] bArr, int i10, int i11) {
        if (i10 < 0 || bArr.length < i11) {
            return false;
        }
        while (i10 < i11) {
            if (bArr[i10] == 1) {
                return false;
            }
            i10++;
        }
        return true;
    }

    /* renamed from: h */
    private static boolean m22128h(byte[][] bArr, int i10, int i11, int i12) {
        if (i11 < 0 || bArr.length < i12) {
            return false;
        }
        while (i11 < i12) {
            if (bArr[i11][i10] == 1) {
                return false;
            }
            i11++;
        }
        return true;
    }
}
