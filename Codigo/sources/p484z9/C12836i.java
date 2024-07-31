package p484z9;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ca.C1912k;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC5243h;
import com.google.android.gms.common.internal.C5234e;
import com.google.android.gms.internal.p496authapi.zbbj;
import java.util.Iterator;

/* renamed from: z9.i */
/* loaded from: classes.dex */
public final class C12836i extends AbstractC5243h {

    /* renamed from: a */
    private final GoogleSignInOptions f35030a;

    public C12836i(Context context, Looper looper, C5234e c5234e, GoogleSignInOptions googleSignInOptions, AbstractC5106f.a aVar, AbstractC5106f.b bVar) {
        super(context, looper, 91, c5234e, aVar, bVar);
        GoogleSignInOptions.C5092a c5092a = googleSignInOptions != null ? new GoogleSignInOptions.C5092a(googleSignInOptions) : new GoogleSignInOptions.C5092a();
        c5092a.m12945j(zbbj.zba());
        if (!c5234e.m13234d().isEmpty()) {
            Iterator<Scope> it = c5234e.m13234d().iterator();
            while (it.hasNext()) {
                c5092a.m12941f(it.next(), new Scope[0]);
            }
        }
        this.f35030a = c5092a.m12936a();
    }

    /* renamed from: c */
    public final GoogleSignInOptions m42579c() {
        return this.f35030a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof C12850w ? (C12850w) queryLocalInterface : new C12850w(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c, com.google.android.gms.common.api.C5101a.f
    public final int getMinApkVersion() {
        return C1912k.f7932a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public final Intent getSignInIntent() {
        return C12844q.m42582c(getContext(), this.f35030a);
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public final boolean providesSignIn() {
        return true;
    }
}
