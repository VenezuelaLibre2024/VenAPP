.class public final Lcom/google/android/gms/internal/mlkit_common/zzqk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static zza:Lcom/google/android/gms/internal/mlkit_common/zzqj;


# direct methods
.method public static declared-synchronized zza(Lcom/google/android/gms/internal/mlkit_common/zzpt;)Lcom/google/android/gms/internal/mlkit_common/zzpz;
    .locals 3

    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzqk;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzqk;->zza:Lcom/google/android/gms/internal/mlkit_common/zzqj;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_common/zzqj;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzqj;-><init>(Lcom/google/android/gms/internal/mlkit_common/zzqi;)V

    sput-object v1, Lcom/google/android/gms/internal/mlkit_common/zzqk;->zza:Lcom/google/android/gms/internal/mlkit_common/zzqj;

    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzqk;->zza:Lcom/google/android/gms/internal/mlkit_common/zzqj;

    invoke-virtual {v1, p0}, Lcom/google/mlkit/common/sdkinternal/e;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/mlkit_common/zzpz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_common/zzpz;
    .locals 1

    const-class p0, Lcom/google/android/gms/internal/mlkit_common/zzqk;

    monitor-enter p0

    :try_start_0
    const-string v0, "common"

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_common/zzpt;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_common/zzps;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_common/zzps;->zzd()Lcom/google/android/gms/internal/mlkit_common/zzpt;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_common/zzqk;->zza(Lcom/google/android/gms/internal/mlkit_common/zzpt;)Lcom/google/android/gms/internal/mlkit_common/zzpz;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
