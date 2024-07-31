package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.widget.h */
/* loaded from: classes.dex */
public class C0766h extends View {

    /* renamed from: a */
    private boolean f3669a;

    public C0766h(Context context) {
        super(context);
        this.f3669a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z10) {
        this.f3669a = z10;
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.C0757b c0757b = (ConstraintLayout.C0757b) getLayoutParams();
        if (this.f3669a && c0757b.f3427a == i10) {
            return;
        }
        c0757b.f3427a = i10;
        setLayoutParams(c0757b);
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.C0757b c0757b = (ConstraintLayout.C0757b) getLayoutParams();
        if (this.f3669a && c0757b.f3429b == i10) {
            return;
        }
        c0757b.f3429b = i10;
        setLayoutParams(c0757b);
    }

    public void setGuidelinePercent(float f10) {
        ConstraintLayout.C0757b c0757b = (ConstraintLayout.C0757b) getLayoutParams();
        if (this.f3669a && c0757b.f3431c == f10) {
            return;
        }
        c0757b.f3431c = f10;
        setLayoutParams(c0757b);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }
}
