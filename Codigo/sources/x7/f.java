package x7;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import s8.e0;
import s8.l0;
import t6.u1;
import v7.u;

/* loaded from: classes.dex */
public abstract class f implements e0.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f30601a = u.a();

    /* renamed from: b, reason: collision with root package name */
    public final s8.n f30602b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30603c;

    /* renamed from: d, reason: collision with root package name */
    public final u1 f30604d;

    /* renamed from: e, reason: collision with root package name */
    public final int f30605e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f30606f;

    /* renamed from: g, reason: collision with root package name */
    public final long f30607g;

    /* renamed from: h, reason: collision with root package name */
    public final long f30608h;

    /* renamed from: i, reason: collision with root package name */
    protected final l0 f30609i;

    public f(s8.j jVar, s8.n nVar, int i10, u1 u1Var, int i11, Object obj, long j10, long j11) {
        this.f30609i = new l0(jVar);
        this.f30602b = (s8.n) t8.a.e(nVar);
        this.f30603c = i10;
        this.f30604d = u1Var;
        this.f30605e = i11;
        this.f30606f = obj;
        this.f30607g = j10;
        this.f30608h = j11;
    }

    public final long a() {
        return this.f30609i.h();
    }

    public final long d() {
        return this.f30608h - this.f30607g;
    }

    public final Map<String, List<String>> e() {
        return this.f30609i.s();
    }

    public final Uri f() {
        return this.f30609i.r();
    }
}
