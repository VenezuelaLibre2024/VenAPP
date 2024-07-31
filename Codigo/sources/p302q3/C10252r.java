package p302q3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import p171j3.InterfaceC8975v;
import p193k3.C9142e;
import p193k3.InterfaceC9141d;

/* renamed from: q3.r */
/* loaded from: classes.dex */
final class C10252r {

    /* renamed from: a */
    private static final InterfaceC9141d f25437a = new a();

    /* renamed from: q3.r$a */
    /* loaded from: classes.dex */
    class a extends C9142e {
        a() {
        }

        @Override // p193k3.C9142e, p193k3.InterfaceC9141d
        /* renamed from: c */
        public void mo26950c(Bitmap bitmap) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC8975v<Bitmap> m30690a(InterfaceC9141d interfaceC9141d, Drawable drawable, int i10, int i11) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            bitmap = m30691b(interfaceC9141d, current, i10, i11);
            z10 = true;
        }
        if (!z10) {
            interfaceC9141d = f25437a;
        }
        return C10238f.m30609b(bitmap, interfaceC9141d);
    }

    /* renamed from: b */
    private static Bitmap m30691b(InterfaceC9141d interfaceC9141d, Drawable drawable, int i10, int i11) {
        if (i10 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i11 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i10 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i11 = drawable.getIntrinsicHeight();
        }
        Lock m30596c = C10233c0.m30596c();
        m30596c.lock();
        Bitmap mo26951d = interfaceC9141d.mo26951d(i10, i11, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(mo26951d);
            drawable.setBounds(0, 0, i10, i11);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return mo26951d;
        } finally {
            m30596c.unlock();
        }
    }
}
