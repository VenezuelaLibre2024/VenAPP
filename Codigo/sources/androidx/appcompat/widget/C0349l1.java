package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.C0871f;
import p125h.C7605a;

/* renamed from: androidx.appcompat.widget.l1 */
/* loaded from: classes.dex */
public class C0349l1 {

    /* renamed from: a */
    private final Context f1820a;

    /* renamed from: b */
    private final TypedArray f1821b;

    /* renamed from: c */
    private TypedValue f1822c;

    private C0349l1(Context context, TypedArray typedArray) {
        this.f1820a = context;
        this.f1821b = typedArray;
    }

    /* renamed from: s */
    public static C0349l1 m1843s(Context context, int i10, int[] iArr) {
        return new C0349l1(context, context.obtainStyledAttributes(i10, iArr));
    }

    /* renamed from: t */
    public static C0349l1 m1844t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0349l1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: u */
    public static C0349l1 m1845u(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new C0349l1(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    /* renamed from: a */
    public boolean m1846a(int i10, boolean z10) {
        return this.f1821b.getBoolean(i10, z10);
    }

    /* renamed from: b */
    public int m1847b(int i10, int i11) {
        return this.f1821b.getColor(i10, i11);
    }

    /* renamed from: c */
    public ColorStateList m1848c(int i10) {
        int resourceId;
        ColorStateList m23111a;
        return (!this.f1821b.hasValue(i10) || (resourceId = this.f1821b.getResourceId(i10, 0)) == 0 || (m23111a = C7605a.m23111a(this.f1820a, resourceId)) == null) ? this.f1821b.getColorStateList(i10) : m23111a;
    }

    /* renamed from: d */
    public int m1849d(int i10, int i11) {
        return this.f1821b.getDimensionPixelOffset(i10, i11);
    }

    /* renamed from: e */
    public int m1850e(int i10, int i11) {
        return this.f1821b.getDimensionPixelSize(i10, i11);
    }

    /* renamed from: f */
    public Drawable m1851f(int i10) {
        int resourceId;
        return (!this.f1821b.hasValue(i10) || (resourceId = this.f1821b.getResourceId(i10, 0)) == 0) ? this.f1821b.getDrawable(i10) : C7605a.m23112b(this.f1820a, resourceId);
    }

    /* renamed from: g */
    public Drawable m1852g(int i10) {
        int resourceId;
        if (!this.f1821b.hasValue(i10) || (resourceId = this.f1821b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return C0341j.m1781b().m1786d(this.f1820a, resourceId, true);
    }

    /* renamed from: h */
    public float m1853h(int i10, float f10) {
        return this.f1821b.getFloat(i10, f10);
    }

    /* renamed from: i */
    public Typeface m1854i(int i10, int i11, C0871f.e eVar) {
        int resourceId = this.f1821b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1822c == null) {
            this.f1822c = new TypedValue();
        }
        return C0871f.m4455f(this.f1820a, resourceId, this.f1822c, i11, eVar);
    }

    /* renamed from: j */
    public int m1855j(int i10, int i11) {
        return this.f1821b.getInt(i10, i11);
    }

    /* renamed from: k */
    public int m1856k(int i10, int i11) {
        return this.f1821b.getInteger(i10, i11);
    }

    /* renamed from: l */
    public int m1857l(int i10, int i11) {
        return this.f1821b.getLayoutDimension(i10, i11);
    }

    /* renamed from: m */
    public int m1858m(int i10, int i11) {
        return this.f1821b.getResourceId(i10, i11);
    }

    /* renamed from: n */
    public String m1859n(int i10) {
        return this.f1821b.getString(i10);
    }

    /* renamed from: o */
    public CharSequence m1860o(int i10) {
        return this.f1821b.getText(i10);
    }

    /* renamed from: p */
    public CharSequence[] m1861p(int i10) {
        return this.f1821b.getTextArray(i10);
    }

    /* renamed from: q */
    public TypedArray m1862q() {
        return this.f1821b;
    }

    /* renamed from: r */
    public boolean m1863r(int i10) {
        return this.f1821b.hasValue(i10);
    }

    /* renamed from: v */
    public void m1864v() {
        this.f1821b.recycle();
    }
}
