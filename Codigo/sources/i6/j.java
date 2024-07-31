package i6;

import android.content.Context;

/* loaded from: classes.dex */
public final class j implements j6.b<i> {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<Context> f17172a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<r6.a> f17173b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<r6.a> f17174c;

    public j(bk.a<Context> aVar, bk.a<r6.a> aVar2, bk.a<r6.a> aVar3) {
        this.f17172a = aVar;
        this.f17173b = aVar2;
        this.f17174c = aVar3;
    }

    public static j a(bk.a<Context> aVar, bk.a<r6.a> aVar2, bk.a<r6.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, r6.a aVar, r6.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f17172a.get(), this.f17173b.get(), this.f17174c.get());
    }
}
