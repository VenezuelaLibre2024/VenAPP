.class public abstract Lx8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lx8/a<",
        "TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected final a:Lcom/google/android/gms/ads/internal/client/y2;


# direct methods
.method protected constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/y2;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/y2;-><init>()V

    iput-object v0, p0, Lx8/a;->a:Lcom/google/android/gms/ads/internal/client/y2;

    const-string v1, "B3EEABB8EE11C2BE770B684D95219ECB"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/client/y2;->u(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lx8/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lx8/a;->a:Lcom/google/android/gms/ads/internal/client/y2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/y2;->s(Ljava/lang/String;)V

    invoke-virtual {p0}, Lx8/a;->c()Lx8/a;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Class;Landroid/os/Bundle;)Lx8/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "Ljava/lang/Object;",
            ">;",
            "Landroid/os/Bundle;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lx8/a;->a:Lcom/google/android/gms/ads/internal/client/y2;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/ads/internal/client/y2;->t(Ljava/lang/Class;Landroid/os/Bundle;)V

    const-class v0, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "_emulatorLiveAds"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lx8/a;->a:Lcom/google/android/gms/ads/internal/client/y2;

    const-string p2, "B3EEABB8EE11C2BE770B684D95219ECB"

    invoke-virtual {p1, p2}, Lcom/google/android/gms/ads/internal/client/y2;->v(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Lx8/a;->c()Lx8/a;

    move-result-object p1

    return-object p1
.end method

.method protected abstract c()Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public d(Ljava/lang/String;)Lx8/a;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    const-string v0, "Content URL must be non-null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Content URL must be non-empty."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/16 v2, 0x200

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v5, 0x1

    aput-object v3, v1, v5

    if-gt v0, v2, :cond_0

    move v4, v5

    :cond_0
    const-string v0, "Content URL must not exceed %d in length.  Provided length was %d."

    invoke-static {v4, v0, v1}, Lcom/google/android/gms/common/internal/s;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lx8/a;->a:Lcom/google/android/gms/ads/internal/client/y2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/y2;->w(Ljava/lang/String;)V

    invoke-virtual {p0}, Lx8/a;->c()Lx8/a;

    move-result-object p1

    return-object p1
.end method

.method public e(I)Lx8/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iget-object v0, p0, Lx8/a;->a:Lcom/google/android/gms/ads/internal/client/y2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/y2;->x(I)V

    invoke-virtual {p0}, Lx8/a;->c()Lx8/a;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/util/List;)Lx8/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)TT;"
        }
    .end annotation

    if-nez p1, :cond_0

    const-string p1, "neighboring content URLs list should not be null"

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzj(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0}, Lx8/a;->c()Lx8/a;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lx8/a;->a:Lcom/google/android/gms/ads/internal/client/y2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/y2;->z(Ljava/util/List;)V

    goto :goto_0
.end method

.method public g(Ljava/lang/String;)Lx8/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lx8/a;->a:Lcom/google/android/gms/ads/internal/client/y2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/y2;->b(Ljava/lang/String;)V

    invoke-virtual {p0}, Lx8/a;->c()Lx8/a;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljava/lang/String;)Lx8/a;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lx8/a;->a:Lcom/google/android/gms/ads/internal/client/y2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/y2;->u(Ljava/lang/String;)V

    invoke-virtual {p0}, Lx8/a;->c()Lx8/a;

    move-result-object p1

    return-object p1
.end method

.method public final i(Z)Lx8/a;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lx8/a;->a:Lcom/google/android/gms/ads/internal/client/y2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/y2;->y(Z)V

    invoke-virtual {p0}, Lx8/a;->c()Lx8/a;

    move-result-object p1

    return-object p1
.end method

.method public final j(Z)Lx8/a;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lx8/a;->a:Lcom/google/android/gms/ads/internal/client/y2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/y2;->c(Z)V

    invoke-virtual {p0}, Lx8/a;->c()Lx8/a;

    move-result-object p1

    return-object p1
.end method
