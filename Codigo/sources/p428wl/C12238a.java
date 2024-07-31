package p428wl;

import dk.C7031r;
import dm.C7065i;
import dm.C7068l;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import p319ql.AbstractC10523b0;
import p319ql.AbstractC10527d0;
import p319ql.C10521a0;
import p319ql.C10525c0;
import p319ql.C10538m;
import p319ql.C10548w;
import p319ql.InterfaceC10539n;
import p319ql.InterfaceC10547v;
import p341rl.C10727d;
import p450xk.C12524p;

/* renamed from: wl.a */
/* loaded from: classes3.dex */
public final class C12238a implements InterfaceC10547v {

    /* renamed from: a */
    private final InterfaceC10539n f32710a;

    public C12238a(InterfaceC10539n cookieJar) {
        C9322n.m27781e(cookieJar, "cookieJar");
        this.f32710a = cookieJar;
    }

    /* renamed from: b */
    private final String m39390b(List<C10538m> list) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C7031r.m20589q();
            }
            C10538m c10538m = (C10538m) obj;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(c10538m.m31776i());
            sb2.append('=');
            sb2.append(c10538m.m31781n());
            i10 = i11;
        }
        String sb3 = sb2.toString();
        C9322n.m27780d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    @Override // p319ql.InterfaceC10547v
    /* renamed from: a */
    public C10525c0 mo31938a(InterfaceC10547v.a chain) {
        boolean m41037r;
        AbstractC10527d0 m31641a;
        C9322n.m27781e(chain, "chain");
        C10521a0 mo31940o = chain.mo31940o();
        C10521a0.a m31607h = mo31940o.m31607h();
        AbstractC10523b0 m31600a = mo31940o.m31600a();
        if (m31600a != null) {
            C10548w mo19706b = m31600a.mo19706b();
            if (mo19706b != null) {
                m31607h.m31612d("Content-Type", mo19706b.toString());
            }
            long mo19705a = m31600a.mo19705a();
            if (mo19705a != -1) {
                m31607h.m31612d("Content-Length", String.valueOf(mo19705a));
                m31607h.m31618j("Transfer-Encoding");
            } else {
                m31607h.m31612d("Transfer-Encoding", "chunked");
                m31607h.m31618j("Content-Length");
            }
        }
        boolean z10 = false;
        if (mo31940o.m31603d("Host") == null) {
            m31607h.m31612d("Host", C10727d.m32632R(mo31940o.m31608i(), false, 1, null));
        }
        if (mo31940o.m31603d("Connection") == null) {
            m31607h.m31612d("Connection", "Keep-Alive");
        }
        if (mo31940o.m31603d("Accept-Encoding") == null && mo31940o.m31603d("Range") == null) {
            m31607h.m31612d("Accept-Encoding", "gzip");
            z10 = true;
        }
        List<C10538m> mo31790a = this.f32710a.mo31790a(mo31940o.m31608i());
        if (!mo31790a.isEmpty()) {
            m31607h.m31612d("Cookie", m39390b(mo31790a));
        }
        if (mo31940o.m31603d("User-Agent") == null) {
            m31607h.m31612d("User-Agent", "okhttp/4.11.0");
        }
        C10525c0 mo31939a = chain.mo31939a(m31607h.m31610b());
        C12242e.m39408f(this.f32710a, mo31940o.m31608i(), mo31939a.m31649o());
        C10525c0.a m31677s = mo31939a.m31635B().m31677s(mo31940o);
        if (z10) {
            m41037r = C12524p.m41037r("gzip", C10525c0.m31634n(mo31939a, "Content-Encoding", null, 2, null), true);
            if (m41037r && C12242e.m39404b(mo31939a) && (m31641a = mo31939a.m31641a()) != null) {
                C7065i c7065i = new C7065i(m31641a.mo31707f());
                m31677s.m31670l(mo31939a.m31649o().m31848k().m31857g("Content-Encoding").m31857g("Content-Length").m31855e());
                m31677s.m31662b(new C12245h(C10525c0.m31634n(mo31939a, "Content-Type", null, 2, null), -1L, C7068l.m20803b(c7065i)));
            }
        }
        return m31677s.m31663c();
    }
}
