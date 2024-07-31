package b8;

import android.net.Uri;
import java.io.IOException;
import s8.d0;
import v7.h0;

/* loaded from: classes.dex */
public interface l {

    /* loaded from: classes.dex */
    public interface a {
        l a(a8.g gVar, d0 d0Var, k kVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(Uri uri, d0.c cVar, boolean z10);

        void d();
    }

    /* loaded from: classes.dex */
    public static final class c extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f6313a;

        public c(Uri uri) {
            this.f6313a = uri;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f6314a;

        public d(Uri uri) {
            this.f6314a = uri;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void r(g gVar);
    }

    void a(b bVar);

    void b(Uri uri);

    long c();

    void d(Uri uri, h0.a aVar, e eVar);

    h e();

    void f(Uri uri);

    boolean g(Uri uri);

    boolean j();

    boolean k(Uri uri, long j10);

    void l();

    void n(b bVar);

    g o(Uri uri, boolean z10);

    void stop();
}
