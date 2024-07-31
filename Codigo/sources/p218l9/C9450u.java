package p218l9;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l9.u */
/* loaded from: classes.dex */
public final class C9450u extends LinkedHashMap {

    /* renamed from: a */
    final /* synthetic */ C9451v f22985a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9450u(C9451v c9451v) {
        this.f22985a = c9451v;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        int i10;
        ArrayDeque arrayDeque;
        int i11;
        synchronized (this.f22985a) {
            int size = size();
            C9451v c9451v = this.f22985a;
            i10 = c9451v.f22986a;
            if (size <= i10) {
                return false;
            }
            arrayDeque = c9451v.f22991f;
            arrayDeque.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
            int size2 = size();
            i11 = this.f22985a.f22986a;
            return size2 > i11;
        }
    }
}
