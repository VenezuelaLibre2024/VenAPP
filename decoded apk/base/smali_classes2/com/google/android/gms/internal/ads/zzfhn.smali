.class public final Lcom/google/android/gms/internal/ads/zzfhn;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static zza(Landroid/content/Context;Ljava/util/List;)Lcom/google/android/gms/ads/internal/client/z4;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzfgn;

    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/zzfgn;->zzc:Z

    if-eqz v2, :cond_0

    sget-object v1, Lx8/i;->p:Lx8/i;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v2, Lx8/i;

    iget v3, v1, Lcom/google/android/gms/internal/ads/zzfgn;->zza:I

    iget v1, v1, Lcom/google/android/gms/internal/ads/zzfgn;->zzb:I

    invoke-direct {v2, v3, v1}, Lx8/i;-><init>(II)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lx8/i;

    invoke-interface {v0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lx8/i;

    new-instance v0, Lcom/google/android/gms/ads/internal/client/z4;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/ads/internal/client/z4;-><init>(Landroid/content/Context;[Lx8/i;)V

    return-object v0
.end method

.method public static zzb(Lcom/google/android/gms/ads/internal/client/z4;)Lcom/google/android/gms/internal/ads/zzfgn;
    .locals 3

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/client/z4;->t:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance p0, Lcom/google/android/gms/internal/ads/zzfgn;

    const/4 v0, -0x3

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzfgn;-><init>(IIZ)V

    return-object p0

    :cond_0
    iget v0, p0, Lcom/google/android/gms/ads/internal/client/z4;->e:I

    iget p0, p0, Lcom/google/android/gms/ads/internal/client/z4;->b:I

    new-instance v2, Lcom/google/android/gms/internal/ads/zzfgn;

    invoke-direct {v2, v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzfgn;-><init>(IIZ)V

    return-object v2
.end method
