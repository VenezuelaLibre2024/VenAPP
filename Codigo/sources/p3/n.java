package p3;

import android.content.Context;
import j3.v;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class n<T> implements h3.l<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final h3.l<?> f22756b = new n();

    private n() {
    }

    public static <T> n<T> c() {
        return (n) f22756b;
    }

    @Override // h3.l
    public v<T> a(Context context, v<T> vVar, int i10, int i11) {
        return vVar;
    }

    @Override // h3.f
    public void b(MessageDigest messageDigest) {
    }
}
