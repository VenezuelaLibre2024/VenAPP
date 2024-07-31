package p399v9;

import com.google.android.gms.common.internal.C5276s;

/* renamed from: v9.k */
/* loaded from: classes.dex */
public final class C11768k {

    /* renamed from: a */
    private String f31168a;

    private C11768k() {
    }

    /* renamed from: c */
    public static final C11768k m37246c(C11769l c11769l) {
        String m37250b = c11769l.m37250b();
        C11768k c11768k = new C11768k();
        if (m37250b != null) {
            c11768k.f31168a = C5276s.m13320f(m37250b);
        }
        return c11768k;
    }

    /* renamed from: a */
    public final C11768k m37247a(String str) {
        this.f31168a = C5276s.m13320f(str);
        return this;
    }

    /* renamed from: b */
    public final C11769l m37248b() {
        return new C11769l(this.f31168a);
    }
}
