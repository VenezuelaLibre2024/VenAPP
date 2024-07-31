package s8;

import android.net.Uri;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import s8.e0;
import s8.n;
import t8.r0;

/* loaded from: classes.dex */
public final class g0<T> implements e0.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f25248a;

    /* renamed from: b, reason: collision with root package name */
    public final n f25249b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25250c;

    /* renamed from: d, reason: collision with root package name */
    private final l0 f25251d;

    /* renamed from: e, reason: collision with root package name */
    private final a<? extends T> f25252e;

    /* renamed from: f, reason: collision with root package name */
    private volatile T f25253f;

    /* loaded from: classes.dex */
    public interface a<T> {
        T a(Uri uri, InputStream inputStream);
    }

    public g0(j jVar, Uri uri, int i10, a<? extends T> aVar) {
        this(jVar, new n.b().i(uri).b(1).a(), i10, aVar);
    }

    public g0(j jVar, n nVar, int i10, a<? extends T> aVar) {
        this.f25251d = new l0(jVar);
        this.f25249b = nVar;
        this.f25250c = i10;
        this.f25252e = aVar;
        this.f25248a = v7.u.a();
    }

    public long a() {
        return this.f25251d.h();
    }

    @Override // s8.e0.e
    public final void b() {
        this.f25251d.t();
        l lVar = new l(this.f25251d, this.f25249b);
        try {
            lVar.b();
            this.f25253f = this.f25252e.a((Uri) t8.a.e(this.f25251d.getUri()), lVar);
        } finally {
            r0.n(lVar);
        }
    }

    @Override // s8.e0.e
    public final void c() {
    }

    public Map<String, List<String>> d() {
        return this.f25251d.s();
    }

    public final T e() {
        return this.f25253f;
    }

    public Uri f() {
        return this.f25251d.r();
    }
}
