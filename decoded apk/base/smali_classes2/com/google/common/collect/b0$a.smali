.class public final Lcom/google/common/collect/b0$a;
.super Lcom/google/common/collect/z$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/collect/z$c<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/common/collect/z$c;-><init>()V

    return-void
.end method


# virtual methods
.method b()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    invoke-static {}, Lcom/google/common/collect/s0;->d()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/google/common/collect/b0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/collect/b0<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/common/collect/z$c;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lcom/google/common/collect/z$c;->b:Ljava/util/Comparator;

    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/google/common/collect/r0;->a(Ljava/util/Comparator;)Lcom/google/common/collect/r0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/collect/r0;->d()Lcom/google/common/collect/r0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/common/collect/r0;->b(Ljava/lang/Iterable;)Lcom/google/common/collect/w;

    move-result-object v0

    :cond_0
    iget-object v1, p0, Lcom/google/common/collect/z$c;->c:Ljava/util/Comparator;

    invoke-static {v0, v1}, Lcom/google/common/collect/b0;->v(Ljava/util/Collection;Ljava/util/Comparator;)Lcom/google/common/collect/b0;

    move-result-object v0

    return-object v0
.end method
