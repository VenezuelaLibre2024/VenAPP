.class public final synthetic Lcom/google/android/gms/internal/ads/zzgln;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgpk;


# static fields
.field public static final synthetic zza:Lcom/google/android/gms/internal/ads/zzgln;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgln;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgln;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgln;->zza:Lcom/google/android/gms/internal/ads/zzgln;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgin;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzgin;-><init>(Lcom/google/android/gms/internal/ads/zzgim;)V

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgin;->zza(I)Lcom/google/android/gms/internal/ads/zzgin;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgin;->zzb(I)Lcom/google/android/gms/internal/ads/zzgin;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgin;->zzc(I)Lcom/google/android/gms/internal/ads/zzgin;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgio;->zza:Lcom/google/android/gms/internal/ads/zzgio;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgin;->zzd(Lcom/google/android/gms/internal/ads/zzgio;)Lcom/google/android/gms/internal/ads/zzgin;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgin;->zze()Lcom/google/android/gms/internal/ads/zzgiq;

    move-result-object v0

    return-object v0
.end method
