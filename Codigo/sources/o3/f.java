package o3;

import java.io.InputStream;
import java.net.URL;
import n3.h;
import n3.o;
import n3.p;
import n3.s;

/* loaded from: classes.dex */
public class f implements o<URL, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final o<h, InputStream> f22178a;

    /* loaded from: classes.dex */
    public static class a implements p<URL, InputStream> {
        @Override // n3.p
        public o<URL, InputStream> d(s sVar) {
            return new f(sVar.d(h.class, InputStream.class));
        }
    }

    public f(o<h, InputStream> oVar) {
        this.f22178a = oVar;
    }

    @Override // n3.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(URL url, int i10, int i11, h3.h hVar) {
        return this.f22178a.b(new h(url), i10, i11, hVar);
    }

    @Override // n3.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(URL url) {
        return true;
    }
}
