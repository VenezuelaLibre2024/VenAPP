.class final Lcom/google/android/gms/internal/ads/zzelm;
.super Lcom/google/android/gms/internal/ads/zzbul;
.source "SourceFile"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzeln;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzeiq;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzeln;Lcom/google/android/gms/internal/ads/zzeiq;Lcom/google/android/gms/internal/ads/zzell;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzelm;->zza:Lcom/google/android/gms/internal/ads/zzeln;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbul;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzelm;->zzb:Lcom/google/android/gms/internal/ads/zzeiq;

    return-void
.end method


# virtual methods
.method public final zze(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzelm;->zzb:Lcom/google/android/gms/internal/ads/zzeiq;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzeiq;->zzc:Lcom/google/android/gms/internal/ads/zzdch;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzekj;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzekj;->zzi(ILjava/lang/String;)V

    return-void
.end method

.method public final zzf(Lcom/google/android/gms/ads/internal/client/c3;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzelm;->zzb:Lcom/google/android/gms/internal/ads/zzeiq;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzeiq;->zzc:Lcom/google/android/gms/internal/ads/zzdch;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzekj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzekj;->zzh(Lcom/google/android/gms/ads/internal/client/c3;)V

    return-void
.end method

.method public final zzg(Lcom/google/android/gms/internal/ads/zzbtk;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzelm;->zza:Lcom/google/android/gms/internal/ads/zzeln;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzeln;->zzc(Lcom/google/android/gms/internal/ads/zzeln;Lcom/google/android/gms/internal/ads/zzbtk;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzelm;->zzb:Lcom/google/android/gms/internal/ads/zzeiq;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzeiq;->zzc:Lcom/google/android/gms/internal/ads/zzdch;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzekj;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzekj;->zzo()V

    return-void
.end method
