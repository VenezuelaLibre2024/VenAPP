.class final Lcom/google/android/gms/internal/ads/zzbxj;
.super Lcom/google/android/gms/internal/ads/zzccp;
.source "SourceFile"


# instance fields
.field final synthetic zza:Lm9/b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzbxk;Lm9/b;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbxj;->zza:Lm9/b;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzccp;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbxj;->zza:Lm9/b;

    invoke-virtual {v0, p1}, Lm9/b;->onFailure(Ljava/lang/String;)V

    return-void
.end method

.method public final zzc(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    new-instance v0, Lm9/a;

    new-instance v1, Lcom/google/android/gms/ads/internal/client/p3;

    invoke-direct {v1, p1, p3, p2}, Lcom/google/android/gms/ads/internal/client/p3;-><init>(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lm9/a;-><init>(Lcom/google/android/gms/ads/internal/client/p3;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbxj;->zza:Lm9/b;

    invoke-virtual {p1, v0}, Lm9/b;->onSuccess(Lm9/a;)V

    return-void
.end method
