package p406vl;

import java.io.IOException;
import kotlin.jvm.internal.C9322n;
import p319ql.AbstractC10543r;
import p319ql.C10520a;
import p319ql.C10529e0;
import p319ql.C10546u;
import p319ql.C10550y;
import p341rl.C10727d;
import p406vl.C11983j;
import p428wl.C12244g;
import p428wl.InterfaceC12241d;
import p473yl.C12733a;
import p473yl.C12746n;
import p473yl.EnumC12734b;

/* renamed from: vl.d */
/* loaded from: classes3.dex */
public final class C11977d {

    /* renamed from: a */
    private final C11980g f31768a;

    /* renamed from: b */
    private final C10520a f31769b;

    /* renamed from: c */
    private final C11978e f31770c;

    /* renamed from: d */
    private final AbstractC10543r f31771d;

    /* renamed from: e */
    private C11983j.b f31772e;

    /* renamed from: f */
    private C11983j f31773f;

    /* renamed from: g */
    private int f31774g;

    /* renamed from: h */
    private int f31775h;

    /* renamed from: i */
    private int f31776i;

    /* renamed from: j */
    private C10529e0 f31777j;

    public C11977d(C11980g connectionPool, C10520a address, C11978e call, AbstractC10543r eventListener) {
        C9322n.m27781e(connectionPool, "connectionPool");
        C9322n.m27781e(address, "address");
        C9322n.m27781e(call, "call");
        C9322n.m27781e(eventListener, "eventListener");
        this.f31768a = connectionPool;
        this.f31769b = address;
        this.f31770c = call;
        this.f31771d = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p406vl.C11979f m38421b(int r15, int r16, int r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p406vl.C11977d.m38421b(int, int, int, int, boolean):vl.f");
    }

    /* renamed from: c */
    private final C11979f m38422c(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        while (true) {
            C11979f m38421b = m38421b(i10, i11, i12, i13, z10);
            if (m38421b.m38488u(z11)) {
                return m38421b;
            }
            m38421b.m38492y();
            if (this.f31777j == null) {
                C11983j.b bVar = this.f31772e;
                if (bVar == null ? true : bVar.m38516b()) {
                    continue;
                } else {
                    C11983j c11983j = this.f31773f;
                    if (!(c11983j != null ? c11983j.m38512a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    /* renamed from: f */
    private final C10529e0 m38423f() {
        C11979f m38443l;
        if (this.f31774g > 1 || this.f31775h > 1 || this.f31776i > 0 || (m38443l = this.f31770c.m38443l()) == null) {
            return null;
        }
        synchronized (m38443l) {
            if (m38443l.m38484q() != 0) {
                return null;
            }
            if (C10727d.m32650j(m38443l.m38493z().m31716a().m31599l(), m38425d().m31599l())) {
                return m38443l.m38493z();
            }
            return null;
        }
    }

    /* renamed from: a */
    public final InterfaceC12241d m38424a(C10550y client, C12244g chain) {
        C9322n.m27781e(client, "client");
        C9322n.m27781e(chain, "chain");
        try {
            return m38422c(chain.m39418e(), chain.m39420g(), chain.m39422i(), client.m31992x(), client.m31970E(), !C9322n.m27777a(chain.m39421h().m31606g(), "GET")).m38490w(client, chain);
        } catch (IOException e10) {
            m38428h(e10);
            throw new C11982i(e10);
        } catch (C11982i e11) {
            m38428h(e11.m38506c());
            throw e11;
        }
    }

    /* renamed from: d */
    public final C10520a m38425d() {
        return this.f31769b;
    }

    /* renamed from: e */
    public final boolean m38426e() {
        C11983j c11983j;
        boolean z10 = false;
        if (this.f31774g == 0 && this.f31775h == 0 && this.f31776i == 0) {
            return false;
        }
        if (this.f31777j != null) {
            return true;
        }
        C10529e0 m38423f = m38423f();
        if (m38423f != null) {
            this.f31777j = m38423f;
            return true;
        }
        C11983j.b bVar = this.f31772e;
        if (bVar != null && bVar.m38516b()) {
            z10 = true;
        }
        if (z10 || (c11983j = this.f31773f) == null) {
            return true;
        }
        return c11983j.m38512a();
    }

    /* renamed from: g */
    public final boolean m38427g(C10546u url) {
        C9322n.m27781e(url, "url");
        C10546u m31599l = this.f31769b.m31599l();
        return url.m31878m() == m31599l.m31878m() && C9322n.m27777a(url.m31874h(), m31599l.m31874h());
    }

    /* renamed from: h */
    public final void m38428h(IOException e10) {
        C9322n.m27781e(e10, "e");
        this.f31777j = null;
        if ((e10 instanceof C12746n) && ((C12746n) e10).f34760a == EnumC12734b.REFUSED_STREAM) {
            this.f31774g++;
        } else if (e10 instanceof C12733a) {
            this.f31775h++;
        } else {
            this.f31776i++;
        }
    }
}
