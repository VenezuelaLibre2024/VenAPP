package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C1116x0;
import com.google.android.gms.common.api.C5101a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p111g.C7386j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.j0 */
/* loaded from: classes.dex */
public class C0342j0 {

    /* renamed from: l */
    private static final RectF f1792l = new RectF();

    /* renamed from: m */
    private static ConcurrentHashMap<String, Method> f1793m = new ConcurrentHashMap<>();

    /* renamed from: n */
    private static ConcurrentHashMap<String, Field> f1794n = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f1795a = 0;

    /* renamed from: b */
    private boolean f1796b = false;

    /* renamed from: c */
    private float f1797c = -1.0f;

    /* renamed from: d */
    private float f1798d = -1.0f;

    /* renamed from: e */
    private float f1799e = -1.0f;

    /* renamed from: f */
    private int[] f1800f = new int[0];

    /* renamed from: g */
    private boolean f1801g = false;

    /* renamed from: h */
    private TextPaint f1802h;

    /* renamed from: i */
    private final TextView f1803i;

    /* renamed from: j */
    private final Context f1804j;

    /* renamed from: k */
    private final f f1805k;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.j0$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        static StaticLayout m1823a(CharSequence charSequence, Layout.Alignment alignment, int i10, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i10, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        /* renamed from: b */
        static int m1824b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.j0$b */
    /* loaded from: classes.dex */
    public static final class b {
        /* renamed from: a */
        static boolean m1825a(View view) {
            return view.isInLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.j0$c */
    /* loaded from: classes.dex */
    public static final class c {
        /* renamed from: a */
        static StaticLayout m1826a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = C5101a.e.API_PRIORITY_OTHER;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                fVar.mo1827a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$d */
    /* loaded from: classes.dex */
    private static class d extends f {
        d() {
        }

        @Override // androidx.appcompat.widget.C0342j0.f
        /* renamed from: a */
        void mo1827a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0342j0.m1801m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$e */
    /* loaded from: classes.dex */
    private static class e extends d {
        e() {
        }

        @Override // androidx.appcompat.widget.C0342j0.d, androidx.appcompat.widget.C0342j0.f
        /* renamed from: a */
        void mo1827a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.C0342j0.f
        /* renamed from: b */
        boolean mo1828b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.j0$f */
    /* loaded from: classes.dex */
    public static class f {
        f() {
        }

        /* renamed from: a */
        void mo1827a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        /* renamed from: b */
        boolean mo1828b(TextView textView) {
            return ((Boolean) C0342j0.m1801m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0342j0(TextView textView) {
        this.f1803i = textView;
        this.f1804j = textView.getContext();
        this.f1805k = Build.VERSION.SDK_INT >= 29 ? new e() : new d();
    }

    /* renamed from: b */
    private int[] m1797b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    /* renamed from: c */
    private void m1798c() {
        this.f1795a = 0;
        this.f1798d = -1.0f;
        this.f1799e = -1.0f;
        this.f1797c = -1.0f;
        this.f1800f = new int[0];
        this.f1796b = false;
    }

    /* renamed from: e */
    private int m1799e(RectF rectF) {
        int length = this.f1800f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = 1;
        int i11 = length - 1;
        int i12 = 0;
        while (i10 <= i11) {
            int i13 = (i10 + i11) / 2;
            if (m1806x(this.f1800f[i13], rectF)) {
                int i14 = i13 + 1;
                i12 = i10;
                i10 = i14;
            } else {
                i12 = i13 - 1;
                i11 = i12;
            }
        }
        return this.f1800f[i12];
    }

    /* renamed from: k */
    private static Method m1800k(String str) {
        try {
            Method method = f1793m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1793m.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    /* renamed from: m */
    static <T> T m1801m(Object obj, String str, T t10) {
        try {
            return (T) m1800k(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t10;
        }
    }

    /* renamed from: s */
    private void m1802s(float f10) {
        if (f10 != this.f1803i.getPaint().getTextSize()) {
            this.f1803i.getPaint().setTextSize(f10);
            boolean m1825a = b.m1825a(this.f1803i);
            if (this.f1803i.getLayout() != null) {
                this.f1796b = false;
                try {
                    Method m1800k = m1800k("nullLayouts");
                    if (m1800k != null) {
                        m1800k.invoke(this.f1803i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (m1825a) {
                    this.f1803i.forceLayout();
                } else {
                    this.f1803i.requestLayout();
                }
                this.f1803i.invalidate();
            }
        }
    }

    /* renamed from: u */
    private boolean m1803u() {
        if (m1807y() && this.f1795a == 1) {
            if (!this.f1801g || this.f1800f.length == 0) {
                int floor = ((int) Math.floor((this.f1799e - this.f1798d) / this.f1797c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round(this.f1798d + (i10 * this.f1797c));
                }
                this.f1800f = m1797b(iArr);
            }
            this.f1796b = true;
        } else {
            this.f1796b = false;
        }
        return this.f1796b;
    }

    /* renamed from: v */
    private void m1804v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f1800f = m1797b(iArr);
            m1805w();
        }
    }

    /* renamed from: w */
    private boolean m1805w() {
        boolean z10 = this.f1800f.length > 0;
        this.f1801g = z10;
        if (z10) {
            this.f1795a = 1;
            this.f1798d = r0[0];
            this.f1799e = r0[r1 - 1];
            this.f1797c = -1.0f;
        }
        return z10;
    }

    /* renamed from: x */
    private boolean m1806x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1803i.getText();
        TransformationMethod transformationMethod = this.f1803i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1803i)) != null) {
            text = transformation;
        }
        int m1824b = a.m1824b(this.f1803i);
        m1816l(i10);
        StaticLayout m1810d = m1810d(text, (Layout.Alignment) m1801m(this.f1803i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), m1824b);
        return (m1824b == -1 || (m1810d.getLineCount() <= m1824b && m1810d.getLineEnd(m1810d.getLineCount() - 1) == text.length())) && ((float) m1810d.getHeight()) <= rectF.bottom;
    }

    /* renamed from: y */
    private boolean m1807y() {
        return !(this.f1803i instanceof C0344k);
    }

    /* renamed from: z */
    private void m1808z(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f1795a = 1;
        this.f1798d = f10;
        this.f1799e = f11;
        this.f1797c = f12;
        this.f1801g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1809a() {
        if (m1817n()) {
            if (this.f1796b) {
                if (this.f1803i.getMeasuredHeight() <= 0 || this.f1803i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1805k.mo1828b(this.f1803i) ? 1048576 : (this.f1803i.getMeasuredWidth() - this.f1803i.getTotalPaddingLeft()) - this.f1803i.getTotalPaddingRight();
                int height = (this.f1803i.getHeight() - this.f1803i.getCompoundPaddingBottom()) - this.f1803i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1792l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float m1799e = m1799e(rectF);
                    if (m1799e != this.f1803i.getTextSize()) {
                        m1822t(0, m1799e);
                    }
                }
            }
            this.f1796b = true;
        }
    }

    /* renamed from: d */
    StaticLayout m1810d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return c.m1826a(charSequence, alignment, i10, i11, this.f1803i, this.f1802h, this.f1805k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m1811f() {
        return Math.round(this.f1799e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m1812g() {
        return Math.round(this.f1798d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m1813h() {
        return Math.round(this.f1797c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int[] m1814i() {
        return this.f1800f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m1815j() {
        return this.f1795a;
    }

    /* renamed from: l */
    void m1816l(int i10) {
        TextPaint textPaint = this.f1802h;
        if (textPaint == null) {
            this.f1802h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1802h.set(this.f1803i.getPaint());
        this.f1802h.setTextSize(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m1817n() {
        return m1807y() && this.f1795a != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m1818o(AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f1804j;
        int[] iArr = C7386j.f17010g0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f1803i;
        C1116x0.m5256U(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i10, 0);
        int i11 = C7386j.f17035l0;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f1795a = obtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = C7386j.f17030k0;
        float dimension = obtainStyledAttributes.hasValue(i12) ? obtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = C7386j.f17020i0;
        float dimension2 = obtainStyledAttributes.hasValue(i13) ? obtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = C7386j.f17015h0;
        float dimension3 = obtainStyledAttributes.hasValue(i14) ? obtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = C7386j.f17025j0;
        if (obtainStyledAttributes.hasValue(i15) && (resourceId = obtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m1804v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m1807y()) {
            this.f1795a = 0;
            return;
        }
        if (this.f1795a == 1) {
            if (!this.f1801g) {
                DisplayMetrics displayMetrics = this.f1804j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m1808z(dimension2, dimension3, dimension);
            }
            m1803u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m1819p(int i10, int i11, int i12, int i13) {
        if (m1807y()) {
            DisplayMetrics displayMetrics = this.f1804j.getResources().getDisplayMetrics();
            m1808z(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (m1803u()) {
                m1809a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m1820q(int[] iArr, int i10) {
        if (m1807y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1804j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f1800f = m1797b(iArr2);
                if (!m1805w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1801g = false;
            }
            if (m1803u()) {
                m1809a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m1821r(int i10) {
        if (m1807y()) {
            if (i10 == 0) {
                m1798c();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f1804j.getResources().getDisplayMetrics();
            m1808z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m1803u()) {
                m1809a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m1822t(int i10, float f10) {
        Context context = this.f1804j;
        m1802s(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
