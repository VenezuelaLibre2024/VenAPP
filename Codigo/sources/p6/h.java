package p6;

import android.content.Context;

/* loaded from: classes.dex */
public final class h implements j6.b<String> {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<Context> f22800a;

    public h(bk.a<Context> aVar) {
        this.f22800a = aVar;
    }

    public static h a(bk.a<Context> aVar) {
        return new h(aVar);
    }

    public static String c(Context context) {
        return (String) j6.d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f22800a.get());
    }
}
