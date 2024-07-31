package p302q3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p036c4.C1870k;
import p129h3.C7624h;
import p129h3.InterfaceC7626j;
import p171j3.InterfaceC8975v;

/* renamed from: q3.a */
/* loaded from: classes.dex */
public class C10228a<DataType> implements InterfaceC7626j<DataType, BitmapDrawable> {

    /* renamed from: a */
    private final InterfaceC7626j<DataType, Bitmap> f25374a;

    /* renamed from: b */
    private final Resources f25375b;

    public C10228a(Resources resources, InterfaceC7626j<DataType, Bitmap> interfaceC7626j) {
        this.f25375b = (Resources) C1870k.m9950d(resources);
        this.f25374a = (InterfaceC7626j) C1870k.m9950d(interfaceC7626j);
    }

    @Override // p129h3.InterfaceC7626j
    /* renamed from: a */
    public boolean mo23151a(DataType datatype, C7624h c7624h) {
        return this.f25374a.mo23151a(datatype, c7624h);
    }

    @Override // p129h3.InterfaceC7626j
    /* renamed from: b */
    public InterfaceC8975v<BitmapDrawable> mo23152b(DataType datatype, int i10, int i11, C7624h c7624h) {
        return C10258x.m30710b(this.f25375b, this.f25374a.mo23152b(datatype, i10, i11, c7624h));
    }
}
