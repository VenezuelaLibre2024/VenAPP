package s9;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.p000authapi.zbo;
import s9.a;

/* loaded from: classes.dex */
final class d extends a.AbstractC0146a {
    @Override // com.google.android.gms.common.api.a.AbstractC0146a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, Object obj, f.a aVar, f.b bVar) {
        return new zbo(context, looper, eVar, (a.C0422a) obj, aVar, bVar);
    }
}
