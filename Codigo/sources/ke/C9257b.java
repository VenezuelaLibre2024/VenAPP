package ke;

import com.google.android.gms.common.internal.C5270q;
import io.flutter.plugins.firebase.auth.Constants;

/* renamed from: ke.b */
/* loaded from: classes.dex */
public class C9257b {

    /* renamed from: a */
    private String f22479a;

    public C9257b(String str) {
        this.f22479a = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9257b) {
            return C5270q.m13304b(this.f22479a, ((C9257b) obj).f22479a);
        }
        return false;
    }

    public int hashCode() {
        return C5270q.m13305c(this.f22479a);
    }

    public String toString() {
        return C5270q.m13306d(this).m13307a(Constants.TOKEN, this.f22479a).toString();
    }
}
