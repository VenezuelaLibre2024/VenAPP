.class public final Le2/r$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le2/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Z

.field private b:Ljava/lang/String;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/core/util/d<",
            "Ljava/lang/String;",
            "Le2/r$d;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "appassets.androidplatform.net"

    iput-object v0, p0, Le2/r$b;->b:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le2/r$b;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Le2/r$d;)Le2/r$b;
    .locals 1

    iget-object v0, p0, Le2/r$b;->c:Ljava/util/List;

    invoke-static {p1, p2}, Landroidx/core/util/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/core/util/d;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b()Le2/r;
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Le2/r$b;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/core/util/d;

    iget-object v3, v2, Landroidx/core/util/d;->a:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v2, v2, Landroidx/core/util/d;->b:Ljava/lang/Object;

    check-cast v2, Le2/r$d;

    new-instance v4, Le2/r$e;

    iget-object v5, p0, Le2/r$b;->b:Ljava/lang/String;

    iget-boolean v6, p0, Le2/r$b;->a:Z

    invoke-direct {v4, v5, v3, v6, v2}, Le2/r$e;-><init>(Ljava/lang/String;Ljava/lang/String;ZLe2/r$d;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Le2/r;

    invoke-direct {v1, v0}, Le2/r;-><init>(Ljava/util/List;)V

    return-object v1
.end method

.method public c(Ljava/lang/String;)Le2/r$b;
    .locals 0

    iput-object p1, p0, Le2/r$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public d(Z)Le2/r$b;
    .locals 0

    iput-boolean p1, p0, Le2/r$b;->a:Z

    return-object p0
.end method
