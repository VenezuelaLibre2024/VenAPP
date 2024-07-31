package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.HashMap;
import p243n0.C9622e;
import p243n0.InterfaceC9625h;

/* renamed from: androidx.constraintlayout.widget.c */
/* loaded from: classes.dex */
public abstract class AbstractC0761c extends View {

    /* renamed from: a */
    protected int[] f3497a;

    /* renamed from: b */
    protected int f3498b;

    /* renamed from: c */
    protected Context f3499c;

    /* renamed from: d */
    protected InterfaceC9625h f3500d;

    /* renamed from: e */
    protected boolean f3501e;

    /* renamed from: f */
    protected String f3502f;

    /* renamed from: r */
    protected String f3503r;

    /* renamed from: s */
    private View[] f3504s;

    /* renamed from: t */
    protected HashMap<Integer, String> f3505t;

    public AbstractC0761c(Context context) {
        super(context);
        this.f3497a = new int[32];
        this.f3501e = false;
        this.f3504s = null;
        this.f3505t = new HashMap<>();
        this.f3499c = context;
        mo3773m(null);
    }

    /* renamed from: d */
    private void m3842d(String str) {
        if (str == null || str.length() == 0 || this.f3499c == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int m3846k = m3846k(trim);
        if (m3846k != 0) {
            this.f3505t.put(Integer.valueOf(m3846k), trim);
            m3843e(m3846k);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    /* renamed from: e */
    private void m3843e(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f3498b + 1;
        int[] iArr = this.f3497a;
        if (i11 > iArr.length) {
            this.f3497a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f3497a;
        int i12 = this.f3498b;
        iArr2[i12] = i10;
        this.f3498b = i12 + 1;
    }

    /* renamed from: f */
    private void m3844f(String str) {
        if (str == null || str.length() == 0 || this.f3499c == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.C0757b) && trim.equals(((ConstraintLayout.C0757b) layoutParams).f3432c0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m3843e(childAt.getId());
                }
            }
        }
    }

    /* renamed from: j */
    private int m3845j(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f3499c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: k */
    private int m3846k(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i10 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object m3820f = constraintLayout.m3820f(0, str);
            if (m3820f instanceof Integer) {
                i10 = ((Integer) m3820f).intValue();
            }
        }
        if (i10 == 0 && constraintLayout != null) {
            i10 = m3845j(constraintLayout, str);
        }
        if (i10 == 0) {
            try {
                i10 = C0768j.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i10 == 0 ? this.f3499c.getResources().getIdentifier(str, FacebookMediationAdapter.KEY_ID, this.f3499c.getPackageName()) : i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public void m3847g() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m3848h((ConstraintLayout) parent);
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f3497a, this.f3498b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void m3848h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f3498b; i10++) {
            View m3821h = constraintLayout.m3821h(this.f3497a[i10]);
            if (m3821h != null) {
                m3821h.setVisibility(visibility);
                if (elevation > 0.0f) {
                    m3821h.setTranslationZ(m3821h.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public void mo3849i(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public View[] m3850l(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f3504s;
        if (viewArr == null || viewArr.length != this.f3498b) {
            this.f3504s = new View[this.f3498b];
        }
        for (int i10 = 0; i10 < this.f3498b; i10++) {
            this.f3504s[i10] = constraintLayout.m3821h(this.f3497a[i10]);
        }
        return this.f3504s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public void mo3773m(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0769k.f4003n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == C0769k.f4111z1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f3502f = string;
                    setIds(string);
                } else if (index == C0769k.f3675A1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f3503r = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: n */
    public void mo3834n(C9622e c9622e, boolean z10) {
    }

    /* renamed from: o */
    public void m3851o(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f3502f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f3503r;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f3501e) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* renamed from: p */
    public void m3852p(ConstraintLayout constraintLayout) {
    }

    /* renamed from: q */
    public void m3853q(ConstraintLayout constraintLayout) {
    }

    /* renamed from: r */
    public void m3854r(ConstraintLayout constraintLayout) {
        String str;
        int m3845j;
        if (isInEditMode()) {
            setIds(this.f3502f);
        }
        InterfaceC9625h interfaceC9625h = this.f3500d;
        if (interfaceC9625h == null) {
            return;
        }
        interfaceC9625h.mo28817c();
        for (int i10 = 0; i10 < this.f3498b; i10++) {
            int i11 = this.f3497a[i10];
            View m3821h = constraintLayout.m3821h(i11);
            if (m3821h == null && (m3845j = m3845j(constraintLayout, (str = this.f3505t.get(Integer.valueOf(i11))))) != 0) {
                this.f3497a[i10] = m3845j;
                this.f3505t.put(Integer.valueOf(m3845j), str);
                m3821h = constraintLayout.m3821h(m3845j);
            }
            if (m3821h != null) {
                this.f3500d.mo28816b(constraintLayout.m3822i(m3821h));
            }
        }
        this.f3500d.mo28815a(constraintLayout.f3387c);
    }

    /* renamed from: s */
    public void m3855s() {
        if (this.f3500d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0757b) {
            ((ConstraintLayout.C0757b) layoutParams).f3470v0 = (C9622e) this.f3500d;
        }
    }

    protected void setIds(String str) {
        this.f3502f = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f3498b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                m3842d(str.substring(i10));
                return;
            } else {
                m3842d(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f3503r = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f3498b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                m3844f(str.substring(i10));
                return;
            } else {
                m3844f(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f3502f = null;
        this.f3498b = 0;
        for (int i10 : iArr) {
            m3843e(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f3502f == null) {
            m3843e(i10);
        }
    }
}
