.class final Lcom/google/android/gms/internal/mlkit_common/zzaq;
.super Lcom/google/android/gms/internal/mlkit_common/zzar;
.source "SourceFile"


# instance fields
.field final transient zza:I

.field final transient zzb:I

.field final synthetic zzc:Lcom/google/android/gms/internal/mlkit_common/zzar;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/mlkit_common/zzar;II)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzc:Lcom/google/android/gms/internal/mlkit_common/zzar;

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_common/zzar;-><init>()V

    iput p2, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zza:I

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzb:I

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzb:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/mlkit_common/zzaf;->zza(IILjava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzc:Lcom/google/android/gms/internal/mlkit_common/zzar;

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zza:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzb:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/mlkit_common/zzar;->zzf(II)Lcom/google/android/gms/internal/mlkit_common/zzar;

    move-result-object p1

    return-object p1
.end method

.method final zzb()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzc:Lcom/google/android/gms/internal/mlkit_common/zzar;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_common/zzan;->zzc()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zza:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzb:I

    add-int/2addr v0, v1

    return v0
.end method

.method final zzc()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzc:Lcom/google/android/gms/internal/mlkit_common/zzar;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_common/zzan;->zzc()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zza:I

    add-int/2addr v0, v1

    return v0
.end method

.method final zze()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzc:Lcom/google/android/gms/internal/mlkit_common/zzar;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_common/zzan;->zze()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final zzf(II)Lcom/google/android/gms/internal/mlkit_common/zzar;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzb:I

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/mlkit_common/zzaf;->zzd(III)V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zzc:Lcom/google/android/gms/internal/mlkit_common/zzar;

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzaq;->zza:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/mlkit_common/zzar;->zzf(II)Lcom/google/android/gms/internal/mlkit_common/zzar;

    move-result-object p1

    return-object p1
.end method