.class final Lcom/google/android/gms/internal/ads/zzcpg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/z;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzcnc;

.field private zzb:Lcom/google/android/gms/internal/ads/zzdah;

.field private zzc:Ll9/g;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcnc;Lcom/google/android/gms/internal/ads/zzcpf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcpg;->zza:Lcom/google/android/gms/internal/ads/zzcnc;

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzdah;)Ll9/z;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcpg;->zzb:Lcom/google/android/gms/internal/ads/zzdah;

    return-object p0
.end method

.method public final synthetic zzb(Ll9/g;)Ll9/z;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcpg;->zzc:Ll9/g;

    return-object p0
.end method

.method public final zzc()Ll9/a0;
    .locals 11

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcpg;->zzb:Lcom/google/android/gms/internal/ads/zzdah;

    const-class v1, Lcom/google/android/gms/internal/ads/zzdah;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzhhl;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcpg;->zzc:Ll9/g;

    const-class v1, Ll9/g;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzhhl;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcpi;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzcpg;->zzc:Ll9/g;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzcxr;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/zzcxr;-><init>()V

    new-instance v6, Lcom/google/android/gms/internal/ads/zzdwt;

    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/zzdwt;-><init>()V

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzcpg;->zzb:Lcom/google/android/gms/internal/ads/zzdah;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcpg;->zza:Lcom/google/android/gms/internal/ads/zzcnc;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v10}, Lcom/google/android/gms/internal/ads/zzcpi;-><init>(Lcom/google/android/gms/internal/ads/zzcnc;Ll9/g;Lcom/google/android/gms/internal/ads/zzcxr;Lcom/google/android/gms/internal/ads/zzdwt;Lcom/google/android/gms/internal/ads/zzdah;Lcom/google/android/gms/internal/ads/zzfeh;Lcom/google/android/gms/internal/ads/zzfdk;Lcom/google/android/gms/internal/ads/zzcph;)V

    return-object v0
.end method
