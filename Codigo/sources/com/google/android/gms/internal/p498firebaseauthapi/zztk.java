package com.google.android.gms.internal.p498firebaseauthapi;

/* loaded from: classes2.dex */
public enum zztk implements zzaje {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);

    private static final zzajh<zztk> zzf = new zzajh<zztk>() { // from class: com.google.android.gms.internal.firebase-auth-api.zztj
    };
    private final int zzh;

    zztk(int i10) {
        this.zzh = i10;
    }

    public static zztk zza(int i10) {
        if (i10 == 0) {
            return UNKNOWN_FORMAT;
        }
        if (i10 == 1) {
            return UNCOMPRESSED;
        }
        if (i10 == 2) {
            return COMPRESSED;
        }
        if (i10 != 3) {
            return null;
        }
        return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(zztk.class.getName());
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb2.append(" number=");
            sb2.append(zza());
        }
        sb2.append(" name=");
        sb2.append(name());
        sb2.append('>');
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaje
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzh;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
