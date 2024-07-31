package l9;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u extends LinkedHashMap {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f21132a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(v vVar) {
        this.f21132a = vVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        int i10;
        ArrayDeque arrayDeque;
        int i11;
        synchronized (this.f21132a) {
            int size = size();
            v vVar = this.f21132a;
            i10 = vVar.f21133a;
            if (size <= i10) {
                return false;
            }
            arrayDeque = vVar.f21138f;
            arrayDeque.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
            int size2 = size();
            i11 = this.f21132a.f21133a;
            return size2 > i11;
        }
    }
}
