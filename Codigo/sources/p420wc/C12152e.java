package p420wc;

import ad.C0103f;
import java.io.File;

/* renamed from: wc.e */
/* loaded from: classes.dex */
public class C12152e {

    /* renamed from: c */
    private static final b f32306c = new b();

    /* renamed from: a */
    private final C0103f f32307a;

    /* renamed from: b */
    private InterfaceC12150c f32308b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wc.e$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC12150c {
        private b() {
        }

        @Override // p420wc.InterfaceC12150c
        /* renamed from: a */
        public void mo38920a() {
        }

        @Override // p420wc.InterfaceC12150c
        /* renamed from: b */
        public String mo38921b() {
            return null;
        }

        @Override // p420wc.InterfaceC12150c
        /* renamed from: c */
        public byte[] mo38922c() {
            return null;
        }

        @Override // p420wc.InterfaceC12150c
        /* renamed from: d */
        public void mo38923d() {
        }

        @Override // p420wc.InterfaceC12150c
        /* renamed from: e */
        public void mo38924e(long j10, String str) {
        }
    }

    public C12152e(C0103f c0103f) {
        this.f32307a = c0103f;
        this.f32308b = f32306c;
    }

    public C12152e(C0103f c0103f, String str) {
        this(c0103f);
        m38934e(str);
    }

    /* renamed from: d */
    private File m38930d(String str) {
        return this.f32307a.m461o(str, "userlog");
    }

    /* renamed from: a */
    public void m38931a() {
        this.f32308b.mo38923d();
    }

    /* renamed from: b */
    public byte[] m38932b() {
        return this.f32308b.mo38922c();
    }

    /* renamed from: c */
    public String m38933c() {
        return this.f32308b.mo38921b();
    }

    /* renamed from: e */
    public final void m38934e(String str) {
        this.f32308b.mo38920a();
        this.f32308b = f32306c;
        if (str == null) {
            return;
        }
        m38935f(m38930d(str), 65536);
    }

    /* renamed from: f */
    void m38935f(File file, int i10) {
        this.f32308b = new C12155h(file, i10);
    }

    /* renamed from: g */
    public void m38936g(long j10, String str) {
        this.f32308b.mo38924e(j10, str);
    }
}
