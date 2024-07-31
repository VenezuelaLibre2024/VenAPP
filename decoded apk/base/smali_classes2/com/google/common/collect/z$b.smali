.class Lcom/google/common/collect/z$b;
.super Lcom/google/common/collect/h1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/common/collect/z;->r()Lcom/google/common/collect/h1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/collect/h1<",
        "TV;>;"
    }
.end annotation


# instance fields
.field a:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "+",
            "Lcom/google/common/collect/u<",
            "TV;>;>;"
        }
    .end annotation
.end field

.field b:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "TV;>;"
        }
    .end annotation
.end field

.field final synthetic c:Lcom/google/common/collect/z;


# direct methods
.method constructor <init>(Lcom/google/common/collect/z;)V
    .locals 0

    iput-object p1, p0, Lcom/google/common/collect/z$b;->c:Lcom/google/common/collect/z;

    invoke-direct {p0}, Lcom/google/common/collect/h1;-><init>()V

    iget-object p1, p1, Lcom/google/common/collect/z;->e:Lcom/google/common/collect/y;

    invoke-virtual {p1}, Lcom/google/common/collect/y;->m()Lcom/google/common/collect/u;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/common/collect/u;->m()Lcom/google/common/collect/h1;

    move-result-object p1

    iput-object p1, p0, Lcom/google/common/collect/z$b;->a:Ljava/util/Iterator;

    invoke-static {}, Lcom/google/common/collect/f0;->f()Lcom/google/common/collect/h1;

    move-result-object p1

    iput-object p1, p0, Lcom/google/common/collect/z$b;->b:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/z$b;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/common/collect/z$b;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/common/collect/z$b;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/common/collect/z$b;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/collect/u;

    invoke-virtual {v0}, Lcom/google/common/collect/u;->m()Lcom/google/common/collect/h1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/collect/z$b;->b:Ljava/util/Iterator;

    :cond_0
    iget-object v0, p0, Lcom/google/common/collect/z$b;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
