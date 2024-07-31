.class public final Lcom/google/common/collect/c0$a;
.super Lcom/google/common/collect/a0$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/collect/a0$a<",
        "TE;>;"
    }
.end annotation


# instance fields
.field private final f:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "-TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "-TE;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/common/collect/a0$a;-><init>()V

    invoke-static {p1}, Leb/o;->o(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Comparator;

    iput-object p1, p0, Lcom/google/common/collect/c0$a;->f:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lcom/google/common/collect/u$b;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/common/collect/c0$a;->l(Ljava/lang/Object;)Lcom/google/common/collect/c0$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic h(Ljava/lang/Object;)Lcom/google/common/collect/a0$a;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/common/collect/c0$a;->l(Ljava/lang/Object;)Lcom/google/common/collect/c0$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k()Lcom/google/common/collect/a0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/c0$a;->n()Lcom/google/common/collect/c0;

    move-result-object v0

    return-object v0
.end method

.method public l(Ljava/lang/Object;)Lcom/google/common/collect/c0$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lcom/google/common/collect/c0$a<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/google/common/collect/a0$a;->h(Ljava/lang/Object;)Lcom/google/common/collect/a0$a;

    return-object p0
.end method

.method public varargs m([Ljava/lang/Object;)Lcom/google/common/collect/c0$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)",
            "Lcom/google/common/collect/c0$a<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/google/common/collect/a0$a;->i([Ljava/lang/Object;)Lcom/google/common/collect/a0$a;

    return-object p0
.end method

.method public n()Lcom/google/common/collect/c0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/collect/c0<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/common/collect/u$a;->a:[Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/common/collect/c0$a;->f:Ljava/util/Comparator;

    iget v2, p0, Lcom/google/common/collect/u$a;->b:I

    invoke-static {v1, v2, v0}, Lcom/google/common/collect/c0;->D(Ljava/util/Comparator;I[Ljava/lang/Object;)Lcom/google/common/collect/c0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    iput v1, p0, Lcom/google/common/collect/u$a;->b:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/common/collect/u$a;->c:Z

    return-object v0
.end method
