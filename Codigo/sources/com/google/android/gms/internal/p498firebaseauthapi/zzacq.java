package com.google.android.gms.internal.p498firebaseauthapi;

import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public class zzacq {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzacq";

    private zzacq() {
    }

    public static Object zza(String str, Type type) {
        if (type == String.class) {
            try {
                zzael zzaelVar = (zzael) new zzael().zza(str);
                if (zzaelVar.zzb()) {
                    return zzaelVar.zza();
                }
                throw new zzaaf("No error message: " + str);
            } catch (Exception e10) {
                throw new zzaaf("Json conversion failed! " + e10.getMessage(), e10);
            }
        }
        if (type == Void.class) {
            return null;
        }
        try {
            try {
                return ((zzacs) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0])).zza(str);
            } catch (Exception e11) {
                throw new zzaaf("Json conversion failed! " + e11.getMessage(), e11);
            }
        } catch (Exception e12) {
            throw new zzaaf("Instantiation of JsonResponse failed! " + String.valueOf(type), e12);
        }
    }
}
