package p393v3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p036c4.C1870k;
import p129h3.C7624h;
import p171j3.InterfaceC8975v;
import p302q3.C10258x;

/* renamed from: v3.b */
/* loaded from: classes.dex */
public class C11620b implements InterfaceC11623e<Bitmap, BitmapDrawable> {

    /* renamed from: a */
    private final Resources f30222a;

    public C11620b(Resources resources) {
        this.f30222a = (Resources) C1870k.m9950d(resources);
    }

    @Override // p393v3.InterfaceC11623e
    /* renamed from: a */
    public InterfaceC8975v<BitmapDrawable> mo36414a(InterfaceC8975v<Bitmap> interfaceC8975v, C7624h c7624h) {
        return C10258x.m30710b(this.f30222a, interfaceC8975v);
    }
}
