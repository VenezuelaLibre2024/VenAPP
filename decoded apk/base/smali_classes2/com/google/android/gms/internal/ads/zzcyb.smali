.class public final Lcom/google/android/gms/internal/ads/zzcyb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzdcl;
.implements Lcom/google/android/gms/ads/internal/client/a;
.implements Lcom/google/android/gms/internal/ads/zzdds;
.implements Lcom/google/android/gms/internal/ads/zzdbr;
.implements Lcom/google/android/gms/internal/ads/zzdax;
.implements Lcom/google/android/gms/internal/ads/zzdge;


# instance fields
.field private final zza:Lla/f;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzcde;


# direct methods
.method public constructor <init>(Lla/f;Lcom/google/android/gms/internal/ads/zzcde;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcyb;->zza:Lla/f;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcyb;->zzb:Lcom/google/android/gms/internal/ads/zzcde;

    return-void
.end method


# virtual methods
.method public final onAdClicked()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcyb;->zzb:Lcom/google/android/gms/internal/ads/zzcde;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcde;->zzd()V

    return-void
.end method

.method public final zza()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcyb;->zzb:Lcom/google/android/gms/internal/ads/zzcde;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcde;->zze()V

    return-void
.end method

.method public final zzb()V
    .locals 0

    return-void
.end method

.method public final zzbB(Lcom/google/android/gms/internal/ads/zzbzu;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final zzbw(Lcom/google/android/gms/internal/ads/zzbze;)V
    .locals 0

    return-void
.end method

.method public final zzbx(Lcom/google/android/gms/internal/ads/zzfgy;)V
    .locals 3

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcyb;->zza:Lla/f;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcyb;->zzb:Lcom/google/android/gms/internal/ads/zzcde;

    invoke-interface {p1}, Lla/f;->b()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzcde;->zzk(J)V

    return-void
.end method

.method public final zzc()V
    .locals 0

    return-void
.end method

.method public final zze()V
    .locals 0

    return-void
.end method

.method public final zzf()V
    .locals 0

    return-void
.end method

.method public final zzg()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcyb;->zzb:Lcom/google/android/gms/internal/ads/zzcde;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcde;->zzc()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzh()V
    .locals 0

    return-void
.end method

.method public final zzi(Lcom/google/android/gms/internal/ads/zzbck;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcyb;->zzb:Lcom/google/android/gms/internal/ads/zzcde;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcde;->zzi()V

    return-void
.end method

.method public final zzj(Lcom/google/android/gms/internal/ads/zzbck;)V
    .locals 0

    return-void
.end method

.method public final zzk(Lcom/google/android/gms/ads/internal/client/u4;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcyb;->zzb:Lcom/google/android/gms/internal/ads/zzcde;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzcde;->zzj(Lcom/google/android/gms/ads/internal/client/u4;)V

    return-void
.end method

.method public final zzl(Z)V
    .locals 0

    return-void
.end method

.method public final zzm(Lcom/google/android/gms/internal/ads/zzbck;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcyb;->zzb:Lcom/google/android/gms/internal/ads/zzcde;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcde;->zzg()V

    return-void
.end method

.method public final zzn(Z)V
    .locals 0

    return-void
.end method

.method public final zzq()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcyb;->zzb:Lcom/google/android/gms/internal/ads/zzcde;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcde;->zzf()V

    return-void
.end method

.method public final zzr()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcyb;->zzb:Lcom/google/android/gms/internal/ads/zzcde;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzcde;->zzh(Z)V

    return-void
.end method
