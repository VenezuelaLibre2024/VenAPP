package s3;

import android.graphics.drawable.Drawable;
import j3.v;

/* loaded from: classes.dex */
final class i extends h<Drawable> {
    private i(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v<Drawable> b(Drawable drawable) {
        if (drawable != null) {
            return new i(drawable);
        }
        return null;
    }

    @Override // j3.v
    public int p() {
        return Math.max(1, this.f25125a.getIntrinsicWidth() * this.f25125a.getIntrinsicHeight() * 4);
    }

    @Override // j3.v
    public void q() {
    }

    @Override // j3.v
    public Class<Drawable> r() {
        return this.f25125a.getClass();
    }
}
