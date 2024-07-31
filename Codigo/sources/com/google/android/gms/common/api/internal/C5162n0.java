package com.google.android.gms.common.api.internal;

import ca.C1898d;
import com.google.android.gms.common.internal.C5270q;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.n0 */
/* loaded from: classes.dex */
public final class C5162n0 {

    /* renamed from: a */
    private final C5115b f10546a;

    /* renamed from: b */
    private final C1898d f10547b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5162n0(C5115b c5115b, C1898d c1898d, C5159m0 c5159m0) {
        this.f10546a = c5115b;
        this.f10547b = c1898d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C5162n0)) {
            C5162n0 c5162n0 = (C5162n0) obj;
            if (C5270q.m13304b(this.f10546a, c5162n0.f10546a) && C5270q.m13304b(this.f10547b, c5162n0.f10547b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C5270q.m13305c(this.f10546a, this.f10547b);
    }

    public final String toString() {
        return C5270q.m13306d(this).m13307a(Constants.KEY, this.f10546a).m13307a("feature", this.f10547b).toString();
    }
}
