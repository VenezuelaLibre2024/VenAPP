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

/* loaded from: classes.dex */
class v1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1685a;

    /* renamed from: b, reason: collision with root package name */
    private final View f1686b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f1687c;

    /* renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f1688d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f1689e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f1690f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f1691g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1688d = layoutParams;
        this.f1689e = new Rect();
        this.f1690f = new int[2];
        this.f1691g = new int[2];
        this.f1685a = context;
        View inflate = LayoutInflater.from(context).inflate(g.g.f15382s, (ViewGroup) null);
        this.f1686b = inflate;
        this.f1687c = (TextView) inflate.findViewById(g.f.f15356s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = g.i.f15396a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int height;
        int i12;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1685a.getResources().getDimensionPixelOffset(g.d.f15309m);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1685a.getResources().getDimensionPixelOffset(g.d.f15308l);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1685a.getResources().getDimensionPixelOffset(z10 ? g.d.f15311o : g.d.f15310n);
        View b10 = b(view);
        if (b10 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b10.getWindowVisibleDisplayFrame(this.f1689e);
        Rect rect = this.f1689e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1685a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1689e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b10.getLocationOnScreen(this.f1691g);
        view.getLocationOnScreen(this.f1690f);
        int[] iArr = this.f1690f;
        int i13 = iArr[0];
        int[] iArr2 = this.f1691g;
        int i14 = i13 - iArr2[0];
        iArr[0] = i14;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i14 + i10) - (b10.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1686b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1686b.getMeasuredHeight();
        int i15 = this.f1690f[1];
        int i16 = ((i12 + i15) - dimensionPixelOffset3) - measuredHeight;
        int i17 = i15 + height + dimensionPixelOffset3;
        if (!z10 ? measuredHeight + i17 <= this.f1689e.height() : i16 < 0) {
            layoutParams.y = i16;
        } else {
            layoutParams.y = i17;
        }
    }

    private static View b(View view) {
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
    public void c() {
        if (d()) {
            ((WindowManager) this.f1685a.getSystemService("window")).removeView(this.f1686b);
        }
    }

    boolean d() {
        return this.f1686b.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f1687c.setText(charSequence);
        a(view, i10, i11, z10, this.f1688d);
        ((WindowManager) this.f1685a.getSystemService("window")).addView(this.f1686b, this.f1688d);
    }
}
