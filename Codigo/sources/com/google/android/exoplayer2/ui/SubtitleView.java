package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import g8.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t6.j3;
import t8.r0;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout implements j3.d {

    /* renamed from: a, reason: collision with root package name */
    private List<g8.b> f8519a;

    /* renamed from: b, reason: collision with root package name */
    private r8.a f8520b;

    /* renamed from: c, reason: collision with root package name */
    private int f8521c;

    /* renamed from: d, reason: collision with root package name */
    private float f8522d;

    /* renamed from: e, reason: collision with root package name */
    private float f8523e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8524f;

    /* renamed from: r, reason: collision with root package name */
    private boolean f8525r;

    /* renamed from: s, reason: collision with root package name */
    private int f8526s;

    /* renamed from: t, reason: collision with root package name */
    private a f8527t;

    /* renamed from: u, reason: collision with root package name */
    private View f8528u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void a(List<g8.b> list, r8.a aVar, float f10, int i10, float f11);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8519a = Collections.emptyList();
        this.f8520b = r8.a.f24761g;
        this.f8521c = 0;
        this.f8522d = 0.0533f;
        this.f8523e = 0.08f;
        this.f8524f = true;
        this.f8525r = true;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context);
        this.f8527t = aVar;
        this.f8528u = aVar;
        addView(aVar);
        this.f8526s = 1;
    }

    private List<g8.b> getCuesWithStylingPreferencesApplied() {
        if (this.f8524f && this.f8525r) {
            return this.f8519a;
        }
        ArrayList arrayList = new ArrayList(this.f8519a.size());
        for (int i10 = 0; i10 < this.f8519a.size(); i10++) {
            arrayList.add(s(this.f8519a.get(i10)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (r0.f26744a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private r8.a getUserCaptionStyle() {
        if (r0.f26744a < 19 || isInEditMode()) {
            return r8.a.f24761g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? r8.a.f24761g : r8.a.a(captioningManager.getUserStyle());
    }

    private g8.b s(g8.b bVar) {
        b.C0262b c10 = bVar.c();
        if (!this.f8524f) {
            i.e(c10);
        } else if (!this.f8525r) {
            i.f(c10);
        }
        return c10.a();
    }

    private <T extends View & a> void setView(T t10) {
        removeView(this.f8528u);
        View view = this.f8528u;
        if (view instanceof j) {
            ((j) view).g();
        }
        this.f8528u = t10;
        this.f8527t = t10;
        addView(t10);
    }

    private void v(int i10, float f10) {
        this.f8521c = i10;
        this.f8522d = f10;
        w();
    }

    private void w() {
        this.f8527t.a(getCuesWithStylingPreferencesApplied(), this.f8520b, this.f8522d, this.f8521c, this.f8523e);
    }

    @Override // t6.j3.d
    public void onCues(List<g8.b> list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f8525r = z10;
        w();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f8524f = z10;
        w();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f8523e = f10;
        w();
    }

    public void setCues(List<g8.b> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f8519a = list;
        w();
    }

    public void setFractionalTextSize(float f10) {
        u(f10, false);
    }

    public void setStyle(r8.a aVar) {
        this.f8520b = aVar;
        w();
    }

    public void setViewType(int i10) {
        KeyEvent.Callback aVar;
        if (this.f8526s == i10) {
            return;
        }
        if (i10 == 1) {
            aVar = new com.google.android.exoplayer2.ui.a(getContext());
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            aVar = new j(getContext());
        }
        setView(aVar);
        this.f8526s = i10;
    }

    public void u(float f10, boolean z10) {
        v(z10 ? 1 : 0, f10);
    }
}
