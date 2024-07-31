package qg;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class c implements g {
    private int b(h hVar, StringBuilder sb2, StringBuilder sb3, int i10) {
        int length = sb2.length();
        sb2.delete(length - i10, length);
        hVar.f23989f--;
        int c10 = c(hVar.c(), sb3);
        hVar.k();
        return c10;
    }

    private static String e(CharSequence charSequence) {
        int charAt = (charSequence.charAt(0) * 1600) + (charSequence.charAt(1) * '(') + charSequence.charAt(2) + 1;
        return new String(new char[]{(char) (charAt / RecognitionOptions.QR_CODE), (char) (charAt % RecognitionOptions.QR_CODE)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(h hVar, StringBuilder sb2) {
        hVar.s(e(sb2));
        sb2.delete(0, 3);
    }

    @Override // qg.g
    public void a(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!hVar.i()) {
                break;
            }
            char c10 = hVar.c();
            hVar.f23989f++;
            int c11 = c(c10, sb2);
            int a10 = hVar.a() + ((sb2.length() / 3) * 2);
            hVar.q(a10);
            int a11 = hVar.g().a() - a10;
            if (!hVar.i()) {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && a11 != 2) {
                    c11 = b(hVar, sb2, sb3, c11);
                }
                while (sb2.length() % 3 == 1) {
                    if (c11 > 3) {
                        c11 = b(hVar, sb2, sb3, c11);
                    } else if (a11 == 1) {
                        break;
                    } else {
                        c11 = b(hVar, sb2, sb3, c11);
                    }
                }
            } else if (sb2.length() % 3 == 0 && j.n(hVar.d(), hVar.f23989f, f()) != f()) {
                hVar.o(0);
                break;
            }
        }
        g(hVar, sb2);
    }

    int c(char c10, StringBuilder sb2) {
        int i10;
        int i11;
        char c11;
        if (c10 == ' ') {
            c11 = 3;
        } else {
            if (c10 >= '0' && c10 <= '9') {
                i11 = (c10 - '0') + 4;
            } else {
                if (c10 < 'A' || c10 > 'Z') {
                    if (c10 < ' ') {
                        sb2.append((char) 0);
                    } else {
                        if (c10 <= '/') {
                            sb2.append((char) 1);
                            i10 = c10 - '!';
                        } else if (c10 <= '@') {
                            sb2.append((char) 1);
                            i10 = (c10 - ':') + 15;
                        } else if (c10 <= '_') {
                            sb2.append((char) 1);
                            i10 = (c10 - '[') + 22;
                        } else {
                            if (c10 > 127) {
                                sb2.append("\u0001\u001e");
                                return c((char) (c10 - 128), sb2) + 2;
                            }
                            sb2.append((char) 2);
                            i10 = c10 - '`';
                        }
                        c10 = (char) i10;
                    }
                    sb2.append(c10);
                    return 2;
                }
                i11 = (c10 - 'A') + 14;
            }
            c11 = (char) i11;
        }
        sb2.append(c11);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = hVar.f23989f;
        int i11 = 0;
        int i12 = 0;
        while (hVar.i()) {
            char c10 = hVar.c();
            hVar.f23989f++;
            i12 = c(c10, sb2);
            if (sb2.length() % 3 == 0) {
                i10 = hVar.f23989f;
                i11 = sb2.length();
            }
        }
        if (i11 != sb2.length()) {
            int a10 = hVar.a() + ((sb2.length() / 3) * 2) + 1;
            hVar.q(a10);
            int a11 = hVar.g().a() - a10;
            int length = sb2.length() % 3;
            if ((length == 2 && a11 != 2) || (length == 1 && (i12 > 3 || a11 != 1))) {
                sb2.setLength(i11);
                hVar.f23989f = i10;
            }
        }
        if (sb2.length() > 0) {
            hVar.r((char) 230);
        }
        g(hVar, sb2);
    }

    public int f() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        if (r7.i() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r7.i() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void g(qg.h r7, java.lang.StringBuilder r8) {
        /*
            r6 = this;
            int r0 = r8.length()
            r1 = 3
            int r0 = r0 / r1
            r2 = 2
            int r0 = r0 * r2
            int r3 = r8.length()
            int r3 = r3 % r1
            int r4 = r7.a()
            int r4 = r4 + r0
            r7.q(r4)
            qg.l r0 = r7.g()
            int r0 = r0.a()
            int r0 = r0 - r4
            r4 = 0
            r5 = 254(0xfe, float:3.56E-43)
            if (r3 != r2) goto L3a
            r8.append(r4)
        L26:
            int r0 = r8.length()
            if (r0 < r1) goto L30
            h(r7, r8)
            goto L26
        L30:
            boolean r8 = r7.i()
            if (r8 == 0) goto L6d
        L36:
            r7.r(r5)
            goto L6d
        L3a:
            r2 = 1
            if (r0 != r2) goto L58
            if (r3 != r2) goto L58
        L3f:
            int r0 = r8.length()
            if (r0 < r1) goto L49
            h(r7, r8)
            goto L3f
        L49:
            boolean r8 = r7.i()
            if (r8 == 0) goto L52
            r7.r(r5)
        L52:
            int r8 = r7.f23989f
            int r8 = r8 - r2
            r7.f23989f = r8
            goto L6d
        L58:
            if (r3 != 0) goto L71
        L5a:
            int r2 = r8.length()
            if (r2 < r1) goto L64
            h(r7, r8)
            goto L5a
        L64:
            if (r0 > 0) goto L36
            boolean r8 = r7.i()
            if (r8 == 0) goto L6d
            goto L36
        L6d:
            r7.o(r4)
            return
        L71:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Unexpected case. Please report!"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.c.g(qg.h, java.lang.StringBuilder):void");
    }
}
