.class final Lcom/google/android/gms/internal/ads/zzcnu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfda;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzcnc;

.field private zzb:Landroid/content/Context;

.field private zzc:Ljava/lang/String;

.field private zzd:Lcom/google/android/gms/ads/internal/client/z4;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcnc;Lcom/google/android/gms/internal/ads/zzcnt;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcnu;->zza:Lcom/google/android/gms/internal/ads/zzcnc;

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/ads/internal/client/z4;)Lcom/google/android/gms/internal/ads/zzfda;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcnu;->zzd:Lcom/google/android/gms/ads/internal/client/z4;

    return-object p0
.end method

.method public final synthetic zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfda;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcnu;->zzc:Ljava/lang/String;

    return-object p0
.end method

.method public final synthetic zzc(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzfda;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcnu;->zzb:Landroid/content/Context;

    return-object p0
.end method

.method public final zzd()Lcom/google/android/gms/internal/ads/zzfdb;
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcnu;->zzb:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzhhl;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcnu;->zzc:Ljava/lang/String;

    const-class v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzhhl;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcnu;->zzd:Lcom/google/android/gms/ads/internal/client/z4;

    const-class v1, Lcom/google/android/gms/ads/internal/client/z4;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzhhl;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcnw;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcnu;->zza:Lcom/google/android/gms/internal/ads/zzcnc;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzcnu;->zzb:Landroid/content/Context;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzcnu;->zzc:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzcnu;->zzd:Lcom/google/android/gms/ads/internal/client/z4;

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/zzcnw;-><init>(Lcom/google/android/gms/internal/ads/zzcnc;Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/z4;Lcom/google/android/gms/internal/ads/zzcnv;)V

    return-object v0
.end method