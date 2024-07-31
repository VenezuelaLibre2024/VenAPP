package j5;

import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f19756a = new a();

    private a() {
    }

    private final int a(byte[] bArr) {
        return new androidx.exifinterface.media.a(new ByteArrayInputStream(bArr)).r();
    }

    public final int b(byte[] _bytes) {
        n.e(_bytes, "_bytes");
        try {
            return a(_bytes);
        } catch (Exception unused) {
            return 0;
        }
    }
}
