.class public abstract Lcom/google/android/gms/internal/mlkit_common/zzqb;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zzh()Lcom/google/android/gms/internal/mlkit_common/zzqa;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zzpn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_common/zzpn;-><init>()V

    const-string v1, "NA"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_common/zzpn;->zzg(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_common/zzqa;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_common/zzqa;->zzf(Z)Lcom/google/android/gms/internal/mlkit_common/zzqa;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_common/zzqa;->zze(Z)Lcom/google/android/gms/internal/mlkit_common/zzqa;

    sget-object v2, Lcom/google/mlkit/common/sdkinternal/l;->UNKNOWN:Lcom/google/mlkit/common/sdkinternal/l;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/mlkit_common/zzqa;->zzd(Lcom/google/mlkit/common/sdkinternal/l;)Lcom/google/android/gms/internal/mlkit_common/zzqa;

    sget-object v2, Lcom/google/android/gms/internal/mlkit_common/zzlm;->zza:Lcom/google/android/gms/internal/mlkit_common/zzlm;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/mlkit_common/zzqa;->zzb(Lcom/google/android/gms/internal/mlkit_common/zzlm;)Lcom/google/android/gms/internal/mlkit_common/zzqa;

    sget-object v2, Lcom/google/android/gms/internal/mlkit_common/zzls;->zza:Lcom/google/android/gms/internal/mlkit_common/zzls;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/mlkit_common/zzqa;->zza(Lcom/google/android/gms/internal/mlkit_common/zzls;)Lcom/google/android/gms/internal/mlkit_common/zzqa;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_common/zzqa;->zzc(I)Lcom/google/android/gms/internal/mlkit_common/zzqa;

    return-object v0
.end method


# virtual methods
.method public abstract zza()I
.end method

.method public abstract zzb()Lcom/google/mlkit/common/sdkinternal/l;
.end method

.method public abstract zzc()Lcom/google/android/gms/internal/mlkit_common/zzlm;
.end method

.method public abstract zzd()Lcom/google/android/gms/internal/mlkit_common/zzls;
.end method

.method public abstract zze()Ljava/lang/String;
.end method

.method public abstract zzf()Z
.end method

.method public abstract zzg()Z
.end method
