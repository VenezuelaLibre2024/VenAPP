.class Lcom/google/common/collect/w$e;
.super Lcom/google/common/collect/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/collect/w<",
        "TE;>;"
    }
.end annotation


# instance fields
.field final transient c:I

.field final transient d:I

.field final synthetic e:Lcom/google/common/collect/w;


# direct methods
.method constructor <init>(Lcom/google/common/collect/w;II)V
    .locals 0

    iput-object p1, p0, Lcom/google/common/collect/w$e;->e:Lcom/google/common/collect/w;

    invoke-direct {p0}, Lcom/google/common/collect/w;-><init>()V

    iput p2, p0, Lcom/google/common/collect/w$e;->c:I

    iput p3, p0, Lcom/google/common/collect/w$e;->d:I

    return-void
.end method


# virtual methods
.method public E(II)Lcom/google/common/collect/w;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/common/collect/w<",
            "TE;>;"
        }
    .end annotation

    iget v0, p0, Lcom/google/common/collect/w$e;->d:I

    invoke-static {p1, p2, v0}, Leb/o;->t(III)V

    iget-object v0, p0, Lcom/google/common/collect/w$e;->e:Lcom/google/common/collect/w;

    iget v1, p0, Lcom/google/common/collect/w$e;->c:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lcom/google/common/collect/w;->E(II)Lcom/google/common/collect/w;

    move-result-object p1

    return-object p1
.end method

.method f()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/w$e;->e:Lcom/google/common/collect/w;

    invoke-virtual {v0}, Lcom/google/common/collect/u;->f()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget v0, p0, Lcom/google/common/collect/w$e;->d:I

    invoke-static {p1, v0}, Leb/o;->m(II)I

    iget-object v0, p0, Lcom/google/common/collect/w$e;->e:Lcom/google/common/collect/w;

    iget v1, p0, Lcom/google/common/collect/w$e;->c:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method h()I
    .locals 2

    iget-object v0, p0, Lcom/google/common/collect/w$e;->e:Lcom/google/common/collect/w;

    invoke-virtual {v0}, Lcom/google/common/collect/u;->k()I

    move-result v0

    iget v1, p0, Lcom/google/common/collect/w$e;->c:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/google/common/collect/w$e;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-super {p0}, Lcom/google/common/collect/w;->m()Lcom/google/common/collect/h1;

    move-result-object v0

    return-object v0
.end method

.method k()I
    .locals 2

    iget-object v0, p0, Lcom/google/common/collect/w$e;->e:Lcom/google/common/collect/w;

    invoke-virtual {v0}, Lcom/google/common/collect/u;->k()I

    move-result v0

    iget v1, p0, Lcom/google/common/collect/w$e;->c:I

    add-int/2addr v0, v1

    return v0
.end method

.method l()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    invoke-super {p0}, Lcom/google/common/collect/w;->t()Lcom/google/common/collect/i1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    invoke-super {p0, p1}, Lcom/google/common/collect/w;->u(I)Lcom/google/common/collect/i1;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lcom/google/common/collect/w$e;->d:I

    return v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/common/collect/w$e;->E(II)Lcom/google/common/collect/w;

    move-result-object p1

    return-object p1
.end method
