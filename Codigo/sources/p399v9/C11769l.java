package p399v9;

import android.os.Bundle;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.internal.C5270q;

/* renamed from: v9.l */
/* loaded from: classes.dex */
public final class C11769l implements C5101a.d {

    /* renamed from: a */
    private final String f31169a;

    public C11769l(String str) {
        this.f31169a = str;
    }

    /* renamed from: a */
    public final Bundle m37249a() {
        Bundle bundle = new Bundle();
        bundle.putString("session_id", this.f31169a);
        return bundle;
    }

    /* renamed from: b */
    public final String m37250b() {
        return this.f31169a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof C11769l;
    }

    public final int hashCode() {
        return C5270q.m13305c(C11769l.class);
    }
}
