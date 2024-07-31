package p346s3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p036c4.C1870k;
import p171j3.InterfaceC8971r;
import p171j3.InterfaceC8975v;
import p373u3.C11308c;

/* renamed from: s3.h */
/* loaded from: classes.dex */
public abstract class AbstractC10790h<T extends Drawable> implements InterfaceC8975v<T>, InterfaceC8971r {

    /* renamed from: a */
    protected final T f27244a;

    public AbstractC10790h(T t10) {
        this.f27244a = (T) C1870k.m9950d(t10);
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f27244a.getConstantState();
        return constantState == null ? this.f27244a : (T) constantState.newDrawable();
    }

    @Override // p171j3.InterfaceC8971r
    public void initialize() {
        Bitmap m35324e;
        T t10 = this.f27244a;
        if (t10 instanceof BitmapDrawable) {
            m35324e = ((BitmapDrawable) t10).getBitmap();
        } else if (!(t10 instanceof C11308c)) {
            return;
        } else {
            m35324e = ((C11308c) t10).m35324e();
        }
        m35324e.prepareToDraw();
    }
}
