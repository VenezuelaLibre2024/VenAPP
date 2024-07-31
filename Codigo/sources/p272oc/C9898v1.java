package p272oc;

import com.google.android.gms.internal.p498firebaseauthapi.zzafw;
import com.google.firebase.auth.C6048b;
import com.google.firebase.auth.InterfaceC6056d;

/* renamed from: oc.v1 */
/* loaded from: classes.dex */
public final class C9898v1 implements InterfaceC6056d {

    /* renamed from: a */
    private final int f24400a;

    /* renamed from: b */
    private final String f24401b;

    /* renamed from: c */
    private final String f24402c;

    /* renamed from: d */
    private final C6048b f24403d;

    public C9898v1(zzafw zzafwVar) {
        this.f24401b = zzafwVar.zzg() ? zzafwVar.zzc() : zzafwVar.zzb();
        this.f24402c = zzafwVar.zzb();
        C6048b c6048b = null;
        if (!zzafwVar.zzh()) {
            this.f24400a = 3;
            this.f24403d = null;
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
        this.f24400a = i10;
        if (i10 == 4 || i10 == 3) {
            this.f24403d = null;
            return;
        }
        if (zzafwVar.zzf()) {
            c6048b = new C9889s1(zzafwVar.zzb(), C9858i0.m29541a(zzafwVar.zza()));
        } else if (zzafwVar.zzg()) {
            c6048b = new C9883q1(zzafwVar.zzc(), zzafwVar.zzb());
        } else if (zzafwVar.zze()) {
            c6048b = new C9892t1(zzafwVar.zzb());
        }
        this.f24403d = c6048b;
    }

    @Override // com.google.firebase.auth.InterfaceC6056d
    /* renamed from: a */
    public final C6048b mo16480a() {
        return this.f24403d;
    }

    @Override // com.google.firebase.auth.InterfaceC6056d
    /* renamed from: b */
    public final int mo16481b() {
        return this.f24400a;
    }
}
