.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;

.field private final zzb:Ljava/lang/Boolean;

.field private final zzc:Ljava/lang/Boolean;

.field private final zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzos;

.field private final zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzth;

.field private final zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

.field private final zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfu;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zzi(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zzb:Ljava/lang/Boolean;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zzk(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zzc:Ljava/lang/Boolean;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzos;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zzj(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzth;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzth;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zza(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;->zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;

    iget-object v3, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    invoke-static {v1, v1}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zzc:Ljava/lang/Boolean;

    iget-object v4, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zzc:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v1, v1}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzth;

    iget-object v3, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzth;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    iget-object v3, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    invoke-static {v1, v3}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    iget-object p1, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    invoke-static {v1, p1}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 4

    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zzc:Ljava/lang/Boolean;

    aput-object v3, v0, v1

    const/4 v1, 0x3

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzth;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;
        zza = 0x6
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;
        zza = 0x7
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    return-object v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpj;

    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzth;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;
        zza = 0x5
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzth;

    return-object v0
.end method

.method public final zze()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;
        zza = 0x3
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zzc:Ljava/lang/Boolean;

    return-object v0
.end method
