.class public final Lcom/google/android/gms/internal/ads/zzbtz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/z;


# instance fields
.field private final zza:Ljava/util/Date;

.field private final zzb:I

.field private final zzc:Ljava/util/Set;

.field private final zzd:Z

.field private final zze:Landroid/location/Location;

.field private final zzf:I

.field private final zzg:Lcom/google/android/gms/internal/ads/zzbjb;

.field private final zzh:Ljava/util/List;

.field private final zzi:Z

.field private final zzj:Ljava/util/Map;

.field private final zzk:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/Date;ILjava/util/Set;Landroid/location/Location;ZILcom/google/android/gms/internal/ads/zzbjb;Ljava/util/List;ZILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zza:Ljava/util/Date;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zzb:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zzc:Ljava/util/Set;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zze:Landroid/location/Location;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zzd:Z

    iput p6, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zzf:I

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zzg:Lcom/google/android/gms/internal/ads/zzbjb;

    iput-boolean p9, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zzi:Z

    iput-object p11, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zzk:Ljava/lang/String;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zzh:Ljava/util/List;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zzj:Ljava/util/Map;

    if-eqz p8, :cond_3

    invoke-interface {p8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const-string p3, "custom:"

    invoke-virtual {p2, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_2

    const-string p3, ":"

    const/4 p4, 0x3

    invoke-virtual {p2, p3, p4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p2

    array-length p3, p2

    if-ne p3, p4, :cond_0

    const/4 p3, 0x2

    aget-object p4, p2, p3

    const-string p5, "true"

    invoke-virtual {p5, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    const/4 p5, 0x1

    if-eqz p4, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zzj:Ljava/util/Map;

    aget-object p2, p2, p5

    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_1
    invoke-interface {p3, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    aget-object p3, p2, p3

    const-string p4, "false"

    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zzj:Ljava/util/Map;

    aget-object p2, p2, p5

    sget-object p4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_2
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zzh:Ljava/util/List;

    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-void
.end method


# virtual methods
.method public final getAdVolume()F
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/m3;->h()Lcom/google/android/gms/ads/internal/client/m3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/m3;->c()F

    move-result v0

    return v0
.end method

.method public final getBirthday()Ljava/util/Date;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zza:Ljava/util/Date;

    return-object v0
.end method

.method public final getGender()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zzb:I

    return v0
.end method

.method public final getKeywords()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zzc:Ljava/util/Set;

    return-object v0
.end method

.method public final getLocation()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zze:Landroid/location/Location;

    return-object v0
.end method

.method public final getNativeAdOptions()La9/e;
    .locals 4

    new-instance v0, La9/e$a;

    invoke-direct {v0}, La9/e$a;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zzg:Lcom/google/android/gms/internal/ads/zzbjb;

    if-nez v1, :cond_0

    :goto_0
    invoke-virtual {v0}, La9/e$a;->a()La9/e;

    move-result-object v0

    goto :goto_2

    :cond_0
    iget v2, v1, Lcom/google/android/gms/internal/ads/zzbjb;->zza:I

    const/4 v3, 0x2

    if-eq v2, v3, :cond_3

    const/4 v3, 0x3

    if-eq v2, v3, :cond_2

    const/4 v3, 0x4

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/zzbjb;->zzg:Z

    invoke-virtual {v0, v2}, La9/e$a;->e(Z)La9/e$a;

    iget v2, v1, Lcom/google/android/gms/internal/ads/zzbjb;->zzh:I

    invoke-virtual {v0, v2}, La9/e$a;->d(I)La9/e$a;

    :cond_2
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzbjb;->zzf:Lcom/google/android/gms/ads/internal/client/n4;

    if-eqz v2, :cond_3

    new-instance v3, Lx8/c0;

    invoke-direct {v3, v2}, Lx8/c0;-><init>(Lcom/google/android/gms/ads/internal/client/n4;)V

    invoke-virtual {v0, v3}, La9/e$a;->h(Lx8/c0;)La9/e$a;

    :cond_3
    iget v2, v1, Lcom/google/android/gms/internal/ads/zzbjb;->zze:I

    invoke-virtual {v0, v2}, La9/e$a;->b(I)La9/e$a;

    :goto_1
    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/zzbjb;->zzb:Z

    invoke-virtual {v0, v2}, La9/e$a;->g(Z)La9/e$a;

    iget v2, v1, Lcom/google/android/gms/internal/ads/zzbjb;->zzc:I

    invoke-virtual {v0, v2}, La9/e$a;->c(I)La9/e$a;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/ads/zzbjb;->zzd:Z

    invoke-virtual {v0, v1}, La9/e$a;->f(Z)La9/e$a;

    goto :goto_0

    :goto_2
    return-object v0
.end method

.method public final getNativeAdRequestOptions()Lcom/google/android/gms/ads/nativead/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zzg:Lcom/google/android/gms/internal/ads/zzbjb;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbjb;->zza(Lcom/google/android/gms/internal/ads/zzbjb;)Lcom/google/android/gms/ads/nativead/c;

    move-result-object v0

    return-object v0
.end method

.method public final isAdMuted()Z
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/m3;->h()Lcom/google/android/gms/ads/internal/client/m3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/m3;->w()Z

    move-result v0

    return v0
.end method

.method public final isDesignedForFamilies()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zzi:Z

    return v0
.end method

.method public final isTesting()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zzd:Z

    return v0
.end method

.method public final isUnifiedNativeAdRequested()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zzh:Ljava/util/List;

    const-string v1, "6"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final taggedForChildDirectedTreatment()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zzf:I

    return v0
.end method

.method public final zza()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zzj:Ljava/util/Map;

    return-object v0
.end method

.method public final zzb()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbtz;->zzh:Ljava/util/List;

    const-string v1, "3"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
