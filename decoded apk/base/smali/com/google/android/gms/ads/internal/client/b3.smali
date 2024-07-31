.class final Lcom/google/android/gms/ads/internal/client/b3;
.super Lcom/google/android/gms/ads/internal/client/y;
.source "SourceFile"


# instance fields
.field final synthetic c:Lcom/google/android/gms/ads/internal/client/d3;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/client/d3;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/b3;->c:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/y;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdFailedToLoad(Lx8/o;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/b3;->c:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/client/d3;->h(Lcom/google/android/gms/ads/internal/client/d3;)Lx8/b0;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/d3;->l()Lcom/google/android/gms/ads/internal/client/s2;

    move-result-object v0

    invoke-virtual {v1, v0}, Lx8/b0;->c(Lcom/google/android/gms/ads/internal/client/s2;)V

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/internal/client/y;->onAdFailedToLoad(Lx8/o;)V

    return-void
.end method

.method public final onAdLoaded()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/b3;->c:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/client/d3;->h(Lcom/google/android/gms/ads/internal/client/d3;)Lx8/b0;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/d3;->l()Lcom/google/android/gms/ads/internal/client/s2;

    move-result-object v0

    invoke-virtual {v1, v0}, Lx8/b0;->c(Lcom/google/android/gms/ads/internal/client/s2;)V

    invoke-super {p0}, Lcom/google/android/gms/ads/internal/client/y;->onAdLoaded()V

    return-void
.end method
