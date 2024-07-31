package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b */
/* loaded from: classes.dex */
class C0317b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f1629a;

    /* renamed from: androidx.appcompat.widget.b$a */
    /* loaded from: classes.dex */
    private static class a {
        /* renamed from: a */
        public static void m1609a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C0317b(ActionBarContainer actionBarContainer) {
        this.f1629a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1629a;
        if (actionBarContainer.f1384s) {
            Drawable drawable = actionBarContainer.f1383r;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1381e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1629a;
        Drawable drawable3 = actionBarContainer2.f1382f;
        if (drawable3 == null || !actionBarContainer2.f1385t) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f1629a;
        if (!actionBarContainer.f1384s) {
            drawable = actionBarContainer.f1381e;
            if (drawable == null) {
                return;
            }
        } else if (actionBarContainer.f1383r == null) {
            return;
        } else {
            drawable = actionBarContainer.f1381e;
        }
        a.m1609a(drawable, outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
