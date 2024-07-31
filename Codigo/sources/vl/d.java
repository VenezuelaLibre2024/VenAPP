package vl;

import java.io.IOException;
import kotlin.jvm.internal.n;
import ql.e0;
import ql.r;
import ql.u;
import ql.y;
import vl.j;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a */
    private final g f29333a;

    /* renamed from: b */
    private final ql.a f29334b;

    /* renamed from: c */
    private final e f29335c;

    /* renamed from: d */
    private final r f29336d;

    /* renamed from: e */
    private j.b f29337e;

    /* renamed from: f */
    private j f29338f;

    /* renamed from: g */
    private int f29339g;

    /* renamed from: h */
    private int f29340h;

    /* renamed from: i */
    private int f29341i;

    /* renamed from: j */
    private e0 f29342j;

    public d(g connectionPool, ql.a address, e call, r eventListener) {
        n.e(connectionPool, "connectionPool");
        n.e(address, "address");
        n.e(call, "call");
        n.e(eventListener, "eventListener");
        this.f29333a = connectionPool;
        this.f29334b = address;
        this.f29335c = call;
        this.f29336d = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final vl.f b(int r15, int r16, int r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vl.d.b(int, int, int, int, boolean):vl.f");
    }

    private final f c(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        while (true) {
            f b10 = b(i10, i11, i12, i13, z10);
            if (b10.u(z11)) {
                return b10;
            }
            b10.y();
            if (this.f29342j == null) {
                j.b bVar = this.f29337e;
                if (bVar == null ? true : bVar.b()) {
                    continue;
                } else {
                    j jVar = this.f29338f;
                    if (!(jVar != null ? jVar.a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    private final e0 f() {
        f l10;
        if (this.f29339g > 1 || this.f29340h > 1 || this.f29341i > 0 || (l10 = this.f29335c.l()) == null) {
            return null;
        }
        synchronized (l10) {
            if (l10.q() != 0) {
                return null;
            }
            if (rl.d.j(l10.z().a().l(), d().l())) {
                return l10.z();
            }
            return null;
        }
    }

    public final wl.d a(y client, wl.g chain) {
        n.e(client, "client");
        n.e(chain, "chain");
        try {
            return c(chain.e(), chain.g(), chain.i(), client.x(), client.E(), !n.a(chain.h().g(), "GET")).w(client, chain);
        } catch (IOException e10) {
            h(e10);
            throw new i(e10);
        } catch (i e11) {
            h(e11.c());
            throw e11;
        }
    }

    public final ql.a d() {
        return this.f29334b;
    }

    public final boolean e() {
        j jVar;
        boolean z10 = false;
        if (this.f29339g == 0 && this.f29340h == 0 && this.f29341i == 0) {
            return false;
        }
        if (this.f29342j != null) {
            return true;
        }
        e0 f10 = f();
        if (f10 != null) {
            this.f29342j = f10;
            return true;
        }
        j.b bVar = this.f29337e;
        if (bVar != null && bVar.b()) {
            z10 = true;
        }
        if (z10 || (jVar = this.f29338f) == null) {
            return true;
        }
        return jVar.a();
    }

    public final boolean g(u url) {
        n.e(url, "url");
        u l10 = this.f29334b.l();
        return url.m() == l10.m() && n.a(url.h(), l10.h());
    }

    public final void h(IOException e10) {
        n.e(e10, "e");
        this.f29342j = null;
        if ((e10 instanceof yl.n) && ((yl.n) e10).f32209a == yl.b.REFUSED_STREAM) {
            this.f29339g++;
        } else if (e10 instanceof yl.a) {
            this.f29340h++;
        } else {
            this.f29341i++;
        }
    }
}
