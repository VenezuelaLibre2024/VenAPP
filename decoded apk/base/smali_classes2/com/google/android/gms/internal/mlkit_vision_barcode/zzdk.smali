.class abstract Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdk;
.super Ljava/util/AbstractCollection;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdk;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdj;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdj;->zzs()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdk;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdj;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdj;->zzx(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdk;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdj;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdj;->zzy(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final size()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdk;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdj;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdj;->zzh()I

    move-result v0

    return v0
.end method

.method abstract zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdj;
.end method