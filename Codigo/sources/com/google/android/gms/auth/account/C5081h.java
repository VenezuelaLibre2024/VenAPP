package com.google.android.gms.auth.account;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.internal.C5234e;
import com.google.android.gms.internal.auth.zzam;

/* renamed from: com.google.android.gms.auth.account.h */
/* loaded from: classes.dex */
final class C5081h extends C5101a.a {
    @Override // com.google.android.gms.common.api.C5101a.a
    public final /* synthetic */ C5101a.f buildClient(Context context, Looper looper, C5234e c5234e, Object obj, AbstractC5106f.a aVar, AbstractC5106f.b bVar) {
        return new zzam(context, looper, c5234e, aVar, bVar);
    }
}
