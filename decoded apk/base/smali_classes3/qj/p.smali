.class public final Lqj/p;
.super Lqj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqj/p$a;
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
.field final b:Ljj/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/e<",
            "-",
            "Ljava/lang/Throwable;",
            "+",
            "Ldj/n<",
            "+TT;>;>;"
        }
    .end annotation
.end field

.field final c:Z


# direct methods
.method public constructor <init>(Ldj/n;Ljj/e;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/n<",
            "TT;>;",
            "Ljj/e<",
            "-",
            "Ljava/lang/Throwable;",
            "+",
            "Ldj/n<",
            "+TT;>;>;Z)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lqj/a;-><init>(Ldj/n;)V

    iput-object p2, p0, Lqj/p;->b:Ljj/e;

    iput-boolean p3, p0, Lqj/p;->c:Z

    return-void
.end method


# virtual methods
.method protected u(Ldj/l;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/l<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lqj/a;->a:Ldj/n;

    new-instance v1, Lqj/p$a;

    iget-object v2, p0, Lqj/p;->b:Ljj/e;

    iget-boolean v3, p0, Lqj/p;->c:Z

    invoke-direct {v1, p1, v2, v3}, Lqj/p$a;-><init>(Ldj/l;Ljj/e;Z)V

    invoke-interface {v0, v1}, Ldj/n;->a(Ldj/l;)V

    return-void
.end method
