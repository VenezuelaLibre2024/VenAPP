.class final Lcom/google/android/gms/internal/ads/zzcbv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lla/f;

.field private final zzb:Lcom/google/android/gms/ads/internal/util/w1;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzcch;


# direct methods
.method constructor <init>(Lla/f;Lcom/google/android/gms/ads/internal/util/w1;Lcom/google/android/gms/internal/ads/zzcch;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbv;->zza:Lla/f;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcbv;->zzb:Lcom/google/android/gms/ads/internal/util/w1;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcbv;->zzc:Lcom/google/android/gms/internal/ads/zzcch;

    return-void
.end method


# virtual methods
.method public final zza(IJ)V
    .locals 4

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgc;->zzap:Lcom/google/android/gms/internal/ads/zzbfu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbv;->zzb:Lcom/google/android/gms/ads/internal/util/w1;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/util/w1;->zzf()J

    move-result-wide v0

    sub-long v0, p2, v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    const-string p1, "Receiving npa decision in the past, ignoring."

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/u1;->a(Ljava/lang/String;)V

    return-void

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgc;->zzaq:Lcom/google/android/gms/internal/ads/zzbfu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbv;->zzb:Lcom/google/android/gms/ads/internal/util/w1;

    const/4 v0, -0x1

    invoke-interface {p1, v0}, Lcom/google/android/gms/ads/internal/util/w1;->g(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbv;->zzb:Lcom/google/android/gms/ads/internal/util/w1;

    invoke-interface {p1, p2, p3}, Lcom/google/android/gms/ads/internal/util/w1;->n(J)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbv;->zzb:Lcom/google/android/gms/ads/internal/util/w1;

    invoke-interface {v0, p1}, Lcom/google/android/gms/ads/internal/util/w1;->g(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbv;->zzb:Lcom/google/android/gms/ads/internal/util/w1;

    invoke-interface {p1, p2, p3}, Lcom/google/android/gms/ads/internal/util/w1;->n(J)V

    return-void
.end method
