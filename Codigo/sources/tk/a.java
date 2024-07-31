package tk;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class a extends sk.a {
    @Override // sk.c
    public int e(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    @Override // sk.a
    public Random f() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        n.d(current, "current()");
        return current;
    }
}
