package l5;

import android.util.SparseArray;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f20979a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final SparseArray<m5.a> f20980b = new SparseArray<>();

    private a() {
    }

    public final m5.a a(int i10) {
        return f20980b.get(i10);
    }

    public final void b(m5.a handler) {
        n.e(handler, "handler");
        f20980b.append(handler.getType(), handler);
    }
}
