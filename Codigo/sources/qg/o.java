package qg;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class o extends c {
    @Override // qg.c, qg.g
    public void a(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!hVar.i()) {
                break;
            }
            char c10 = hVar.c();
            hVar.f23989f++;
            c(c10, sb2);
            if (sb2.length() % 3 == 0) {
                c.h(hVar, sb2);
                if (j.n(hVar.d(), hVar.f23989f, f()) != f()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        g(hVar, sb2);
    }

    @Override // qg.c
    int c(char c10, StringBuilder sb2) {
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
                        j.e(c10);
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

    @Override // qg.c
    public int f() {
        return 3;
    }

    @Override // qg.c
    void g(h hVar, StringBuilder sb2) {
        hVar.p();
        int a10 = hVar.g().a() - hVar.a();
        hVar.f23989f -= sb2.length();
        if (hVar.f() > 1 || a10 > 1 || hVar.f() != a10) {
            hVar.r((char) 254);
        }
        if (hVar.e() < 0) {
            hVar.o(0);
        }
    }
}
