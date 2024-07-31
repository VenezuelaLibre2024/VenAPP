package xk;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f31392a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f31393b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f31394c;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f31395d;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f31396e;

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f31397f;

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f31398g;

    /* renamed from: h, reason: collision with root package name */
    private static volatile Charset f31399h;

    /* renamed from: i, reason: collision with root package name */
    private static volatile Charset f31400i;

    static {
        Charset forName = Charset.forName("UTF-8");
        kotlin.jvm.internal.n.d(forName, "forName(\"UTF-8\")");
        f31393b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        kotlin.jvm.internal.n.d(forName2, "forName(\"UTF-16\")");
        f31394c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        kotlin.jvm.internal.n.d(forName3, "forName(\"UTF-16BE\")");
        f31395d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        kotlin.jvm.internal.n.d(forName4, "forName(\"UTF-16LE\")");
        f31396e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        kotlin.jvm.internal.n.d(forName5, "forName(\"US-ASCII\")");
        f31397f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.n.d(forName6, "forName(\"ISO-8859-1\")");
        f31398g = forName6;
    }

    private d() {
    }

    public final Charset a() {
        Charset charset = f31400i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        kotlin.jvm.internal.n.d(forName, "forName(\"UTF-32BE\")");
        f31400i = forName;
        return forName;
    }

    public final Charset b() {
        Charset charset = f31399h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        kotlin.jvm.internal.n.d(forName, "forName(\"UTF-32LE\")");
        f31399h = forName;
        return forName;
    }
}
