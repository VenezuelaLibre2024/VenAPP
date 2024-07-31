package p302q3;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import p129h3.C7624h;
import p129h3.InterfaceC7626j;
import p171j3.InterfaceC8975v;

/* renamed from: q3.y */
/* loaded from: classes.dex */
public final class C10259y implements InterfaceC7626j<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a */
    private final C10251q f25463a;

    public C10259y(C10251q c10251q) {
        this.f25463a = c10251q;
    }

    /* renamed from: e */
    private boolean m30712e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // p129h3.InterfaceC7626j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8975v<Bitmap> mo23152b(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, C7624h c7624h) {
        return this.f25463a.m30684d(parcelFileDescriptor, i10, i11, c7624h);
    }

    @Override // p129h3.InterfaceC7626j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo23151a(ParcelFileDescriptor parcelFileDescriptor, C7624h c7624h) {
        return m30712e(parcelFileDescriptor) && this.f25463a.m30687o(parcelFileDescriptor);
    }
}
