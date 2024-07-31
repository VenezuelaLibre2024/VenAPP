package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3707a = aVar.p(iconCompat.f3707a, 1);
        iconCompat.f3709c = aVar.j(iconCompat.f3709c, 2);
        iconCompat.f3710d = aVar.r(iconCompat.f3710d, 3);
        iconCompat.f3711e = aVar.p(iconCompat.f3711e, 4);
        iconCompat.f3712f = aVar.p(iconCompat.f3712f, 5);
        iconCompat.f3713g = (ColorStateList) aVar.r(iconCompat.f3713g, 6);
        iconCompat.f3715i = aVar.t(iconCompat.f3715i, 7);
        iconCompat.f3716j = aVar.t(iconCompat.f3716j, 8);
        iconCompat.r();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(true, true);
        iconCompat.s(aVar.f());
        int i10 = iconCompat.f3707a;
        if (-1 != i10) {
            aVar.F(i10, 1);
        }
        byte[] bArr = iconCompat.f3709c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f3710d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i11 = iconCompat.f3711e;
        if (i11 != 0) {
            aVar.F(i11, 4);
        }
        int i12 = iconCompat.f3712f;
        if (i12 != 0) {
            aVar.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f3713g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f3715i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f3716j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
