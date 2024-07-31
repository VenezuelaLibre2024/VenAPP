package p373u3;

import android.graphics.Bitmap;
import p115g3.InterfaceC7442a;
import p193k3.InterfaceC9139b;
import p193k3.InterfaceC9141d;

/* renamed from: u3.b */
/* loaded from: classes.dex */
public final class C11307b implements InterfaceC7442a.a {

    /* renamed from: a */
    private final InterfaceC9141d f29331a;

    /* renamed from: b */
    private final InterfaceC9139b f29332b;

    public C11307b(InterfaceC9141d interfaceC9141d, InterfaceC9139b interfaceC9139b) {
        this.f29331a = interfaceC9141d;
        this.f29332b = interfaceC9139b;
    }

    @Override // p115g3.InterfaceC7442a.a
    /* renamed from: a */
    public void mo22454a(Bitmap bitmap) {
        this.f29331a.mo26950c(bitmap);
    }

    @Override // p115g3.InterfaceC7442a.a
    /* renamed from: b */
    public byte[] mo22455b(int i10) {
        InterfaceC9139b interfaceC9139b = this.f29332b;
        return interfaceC9139b == null ? new byte[i10] : (byte[]) interfaceC9139b.mo26943c(i10, byte[].class);
    }

    @Override // p115g3.InterfaceC7442a.a
    /* renamed from: c */
    public Bitmap mo22456c(int i10, int i11, Bitmap.Config config) {
        return this.f29331a.mo26952e(i10, i11, config);
    }

    @Override // p115g3.InterfaceC7442a.a
    /* renamed from: d */
    public int[] mo22457d(int i10) {
        InterfaceC9139b interfaceC9139b = this.f29332b;
        return interfaceC9139b == null ? new int[i10] : (int[]) interfaceC9139b.mo26943c(i10, int[].class);
    }

    @Override // p115g3.InterfaceC7442a.a
    /* renamed from: e */
    public void mo22458e(byte[] bArr) {
        InterfaceC9139b interfaceC9139b = this.f29332b;
        if (interfaceC9139b == null) {
            return;
        }
        interfaceC9139b.put(bArr);
    }

    @Override // p115g3.InterfaceC7442a.a
    /* renamed from: f */
    public void mo22459f(int[] iArr) {
        InterfaceC9139b interfaceC9139b = this.f29332b;
        if (interfaceC9139b == null) {
            return;
        }
        interfaceC9139b.put(iArr);
    }
}
