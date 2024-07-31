package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: androidx.core.view.accessibility.a */
/* loaded from: classes.dex */
public final class C0992a extends ClickableSpan {

    /* renamed from: a */
    private final int f4552a;

    /* renamed from: b */
    private final C1007p f4553b;

    /* renamed from: c */
    private final int f4554c;

    public C0992a(int i10, C1007p c1007p, int i11) {
        this.f4552a = i10;
        this.f4553b = c1007p;
        this.f4554c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4552a);
        this.f4553b.m4900G(this.f4554c, bundle);
    }
}
