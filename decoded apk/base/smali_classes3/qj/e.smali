.class public final Lqj/e;
.super Lqj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqj/e$a;
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
.field final b:Ljj/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/g<",
            "-TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldj/n;Ljj/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/n<",
            "TT;>;",
            "Ljj/g<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lqj/a;-><init>(Ldj/n;)V

    iput-object p2, p0, Lqj/e;->b:Ljj/g;

    return-void
.end method


# virtual methods
.method protected u(Ldj/l;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/l<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lqj/a;->a:Ldj/n;

    new-instance v1, Lqj/e$a;

    iget-object v2, p0, Lqj/e;->b:Ljj/g;

    invoke-direct {v1, p1, v2}, Lqj/e$a;-><init>(Ldj/l;Ljj/g;)V

    invoke-interface {v0, v1}, Ldj/n;->a(Ldj/l;)V

    return-void
.end method
