package p314qg;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qg.c */
/* loaded from: classes2.dex */
public class C10478c implements InterfaceC10482g {
    /* renamed from: b */
    private int m31424b(C10483h c10483h, StringBuilder sb2, StringBuilder sb3, int i10) {
        int length = sb2.length();
        sb2.delete(length - i10, length);
        c10483h.f26031f--;
        int mo31427c = mo31427c(c10483h.m31450c(), sb3);
        c10483h.m31457k();
        return mo31427c;
    }

    /* renamed from: e */
    private static String m31425e(CharSequence charSequence) {
        int charAt = (charSequence.charAt(0) * 1600) + (charSequence.charAt(1) * '(') + charSequence.charAt(2) + 1;
        return new String(new char[]{(char) (charAt / RecognitionOptions.QR_CODE), (char) (charAt % RecognitionOptions.QR_CODE)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static void m31426h(C10483h c10483h, StringBuilder sb2) {
        c10483h.m31465s(m31425e(sb2));
        sb2.delete(0, 3);
    }

    @Override // p314qg.InterfaceC10482g
    /* renamed from: a */
    public void mo31420a(C10483h c10483h) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!c10483h.m31455i()) {
                break;
            }
            char m31450c = c10483h.m31450c();
            c10483h.f26031f++;
            int mo31427c = mo31427c(m31450c, sb2);
            int m31448a = c10483h.m31448a() + ((sb2.length() / 3) * 2);
            c10483h.m31463q(m31448a);
            int m31537a = c10483h.m31454g().m31537a() - m31448a;
            if (!c10483h.m31455i()) {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && m31537a != 2) {
                    mo31427c = m31424b(c10483h, sb2, sb3, mo31427c);
                }
                while (sb2.length() % 3 == 1) {
                    if (mo31427c > 3) {
                        mo31427c = m31424b(c10483h, sb2, sb3, mo31427c);
                    } else if (m31537a == 1) {
                        break;
                    } else {
                        mo31427c = m31424b(c10483h, sb2, sb3, mo31427c);
                    }
                }
            } else if (sb2.length() % 3 == 0 && C10485j.m31481n(c10483h.m31451d(), c10483h.f26031f, mo31429f()) != mo31429f()) {
                c10483h.m31461o(0);
                break;
            }
        }
        mo31430g(c10483h, sb2);
    }

    /* renamed from: c */
    int mo31427c(char c10, StringBuilder sb2) {
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
                                return mo31427c((char) (c10 - 128), sb2) + 2;
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
    /* renamed from: d */
    public void m31428d(C10483h c10483h) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = c10483h.f26031f;
        int i11 = 0;
        int i12 = 0;
        while (c10483h.m31455i()) {
            char m31450c = c10483h.m31450c();
            c10483h.f26031f++;
            i12 = mo31427c(m31450c, sb2);
            if (sb2.length() % 3 == 0) {
                i10 = c10483h.f26031f;
                i11 = sb2.length();
            }
        }
        if (i11 != sb2.length()) {
            int m31448a = c10483h.m31448a() + ((sb2.length() / 3) * 2) + 1;
            c10483h.m31463q(m31448a);
            int m31537a = c10483h.m31454g().m31537a() - m31448a;
            int length = sb2.length() % 3;
            if ((length == 2 && m31537a != 2) || (length == 1 && (i12 > 3 || m31537a != 1))) {
                sb2.setLength(i11);
                c10483h.f26031f = i10;
            }
        }
        if (sb2.length() > 0) {
            c10483h.m31464r((char) 230);
        }
        mo31430g(c10483h, sb2);
    }

    /* renamed from: f */
    public int mo31429f() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        if (r7.m31455i() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r7.m31455i() != false) goto L10;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void mo31430g(p314qg.C10483h r7, java.lang.StringBuilder r8) {
        /*
            r6 = this;
            int r0 = r8.length()
            r1 = 3
            int r0 = r0 / r1
            r2 = 2
            int r0 = r0 * r2
            int r3 = r8.length()
            int r3 = r3 % r1
            int r4 = r7.m31448a()
            int r4 = r4 + r0
            r7.m31463q(r4)
            qg.l r0 = r7.m31454g()
            int r0 = r0.m31537a()
            int r0 = r0 - r4
            r4 = 0
            r5 = 254(0xfe, float:3.56E-43)
            if (r3 != r2) goto L3a
            r8.append(r4)
        L26:
            int r0 = r8.length()
            if (r0 < r1) goto L30
            m31426h(r7, r8)
            goto L26
        L30:
            boolean r8 = r7.m31455i()
            if (r8 == 0) goto L6d
        L36:
            r7.m31464r(r5)
            goto L6d
        L3a:
            r2 = 1
            if (r0 != r2) goto L58
            if (r3 != r2) goto L58
        L3f:
            int r0 = r8.length()
            if (r0 < r1) goto L49
            m31426h(r7, r8)
            goto L3f
        L49:
            boolean r8 = r7.m31455i()
            if (r8 == 0) goto L52
            r7.m31464r(r5)
        L52:
            int r8 = r7.f26031f
            int r8 = r8 - r2
            r7.f26031f = r8
            goto L6d
        L58:
            if (r3 != 0) goto L71
        L5a:
            int r2 = r8.length()
            if (r2 < r1) goto L64
            m31426h(r7, r8)
            goto L5a
        L64:
            if (r0 > 0) goto L36
            boolean r8 = r7.m31455i()
            if (r8 == 0) goto L6d
            goto L36
        L6d:
            r7.m31461o(r4)
            return
        L71:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Unexpected case. Please report!"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p314qg.C10478c.mo31430g(qg.h, java.lang.StringBuilder):void");
    }
}
