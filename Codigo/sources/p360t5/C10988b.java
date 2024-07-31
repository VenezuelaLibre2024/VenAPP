package p360t5;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.exifinterface.media.C1239a;
import ck.C2033r;
import com.bumptech.glide.ComponentCallbacks2C2116b;
import dk.C7018k0;
import dk.C7029q;
import dk.C7042z;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p008a6.C0034a;
import p024b6.C1662a;
import p024b6.C1666e;
import p395v5.C11627a;
import p395v5.C11628b;
import p395v5.C11630d;
import p413w5.AbstractC12074e;
import p435x5.C12285a;
import p435x5.C12287c;
import p435x5.C12288d;
import p435x5.InterfaceC12289e;
import p456y3.InterfaceFutureC12589d;

/* renamed from: t5.b */
/* loaded from: classes.dex */
public final class C10988b {

    /* renamed from: d */
    public static final a f27930d = new a(null);

    /* renamed from: e */
    private static final ExecutorService f27931e = Executors.newFixedThreadPool(5);

    /* renamed from: a */
    private final Context f27932a;

    /* renamed from: b */
    private boolean f27933b;

    /* renamed from: c */
    private final ArrayList<InterfaceFutureC12589d<Bitmap>> f27934c;

    /* renamed from: t5.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C10988b(Context context) {
        C9322n.m27781e(context, "context");
        this.f27932a = context;
        this.f27934c = new ArrayList<>();
    }

    /* renamed from: n */
    private final InterfaceC12289e m33548n() {
        return (this.f27933b || Build.VERSION.SDK_INT < 29) ? C12288d.f32922b : C12285a.f32911b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final void m33549x(InterfaceFutureC12589d cacheFuture) {
        C9322n.m27781e(cacheFuture, "$cacheFuture");
        if (cacheFuture.isCancelled()) {
            return;
        }
        try {
            cacheFuture.get();
        } catch (Exception e10) {
            C1662a.m9133b(e10);
        }
    }

    /* renamed from: A */
    public final C11627a m33550A(String path, String title, String desc, String str) {
        C9322n.m27781e(path, "path");
        C9322n.m27781e(title, "title");
        C9322n.m27781e(desc, "desc");
        if (new File(path).exists()) {
            return m33548n().mo39573C(this.f27932a, path, title, desc, str);
        }
        return null;
    }

    /* renamed from: B */
    public final void m33551B(boolean z10) {
        this.f27933b = z10;
    }

    /* renamed from: b */
    public final void m33552b(String id2, C1666e resultHandler) {
        C9322n.m27781e(id2, "id");
        C9322n.m27781e(resultHandler, "resultHandler");
        resultHandler.m9148g(Boolean.valueOf(m33548n().mo39587b(this.f27932a, id2)));
    }

    /* renamed from: c */
    public final void m33553c() {
        List m20630f0;
        m20630f0 = C7042z.m20630f0(this.f27934c);
        this.f27934c.clear();
        Iterator it = m20630f0.iterator();
        while (it.hasNext()) {
            ComponentCallbacks2C2116b.m10647u(this.f27932a).m10724m((InterfaceFutureC12589d) it.next());
        }
    }

    /* renamed from: d */
    public final void m33554d() {
        C0034a.f68a.m109a(this.f27932a);
        m33548n().mo39606u(this.f27932a);
    }

    /* renamed from: e */
    public final void m33555e(String assetId, String galleryId, C1666e resultHandler) {
        C9322n.m27781e(assetId, "assetId");
        C9322n.m27781e(galleryId, "galleryId");
        C9322n.m27781e(resultHandler, "resultHandler");
        try {
            C11627a mo39600o = m33548n().mo39600o(this.f27932a, assetId, galleryId);
            if (mo39600o == null) {
                resultHandler.m9148g(null);
            } else {
                resultHandler.m9148g(C12287c.f32921a.m39617a(mo39600o));
            }
        } catch (Exception e10) {
            C1662a.m9133b(e10);
            resultHandler.m9148g(null);
        }
    }

    /* renamed from: f */
    public final C11627a m33556f(String id2) {
        C9322n.m27781e(id2, "id");
        return InterfaceC12289e.b.m39655f(m33548n(), this.f27932a, id2, false, 4, null);
    }

    /* renamed from: g */
    public final C11628b m33557g(String id2, int i10, AbstractC12074e option) {
        C9322n.m27781e(id2, "id");
        C9322n.m27781e(option, "option");
        if (!C9322n.m27777a(id2, "isAll")) {
            C11628b mo39574D = m33548n().mo39574D(this.f27932a, id2, i10, option);
            if (mo39574D != null && option.mo38754a()) {
                m33548n().mo39594i(this.f27932a, mo39574D);
            }
            return mo39574D;
        }
        List<C11628b> mo39608w = m33548n().mo39608w(this.f27932a, i10, option);
        if (mo39608w.isEmpty()) {
            return null;
        }
        Iterator<C11628b> it = mo39608w.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += it.next().m36443a();
        }
        C11628b c11628b = new C11628b("isAll", "Recent", i11, i10, true, null, 32, null);
        if (!option.mo38754a()) {
            return c11628b;
        }
        m33548n().mo39594i(this.f27932a, c11628b);
        return c11628b;
    }

