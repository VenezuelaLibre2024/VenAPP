package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzif;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class zzmq {
    private static final Logger zza = Logger.getLogger(zzmq.class.getName());
    private final ConcurrentMap<String, zza> zzb;
    private final ConcurrentMap<String, Boolean> zzc;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface zza {
        zzbs<?> zza();

        <P> zzbs<P> zza(Class<P> cls);

        Class<?> zzb();

        Set<Class<?>> zzc();
    }

    public zzmq() {
        this.zzb = new ConcurrentHashMap();
        this.zzc = new ConcurrentHashMap();
    }

    public zzmq(zzmq zzmqVar) {
        this.zzb = new ConcurrentHashMap(zzmqVar.zzb);
        this.zzc = new ConcurrentHashMap(zzmqVar.zzc);
    }

    private static <KeyProtoT extends zzakn> zza zza(zznb<KeyProtoT> zznbVar) {
        return new zzmt(zznbVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        r6.zzb.putIfAbsent(r0, r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void zza(com.google.android.gms.internal.firebase-auth-api.zzmq.zza r7, boolean r8, boolean r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.firebase-auth-api.zzbs r0 = r7.zza()     // Catch: java.lang.Throwable -> La8
            java.lang.String r0 = r0.zza()     // Catch: java.lang.Throwable -> La8
            if (r9 == 0) goto L36
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r1 = r6.zzc     // Catch: java.lang.Throwable -> La8
            boolean r1 = r1.containsKey(r0)     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto L36
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r1 = r6.zzc     // Catch: java.lang.Throwable -> La8
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> La8
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> La8
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto L22
            goto L36
        L22:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> La8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8
            java.lang.String r9 = "New keys are already disallowed for key type "
            r8.<init>(r9)     // Catch: java.lang.Throwable -> La8
            r8.append(r0)     // Catch: java.lang.Throwable -> La8
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> La8
            r7.<init>(r8)     // Catch: java.lang.Throwable -> La8
            throw r7     // Catch: java.lang.Throwable -> La8
        L36:
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.android.gms.internal.firebase-auth-api.zzmq$zza> r1 = r6.zzb     // Catch: java.lang.Throwable -> La8
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> La8
            com.google.android.gms.internal.firebase-auth-api.zzmq$zza r1 = (com.google.android.gms.internal.firebase-auth-api.zzmq.zza) r1     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto L90
            java.lang.Class r2 = r1.zzb()     // Catch: java.lang.Throwable -> La8
            java.lang.Class r3 = r7.zzb()     // Catch: java.lang.Throwable -> La8
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> La8
            if (r2 == 0) goto L4f
            goto L90
        L4f:
            java.util.logging.Logger r8 = com.google.android.gms.internal.p498firebaseauthapi.zzmq.zza     // Catch: java.lang.Throwable -> La8
            java.util.logging.Level r9 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "com.google.crypto.tink.internal.KeyManagerRegistry"
            java.lang.String r3 = "registerKeyManagerContainer"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = "Attempted overwrite of a registered key manager for key type "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> La8
            r4.append(r0)     // Catch: java.lang.Throwable -> La8
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> La8
            r8.logp(r9, r2, r3, r4)     // Catch: java.lang.Throwable -> La8
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> La8
            java.lang.String r9 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> La8
            r3 = 0
            r2[r3] = r0     // Catch: java.lang.Throwable -> La8
            java.lang.Class r0 = r1.zzb()     // Catch: java.lang.Throwable -> La8
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> La8
            r1 = 1
            r2[r1] = r0     // Catch: java.lang.Throwable -> La8
            java.lang.Class r7 = r7.zzb()     // Catch: java.lang.Throwable -> La8
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> La8
            r0 = 2
            r2[r0] = r7     // Catch: java.lang.Throwable -> La8
            java.lang.String r7 = java.lang.String.format(r9, r2)     // Catch: java.lang.Throwable -> La8
            r8.<init>(r7)     // Catch: java.lang.Throwable -> La8
            throw r8     // Catch: java.lang.Throwable -> La8
        L90:
            if (r8 != 0) goto L98
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.android.gms.internal.firebase-auth-api.zzmq$zza> r8 = r6.zzb     // Catch: java.lang.Throwable -> La8
            r8.putIfAbsent(r0, r7)     // Catch: java.lang.Throwable -> La8
            goto L9d
        L98:
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.android.gms.internal.firebase-auth-api.zzmq$zza> r8 = r6.zzb     // Catch: java.lang.Throwable -> La8
            r8.put(r0, r7)     // Catch: java.lang.Throwable -> La8
        L9d:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r7 = r6.zzc     // Catch: java.lang.Throwable -> La8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> La8
            r7.put(r0, r8)     // Catch: java.lang.Throwable -> La8
            monitor-exit(r6)
            return
        La8:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p498firebaseauthapi.zzmq.zza(com.google.android.gms.internal.firebase-auth-api.zzmq$zza, boolean, boolean):void");
    }

    private final synchronized zza zzc(String str) {
        if (!this.zzb.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.zzb.get(str);
    }

    public final zzbs<?> zza(String str) {
        return zzc(str).zza();
    }

    public final <P> zzbs<P> zza(String str, Class<P> cls) {
        zza zzc = zzc(str);
        if (zzc.zzc().contains(cls)) {
            return zzc.zza(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzc.zzb());
        Set<Class<?>> zzc2 = zzc.zzc();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Class<?> cls2 : zzc2) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z10 = false;
        }
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb2.toString());
    }

    public final synchronized <KeyProtoT extends zzakn> void zza(zznb<KeyProtoT> zznbVar, boolean z10) {
        if (!zznbVar.zzb().zza()) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zznbVar.getClass()) + " as it is not FIPS compatible.");
        }
        zza(zza(zznbVar), false, true);
    }

    public final synchronized <KeyProtoT extends zzakn, PublicKeyProtoT extends zzakn> void zza(zzop<KeyProtoT, PublicKeyProtoT> zzopVar, zznb<PublicKeyProtoT> zznbVar, boolean z10) {
        zzif.zza zzb = zzopVar.zzb();
        zzif.zza zzb2 = zznbVar.zzb();
        if (!zzb.zza()) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzopVar.getClass()) + " as it is not FIPS compatible.");
        }
        if (!zzb2.zza()) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zznbVar.getClass()) + " as it is not FIPS compatible.");
        }
        zza((zza) new zzms(zzopVar, zznbVar), true, true);
        zza(zza(zznbVar), false, false);
    }

    public final boolean zzb(String str) {
        return this.zzc.get(str).booleanValue();
    }
}
