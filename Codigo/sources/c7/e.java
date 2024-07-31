package c7;

import t6.b3;
import t8.e0;
import y6.b0;

/* loaded from: classes.dex */
abstract class e {

    /* renamed from: a, reason: collision with root package name */
    protected final b0 f6895a;

    /* loaded from: classes.dex */
    public static final class a extends b3 {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e(b0 b0Var) {
        this.f6895a = b0Var;
    }

    public final boolean a(e0 e0Var, long j10) {
        return b(e0Var) && c(e0Var, j10);
    }

    protected abstract boolean b(e0 e0Var);

    protected abstract boolean c(e0 e0Var, long j10);
}
