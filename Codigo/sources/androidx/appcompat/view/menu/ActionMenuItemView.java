package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.r1;
import androidx.appcompat.widget.s0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends i0 implements n.a, View.OnClickListener, ActionMenuView.a {
    private int A;
    private int B;
    private int C;

    /* renamed from: s, reason: collision with root package name */
    i f1006s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f1007t;

    /* renamed from: u, reason: collision with root package name */
    private Drawable f1008u;

    /* renamed from: v, reason: collision with root package name */
    g.b f1009v;

    /* renamed from: w, reason: collision with root package name */
    private s0 f1010w;

    /* renamed from: x, reason: collision with root package name */
    b f1011x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f1012y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f1013z;

    /* loaded from: classes.dex */
    private class a extends s0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.s0
        public p b() {
            b bVar = ActionMenuItemView.this.f1011x;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.s0
        protected boolean c() {
            p b10;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f1009v;
            return bVar != null && bVar.b(actionMenuItemView.f1006s) && (b10 = b()) != null && b10.a();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract p a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f1012y = s();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.f15506v, i10, 0);
        this.A = obtainStyledAttributes.getDimensionPixelSize(g.j.f15511w, 0);
        obtainStyledAttributes.recycle();
        this.C = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.B = -1;
        setSaveEnabled(false);
    }

    private boolean s() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void t() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1007t);
        if (this.f1008u != null && (!this.f1006s.B() || (!this.f1012y && !this.f1013z))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f1007t : null);
        CharSequence contentDescription = this.f1006s.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z12 ? null : this.f1006s.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f1006s.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            r1.a(this, z12 ? null : this.f1006s.getTitle());
        } else {
            r1.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return r();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return r() && this.f1006s.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void c(i iVar, int i10) {
        this.f1006s = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.i(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f1010w == null) {
            this.f1010w = new a();
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.f1006s;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g.b bVar = this.f1009v;
        if (bVar != null) {
            bVar.b(this.f1006s);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1012y = s();
        t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.i0, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean r10 = r();
        if (r10 && (i12 = this.B) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.A) : this.A;
        if (mode != 1073741824 && this.A > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i11);
        }
        if (r10 || this.f1008u == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1008u.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        s0 s0Var;
        if (this.f1006s.hasSubMenu() && (s0Var = this.f1010w) != null && s0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean r() {
        return !TextUtils.isEmpty(getText());
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f1013z != z10) {
            this.f1013z = z10;
            i iVar = this.f1006s;
            if (iVar != null) {
                iVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1008u = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.C;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        t();
    }

    public void setItemInvoker(g.b bVar) {
        this.f1009v = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.B = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f1011x = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1007t = charSequence;
        t();
    }
}
