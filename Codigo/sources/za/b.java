package za;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;

/* loaded from: classes2.dex */
final class b extends a.AbstractC0146a {
    @Override // com.google.android.gms.common.api.a.AbstractC0146a
    public final /* bridge */ /* synthetic */ a.f buildClient(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, Object obj, f.a aVar, f.b bVar) {
        return new ab.a(context, looper, true, eVar, ab.a.c(eVar), aVar, bVar);
    }
}
