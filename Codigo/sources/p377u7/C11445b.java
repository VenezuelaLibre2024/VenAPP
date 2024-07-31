package p377u7;

import android.net.Uri;
import java.io.InputStream;
import java.util.List;
import p351s8.C10822g0;
import p377u7.InterfaceC11444a;

/* renamed from: u7.b */
/* loaded from: classes.dex */
public final class C11445b<T extends InterfaceC11444a<T>> implements C10822g0.a<T> {

    /* renamed from: a */
    private final C10822g0.a<? extends T> f29631a;

    /* renamed from: b */
    private final List<C11446c> f29632b;

    public C11445b(C10822g0.a<? extends T> aVar, List<C11446c> list) {
        this.f29631a = aVar;
        this.f29632b = list;
    }

    @Override // p351s8.C10822g0.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T mo9273a(Uri uri, InputStream inputStream) {
        T mo9273a = this.f29631a.mo9273a(uri, inputStream);
        List<C11446c> list = this.f29632b;
        return (list == null || list.isEmpty()) ? mo9273a : (T) mo9273a.mo9230a(this.f29632b);
    }
}
