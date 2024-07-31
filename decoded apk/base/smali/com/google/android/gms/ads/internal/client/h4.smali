.class public final Lcom/google/android/gms/ads/internal/client/h4;
.super Lcom/google/android/gms/ads/internal/client/h2;
.source "SourceFile"


# instance fields
.field private final a:Lx8/t;


# direct methods
.method public constructor <init>(Lx8/t;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/h2;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/h4;->a:Lx8/t;

    return-void
.end method


# virtual methods
.method public final x1(Lcom/google/android/gms/ads/internal/client/b5;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/h4;->a:Lx8/t;

    if-eqz v0, :cond_0

    iget v1, p1, Lcom/google/android/gms/ads/internal/client/b5;->b:I

    iget-object v2, p1, Lcom/google/android/gms/ads/internal/client/b5;->c:Ljava/lang/String;

    iget-wide v3, p1, Lcom/google/android/gms/ads/internal/client/b5;->d:J

    invoke-static {v1, v2, v3, v4}, Lx8/j;->d(ILjava/lang/String;J)Lx8/j;

    move-result-object p1

    invoke-interface {v0, p1}, Lx8/t;->onPaidEvent(Lx8/j;)V

    :cond_0
    return-void
.end method

.method public final zzf()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/h4;->a:Lx8/t;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
