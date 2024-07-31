package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.base.zat;
import java.util.concurrent.ExecutorService;
import ma.ThreadFactoryC9561c;

/* renamed from: com.google.android.gms.common.api.internal.h1 */
/* loaded from: classes.dex */
public final class C5141h1 {

    /* renamed from: a */
    private static final ExecutorService f10485a = zat.zaa().zaa(new ThreadFactoryC9561c("GAC_Transform"), 1);

    /* renamed from: a */
    public static ExecutorService m13069a() {
        return f10485a;
    }
}
