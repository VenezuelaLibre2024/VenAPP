.class public final Lcom/google/android/gms/internal/ads/zzdmj;
.super Lcom/google/android/gms/internal/ads/zzbji;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzdna;

.field private zzb:Lcom/google/android/gms/dynamic/b;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzdna;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbji;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdmj;->zza:Lcom/google/android/gms/internal/ads/zzdna;

    return-void
.end method

.method private static zzb(Lcom/google/android/gms/dynamic/b;)F
    .locals 2

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/drawable/Drawable;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p0

    int-to-float p0, p0

    div-float/2addr v0, p0

    return v0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final zze()F
    .locals 4

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgc;->zzgm:Lcom/google/android/gms/internal/ads/zzbfu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmj;->zza:Lcom/google/android/gms/internal/ads/zzdna;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdna;->zzb()F

    move-result v0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmj;->zza:Lcom/google/android/gms/internal/ads/zzdna;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdna;->zzb()F

    move-result v0

    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmj;->zza:Lcom/google/android/gms/internal/ads/zzdna;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdna;->zzj()Lcom/google/android/gms/ads/internal/client/s2;

    move-result-object v0

    if-eqz v0, :cond_2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmj;->zza:Lcom/google/android/gms/internal/ads/zzdna;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdna;->zzj()Lcom/google/android/gms/ads/internal/client/s2;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/s2;->zze()F

    move-result v1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v2, "Remote exception getting video controller aspect ratio."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmj;->zzb:Lcom/google/android/gms/dynamic/b;

    if-eqz v0, :cond_3

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdmj;->zzb(Lcom/google/android/gms/dynamic/b;)F

    move-result v1

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmj;->zza:Lcom/google/android/gms/internal/ads/zzdna;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdna;->zzm()Lcom/google/android/gms/internal/ads/zzbjm;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbjm;->zzd()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_5

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbjm;->zzc()I

    move-result v2

    if-eq v2, v3, :cond_5

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbjm;->zzd()I

    move-result v2

    int-to-float v2, v2

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbjm;->zzc()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    goto :goto_0

    :cond_5
    move v2, v1

    :goto_0
    cmpl-float v1, v2, v1

    if-nez v1, :cond_6

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbjm;->zzf()Lcom/google/android/gms/dynamic/b;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdmj;->zzb(Lcom/google/android/gms/dynamic/b;)F

    move-result v0

    return v0

    :cond_6
    move v1, v2

    :goto_1
    return v1
.end method

.method public final zzf()F
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgc;->zzgn:Lcom/google/android/gms/internal/ads/zzbfu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmj;->zza:Lcom/google/android/gms/internal/ads/zzdna;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdna;->zzj()Lcom/google/android/gms/ads/internal/client/s2;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmj;->zza:Lcom/google/android/gms/internal/ads/zzdna;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdna;->zzj()Lcom/google/android/gms/ads/internal/client/s2;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/s2;->zzf()F

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzg()F
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgc;->zzgn:Lcom/google/android/gms/internal/ads/zzbfu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmj;->zza:Lcom/google/android/gms/internal/ads/zzdna;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdna;->zzj()Lcom/google/android/gms/ads/internal/client/s2;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmj;->zza:Lcom/google/android/gms/internal/ads/zzdna;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdna;->zzj()Lcom/google/android/gms/ads/internal/client/s2;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/s2;->zzg()F

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzh()Lcom/google/android/gms/ads/internal/client/s2;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgc;->zzgn:Lcom/google/android/gms/internal/ads/zzbfu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmj;->zza:Lcom/google/android/gms/internal/ads/zzdna;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdna;->zzj()Lcom/google/android/gms/ads/internal/client/s2;

    move-result-object v0

    return-object v0
.end method

.method public final zzi()Lcom/google/android/gms/dynamic/b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmj;->zzb:Lcom/google/android/gms/dynamic/b;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmj;->zza:Lcom/google/android/gms/internal/ads/zzdna;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdna;->zzm()Lcom/google/android/gms/internal/ads/zzbjm;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbjm;->zzf()Lcom/google/android/gms/dynamic/b;

    move-result-object v0

    return-object v0
.end method

.method public final zzj(Lcom/google/android/gms/dynamic/b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdmj;->zzb:Lcom/google/android/gms/dynamic/b;

    return-void
.end method

.method public final zzk()Z
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgc;->zzgn:Lcom/google/android/gms/internal/ads/zzbfu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmj;->zza:Lcom/google/android/gms/internal/ads/zzdna;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdna;->zzaf()Z

    move-result v0

    return v0
.end method

.method public final zzl()Z
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgc;->zzgn:Lcom/google/android/gms/internal/ads/zzbfu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmj;->zza:Lcom/google/android/gms/internal/ads/zzdna;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdna;->zzj()Lcom/google/android/gms/ads/internal/client/s2;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method public final zzm(Lcom/google/android/gms/internal/ads/zzbku;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgc;->zzgn:Lcom/google/android/gms/internal/ads/zzbfu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmj;->zza:Lcom/google/android/gms/internal/ads/zzdna;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdna;->zzj()Lcom/google/android/gms/ads/internal/client/s2;

    move-result-object v0

    instance-of v0, v0, Lcom/google/android/gms/internal/ads/zzcki;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmj;->zza:Lcom/google/android/gms/internal/ads/zzdna;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdna;->zzj()Lcom/google/android/gms/ads/internal/client/s2;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzcki;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzcki;->zzv(Lcom/google/android/gms/internal/ads/zzbku;)V

    :cond_1
    :goto_0
    return-void
.end method
