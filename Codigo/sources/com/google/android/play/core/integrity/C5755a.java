package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import com.google.android.play.integrity.internal.C5820c0;

/* renamed from: com.google.android.play.core.integrity.a */
/* loaded from: classes2.dex */
final class C5755a extends AbstractC5762ag {

    /* renamed from: a */
    private String f12113a;

    /* renamed from: b */
    private C5820c0 f12114b;

    /* renamed from: c */
    private PendingIntent f12115c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.integrity.AbstractC5762ag
    /* renamed from: a */
    public final AbstractC5762ag mo14611a(PendingIntent pendingIntent) {
        this.f12115c = pendingIntent;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.integrity.AbstractC5762ag
    /* renamed from: b */
    public final AbstractC5762ag mo14612b(C5820c0 c5820c0) {
        if (c5820c0 == null) {
            throw new NullPointerException("Null logger");
        }
        this.f12114b = c5820c0;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.integrity.AbstractC5762ag
    /* renamed from: c */
    public final AbstractC5762ag mo14613c(String str) {
        this.f12113a = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.integrity.AbstractC5762ag
    /* renamed from: d */
    public final C5763ah mo14614d() {
        C5820c0 c5820c0;
        String str = this.f12113a;
        if (str != null && (c5820c0 = this.f12114b) != null) {
            return new C5763ah(str, c5820c0, this.f12115c);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f12113a == null) {
            sb2.append(" token");
        }
        if (this.f12114b == null) {
            sb2.append(" logger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
