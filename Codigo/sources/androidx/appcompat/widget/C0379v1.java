package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.ads.AdError;
import p111g.C7380d;
import p111g.C7382f;
import p111g.C7383g;
import p111g.C7385i;

/* renamed from: androidx.appcompat.widget.v1 */
/* loaded from: classes.dex */
class C0379v1 {

    /* renamed from: a */
    private final Context f1979a;

    /* renamed from: b */
    private final View f1980b;

    /* renamed from: c */
    private final TextView f1981c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1982d;

    /* renamed from: e */
    private final Rect f1983e;

    /* renamed from: f */
    private final int[] f1984f;

    /* renamed from: g */
    private final int[] f1985g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0379v1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1982d = layoutParams;
        this.f1983e = new Rect();
        this.f1984f = new int[2];
        this.f1985g = new int[2];
        this.f1979a = context;
        View inflate = LayoutInflater.from(context).inflate(C7383g.f16853s, (ViewGroup) null);
        this.f1980b = inflate;
        this.f1981c = (TextView) inflate.findViewById(C7382f.f16827s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C7385i.f16867a;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private void m2032a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int height;
        int i12;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1979a.getResources().getDimensionPixelOffset(C7380d.f16745m);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1979a.getResources().getDimensionPixelOffset(C7380d.f16744l);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1979a.getResources().getDimensionPixelOffset(z10 ? C7380d.f16747o : C7380d.f16746n);
        View m2033b = m2033b(view);
        if (m2033b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        m2033b.getWindowVisibleDisplayFrame(this.f1983e);
        Rect rect = this.f1983e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1979a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1983e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        m2033b.getLocationOnScreen(this.f1985g);
        view.getLocationOnScreen(this.f1984f);
        int[] iArr = this.f1984f;
        int i13 = iArr[0];
        int[] iArr2 = this.f1985g;
        int i14 = i13 - iArr2[0];
        iArr[0] = i14;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i14 + i10) - (m2033b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1980b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1980b.getMeasuredHeight();
        int i15 = this.f1984f[1];
        int i16 = ((i12 + i15) - dimensionPixelOffset3) - measuredHeight;
        int i17 = i15 + height + dimensionPixelOffset3;
        if (!z10 ? measuredHeight + i17 <= this.f1983e.height() : i16 < 0) {
            layoutParams.y = i16;
        } else {
            layoutParams.y = i17;
        }
    }

    /* renamed from: b */
    private static View m2033b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m2034c() {
        if (m2035d()) {
            ((WindowManager) this.f1979a.getSystemService("window")).removeView(this.f1980b);
        }
    }

    /* renamed from: d */
    boolean m2035d() {
        return this.f1980b.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m2036e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (m2035d()) {
            m2034c();
        }
        this.f1981c.setText(charSequence);
        m2032a(view, i10, i11, z10, this.f1982d);
        ((WindowManager) this.f1979a.getSystemService("window")).addView(this.f1980b, this.f1982d);
    }
}
