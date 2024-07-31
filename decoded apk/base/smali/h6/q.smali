.class final Lh6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf6/g;


# instance fields
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lf6/b;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lh6/p;

.field private final c:Lh6/t;


# direct methods
.method constructor <init>(Ljava/util/Set;Lh6/p;Lh6/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lf6/b;",
            ">;",
            "Lh6/p;",
            "Lh6/t;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh6/q;->a:Ljava/util/Set;

    iput-object p2, p0, Lh6/q;->b:Lh6/p;

    iput-object p3, p0, Lh6/q;->c:Lh6/t;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Class;Lf6/e;)Lf6/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lf6/e<",
            "TT;[B>;)",
            "Lf6/f<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "proto"

    invoke-static {v0}, Lf6/b;->b(Ljava/lang/String;)Lf6/b;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0, p3}, Lh6/q;->b(Ljava/lang/String;Ljava/lang/Class;Lf6/b;Lf6/e;)Lf6/f;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;Ljava/lang/Class;Lf6/b;Lf6/e;)Lf6/f;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lf6/b;",
            "Lf6/e<",
            "TT;[B>;)",
            "Lf6/f<",
            "TT;>;"
        }
    .end annotation

    iget-object p2, p0, Lh6/q;->a:Ljava/util/Set;

    invoke-interface {p2, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Lh6/s;

    iget-object v1, p0, Lh6/q;->b:Lh6/p;

    iget-object v5, p0, Lh6/q;->c:Lh6/t;

    move-object v0, p2

    move-object v2, p1

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lh6/s;-><init>(Lh6/p;Ljava/lang/String;Lf6/b;Lf6/e;Lh6/t;)V

    return-object p2

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const/4 p2, 0x2

    new-array p2, p2, [Ljava/lang/Object;

    const/4 p4, 0x0

    aput-object p3, p2, p4

    const/4 p3, 0x1

    iget-object p4, p0, Lh6/q;->a:Ljava/util/Set;

    aput-object p4, p2, p3

    const-string p3, "%s is not supported byt this factory. Supported encodings are: %s."

    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
