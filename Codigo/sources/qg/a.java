package qg;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a implements g {
    private static char b(char c10, char c11) {
        if (j.f(c10) && j.f(c11)) {
            return (char) (((c10 - '0') * 10) + (c11 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c10 + c11);
    }

    @Override // qg.g
    public void a(h hVar) {
        int i10;
        char c10;
        if (j.a(hVar.d(), hVar.f23989f) >= 2) {
            hVar.r(b(hVar.d().charAt(hVar.f23989f), hVar.d().charAt(hVar.f23989f + 1)));
            i10 = hVar.f23989f + 2;
        } else {
            char c11 = hVar.c();
            int n10 = j.n(hVar.d(), hVar.f23989f, c());
            if (n10 != c()) {
                if (n10 == 1) {
                    hVar.r((char) 230);
                    hVar.o(1);
                    return;
                }
                if (n10 == 2) {
                    hVar.r((char) 239);
                    hVar.o(2);
                    return;
                }
                int i11 = 3;
                if (n10 != 3) {
                    i11 = 4;
                    if (n10 != 4) {
                        if (n10 == 5) {
                            hVar.r((char) 231);
                            hVar.o(5);
                            return;
                        } else {
                            throw new IllegalStateException("Illegal mode: " + n10);
                        }
                    }
                    c10 = 240;
                } else {
                    c10 = 238;
                }
                hVar.r(c10);
                hVar.o(i11);
                return;
            }
            boolean g10 = j.g(c11);
            int i12 = c11;
            if (g10) {
                hVar.r((char) 235);
                i12 = c11 - 128;
            }
            hVar.r((char) (i12 + 1));
            i10 = hVar.f23989f + 1;
        }
        hVar.f23989f = i10;
    }

    public int c() {
        return 0;
    }
}