    /* renamed from: h */
    public final void m33558h(C1666e resultHandler, AbstractC12074e option, int i10) {
        C9322n.m27781e(resultHandler, "resultHandler");
        C9322n.m27781e(option, "option");
        resultHandler.m9148g(Integer.valueOf(m33548n().mo39576F(this.f27932a, option, i10)));
    }

    /* renamed from: i */
    public final List<C11627a> m33559i(String id2, int i10, int i11, int i12, AbstractC12074e option) {
        C9322n.m27781e(id2, "id");
        C9322n.m27781e(option, "option");
        if (C9322n.m27777a(id2, "isAll")) {
            id2 = "";
        }
        return m33548n().mo39610y(this.f27932a, id2, i11, i12, i10, option);
    }

    /* renamed from: j */
    public final List<C11627a> m33560j(String galleryId, int i10, int i11, int i12, AbstractC12074e option) {
        C9322n.m27781e(galleryId, "galleryId");
        C9322n.m27781e(option, "option");
        if (C9322n.m27777a(galleryId, "isAll")) {
            galleryId = "";
        }
        return m33548n().mo39586a(this.f27932a, galleryId, i11, i12, i10, option);
    }

    /* renamed from: k */
    public final List<C11628b> m33561k(int i10, boolean z10, boolean z11, AbstractC12074e option) {
        List m20572e;
        List<C11628b> m20616R;
        C9322n.m27781e(option, "option");
        if (z11) {
            return m33548n().mo39595j(this.f27932a, i10, option);
        }
        List<C11628b> mo39608w = m33548n().mo39608w(this.f27932a, i10, option);
        if (!z10) {
            return mo39608w;
        }
        Iterator<C11628b> it = mo39608w.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += it.next().m36443a();
        }
        m20572e = C7029q.m20572e(new C11628b("isAll", "Recent", i11, i10, true, null, 32, null));
        m20616R = C7042z.m20616R(m20572e, mo39608w);
        return m20616R;
    }

    /* renamed from: l */
    public final void m33562l(C1666e resultHandler, AbstractC12074e option, int i10, int i11, int i12) {
        C9322n.m27781e(resultHandler, "resultHandler");
        C9322n.m27781e(option, "option");
        resultHandler.m9148g(C12287c.f32921a.m39618b(m33548n().mo39604s(this.f27932a, option, i10, i11, i12)));
    }

    /* renamed from: m */
    public final void m33563m(C1666e resultHandler) {
        C9322n.m27781e(resultHandler, "resultHandler");
        resultHandler.m9148g(m33548n().mo39605t(this.f27932a));
    }

    /* renamed from: o */
    public final void m33564o(String id2, boolean z10, C1666e resultHandler) {
        C9322n.m27781e(id2, "id");
        C9322n.m27781e(resultHandler, "resultHandler");
        resultHandler.m9148g(m33548n().mo39572B(this.f27932a, id2, z10));
    }

    /* renamed from: p */
    public final Map<String, Double> m33565p(String id2) {
        Map<String, Double> m20424k;
        Map<String, Double> m20424k2;
        C9322n.m27781e(id2, "id");
        C1239a mo39575E = m33548n().mo39575E(this.f27932a, id2);
        double[] m6784l = mo39575E != null ? mo39575E.m6784l() : null;
        if (m6784l == null) {
            m20424k2 = C7018k0.m20424k(C2033r.m10353a("lat", Double.valueOf(0.0d)), C2033r.m10353a("lng", Double.valueOf(0.0d)));
            return m20424k2;
        }
        m20424k = C7018k0.m20424k(C2033r.m10353a("lat", Double.valueOf(m6784l[0])), C2033r.m10353a("lng", Double.valueOf(m6784l[1])));
        return m20424k;
    }

    /* renamed from: q */
    public final String m33566q(long j10, int i10) {
        return m33548n().mo39578H(this.f27932a, j10, i10);
    }

    /* renamed from: r */
    public final void m33567r(String id2, C1666e resultHandler, boolean z10) {
        C9322n.m27781e(id2, "id");
        C9322n.m27781e(resultHandler, "resultHandler");
        C11627a m39655f = InterfaceC12289e.b.m39655f(m33548n(), this.f27932a, id2, false, 4, null);
        if (m39655f == null) {
            C1666e.m9144j(resultHandler, "The asset not found", null, null, 6, null);
            return;
        }
        try {
            resultHandler.m9148g(m33548n().mo39599n(this.f27932a, m39655f, z10));
        } catch (Exception e10) {
            m33548n().mo39609x(this.f27932a, id2);
            resultHandler.m9149i("202", "get originBytes error", e10);
        }
    }

    /* renamed from: s */
    public final void m33568s(String id2, C11630d option, C1666e resultHandler) {
        int i10;
        int i11;
        C1666e c1666e;
        C9322n.m27781e(id2, "id");
        C9322n.m27781e(option, "option");
        C9322n.m27781e(resultHandler, "resultHandler");
        int m36455e = option.m36455e();
        int m36453c = option.m36453c();
        int m36454d = option.m36454d();
        Bitmap.CompressFormat m36451a = option.m36451a();
        long m36452b = option.m36452b();
        try {
            C11627a m39655f = InterfaceC12289e.b.m39655f(m33548n(), this.f27932a, id2, false, 4, null);
            if (m39655f == null) {
                C1666e.m9144j(resultHandler, "The asset not found!", null, null, 6, null);
                return;
            }
            i10 = m36453c;
            i11 = m36455e;
            c1666e = resultHandler;
            try {
                C0034a.f68a.m110b(this.f27932a, m39655f, option.m36455e(), option.m36453c(), m36451a, m36454d, m36452b, resultHandler);
            } catch (Exception e10) {
                e = e10;
                Log.e("PhotoManager", "get " + id2 + " thumbnail error, width : " + i11 + ", height: " + i10, e);
                m33548n().mo39609x(this.f27932a, id2);
                c1666e.m9149i("201", "get thumb error", e);
            }
        } catch (Exception e11) {
            e = e11;
            i10 = m36453c;
            i11 = m36455e;
            c1666e = resultHandler;
        }
    }

    /* renamed from: t */
    public final Uri m33569t(String id2) {
        C9322n.m27781e(id2, "id");
        C11627a m39655f = InterfaceC12289e.b.m39655f(m33548n(), this.f27932a, id2, false, 4, null);
        if (m39655f != null) {
            return m39655f.m36441n();
        }
        return null;
    }

    /* renamed from: u */
    public final void m33570u(String assetId, String albumId, C1666e resultHandler) {
        C9322n.m27781e(assetId, "assetId");
        C9322n.m27781e(albumId, "albumId");
        C9322n.m27781e(resultHandler, "resultHandler");
        try {
            C11627a mo39577G = m33548n().mo39577G(this.f27932a, assetId, albumId);
            if (mo39577G == null) {
                resultHandler.m9148g(null);
            } else {
                resultHandler.m9148g(C12287c.f32921a.m39617a(mo39577G));
            }
        } catch (Exception e10) {
            C1662a.m9133b(e10);
            resultHandler.m9148g(null);
        }
    }

    /* renamed from: v */
    public final void m33571v(C1666e resultHandler) {
        C9322n.m27781e(resultHandler, "resultHandler");
        resultHandler.m9148g(Boolean.valueOf(m33548n().mo39590e(this.f27932a)));
    }

    /* renamed from: w */
    public final void m33572w(List<String> ids, C11630d option, C1666e resultHandler) {
        List<InterfaceFutureC12589d> m20630f0;
        C9322n.m27781e(ids, "ids");
        C9322n.m27781e(option, "option");
        C9322n.m27781e(resultHandler, "resultHandler");
        Iterator<String> it = m33548n().mo39598m(this.f27932a, ids).iterator();
        while (it.hasNext()) {
            this.f27934c.add(C0034a.f68a.m111c(this.f27932a, it.next(), option));
        }
        resultHandler.m9148g(1);
        m20630f0 = C7042z.m20630f0(this.f27934c);
        for (final InterfaceFutureC12589d interfaceFutureC12589d : m20630f0) {
            f27931e.execute(new Runnable() { // from class: t5.a
                @Override // java.lang.Runnable
                public final void run() {
                    C10988b.m33549x(InterfaceFutureC12589d.this);
                }
            });
        }
    }

    /* renamed from: y */
    public final C11627a m33573y(String path, String title, String description, String str) {
        C9322n.m27781e(path, "path");
        C9322n.m27781e(title, "title");
        C9322n.m27781e(description, "description");
        return m33548n().mo39597l(this.f27932a, path, title, description, str);
    }

    /* renamed from: z */
    public final C11627a m33574z(byte[] image, String title, String description, String str) {
        C9322n.m27781e(image, "image");
        C9322n.m27781e(title, "title");
        C9322n.m27781e(description, "description");
        return m33548n().mo39591f(this.f27932a, image, title, description, str);
    }
}
