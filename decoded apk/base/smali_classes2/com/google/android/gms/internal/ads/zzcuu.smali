.class public final Lcom/google/android/gms/internal/ads/zzcuu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhhd;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzcum;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzhhu;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzcum;Lcom/google/android/gms/internal/ads/zzhhu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcuu;->zza:Lcom/google/android/gms/internal/ads/zzcum;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcuu;->zzb:Lcom/google/android/gms/internal/ads/zzhhu;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcuu;->zzb:Lcom/google/android/gms/internal/ads/zzhhu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhhu;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzcvu;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzdim;

    sget-object v2, Lcom/google/android/gms/internal/ads/zzcep;->zze:Lcom/google/android/gms/internal/ads/zzgey;

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzdim;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-object v1
.end method