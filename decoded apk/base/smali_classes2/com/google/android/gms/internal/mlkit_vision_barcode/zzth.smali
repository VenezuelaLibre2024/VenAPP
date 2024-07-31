.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzth;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zztf;Lcom/google/android/gms/internal/mlkit_vision_barcode/zztg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zztf;->zza(Lcom/google/android/gms/internal/mlkit_vision_barcode/zztf;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzth;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzth;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzth;

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzth;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    iget-object p1, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzth;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzth;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzth;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    return-object v0
.end method
