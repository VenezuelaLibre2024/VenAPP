package df;

import android.util.Base64;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f14085a = new v();

    /* renamed from: b, reason: collision with root package name */
    private static final String f14086b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f14087c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f14088d;

    static {
        byte[] o10;
        o10 = xk.p.o(u.f14084a.e());
        String encodeToString = Base64.encodeToString(o10, 10);
        f14086b = encodeToString;
        f14087c = "firebase_session_" + encodeToString + "_data";
        f14088d = "firebase_session_" + encodeToString + "_settings";
    }

    private v() {
    }

    public final String a() {
        return f14087c;
    }

    public final String b() {
        return f14088d;
    }
}
