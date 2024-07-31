package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5276s;
import com.google.firebase.auth.AbstractC6072h;
import com.google.firebase.auth.C6104o0;
import p272oc.C9881q;
import p272oc.InterfaceC9899w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzacz implements zzace {
    final /* synthetic */ zzacx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacz(zzacx zzacxVar) {
        this.zza = zzacxVar;
    }

    private final void zza(Status status, AbstractC6072h abstractC6072h, String str, String str2) {
        zzacx.zza(this.zza, status);
        zzacx zzacxVar = this.zza;
        zzacxVar.zzp = abstractC6072h;
        zzacxVar.zzq = str;
        zzacxVar.zzr = str2;
        InterfaceC9899w interfaceC9899w = zzacxVar.zzf;
        if (interfaceC9899w != null) {
            interfaceC9899w.zza(status);
        }
        this.zza.zza(status);
    }

    private final void zza(zzadf zzadfVar) {
        this.zza.zzi.execute(new zzadc(this, zzadfVar));
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzace
    public final void zza() {
        int i10 = this.zza.zza;
        C5276s.m13329o(i10 == 5, "Unexpected response type " + i10);
        zzacx.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzace
    public final void zza(Status status) {
        String m12970w1 = status.m12970w1();
        if (m12970w1 != null) {
            if (m12970w1.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (m12970w1.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (m12970w1.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (m12970w1.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (m12970w1.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (m12970w1.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (m12970w1.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (m12970w1.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (m12970w1.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (m12970w1.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        zzacx zzacxVar = this.zza;
        if (zzacxVar.zza != 8) {
            zzacx.zza(zzacxVar, status);
            this.zza.zza(status);
        } else {
            zzacxVar.zzz = true;
            this.zza.zzx = false;
            zza(new zzadd(this, status));
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzace
    public final void zza(Status status, C6104o0 c6104o0) {
        int i10 = this.zza.zza;
        C5276s.m13329o(i10 == 2, "Unexpected response type " + i10);
        zza(status, c6104o0, null, null);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzace
    public final void zza(zzaen zzaenVar) {
        int i10 = this.zza.zza;
        C5276s.m13329o(i10 == 3, "Unexpected response type " + i10);
        zzacx zzacxVar = this.zza;
        zzacxVar.zzl = zzaenVar;
        zzacx.zza(zzacxVar);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzace
    public final void zza(zzafj zzafjVar) {
        zzacx zzacxVar = this.zza;
        zzacxVar.zzu = zzafjVar;
        zzacx.zza(zzacxVar);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzace
    public final void zza(zzafk zzafkVar) {
        zzacx zzacxVar = this.zza;
        zzacxVar.zzt = zzafkVar;
        zzacx.zza(zzacxVar);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzace
    public final void zza(zzafn zzafnVar) {
        int i10 = this.zza.zza;
        C5276s.m13329o(i10 == 1, "Unexpected response type: " + i10);
        zzacx zzacxVar = this.zza;
        zzacxVar.zzj = zzafnVar;
        zzacx.zza(zzacxVar);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzace
    public final void zza(zzafn zzafnVar, zzafc zzafcVar) {
        int i10 = this.zza.zza;
        C5276s.m13329o(i10 == 2, "Unexpected response type: " + i10);
        zzacx zzacxVar = this.zza;
        zzacxVar.zzj = zzafnVar;
        zzacxVar.zzk = zzafcVar;
        zzacx.zza(zzacxVar);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzace
    public final void zza(zzafw zzafwVar) {
        int i10 = this.zza.zza;
        C5276s.m13329o(i10 == 4, "Unexpected response type " + i10);
        zzacx zzacxVar = this.zza;
        zzacxVar.zzm = zzafwVar;
        zzacx.zza(zzacxVar);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzace
    public final void zza(zzagb zzagbVar) {
        zzacx zzacxVar = this.zza;
        zzacxVar.zzw = zzagbVar;
        zzacx.zza(zzacxVar);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzace
    public final void zza(zzagj zzagjVar) {
        zzacx zzacxVar = this.zza;
        zzacxVar.zzv = zzagjVar;
        zzacx.zza(zzacxVar);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzace
    public final void zza(zzyh zzyhVar) {
        zza(zzyhVar.zza(), zzyhVar.zzb(), zzyhVar.zzc(), zzyhVar.zzd());
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzace
    public final void zza(zzyk zzykVar) {
        zzacx zzacxVar = this.zza;
        zzacxVar.zzs = zzykVar;
        zzacxVar.zza(C9881q.m29583a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzace
    public final void zza(C6104o0 c6104o0) {
        int i10 = this.zza.zza;
        C5276s.m13329o(i10 == 8, "Unexpected response type " + i10);
        this.zza.zzz = true;
        this.zza.zzx = true;
        zza(new zzadb(this, c6104o0));
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzace
    public final void zza(String str) {
        int i10 = this.zza.zza;
        C5276s.m13329o(i10 == 8, "Unexpected response type " + i10);
        zzacx zzacxVar = this.zza;
        zzacxVar.zzo = str;
        zzacxVar.zzz = true;
        this.zza.zzx = true;
        zza(new zzada(this, str));
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzace
    public final void zzb() {
        int i10 = this.zza.zza;
        C5276s.m13329o(i10 == 6, "Unexpected response type " + i10);
        zzacx.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzace
    public final void zzb(String str) {
        int i10 = this.zza.zza;
        C5276s.m13329o(i10 == 8, "Unexpected response type " + i10);
        this.zza.zzo = str;
        zza(new zzacy(this, str));
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzace
    public final void zzc() {
        int i10 = this.zza.zza;
        C5276s.m13329o(i10 == 9, "Unexpected response type " + i10);
        zzacx.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzace
    public final void zzc(String str) {
        int i10 = this.zza.zza;
        C5276s.m13329o(i10 == 7, "Unexpected response type " + i10);
        zzacx zzacxVar = this.zza;
        zzacxVar.zzn = str;
        zzacx.zza(zzacxVar);
    }
}
