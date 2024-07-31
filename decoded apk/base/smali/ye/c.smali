.class public Lye/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lye/i;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lye/d;


# direct methods
.method constructor <init>(Ljava/util/Set;Lye/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lye/f;",
            ">;",
            "Lye/d;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lye/c;->e(Ljava/util/Set;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lye/c;->a:Ljava/lang/String;

    iput-object p2, p0, Lye/c;->b:Lye/d;

    return-void
.end method

.method public static synthetic b(Lpc/d;)Lye/i;
    .locals 0

    invoke-static {p0}, Lye/c;->d(Lpc/d;)Lye/i;

    move-result-object p0

    return-object p0
.end method

.method public static c()Lpc/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lpc/c<",
            "Lye/i;",
            ">;"
        }
    .end annotation

    const-class v0, Lye/i;

    invoke-static {v0}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v0

    const-class v1, Lye/f;

    invoke-static {v1}, Lpc/q;->n(Ljava/lang/Class;)Lpc/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v0

    new-instance v1, Lye/b;

    invoke-direct {v1}, Lye/b;-><init>()V

    invoke-virtual {v0, v1}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lpc/c$b;->d()Lpc/c;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic d(Lpc/d;)Lye/i;
    .locals 2

    new-instance v0, Lye/c;

    const-class v1, Lye/f;

    invoke-interface {p0, v1}, Lpc/d;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p0

    invoke-static {}, Lye/d;->a()Lye/d;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lye/c;-><init>(Ljava/util/Set;Lye/d;)V

    return-object v0
.end method

.method private static e(Ljava/util/Set;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lye/f;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lye/f;

    invoke-virtual {v1}, Lye/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2f

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lye/f;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lye/c;->b:Lye/d;

    invoke-virtual {v0}, Lye/d;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lye/c;->a:Ljava/lang/String;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lye/c;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lye/c;->b:Lye/d;

    invoke-virtual {v1}, Lye/d;->b()Ljava/util/Set;

    move-result-object v1

    invoke-static {v1}, Lye/c;->e(Ljava/util/Set;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
