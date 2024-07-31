.class abstract Lqj/a;
.super Ldj/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/j<",
        "TR;>;"
    }
.end annotation


# instance fields
.field protected final a:Ldj/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/n<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ldj/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/n<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/j;-><init>()V

    iput-object p1, p0, Lqj/a;->a:Ldj/n;

    return-void
.end method
