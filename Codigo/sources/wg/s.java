package wg;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final kg.a f30006a;

    /* renamed from: b, reason: collision with root package name */
    private final m f30007b = new m();

    /* renamed from: c, reason: collision with root package name */
    private final StringBuilder f30008c = new StringBuilder();

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(kg.a aVar) {
        this.f30006a = aVar;
    }

    private n b(int i10) {
        char c10;
        int f10 = f(i10, 5);
        if (f10 == 15) {
            return new n(i10 + 5, '$');
        }
        if (f10 >= 5 && f10 < 15) {
            return new n(i10 + 5, (char) ((f10 + 48) - 5));
        }
        int f11 = f(i10, 6);
        if (f11 >= 32 && f11 < 58) {
            return new n(i10 + 6, (char) (f11 + 33));
        }
        switch (f11) {
            case 58:
                c10 = '*';
                break;
            case 59:
                c10 = ',';
                break;
            case 60:
                c10 = '-';
                break;
            case 61:
                c10 = '.';
                break;
            case 62:
                c10 = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: " + f11);
        }
        return new n(i10 + 6, c10);
    }

    private n d(int i10) {
        char c10;
        int f10 = f(i10, 5);
        if (f10 == 15) {
            return new n(i10 + 5, '$');
        }
        if (f10 >= 5 && f10 < 15) {
            return new n(i10 + 5, (char) ((f10 + 48) - 5));
        }
        int f11 = f(i10, 7);
        if (f11 >= 64 && f11 < 90) {
            return new n(i10 + 7, (char) (f11 + 1));
        }
        if (f11 >= 90 && f11 < 116) {
            return new n(i10 + 7, (char) (f11 + 7));
        }
        switch (f(i10, 8)) {
            case 232:
                c10 = '!';
                break;
            case 233:
                c10 = '\"';
                break;
            case 234:
                c10 = '%';
                break;
            case 235:
                c10 = '&';
                break;
            case 236:
                c10 = '\'';
                break;
            case 237:
                c10 = '(';
                break;
            case 238:
                c10 = ')';
                break;
            case 239:
                c10 = '*';
                break;
            case 240:
                c10 = '+';
                break;
            case 241:
                c10 = ',';
                break;
            case 242:
                c10 = '-';
                break;
            case 243:
                c10 = '.';
                break;
            case 244:
                c10 = '/';
                break;
            case 245:
                c10 = ':';
                break;
            case 246:
                c10 = ';';
                break;
            case 247:
                c10 = '<';
                break;
            case 248:
                c10 = '=';
                break;
            case 249:
                c10 = '>';
                break;
            case 250:
                c10 = '?';
                break;
            case 251:
                c10 = '_';
                break;
            case 252:
                c10 = ' ';
                break;
            default:
                throw dg.h.a();
        }
        return new n(i10 + 8, c10);
    }

    private p e(int i10) {
        int i11 = i10 + 7;
        if (i11 > this.f30006a.l()) {
            int f10 = f(i10, 4);
            return f10 == 0 ? new p(this.f30006a.l(), 10, 10) : new p(this.f30006a.l(), f10 - 1, 10);
        }
        int f11 = f(i10, 7) - 8;
        return new p(i11, f11 / 11, f11 % 11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(kg.a aVar, int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (aVar.h(i10 + i13)) {
                i12 |= 1 << ((i11 - i13) - 1);
            }
        }
        return i12;
    }

    private boolean h(int i10) {
        int i11 = i10 + 3;
        if (i11 > this.f30006a.l()) {
            return false;
        }
        while (i10 < i11) {
            if (this.f30006a.h(i10)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    private boolean i(int i10) {
        int i11;
        if (i10 + 1 > this.f30006a.l()) {
            return false;
        }
        for (int i12 = 0; i12 < 5 && (i11 = i12 + i10) < this.f30006a.l(); i12++) {
            if (i12 == 2) {
                if (!this.f30006a.h(i10 + 2)) {
                    return false;
                }
            } else if (this.f30006a.h(i11)) {
                return false;
            }
        }
        return true;
    }

    private boolean j(int i10) {
        int i11;
        if (i10 + 1 > this.f30006a.l()) {
            return false;
        }
        for (int i12 = 0; i12 < 4 && (i11 = i12 + i10) < this.f30006a.l(); i12++) {
            if (this.f30006a.h(i11)) {
                return false;
            }
        }
        return true;
    }

    private boolean k(int i10) {
        int f10;
        if (i10 + 5 > this.f30006a.l()) {
            return false;
        }
        int f11 = f(i10, 5);
        if (f11 < 5 || f11 >= 16) {
            return i10 + 6 <= this.f30006a.l() && (f10 = f(i10, 6)) >= 16 && f10 < 63;
        }
        return true;
    }

    private boolean l(int i10) {
        int f10;
        if (i10 + 5 > this.f30006a.l()) {
            return false;
        }
        int f11 = f(i10, 5);
        if (f11 >= 5 && f11 < 16) {
            return true;
        }
        if (i10 + 7 > this.f30006a.l()) {
            return false;
        }
        int f12 = f(i10, 7);
        if (f12 < 64 || f12 >= 116) {
            return i10 + 8 <= this.f30006a.l() && (f10 = f(i10, 8)) >= 232 && f10 < 253;
        }
        return true;
    }

    private boolean m(int i10) {
        if (i10 + 7 > this.f30006a.l()) {
            return i10 + 4 <= this.f30006a.l();
        }
        int i11 = i10;
        while (true) {
            int i12 = i10 + 3;
            if (i11 >= i12) {
                return this.f30006a.h(i12);
            }
            if (this.f30006a.h(i11)) {
                return true;
            }
            i11++;
        }
    }

    private l n() {
        while (k(this.f30007b.a())) {
            n b10 = b(this.f30007b.a());
            this.f30007b.h(b10.a());
            if (b10.c()) {
                return new l(new o(this.f30007b.a(), this.f30008c.toString()), true);
            }
            this.f30008c.append(b10.b());
        }
        if (h(this.f30007b.a())) {
            this.f30007b.b(3);
            this.f30007b.g();
        } else if (i(this.f30007b.a())) {
            if (this.f30007b.a() + 5 < this.f30006a.l()) {
                this.f30007b.b(5);
            } else {
                this.f30007b.h(this.f30006a.l());
            }
            this.f30007b.f();
        }
        return new l();
    }

    private o o() {
        l n10;
        boolean b10;
        do {
            int a10 = this.f30007b.a();
            n10 = this.f30007b.c() ? n() : this.f30007b.d() ? p() : q();
            b10 = n10.b();
            if (!(a10 != this.f30007b.a()) && !b10) {
                break;
            }
        } while (!b10);
        return n10.a();
    }

    private l p() {
        while (l(this.f30007b.a())) {
            n d10 = d(this.f30007b.a());
            this.f30007b.h(d10.a());
            if (d10.c()) {
                return new l(new o(this.f30007b.a(), this.f30008c.toString()), true);
            }
            this.f30008c.append(d10.b());
        }
        if (h(this.f30007b.a())) {
            this.f30007b.b(3);
            this.f30007b.g();
        } else if (i(this.f30007b.a())) {
            if (this.f30007b.a() + 5 < this.f30006a.l()) {
                this.f30007b.b(5);
            } else {
                this.f30007b.h(this.f30006a.l());
            }
            this.f30007b.e();
        }
        return new l();
    }

    private l q() {
        while (m(this.f30007b.a())) {
            p e10 = e(this.f30007b.a());
            this.f30007b.h(e10.a());
            if (e10.d()) {
                return new l(e10.e() ? new o(this.f30007b.a(), this.f30008c.toString()) : new o(this.f30007b.a(), this.f30008c.toString(), e10.c()), true);
            }
            this.f30008c.append(e10.b());
            if (e10.e()) {
                return new l(new o(this.f30007b.a(), this.f30008c.toString()), true);
            }
            this.f30008c.append(e10.c());
        }
        if (j(this.f30007b.a())) {
            this.f30007b.e();
            this.f30007b.b(4);
        }
        return new l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(StringBuilder sb2, int i10) {
        String str = null;
        while (true) {
            o c10 = c(i10, str);
            String a10 = r.a(c10.b());
            if (a10 != null) {
                sb2.append(a10);
            }
            String valueOf = c10.d() ? String.valueOf(c10.c()) : null;
            if (i10 == c10.a()) {
                return sb2.toString();
            }
            i10 = c10.a();
            str = valueOf;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o c(int i10, String str) {
        this.f30008c.setLength(0);
        if (str != null) {
            this.f30008c.append(str);
        }
        this.f30007b.h(i10);
        o o10 = o();
        return (o10 == null || !o10.d()) ? new o(this.f30007b.a(), this.f30008c.toString()) : new o(this.f30007b.a(), this.f30008c.toString(), o10.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f(int i10, int i11) {
        return g(this.f30006a, i10, i11);
    }
}