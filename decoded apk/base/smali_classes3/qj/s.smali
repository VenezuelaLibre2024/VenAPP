.class public final Lqj/s;
.super Lqj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqj/s$a;
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
.field final b:Ldj/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/n<",
            "+TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldj/n;Ldj/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/n<",
            "TT;>;",
            "Ldj/n<",
            "+TT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lqj/a;-><init>(Ldj/n;)V

    iput-object p2, p0, Lqj/s;->b:Ldj/n;

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

    new-instance v1, Lqj/s$a;

    iget-object v2, p0, Lqj/s;->b:Ldj/n;

    invoke-direct {v1, p1, v2}, Lqj/s$a;-><init>(Ldj/l;Ldj/n;)V

    invoke-interface {v0, v1}, Ldj/n;->a(Ldj/l;)V

    return-void
.end method
