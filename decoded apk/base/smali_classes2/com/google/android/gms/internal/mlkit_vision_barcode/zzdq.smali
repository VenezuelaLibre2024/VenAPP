.class final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdq;
.super Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcy;
.source "SourceFile"


# instance fields
.field private final transient zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcx;

.field private final transient zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcx;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcy;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdq;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcx;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdq;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdq;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcx;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcx;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdq;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;->zzj(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdy;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdq;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcx;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method final zza([Ljava/lang/Object;I)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdq;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcq;->zza([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final zzd()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdx;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdq;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcv;->zzj(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdy;

    move-result-object v0

    return-object v0
.end method
