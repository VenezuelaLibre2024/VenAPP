package p179jb;

import com.google.crypto.tink.shaded.protobuf.C5994p;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import p400vb.C11790c0;
import p400vb.C11816t;

/* renamed from: jb.b */
/* loaded from: classes2.dex */
public final class C9010b implements InterfaceC9024p {

    /* renamed from: a */
    private final InputStream f21609a;

    private C9010b(InputStream inputStream) {
        this.f21609a = inputStream;
    }

    /* renamed from: b */
    public static InterfaceC9024p m26426b(byte[] bArr) {
        return new C9010b(new ByteArrayInputStream(bArr));
    }

    @Override // p179jb.InterfaceC9024p
    /* renamed from: a */
    public C11816t mo26427a() {
        try {
            return C11816t.m37600a0(this.f21609a, C5994p.m15932b());
        } finally {
            this.f21609a.close();
        }
    }

    @Override // p179jb.InterfaceC9024p
    public C11790c0 read() {
        try {
            return C11790c0.m37328f0(this.f21609a, C5994p.m15932b());
        } finally {
            this.f21609a.close();
        }
    }
}
