package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import ea.a;
import ea.c;
import oc.o1;

/* loaded from: classes2.dex */
public final class zzagt extends a implements zzacp {
    public static final Parcelable.Creator<zzagt> CREATOR = new zzags();
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private boolean zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private boolean zzo;
    private String zzp;

    public zzagt() {
        this.zzi = true;
        this.zzj = true;
    }

    public zzagt(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.zza = "http://localhost";
        this.zzc = str;
        this.zzd = str2;
        this.zzh = str5;
        this.zzk = str6;
        this.zzn = str7;
        this.zzp = str8;
        this.zzi = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(this.zzd) && TextUtils.isEmpty(this.zzk)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        this.zze = s.f(str3);
        this.zzf = null;
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(this.zzc)) {
            sb2.append("id_token=");
            sb2.append(this.zzc);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            sb2.append("access_token=");
            sb2.append(this.zzd);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzf)) {
            sb2.append("identifier=");
            sb2.append(this.zzf);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            sb2.append("oauth_token_secret=");
            sb2.append(this.zzh);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzk)) {
            sb2.append("code=");
            sb2.append(this.zzk);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(str9)) {
            sb2.append("nonce=");
            sb2.append(str9);
            sb2.append("&");
        }
        sb2.append("providerId=");
        sb2.append(this.zze);
        this.zzg = sb2.toString();
        this.zzj = true;
    }

    public zzagt(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z10, boolean z11, String str9, String str10, String str11, String str12, boolean z12, String str13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = z10;
        this.zzj = z11;
        this.zzk = str9;
        this.zzl = str10;
        this.zzm = str11;
        this.zzn = str12;
        this.zzo = z12;
        this.zzp = str13;
    }

    public zzagt(o1 o1Var, String str) {
        s.j(o1Var);
        this.zzl = s.f(o1Var.d());
        this.zzm = s.f(str);
        this.zze = s.f(o1Var.c());
        this.zzi = true;
        this.zzg = "providerId=" + this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.G(parcel, 2, this.zza, false);
        c.G(parcel, 3, this.zzb, false);
        c.G(parcel, 4, this.zzc, false);
        c.G(parcel, 5, this.zzd, false);
        c.G(parcel, 6, this.zze, false);
        c.G(parcel, 7, this.zzf, false);
        c.G(parcel, 8, this.zzg, false);
        c.G(parcel, 9, this.zzh, false);
        c.g(parcel, 10, this.zzi);
        c.g(parcel, 11, this.zzj);
        c.G(parcel, 12, this.zzk, false);
        c.G(parcel, 13, this.zzl, false);
        c.G(parcel, 14, this.zzm, false);
        c.G(parcel, 15, this.zzn, false);
        c.g(parcel, 16, this.zzo);
        c.G(parcel, 17, this.zzp, false);
        c.b(parcel, a10);
    }

    public final zzagt zza(String str) {
        this.zzb = s.f(str);
        return this;
    }

    public final zzagt zza(boolean z10) {
        this.zzj = false;
        return this;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v10 java.lang.String, still in use, count: 2, list:
          (r1v10 java.lang.String) from 0x0058: IF  (r1v10 java.lang.String) != (null java.lang.String)  -> B:19:0x0052 A[HIDDEN]
          (r1v10 java.lang.String) from 0x0052: PHI (r1v12 java.lang.String) = (r1v10 java.lang.String) binds: [B:24:0x0058] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacp
    public final java.lang.String zza() {
        /*
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "autoCreate"
            boolean r2 = r3.zzj
            r0.put(r1, r2)
            java.lang.String r1 = "returnSecureToken"
            boolean r2 = r3.zzi
            r0.put(r1, r2)
            java.lang.String r1 = r3.zzb
            if (r1 == 0) goto L1c
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L1c:
            java.lang.String r1 = r3.zzg
            if (r1 == 0) goto L25
            java.lang.String r2 = "postBody"
            r0.put(r2, r1)
        L25:
            java.lang.String r1 = r3.zzn
            if (r1 == 0) goto L2e
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        L2e:
            java.lang.String r1 = r3.zzp
            if (r1 == 0) goto L37
            java.lang.String r2 = "pendingToken"
            r0.put(r2, r1)
        L37:
            java.lang.String r1 = r3.zzl
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "sessionId"
            java.lang.String r2 = r3.zzl
            r0.put(r1, r2)
        L46:
            java.lang.String r1 = r3.zzm
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = "requestUri"
            if (r1 != 0) goto L56
            java.lang.String r1 = r3.zzm
        L52:
            r0.put(r2, r1)
            goto L5b
        L56:
            java.lang.String r1 = r3.zza
            if (r1 == 0) goto L5b
            goto L52
        L5b:
            java.lang.String r1 = "returnIdpCredential"
            boolean r2 = r3.zzo
            r0.put(r1, r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzagt.zza():java.lang.String");
    }

    public final zzagt zzb(String str) {
        this.zzn = str;
        return this;
    }

    public final zzagt zzb(boolean z10) {
        this.zzo = true;
        return this;
    }

    public final zzagt zzc(boolean z10) {
        this.zzi = true;
        return this;
    }
}
