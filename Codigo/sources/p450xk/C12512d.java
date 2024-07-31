package p450xk;

import java.nio.charset.Charset;
import kotlin.jvm.internal.C9322n;

/* renamed from: xk.d */
/* loaded from: classes3.dex */
public final class C12512d {

    /* renamed from: a */
    public static final C12512d f33912a = new C12512d();

    /* renamed from: b */
    public static final Charset f33913b;

    /* renamed from: c */
    public static final Charset f33914c;

    /* renamed from: d */
    public static final Charset f33915d;

    /* renamed from: e */
    public static final Charset f33916e;

    /* renamed from: f */
    public static final Charset f33917f;

    /* renamed from: g */
    public static final Charset f33918g;

    /* renamed from: h */
    private static volatile Charset f33919h;

    /* renamed from: i */
    private static volatile Charset f33920i;

    static {
        Charset forName = Charset.forName("UTF-8");
        C9322n.m27780d(forName, "forName(\"UTF-8\")");
        f33913b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        C9322n.m27780d(forName2, "forName(\"UTF-16\")");
        f33914c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        C9322n.m27780d(forName3, "forName(\"UTF-16BE\")");
        f33915d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        C9322n.m27780d(forName4, "forName(\"UTF-16LE\")");
        f33916e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        C9322n.m27780d(forName5, "forName(\"US-ASCII\")");
        f33917f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        C9322n.m27780d(forName6, "forName(\"ISO-8859-1\")");
        f33918g = forName6;
    }

    private C12512d() {
    }

    /* renamed from: a */
    public final Charset m40961a() {
        Charset charset = f33920i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        C9322n.m27780d(forName, "forName(\"UTF-32BE\")");
        f33920i = forName;
        return forName;
    }

    /* renamed from: b */
    public final Charset m40962b() {
        Charset charset = f33919h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        C9322n.m27780d(forName, "forName(\"UTF-32LE\")");
        f33919h = forName;
        return forName;
    }
}
