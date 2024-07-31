package com.google.android.gms.internal.p498firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5276s;
import com.google.firebase.auth.C6104o0;
import ga.C7533a;

/* loaded from: classes2.dex */
public class zzacd {
    private final zzace zza;
    private final C7533a zzb;

    public zzacd(zzacd zzacdVar) {
        this(zzacdVar.zza, zzacdVar.zzb);
    }

    public zzacd(zzace zzaceVar, C7533a c7533a) {
        this.zza = (zzace) C5276s.m13324j(zzaceVar);
        this.zzb = (C7533a) C5276s.m13324j(c7533a);
    }

    public final void zza() {
        try {
            this.zza.zza();
        } catch (RemoteException e10) {
            this.zzb.m22870b("RemoteException when sending delete account response.", e10, new Object[0]);
        }
    }

    public void zza(Status status) {
        try {
            this.zza.zza(status);
        } catch (RemoteException e10) {
            this.zzb.m22870b("RemoteException when sending failure result.", e10, new Object[0]);
        }
    }

    public final void zza(Status status, C6104o0 c6104o0) {
        try {
            this.zza.zza(status, c6104o0);
        } catch (RemoteException e10) {
            this.zzb.m22870b("RemoteException when sending failure result.", e10, new Object[0]);
        }
    }

    public final void zza(zzaen zzaenVar) {
        try {
            this.zza.zza(zzaenVar);
        } catch (RemoteException e10) {
            this.zzb.m22870b("RemoteException when sending create auth uri response.", e10, new Object[0]);
        }
    }

    public final void zza(zzafj zzafjVar) {
        try {
            this.zza.zza(zzafjVar);
        } catch (RemoteException e10) {
            this.zzb.m22870b("RemoteException when sending Play Integrity Producer project response.", e10, new Object[0]);
        }
    }

    public final void zza(zzafk zzafkVar) {
        try {
            this.zza.zza(zzafkVar);
        } catch (RemoteException e10) {
            this.zzb.m22870b("RemoteException when sending get recaptcha config response.", e10, new Object[0]);
        }
    }

    public final void zza(zzafn zzafnVar) {
        try {
            this.zza.zza(zzafnVar);
        } catch (RemoteException e10) {
            this.zzb.m22870b("RemoteException when sending token result.", e10, new Object[0]);
        }
    }

    public final void zza(zzafn zzafnVar, zzafc zzafcVar) {
        try {
            this.zza.zza(zzafnVar, zzafcVar);
        } catch (RemoteException e10) {
            this.zzb.m22870b("RemoteException when sending get token and account info user response", e10, new Object[0]);
        }
    }

    public final void zza(zzafw zzafwVar) {
        try {
            this.zza.zza(zzafwVar);
        } catch (RemoteException e10) {
            this.zzb.m22870b("RemoteException when sending password reset response.", e10, new Object[0]);
        }
    }

    public final void zza(zzagb zzagbVar) {
        try {
            this.zza.zza(zzagbVar);
        } catch (RemoteException e10) {
            this.zzb.m22870b("RemoteException when sending revoke token response.", e10, new Object[0]);
        }
    }

    public final void zza(zzagj zzagjVar) {
        try {
            this.zza.zza(zzagjVar);
        } catch (RemoteException e10) {
            this.zzb.m22870b("RemoteException when sending start mfa enrollment response.", e10, new Object[0]);
        }
    }

    public final void zza(zzyh zzyhVar) {
        try {
            this.zza.zza(zzyhVar);
        } catch (RemoteException e10) {
            this.zzb.m22870b("RemoteException when sending failure result with credential", e10, new Object[0]);
        }
    }

    public final void zza(zzyk zzykVar) {
        try {
            this.zza.zza(zzykVar);
        } catch (RemoteException e10) {
            this.zzb.m22870b("RemoteException when sending failure result for mfa", e10, new Object[0]);
        }
    }

    public final void zza(C6104o0 c6104o0) {
        try {
            this.zza.zza(c6104o0);
        } catch (RemoteException e10) {
            this.zzb.m22870b("RemoteException when sending verification completed response.", e10, new Object[0]);
        }
    }

    public final void zza(String str) {
        try {
            this.zza.zza(str);
        } catch (RemoteException e10) {
            this.zzb.m22870b("RemoteException when sending auto retrieval timeout response.", e10, new Object[0]);
        }
    }

    public final void zzb() {
        try {
            this.zza.zzb();
        } catch (RemoteException e10) {
            this.zzb.m22870b("RemoteException when sending email verification response.", e10, new Object[0]);
        }
    }

    public void zzb(String str) {
        try {
            this.zza.zzb(str);
        } catch (RemoteException e10) {
            this.zzb.m22870b("RemoteException when sending send verification code response.", e10, new Object[0]);
        }
    }

    public final void zzc() {
        try {
            this.zza.zzc();
        } catch (RemoteException e10) {
            this.zzb.m22870b("RemoteException when setting FirebaseUI Version", e10, new Object[0]);
        }
    }

    public final void zzc(String str) {
        try {
            this.zza.zzc(str);
        } catch (RemoteException e10) {
            this.zzb.m22870b("RemoteException when sending set account info response.", e10, new Object[0]);
        }
    }
}
