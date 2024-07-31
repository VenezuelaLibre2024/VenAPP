package tk;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.C9322n;
import sk.AbstractC10931a;

/* renamed from: tk.a */
/* loaded from: classes3.dex */
public final class C11290a extends AbstractC10931a {
    @Override // sk.AbstractC10933c
    /* renamed from: e */
    public int mo33402e(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    @Override // sk.AbstractC10931a
    /* renamed from: f */
    public Random mo33399f() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C9322n.m27780d(current, "current()");
        return current;
    }
}
