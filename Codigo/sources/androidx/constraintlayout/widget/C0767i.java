package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p243n0.C9622e;

/* renamed from: androidx.constraintlayout.widget.i */
/* loaded from: classes.dex */
public class C0767i extends View {

    /* renamed from: a */
    private int f3670a;

    /* renamed from: b */
    private View f3671b;

    /* renamed from: c */
    private int f3672c;

    /* renamed from: a */
    public void m3902a(ConstraintLayout constraintLayout) {
        if (this.f3671b == null) {
            return;
        }
        ConstraintLayout.C0757b c0757b = (ConstraintLayout.C0757b) getLayoutParams();
        ConstraintLayout.C0757b c0757b2 = (ConstraintLayout.C0757b) this.f3671b.getLayoutParams();
        c0757b2.f3470v0.m28734g1(0);
        C9622e.b m28769y = c0757b.f3470v0.m28769y();
        C9622e.b bVar = C9622e.b.FIXED;
        if (m28769y != bVar) {
            c0757b.f3470v0.m28736h1(c0757b2.f3470v0.m28708U());
        }
        if (c0757b.f3470v0.m28702R() != bVar) {
            c0757b.f3470v0.m28687I0(c0757b2.f3470v0.m28765v());
        }
        c0757b2.f3470v0.m28734g1(8);
    }

    /* renamed from: b */
    public void m3903b(ConstraintLayout constraintLayout) {
        if (this.f3670a == -1 && !isInEditMode()) {
            setVisibility(this.f3672c);
        }
        View findViewById = constraintLayout.findViewById(this.f3670a);
        this.f3671b = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.C0757b) findViewById.getLayoutParams()).f3446j0 = true;
            this.f3671b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f3671b;
    }

    public int getEmptyVisibility() {
        return this.f3672c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View findViewById;
        if (this.f3670a == i10) {
            return;
        }
        View view = this.f3671b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.C0757b) this.f3671b.getLayoutParams()).f3446j0 = false;
            this.f3671b = null;
        }
        this.f3670a = i10;
        if (i10 == -1 || (findViewById = ((View) getParent()).findViewById(i10)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i10) {
        this.f3672c = i10;
    }
}
