package p314qg;

import java.nio.charset.StandardCharsets;
import p066dg.C6945f;

/* renamed from: qg.h */
/* loaded from: classes2.dex */
final class C10483h {

    /* renamed from: a */
    private final String f26026a;

    /* renamed from: b */
    private EnumC10488m f26027b;

    /* renamed from: c */
    private C6945f f26028c;

    /* renamed from: d */
    private C6945f f26029d;

    /* renamed from: e */
    private final StringBuilder f26030e;

    /* renamed from: f */
    int f26031f;

    /* renamed from: g */
    private int f26032g;

    /* renamed from: h */
    private C10487l f26033h;

    /* renamed from: i */
    private int f26034i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10483h(String str) {
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
        this.f26026a = sb2.toString();
        this.f26027b = EnumC10488m.FORCE_NONE;
        this.f26030e = new StringBuilder(str.length());
        this.f26032g = -1;
    }

    /* renamed from: h */
    private int m31447h() {
        return this.f26026a.length() - this.f26034i;
    }

    /* renamed from: a */
    public int m31448a() {
        return this.f26030e.length();
    }

    /* renamed from: b */
    public StringBuilder m31449b() {
        return this.f26030e;
    }

    /* renamed from: c */
    public char m31450c() {
        return this.f26026a.charAt(this.f26031f);
    }

    /* renamed from: d */
    public String m31451d() {
        return this.f26026a;
    }

    /* renamed from: e */
    public int m31452e() {
        return this.f26032g;
    }

    /* renamed from: f */
    public int m31453f() {
        return m31447h() - this.f26031f;
    }

    /* renamed from: g */
    public C10487l m31454g() {
        return this.f26033h;
    }

    /* renamed from: i */
    public boolean m31455i() {
        return this.f26031f < m31447h();
    }

    /* renamed from: j */
    public void m31456j() {
        this.f26032g = -1;
    }

    /* renamed from: k */
    public void m31457k() {
        this.f26033h = null;
    }

    /* renamed from: l */
    public void m31458l(C6945f c6945f, C6945f c6945f2) {
        this.f26028c = c6945f;
        this.f26029d = c6945f2;
    }

    /* renamed from: m */
    public void m31459m(int i10) {
        this.f26034i = i10;
    }

    /* renamed from: n */
    public void m31460n(EnumC10488m enumC10488m) {
        this.f26027b = enumC10488m;
    }

    /* renamed from: o */
    public void m31461o(int i10) {
        this.f26032g = i10;
    }

    /* renamed from: p */
    public void m31462p() {
        m31463q(m31448a());
    }

    /* renamed from: q */
    public void m31463q(int i10) {
        C10487l c10487l = this.f26033h;
        if (c10487l == null || i10 > c10487l.m31537a()) {
            this.f26033h = C10487l.m31536l(i10, this.f26027b, this.f26028c, this.f26029d, true);
        }
    }

    /* renamed from: r */
    public void m31464r(char c10) {
        this.f26030e.append(c10);
    }

    /* renamed from: s */
    public void m31465s(String str) {
        this.f26030e.append(str);
    }
}
