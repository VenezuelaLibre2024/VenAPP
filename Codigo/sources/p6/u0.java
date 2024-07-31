package p6;

import android.content.Context;

/* loaded from: classes.dex */
public final class u0 implements j6.b<t0> {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<Context> f22850a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<String> f22851b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<Integer> f22852c;

    public u0(bk.a<Context> aVar, bk.a<String> aVar2, bk.a<Integer> aVar3) {
        this.f22850a = aVar;
        this.f22851b = aVar2;
        this.f22852c = aVar3;
    }

    public static u0 a(bk.a<Context> aVar, bk.a<String> aVar2, bk.a<Integer> aVar3) {
        return new u0(aVar, aVar2, aVar3);
    }

    public static t0 c(Context context, String str, int i10) {
        return new t0(context, str, i10);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 get() {
        return c(this.f22850a.get(), this.f22851b.get(), this.f22852c.get().intValue());
    }
}
