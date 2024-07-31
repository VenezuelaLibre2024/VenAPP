package p485zb;

import com.google.android.gms.common.internal.C5276s;

/* renamed from: zb.m */
/* loaded from: classes.dex */
public class C12873m extends Exception {
    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public C12873m() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12873m(String str) {
        super(str);
        C5276s.m13321g(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12873m(String str, Throwable th2) {
        super(str, th2);
        C5276s.m13321g(str, "Detail message must not be empty");
    }
}
