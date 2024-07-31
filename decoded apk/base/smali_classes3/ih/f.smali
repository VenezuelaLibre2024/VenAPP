.class public Lih/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldg/t;


# instance fields
.field private a:Ldg/o;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldg/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldg/o;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lih/f;->b:Ljava/util/List;

    iput-object p1, p0, Lih/f;->a:Ldg/o;

    return-void
.end method


# virtual methods
.method public a(Ldg/s;)V
    .locals 1

    iget-object v0, p0, Lih/f;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected b(Ldg/c;)Ldg/q;
    .locals 2

    iget-object v0, p0, Lih/f;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :try_start_0
    iget-object v0, p0, Lih/f;->a:Ldg/o;

    instance-of v1, v0, Ldg/k;

    if-eqz v1, :cond_0

    check-cast v0, Ldg/k;

    invoke-virtual {v0, p1}, Ldg/k;->d(Ldg/c;)Ldg/q;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lih/f;->a:Ldg/o;

    invoke-interface {v0}, Ldg/o;->reset()V

    return-object p1

    :cond_0
    :try_start_1
    invoke-interface {v0, p1}, Ldg/o;->a(Ldg/c;)Ldg/q;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lih/f;->a:Ldg/o;

    invoke-interface {v0}, Ldg/o;->reset()V

    return-object p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lih/f;->a:Ldg/o;

    invoke-interface {v0}, Ldg/o;->reset()V

    throw p1

    :catch_0
    iget-object p1, p0, Lih/f;->a:Ldg/o;

    invoke-interface {p1}, Ldg/o;->reset()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public c(Ldg/j;)Ldg/q;
    .locals 0

    invoke-virtual {p0, p1}, Lih/f;->e(Ldg/j;)Ldg/c;

    move-result-object p1

    invoke-virtual {p0, p1}, Lih/f;->b(Ldg/c;)Ldg/q;

    move-result-object p1

    return-object p1
.end method

.method public d()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldg/s;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lih/f;->b:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method protected e(Ldg/j;)Ldg/c;
    .locals 2

    new-instance v0, Ldg/c;

    new-instance v1, Lkg/m;

    invoke-direct {v1, p1}, Lkg/m;-><init>(Ldg/j;)V

    invoke-direct {v0, v1}, Ldg/c;-><init>(Ldg/b;)V

    return-object v0
.end method
