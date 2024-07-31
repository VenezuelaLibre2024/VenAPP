package kg;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private StringBuilder f20684a;

    /* renamed from: b, reason: collision with root package name */
    private StringBuilder f20685b;

    /* renamed from: c, reason: collision with root package name */
    private Charset f20686c;

    public j() {
        this.f20686c = StandardCharsets.ISO_8859_1;
        this.f20684a = new StringBuilder();
    }

    public j(int i10) {
        this.f20686c = StandardCharsets.ISO_8859_1;
        this.f20684a = new StringBuilder(i10);
    }

    private void g() {
        StringBuilder sb2;
        if (this.f20686c.equals(StandardCharsets.ISO_8859_1)) {
            if (this.f20684a.length() > 0) {
                StringBuilder sb3 = this.f20685b;
                if (sb3 == null) {
                    this.f20685b = this.f20684a;
                    sb2 = new StringBuilder();
                } else {
                    sb3.append((CharSequence) this.f20684a);
                    sb2 = new StringBuilder();
                }
                this.f20684a = sb2;
                return;
            }
            return;
        }
        if (this.f20684a.length() > 0) {
            byte[] bytes = this.f20684a.toString().getBytes(StandardCharsets.ISO_8859_1);
            this.f20684a = new StringBuilder();
            StringBuilder sb4 = this.f20685b;
            if (sb4 == null) {
                this.f20685b = new StringBuilder(new String(bytes, this.f20686c));
            } else {
                sb4.append(new String(bytes, this.f20686c));
            }
        }
    }

    public void a(byte b10) {
        this.f20684a.append((char) (b10 & 255));
    }

    public void b(char c10) {
        this.f20684a.append((char) (c10 & 255));
    }

    public void c(int i10) {
        d(String.valueOf(i10));
    }

    public void d(String str) {
        this.f20684a.append(str);
    }

    public void e(StringBuilder sb2) {
        g();
        this.f20685b.append((CharSequence) sb2);
    }

    public void f(int i10) {
        g();
        d i11 = d.i(i10);
        if (i11 == null) {
            throw dg.h.a();
        }
        this.f20686c = i11.l();
    }

    public boolean h() {
        StringBuilder sb2;
        return this.f20684a.length() == 0 && ((sb2 = this.f20685b) == null || sb2.length() == 0);
    }

    public int i() {
        return toString().length();
    }

    public String toString() {
        g();
        StringBuilder sb2 = this.f20685b;
        return sb2 == null ? "" : sb2.toString();
    }
}
