package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private TypedValue f1261a;

    /* renamed from: b, reason: collision with root package name */
    private TypedValue f1262b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f1263c;

    /* renamed from: d, reason: collision with root package name */
    private TypedValue f1264d;

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f1265e;

    /* renamed from: f, reason: collision with root package name */
    private TypedValue f1266f;

    /* renamed from: r, reason: collision with root package name */
    private final Rect f1267r;

    /* renamed from: s, reason: collision with root package name */
    private a f1268s;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1267r = new Rect();
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f1267r.set(i10, i11, i12, i13);
        if (androidx.core.view.x0.H(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1265e == null) {
            this.f1265e = new TypedValue();
        }
        return this.f1265e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1266f == null) {
            this.f1266f = new TypedValue();
        }
        return this.f1266f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1263c == null) {
            this.f1263c = new TypedValue();
        }
        return this.f1263c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1264d == null) {
            this.f1264d = new TypedValue();
        }
        return this.f1264d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1261a == null) {
            this.f1261a = new TypedValue();
        }
        return this.f1261a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1262b == null) {
            this.f1262b = new TypedValue();
        }
        return this.f1262b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f1268s;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f1268s;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f1268s = aVar;
    }
}
