package oc;

import com.google.android.gms.internal.p002firebaseauthapi.zzafw;

/* loaded from: classes.dex */
public final class v1 implements com.google.firebase.auth.d {

    /* renamed from: a, reason: collision with root package name */
    private final int f22467a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22468b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22469c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.auth.b f22470d;

    public v1(zzafw zzafwVar) {
        this.f22468b = zzafwVar.zzg() ? zzafwVar.zzc() : zzafwVar.zzb();
        this.f22469c = zzafwVar.zzb();
        com.google.firebase.auth.b bVar = null;
        if (!zzafwVar.zzh()) {
            this.f22467a = 3;
            this.f22470d = null;
            return;
        }
        String zzd = zzafwVar.zzd();
        zzd.hashCode();
        int i10 = 5;
        char c10 = 65535;
        switch (zzd.hashCode()) {
            case -1874510116:
                if (zzd.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1452371317:
                if (zzd.equals("PASSWORD_RESET")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1341836234:
                if (zzd.equals("VERIFY_EMAIL")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1099157829:
                if (zzd.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c10 = 3;
                    break;
                }
                break;
            case 870738373:
                if (zzd.equals("EMAIL_SIGNIN")) {
                    c10 = 4;
                    break;
                }
                break;
            case 970484929:
                if (zzd.equals("RECOVER_EMAIL")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                i10 = 6;
                break;
            case 1:
                i10 = 0;
                break;
            case 2:
                i10 = 1;
                break;
            case 3:
                break;
            case 4:
                i10 = 4;
                break;
            case 5:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        this.f22467a = i10;
        if (i10 == 4 || i10 == 3) {
            this.f22470d = null;
            return;
        }
        if (zzafwVar.zzf()) {
            bVar = new s1(zzafwVar.zzb(), i0.a(zzafwVar.zza()));
        } else if (zzafwVar.zzg()) {
            bVar = new q1(zzafwVar.zzc(), zzafwVar.zzb());
        } else if (zzafwVar.zze()) {
            bVar = new t1(zzafwVar.zzb());
        }
        this.f22470d = bVar;
    }

    @Override // com.google.firebase.auth.d
    public final com.google.firebase.auth.b a() {
        return this.f22470d;
    }

    @Override // com.google.firebase.auth.d
    public final int b() {
        return this.f22467a;
    }
}
