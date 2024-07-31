package p065df;

import android.util.Base64;
import p450xk.C12524p;

/* renamed from: df.v */
/* loaded from: classes2.dex */
public final class C6935v {

    /* renamed from: a */
    public static final C6935v f15439a = new C6935v();

    /* renamed from: b */
    private static final String f15440b;

    /* renamed from: c */
    private static final String f15441c;

    /* renamed from: d */
    private static final String f15442d;

    static {
        byte[] m41034o;
        m41034o = C12524p.m41034o(C6934u.f15438a.m20052e());
        String encodeToString = Base64.encodeToString(m41034o, 10);
        f15440b = encodeToString;
        f15441c = "firebase_session_" + encodeToString + "_data";
        f15442d = "firebase_session_" + encodeToString + "_settings";
    }

    private C6935v() {
    }

    /* renamed from: a */
    public final String m20053a() {
        return f15441c;
    }

    /* renamed from: b */
    public final String m20054b() {
        return f15442d;
    }
}
