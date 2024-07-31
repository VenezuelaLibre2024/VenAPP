package androidx.camera.core.impl;

import android.content.Context;
import android.util.Pair;
import android.util.Size;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public interface z {

    /* loaded from: classes.dex */
    public interface a {
        z a(Context context, Object obj, Set<String> set);
    }

    Pair<Map<k2<?>, b2>, Map<androidx.camera.core.impl.a, b2>> a(int i10, String str, List<androidx.camera.core.impl.a> list, Map<k2<?>, List<Size>> map);

    d2 b(int i10, String str, int i11, Size size);
}
