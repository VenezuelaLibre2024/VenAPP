package r1;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    private final u f24582a;

    /* renamed from: b */
    private final Set<LiveData<?>> f24583b;

    public m(u database) {
        kotlin.jvm.internal.n.e(database, "database");
        this.f24582a = database;
        Set<LiveData<?>> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        kotlin.jvm.internal.n.d(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f24583b = newSetFromMap;
    }

    public final <T> LiveData<T> a(String[] tableNames, boolean z10, Callable<T> computeFunction) {
        kotlin.jvm.internal.n.e(tableNames, "tableNames");
        kotlin.jvm.internal.n.e(computeFunction, "computeFunction");
        return new a0(this.f24582a, this, z10, computeFunction, tableNames);
    }

    public final void b(LiveData<?> liveData) {
        kotlin.jvm.internal.n.e(liveData, "liveData");
        this.f24583b.add(liveData);
    }

    public final void c(LiveData<?> liveData) {
        kotlin.jvm.internal.n.e(liveData, "liveData");
        this.f24583b.remove(liveData);
    }
}
