package zb;

import com.google.android.gms.common.internal.s;

/* loaded from: classes.dex */
public class m extends Exception {
    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public m() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str) {
        super(str);
        s.g(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, Throwable th2) {
        super(str, th2);
        s.g(str, "Detail message must not be empty");
    }
}
