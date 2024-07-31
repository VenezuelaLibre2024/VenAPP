.class final Lh6/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf6/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lf6/f<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lh6/p;

.field private final b:Ljava/lang/String;

.field private final c:Lf6/b;

.field private final d:Lf6/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/e<",
            "TT;[B>;"
        }
    .end annotation
.end field

.field private final e:Lh6/t;


# direct methods
.method constructor <init>(Lh6/p;Ljava/lang/String;Lf6/b;Lf6/e;Lh6/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh6/p;",
            "Ljava/lang/String;",
            "Lf6/b;",
            "Lf6/e<",
            "TT;[B>;",
            "Lh6/t;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh6/s;->a:Lh6/p;

    iput-object p2, p0, Lh6/s;->b:Ljava/lang/String;

    iput-object p3, p0, Lh6/s;->c:Lf6/b;

    iput-object p4, p0, Lh6/s;->d:Lf6/e;

    iput-object p5, p0, Lh6/s;->e:Lh6/t;

    return-void
.end method

.method public static synthetic c(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0}, Lh6/s;->e(Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic e(Ljava/lang/Exception;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public a(Lf6/c;Lf6/h;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/c<",
            "TT;>;",
            "Lf6/h;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lh6/s;->e:Lh6/t;

    invoke-static {}, Lh6/o;->a()Lh6/o$a;

    move-result-object v1

    iget-object v2, p0, Lh6/s;->a:Lh6/p;

    invoke-virtual {v1, v2}, Lh6/o$a;->e(Lh6/p;)Lh6/o$a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lh6/o$a;->c(Lf6/c;)Lh6/o$a;

    move-result-object p1

    iget-object v1, p0, Lh6/s;->b:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lh6/o$a;->f(Ljava/lang/String;)Lh6/o$a;

    move-result-object p1

    iget-object v1, p0, Lh6/s;->d:Lf6/e;

    invoke-virtual {p1, v1}, Lh6/o$a;->d(Lf6/e;)Lh6/o$a;

    move-result-object p1

    iget-object v1, p0, Lh6/s;->c:Lf6/b;

    invoke-virtual {p1, v1}, Lh6/o$a;->b(Lf6/b;)Lh6/o$a;

    move-result-object p1

    invoke-virtual {p1}, Lh6/o$a;->a()Lh6/o;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lh6/t;->a(Lh6/o;Lf6/h;)V

    return-void
.end method

.method public b(Lf6/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/c<",
            "TT;>;)V"
        }
    .end annotation

    new-instance v0, Lh6/r;

    invoke-direct {v0}, Lh6/r;-><init>()V

    invoke-virtual {p0, p1, v0}, Lh6/s;->a(Lf6/c;Lf6/h;)V

    return-void
.end method

.method d()Lh6/p;
    .locals 1

    iget-object v0, p0, Lh6/s;->a:Lh6/p;

    return-object v0
.end method
