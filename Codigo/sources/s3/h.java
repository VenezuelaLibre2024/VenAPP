package s3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import j3.r;
import j3.v;

/* loaded from: classes.dex */
public abstract class h<T extends Drawable> implements v<T>, r {

    /* renamed from: a, reason: collision with root package name */
    protected final T f25125a;

    public h(T t10) {
        this.f25125a = (T) c4.k.d(t10);
    }

    @Override // j3.v
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f25125a.getConstantState();
        return constantState == null ? this.f25125a : (T) constantState.newDrawable();
    }

    @Override // j3.r
    public void initialize() {
        Bitmap e10;
        T t10 = this.f25125a;
        if (t10 instanceof BitmapDrawable) {
            e10 = ((BitmapDrawable) t10).getBitmap();
        } else if (!(t10 instanceof u3.c)) {
            return;
        } else {
            e10 = ((u3.c) t10).e();
        }
        e10.prepareToDraw();
    }
}
