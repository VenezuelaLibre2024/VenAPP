package u7;

import android.net.Uri;
import java.io.InputStream;
import java.util.List;
import s8.g0;
import u7.a;

/* loaded from: classes.dex */
public final class b<T extends a<T>> implements g0.a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final g0.a<? extends T> f27328a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f27329b;

    public b(g0.a<? extends T> aVar, List<c> list) {
        this.f27328a = aVar;
        this.f27329b = list;
    }

    @Override // s8.g0.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(Uri uri, InputStream inputStream) {
        T a10 = this.f27328a.a(uri, inputStream);
        List<c> list = this.f27329b;
        return (list == null || list.isEmpty()) ? a10 : (T) a10.a(this.f27329b);
    }
}
