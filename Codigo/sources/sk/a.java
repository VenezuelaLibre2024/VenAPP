package sk;

import java.util.Random;

/* loaded from: classes3.dex */
public abstract class a extends c {
    @Override // sk.c
    public int b(int i10) {
        return d.e(f().nextInt(), i10);
    }

    @Override // sk.c
    public int c() {
        return f().nextInt();
    }

    @Override // sk.c
    public int d(int i10) {
        return f().nextInt(i10);
    }

    public abstract Random f();
}
