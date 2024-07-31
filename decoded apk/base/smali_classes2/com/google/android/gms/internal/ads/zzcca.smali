.class final Lcom/google/android/gms/internal/ads/zzcca;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private zza:Landroid/content/Context;

.field private zzb:Lla/f;

.field private zzc:Lcom/google/android/gms/ads/internal/util/w1;

.field private zzd:Lcom/google/android/gms/internal/ads/zzcch;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcbz;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/ads/internal/util/w1;)Lcom/google/android/gms/internal/ads/zzcca;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcca;->zzc:Lcom/google/android/gms/ads/internal/util/w1;

    return-object p0
.end method

.method public final zzb(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcca;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcca;->zza:Landroid/content/Context;

    return-object p0
.end method

.method public final zzc(Lla/f;)Lcom/google/android/gms/internal/ads/zzcca;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcca;->zzb:Lla/f;

    return-object p0
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzcch;)Lcom/google/android/gms/internal/ads/zzcca;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcca;->zzd:Lcom/google/android/gms/internal/ads/zzcch;

    return-object p0
.end method

.method public final zze()Lcom/google/android/gms/internal/ads/zzcci;
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcca;->zza:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzhhl;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcca;->zzb:Lla/f;

    const-class v1, Lla/f;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzhhl;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcca;->zzc:Lcom/google/android/gms/ads/internal/util/w1;

    const-class v1, Lcom/google/android/gms/ads/internal/util/w1;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzhhl;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcca;->zzd:Lcom/google/android/gms/internal/ads/zzcch;

    const-class v1, Lcom/google/android/gms/internal/ads/zzcch;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzhhl;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzccc;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcca;->zza:Landroid/content/Context;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzcca;->zzb:Lla/f;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzcca;->zzc:Lcom/google/android/gms/ads/internal/util/w1;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzcca;->zzd:Lcom/google/android/gms/internal/ads/zzcch;

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/zzccc;-><init>(Landroid/content/Context;Lla/f;Lcom/google/android/gms/ads/internal/util/w1;Lcom/google/android/gms/internal/ads/zzcch;Lcom/google/android/gms/internal/ads/zzccb;)V

    return-object v0
.end method
