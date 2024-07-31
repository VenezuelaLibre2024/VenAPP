.class Lrb/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljb/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrb/r$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljb/w<",
        "Ljb/t;",
        "Ljb/t;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Ljava/util/logging/Logger;

.field private static final b:[B

.field private static final c:Lrb/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lrb/r;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lrb/r;->a:Ljava/util/logging/Logger;

    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte v1, v0, v1

    sput-object v0, Lrb/r;->b:[B

    new-instance v0, Lrb/r;

    invoke-direct {v0}, Lrb/r;-><init>()V

    sput-object v0, Lrb/r;->c:Lrb/r;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic d()[B
    .locals 1

    sget-object v0, Lrb/r;->b:[B

    return-object v0
.end method

.method static synthetic e()Ljava/util/logging/Logger;
    .locals 1

    sget-object v0, Lrb/r;->a:Ljava/util/logging/Logger;

    return-object v0
.end method

.method public static f()V
    .locals 1

    sget-object v0, Lrb/r;->c:Lrb/r;

    invoke-static {v0}, Ljb/x;->n(Ljb/w;)V

    return-void
.end method

.method private g(Ljb/v;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljb/v<",
            "Ljb/t;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljb/v;->c()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljb/v$c;

    invoke-virtual {v1}, Ljb/v$c;->c()Ljb/g;

    move-result-object v2

    instance-of v2, v2, Lrb/p;

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljb/v$c;->c()Ljb/g;

    move-result-object v2

    check-cast v2, Lrb/p;

    invoke-virtual {v1}, Ljb/v$c;->b()[B

    move-result-object v1

    invoke-static {v1}, Lxb/a;->a([B)Lxb/a;

    move-result-object v1

    invoke-virtual {v2}, Lrb/p;->a()Lxb/a;

    move-result-object v3

    invoke-virtual {v1, v3}, Lxb/a;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Mac Key with parameters "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lrb/p;->b()Lrb/q;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " has wrong output prefix ("

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lrb/p;->a()Lxb/a;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ") instead of ("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljb/v;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lrb/r;->h(Ljb/v;)Ljb/t;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Ljb/t;",
            ">;"
        }
    .end annotation

    const-class v0, Ljb/t;

    return-object v0
.end method

.method public c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Ljb/t;",
            ">;"
        }
    .end annotation

    const-class v0, Ljb/t;

    return-object v0
.end method

.method public h(Ljb/v;)Ljb/t;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljb/v<",
            "Ljb/t;",
            ">;)",
            "Ljb/t;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lrb/r;->g(Ljb/v;)V

    new-instance v0, Lrb/r$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lrb/r$b;-><init>(Ljb/v;Lrb/r$a;)V

    return-object v0
.end method
