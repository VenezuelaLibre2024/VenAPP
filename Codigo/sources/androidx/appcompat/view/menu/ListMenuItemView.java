package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.l1;
import androidx.core.view.x0;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {
    private LayoutInflater A;
    private boolean B;

    /* renamed from: a */
    private i f1018a;

    /* renamed from: b */
    private ImageView f1019b;

    /* renamed from: c */
    private RadioButton f1020c;

    /* renamed from: d */
    private TextView f1021d;

    /* renamed from: e */
    private CheckBox f1022e;

    /* renamed from: f */
    private TextView f1023f;

    /* renamed from: r */
    private ImageView f1024r;

    /* renamed from: s */
    private ImageView f1025s;

    /* renamed from: t */
    private LinearLayout f1026t;

    /* renamed from: u */
    private Drawable f1027u;

    /* renamed from: v */
    private int f1028v;

    /* renamed from: w */
    private Context f1029w;

    /* renamed from: x */
    private boolean f1030x;

    /* renamed from: y */
    private Drawable f1031y;

    /* renamed from: z */
    private boolean f1032z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.D);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        l1 u10 = l1.u(getContext(), attributeSet, g.j.T1, i10, 0);
        this.f1027u = u10.f(g.j.V1);
        this.f1028v = u10.m(g.j.U1, -1);
        this.f1030x = u10.a(g.j.W1, false);
        this.f1029w = context;
        this.f1031y = u10.f(g.j.X1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, g.a.A, 0);
        this.f1032z = obtainStyledAttributes.hasValue(0);
        u10.v();
        obtainStyledAttributes.recycle();
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f1026t;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(g.g.f15371h, (ViewGroup) this, false);
        this.f1022e = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(g.g.f15372i, (ViewGroup) this, false);
        this.f1019b = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(g.g.f15374k, (ViewGroup) this, false);
        this.f1020c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.A == null) {
            this.A = LayoutInflater.from(getContext());
        }
        return this.A;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f1024r;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1025s;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1025s.getLayoutParams();
        rect.top += this.f1025s.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void c(i iVar, int i10) {
        this.f1018a = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.i(this));
        setCheckable(iVar.isCheckable());
        h(iVar.A(), iVar.g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.f1018a;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f1018a.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f1023f.setText(this.f1018a.h());
        }
        if (this.f1023f.getVisibility() != i10) {
            this.f1023f.setVisibility(i10);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        x0.Z(this, this.f1027u);
        TextView textView = (TextView) findViewById(g.f.M);
        this.f1021d = textView;
        int i10 = this.f1028v;
        if (i10 != -1) {
            textView.setTextAppearance(this.f1029w, i10);
        }
        this.f1023f = (TextView) findViewById(g.f.F);
        ImageView imageView = (ImageView) findViewById(g.f.I);
        this.f1024r = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1031y);
        }
        this.f1025s = (ImageView) findViewById(g.f.f15355r);
        this.f1026t = (LinearLayout) findViewById(g.f.f15349l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f1019b != null && this.f1030x) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1019b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f1020c == null && this.f1022e == null) {
            return;
        }
        if (this.f1018a.m()) {
            if (this.f1020c == null) {
                g();
            }
            compoundButton = this.f1020c;
            view = this.f1022e;
        } else {
            if (this.f1022e == null) {
                e();
            }
            compoundButton = this.f1022e;
            view = this.f1020c;
        }
        if (z10) {
            compoundButton.setChecked(this.f1018a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f1022e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f1020c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f1018a.m()) {
            if (this.f1020c == null) {
                g();
            }
            compoundButton = this.f1020c;
        } else {
            if (this.f1022e == null) {
                e();
            }
            compoundButton = this.f1022e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.B = z10;
        this.f1030x = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f1025s;
        if (imageView != null) {
            imageView.setVisibility((this.f1032z || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f1018a.z() || this.B;
        if (z10 || this.f1030x) {
            ImageView imageView = this.f1019b;
            if (imageView == null && drawable == null && !this.f1030x) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f1030x) {
                this.f1019b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f1019b;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f1019b.getVisibility() != 0) {
                this.f1019b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i10;
        TextView textView;
        if (charSequence != null) {
            this.f1021d.setText(charSequence);
            if (this.f1021d.getVisibility() == 0) {
                return;
            }
            textView = this.f1021d;
            i10 = 0;
        } else {
            i10 = 8;
            if (this.f1021d.getVisibility() == 8) {
                return;
            } else {
                textView = this.f1021d;
            }
        }
        textView.setVisibility(i10);
    }
}
