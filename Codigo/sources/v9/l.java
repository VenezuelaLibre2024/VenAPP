package v9;

import android.os.Bundle;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public final class l implements a.d {

    /* renamed from: a, reason: collision with root package name */
    private final String f28735a;

    public l(String str) {
        this.f28735a = str;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("session_id", this.f28735a);
        return bundle;
    }

    public final String b() {
        return this.f28735a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof l;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.q.c(l.class);
    }
}
