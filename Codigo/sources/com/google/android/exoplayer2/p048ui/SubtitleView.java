package com.google.android.exoplayer2.p048ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p120g8.C7484b;
import p329r8.C10636a;
import p361t6.InterfaceC11053j3;
import p363t8.C11172r0;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout implements InterfaceC11053j3.d {

    /* renamed from: a */
    private List<C7484b> f9586a;

    /* renamed from: b */
    private C10636a f9587b;

    /* renamed from: c */
    private int f9588c;

    /* renamed from: d */
    private float f9589d;

    /* renamed from: e */
    private float f9590e;

    /* renamed from: f */
    private boolean f9591f;

    /* renamed from: r */
    private boolean f9592r;

    /* renamed from: s */
    private int f9593s;

    /* renamed from: t */
    private InterfaceC4766a f9594t;

    /* renamed from: u */
    private View f9595u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.exoplayer2.ui.SubtitleView$a */
    /* loaded from: classes.dex */
    public interface InterfaceC4766a {
        /* renamed from: a */
        void mo12279a(List<C7484b> list, C10636a c10636a, float f10, int i10, float f11);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9586a = Collections.emptyList();
        this.f9587b = C10636a.f26875g;
        this.f9588c = 0;
        this.f9589d = 0.0533f;
        this.f9590e = 0.08f;
        this.f9591f = true;
        this.f9592r = true;
        C4770a c4770a = new C4770a(context);
        this.f9594t = c4770a;
        this.f9595u = c4770a;
        addView(c4770a);
        this.f9593s = 1;
    }

    private List<C7484b> getCuesWithStylingPreferencesApplied() {
        if (this.f9591f && this.f9592r) {
            return this.f9586a;
        }
        ArrayList arrayList = new ArrayList(this.f9586a.size());
        for (int i10 = 0; i10 < this.f9586a.size(); i10++) {
            arrayList.add(m12275s(this.f9586a.get(i10)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (C11172r0.f29040a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C10636a getUserCaptionStyle() {
        if (C11172r0.f29040a < 19 || isInEditMode()) {
            return C10636a.f26875g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? C10636a.f26875g : C10636a.m32409a(captioningManager.getUserStyle());
    }

    /* renamed from: s */
    private C7484b m12275s(C7484b c7484b) {
        C7484b.b m22763c = c7484b.m22763c();
        if (!this.f9591f) {
            C4778i.m12321e(m22763c);
        } else if (!this.f9592r) {
            C4778i.m12322f(m22763c);
        }
        return m22763c.m22764a();
    }

    private <T extends View & InterfaceC4766a> void setView(T t10) {
        removeView(this.f9595u);
        View view = this.f9595u;
        if (view instanceof C4779j) {
            ((C4779j) view).m12332g();
        }
        this.f9595u = t10;
        this.f9594t = t10;
        addView(t10);
    }

    /* renamed from: v */
    private void m12276v(int i10, float f10) {
        this.f9588c = i10;
        this.f9589d = f10;
        m12277w();
    }

    /* renamed from: w */
    private void m12277w() {
        this.f9594t.mo12279a(getCuesWithStylingPreferencesApplied(), this.f9587b, this.f9589d, this.f9588c, this.f9590e);
    }

    @Override // p361t6.InterfaceC11053j3.d
    public void onCues(List<C7484b> list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f9592r = z10;
        m12277w();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f9591f = z10;
        m12277w();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f9590e = f10;
        m12277w();
    }

    public void setCues(List<C7484b> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f9586a = list;
        m12277w();
    }

    public void setFractionalTextSize(float f10) {
        m12278u(f10, false);
    }

    public void setStyle(C10636a c10636a) {
        this.f9587b = c10636a;
        m12277w();
    }

    public void setViewType(int i10) {
        KeyEvent.Callback c4770a;
        if (this.f9593s == i10) {
            return;
        }
        if (i10 == 1) {
            c4770a = new C4770a(getContext());
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            c4770a = new C4779j(getContext());
        }
        setView(c4770a);
        this.f9593s = i10;
    }

    /* renamed from: u */
    public void m12278u(float f10, boolean z10) {
        m12276v(z10 ? 1 : 0, f10);
    }
}
