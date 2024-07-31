package e2;

import android.webkit.WebSettings;
import androidx.webkit.internal.a;
import androidx.webkit.internal.i1;
import androidx.webkit.internal.j1;
import androidx.webkit.internal.k0;
import androidx.webkit.internal.k1;
import java.util.Set;

/* loaded from: classes.dex */
public class q {
    private static i1 a(WebSettings webSettings) {
        return k1.c().f(webSettings);
    }

    public static int b(WebSettings webSettings) {
        a.c cVar = j1.f5578d;
        if (cVar.c()) {
            return androidx.webkit.internal.d.f(webSettings);
        }
        if (cVar.d()) {
            return a(webSettings).a();
        }
        throw j1.a();
    }

    public static boolean c(WebSettings webSettings) {
        if (j1.Z.d()) {
            return a(webSettings).b();
        }
        throw j1.a();
    }

    @Deprecated
    public static int d(WebSettings webSettings) {
        a.h hVar = j1.T;
        if (hVar.c()) {
            return k0.a(webSettings);
        }
        if (hVar.d()) {
            return a(webSettings).c();
        }
        throw j1.a();
    }

    @Deprecated
    public static int e(WebSettings webSettings) {
        if (j1.U.d()) {
            return a(webSettings).c();
        }
        throw j1.a();
    }

    public static boolean f(WebSettings webSettings) {
        a.b bVar = j1.f5575b;
        if (bVar.c()) {
            return androidx.webkit.internal.c.g(webSettings);
        }
        if (bVar.d()) {
            return a(webSettings).d();
        }
        throw j1.a();
    }

    public static Set<String> g(WebSettings webSettings) {
        if (j1.f5576b0.d()) {
            return a(webSettings).e();
        }
        throw j1.a();
    }

    public static boolean h(WebSettings webSettings) {
        a.e eVar = j1.f5577c;
        if (eVar.c()) {
            return androidx.webkit.internal.j.b(webSettings);
        }
        if (eVar.d()) {
            return a(webSettings).f();
        }
        throw j1.a();
    }

    public static boolean i(WebSettings webSettings) {
        if (j1.P.d()) {
            return a(webSettings).g();
        }
        throw j1.a();
    }

    public static void j(WebSettings webSettings, boolean z10) {
        if (!j1.P.d()) {
            throw j1.a();
        }
        a(webSettings).h(z10);
    }

    public static void k(WebSettings webSettings, int i10) {
        a.c cVar = j1.f5578d;
        if (cVar.c()) {
            androidx.webkit.internal.d.o(webSettings, i10);
        } else {
            if (!cVar.d()) {
                throw j1.a();
            }
            a(webSettings).i(i10);
        }
    }

    public static void l(WebSettings webSettings, boolean z10) {
        if (!j1.Z.d()) {
            throw j1.a();
        }
        a(webSettings).j(z10);
    }

    @Deprecated
    public static void m(WebSettings webSettings, int i10) {
        a.h hVar = j1.T;
        if (hVar.c()) {
            k0.d(webSettings, i10);
        } else {
            if (!hVar.d()) {
                throw j1.a();
            }
            a(webSettings).k(i10);
        }
    }

    @Deprecated
    public static void n(WebSettings webSettings, int i10) {
        if (!j1.U.d()) {
            throw j1.a();
        }
        a(webSettings).l(i10);
    }

    public static void o(WebSettings webSettings, boolean z10) {
        a.b bVar = j1.f5575b;
        if (bVar.c()) {
            androidx.webkit.internal.c.k(webSettings, z10);
        } else {
            if (!bVar.d()) {
                throw j1.a();
            }
            a(webSettings).m(z10);
        }
    }

    public static void p(WebSettings webSettings, Set<String> set) {
        if (!j1.f5576b0.d()) {
            throw j1.a();
        }
        a(webSettings).n(set);
    }

    public static void q(WebSettings webSettings, boolean z10) {
        a.e eVar = j1.f5577c;
        if (eVar.c()) {
            androidx.webkit.internal.j.e(webSettings, z10);
        } else {
            if (!eVar.d()) {
                throw j1.a();
            }
            a(webSettings).o(z10);
        }
    }

    @Deprecated
    public static void r(WebSettings webSettings, boolean z10) {
        if (!j1.R.d()) {
            throw j1.a();
        }
        a(webSettings).p(z10);
    }

    @Deprecated
    public static boolean s(WebSettings webSettings) {
        if (j1.R.d()) {
            return a(webSettings).q();
        }
        throw j1.a();
    }
}
