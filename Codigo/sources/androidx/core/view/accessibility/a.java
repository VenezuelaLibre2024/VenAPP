package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    private final int f3880a;

    /* renamed from: b, reason: collision with root package name */
    private final p f3881b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3882c;

    public a(int i10, p pVar, int i11) {
        this.f3880a = i10;
        this.f3881b = pVar;
        this.f3882c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3880a);
        this.f3881b.G(this.f3882c, bundle);
    }
}
