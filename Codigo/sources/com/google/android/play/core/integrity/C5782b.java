package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import com.google.android.play.integrity.internal.C5820c0;

/* renamed from: com.google.android.play.core.integrity.b */
/* loaded from: classes2.dex */
final class C5782b extends AbstractC5783ba {

    /* renamed from: a */
    private String f12164a;

    /* renamed from: b */
    private C5820c0 f12165b;

    /* renamed from: c */
    private PendingIntent f12166c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.integrity.AbstractC5783ba
    /* renamed from: a */
    public final AbstractC5783ba mo14638a(PendingIntent pendingIntent) {
        this.f12166c = pendingIntent;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.integrity.AbstractC5783ba
    /* renamed from: b */
    public final AbstractC5783ba mo14639b(C5820c0 c5820c0) {
        if (c5820c0 == null) {
            throw new NullPointerException("Null logger");
        }
        this.f12165b = c5820c0;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.integrity.AbstractC5783ba
    /* renamed from: c */
    public final AbstractC5783ba mo14640c(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f12164a = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.integrity.AbstractC5783ba
    /* renamed from: d */
    public final C5784bb mo14641d() {
        C5820c0 c5820c0;
        String str = this.f12164a;
        if (str != null && (c5820c0 = this.f12165b) != null) {
            return new C5784bb(str, c5820c0, this.f12166c);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f12164a == null) {
            sb2.append(" token");
        }
        if (this.f12165b == null) {
            sb2.append(" logger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
