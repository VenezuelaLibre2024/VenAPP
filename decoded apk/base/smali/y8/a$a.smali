.class public final Ly8/a$a;
.super Lx8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx8/a<",
        "Ly8/a$a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx8/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic c()Lx8/a;
    .locals 0

    return-object p0
.end method

.method public k(Ljava/lang/String;Ljava/lang/String;)Ly8/a$a;
    .locals 1

    iget-object v0, p0, Lx8/a;->a:Lcom/google/android/gms/ads/internal/client/y2;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/ads/internal/client/y2;->r(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public l(Ljava/lang/String;Ljava/util/List;)Ly8/a$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ly8/a$a;"
        }
    .end annotation

    if-eqz p2, :cond_0

    iget-object v0, p0, Lx8/a;->a:Lcom/google/android/gms/ads/internal/client/y2;

    const-string v1, ","

    invoke-static {v1, p2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/ads/internal/client/y2;->r(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public m()Ly8/a;
    .locals 2

    new-instance v0, Ly8/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ly8/a;-><init>(Ly8/a$a;Ly8/f;)V

    return-object v0
.end method

.method public n(Ljava/lang/String;)Ly8/a$a;
    .locals 1

    iget-object v0, p0, Lx8/a;->a:Lcom/google/android/gms/ads/internal/client/y2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/y2;->a(Ljava/lang/String;)V

    return-object p0
.end method
