package p193k3;

import android.graphics.Bitmap;

/* renamed from: k3.e */
/* loaded from: classes.dex */
public class C9142e implements InterfaceC9141d {
    @Override // p193k3.InterfaceC9141d
    /* renamed from: a */
    public void mo26948a(int i10) {
    }

    @Override // p193k3.InterfaceC9141d
    /* renamed from: b */
    public void mo26949b() {
    }

    @Override // p193k3.InterfaceC9141d
    /* renamed from: c */
    public void mo26950c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p193k3.InterfaceC9141d
    /* renamed from: d */
    public Bitmap mo26951d(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // p193k3.InterfaceC9141d
    /* renamed from: e */
    public Bitmap mo26952e(int i10, int i11, Bitmap.Config config) {
        return mo26951d(i10, i11, config);
    }
}
