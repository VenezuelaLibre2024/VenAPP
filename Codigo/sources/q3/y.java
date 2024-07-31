package q3;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class y implements h3.j<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final q f23495a;

    public y(q qVar) {
        this.f23495a = qVar;
    }

    private boolean e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // h3.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public j3.v<Bitmap> b(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, h3.h hVar) {
        return this.f23495a.d(parcelFileDescriptor, i10, i11, hVar);
    }

    @Override // h3.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ParcelFileDescriptor parcelFileDescriptor, h3.h hVar) {
        return e(parcelFileDescriptor) && this.f23495a.o(parcelFileDescriptor);
    }
}
