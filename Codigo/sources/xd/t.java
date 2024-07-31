package xd;

import android.view.LayoutInflater;

/* loaded from: classes.dex */
public final class t implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final q f31216a;

    public t(q qVar) {
        this.f31216a = qVar;
    }

    public static t a(q qVar) {
        return new t(qVar);
    }

    public static LayoutInflater c(q qVar) {
        return (LayoutInflater) td.d.d(qVar.c());
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LayoutInflater get() {
        return c(this.f31216a);
    }
}
