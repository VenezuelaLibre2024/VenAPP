package p173j5;

import androidx.exifinterface.media.C1239a;
import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.C9322n;

/* renamed from: j5.a */
/* loaded from: classes.dex */
public final class C8986a {

    /* renamed from: a */
    public static final C8986a f21535a = new C8986a();

    private C8986a() {
    }

    /* renamed from: a */
    private final int m26376a(byte[] bArr) {
        return new C1239a(new ByteArrayInputStream(bArr)).m6785r();
    }

    /* renamed from: b */
    public final int m26377b(byte[] _bytes) {
        C9322n.m27781e(_bytes, "_bytes");
        try {
            return m26376a(_bytes);
        } catch (Exception unused) {
            return 0;
        }
    }
}
