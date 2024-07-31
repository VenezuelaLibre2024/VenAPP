package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: androidx.fragment.app.g */
/* loaded from: classes.dex */
public abstract class AbstractC1265g {
    @Deprecated
    /* renamed from: b */
    public Fragment m6939b(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    /* renamed from: c */
    public abstract View mo6828c(int i10);

    /* renamed from: d */
    public abstract boolean mo6829d();
}
