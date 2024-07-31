.class public final Lsj/e;
.super Ldj/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsj/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/f<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final b:Ldj/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/u<",
            "+TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldj/u;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/u<",
            "+TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/f;-><init>()V

    iput-object p1, p0, Lsj/e;->b:Ldj/u;

    return-void
.end method


# virtual methods
.method public I(Lim/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lsj/e;->b:Ldj/u;

    new-instance v1, Lsj/e$a;

    invoke-direct {v1, p1}, Lsj/e$a;-><init>(Lim/b;)V

    invoke-interface {v0, v1}, Ldj/u;->c(Ldj/t;)V

    return-void
.end method
