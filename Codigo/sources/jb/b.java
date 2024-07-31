package jb;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import vb.c0;

/* loaded from: classes2.dex */
public final class b implements p {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f19830a;

    private b(InputStream inputStream) {
        this.f19830a = inputStream;
    }

    public static p b(byte[] bArr) {
        return new b(new ByteArrayInputStream(bArr));
    }

    @Override // jb.p
    public vb.t a() {
        try {
            return vb.t.a0(this.f19830a, com.google.crypto.tink.shaded.protobuf.p.b());
        } finally {
            this.f19830a.close();
        }
    }

    @Override // jb.p
    public c0 read() {
        try {
            return c0.f0(this.f19830a, com.google.crypto.tink.shaded.protobuf.p.b());
        } finally {
            this.f19830a.close();
        }
    }
}
