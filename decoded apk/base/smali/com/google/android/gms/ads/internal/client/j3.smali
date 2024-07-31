.class final Lcom/google/android/gms/ads/internal/client/j3;
.super Lcom/google/android/gms/ads/internal/client/a2;
.source "SourceFile"


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/ads/internal/client/i3;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/a2;-><init>()V

    return-void
.end method


# virtual methods
.method public final zze(Lcom/google/android/gms/ads/internal/client/c3;)V
    .locals 4

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/m3;->h()Lcom/google/android/gms/ads/internal/client/m3;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/client/m3;->d(Lcom/google/android/gms/ads/internal/client/m3;)Lx8/s;

    move-result-object v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Lx8/d;

    iget v2, p1, Lcom/google/android/gms/ads/internal/client/c3;->a:I

    iget-object v3, p1, Lcom/google/android/gms/ads/internal/client/c3;->b:Ljava/lang/String;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/client/c3;->c:Ljava/lang/String;

    invoke-direct {v1, v2, v3, p1}, Lx8/d;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object p1, v1

    :goto_0
    invoke-interface {v0, p1}, Lx8/s;->onAdInspectorClosed(Lx8/d;)V

    :cond_1
    return-void
.end method
