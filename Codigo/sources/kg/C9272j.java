package kg;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p066dg.C6947h;

/* renamed from: kg.j */
/* loaded from: classes2.dex */
public final class C9272j {

    /* renamed from: a */
    private StringBuilder f22506a;

    /* renamed from: b */
    private StringBuilder f22507b;

    /* renamed from: c */
    private Charset f22508c;

    public C9272j() {
        this.f22508c = StandardCharsets.ISO_8859_1;
        this.f22506a = new StringBuilder();
    }

    public C9272j(int i10) {
        this.f22508c = StandardCharsets.ISO_8859_1;
        this.f22506a = new StringBuilder(i10);
    }

    /* renamed from: g */
    private void m27650g() {
        StringBuilder sb2;
        if (this.f22508c.equals(StandardCharsets.ISO_8859_1)) {
            if (this.f22506a.length() > 0) {
                StringBuilder sb3 = this.f22507b;
                if (sb3 == null) {
                    this.f22507b = this.f22506a;
                    sb2 = new StringBuilder();
                } else {
                    sb3.append((CharSequence) this.f22506a);
                    sb2 = new StringBuilder();
                }
                this.f22506a = sb2;
                return;
            }
            return;
        }
        if (this.f22506a.length() > 0) {
            byte[] bytes = this.f22506a.toString().getBytes(StandardCharsets.ISO_8859_1);
            this.f22506a = new StringBuilder();
            StringBuilder sb4 = this.f22507b;
            if (sb4 == null) {
                this.f22507b = new StringBuilder(new String(bytes, this.f22508c));
            } else {
                sb4.append(new String(bytes, this.f22508c));
            }
        }
    }

    /* renamed from: a */
    public void m27651a(byte b10) {
        this.f22506a.append((char) (b10 & 255));
    }

    /* renamed from: b */
    public void m27652b(char c10) {
        this.f22506a.append((char) (c10 & 255));
    }

    /* renamed from: c */
    public void m27653c(int i10) {
        m27654d(String.valueOf(i10));
    }

    /* renamed from: d */
    public void m27654d(String str) {
        this.f22506a.append(str);
    }

    /* renamed from: e */
    public void m27655e(StringBuilder sb2) {
        m27650g();
        this.f22507b.append((CharSequence) sb2);
    }

    /* renamed from: f */
    public void m27656f(int i10) {
        m27650g();
        EnumC9266d m27622i = EnumC9266d.m27622i(i10);
        if (m27622i == null) {
            throw C6947h.m20094a();
        }
        this.f22508c = m27622i.m27623l();
    }

    /* renamed from: h */
    public boolean m27657h() {
        StringBuilder sb2;
        return this.f22506a.length() == 0 && ((sb2 = this.f22507b) == null || sb2.length() == 0);
    }

    /* renamed from: i */
    public int m27658i() {
        return toString().length();
    }

    public String toString() {
        m27650g();
        StringBuilder sb2 = this.f22507b;
        return sb2 == null ? "" : sb2.toString();
    }
}
