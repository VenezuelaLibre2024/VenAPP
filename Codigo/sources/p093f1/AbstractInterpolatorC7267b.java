package p093f1;

import android.view.animation.Interpolator;

/* renamed from: f1.b */
/* loaded from: classes.dex */
abstract class AbstractInterpolatorC7267b implements Interpolator {

    /* renamed from: a */
    private final float[] f16279a;

    /* renamed from: b */
    private final float f16280b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractInterpolatorC7267b(float[] fArr) {
        this.f16279a = fArr;
        this.f16280b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f16279a;
        int min = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f16280b;
        float f12 = (f10 - (min * f11)) / f11;
        float[] fArr2 = this.f16279a;
        float f13 = fArr2[min];
        return f13 + (f12 * (fArr2[min + 1] - f13));
    }
}
