package yl;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import dm.v;
import dm.x;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import ql.a0;
import ql.c0;
import ql.t;
import ql.y;
import ql.z;

/* loaded from: classes3.dex */
public final class g implements wl.d {

    /* renamed from: g, reason: collision with root package name */
    public static final a f32139g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static final List<String> f32140h = rl.d.w("connection", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: i, reason: collision with root package name */
    private static final List<String> f32141i = rl.d.w("connection", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    private final vl.f f32142a;

    /* renamed from: b, reason: collision with root package name */
    private final wl.g f32143b;

    /* renamed from: c, reason: collision with root package name */
    private final f f32144c;

    /* renamed from: d, reason: collision with root package name */
    private volatile i f32145d;

    /* renamed from: e, reason: collision with root package name */
    private final z f32146e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f32147f;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final List<c> a(a0 request) {
            kotlin.jvm.internal.n.e(request, "request");
            t e10 = request.e();
            ArrayList arrayList = new ArrayList(e10.size() + 4);
            arrayList.add(new c(c.f32021g, request.g()));
            arrayList.add(new c(c.f32022h, wl.i.f30218a.c(request.i())));
            String d10 = request.d("Host");
            if (d10 != null) {
                arrayList.add(new c(c.f32024j, d10));
            }
            arrayList.add(new c(c.f32023i, request.i().q()));
            int size = e10.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                String d11 = e10.d(i10);
                Locale US = Locale.US;
                kotlin.jvm.internal.n.d(US, "US");
                String lowerCase = d11.toLowerCase(US);
                kotlin.jvm.internal.n.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!g.f32140h.contains(lowerCase) || (kotlin.jvm.internal.n.a(lowerCase, "te") && kotlin.jvm.internal.n.a(e10.l(i10), "trailers"))) {
                    arrayList.add(new c(lowerCase, e10.l(i10)));
                }
                i10 = i11;
            }
            return arrayList;
        }

        public final c0.a b(t headerBlock, z protocol) {
            kotlin.jvm.internal.n.e(headerBlock, "headerBlock");
            kotlin.jvm.internal.n.e(protocol, "protocol");
            t.a aVar = new t.a();
            int size = headerBlock.size();
            wl.k kVar = null;
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                String d10 = headerBlock.d(i10);
                String l10 = headerBlock.l(i10);
                if (kotlin.jvm.internal.n.a(d10, ":status")) {
                    kVar = wl.k.f30221d.a(kotlin.jvm.internal.n.k("HTTP/1.1 ", l10));
                } else if (!g.f32141i.contains(d10)) {
                    aVar.c(d10, l10);
                }
                i10 = i11;
            }
            if (kVar != null) {
                return new c0.a().q(protocol).g(kVar.f30223b).n(kVar.f30224c).l(aVar.e());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public g(y client, vl.f connection, wl.g chain, f http2Connection) {
        kotlin.jvm.internal.n.e(client, "client");
        kotlin.jvm.internal.n.e(connection, "connection");
        kotlin.jvm.internal.n.e(chain, "chain");
        kotlin.jvm.internal.n.e(http2Connection, "http2Connection");
        this.f32142a = connection;
        this.f32143b = chain;
        this.f32144c = http2Connection;
        List<z> z10 = client.z();
        z zVar = z.H2_PRIOR_KNOWLEDGE;
        this.f32146e = z10.contains(zVar) ? zVar : z.HTTP_2;
    }

    @Override // wl.d
    public void a() {
        i iVar = this.f32145d;
        kotlin.jvm.internal.n.b(iVar);
        iVar.n().close();
    }

    @Override // wl.d
    public vl.f b() {
        return this.f32142a;
    }

    @Override // wl.d
    public long c(c0 response) {
        kotlin.jvm.internal.n.e(response, "response");
        if (wl.e.b(response)) {
            return rl.d.v(response);
        }
        return 0L;
    }

    @Override // wl.d
    public void cancel() {
        this.f32147f = true;
        i iVar = this.f32145d;
        if (iVar == null) {
            return;
        }
        iVar.f(b.CANCEL);
    }

    @Override // wl.d
    public v d(a0 request, long j10) {
        kotlin.jvm.internal.n.e(request, "request");
        i iVar = this.f32145d;
        kotlin.jvm.internal.n.b(iVar);
        return iVar.n();
    }

    @Override // wl.d
    public c0.a e(boolean z10) {
        i iVar = this.f32145d;
        if (iVar == null) {
            throw new IOException("stream wasn't created");
        }
        c0.a b10 = f32139g.b(iVar.E(), this.f32146e);
        if (z10 && b10.h() == 100) {
            return null;
        }
        return b10;
    }

    @Override // wl.d
    public void f() {
        this.f32144c.flush();
    }

    @Override // wl.d
    public void g(a0 request) {
        kotlin.jvm.internal.n.e(request, "request");
        if (this.f32145d != null) {
            return;
        }
        this.f32145d = this.f32144c.J0(f32139g.a(request), request.a() != null);
        if (this.f32147f) {
            i iVar = this.f32145d;
            kotlin.jvm.internal.n.b(iVar);
            iVar.f(b.CANCEL);
            throw new IOException("Canceled");
        }
        i iVar2 = this.f32145d;
        kotlin.jvm.internal.n.b(iVar2);
        dm.y v10 = iVar2.v();
        long g10 = this.f32143b.g();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        v10.g(g10, timeUnit);
        i iVar3 = this.f32145d;
        kotlin.jvm.internal.n.b(iVar3);
        iVar3.G().g(this.f32143b.i(), timeUnit);
    }

    @Override // wl.d
    public x h(c0 response) {
        kotlin.jvm.internal.n.e(response, "response");
        i iVar = this.f32145d;
        kotlin.jvm.internal.n.b(iVar);
        return iVar.p();
    }
}
