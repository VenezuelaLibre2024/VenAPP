.class final Lcom/google/android/gms/internal/mlkit_common/zzpp;
.super Lcom/google/android/gms/internal/mlkit_common/zzqb;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/mlkit_common/zzlm;

.field private final zzb:Ljava/lang/String;

.field private final zzc:Z

.field private final zzd:Z

.field private final zze:Lcom/google/mlkit/common/sdkinternal/l;

.field private final zzf:Lcom/google/android/gms/internal/mlkit_common/zzls;

.field private final zzg:I


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_common/zzlm;Ljava/lang/String;ZZLcom/google/mlkit/common/sdkinternal/l;Lcom/google/android/gms/internal/mlkit_common/zzls;ILcom/google/android/gms/internal/mlkit_common/zzpo;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_common/zzqb;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zza:Lcom/google/android/gms/internal/mlkit_common/zzlm;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzb:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzc:Z

    iput-boolean p4, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzd:Z

    iput-object p5, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zze:Lcom/google/mlkit/common/sdkinternal/l;

    iput-object p6, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzf:Lcom/google/android/gms/internal/mlkit_common/zzls;

    iput p7, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzg:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/mlkit_common/zzqb;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lcom/google/android/gms/internal/mlkit_common/zzqb;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zza:Lcom/google/android/gms/internal/mlkit_common/zzlm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_common/zzqb;->zzc()Lcom/google/android/gms/internal/mlkit_common/zzlm;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzb:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_common/zzqb;->zze()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzc:Z

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_common/zzqb;->zzg()Z

    move-result v3

    if-ne v1, v3, :cond_1

    iget-boolean v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzd:Z

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_common/zzqb;->zzf()Z

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zze:Lcom/google/mlkit/common/sdkinternal/l;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_common/zzqb;->zzb()Lcom/google/mlkit/common/sdkinternal/l;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzf:Lcom/google/android/gms/internal/mlkit_common/zzls;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_common/zzqb;->zzd()Lcom/google/android/gms/internal/mlkit_common/zzls;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzg:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_common/zzqb;->zza()I

    move-result p1

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final hashCode()I
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zza:Lcom/google/android/gms/internal/mlkit_common/zzlm;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzb:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    mul-int/2addr v0, v1

    xor-int/2addr v0, v2

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzc:Z

    const/16 v3, 0x4d5

    const/16 v4, 0x4cf

    const/4 v5, 0x1

    if-eq v5, v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    iget-boolean v6, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzd:Z

    if-eq v5, v6, :cond_1

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    iget-object v4, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zze:Lcom/google/mlkit/common/sdkinternal/l;

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    mul-int/2addr v0, v1

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    xor-int/2addr v0, v3

    mul-int/2addr v0, v1

    xor-int/2addr v0, v4

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzf:Lcom/google/android/gms/internal/mlkit_common/zzls;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    mul-int/2addr v0, v1

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzg:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zza:Lcom/google/android/gms/internal/mlkit_common/zzlm;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzb:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzc:Z

    iget-boolean v3, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzd:Z

    iget-object v4, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zze:Lcom/google/mlkit/common/sdkinternal/l;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzf:Lcom/google/android/gms/internal/mlkit_common/zzls;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    iget v6, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzg:I

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "RemoteModelLoggingOptions{errorCode="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", tfliteSchemaVersion="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", shouldLogRoughDownloadTime="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", shouldLogExactDownloadTime="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", modelType="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", downloadStatus="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", failureStatusCode="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "}"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzg:I

    return v0
.end method

.method public final zzb()Lcom/google/mlkit/common/sdkinternal/l;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zze:Lcom/google/mlkit/common/sdkinternal/l;

    return-object v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/mlkit_common/zzlm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zza:Lcom/google/android/gms/internal/mlkit_common/zzlm;

    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/mlkit_common/zzls;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzf:Lcom/google/android/gms/internal/mlkit_common/zzls;

    return-object v0
.end method

.method public final zze()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzb:Ljava/lang/String;

    return-object v0
.end method

.method public final zzf()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzd:Z

    return v0
.end method

.method public final zzg()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzpp;->zzc:Z

    return v0
.end method
