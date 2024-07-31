package s9;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.q;

/* loaded from: classes.dex */
public final class c implements a.d {

    /* renamed from: b, reason: collision with root package name */
    public static final c f25419b = new c(new Bundle(), null);

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f25420a;

    /* synthetic */ c(Bundle bundle, g gVar) {
        this.f25420a = bundle;
    }

    public final Bundle a() {
        return new Bundle(this.f25420a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return q.a(this.f25420a, ((c) obj).f25420a);
        }
        return false;
    }

    public final int hashCode() {
        return q.c(this.f25420a);
    }
}
