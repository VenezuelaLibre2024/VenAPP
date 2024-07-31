.class final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzg;
.super Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzeb;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzee;)V
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zza;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzeb;)V

    return-void
.end method


# virtual methods
.method final zza(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;
    .locals 1

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;

    move-result-object v0

    if-eq v0, p2, :cond_0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzg(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;)V

    :cond_0
    monitor-exit p1

    return-object v0

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method final zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;
    .locals 1

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzc(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    move-result-object v0

    if-eq v0, p2, :cond_0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzi(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;)V

    :cond_0
    monitor-exit p1

    return-object v0

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method final zzc(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;)V
    .locals 0

    iput-object p2, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;->next:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    return-void
.end method

.method final zzd(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;Ljava/lang/Thread;)V
    .locals 0

    iput-object p2, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;->thread:Ljava/lang/Thread;

    return-void
.end method

.method final zze(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;

    move-result-object v0

    if-ne v0, p2, :cond_0

    invoke-static {p1, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzg(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzd;)V

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method final zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzd(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p2, :cond_0

    invoke-static {p1, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzh(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Ljava/lang/Object;)V

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method final zzg(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzc(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;

    move-result-object v0

    if-ne v0, p2, :cond_0

    invoke-static {p1, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;->zzi(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzec$zzj;)V

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
