.class final Lcom/google/android/gms/internal/ads/zzdzq;
.super Lx8/e;
.source "SourceFile"


# instance fields
.field final synthetic zza:Ljava/lang/String;

.field final synthetic zzb:Lx8/k;

.field final synthetic zzc:Ljava/lang/String;

.field final synthetic zzd:Lcom/google/android/gms/internal/ads/zzdzx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzdzx;Ljava/lang/String;Lx8/k;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdzq;->zza:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdzq;->zzb:Lx8/k;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdzq;->zzc:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzq;->zzd:Lcom/google/android/gms/internal/ads/zzdzx;

    invoke-direct {p0}, Lx8/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdFailedToLoad(Lx8/o;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzq;->zzd:Lcom/google/android/gms/internal/ads/zzdzx;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzdzx;->zzc(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdzq;->zzc:Ljava/lang/String;

    invoke-static {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzdzx;->zzd(Lcom/google/android/gms/internal/ads/zzdzx;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final onAdLoaded()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzq;->zzd:Lcom/google/android/gms/internal/ads/zzdzx;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdzq;->zza:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdzq;->zzb:Lx8/k;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdzq;->zzc:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzdzx;->zzg(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
