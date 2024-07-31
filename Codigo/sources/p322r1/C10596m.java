package p322r1;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C9322n;

/* renamed from: r1.m */
/* loaded from: classes.dex */
public final class C10596m {

    /* renamed from: a */
    private final AbstractC10604u f26696a;

    /* renamed from: b */
    private final Set<LiveData<?>> f26697b;

    public C10596m(AbstractC10604u database) {
        C9322n.m27781e(database, "database");
        this.f26696a = database;
        Set<LiveData<?>> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        C9322n.m27780d(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f26697b = newSetFromMap;
    }

    /* renamed from: a */
    public final <T> LiveData<T> m32186a(String[] tableNames, boolean z10, Callable<T> computeFunction) {
        C9322n.m27781e(tableNames, "tableNames");
        C9322n.m27781e(computeFunction, "computeFunction");
        return new C10579a0(this.f26696a, this, z10, computeFunction, tableNames);
    }

    /* renamed from: b */
    public final void m32187b(LiveData<?> liveData) {
        C9322n.m27781e(liveData, "liveData");
        this.f26697b.add(liveData);
    }

    /* renamed from: c */
    public final void m32188c(LiveData<?> liveData) {
        C9322n.m27781e(liveData, "liveData");
        this.f26697b.remove(liveData);
    }
}
