.class public final Lqj/u;
.super Ldj/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqj/u$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/o<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Ldj/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/n<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldj/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/n<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/o;-><init>()V

    iput-object p1, p0, Lqj/u;->a:Ldj/n;

    return-void
.end method

.method public static v(Ldj/q;)Ldj/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ldj/q<",
            "-TT;>;)",
            "Ldj/l<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lqj/u$a;

    invoke-direct {v0, p0}, Lqj/u$a;-><init>(Ldj/q;)V

    return-object v0
.end method


# virtual methods
.method protected s(Ldj/q;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/q<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lqj/u;->a:Ldj/n;

    invoke-static {p1}, Lqj/u;->v(Ldj/q;)Ldj/l;

    move-result-object p1

    invoke-interface {v0, p1}, Ldj/n;->a(Ldj/l;)V

    return-void
.end method
