package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.f;

/* loaded from: classes.dex */
public class l1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1545a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f1546b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f1547c;

    private l1(Context context, TypedArray typedArray) {
        this.f1545a = context;
        this.f1546b = typedArray;
    }

    public static l1 s(Context context, int i10, int[] iArr) {
        return new l1(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static l1 t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new l1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static l1 u(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new l1(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f1546b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f1546b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList a10;
        return (!this.f1546b.hasValue(i10) || (resourceId = this.f1546b.getResourceId(i10, 0)) == 0 || (a10 = h.a.a(this.f1545a, resourceId)) == null) ? this.f1546b.getColorStateList(i10) : a10;
    }

    public int d(int i10, int i11) {
        return this.f1546b.getDimensionPixelOffset(i10, i11);
    }

    public int e(int i10, int i11) {
        return this.f1546b.getDimensionPixelSize(i10, i11);
    }

    public Drawable f(int i10) {
        int resourceId;
        return (!this.f1546b.hasValue(i10) || (resourceId = this.f1546b.getResourceId(i10, 0)) == 0) ? this.f1546b.getDrawable(i10) : h.a.b(this.f1545a, resourceId);
    }

    public Drawable g(int i10) {
        int resourceId;
        if (!this.f1546b.hasValue(i10) || (resourceId = this.f1546b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return j.b().d(this.f1545a, resourceId, true);
    }

    public float h(int i10, float f10) {
        return this.f1546b.getFloat(i10, f10);
    }

    public Typeface i(int i10, int i11, f.e eVar) {
        int resourceId = this.f1546b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1547c == null) {
            this.f1547c = new TypedValue();
        }
        return androidx.core.content.res.f.f(this.f1545a, resourceId, this.f1547c, i11, eVar);
    }

    public int j(int i10, int i11) {
        return this.f1546b.getInt(i10, i11);
    }

    public int k(int i10, int i11) {
        return this.f1546b.getInteger(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f1546b.getLayoutDimension(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f1546b.getResourceId(i10, i11);
    }

    public String n(int i10) {
        return this.f1546b.getString(i10);
    }

    public CharSequence o(int i10) {
        return this.f1546b.getText(i10);
    }

    public CharSequence[] p(int i10) {
        return this.f1546b.getTextArray(i10);
    }

    public TypedArray q() {
        return this.f1546b;
    }

    public boolean r(int i10) {
        return this.f1546b.hasValue(i10);
    }

    public void v() {
        this.f1546b.recycle();
    }
}
