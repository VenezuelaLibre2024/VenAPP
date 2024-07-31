package ab;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.s0;

/* loaded from: classes2.dex */
public class a extends com.google.android.gms.common.internal.h<g> implements za.f {

    /* renamed from: e */
    public static final /* synthetic */ int f287e = 0;

    /* renamed from: a */
    private final boolean f288a;

    /* renamed from: b */
    private final com.google.android.gms.common.internal.e f289b;

    /* renamed from: c */
    private final Bundle f290c;

    /* renamed from: d */
    private final Integer f291d;

    public a(Context context, Looper looper, boolean z10, com.google.android.gms.common.internal.e eVar, Bundle bundle, f.a aVar, f.b bVar) {
        super(context, looper, 44, eVar, aVar, bVar);
        this.f288a = true;
        this.f289b = eVar;
        this.f290c = bundle;
        this.f291d = eVar.i();
    }

    public static Bundle c(com.google.android.gms.common.internal.e eVar) {
        eVar.h();
        Integer i10 = eVar.i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.a());
        if (i10 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", i10.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // za.f
    public final void a() {
        connect(new c.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // za.f
    public final void b(f fVar) {
        s.k(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account c10 = this.f289b.c();
            ((g) getService()).f2(new j(1, new s0(c10, ((Integer) s.j(this.f291d)).intValue(), com.google.android.gms.common.internal.c.DEFAULT_ACCOUNT.equals(c10.name) ? z9.c.b(getContext()).c() : null)), fVar);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.v0(new l(1, new ca.b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }

    @Override // com.google.android.gms.common.internal.c
    protected final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f289b.f())) {
            this.f290c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f289b.f());
        }
        return this.f290c;
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return ca.k.f6983a;
    }

    @Override // com.google.android.gms.common.internal.c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final boolean requiresSignIn() {
        return this.f288a;
    }
}
