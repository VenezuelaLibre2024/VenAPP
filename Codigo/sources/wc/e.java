package wc;

import java.io.File;

/* loaded from: classes.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    private static final b f29841c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final ad.f f29842a;

    /* renamed from: b, reason: collision with root package name */
    private c f29843b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements c {
        private b() {
        }

        @Override // wc.c
        public void a() {
        }

        @Override // wc.c
        public String b() {
            return null;
        }

        @Override // wc.c
        public byte[] c() {
            return null;
        }

        @Override // wc.c
        public void d() {
        }

        @Override // wc.c
        public void e(long j10, String str) {
        }
    }

    public e(ad.f fVar) {
        this.f29842a = fVar;
        this.f29843b = f29841c;
    }

    public e(ad.f fVar, String str) {
        this(fVar);
        e(str);
    }

    private File d(String str) {
        return this.f29842a.o(str, "userlog");
    }

    public void a() {
        this.f29843b.d();
    }

    public byte[] b() {
        return this.f29843b.c();
    }

    public String c() {
        return this.f29843b.b();
    }

    public final void e(String str) {
        this.f29843b.a();
        this.f29843b = f29841c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    void f(File file, int i10) {
        this.f29843b = new h(file, i10);
    }

    public void g(long j10, String str) {
        this.f29843b.e(j10, str);
    }
}
