package n3;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import n3.o;

/* loaded from: classes.dex */
public class z<Data> implements o<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f21792b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    private final o<h, Data> f21793a;

    /* loaded from: classes.dex */
    public static class a implements p<Uri, InputStream> {
        @Override // n3.p
        public o<Uri, InputStream> d(s sVar) {
            return new z(sVar.d(h.class, InputStream.class));
        }
    }

    public z(o<h, Data> oVar) {
        this.f21793a = oVar;
    }

    @Override // n3.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(Uri uri, int i10, int i11, h3.h hVar) {
        return this.f21793a.b(new h(uri.toString()), i10, i11, hVar);
    }

    @Override // n3.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return f21792b.contains(uri.getScheme());
    }
}
