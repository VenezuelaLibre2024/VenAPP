package q3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes.dex */
public final class x implements j3.v<BitmapDrawable>, j3.r {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f23493a;

    /* renamed from: b, reason: collision with root package name */
    private final j3.v<Bitmap> f23494b;

    private x(Resources resources, j3.v<Bitmap> vVar) {
        this.f23493a = (Resources) c4.k.d(resources);
        this.f23494b = (j3.v) c4.k.d(vVar);
    }

    public static j3.v<BitmapDrawable> b(Resources resources, j3.v<Bitmap> vVar) {
        if (vVar == null) {
            return null;
        }
        return new x(resources, vVar);
    }

    @Override // j3.v
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f23493a, this.f23494b.get());
    }

    @Override // j3.r
    public void initialize() {
        j3.v<Bitmap> vVar = this.f23494b;
        if (vVar instanceof j3.r) {
            ((j3.r) vVar).initialize();
        }
    }

    @Override // j3.v
    public int p() {
        return this.f23494b.p();
    }

    @Override // j3.v
    public void q() {
        this.f23494b.q();
    }

    @Override // j3.v
    public Class<BitmapDrawable> r() {
        return BitmapDrawable.class;
    }
}
