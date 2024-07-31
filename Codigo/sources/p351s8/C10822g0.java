package p351s8;

import android.net.Uri;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import p351s8.C10818e0;
import p351s8.C10835n;
import p363t8.C11137a;
import p363t8.C11172r0;
import p397v7.C11731u;

/* renamed from: s8.g0 */
/* loaded from: classes.dex */
public final class C10822g0<T> implements C10818e0.e {

    /* renamed from: a */
    public final long f27367a;

    /* renamed from: b */
    public final C10835n f27368b;

    /* renamed from: c */
    public final int f27369c;

    /* renamed from: d */
    private final C10832l0 f27370d;

    /* renamed from: e */
    private final a<? extends T> f27371e;

    /* renamed from: f */
    private volatile T f27372f;

    /* renamed from: s8.g0$a */
    /* loaded from: classes.dex */
    public interface a<T> {
        /* renamed from: a */
        T mo9273a(Uri uri, InputStream inputStream);
    }

    public C10822g0(InterfaceC10827j interfaceC10827j, Uri uri, int i10, a<? extends T> aVar) {
        this(interfaceC10827j, new C10835n.b().m33038i(uri).m33031b(1).m33030a(), i10, aVar);
    }

    public C10822g0(InterfaceC10827j interfaceC10827j, C10835n c10835n, int i10, a<? extends T> aVar) {
        this.f27370d = new C10832l0(interfaceC10827j);
        this.f27368b = c10835n;
        this.f27369c = i10;
        this.f27371e = aVar;
        this.f27367a = C11731u.m37025a();
    }

    /* renamed from: a */
    public long m32998a() {
        return this.f27370d.m33015h();
    }

    @Override // p351s8.C10818e0.e
    /* renamed from: b */
    public final void mo223b() {
        this.f27370d.m33018t();
        C10831l c10831l = new C10831l(this.f27370d, this.f27368b);
        try {
            c10831l.m33014b();
            this.f27372f = this.f27371e.mo9273a((Uri) C11137a.m34603e(this.f27370d.getUri()), c10831l);
        } finally {
            C11172r0.m34936n(c10831l);
        }
    }

    @Override // p351s8.C10818e0.e
    /* renamed from: c */
    public final void mo224c() {
    }

    /* renamed from: d */
    public Map<String, List<String>> m32999d() {
        return this.f27370d.m33017s();
    }

    /* renamed from: e */
    public final T m33000e() {
        return this.f27372f;
    }

    /* renamed from: f */
    public Uri m33001f() {
        return this.f27370d.m33016r();
    }
}
