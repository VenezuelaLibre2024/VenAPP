package s8;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import s8.j;
import s8.s;
import t8.r0;

/* loaded from: classes.dex */
public final class r implements j {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25353a;

    /* renamed from: b, reason: collision with root package name */
    private final List<m0> f25354b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final j f25355c;

    /* renamed from: d, reason: collision with root package name */
    private j f25356d;

    /* renamed from: e, reason: collision with root package name */
    private j f25357e;

    /* renamed from: f, reason: collision with root package name */
    private j f25358f;

    /* renamed from: g, reason: collision with root package name */
    private j f25359g;

    /* renamed from: h, reason: collision with root package name */
    private j f25360h;

    /* renamed from: i, reason: collision with root package name */
    private j f25361i;

    /* renamed from: j, reason: collision with root package name */
    private j f25362j;

    /* renamed from: k, reason: collision with root package name */
    private j f25363k;

    /* loaded from: classes.dex */
    public static final class a implements j.a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f25364a;

        /* renamed from: b, reason: collision with root package name */
        private final j.a f25365b;

        /* renamed from: c, reason: collision with root package name */
        private m0 f25366c;

        public a(Context context) {
            this(context, new s.b());
        }

        public a(Context context, j.a aVar) {
            this.f25364a = context.getApplicationContext();
            this.f25365b = aVar;
        }

        @Override // s8.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r a() {
            r rVar = new r(this.f25364a, this.f25365b.a());
            m0 m0Var = this.f25366c;
            if (m0Var != null) {
                rVar.l(m0Var);
            }
            return rVar;
        }
    }

    public r(Context context, j jVar) {
        this.f25353a = context.getApplicationContext();
        this.f25355c = (j) t8.a.e(jVar);
    }

    private void h(j jVar) {
        for (int i10 = 0; i10 < this.f25354b.size(); i10++) {
            jVar.l(this.f25354b.get(i10));
        }
    }

    private j r() {
        if (this.f25357e == null) {
            c cVar = new c(this.f25353a);
            this.f25357e = cVar;
            h(cVar);
        }
        return this.f25357e;
    }

    private j s() {
        if (this.f25358f == null) {
            g gVar = new g(this.f25353a);
            this.f25358f = gVar;
            h(gVar);
        }
        return this.f25358f;
    }

    private j t() {
        if (this.f25361i == null) {
            i iVar = new i();
            this.f25361i = iVar;
            h(iVar);
        }
        return this.f25361i;
    }

    private j u() {
        if (this.f25356d == null) {
            w wVar = new w();
            this.f25356d = wVar;
            h(wVar);
        }
        return this.f25356d;
    }

    private j v() {
        if (this.f25362j == null) {
            h0 h0Var = new h0(this.f25353a);
            this.f25362j = h0Var;
            h(h0Var);
        }
        return this.f25362j;
    }

    private j w() {
        if (this.f25359g == null) {
            try {
                j jVar = (j) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f25359g = jVar;
                h(jVar);
            } catch (ClassNotFoundException unused) {
                t8.s.i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f25359g == null) {
                this.f25359g = this.f25355c;
            }
        }
        return this.f25359g;
    }

    private j x() {
        if (this.f25360h == null) {
            n0 n0Var = new n0();
            this.f25360h = n0Var;
            h(n0Var);
        }
        return this.f25360h;
    }

    private void y(j jVar, m0 m0Var) {
        if (jVar != null) {
            jVar.l(m0Var);
        }
    }

    @Override // s8.j
    public void close() {
        j jVar = this.f25363k;
        if (jVar != null) {
            try {
                jVar.close();
            } finally {
                this.f25363k = null;
            }
        }
    }

    @Override // s8.j
    public Map<String, List<String>> e() {
        j jVar = this.f25363k;
        return jVar == null ? Collections.emptyMap() : jVar.e();
    }

    @Override // s8.j
    public Uri getUri() {
        j jVar = this.f25363k;
        if (jVar == null) {
            return null;
        }
        return jVar.getUri();
    }

    @Override // s8.j
    public void l(m0 m0Var) {
        t8.a.e(m0Var);
        this.f25355c.l(m0Var);
        this.f25354b.add(m0Var);
        y(this.f25356d, m0Var);
        y(this.f25357e, m0Var);
        y(this.f25358f, m0Var);
        y(this.f25359g, m0Var);
        y(this.f25360h, m0Var);
        y(this.f25361i, m0Var);
        y(this.f25362j, m0Var);
    }

    @Override // s8.j
    public long o(n nVar) {
        j s10;
        t8.a.g(this.f25363k == null);
        String scheme = nVar.f25288a.getScheme();
        if (r0.w0(nVar.f25288a)) {
            String path = nVar.f25288a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                s10 = u();
            }
            s10 = r();
        } else {
            if (!"asset".equals(scheme)) {
                s10 = "content".equals(scheme) ? s() : "rtmp".equals(scheme) ? w() : "udp".equals(scheme) ? x() : "data".equals(scheme) ? t() : ("rawresource".equals(scheme) || "android.resource".equals(scheme)) ? v() : this.f25355c;
            }
            s10 = r();
        }
        this.f25363k = s10;
        return this.f25363k.o(nVar);
    }

    @Override // s8.h
    public int read(byte[] bArr, int i10, int i11) {
        return ((j) t8.a.e(this.f25363k)).read(bArr, i10, i11);
    }
}
