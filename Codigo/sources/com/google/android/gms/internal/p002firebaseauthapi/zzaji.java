package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzaji extends IOException {
    private zzakn zza;
    private boolean zzb;

    public zzaji(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    public zzaji(String str) {
        super(str);
        this.zza = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzajl zza() {
        return new zzajl("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaji zzb() {
        return new zzaji("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaji zzc() {
        return new zzaji("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaji zzd() {
        return new zzaji("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaji zze() {
        return new zzaji("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaji zzf() {
        return new zzaji("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaji zzg() {
        return new zzaji("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaji zzh() {
        return new zzaji("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaji zzi() {
        return new zzaji("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzaji zza(zzakn zzaknVar) {
        this.zza = zzaknVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj() {
        this.zzb = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzk() {
        return this.zzb;
    }
}
