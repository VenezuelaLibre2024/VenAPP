package p314qg;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qg.a */
/* loaded from: classes2.dex */
public final class C10476a implements InterfaceC10482g {
    /* renamed from: b */
    private static char m31419b(char c10, char c11) {
        if (C10485j.m31473f(c10) && C10485j.m31473f(c11)) {
            return (char) (((c10 - '0') * 10) + (c11 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c10 + c11);
    }

    @Override // p314qg.InterfaceC10482g
    /* renamed from: a */
    public void mo31420a(C10483h c10483h) {
        int i10;
        char c10;
        if (C10485j.m31468a(c10483h.m31451d(), c10483h.f26031f) >= 2) {
            c10483h.m31464r(m31419b(c10483h.m31451d().charAt(c10483h.f26031f), c10483h.m31451d().charAt(c10483h.f26031f + 1)));
            i10 = c10483h.f26031f + 2;
        } else {
            char m31450c = c10483h.m31450c();
            int m31481n = C10485j.m31481n(c10483h.m31451d(), c10483h.f26031f, m31421c());
            if (m31481n != m31421c()) {
                if (m31481n == 1) {
                    c10483h.m31464r((char) 230);
                    c10483h.m31461o(1);
                    return;
                }
                if (m31481n == 2) {
                    c10483h.m31464r((char) 239);
                    c10483h.m31461o(2);
                    return;
                }
                int i11 = 3;
                if (m31481n != 3) {
                    i11 = 4;
                    if (m31481n != 4) {
                        if (m31481n == 5) {
                            c10483h.m31464r((char) 231);
                            c10483h.m31461o(5);
                            return;
                        } else {
                            throw new IllegalStateException("Illegal mode: " + m31481n);
                        }
                    }
                    c10 = 240;
                } else {
                    c10 = 238;
                }
                c10483h.m31464r(c10);
                c10483h.m31461o(i11);
                return;
            }
            boolean m31474g = C10485j.m31474g(m31450c);
            int i12 = m31450c;
            if (m31474g) {
                c10483h.m31464r((char) 235);
                i12 = m31450c - 128;
            }
            c10483h.m31464r((char) (i12 + 1));
            i10 = c10483h.f26031f + 1;
        }
        c10483h.f26031f = i10;
    }

    /* renamed from: c */
    public int m31421c() {
        return 0;
    }
}
