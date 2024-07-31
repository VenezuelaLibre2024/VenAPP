package ke;

import com.google.android.gms.common.internal.q;
import io.flutter.plugins.firebase.auth.Constants;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private String f20657a;

    public b(String str) {
        this.f20657a = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return q.b(this.f20657a, ((b) obj).f20657a);
        }
        return false;
    }

    public int hashCode() {
        return q.c(this.f20657a);
    }

    public String toString() {
        return q.d(this).a(Constants.TOKEN, this.f20657a).toString();
    }
}
