.class public final Le2/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le2/d$b;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Le2/d$a;->c:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le2/d$a;->a:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le2/d$a;->b:Ljava/util/List;

    return-void
.end method

.method private f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le2/d$a;->b:Ljava/util/List;

    return-object v0
.end method

.method private h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le2/d$b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le2/d$a;->a:Ljava/util/List;

    return-object v0
.end method

.method private j()Z
    .locals 1

    iget-boolean v0, p0, Le2/d$a;->c:Z

    return v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Le2/d$a;
    .locals 1

    iget-object v0, p0, Le2/d$a;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b(Ljava/lang/String;)Le2/d$a;
    .locals 3

    iget-object v0, p0, Le2/d$a;->a:Ljava/util/List;

    new-instance v1, Le2/d$b;

    const-string v2, "direct://"

    invoke-direct {v1, p1, v2}, Le2/d$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public c(Ljava/lang/String;)Le2/d$a;
    .locals 2

    iget-object v0, p0, Le2/d$a;->a:Ljava/util/List;

    new-instance v1, Le2/d$b;

    invoke-direct {v1, p1}, Le2/d$b;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)Le2/d$a;
    .locals 2

    iget-object v0, p0, Le2/d$a;->a:Ljava/util/List;

    new-instance v1, Le2/d$b;

    invoke-direct {v1, p2, p1}, Le2/d$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public e()Le2/d;
    .locals 4

    new-instance v0, Le2/d;

    invoke-direct {p0}, Le2/d$a;->h()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0}, Le2/d$a;->f()Ljava/util/List;

    move-result-object v2

    invoke-direct {p0}, Le2/d$a;->j()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Le2/d;-><init>(Ljava/util/List;Ljava/util/List;Z)V

    return-object v0
.end method

.method public g()Le2/d$a;
    .locals 1

    const-string v0, "<local>"

    invoke-virtual {p0, v0}, Le2/d$a;->a(Ljava/lang/String;)Le2/d$a;

    move-result-object v0

    return-object v0
.end method

.method public i()Le2/d$a;
    .locals 1

    const-string v0, "<-loopback>"

    invoke-virtual {p0, v0}, Le2/d$a;->a(Ljava/lang/String;)Le2/d$a;

    move-result-object v0

    return-object v0
.end method

.method public k(Z)Le2/d$a;
    .locals 0

    iput-boolean p1, p0, Le2/d$a;->c:Z

    return-object p0
.end method
