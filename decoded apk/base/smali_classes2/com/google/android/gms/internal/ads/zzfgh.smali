.class final Lcom/google/android/gms/internal/ads/zzfgh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzeqt;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzfgj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzfgj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfgh;->zza:Lcom/google/android/gms/internal/ads/zzfgj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfgh;->zza:Lcom/google/android/gms/internal/ads/zzfgj;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfgh;->zza:Lcom/google/android/gms/internal/ads/zzfgj;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzfgj;->zzx(Lcom/google/android/gms/internal/ads/zzfgj;Lcom/google/android/gms/internal/ads/zzdso;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfgh;->zza:Lcom/google/android/gms/internal/ads/zzfgj;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfgh;->zza:Lcom/google/android/gms/internal/ads/zzfgj;

    move-object v2, p1

    check-cast v2, Lcom/google/android/gms/internal/ads/zzdso;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzfgj;->zzx(Lcom/google/android/gms/internal/ads/zzfgj;Lcom/google/android/gms/internal/ads/zzdso;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/zzbgc;->zzdq:Lcom/google/android/gms/internal/ads/zzbfu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/ads/zzdso;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdso;->zzd()Lcom/google/android/gms/internal/ads/zzfha;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfgh;->zza:Lcom/google/android/gms/internal/ads/zzfgj;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzfgj;->zzw(Lcom/google/android/gms/internal/ads/zzfgj;)Lcom/google/android/gms/internal/ads/zzfgz;

    move-result-object v1

    iput-object v1, p1, Lcom/google/android/gms/internal/ads/zzfha;->zza:Lcom/google/android/gms/internal/ads/zzfgz;

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfgh;->zza:Lcom/google/android/gms/internal/ads/zzfgj;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfgj;->zzv(Lcom/google/android/gms/internal/ads/zzfgj;)Lcom/google/android/gms/internal/ads/zzdso;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcwh;->zzj()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
