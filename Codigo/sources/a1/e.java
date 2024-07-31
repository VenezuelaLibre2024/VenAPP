package a1;

import a1.d;
import java.util.Arrays;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class e {
    public static final d a() {
        return new a(null, true, true ? 1 : 0, 0 == true ? 1 : 0);
    }

    public static final a b(d.b<?>... pairs) {
        n.e(pairs, "pairs");
        a aVar = new a(null, false, 1, 0 == true ? 1 : 0);
        aVar.g((d.b[]) Arrays.copyOf(pairs, pairs.length));
        return aVar;
    }
}
