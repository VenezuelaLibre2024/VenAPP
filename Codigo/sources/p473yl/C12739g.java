package p473yl;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import dm.C7081y;
import dm.InterfaceC7078v;
import dm.InterfaceC7080x;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p319ql.C10521a0;
import p319ql.C10525c0;
import p319ql.C10545t;
import p319ql.C10550y;
import p319ql.EnumC10551z;
import p341rl.C10727d;
import p406vl.C11979f;
import p428wl.C12242e;
import p428wl.C12244g;
import p428wl.C12246i;
import p428wl.C12248k;
import p428wl.InterfaceC12241d;

/* renamed from: yl.g */
/* loaded from: classes3.dex */
public final class C12739g implements InterfaceC12241d {

    /* renamed from: g */
    public static final a f34690g = new a(null);

    /* renamed from: h */
    private static final List<String> f34691h = C10727d.m32663w("connection", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: i */
    private static final List<String> f34692i = C10727d.m32663w("connection", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    private final C11979f f34693a;

    /* renamed from: b */
    private final C12244g f34694b;

    /* renamed from: c */
    private final C12738f f34695c;

    /* renamed from: d */
    private volatile C12741i f34696d;

    /* renamed from: e */
    private final EnumC10551z f34697e;

    /* renamed from: f */
    private volatile boolean f34698f;

    /* renamed from: yl.g$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final List<C12735c> m42174a(C10521a0 request) {
            C9322n.m27781e(request, "request");
            C10545t m31604e = request.m31604e();
            ArrayList arrayList = new ArrayList(m31604e.size() + 4);
            arrayList.add(new C12735c(C12735c.f34557g, request.m31606g()));
            arrayList.add(new C12735c(C12735c.f34558h, C12246i.f32730a.m39426c(request.m31608i())));
            String m31603d = request.m31603d("Host");
            if (m31603d != null) {
                arrayList.add(new C12735c(C12735c.f34560j, m31603d));
            }
            arrayList.add(new C12735c(C12735c.f34559i, request.m31608i().m31882q()));
            int size = m31604e.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                String m31846d = m31604e.m31846d(i10);
                Locale US = Locale.US;
                C9322n.m27780d(US, "US");
                String lowerCase = m31846d.toLowerCase(US);
                C9322n.m27780d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!C12739g.f34691h.contains(lowerCase) || (C9322n.m27777a(lowerCase, "te") && C9322n.m27777a(m31604e.m31849l(i10), "trailers"))) {
                    arrayList.add(new C12735c(lowerCase, m31604e.m31849l(i10)));
                }
                i10 = i11;
            }
            return arrayList;
        }

        /* renamed from: b */
        public final C10525c0.a m42175b(C10545t headerBlock, EnumC10551z protocol) {
            C9322n.m27781e(headerBlock, "headerBlock");
            C9322n.m27781e(protocol, "protocol");
            C10545t.a aVar = new C10545t.a();
            int size = headerBlock.size();
            C12248k c12248k = null;
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                String m31846d = headerBlock.m31846d(i10);
                String m31849l = headerBlock.m31849l(i10);
                if (C9322n.m27777a(m31846d, ":status")) {
                    c12248k = C12248k.f32733d.m39433a(C9322n.m27787k("HTTP/1.1 ", m31849l));
                } else if (!C12739g.f34692i.contains(m31846d)) {
                    aVar.m31853c(m31846d, m31849l);
                }
                i10 = i11;
            }
            if (c12248k != null) {
                return new C10525c0.a().m31675q(protocol).m31665g(c12248k.f32735b).m31672n(c12248k.f32736c).m31670l(aVar.m31855e());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public C12739g(C10550y client, C11979f connection, C12244g chain, C12738f http2Connection) {
        C9322n.m27781e(client, "client");
        C9322n.m27781e(connection, "connection");
        C9322n.m27781e(chain, "chain");
        C9322n.m27781e(http2Connection, "http2Connection");
        this.f34693a = connection;
        this.f34694b = chain;
        this.f34695c = http2Connection;
        List<EnumC10551z> m31993z = client.m31993z();
        EnumC10551z enumC10551z = EnumC10551z.H2_PRIOR_KNOWLEDGE;
        this.f34697e = m31993z.contains(enumC10551z) ? enumC10551z : EnumC10551z.HTTP_2;
    }

    @Override // p428wl.InterfaceC12241d
    /* renamed from: a */
    public void mo39395a() {
        C12741i c12741i = this.f34696d;
        C9322n.m27778b(c12741i);
        c12741i.m42219n().close();
    }

    @Override // p428wl.InterfaceC12241d
    /* renamed from: b */
    public C11979f mo39396b() {
        return this.f34693a;
    }

    @Override // p428wl.InterfaceC12241d
    /* renamed from: c */
    public long mo39397c(C10525c0 response) {
        C9322n.m27781e(response, "response");
        if (C12242e.m39404b(response)) {
            return C10727d.m32662v(response);
        }
        return 0L;
    }

    @Override // p428wl.InterfaceC12241d
    public void cancel() {
        this.f34698f = true;
        C12741i c12741i = this.f34696d;
        if (c12741i == null) {
            return;
        }
        c12741i.m42211f(EnumC12734b.CANCEL);
    }

    @Override // p428wl.InterfaceC12241d
    /* renamed from: d */
    public InterfaceC7078v mo39398d(C10521a0 request, long j10) {
        C9322n.m27781e(request, "request");
        C12741i c12741i = this.f34696d;
        C9322n.m27778b(c12741i);
        return c12741i.m42219n();
    }

    @Override // p428wl.InterfaceC12241d
    /* renamed from: e */
    public C10525c0.a mo39399e(boolean z10) {
        C12741i c12741i = this.f34696d;
        if (c12741i == null) {
            throw new IOException("stream wasn't created");
        }
        C10525c0.a m42175b = f34690g.m42175b(c12741i.m42204E(), this.f34697e);
        if (z10 && m42175b.m31666h() == 100) {
            return null;
        }
        return m42175b;
    }

    @Override // p428wl.InterfaceC12241d
    /* renamed from: f */
    public void mo39400f() {
        this.f34695c.flush();
    }

    @Override // p428wl.InterfaceC12241d
    /* renamed from: g */
    public void mo39401g(C10521a0 request) {
        C9322n.m27781e(request, "request");
        if (this.f34696d != null) {
            return;
        }
        this.f34696d = this.f34695c.m42113J0(f34690g.m42174a(request), request.m31600a() != null);
        if (this.f34698f) {
            C12741i c12741i = this.f34696d;
            C9322n.m27778b(c12741i);
            c12741i.m42211f(EnumC12734b.CANCEL);
            throw new IOException("Canceled");
        }
        C12741i c12741i2 = this.f34696d;
        C9322n.m27778b(c12741i2);
        C7081y m42227v = c12741i2.m42227v();
        long m39420g = this.f34694b.m39420g();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        m42227v.mo20792g(m39420g, timeUnit);
        C12741i c12741i3 = this.f34696d;
        C9322n.m27778b(c12741i3);
        c12741i3.m42206G().mo20792g(this.f34694b.m39422i(), timeUnit);
    }

    @Override // p428wl.InterfaceC12241d
    /* renamed from: h */
    public InterfaceC7080x mo39402h(C10525c0 response) {
        C9322n.m27781e(response, "response");
        C12741i c12741i = this.f34696d;
        C9322n.m27778b(c12741i);
        return c12741i.m42221p();
    }
}
