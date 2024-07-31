package re;

import java.util.Locale;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f24940c;

    /* renamed from: a, reason: collision with root package name */
    private final c f24941a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f24942b;

    private a() {
        this(null);
    }

    public a(c cVar) {
        this.f24942b = false;
        this.f24941a = cVar == null ? c.c() : cVar;
    }

    public static a e() {
        if (f24940c == null) {
            synchronized (a.class) {
                if (f24940c == null) {
                    f24940c = new a();
                }
            }
        }
        return f24940c;
    }

    public void a(String str) {
        if (this.f24942b) {
            this.f24941a.a(str);
        }
    }

    public void b(String str, Object... objArr) {
        if (this.f24942b) {
            this.f24941a.a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void c(String str) {
        if (this.f24942b) {
            this.f24941a.b(str);
        }
    }

    public void d(String str, Object... objArr) {
        if (this.f24942b) {
            this.f24941a.b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void f(String str) {
        if (this.f24942b) {
            this.f24941a.d(str);
        }
    }

    public void g(String str, Object... objArr) {
        if (this.f24942b) {
            this.f24941a.d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public boolean h() {
        return this.f24942b;
    }

    public void i(boolean z10) {
        this.f24942b = z10;
    }

    public void j(String str) {
        if (this.f24942b) {
            this.f24941a.e(str);
        }
    }

    public void k(String str, Object... objArr) {
        if (this.f24942b) {
            this.f24941a.e(String.format(Locale.ENGLISH, str, objArr));
        }
    }
}
