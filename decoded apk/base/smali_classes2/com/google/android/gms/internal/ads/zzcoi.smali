.class final Lcom/google/android/gms/internal/ads/zzcoi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzdxo;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzcnc;

.field private zzb:Landroid/content/Context;

.field private zzc:Lcom/google/android/gms/internal/ads/zzboe;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcnc;Lcom/google/android/gms/internal/ads/zzcoh;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcoi;->zza:Lcom/google/android/gms/internal/ads/zzcnc;

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzboe;)Lcom/google/android/gms/internal/ads/zzdxo;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcoi;->zzc:Lcom/google/android/gms/internal/ads/zzboe;

    return-object p0
.end method

.method public final synthetic zzb(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzdxo;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcoi;->zzb:Landroid/content/Context;

    return-object p0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzdxp;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcoi;->zzb:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzhhl;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcoi;->zzc:Lcom/google/android/gms/internal/ads/zzboe;

    const-class v1, Lcom/google/android/gms/internal/ads/zzboe;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzhhl;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcok;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcoi;->zza:Lcom/google/android/gms/internal/ads/zzcnc;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcoi;->zzb:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcoi;->zzc:Lcom/google/android/gms/internal/ads/zzboe;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzcok;-><init>(Lcom/google/android/gms/internal/ads/zzcnc;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzboe;Lcom/google/android/gms/internal/ads/zzcoj;)V

    return-object v0
.end method
