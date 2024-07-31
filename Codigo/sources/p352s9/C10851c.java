package p352s9;

import android.os.Bundle;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.internal.C5270q;

/* renamed from: s9.c */
/* loaded from: classes.dex */
public final class C10851c implements C5101a.d {

    /* renamed from: b */
    public static final C10851c f27538b = new C10851c(new Bundle(), null);

    /* renamed from: a */
    private final Bundle f27539a;

    /* synthetic */ C10851c(Bundle bundle, C10855g c10855g) {
        this.f27539a = bundle;
    }

    /* renamed from: a */
    public final Bundle m33095a() {
        return new Bundle(this.f27539a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10851c) {
            return C5270q.m13303a(this.f27539a, ((C10851c) obj).f27539a);
        }
        return false;
    }

    public final int hashCode() {
        return C5270q.m13305c(this.f27539a);
    }
}
