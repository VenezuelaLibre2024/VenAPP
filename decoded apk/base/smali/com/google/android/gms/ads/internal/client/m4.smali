.class public final Lcom/google/android/gms/ads/internal/client/m4;
.super Lcom/google/android/gms/ads/internal/client/u2;
.source "SourceFile"


# instance fields
.field private final a:Lx8/b0$a;


# direct methods
.method public constructor <init>(Lx8/b0$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/u2;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/m4;->a:Lx8/b0$a;

    return-void
.end method


# virtual methods
.method public final zze()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/m4;->a:Lx8/b0$a;

    invoke-virtual {v0}, Lx8/b0$a;->onVideoEnd()V

    return-void
.end method

.method public final zzf(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/m4;->a:Lx8/b0$a;

    invoke-virtual {v0, p1}, Lx8/b0$a;->onVideoMute(Z)V

    return-void
.end method

.method public final zzg()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/m4;->a:Lx8/b0$a;

    invoke-virtual {v0}, Lx8/b0$a;->onVideoPause()V

    return-void
.end method

.method public final zzh()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/m4;->a:Lx8/b0$a;

    invoke-virtual {v0}, Lx8/b0$a;->onVideoPlay()V

    return-void
.end method

.method public final zzi()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/m4;->a:Lx8/b0$a;

    invoke-virtual {v0}, Lx8/b0$a;->onVideoStart()V

    return-void
.end method
