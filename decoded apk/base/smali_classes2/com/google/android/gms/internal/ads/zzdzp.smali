.class final Lcom/google/android/gms/internal/ads/zzdzp;
.super Lz8/a$a;
.source "SourceFile"


# instance fields
.field final synthetic zza:Ljava/lang/String;

.field final synthetic zzb:Ljava/lang/String;

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzdzx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzdzx;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdzp;->zza:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdzp;->zzb:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzp;->zzc:Lcom/google/android/gms/internal/ads/zzdzx;

    invoke-direct {p0}, Lz8/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdFailedToLoad(Lx8/o;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzp;->zzc:Lcom/google/android/gms/internal/ads/zzdzx;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzdzx;->zzc(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdzp;->zzb:Ljava/lang/String;

    invoke-static {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzdzx;->zzd(Lcom/google/android/gms/internal/ads/zzdzx;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final bridge synthetic onAdLoaded(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lz8/a;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzp;->zzb:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdzp;->zzc:Lcom/google/android/gms/internal/ads/zzdzx;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdzp;->zza:Ljava/lang/String;

    invoke-virtual {v1, v2, p1, v0}, Lcom/google/android/gms/internal/ads/zzdzx;->zzg(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method