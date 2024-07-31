package t;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f25693a;

    public e(String str) {
        this.f25693a = str;
    }

    public List<Size> a(int i10) {
        s.n nVar = (s.n) s.l.a(s.n.class);
        return nVar == null ? new ArrayList() : nVar.a(this.f25693a, i10);
    }
}
