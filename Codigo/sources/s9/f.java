package s9;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.internal.auth.zzbe;

/* loaded from: classes.dex */
final class f extends a.AbstractC0146a {
    @Override // com.google.android.gms.common.api.a.AbstractC0146a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, Object obj, com.google.android.gms.common.api.internal.f fVar, n nVar) {
        return new zzbe(context, looper, eVar, (c) obj, fVar, nVar);
    }
}
