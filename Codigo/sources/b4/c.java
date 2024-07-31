package b4;

import h3.f;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: b, reason: collision with root package name */
    private static final c f6144b = new c();

    private c() {
    }

    public static c c() {
        return f6144b;
    }

    @Override // h3.f
    public void b(MessageDigest messageDigest) {
    }

    public String toString() {
        return "EmptySignature";
    }
}
