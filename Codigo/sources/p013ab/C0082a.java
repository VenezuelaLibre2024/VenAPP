package p013ab;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import ca.C1894b;
import ca.C1912k;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.internal.AbstractC5228c;
import com.google.android.gms.common.internal.AbstractC5243h;
import com.google.android.gms.common.internal.C5234e;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.common.internal.C5277s0;
import p484z9.C12830c;
import za.InterfaceC12859f;

/* renamed from: ab.a */
/* loaded from: classes2.dex */
public class C0082a extends AbstractC5243h<C0088g> implements InterfaceC12859f {

    /* renamed from: e */
    public static final /* synthetic */ int f338e = 0;

    /* renamed from: a */
    private final boolean f339a;

    /* renamed from: b */
    private final C5234e f340b;

    /* renamed from: c */
    private final Bundle f341c;

    /* renamed from: d */
    private final Integer f342d;

    public C0082a(Context context, Looper looper, boolean z10, C5234e c5234e, Bundle bundle, AbstractC5106f.a aVar, AbstractC5106f.b bVar) {
        super(context, looper, 44, c5234e, aVar, bVar);
        this.f339a = true;
        this.f340b = c5234e;
        this.f341c = bundle;
        this.f342d = c5234e.m13239i();
    }

    /* renamed from: c */
    public static Bundle m376c(C5234e c5234e) {
        c5234e.m13238h();
        Integer m13239i = c5234e.m13239i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c5234e.m13231a());
        if (m13239i != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", m13239i.intValue());
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

    @Override // za.InterfaceC12859f
    /* renamed from: a */
    public final void mo377a() {
        connect(new AbstractC5228c.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // za.InterfaceC12859f
    /* renamed from: b */
    public final void mo378b(InterfaceC0087f interfaceC0087f) {
        C5276s.m13325k(interfaceC0087f, "Expecting a valid ISignInCallbacks");
        try {
            Account m13233c = this.f340b.m13233c();
            ((C0088g) getService()).m380f2(new C0091j(1, new C5277s0(m13233c, ((Integer) C5276s.m13324j(this.f342d)).intValue(), AbstractC5228c.DEFAULT_ACCOUNT.equals(m13233c.name) ? C12830c.m42567b(getContext()).m42570c() : null)), interfaceC0087f);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                interfaceC0087f.mo379v0(new C0093l(1, new C1894b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C0088g ? (C0088g) queryLocalInterface : new C0088g(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    protected final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f340b.m13236f())) {
            this.f341c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f340b.m13236f());
        }
        return this.f341c;
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c, com.google.android.gms.common.api.C5101a.f
    public final int getMinApkVersion() {
        return C1912k.f7932a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC5228c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c, com.google.android.gms.common.api.C5101a.f
    public final boolean requiresSignIn() {
        return this.f339a;
    }
}
