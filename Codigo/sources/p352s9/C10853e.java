package p352s9;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.internal.C5234e;
import java.util.Collections;
import java.util.List;
import p484z9.C12836i;

/* renamed from: s9.e */
/* loaded from: classes.dex */
final class C10853e extends C5101a.a {
    @Override // com.google.android.gms.common.api.C5101a.a
    public final /* synthetic */ C5101a.f buildClient(Context context, Looper looper, C5234e c5234e, Object obj, AbstractC5106f.a aVar, AbstractC5106f.b bVar) {
        return new C12836i(context, looper, c5234e, (GoogleSignInOptions) obj, aVar, bVar);
    }

    @Override // com.google.android.gms.common.api.C5101a.e
    public final /* bridge */ /* synthetic */ List getImpliedScopes(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.m12931w1();
    }
}
