.class final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcf;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcf;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcf;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcf;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;->zzj()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Ljava/util/Map$Entry;

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcf;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;->zzd(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;Ljava/lang/Object;)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcf;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;

    iget-object v2, v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;->zzc:[Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    aget-object v0, v2, v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzay;->zza(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcf;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;->zzj()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcd;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcd;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 10

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcf;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;->zzj()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    check-cast p1, Ljava/util/Map$Entry;

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcf;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;->zzo()Z

    move-result v2

    if-eqz v2, :cond_1

    return v1

    :cond_1
    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;->zzc(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;)I

    move-result v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcf;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;->zzh(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;)Ljava/lang/Object;

    move-result-object v6

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcf;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;

    iget-object v7, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;->zza:[I

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;->zzb:[Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v9, p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;->zzc:[Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move v5, v0

    invoke-static/range {v3 .. v9}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcm;->zzb(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;[I[Ljava/lang/Object;[Ljava/lang/Object;)I

    move-result p1

    const/4 v2, -0x1

    if-ne p1, v2, :cond_2

    return v1

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcf;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;->zzn(II)V

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcf;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;->zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;)I

    move-result v0

    add-int/2addr v0, v2

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;->zzk(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcf;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;->zzl()V

    const/4 p1, 0x1

    return p1

    :cond_3
    return v1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcf;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcl;->size()I

    move-result v0

    return v0
.end method
