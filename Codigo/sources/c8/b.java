package c8;

import android.net.Uri;
import s8.n;
import t8.r0;

/* loaded from: classes.dex */
public final class b {
    public static n a(int i10) {
        return new n(Uri.parse(r0.C("%s:%d", "rtp://0.0.0.0", Integer.valueOf(i10))));
    }
}
