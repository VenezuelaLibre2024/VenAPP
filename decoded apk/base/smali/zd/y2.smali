.class public Lzd/y2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcc/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzd/y2$b;
    }
.end annotation


# instance fields
.field private volatile a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lee/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lee/a<",
            "Lcc/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/y2;->a:Ljava/lang/Object;

    new-instance v0, Lzd/x2;

    invoke-direct {v0, p0}, Lzd/x2;-><init>(Lzd/y2;)V

    invoke-interface {p1, v0}, Lee/a;->a(Lee/a$a;)V

    return-void
.end method

.method public static synthetic h(Lzd/y2;Lee/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lzd/y2;->i(Lee/b;)V

    return-void
.end method

.method private synthetic i(Lee/b;)V
    .locals 0

    invoke-interface {p1}, Lee/b;->get()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lzd/y2;->a:Ljava/lang/Object;

    return-void
.end method

.method private j()Lcc/a;
    .locals 2

    iget-object v0, p0, Lzd/y2;->a:Ljava/lang/Object;

    instance-of v1, v0, Lcc/a;

    if-eqz v1, :cond_0

    check-cast v0, Lcc/a;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    invoke-direct {p0}, Lzd/y2;->j()Lcc/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lcc/a;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;Lcc/a$b;)Lcc/a$a;
    .locals 3

    iget-object v0, p0, Lzd/y2;->a:Ljava/lang/Object;

    instance-of v1, v0, Lcc/a;

    if-eqz v1, :cond_0

    check-cast v0, Lcc/a;

    invoke-interface {v0, p1, p2}, Lcc/a;->b(Ljava/lang/String;Lcc/a$b;)Lcc/a$a;

    move-result-object p1

    return-object p1

    :cond_0
    check-cast v0, Lee/a;

    new-instance v1, Lzd/y2$b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v0, v2}, Lzd/y2$b;-><init>(Ljava/lang/String;Lcc/a$b;Lee/a;Lzd/y2$a;)V

    return-object v1
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Lzd/y2;->j()Lcc/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lcc/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public clearConditionalUserProperty(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public d(Z)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/String;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcc/a$c;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public g(Lcc/a$c;)V
    .locals 0

    return-void
.end method
