.class public final Lcom/google/android/gms/internal/ads/zzcla;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final zza:I

.field public final zzb:I

.field private final zzc:I


# direct methods
.method private constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzcla;->zzc:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzcla;->zzb:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzcla;->zza:I

    return-void
.end method

.method public static zza()Lcom/google/android/gms/internal/ads/zzcla;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcla;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, Lcom/google/android/gms/internal/ads/zzcla;-><init>(III)V

    return-object v0
.end method

.method public static zzb(II)Lcom/google/android/gms/internal/ads/zzcla;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcla;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzcla;-><init>(III)V

    return-object v0
.end method

.method public static zzc(Lcom/google/android/gms/ads/internal/client/z4;)Lcom/google/android/gms/internal/ads/zzcla;
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/client/z4;->d:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance p0, Lcom/google/android/gms/internal/ads/zzcla;

    const/4 v0, 0x3

    invoke-direct {p0, v0, v1, v1}, Lcom/google/android/gms/internal/ads/zzcla;-><init>(III)V

    return-object p0

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/client/z4;->t:Z

    if-eqz v0, :cond_1

    new-instance p0, Lcom/google/android/gms/internal/ads/zzcla;

    const/4 v0, 0x2

    invoke-direct {p0, v0, v1, v1}, Lcom/google/android/gms/internal/ads/zzcla;-><init>(III)V

    return-object p0

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/client/z4;->s:Z

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzcla;->zza()Lcom/google/android/gms/internal/ads/zzcla;

    move-result-object p0

    return-object p0

    :cond_2
    iget v0, p0, Lcom/google/android/gms/ads/internal/client/z4;->f:I

    iget p0, p0, Lcom/google/android/gms/ads/internal/client/z4;->c:I

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzcla;->zzb(II)Lcom/google/android/gms/internal/ads/zzcla;

    move-result-object p0

    return-object p0
.end method

.method public static zzd()Lcom/google/android/gms/internal/ads/zzcla;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcla;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzcla;-><init>(III)V

    return-object v0
.end method

.method public static zze()Lcom/google/android/gms/internal/ads/zzcla;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcla;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzcla;-><init>(III)V

    return-object v0
.end method


# virtual methods
.method public final zzf()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzcla;->zzc:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzg()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzcla;->zzc:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzh()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzcla;->zzc:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzi()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzcla;->zzc:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzj()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzcla;->zzc:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
