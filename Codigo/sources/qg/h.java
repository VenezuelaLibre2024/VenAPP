package qg;

import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f23984a;

    /* renamed from: b, reason: collision with root package name */
    private m f23985b;

    /* renamed from: c, reason: collision with root package name */
    private dg.f f23986c;

    /* renamed from: d, reason: collision with root package name */
    private dg.f f23987d;

    /* renamed from: e, reason: collision with root package name */
    private final StringBuilder f23988e;

    /* renamed from: f, reason: collision with root package name */
    int f23989f;

    /* renamed from: g, reason: collision with root package name */
    private int f23990g;

    /* renamed from: h, reason: collision with root package name */
    private l f23991h;

    /* renamed from: i, reason: collision with root package name */
    private int f23992i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i10 = 0; i10 < length; i10++) {
            char c10 = (char) (bytes[i10] & 255);
            if (c10 == '?' && str.charAt(i10) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c10);
        }
        this.f23984a = sb2.toString();
        this.f23985b = m.FORCE_NONE;
        this.f23988e = new StringBuilder(str.length());
        this.f23990g = -1;
    }

    private int h() {
        return this.f23984a.length() - this.f23992i;
    }

    public int a() {
        return this.f23988e.length();
    }

    public StringBuilder b() {
        return this.f23988e;
    }

    public char c() {
        return this.f23984a.charAt(this.f23989f);
    }

    public String d() {
        return this.f23984a;
    }

    public int e() {
        return this.f23990g;
    }

    public int f() {
        return h() - this.f23989f;
    }

    public l g() {
        return this.f23991h;
    }

    public boolean i() {
        return this.f23989f < h();
    }

    public void j() {
        this.f23990g = -1;
    }

    public void k() {
        this.f23991h = null;
    }

    public void l(dg.f fVar, dg.f fVar2) {
        this.f23986c = fVar;
        this.f23987d = fVar2;
    }

    public void m(int i10) {
        this.f23992i = i10;
    }

    public void n(m mVar) {
        this.f23985b = mVar;
    }

    public void o(int i10) {
        this.f23990g = i10;
    }

    public void p() {
        q(a());
    }

    public void q(int i10) {
        l lVar = this.f23991h;
        if (lVar == null || i10 > lVar.a()) {
            this.f23991h = l.l(i10, this.f23985b, this.f23986c, this.f23987d, true);
        }
    }

    public void r(char c10) {
        this.f23988e.append(c10);
    }

    public void s(String str) {
        this.f23988e.append(str);
    }
}
