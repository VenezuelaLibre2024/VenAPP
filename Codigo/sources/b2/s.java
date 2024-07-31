package b2;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class s {

    /* renamed from: b, reason: collision with root package name */
    public View f6132b;

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f6131a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<l> f6133c = new ArrayList<>();

    @Deprecated
    public s() {
    }

    public s(View view) {
        this.f6132b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f6132b == sVar.f6132b && this.f6131a.equals(sVar.f6131a);
    }

    public int hashCode() {
        return (this.f6132b.hashCode() * 31) + this.f6131a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f6132b + "\n") + "    values:";
        for (String str2 : this.f6131a.keySet()) {
            str = str + "    " + str2 + ": " + this.f6131a.get(str2) + "\n";
        }
        return str;
    }
}
