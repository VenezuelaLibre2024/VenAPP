.class public final Lqj/j;
.super Ldj/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqj/j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/j<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Ldj/d;


# direct methods
.method public constructor <init>(Ldj/d;)V
    .locals 0

    invoke-direct {p0}, Ldj/j;-><init>()V

    iput-object p1, p0, Lqj/j;->a:Ldj/d;

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

    iget-object v0, p0, Lqj/j;->a:Ldj/d;

    new-instance v1, Lqj/j$a;

    invoke-direct {v1, p1}, Lqj/j$a;-><init>(Ldj/l;)V

    invoke-interface {v0, v1}, Ldj/d;->a(Ldj/c;)V

    return-void
.end method
