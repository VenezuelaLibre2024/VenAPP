.class public final Lf2/l$a;
.super Lf2/u$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf2/u$a<",
        "Lf2/l$a;",
        "Lf2/l;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/work/c;",
            ">;)V"
        }
    .end annotation

    const-string v0, "workerClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lf2/u$a;-><init>(Ljava/lang/Class;)V

    invoke-virtual {p0}, Lf2/u$a;->h()Lk2/u;

    move-result-object p1

    const-class v0, Landroidx/work/OverwritingInputMerger;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lk2/u;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic c()Lf2/u;
    .locals 1

    invoke-virtual {p0}, Lf2/l$a;->m()Lf2/l;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g()Lf2/u$a;
    .locals 1

    invoke-virtual {p0}, Lf2/l$a;->n()Lf2/l$a;

    move-result-object v0

    return-object v0
.end method

.method public m()Lf2/l;
    .locals 2

    invoke-virtual {p0}, Lf2/u$a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lf2/u$a;->h()Lk2/u;

    move-result-object v0

    iget-object v0, v0, Lk2/u;->j:Lf2/b;

    invoke-virtual {v0}, Lf2/b;->h()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    new-instance v0, Lf2/l;

    invoke-direct {v0, p0}, Lf2/l;-><init>(Lf2/l$a;)V

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot set backoff criteria on an idle mode job"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public n()Lf2/l$a;
    .locals 0

    return-object p0
.end method