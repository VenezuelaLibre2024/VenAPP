package p020b2;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b2.s */
/* loaded from: classes.dex */
public class C1644s {

    /* renamed from: b */
    public View f7027b;

    /* renamed from: a */
    public final Map<String, Object> f7026a = new HashMap();

    /* renamed from: c */
    final ArrayList<AbstractC1632l> f7028c = new ArrayList<>();

    @Deprecated
    public C1644s() {
    }

    public C1644s(View view) {
        this.f7027b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1644s)) {
            return false;
        }
        C1644s c1644s = (C1644s) obj;
        return this.f7027b == c1644s.f7027b && this.f7026a.equals(c1644s.f7026a);
    }

    public int hashCode() {
        return (this.f7027b.hashCode() * 31) + this.f7026a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f7027b + "\n") + "    values:";
        for (String str2 : this.f7026a.keySet()) {
            str = str + "    " + str2 + ": " + this.f7026a.get(str2) + "\n";
        }
        return str;
    }
}
