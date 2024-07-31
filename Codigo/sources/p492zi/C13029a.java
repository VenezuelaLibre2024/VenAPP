package p492zi;

import com.google.protobuf.AbstractC6589j;
import com.google.protobuf.InterfaceC6614r0;
import com.google.protobuf.InterfaceC6634z0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import vi.InterfaceC11937o0;
import vi.InterfaceC11952w;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zi.a */
/* loaded from: classes3.dex */
public final class C13029a extends InputStream implements InterfaceC11952w, InterfaceC11937o0 {

    /* renamed from: a */
    private InterfaceC6614r0 f35370a;

    /* renamed from: b */
    private final InterfaceC6634z0<?> f35371b;

    /* renamed from: c */
    private ByteArrayInputStream f35372c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13029a(InterfaceC6614r0 interfaceC6614r0, InterfaceC6634z0<?> interfaceC6634z0) {
        this.f35370a = interfaceC6614r0;
        this.f35371b = interfaceC6634z0;
    }

    @Override // vi.InterfaceC11952w
    /* renamed from: a */
    public int mo38292a(OutputStream outputStream) {
        InterfaceC6614r0 interfaceC6614r0 = this.f35370a;
        if (interfaceC6614r0 != null) {
            int mo19033c = interfaceC6614r0.mo19033c();
            this.f35370a.writeTo(outputStream);
            this.f35370a = null;
            return mo19033c;
        }
        ByteArrayInputStream byteArrayInputStream = this.f35372c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int m43018a = (int) C13030b.m43018a(byteArrayInputStream, outputStream);
        this.f35372c = null;
        return m43018a;
    }

    @Override // java.io.InputStream
    public int available() {
        InterfaceC6614r0 interfaceC6614r0 = this.f35370a;
        if (interfaceC6614r0 != null) {
            return interfaceC6614r0.mo19033c();
        }
        ByteArrayInputStream byteArrayInputStream = this.f35372c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public InterfaceC6614r0 m43016b() {
        InterfaceC6614r0 interfaceC6614r0 = this.f35370a;
        if (interfaceC6614r0 != null) {
            return interfaceC6614r0;
        }
        throw new IllegalStateException("message not available");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public InterfaceC6634z0<?> m43017e() {
        return this.f35371b;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f35370a != null) {
            this.f35372c = new ByteArrayInputStream(this.f35370a.mo18375h());
            this.f35370a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f35372c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        InterfaceC6614r0 interfaceC6614r0 = this.f35370a;
        if (interfaceC6614r0 != null) {
            int mo19033c = interfaceC6614r0.mo19033c();
            if (mo19033c == 0) {
                this.f35370a = null;
                this.f35372c = null;
                return -1;
            }
            if (i11 >= mo19033c) {
                AbstractC6589j m18739g0 = AbstractC6589j.m18739g0(bArr, i10, mo19033c);
                this.f35370a.mo19036l(m18739g0);
                m18739g0.mo18785b0();
                m18739g0.m18786c();
                this.f35370a = null;
                this.f35372c = null;
                return mo19033c;
            }
            this.f35372c = new ByteArrayInputStream(this.f35370a.mo18375h());
            this.f35370a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f35372c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i10, i11);
        }
        return -1;
    }
}
