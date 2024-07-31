package q3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes.dex */
public class a<DataType> implements h3.j<DataType, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    private final h3.j<DataType, Bitmap> f23406a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f23407b;

    public a(Resources resources, h3.j<DataType, Bitmap> jVar) {
        this.f23407b = (Resources) c4.k.d(resources);
        this.f23406a = (h3.j) c4.k.d(jVar);
    }

    @Override // h3.j
    public boolean a(DataType datatype, h3.h hVar) {
        return this.f23406a.a(datatype, hVar);
    }

    @Override // h3.j
    public j3.v<BitmapDrawable> b(DataType datatype, int i10, int i11, h3.h hVar) {
        return x.b(this.f23407b, this.f23406a.b(datatype, i10, i11, hVar));
    }
}
