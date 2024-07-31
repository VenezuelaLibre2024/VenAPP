package t5;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import ck.r;
import dk.k0;
import dk.q;
import dk.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.n;
import x5.e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d */
    public static final a f25786d = new a(null);

    /* renamed from: e */
    private static final ExecutorService f25787e = Executors.newFixedThreadPool(5);

    /* renamed from: a */
    private final Context f25788a;

    /* renamed from: b */
    private boolean f25789b;

    /* renamed from: c */
    private final ArrayList<y3.d<Bitmap>> f25790c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public b(Context context) {
        n.e(context, "context");
        this.f25788a = context;
        this.f25790c = new ArrayList<>();
    }

    private final x5.e n() {
        return (this.f25789b || Build.VERSION.SDK_INT < 29) ? x5.d.f30410b : x5.a.f30399b;
    }

    public static final void x(y3.d cacheFuture) {
        n.e(cacheFuture, "$cacheFuture");
        if (cacheFuture.isCancelled()) {
            return;
        }
        try {
            cacheFuture.get();
        } catch (Exception e10) {
            b6.a.b(e10);
        }
    }

    public final v5.a A(String path, String title, String desc, String str) {
        n.e(path, "path");
        n.e(title, "title");
        n.e(desc, "desc");
        if (new File(path).exists()) {
            return n().C(this.f25788a, path, title, desc, str);
        }
        return null;
    }

    public final void B(boolean z10) {
        this.f25789b = z10;
    }

    public final void b(String id2, b6.e resultHandler) {
        n.e(id2, "id");
        n.e(resultHandler, "resultHandler");
        resultHandler.g(Boolean.valueOf(n().b(this.f25788a, id2)));
    }

    public final void c() {
        List f02;
        f02 = z.f0(this.f25790c);
        this.f25790c.clear();
        Iterator it = f02.iterator();
        while (it.hasNext()) {
            com.bumptech.glide.b.u(this.f25788a).m((y3.d) it.next());
        }
    }

    public final void d() {
        a6.a.f68a.a(this.f25788a);
        n().u(this.f25788a);
    }

    public final void e(String assetId, String galleryId, b6.e resultHandler) {
        n.e(assetId, "assetId");
        n.e(galleryId, "galleryId");
        n.e(resultHandler, "resultHandler");
        try {
            v5.a o10 = n().o(this.f25788a, assetId, galleryId);
            if (o10 == null) {
                resultHandler.g(null);
            } else {
                resultHandler.g(x5.c.f30409a.a(o10));
            }
        } catch (Exception e10) {
            b6.a.b(e10);
            resultHandler.g(null);
        }
    }

    public final v5.a f(String id2) {
        n.e(id2, "id");
        return e.b.f(n(), this.f25788a, id2, false, 4, null);
    }

    public final v5.b g(String id2, int i10, w5.e option) {
        n.e(id2, "id");
        n.e(option, "option");
        if (!n.a(id2, "isAll")) {
            v5.b D = n().D(this.f25788a, id2, i10, option);
            if (D != null && option.a()) {
                n().i(this.f25788a, D);
            }
            return D;
        }
        List<v5.b> w10 = n().w(this.f25788a, i10, option);
        if (w10.isEmpty()) {
            return null;
        }
        Iterator<v5.b> it = w10.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += it.next().a();
        }
        v5.b bVar = new v5.b("isAll", "Recent", i11, i10, true, null, 32, null);
        if (!option.a()) {
            return bVar;
        }
        n().i(this.f25788a, bVar);
        return bVar;
    }

    public final void h(b6.e resultHandler, w5.e option, int i10) {
        n.e(resultHandler, "resultHandler");
        n.e(option, "option");
        resultHandler.g(Integer.valueOf(n().F(this.f25788a, option, i10)));
    }

    public final List<v5.a> i(String id2, int i10, int i11, int i12, w5.e option) {
        n.e(id2, "id");
        n.e(option, "option");
        if (n.a(id2, "isAll")) {
            id2 = "";
        }
        return n().y(this.f25788a, id2, i11, i12, i10, option);
    }

    public final List<v5.a> j(String galleryId, int i10, int i11, int i12, w5.e option) {
        n.e(galleryId, "galleryId");
        n.e(option, "option");
        if (n.a(galleryId, "isAll")) {
            galleryId = "";
        }
        return n().a(this.f25788a, galleryId, i11, i12, i10, option);
    }

    public final List<v5.b> k(int i10, boolean z10, boolean z11, w5.e option) {
        List e10;
        List<v5.b> R;
        n.e(option, "option");
        if (z11) {
            return n().j(this.f25788a, i10, option);
        }
        List<v5.b> w10 = n().w(this.f25788a, i10, option);
        if (!z10) {
            return w10;
        }
        Iterator<v5.b> it = w10.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += it.next().a();
        }
        e10 = q.e(new v5.b("isAll", "Recent", i11, i10, true, null, 32, null));
        R = z.R(e10, w10);
        return R;
    }

    public final void l(b6.e resultHandler, w5.e option, int i10, int i11, int i12) {
        n.e(resultHandler, "resultHandler");
        n.e(option, "option");
        resultHandler.g(x5.c.f30409a.b(n().s(this.f25788a, option, i10, i11, i12)));
    }

    public final void m(b6.e resultHandler) {
        n.e(resultHandler, "resultHandler");
        resultHandler.g(n().t(this.f25788a));
    }

    public final void o(String id2, boolean z10, b6.e resultHandler) {
        n.e(id2, "id");
        n.e(resultHandler, "resultHandler");
        resultHandler.g(n().B(this.f25788a, id2, z10));
    }

    public final Map<String, Double> p(String id2) {
        Map<String, Double> k10;
        Map<String, Double> k11;
        n.e(id2, "id");
        androidx.exifinterface.media.a E = n().E(this.f25788a, id2);
        double[] l10 = E != null ? E.l() : null;
        if (l10 == null) {
            k11 = k0.k(r.a("lat", Double.valueOf(0.0d)), r.a("lng", Double.valueOf(0.0d)));
            return k11;
        }
        k10 = k0.k(r.a("lat", Double.valueOf(l10[0])), r.a("lng", Double.valueOf(l10[1])));
        return k10;
    }

    public final String q(long j10, int i10) {
        return n().H(this.f25788a, j10, i10);
    }

    public final void r(String id2, b6.e resultHandler, boolean z10) {
        n.e(id2, "id");
        n.e(resultHandler, "resultHandler");
        v5.a f10 = e.b.f(n(), this.f25788a, id2, false, 4, null);
        if (f10 == null) {
            b6.e.j(resultHandler, "The asset not found", null, null, 6, null);
            return;
        }
        try {
            resultHandler.g(n().n(this.f25788a, f10, z10));
        } catch (Exception e10) {
            n().x(this.f25788a, id2);
            resultHandler.i("202", "get originBytes error", e10);
        }
    }

    public final void s(String id2, v5.d option, b6.e resultHandler) {
        int i10;
        int i11;
        b6.e eVar;
        n.e(id2, "id");
        n.e(option, "option");
        n.e(resultHandler, "resultHandler");
        int e10 = option.e();
        int c10 = option.c();
        int d10 = option.d();
        Bitmap.CompressFormat a10 = option.a();
        long b10 = option.b();
        try {
            v5.a f10 = e.b.f(n(), this.f25788a, id2, false, 4, null);
            if (f10 == null) {
                b6.e.j(resultHandler, "The asset not found!", null, null, 6, null);
                return;
            }
            i10 = c10;
            i11 = e10;
            eVar = resultHandler;
            try {
                a6.a.f68a.b(this.f25788a, f10, option.e(), option.c(), a10, d10, b10, resultHandler);
            } catch (Exception e11) {
                e = e11;
                Log.e("PhotoManager", "get " + id2 + " thumbnail error, width : " + i11 + ", height: " + i10, e);
                n().x(this.f25788a, id2);
                eVar.i("201", "get thumb error", e);
            }
        } catch (Exception e12) {
            e = e12;
            i10 = c10;
            i11 = e10;
            eVar = resultHandler;
        }
    }

    public final Uri t(String id2) {
        n.e(id2, "id");
        v5.a f10 = e.b.f(n(), this.f25788a, id2, false, 4, null);
        if (f10 != null) {
            return f10.n();
        }
        return null;
    }

    public final void u(String assetId, String albumId, b6.e resultHandler) {
        n.e(assetId, "assetId");
        n.e(albumId, "albumId");
        n.e(resultHandler, "resultHandler");
        try {
            v5.a G = n().G(this.f25788a, assetId, albumId);
            if (G == null) {
                resultHandler.g(null);
            } else {
                resultHandler.g(x5.c.f30409a.a(G));
            }
        } catch (Exception e10) {
            b6.a.b(e10);
            resultHandler.g(null);
        }
    }

    public final void v(b6.e resultHandler) {
        n.e(resultHandler, "resultHandler");
        resultHandler.g(Boolean.valueOf(n().e(this.f25788a)));
    }

    public final void w(List<String> ids, v5.d option, b6.e resultHandler) {
        List f02;
        n.e(ids, "ids");
        n.e(option, "option");
        n.e(resultHandler, "resultHandler");
        Iterator<String> it = n().m(this.f25788a, ids).iterator();
        while (it.hasNext()) {
            this.f25790c.add(a6.a.f68a.c(this.f25788a, it.next(), option));
        }
        resultHandler.g(1);
        f02 = z.f0(this.f25790c);
        Iterator it2 = f02.iterator();
        while (it2.hasNext()) {
            f25787e.execute(new Runnable() { // from class: t5.a
                public /* synthetic */ a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.x(y3.d.this);
                }
            });
        }
    }

    public final v5.a y(String path, String title, String description, String str) {
        n.e(path, "path");
        n.e(title, "title");
        n.e(description, "description");
        return n().l(this.f25788a, path, title, description, str);
    }

    public final v5.a z(byte[] image, String title, String description, String str) {
        n.e(image, "image");
        n.e(title, "title");
        n.e(description, "description");
        return n().f(this.f25788a, image, title, description, str);
    }
}
