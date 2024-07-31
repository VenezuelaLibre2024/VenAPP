package p314qg;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qg.o */
/* loaded from: classes2.dex */
public final class C10490o extends C10478c {
    @Override // p314qg.C10478c, p314qg.InterfaceC10482g
    /* renamed from: a */
    public void mo31420a(C10483h c10483h) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!c10483h.m31455i()) {
                break;
            }
            char m31450c = c10483h.m31450c();
            c10483h.f26031f++;
            mo31427c(m31450c, sb2);
            if (sb2.length() % 3 == 0) {
                C10478c.m31426h(c10483h, sb2);
                if (C10485j.m31481n(c10483h.m31451d(), c10483h.f26031f, mo31429f()) != mo31429f()) {
                    c10483h.m31461o(0);
                    break;
                }
            }
        }
        mo31430g(c10483h, sb2);
    }

    @Override // p314qg.C10478c
    /* renamed from: c */
    int mo31427c(char c10, StringBuilder sb2) {
        char c11;
        int i10;
        if (c10 == '\r') {
            c11 = 0;
        } else {
            if (c10 != ' ') {
                if (c10 == '*') {
                    sb2.append((char) 1);
                } else if (c10 != '>') {
                    if (c10 >= '0' && c10 <= '9') {
                        i10 = (c10 - '0') + 4;
                    } else if (c10 < 'A' || c10 > 'Z') {
                        C10485j.m31472e(c10);
                    } else {
                        i10 = (c10 - 'A') + 14;
                    }
                    c11 = (char) i10;
                } else {
                    c11 = 2;
                }
                return 1;
            }
            c11 = 3;
        }
        sb2.append(c11);
        return 1;
    }

    @Override // p314qg.C10478c
    /* renamed from: f */
    public int mo31429f() {
        return 3;
    }

    @Override // p314qg.C10478c
    /* renamed from: g */
    void mo31430g(C10483h c10483h, StringBuilder sb2) {
        c10483h.m31462p();
        int m31537a = c10483h.m31454g().m31537a() - c10483h.m31448a();
        c10483h.f26031f -= sb2.length();
        if (c10483h.m31453f() > 1 || m31537a > 1 || c10483h.m31453f() != m31537a) {
            c10483h.m31464r((char) 254);
        }
        if (c10483h.m31452e() < 0) {
            c10483h.m31461o(0);
        }
    }
}
