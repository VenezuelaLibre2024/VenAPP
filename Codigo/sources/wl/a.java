package wl;

import dk.r;
import dm.l;
import java.util.List;
import ql.a0;
import ql.b0;
import ql.c0;
import ql.d0;
import ql.m;
import ql.n;
import ql.v;
import ql.w;
import xk.p;

/* loaded from: classes3.dex */
public final class a implements v {

    /* renamed from: a, reason: collision with root package name */
    private final n f30198a;

    public a(n cookieJar) {
        kotlin.jvm.internal.n.e(cookieJar, "cookieJar");
        this.f30198a = cookieJar;
    }

    private final String b(List<m> list) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                r.q();
            }
            m mVar = (m) obj;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(mVar.i());
            sb2.append('=');
            sb2.append(mVar.n());
            i10 = i11;
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.n.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    @Override // ql.v
    public c0 a(v.a chain) {
        boolean r10;
        d0 a10;
        kotlin.jvm.internal.n.e(chain, "chain");
        a0 o10 = chain.o();
        a0.a h10 = o10.h();
        b0 a11 = o10.a();
        if (a11 != null) {
            w b10 = a11.b();
            if (b10 != null) {
                h10.d("Content-Type", b10.toString());
            }
            long a12 = a11.a();
            if (a12 != -1) {
                h10.d("Content-Length", String.valueOf(a12));
                h10.j("Transfer-Encoding");
            } else {
                h10.d("Transfer-Encoding", "chunked");
                h10.j("Content-Length");
            }
        }
        boolean z10 = false;
        if (o10.d("Host") == null) {
            h10.d("Host", rl.d.R(o10.i(), false, 1, null));
        }
        if (o10.d("Connection") == null) {
            h10.d("Connection", "Keep-Alive");
        }
        if (o10.d("Accept-Encoding") == null && o10.d("Range") == null) {
            h10.d("Accept-Encoding", "gzip");
            z10 = true;
        }
        List<m> a13 = this.f30198a.a(o10.i());
        if (!a13.isEmpty()) {
            h10.d("Cookie", b(a13));
        }
        if (o10.d("User-Agent") == null) {
            h10.d("User-Agent", "okhttp/4.11.0");
        }
        c0 a14 = chain.a(h10.b());
        e.f(this.f30198a, o10.i(), a14.o());
        c0.a s10 = a14.B().s(o10);
        if (z10) {
            r10 = p.r("gzip", c0.n(a14, "Content-Encoding", null, 2, null), true);
            if (r10 && e.b(a14) && (a10 = a14.a()) != null) {
                dm.i iVar = new dm.i(a10.f());
                s10.l(a14.o().k().g("Content-Encoding").g("Content-Length").e());
                s10.b(new h(c0.n(a14, "Content-Type", null, 2, null), -1L, l.b(iVar)));
            }
        }
        return s10.c();
    }
}
