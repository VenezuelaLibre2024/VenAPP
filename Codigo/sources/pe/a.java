package pe;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.c;
import fe.f;
import oe.e;
import qe.d;
import qe.h;
import zb.g;

/* loaded from: classes.dex */
public final class a implements pe.b {

    /* renamed from: a, reason: collision with root package name */
    private bk.a<g> f23033a;

    /* renamed from: b, reason: collision with root package name */
    private bk.a<ee.b<c>> f23034b;

    /* renamed from: c, reason: collision with root package name */
    private bk.a<f> f23035c;

    /* renamed from: d, reason: collision with root package name */
    private bk.a<ee.b<f6.g>> f23036d;

    /* renamed from: e, reason: collision with root package name */
    private bk.a<RemoteConfigManager> f23037e;

    /* renamed from: f, reason: collision with root package name */
    private bk.a<com.google.firebase.perf.config.a> f23038f;

    /* renamed from: g, reason: collision with root package name */
    private bk.a<SessionManager> f23039g;

    /* renamed from: h, reason: collision with root package name */
    private bk.a<e> f23040h;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private qe.a f23041a;

        private b() {
        }

        public pe.b a() {
            hi.b.a(this.f23041a, qe.a.class);
            return new a(this.f23041a);
        }

        public b b(qe.a aVar) {
            this.f23041a = (qe.a) hi.b.b(aVar);
            return this;
        }
    }

    private a(qe.a aVar) {
        c(aVar);
    }

    public static b b() {
        return new b();
    }

    private void c(qe.a aVar) {
        this.f23033a = qe.c.a(aVar);
        this.f23034b = qe.e.a(aVar);
        this.f23035c = d.a(aVar);
        this.f23036d = h.a(aVar);
        this.f23037e = qe.f.a(aVar);
        this.f23038f = qe.b.a(aVar);
        qe.g a10 = qe.g.a(aVar);
        this.f23039g = a10;
        this.f23040h = hi.a.a(oe.g.a(this.f23033a, this.f23034b, this.f23035c, this.f23036d, this.f23037e, this.f23038f, a10));
    }

    @Override // pe.b
    public e a() {
        return this.f23040h.get();
    }
}
