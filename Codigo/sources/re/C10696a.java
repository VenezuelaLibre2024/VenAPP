package re;

import java.util.Locale;

/* renamed from: re.a */
/* loaded from: classes.dex */
public class C10696a {

    /* renamed from: c */
    private static volatile C10696a f27056c;

    /* renamed from: a */
    private final C10698c f27057a;

    /* renamed from: b */
    private boolean f27058b;

    private C10696a() {
        this(null);
    }

    public C10696a(C10698c c10698c) {
        this.f27058b = false;
        this.f27057a = c10698c == null ? C10698c.m32580c() : c10698c;
    }

    /* renamed from: e */
    public static C10696a m32565e() {
        if (f27056c == null) {
            synchronized (C10696a.class) {
                if (f27056c == null) {
                    f27056c = new C10696a();
                }
            }
        }
        return f27056c;
    }

    /* renamed from: a */
    public void m32566a(String str) {
        if (this.f27058b) {
            this.f27057a.m32581a(str);
        }
    }

    /* renamed from: b */
    public void m32567b(String str, Object... objArr) {
        if (this.f27058b) {
            this.f27057a.m32581a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: c */
    public void m32568c(String str) {
        if (this.f27058b) {
            this.f27057a.m32582b(str);
        }
    }

    /* renamed from: d */
    public void m32569d(String str, Object... objArr) {
        if (this.f27058b) {
            this.f27057a.m32582b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: f */
    public void m32570f(String str) {
        if (this.f27058b) {
            this.f27057a.m32583d(str);
        }
    }

    /* renamed from: g */
    public void m32571g(String str, Object... objArr) {
        if (this.f27058b) {
            this.f27057a.m32583d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: h */
    public boolean m32572h() {
        return this.f27058b;
    }

    /* renamed from: i */
    public void m32573i(boolean z10) {
        this.f27058b = z10;
    }

    /* renamed from: j */
    public void m32574j(String str) {
        if (this.f27058b) {
            this.f27057a.m32584e(str);
        }
    }

    /* renamed from: k */
    public void m32575k(String str, Object... objArr) {
        if (this.f27058b) {
            this.f27057a.m32584e(String.format(Locale.ENGLISH, str, objArr));
        }
    }
}
