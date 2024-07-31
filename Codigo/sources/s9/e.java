package s9;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import java.util.Collections;
import java.util.List;
import z9.i;

/* loaded from: classes.dex */
final class e extends a.AbstractC0146a {
    @Override // com.google.android.gms.common.api.a.AbstractC0146a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, Object obj, f.a aVar, f.b bVar) {
        return new i(context, looper, eVar, (GoogleSignInOptions) obj, aVar, bVar);
    }

    @Override // com.google.android.gms.common.api.a.e
    public final /* bridge */ /* synthetic */ List getImpliedScopes(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.w1();
    }
}
