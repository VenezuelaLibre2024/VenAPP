package zi;

import com.google.protobuf.j;
import com.google.protobuf.r0;
import com.google.protobuf.z0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import vi.o0;
import vi.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class a extends InputStream implements w, o0 {

    /* renamed from: a */
    private r0 f32819a;

    /* renamed from: b */
    private final z0<?> f32820b;

    /* renamed from: c */
    private ByteArrayInputStream f32821c;

    public a(r0 r0Var, z0<?> z0Var) {
        this.f32819a = r0Var;
        this.f32820b = z0Var;
    }

    @Override // vi.w
    public int a(OutputStream outputStream) {
        r0 r0Var = this.f32819a;
        if (r0Var != null) {
            int c10 = r0Var.c();
            this.f32819a.writeTo(outputStream);
            this.f32819a = null;
            return c10;
        }
        ByteArrayInputStream byteArrayInputStream = this.f32821c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int a10 = (int) b.a(byteArrayInputStream, outputStream);
        this.f32821c = null;
        return a10;
    }

    @Override // java.io.InputStream
    public int available() {
        r0 r0Var = this.f32819a;
        if (r0Var != null) {
            return r0Var.c();
        }
        ByteArrayInputStream byteArrayInputStream = this.f32821c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    public r0 b() {
        r0 r0Var = this.f32819a;
        if (r0Var != null) {
            return r0Var;
        }
        throw new IllegalStateException("message not available");
    }

    public z0<?> e() {
        return this.f32820b;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f32819a != null) {
            this.f32821c = new ByteArrayInputStream(this.f32819a.h());
            this.f32819a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f32821c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        r0 r0Var = this.f32819a;
        if (r0Var != null) {
            int c10 = r0Var.c();
            if (c10 == 0) {
                this.f32819a = null;
                this.f32821c = null;
                return -1;
            }
            if (i11 >= c10) {
                j g02 = j.g0(bArr, i10, c10);
                this.f32819a.l(g02);
                g02.b0();
                g02.c();
                this.f32819a = null;
                this.f32821c = null;
                return c10;
            }
            this.f32821c = new ByteArrayInputStream(this.f32819a.h());
            this.f32819a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f32821c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i10, i11);
        }
        return -1;
    }
}
