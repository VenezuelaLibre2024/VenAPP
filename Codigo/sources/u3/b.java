package u3;

import android.graphics.Bitmap;
import g3.a;

/* loaded from: classes.dex */
public final class b implements a.InterfaceC0256a {

    /* renamed from: a, reason: collision with root package name */
    private final k3.d f27029a;

    /* renamed from: b, reason: collision with root package name */
    private final k3.b f27030b;

    public b(k3.d dVar, k3.b bVar) {
        this.f27029a = dVar;
        this.f27030b = bVar;
    }

    @Override // g3.a.InterfaceC0256a
    public void a(Bitmap bitmap) {
        this.f27029a.c(bitmap);
    }

    @Override // g3.a.InterfaceC0256a
    public byte[] b(int i10) {
        k3.b bVar = this.f27030b;
        return bVar == null ? new byte[i10] : (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // g3.a.InterfaceC0256a
    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        return this.f27029a.e(i10, i11, config);
    }

    @Override // g3.a.InterfaceC0256a
    public int[] d(int i10) {
        k3.b bVar = this.f27030b;
        return bVar == null ? new int[i10] : (int[]) bVar.c(i10, int[].class);
    }

    @Override // g3.a.InterfaceC0256a
    public void e(byte[] bArr) {
        k3.b bVar = this.f27030b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // g3.a.InterfaceC0256a
    public void f(int[] iArr) {
        k3.b bVar = this.f27030b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }
}
