.class public final Lqj/q;
.super Lqj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqj/q$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lqj/a<",
        "TT;TT;>;"
    }
.end annotation


# instance fields
.field final b:Ljj/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/d<",
            "-",
            "Lgj/b;",
            ">;"
        }
    .end annotation
.end field

.field final c:Ljj/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/d<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final d:Ljj/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/d<",
            "-",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field final e:Ljj/a;

.field final f:Ljj/a;

.field final r:Ljj/a;


# direct methods
.method public constructor <init>(Ldj/n;Ljj/d;Ljj/d;Ljj/d;Ljj/a;Ljj/a;Ljj/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/n<",
            "TT;>;",
            "Ljj/d<",
            "-",
            "Lgj/b;",
            ">;",
            "Ljj/d<",
            "-TT;>;",
            "Ljj/d<",
            "-",
            "Ljava/lang/Throwable;",
            ">;",
            "Ljj/a;",
            "Ljj/a;",
            "Ljj/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lqj/a;-><init>(Ldj/n;)V

    iput-object p2, p0, Lqj/q;->b:Ljj/d;

    iput-object p3, p0, Lqj/q;->c:Ljj/d;

    iput-object p4, p0, Lqj/q;->d:Ljj/d;

    iput-object p5, p0, Lqj/q;->e:Ljj/a;

    iput-object p6, p0, Lqj/q;->f:Ljj/a;

    iput-object p7, p0, Lqj/q;->r:Ljj/a;

    return-void
.end method


# virtual methods
.method protected u(Ldj/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/l<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lqj/a;->a:Ldj/n;

    new-instance v1, Lqj/q$a;

    invoke-direct {v1, p1, p0}, Lqj/q$a;-><init>(Ldj/l;Lqj/q;)V

    invoke-interface {v0, v1}, Ldj/n;->a(Ldj/l;)V

    return-void
.end method
