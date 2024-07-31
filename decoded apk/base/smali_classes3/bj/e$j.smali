.class interface abstract Lbj/e$j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbj/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "j"
.end annotation


# direct methods
.method public static a(Lbj/e$g;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbj/e$g;",
            ")",
            "Ljava/util/List<",
            "Lbj/e$j;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/common/collect/w;->p()Lcom/google/common/collect/w$a;

    move-result-object v0

    iget-object v1, p0, Lbj/e$g;->e:Lbj/e$g$c;

    if-eqz v1, :cond_0

    new-instance v1, Lbj/e$k;

    invoke-direct {v1, p0}, Lbj/e$k;-><init>(Lbj/e$g;)V

    invoke-virtual {v0, v1}, Lcom/google/common/collect/w$a;->h(Ljava/lang/Object;)Lcom/google/common/collect/w$a;

    :cond_0
    iget-object v1, p0, Lbj/e$g;->f:Lbj/e$g$b;

    if-eqz v1, :cond_1

    new-instance v1, Lbj/e$f;

    invoke-direct {v1, p0}, Lbj/e$f;-><init>(Lbj/e$g;)V

    invoke-virtual {v0, v1}, Lcom/google/common/collect/w$a;->h(Ljava/lang/Object;)Lcom/google/common/collect/w$a;

    :cond_1
    invoke-virtual {v0}, Lcom/google/common/collect/w$a;->k()Lcom/google/common/collect/w;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b(Lbj/e$c;J)V
.end method
