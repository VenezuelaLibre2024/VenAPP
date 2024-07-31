package com.google.android.exoplayer2.p048ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.p048ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p120g8.C7484b;
import p329r8.C10636a;
import p363t8.C11172r0;

/* renamed from: com.google.android.exoplayer2.ui.j */
/* loaded from: classes.dex */
final class C4779j extends FrameLayout implements SubtitleView.InterfaceC4766a {

    /* renamed from: a */
    private final C4770a f9668a;

    /* renamed from: b */
    private final WebView f9669b;

    /* renamed from: c */
    private List<C7484b> f9670c;

    /* renamed from: d */
    private C10636a f9671d;

    /* renamed from: e */
    private float f9672e;

    /* renamed from: f */
    private int f9673f;

    /* renamed from: r */
    private float f9674r;

    /* renamed from: com.google.android.exoplayer2.ui.j$a */
    /* loaded from: classes.dex */
    class a extends WebView {
        a(C4779j c4779j, Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.exoplayer2.ui.j$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f9675a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f9675a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9675a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9675a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C4779j(Context context) {
        this(context, null);
    }

    public C4779j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9670c = Collections.emptyList();
        this.f9671d = C10636a.f26875g;
        this.f9672e = 0.0533f;
        this.f9673f = 0;
        this.f9674r = 0.08f;
        C4770a c4770a = new C4770a(context, attributeSet);
        this.f9668a = c4770a;
        a aVar = new a(this, context, attributeSet);
        this.f9669b = aVar;
        aVar.setBackgroundColor(0);
        addView(c4770a);
        addView(aVar);
    }

    /* renamed from: b */
    private static int m12325b(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 0 : -100;
        }
        return -50;
    }

    /* renamed from: c */
    private static String m12326c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i10 = b.f9675a[alignment.ordinal()];
        return i10 != 1 ? i10 != 2 ? "center" : "end" : "start";
    }

    /* renamed from: d */
    private static String m12327d(C10636a c10636a) {
        int i10 = c10636a.f26879d;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "unset" : C11172r0.m34860C("-0.05em -0.05em 0.15em %s", C4771b.m12293b(c10636a.f26880e)) : C11172r0.m34860C("0.06em 0.08em 0.15em %s", C4771b.m12293b(c10636a.f26880e)) : C11172r0.m34860C("0.1em 0.12em 0.15em %s", C4771b.m12293b(c10636a.f26880e)) : C11172r0.m34860C("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", C4771b.m12293b(c10636a.f26880e));
    }

    /* renamed from: e */
    private String m12328e(int i10, float f10) {
        float m12324h = C4778i.m12324h(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return m12324h == -3.4028235E38f ? "unset" : C11172r0.m34860C("%.2fpx", Float.valueOf(m12324h / getContext().getResources().getDisplayMetrics().density));
    }

    /* renamed from: f */
    private static String m12329f(int i10) {
        return i10 != 1 ? i10 != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    /* renamed from: h */
    private static String m12330h(C7484b c7484b) {
        float f10 = c7484b.f17655B;
        if (f10 == 0.0f) {
            return "";
        }
        int i10 = c7484b.f17654A;
        return C11172r0.m34860C("%s(%.2fdeg)", (i10 == 2 || i10 == 1) ? "skewY" : "skewX", Float.valueOf(f10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0144, code lost:
    
        if (r13 != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0149, code lost:
    
        r21 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014b, code lost:
    
        r22 = "top";
        r13 = 2;
        r23 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0147, code lost:
    
        if (r13 != 0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0107  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m12331i() {
        /*
            Method dump skipped, instructions count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p048ui.C4779j.m12331i():void");
    }

    @Override // com.google.android.exoplayer2.p048ui.SubtitleView.InterfaceC4766a
    /* renamed from: a */
    public void mo12279a(List<C7484b> list, C10636a c10636a, float f10, int i10, float f11) {
        this.f9671d = c10636a;
        this.f9672e = f10;
        this.f9673f = i10;
        this.f9674r = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            C7484b c7484b = list.get(i11);
            if (c7484b.f17659d != null) {
                arrayList.add(c7484b);
            } else {
                arrayList2.add(c7484b);
            }
        }
        if (!this.f9670c.isEmpty() || !arrayList2.isEmpty()) {
            this.f9670c = arrayList2;
            m12331i();
        }
        this.f9668a.mo12279a(arrayList, c10636a, f10, i10, f11);
        invalidate();
    }

    /* renamed from: g */
    public void m12332g() {
        this.f9669b.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || this.f9670c.isEmpty()) {
            return;
        }
        m12331i();
    }
}
