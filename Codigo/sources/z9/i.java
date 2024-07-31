package z9;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.p000authapi.zbbj;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i extends com.google.android.gms.common.internal.h {

    /* renamed from: a */
    private final GoogleSignInOptions f32479a;

    public i(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, GoogleSignInOptions googleSignInOptions, f.a aVar, f.b bVar) {
        super(context, looper, 91, eVar, aVar, bVar);
        GoogleSignInOptions.a aVar2 = googleSignInOptions != null ? new GoogleSignInOptions.a(googleSignInOptions) : new GoogleSignInOptions.a();
        aVar2.j(zbbj.zba());
        if (!eVar.d().isEmpty()) {
            Iterator<Scope> it = eVar.d().iterator();
            while (it.hasNext()) {
                aVar2.f(it.next(), new Scope[0]);
            }
        }
        this.f32479a = aVar2.a();
    }

    public final GoogleSignInOptions c() {
        return this.f32479a;
    }

    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof w ? (w) queryLocalInterface : new w(iBinder);
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return ca.k.f6983a;
    }

    @Override // com.google.android.gms.common.internal.c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.c
    public final Intent getSignInIntent() {
        return q.c(getContext(), this.f32479a);
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.c
    public final boolean providesSignIn() {
        return true;
    }
}
